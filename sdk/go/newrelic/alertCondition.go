// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package newrelic

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.
//
//
// ## Terms
//
// The `term` mapping supports the following arguments:
//
//   * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
//   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
//   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
//   * `threshold` - (Required) Must be 0 or greater.
//   * `timeFunction` - (Required) `all` or `any`.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/alert_condition.html.markdown.
type AlertCondition struct {
	pulumi.CustomResourceState

	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrOutput `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayOutput `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrOutput `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringOutput `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayOutput `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringOutput `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrOutput `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrOutput `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrOutput `pulumi:"violationCloseTimer"`
}

// NewAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewAlertCondition(ctx *pulumi.Context,
	name string, args *AlertConditionArgs, opts ...pulumi.ResourceOption) (*AlertCondition, error) {
	if args == nil || args.Entities == nil {
		return nil, errors.New("missing required argument 'Entities'")
	}
	if args == nil || args.Metric == nil {
		return nil, errors.New("missing required argument 'Metric'")
	}
	if args == nil || args.PolicyId == nil {
		return nil, errors.New("missing required argument 'PolicyId'")
	}
	if args == nil || args.Terms == nil {
		return nil, errors.New("missing required argument 'Terms'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil {
		args = &AlertConditionArgs{}
	}
	var resource AlertCondition
	err := ctx.RegisterResource("newrelic:index/alertCondition:AlertCondition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertCondition gets an existing AlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertConditionState, opts ...pulumi.ResourceOption) (*AlertCondition, error) {
	var resource AlertCondition
	err := ctx.ReadResource("newrelic:index/alertCondition:AlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertCondition resources.
type alertConditionState struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope *string `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities []int `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric *string `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric *string `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId *int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms []AlertConditionTerm `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type *string `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric *string `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction *string `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
}

type AlertConditionState struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrInput
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayInput
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrInput
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringPtrInput
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayInput
	// The type of condition. One of: `apmAppMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringPtrInput
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrInput
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrInput
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrInput
}

func (AlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConditionState)(nil)).Elem()
}

type alertConditionArgs struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope *string `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities []int `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric *string `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric string `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms []AlertConditionTerm `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type string `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric *string `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction *string `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
}

// The set of arguments for constructing a AlertCondition resource.
type AlertConditionArgs struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrInput
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayInput
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrInput
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringInput
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayInput
	// The type of condition. One of: `apmAppMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringInput
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrInput
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrInput
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrInput
}

func (AlertConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConditionArgs)(nil)).Elem()
}
