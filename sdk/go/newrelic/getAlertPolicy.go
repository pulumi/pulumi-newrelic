// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific alert policy in New Relic that already exists.
func LookupAlertPolicy(ctx *pulumi.Context, args *LookupAlertPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAlertPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAlertPolicyResult
	err := ctx.Invoke("newrelic:index/getAlertPolicy:getAlertPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlertPolicy.
type LookupAlertPolicyArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *string `pulumi:"accountId"`
	// The rollup strategy for the policy, which can have one of the following values:
	// * `PER_POLICY` - Represents the incident grouping preference **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
	// * `PER_CONDITION` - Represents the incident grouping preference **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
	// * `PER_CONDITION_AND_TARGET` - Represents the incident grouping preference **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
	IncidentPreference *string `pulumi:"incidentPreference"`
	// The name of the alert policy in New Relic.
	Name string `pulumi:"name"`
}

// A collection of values returned by getAlertPolicy.
type LookupAlertPolicyResult struct {
	AccountId string `pulumi:"accountId"`
	// The time the policy was created.
	CreatedAt string `pulumi:"createdAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The rollup strategy for the policy, which can have one of the following values:
	// * `PER_POLICY` - Represents the incident grouping preference **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
	// * `PER_CONDITION` - Represents the incident grouping preference **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
	// * `PER_CONDITION_AND_TARGET` - Represents the incident grouping preference **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
	IncidentPreference *string `pulumi:"incidentPreference"`
	Name               string  `pulumi:"name"`
	// The time the policy was last updated.
	UpdatedAt string `pulumi:"updatedAt"`
}

func LookupAlertPolicyOutput(ctx *pulumi.Context, args LookupAlertPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupAlertPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAlertPolicyResult, error) {
			args := v.(LookupAlertPolicyArgs)
			r, err := LookupAlertPolicy(ctx, &args, opts...)
			var s LookupAlertPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAlertPolicyResultOutput)
}

// A collection of arguments for invoking getAlertPolicy.
type LookupAlertPolicyOutputArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// The rollup strategy for the policy, which can have one of the following values:
	// * `PER_POLICY` - Represents the incident grouping preference **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
	// * `PER_CONDITION` - Represents the incident grouping preference **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
	// * `PER_CONDITION_AND_TARGET` - Represents the incident grouping preference **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
	IncidentPreference pulumi.StringPtrInput `pulumi:"incidentPreference"`
	// The name of the alert policy in New Relic.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupAlertPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAlertPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAlertPolicy.
type LookupAlertPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupAlertPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAlertPolicyResult)(nil)).Elem()
}

func (o LookupAlertPolicyResultOutput) ToLookupAlertPolicyResultOutput() LookupAlertPolicyResultOutput {
	return o
}

func (o LookupAlertPolicyResultOutput) ToLookupAlertPolicyResultOutputWithContext(ctx context.Context) LookupAlertPolicyResultOutput {
	return o
}

func (o LookupAlertPolicyResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The time the policy was created.
func (o LookupAlertPolicyResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAlertPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// The rollup strategy for the policy, which can have one of the following values:
// * `PER_POLICY` - Represents the incident grouping preference **One issue per policy**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-policy) for more details on this incident grouping preference.
// * `PER_CONDITION` - Represents the incident grouping preference **One issue per condition**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-condition) for more details on this incident grouping preference.
// * `PER_CONDITION_AND_TARGET` - Represents the incident grouping preference **One issue per condition and signal**. Refer to [this page](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-policies/specify-when-alerts-create-incidents/#preference-signal) for more details on this incident grouping preference.
func (o LookupAlertPolicyResultOutput) IncidentPreference() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) *string { return v.IncidentPreference }).(pulumi.StringPtrOutput)
}

func (o LookupAlertPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// The time the policy was last updated.
func (o LookupAlertPolicyResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertPolicyResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAlertPolicyResultOutput{})
}
