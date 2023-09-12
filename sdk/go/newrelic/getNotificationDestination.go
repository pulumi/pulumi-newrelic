// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupNotificationDestination(ctx *pulumi.Context, args *LookupNotificationDestinationArgs, opts ...pulumi.InvokeOption) (*LookupNotificationDestinationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNotificationDestinationResult
	err := ctx.Invoke("newrelic:index/getNotificationDestination:getNotificationDestination", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNotificationDestination.
type LookupNotificationDestinationArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The id of the notification destination in New Relic.
	Id *string `pulumi:"id"`
	// The name of the notification destination.
	//
	// Optional:
	Name *string `pulumi:"name"`
}

// A collection of values returned by getNotificationDestination.
type LookupNotificationDestinationResult struct {
	AccountId int `pulumi:"accountId"`
	// An indication whether the notification destination is active or not.
	Active bool    `pulumi:"active"`
	Id     *string `pulumi:"id"`
	// The name of the notification destination.
	Name *string `pulumi:"name"`
	// A nested block that describes a notification destination property.
	Properties []GetNotificationDestinationProperty `pulumi:"properties"`
	// The status of the notification destination.
	Status string `pulumi:"status"`
	// The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK` and `SLACK_COLLABORATION`.
	Type string `pulumi:"type"`
}

func LookupNotificationDestinationOutput(ctx *pulumi.Context, args LookupNotificationDestinationOutputArgs, opts ...pulumi.InvokeOption) LookupNotificationDestinationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNotificationDestinationResult, error) {
			args := v.(LookupNotificationDestinationArgs)
			r, err := LookupNotificationDestination(ctx, &args, opts...)
			var s LookupNotificationDestinationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNotificationDestinationResultOutput)
}

// A collection of arguments for invoking getNotificationDestination.
type LookupNotificationDestinationOutputArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput `pulumi:"accountId"`
	// The id of the notification destination in New Relic.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the notification destination.
	//
	// Optional:
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupNotificationDestinationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotificationDestinationArgs)(nil)).Elem()
}

// A collection of values returned by getNotificationDestination.
type LookupNotificationDestinationResultOutput struct{ *pulumi.OutputState }

func (LookupNotificationDestinationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNotificationDestinationResult)(nil)).Elem()
}

func (o LookupNotificationDestinationResultOutput) ToLookupNotificationDestinationResultOutput() LookupNotificationDestinationResultOutput {
	return o
}

func (o LookupNotificationDestinationResultOutput) ToLookupNotificationDestinationResultOutputWithContext(ctx context.Context) LookupNotificationDestinationResultOutput {
	return o
}

func (o LookupNotificationDestinationResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupNotificationDestinationResult] {
	return pulumix.Output[LookupNotificationDestinationResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupNotificationDestinationResultOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) int { return v.AccountId }).(pulumi.IntOutput)
}

// An indication whether the notification destination is active or not.
func (o LookupNotificationDestinationResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) bool { return v.Active }).(pulumi.BoolOutput)
}

func (o LookupNotificationDestinationResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The name of the notification destination.
func (o LookupNotificationDestinationResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// A nested block that describes a notification destination property.
func (o LookupNotificationDestinationResultOutput) Properties() GetNotificationDestinationPropertyArrayOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) []GetNotificationDestinationProperty { return v.Properties }).(GetNotificationDestinationPropertyArrayOutput)
}

// The status of the notification destination.
func (o LookupNotificationDestinationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.Status }).(pulumi.StringOutput)
}

// The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK` and `SLACK_COLLABORATION`.
func (o LookupNotificationDestinationResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNotificationDestinationResultOutput{})
}
