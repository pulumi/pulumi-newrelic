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
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/newrelic/terraform-provider-newrelic/v2/newrelic"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
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

// makeStringID manufactures a schema for a string ID. This is used to override
// a number of NewRelic *_id fields which use integers for inputs, which are
// incompatible with a number of string outputs (including Pulumi's built-in
// IDs, which are always strings).
func makeStringID() *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Type: "string",
	}
}

// makeStringIDs manufactures a schema for a list of string IDs. This is used to
// override a number of NewRelic *_ids fields which use integers for inputs, which
// are incompatible with a number of string outputs (including Pulumi's built-in
// IDs, which are always strings).
func makeStringIDs() *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Elem: makeStringID(),
	}
}

// makeWidget manufactures a widget schema that accepts string account IDs in
// its nested NRQL queries.
func makeWidget() *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Elem: &tfbridge.SchemaInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				"nrql_query": {
					Elem: &tfbridge.SchemaInfo{
						Fields: map[string]*tfbridge.SchemaInfo{
							"account_id": makeStringID(),
						},
					},
				},
			},
		},
	}
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
		Config: map[string]*tfbridge.SchemaInfo{
			"account_id": {
				Type: "string",
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
			"newrelic_alert_channel": {
				Tok: makeResource(mainMod, "AlertChannel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_alert_condition": {
				Tok: makeResource(mainMod, "AlertCondition"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"entities":  makeStringIDs(),
					"policy_id": makeStringID(),
				},
			},
			"newrelic_alert_policy": {
				Tok: makeResource(mainMod, "AlertPolicy"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":  makeStringID(),
					"channel_ids": makeStringIDs(),
				},
			},
			"newrelic_alert_policy_channel": {
				Tok: makeResource(mainMod, "AlertPolicyChannel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":  makeStringID(),
					"channel_ids": makeStringIDs(),
					"policy_id":   makeStringID(),
				},
			},
			"newrelic_browser_application": {
				Tok: makeResource(mainMod, "BrowserApplication"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_data_partition_rule": {
				Tok: makeResource(mainMod, "DataPartitionRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_obfuscation_expression": {
				Tok: makeResource(mainMod, "ObfuscationExpression"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_obfuscation_rule": {
				Tok: makeResource(mainMod, "ObfuscationRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_one_dashboard": {
				Tok: makeResource(mainMod, "OneDashboard"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
					"page": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"widget_area":        makeWidget(),
								"widget_bar":         makeWidget(),
								"widget_billboard":   makeWidget(),
								"widget_bullet":      makeWidget(),
								"widget_funnel":      makeWidget(),
								"widget_json":        makeWidget(),
								"widget_heatmap":     makeWidget(),
								"widget_histogram":   makeWidget(),
								"widget_line":        makeWidget(),
								"widget_pie":         makeWidget(),
								"widget_stacked_bar": makeWidget(),
								"widget_log_table":   makeWidget(),
								"widget_table":       makeWidget(),
							},
						},
					},
					"variable": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"nrql_query": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"account_ids": makeStringIDs(),
										},
									},
								},
							},
						},
					},
				},
			},
			"newrelic_one_dashboard_json": {
				Tok: makeResource(mainMod, "OneDashboardJson"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_one_dashboard_raw": {
				Tok: makeResource(mainMod, "OneDashboardRaw"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_infra_alert_condition": {
				Tok: makeResource(mainMod, "InfraAlertCondition"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"policy_id": makeStringID(),
				},
			},
			"newrelic_nrql_alert_condition": {
				Tok: makeResource(mainMod, "NrqlAlertCondition"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
					"policy_id":  makeStringID(),
				},
			},
			"newrelic_nrql_drop_rule": {
				Tok: makeResource(mainMod, "NrqlDropRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_entity_tags": {Tok: makeResource(mainMod, "EntityTags")},
			"newrelic_events_to_metrics_rule": {
				Tok: makeResource(mainMod, "EventsToMetricsRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_alert_muting_rule": {
				Tok: makeResource(mainMod, "AlertMutingRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_log_parsing_rule": {
				Tok: makeResource(mainMod, "LogParsingRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_api_access_key": {
				Tok: makeResource(mainMod, "ApiAccessKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
					"user_id":    makeStringID(),
				},
			},
			"newrelic_service_level": {
				Tok: makeResource(mainMod, "ServiceLevel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"events": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"account_id": makeStringID(),
							},
						},
					},
				},
			},
			"newrelic_notification_channel": {
				Tok: makeResource(mainMod, "NotificationChannel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_notification_destination": {
				Tok: makeResource(mainMod, "NotificationDestination"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_workflow": {
				Tok: makeResource(mainMod, "Workflow"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
					"enrichments": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"nrql": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"account_id": makeStringID(),
										},
									},
								},
							},
						},
					},
				},
			},

			"newrelic_cloud_aws_govcloud_link_account": {
				Tok: makeResource(cloudMod, "AwsGovcloudLinkAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_cloud_aws_link_account": {
				Tok: makeResource(cloudMod, "AwsLinkAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_cloud_azure_link_account": {
				Tok: makeResource(cloudMod, "AzureLinkAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_cloud_gcp_link_account": {
				Tok: makeResource(cloudMod, "GcpLinkAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_cloud_aws_govcloud_integrations": {
				Tok: makeResource(cloudMod, "AwsGovcloudIntegrations"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":        makeStringID(),
					"linked_account_id": makeStringID(),
				},
			},
			"newrelic_cloud_aws_integrations": {
				Tok: makeResource(cloudMod, "AwsIntegrations"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":        makeStringID(),
					"linked_account_id": makeStringID(),
				},
			},
			"newrelic_cloud_azure_integrations": {
				Tok: makeResource(cloudMod, "AzureIntegrations"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":        makeStringID(),
					"linked_account_id": makeStringID(),
				},
			},
			"newrelic_cloud_gcp_integrations": {
				Tok: makeResource(cloudMod, "GcpIntegrations"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":        makeStringID(),
					"linked_account_id": makeStringID(),
				},
			},

			"newrelic_synthetics_alert_condition": {
				Tok: makeResource(syntheticsMod, "AlertCondition"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"policy_id": makeStringID(),
				},
			},
			"newrelic_synthetics_monitor": {
				Tok: makeResource(syntheticsMod, "Monitor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_monitor_downtime": {
				Tok: makeResource(syntheticsMod, "MonitorDowntime"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_secure_credential": {
				Tok: makeResource(syntheticsMod, "SecureCredential"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_multilocation_alert_condition": {
				Tok: makeResource(syntheticsMod, "MultiLocationAlertCondition"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"policy_id": makeStringID(),
				},
			},
			"newrelic_synthetics_broken_links_monitor": {
				Tok: makeResource(syntheticsMod, "BrokenLinksMonitor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_broken_links.html.markdown",
				}},
			"newrelic_synthetics_cert_check_monitor": {
				Tok: makeResource(syntheticsMod, "CertCheckMonitor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_cert_check.html.markdown",
				}},
			"newrelic_synthetics_private_location": {
				Tok: makeResource(syntheticsMod, "PrivateLocation"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_script_monitor": {
				Tok: makeResource(syntheticsMod, "ScriptMonitor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_step_monitor": {
				Tok: makeResource(syntheticsMod, "StepMonitor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
				Docs: &tfbridge.DocInfo{
					Source: "synthetics_monitor_step.html.markdown",
				},
			},

			"newrelic_insights_event": {
				Tok: makeResource(insightsMod, "Event"),
			},

			"newrelic_workload": {
				Tok: makeResource(pluginsMod, "Workload"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":        makeStringID(),
					"scope_account_ids": makeStringIDs(),
					"workload_id":       makeStringID(),
				},
			},
			"newrelic_application_settings": {Tok: makeResource(pluginsMod, "ApplicationSettings")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"newrelic_alert_channel": {
				Tok: makeDataSource(mainMod, "getAlertChannel"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
					"config": {
						MaxItemsOne: tfbridge.True(),
					},
					"policy_ids": makeStringIDs(),
				},
			},
			"newrelic_alert_policy": {
				Tok: makeDataSource(mainMod, "getAlertPolicy"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_application": {
				Tok: makeDataSource(mainMod, "getApplication"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"host_ids":     makeStringIDs(),
					"instance_ids": makeStringIDs(),
				},
			},
			"newrelic_key_transaction": {Tok: makeDataSource(mainMod, "getKeyTransaction")},
			"newrelic_entity": {
				Tok: makeDataSource(mainMod, "getEntity"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id":                 makeStringID(),
					"application_id":             makeStringID(),
					"serving_apm_application_id": makeStringID(),
				},
			},
			"newrelic_account": {
				Tok: makeDataSource(mainMod, "getAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_cloud_account": {
				Tok: makeDataSource(mainMod, "getCloudAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},

			"newrelic_obfuscation_expression": {
				Tok: makeDataSource(mainMod, "getObfuscationExpression"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_secure_credential": {
				Tok: makeDataSource(syntheticsMod, "getSecureCredential"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},
			"newrelic_synthetics_private_location": {
				Tok: makeDataSource(syntheticsMod, "getPrivateLocation"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
			},

			"newrelic_test_grok_pattern": {
				Tok: makeDataSource(mainMod, "getTestGrokPattern"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
				Docs: &tfbridge.DocInfo{
					Source: "log_test_grok.html.markdown",
				}},

			"newrelic_notification_destination": {
				Tok: makeDataSource(mainMod, "getNotificationDestination"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account_id": makeStringID(),
				},
				Docs: &tfbridge.DocInfo{Source: "notifications_destination.html.markdown"},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				}}
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
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

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

//go:embed cmd/pulumi-resource-newrelic/bridge-metadata.json
var metadata []byte
