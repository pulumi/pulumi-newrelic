// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage NRQL alert conditions in New Relic.
//
// ## Example Usage
// ## NRQL
//
// The `nrql` block supports the following arguments:
//
// - `query` - (Required) The NRQL query to execute for the condition.
// - `evaluationOffset` - (Optional*) Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It's recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluationOffset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.<br>
// <small>\***Note**: One of `evaluationOffset` _or_ `sinceValue` must be set, but not both.</small>
//
// - `sinceValue` - (Optional*)  **DEPRECATED:** Use `evaluationOffset` instead. The value to be used in the `SINCE <X> minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). <br>
// <small>\***Note**: One of `evaluationOffset` _or_ `sinceValue` must be set, but not both.</small>
//
// ## Terms
//
// > **NOTE:** The direct use of the `term` has been deprecated, and users should use `critical` and `warning` instead.  What follows now applies to the named priority attributes for `critical` and `warning`, but for those attributes the priority is not allowed.
//
// NRQL alert conditions support up to two terms. At least one `term` must have `priority` set to `critical` and the second optional `term` must have `priority` set to `warning`.
//
// The `term` block the following arguments:
//
// - `operator` - (Optional) Valid values are `above`, `below`, or `equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `outlier`, the only valid option here is `above`.
// - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
// - `threshold` - (Required) The value which will trigger a violation. Must be `0` or greater.
// - `thresholdDuration` - (Optional) The duration, in seconds, that the threshold must violate in order to create a violation. Value must be a multiple of the `aggregationWindow` (which has a default of 60 seconds).
// <br>For _baseline_ and _outlier_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
// <br>For _static_ NRQL alert conditions with the `sum` value function, the value must be within 120-7200 seconds (inclusive).
// <br>For _static_ NRQL alert conditions with the `singleValue` value function, the value must be within 60-7200 seconds (inclusive).
//
// - `thresholdOccurrences` - (Optional) The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `atLeastOnce` (case insensitive).
// - `duration` - (Optional) **DEPRECATED:** Use `thresholdDuration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
// - `timeFunction` - (Optional) **DEPRECATED:** Use `thresholdOccurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
//
// ## Import
//
// Alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>:<conditionType>`, e.g. // For `baseline` conditions
//
// ```sh
//  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:baseline
// ```
//
//  // For `static` conditions
//
// ```sh
//  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:static
// ```
//
//  // For `outlier` conditions
//
// ```sh
//  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:outlier
// ```
//
//  The actual values for `policy_id` and `condition_id` can be retrieved from the following New Relic URL when viewing the NRQL alert condition you want to import<small>alerts.newrelic.com/accounts/**\<account_id\>**/policies/**\<policy_id\>**/conditions/**\<condition_id\>**/edit</small>
type NrqlAlertCondition struct {
	pulumi.CustomResourceState

	// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
	AggregationWindow pulumi.IntOutput `pulumi:"aggregationWindow"`
	// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
	BaselineDirection pulumi.StringPtrOutput `pulumi:"baselineDirection"`
	// Whether to close all open violations when the signal expires.
	CloseViolationsOnExpiration pulumi.BoolPtrOutput `pulumi:"closeViolationsOnExpiration"`
	// A list containing the `critical` threshold values. See Terms below for details.
	Critical NrqlAlertConditionCriticalPtrOutput `pulumi:"critical"`
	// The description of the NRQL alert condition.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Number of expected groups when using `outlier` detection.
	ExpectedGroups pulumi.IntPtrOutput `pulumi:"expectedGroups"`
	// The amount of time (in seconds) to wait before considering the signal expired.
	ExpirationDuration pulumi.IntPtrOutput `pulumi:"expirationDuration"`
	// Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
	FillOption pulumi.StringPtrOutput `pulumi:"fillOption"`
	// This value will be used for filling gaps in the signal.
	FillValue pulumi.Float64PtrOutput `pulumi:"fillValue"`
	// **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
	//
	// Deprecated: use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
	IgnoreOverlap pulumi.BoolPtrOutput `pulumi:"ignoreOverlap"`
	// The title of the condition.
	Name pulumi.StringOutput `pulumi:"name"`
	// A NRQL query. See NRQL below for details.
	Nrql NrqlAlertConditionNrqlOutput `pulumi:"nrql"`
	// Whether to create a new violation to capture that the signal expired.
	OpenViolationOnExpiration pulumi.BoolPtrOutput `pulumi:"openViolationOnExpiration"`
	// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
	OpenViolationOnGroupOverlap pulumi.BoolPtrOutput `pulumi:"openViolationOnGroupOverlap"`
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
	// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
	//
	// Deprecated: use `critical` and `warning` attributes instead
	Terms NrqlAlertConditionTermArrayOutput `pulumi:"terms"`
	// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// Possible values are `singleValue`, `sum` (case insensitive).
	ValueFunction pulumi.StringPtrOutput `pulumi:"valueFunction"`
	// **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	//
	// Deprecated: use `violation_time_limit_seconds` attribute instead
	ViolationTimeLimit pulumi.StringOutput `pulumi:"violationTimeLimit"`
	// Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	ViolationTimeLimitSeconds pulumi.IntPtrOutput `pulumi:"violationTimeLimitSeconds"`
	// A list containing the `warning` threshold values. See Terms below for details.
	Warning NrqlAlertConditionWarningPtrOutput `pulumi:"warning"`
}

// NewNrqlAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewNrqlAlertCondition(ctx *pulumi.Context,
	name string, args *NrqlAlertConditionArgs, opts ...pulumi.ResourceOption) (*NrqlAlertCondition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Nrql == nil {
		return nil, errors.New("invalid value for required argument 'Nrql'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	var resource NrqlAlertCondition
	err := ctx.RegisterResource("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNrqlAlertCondition gets an existing NrqlAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNrqlAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NrqlAlertConditionState, opts ...pulumi.ResourceOption) (*NrqlAlertCondition, error) {
	var resource NrqlAlertCondition
	err := ctx.ReadResource("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NrqlAlertCondition resources.
type nrqlAlertConditionState struct {
	// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
	AggregationWindow *int `pulumi:"aggregationWindow"`
	// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
	BaselineDirection *string `pulumi:"baselineDirection"`
	// Whether to close all open violations when the signal expires.
	CloseViolationsOnExpiration *bool `pulumi:"closeViolationsOnExpiration"`
	// A list containing the `critical` threshold values. See Terms below for details.
	Critical *NrqlAlertConditionCritical `pulumi:"critical"`
	// The description of the NRQL alert condition.
	Description *string `pulumi:"description"`
	// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Number of expected groups when using `outlier` detection.
	ExpectedGroups *int `pulumi:"expectedGroups"`
	// The amount of time (in seconds) to wait before considering the signal expired.
	ExpirationDuration *int `pulumi:"expirationDuration"`
	// Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
	FillOption *string `pulumi:"fillOption"`
	// This value will be used for filling gaps in the signal.
	FillValue *float64 `pulumi:"fillValue"`
	// **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
	//
	// Deprecated: use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
	IgnoreOverlap *bool `pulumi:"ignoreOverlap"`
	// The title of the condition.
	Name *string `pulumi:"name"`
	// A NRQL query. See NRQL below for details.
	Nrql *NrqlAlertConditionNrql `pulumi:"nrql"`
	// Whether to create a new violation to capture that the signal expired.
	OpenViolationOnExpiration *bool `pulumi:"openViolationOnExpiration"`
	// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
	OpenViolationOnGroupOverlap *bool `pulumi:"openViolationOnGroupOverlap"`
	// The ID of the policy where this condition should be used.
	PolicyId *int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
	//
	// Deprecated: use `critical` and `warning` attributes instead
	Terms []NrqlAlertConditionTerm `pulumi:"terms"`
	// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
	Type *string `pulumi:"type"`
	// Possible values are `singleValue`, `sum` (case insensitive).
	ValueFunction *string `pulumi:"valueFunction"`
	// **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	//
	// Deprecated: use `violation_time_limit_seconds` attribute instead
	ViolationTimeLimit *string `pulumi:"violationTimeLimit"`
	// Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	ViolationTimeLimitSeconds *int `pulumi:"violationTimeLimitSeconds"`
	// A list containing the `warning` threshold values. See Terms below for details.
	Warning *NrqlAlertConditionWarning `pulumi:"warning"`
}

type NrqlAlertConditionState struct {
	// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
	AggregationWindow pulumi.IntPtrInput
	// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
	BaselineDirection pulumi.StringPtrInput
	// Whether to close all open violations when the signal expires.
	CloseViolationsOnExpiration pulumi.BoolPtrInput
	// A list containing the `critical` threshold values. See Terms below for details.
	Critical NrqlAlertConditionCriticalPtrInput
	// The description of the NRQL alert condition.
	Description pulumi.StringPtrInput
	// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Number of expected groups when using `outlier` detection.
	ExpectedGroups pulumi.IntPtrInput
	// The amount of time (in seconds) to wait before considering the signal expired.
	ExpirationDuration pulumi.IntPtrInput
	// Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
	FillOption pulumi.StringPtrInput
	// This value will be used for filling gaps in the signal.
	FillValue pulumi.Float64PtrInput
	// **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
	//
	// Deprecated: use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
	IgnoreOverlap pulumi.BoolPtrInput
	// The title of the condition.
	Name pulumi.StringPtrInput
	// A NRQL query. See NRQL below for details.
	Nrql NrqlAlertConditionNrqlPtrInput
	// Whether to create a new violation to capture that the signal expired.
	OpenViolationOnExpiration pulumi.BoolPtrInput
	// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
	OpenViolationOnGroupOverlap pulumi.BoolPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
	//
	// Deprecated: use `critical` and `warning` attributes instead
	Terms NrqlAlertConditionTermArrayInput
	// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
	Type pulumi.StringPtrInput
	// Possible values are `singleValue`, `sum` (case insensitive).
	ValueFunction pulumi.StringPtrInput
	// **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	//
	// Deprecated: use `violation_time_limit_seconds` attribute instead
	ViolationTimeLimit pulumi.StringPtrInput
	// Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	ViolationTimeLimitSeconds pulumi.IntPtrInput
	// A list containing the `warning` threshold values. See Terms below for details.
	Warning NrqlAlertConditionWarningPtrInput
}

func (NrqlAlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*nrqlAlertConditionState)(nil)).Elem()
}

type nrqlAlertConditionArgs struct {
	// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
	AggregationWindow *int `pulumi:"aggregationWindow"`
	// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
	BaselineDirection *string `pulumi:"baselineDirection"`
	// Whether to close all open violations when the signal expires.
	CloseViolationsOnExpiration *bool `pulumi:"closeViolationsOnExpiration"`
	// A list containing the `critical` threshold values. See Terms below for details.
	Critical *NrqlAlertConditionCritical `pulumi:"critical"`
	// The description of the NRQL alert condition.
	Description *string `pulumi:"description"`
	// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Number of expected groups when using `outlier` detection.
	ExpectedGroups *int `pulumi:"expectedGroups"`
	// The amount of time (in seconds) to wait before considering the signal expired.
	ExpirationDuration *int `pulumi:"expirationDuration"`
	// Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
	FillOption *string `pulumi:"fillOption"`
	// This value will be used for filling gaps in the signal.
	FillValue *float64 `pulumi:"fillValue"`
	// **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
	//
	// Deprecated: use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
	IgnoreOverlap *bool `pulumi:"ignoreOverlap"`
	// The title of the condition.
	Name *string `pulumi:"name"`
	// A NRQL query. See NRQL below for details.
	Nrql NrqlAlertConditionNrql `pulumi:"nrql"`
	// Whether to create a new violation to capture that the signal expired.
	OpenViolationOnExpiration *bool `pulumi:"openViolationOnExpiration"`
	// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
	OpenViolationOnGroupOverlap *bool `pulumi:"openViolationOnGroupOverlap"`
	// The ID of the policy where this condition should be used.
	PolicyId int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
	//
	// Deprecated: use `critical` and `warning` attributes instead
	Terms []NrqlAlertConditionTerm `pulumi:"terms"`
	// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
	Type *string `pulumi:"type"`
	// Possible values are `singleValue`, `sum` (case insensitive).
	ValueFunction *string `pulumi:"valueFunction"`
	// **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	//
	// Deprecated: use `violation_time_limit_seconds` attribute instead
	ViolationTimeLimit *string `pulumi:"violationTimeLimit"`
	// Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	ViolationTimeLimitSeconds *int `pulumi:"violationTimeLimitSeconds"`
	// A list containing the `warning` threshold values. See Terms below for details.
	Warning *NrqlAlertConditionWarning `pulumi:"warning"`
}

// The set of arguments for constructing a NrqlAlertCondition resource.
type NrqlAlertConditionArgs struct {
	// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
	AggregationWindow pulumi.IntPtrInput
	// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
	BaselineDirection pulumi.StringPtrInput
	// Whether to close all open violations when the signal expires.
	CloseViolationsOnExpiration pulumi.BoolPtrInput
	// A list containing the `critical` threshold values. See Terms below for details.
	Critical NrqlAlertConditionCriticalPtrInput
	// The description of the NRQL alert condition.
	Description pulumi.StringPtrInput
	// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Number of expected groups when using `outlier` detection.
	ExpectedGroups pulumi.IntPtrInput
	// The amount of time (in seconds) to wait before considering the signal expired.
	ExpirationDuration pulumi.IntPtrInput
	// Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
	FillOption pulumi.StringPtrInput
	// This value will be used for filling gaps in the signal.
	FillValue pulumi.Float64PtrInput
	// **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
	//
	// Deprecated: use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
	IgnoreOverlap pulumi.BoolPtrInput
	// The title of the condition.
	Name pulumi.StringPtrInput
	// A NRQL query. See NRQL below for details.
	Nrql NrqlAlertConditionNrqlInput
	// Whether to create a new violation to capture that the signal expired.
	OpenViolationOnExpiration pulumi.BoolPtrInput
	// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
	OpenViolationOnGroupOverlap pulumi.BoolPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
	//
	// Deprecated: use `critical` and `warning` attributes instead
	Terms NrqlAlertConditionTermArrayInput
	// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
	Type pulumi.StringPtrInput
	// Possible values are `singleValue`, `sum` (case insensitive).
	ValueFunction pulumi.StringPtrInput
	// **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	//
	// Deprecated: use `violation_time_limit_seconds` attribute instead
	ViolationTimeLimit pulumi.StringPtrInput
	// Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
	// <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
	ViolationTimeLimitSeconds pulumi.IntPtrInput
	// A list containing the `warning` threshold values. See Terms below for details.
	Warning NrqlAlertConditionWarningPtrInput
}

func (NrqlAlertConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nrqlAlertConditionArgs)(nil)).Elem()
}

type NrqlAlertConditionInput interface {
	pulumi.Input

	ToNrqlAlertConditionOutput() NrqlAlertConditionOutput
	ToNrqlAlertConditionOutputWithContext(ctx context.Context) NrqlAlertConditionOutput
}

func (*NrqlAlertCondition) ElementType() reflect.Type {
	return reflect.TypeOf((*NrqlAlertCondition)(nil))
}

func (i *NrqlAlertCondition) ToNrqlAlertConditionOutput() NrqlAlertConditionOutput {
	return i.ToNrqlAlertConditionOutputWithContext(context.Background())
}

func (i *NrqlAlertCondition) ToNrqlAlertConditionOutputWithContext(ctx context.Context) NrqlAlertConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlAlertConditionOutput)
}

