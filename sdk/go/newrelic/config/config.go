// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

func GetAccountId(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "newrelic:accountId")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "NEW_RELIC_ACCOUNT_ID"); d != nil {
		value = d.(string)
	}
	return value
}
func GetAdminApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:adminApiKey")
}
func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:apiKey")
}

// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
func GetApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:apiUrl")
}
func GetCacertFile(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:cacertFile")
}

// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
func GetInfrastructureApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:infrastructureApiUrl")
}
func GetInsecureSkipVerify(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "newrelic:insecureSkipVerify")
}
func GetInsightsInsertKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:insightsInsertKey")
}
func GetInsightsInsertUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:insightsInsertUrl")
}
func GetInsightsQueryUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:insightsQueryUrl")
}

// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
func GetNerdgraphApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:nerdgraphApiUrl")
}

// The data center for which your New Relic account is configured. Only one region per provider block is permitted.
func GetRegion(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "newrelic:region")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault("US", nil, "NEW_RELIC_REGION"); d != nil {
		value = d.(string)
	}
	return value
}

// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
func GetSyntheticsApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "newrelic:syntheticsApiUrl")
}
