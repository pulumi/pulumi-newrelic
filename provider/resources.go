// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package newrelic

import (
	"bytes"
	"fmt"
	"os"
	"path/filepath"
	"regexp"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/newrelic/terraform-provider-newrelic/v2/newrelic"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-newrelic/provider/v5/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "newrelic"
	// modules:
	mainMod       = "index"
	cloudMod      = "Cloud"
	syntheticsMod = "Synthetics"
	insightsMod   = "Insights"
	pluginsMod    = "Plugins"
)

var namespaceMap = map[string]string{
	mainPkg: "NewRelic",
}

// makeMember manufactures a type token for the package and the given module and type.  It automatically
// uses the NewRelic package and names the file by simply lower casing the resource's first character.
// first character.
func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	return makeMember(mod, res)
}

// makeResource manufactures a standard resource token given a module and resource name.
func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

func setIDType(info tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
	p := info.SchemaPath()
	attr, _ := p[len(p)-1].(walk.GetAttrStep)

	switch {
	// manufactures a schema for a string ID. This is used to override a number of
	// NewRelic *_id fields which use integers for inputs, which are incompatible with
	// a number of string outputs (including Pulumi's built-in IDs, which are always
	// strings).
	case strings.HasSuffix(attr.Name, "_id"):
		info.SchemaInfo().Type = "string"
	// manufactures a schema for a list of string IDs. This is used to override a
	// number of NewRelic *_ids fields which use integers for inputs, which are
	// incompatible with a number of string outputs (including Pulumi's built-in IDs,
	// which are always strings).
	case (strings.HasSuffix(attr.Name, "_ids") || attr.Name == "entities") &&
		(info.ShimSchema().Type() == shim.TypeList || info.ShimSchema().Type() == shim.TypeSet):
		schema := info.SchemaInfo()
		if schema.Elem == nil {
			schema.Elem = &tfbridge.SchemaInfo{}
		}
		schema.Elem.Type = "string"
	default:
		return tfbridge.PropertyVisitResult{}, nil
	}

	return tfbridge.PropertyVisitResult{HasEffect: true}, nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(newrelic.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                       p,
		Name:                    "newrelic",
		Description:             "A Pulumi package for creating and managing New Relic resources.",
		Keywords:                []string{"pulumi", "new relic"},
		License:                 "Apache-2.0",
		GitHubOrg:               "newrelic",
		TFProviderModuleVersion: "v2",
		Homepage:                "https://pulumi.io",
		Repository:              "https://github.com/pulumi/pulumi-newrelic",
		UpstreamRepoPath:        "./upstream",
		MetadataInfo:            tfbridge.NewProviderMetadata(metadata),
		Version:                 version.Version,
		DocRules:                &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Config: map[string]*tfbridge.SchemaInfo{
			"account_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"NEW_RELIC_ACCOUNT_ID"},
				},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"NEW_RELIC_REGION"},
					Value:   "US",
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"newrelic_alert_channel":            {Tok: makeResource(mainMod, "AlertChannel")},
			"newrelic_alert_condition":          {Tok: makeResource(mainMod, "AlertCondition")},
			"newrelic_alert_policy":             {Tok: makeResource(mainMod, "AlertPolicy")},
			"newrelic_alert_policy_channel":     {Tok: makeResource(mainMod, "AlertPolicyChannel")},
			"newrelic_obfuscation_expression":   {Tok: makeResource(mainMod, "ObfuscationExpression")},
			"newrelic_obfuscation_rule":         {Tok: makeResource(mainMod, "ObfuscationRule")},
			"newrelic_one_dashboard":            {Tok: makeResource(mainMod, "OneDashboard")},
			"newrelic_one_dashboard_json":       {Tok: makeResource(mainMod, "OneDashboardJson")},
			"newrelic_one_dashboard_raw":        {Tok: makeResource(mainMod, "OneDashboardRaw")},
			"newrelic_infra_alert_condition":    {Tok: makeResource(mainMod, "InfraAlertCondition")},
			"newrelic_nrql_alert_condition":     {Tok: makeResource(mainMod, "NrqlAlertCondition")},
			"newrelic_nrql_drop_rule":           {Tok: makeResource(mainMod, "NrqlDropRule")},
			"newrelic_entity_tags":              {Tok: makeResource(mainMod, "EntityTags")},
			"newrelic_events_to_metrics_rule":   {Tok: makeResource(mainMod, "EventsToMetricsRule")},
			"newrelic_alert_muting_rule":        {Tok: makeResource(mainMod, "AlertMutingRule")},
			"newrelic_log_parsing_rule":         {Tok: makeResource(mainMod, "LogParsingRule")},
			"newrelic_api_access_key":           {Tok: makeResource(mainMod, "ApiAccessKey")},
			"newrelic_service_level":            {Tok: makeResource(mainMod, "ServiceLevel")},
			"newrelic_notification_channel":     {Tok: makeResource(mainMod, "NotificationChannel")},
			"newrelic_notification_destination": {Tok: makeResource(mainMod, "NotificationDestination")},
			"newrelic_workflow":                 {Tok: makeResource(mainMod, "Workflow")},

			"newrelic_cloud_aws_govcloud_link_account": {Tok: makeResource(cloudMod, "AwsGovcloudLinkAccount")},
			"newrelic_cloud_aws_link_account":          {Tok: makeResource(cloudMod, "AwsLinkAccount")},
			"newrelic_cloud_azure_link_account":        {Tok: makeResource(cloudMod, "AzureLinkAccount")},
			"newrelic_cloud_gcp_link_account":          {Tok: makeResource(cloudMod, "GcpLinkAccount")},
			"newrelic_cloud_aws_govcloud_integrations": {Tok: makeResource(cloudMod, "AwsGovcloudIntegrations")},
			"newrelic_cloud_aws_integrations":          {Tok: makeResource(cloudMod, "AwsIntegrations")},
			"newrelic_cloud_azure_integrations":        {Tok: makeResource(cloudMod, "AzureIntegrations")},
			"newrelic_cloud_gcp_integrations":          {Tok: makeResource(cloudMod, "GcpIntegrations")},

			"newrelic_synthetics_alert_condition":   {Tok: makeResource(syntheticsMod, "AlertCondition")},
			"newrelic_synthetics_monitor":           {Tok: makeResource(syntheticsMod, "Monitor")},
			"newrelic_synthetics_secure_credential": {Tok: makeResource(syntheticsMod, "SecureCredential")},
			"newrelic_synthetics_multilocation_alert_condition": {
				Tok: makeResource(syntheticsMod, "MultiLocationAlertCondition"),
			},
			"newrelic_synthetics_broken_links_monitor": {
				Tok: makeResource(syntheticsMod, "BrokenLinksMonitor"),
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_broken_links.html.markdown",
				},
			},
			"newrelic_synthetics_cert_check_monitor": {
				Tok: makeResource(syntheticsMod, "CertCheckMonitor"),
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_cert_check.html.markdown",
				},
			},
			"newrelic_synthetics_private_location": {
				Tok: makeResource(syntheticsMod, "PrivateLocation"),
			},
			"newrelic_synthetics_script_monitor": {
				Tok: makeResource(syntheticsMod, "ScriptMonitor"),
			},
			"newrelic_synthetics_step_monitor": {
				Tok: makeResource(syntheticsMod, "StepMonitor"),
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_step.html.markdown",
				},
			},

			"newrelic_insights_event": {Tok: makeResource(insightsMod, "Event")},

			"newrelic_workload":             {Tok: makeResource(pluginsMod, "Workload")},
			"newrelic_application_settings": {Tok: makeResource(pluginsMod, "ApplicationSettings")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"newrelic_alert_channel": {
				Tok: makeDataSource(mainMod, "getAlertChannel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"config": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"newrelic_alert_policy":    {Tok: makeDataSource(mainMod, "getAlertPolicy")},
			"newrelic_application":     {Tok: makeDataSource(mainMod, "getApplication")},
			"newrelic_key_transaction": {Tok: makeDataSource(mainMod, "getKeyTransaction")},
			"newrelic_entity":          {Tok: makeDataSource(mainMod, "getEntity")},
			"newrelic_account":         {Tok: makeDataSource(mainMod, "getAccount")},
			"newrelic_cloud_account":   {Tok: makeDataSource(mainMod, "getCloudAccount")},

			"newrelic_obfuscation_expression":       {Tok: makeDataSource(mainMod, "getObfuscationExpression")},
			"newrelic_synthetics_secure_credential": {Tok: makeDataSource(syntheticsMod, "getSecureCredential")},
			"newrelic_synthetics_private_location":  {Tok: makeDataSource(syntheticsMod, "getPrivateLocation")},

			"newrelic_test_grok_pattern": {
				Tok: makeDataSource(mainMod, "getTestGrokPattern"),
				Docs: &tfbridge.DocInfo{
					Source: "log_test_grok.html.markdown",
				},
			},

			"newrelic_notification_destination": {
				Tok:  makeDataSource(mainMod, "getNotificationDestination"),
				Docs: &tfbridge.DocInfo{Source: "notifications_destination.html.markdown"},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	tfbridge.MustTraverseProperties(&prov, "set-id-type", setIDType)

	prov.MustComputeTokens(tfbridgetokens.KnownModules("newrelic_", mainMod, []string{
		"cloud_",
		"synthetics_",
		"insights_",
		"plugins_",
	}, tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{
		fixExample,
	}
	edits = append(edits, defaults...)
	return append(
		edits,
		skipSections()...,
	)
}

var sectionRegexps = []*regexp.Regexp{
	regexp.MustCompile(`Upgrading to`),
	regexp.MustCompile(`Support for`),
	regexp.MustCompile(`Quick Links`),
	regexp.MustCompile(`Community`),
	regexp.MustCompile(`Support`),
}

// Removes sections meant to address the TF maintainer community, see sectionRegexps
func skipSections() []tfbridge.DocsEdit {
	var edits []tfbridge.DocsEdit
	for _, sectionRegexp := range sectionRegexps {
		edits = append(
			edits,
			tfbridge.DocsEdit{
				Path: "index.html.markdown",
				Edit: func(_ string, content []byte) ([]byte, error) {
					return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
						return sectionRegexp.Match([]byte(headerText))
					})
				},
			},
		)
	}

	return edits
}

var fixExample = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		input, err := os.ReadFile("provider/installation-replaces/example-input.md")
		if err != nil {
			return nil, err
		}
		replace, err := os.ReadFile("provider/installation-replaces/example-desired.md")
		if err != nil {
			return nil, err
		}
		b := bytes.ReplaceAll(
			content,
			input,
			replace)
		return b, nil
	},
}

//go:embed cmd/pulumi-resource-newrelic/bridge-metadata.json
var metadata []byte