func (i *NrqlAlertCondition) ToNrqlAlertConditionPtrOutput() NrqlAlertConditionPtrOutput {
	return i.ToNrqlAlertConditionPtrOutputWithContext(context.Background())
}

func (i *NrqlAlertCondition) ToNrqlAlertConditionPtrOutputWithContext(ctx context.Context) NrqlAlertConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlAlertConditionPtrOutput)
}

type NrqlAlertConditionPtrInput interface {
	pulumi.Input

	ToNrqlAlertConditionPtrOutput() NrqlAlertConditionPtrOutput
	ToNrqlAlertConditionPtrOutputWithContext(ctx context.Context) NrqlAlertConditionPtrOutput
}

type nrqlAlertConditionPtrType NrqlAlertConditionArgs

func (*nrqlAlertConditionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NrqlAlertCondition)(nil))
}

func (i *nrqlAlertConditionPtrType) ToNrqlAlertConditionPtrOutput() NrqlAlertConditionPtrOutput {
	return i.ToNrqlAlertConditionPtrOutputWithContext(context.Background())
}

func (i *nrqlAlertConditionPtrType) ToNrqlAlertConditionPtrOutputWithContext(ctx context.Context) NrqlAlertConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlAlertConditionPtrOutput)
}

// NrqlAlertConditionArrayInput is an input type that accepts NrqlAlertConditionArray and NrqlAlertConditionArrayOutput values.
// You can construct a concrete instance of `NrqlAlertConditionArrayInput` via:
//
//          NrqlAlertConditionArray{ NrqlAlertConditionArgs{...} }
type NrqlAlertConditionArrayInput interface {
	pulumi.Input

	ToNrqlAlertConditionArrayOutput() NrqlAlertConditionArrayOutput
	ToNrqlAlertConditionArrayOutputWithContext(context.Context) NrqlAlertConditionArrayOutput
}

type NrqlAlertConditionArray []NrqlAlertConditionInput

func (NrqlAlertConditionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NrqlAlertCondition)(nil))
}

func (i NrqlAlertConditionArray) ToNrqlAlertConditionArrayOutput() NrqlAlertConditionArrayOutput {
	return i.ToNrqlAlertConditionArrayOutputWithContext(context.Background())
}

func (i NrqlAlertConditionArray) ToNrqlAlertConditionArrayOutputWithContext(ctx context.Context) NrqlAlertConditionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlAlertConditionArrayOutput)
}

// NrqlAlertConditionMapInput is an input type that accepts NrqlAlertConditionMap and NrqlAlertConditionMapOutput values.
// You can construct a concrete instance of `NrqlAlertConditionMapInput` via:
//
//          NrqlAlertConditionMap{ "key": NrqlAlertConditionArgs{...} }
type NrqlAlertConditionMapInput interface {
	pulumi.Input

	ToNrqlAlertConditionMapOutput() NrqlAlertConditionMapOutput
	ToNrqlAlertConditionMapOutputWithContext(context.Context) NrqlAlertConditionMapOutput
}

type NrqlAlertConditionMap map[string]NrqlAlertConditionInput

func (NrqlAlertConditionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NrqlAlertCondition)(nil))
}

func (i NrqlAlertConditionMap) ToNrqlAlertConditionMapOutput() NrqlAlertConditionMapOutput {
	return i.ToNrqlAlertConditionMapOutputWithContext(context.Background())
}

func (i NrqlAlertConditionMap) ToNrqlAlertConditionMapOutputWithContext(ctx context.Context) NrqlAlertConditionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlAlertConditionMapOutput)
}

type NrqlAlertConditionOutput struct {
	*pulumi.OutputState
}

func (NrqlAlertConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NrqlAlertCondition)(nil))
}

func (o NrqlAlertConditionOutput) ToNrqlAlertConditionOutput() NrqlAlertConditionOutput {
	return o
}

func (o NrqlAlertConditionOutput) ToNrqlAlertConditionOutputWithContext(ctx context.Context) NrqlAlertConditionOutput {
	return o
}

func (o NrqlAlertConditionOutput) ToNrqlAlertConditionPtrOutput() NrqlAlertConditionPtrOutput {
	return o.ToNrqlAlertConditionPtrOutputWithContext(context.Background())
}

func (o NrqlAlertConditionOutput) ToNrqlAlertConditionPtrOutputWithContext(ctx context.Context) NrqlAlertConditionPtrOutput {
	return o.ApplyT(func(v NrqlAlertCondition) *NrqlAlertCondition {
		return &v
	}).(NrqlAlertConditionPtrOutput)
}

type NrqlAlertConditionPtrOutput struct {
	*pulumi.OutputState
}

func (NrqlAlertConditionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NrqlAlertCondition)(nil))
}

func (o NrqlAlertConditionPtrOutput) ToNrqlAlertConditionPtrOutput() NrqlAlertConditionPtrOutput {
	return o
}

func (o NrqlAlertConditionPtrOutput) ToNrqlAlertConditionPtrOutputWithContext(ctx context.Context) NrqlAlertConditionPtrOutput {
	return o
}

type NrqlAlertConditionArrayOutput struct{ *pulumi.OutputState }

func (NrqlAlertConditionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NrqlAlertCondition)(nil))
}

func (o NrqlAlertConditionArrayOutput) ToNrqlAlertConditionArrayOutput() NrqlAlertConditionArrayOutput {
	return o
}

func (o NrqlAlertConditionArrayOutput) ToNrqlAlertConditionArrayOutputWithContext(ctx context.Context) NrqlAlertConditionArrayOutput {
	return o
}

func (o NrqlAlertConditionArrayOutput) Index(i pulumi.IntInput) NrqlAlertConditionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NrqlAlertCondition {
		return vs[0].([]NrqlAlertCondition)[vs[1].(int)]
	}).(NrqlAlertConditionOutput)
}

type NrqlAlertConditionMapOutput struct{ *pulumi.OutputState }

func (NrqlAlertConditionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NrqlAlertCondition)(nil))
}

func (o NrqlAlertConditionMapOutput) ToNrqlAlertConditionMapOutput() NrqlAlertConditionMapOutput {
	return o
}

func (o NrqlAlertConditionMapOutput) ToNrqlAlertConditionMapOutputWithContext(ctx context.Context) NrqlAlertConditionMapOutput {
	return o
}

func (o NrqlAlertConditionMapOutput) MapIndex(k pulumi.StringInput) NrqlAlertConditionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NrqlAlertCondition {
		return vs[0].(map[string]NrqlAlertCondition)[vs[1].(string)]
	}).(NrqlAlertConditionOutput)
}

func init() {
	pulumi.RegisterOutputType(NrqlAlertConditionOutput{})
	pulumi.RegisterOutputType(NrqlAlertConditionPtrOutput{})
	pulumi.RegisterOutputType(NrqlAlertConditionArrayOutput{})
	pulumi.RegisterOutputType(NrqlAlertConditionMapOutput{})
}
