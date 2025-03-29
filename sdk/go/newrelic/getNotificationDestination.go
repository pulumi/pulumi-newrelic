// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
	AccountId *string `pulumi:"accountId"`
	// The id of the notification destination in New Relic.
	Id *string `pulumi:"id"`
	// The name of the notification destination.
	//
	// Optional:
	Name *string `pulumi:"name"`
	// The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
	SecureUrls []GetNotificationDestinationSecureUrl `pulumi:"secureUrls"`
}

// A collection of values returned by getNotificationDestination.
type LookupNotificationDestinationResult struct {
	AccountId string `pulumi:"accountId"`
	// An indication whether the notification destination is active or not.
	Active bool `pulumi:"active"`
	// The unique entity identifier of the destination in New Relic.
	Guid string  `pulumi:"guid"`
	Id   *string `pulumi:"id"`
	// The name of the notification destination.
	Name *string `pulumi:"name"`
	// A nested block that describes a notification destination property.
	Properties []GetNotificationDestinationProperty `pulumi:"properties"`
	// The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
	SecureUrls []GetNotificationDestinationSecureUrl `pulumi:"secureUrls"`
	// The status of the notification destination.
	Status string `pulumi:"status"`
	// The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK`, `SLACK_COLLABORATION` and `MICROSOFT_TEAMS`.
	Type string `pulumi:"type"`
}

func LookupNotificationDestinationOutput(ctx *pulumi.Context, args LookupNotificationDestinationOutputArgs, opts ...pulumi.InvokeOption) LookupNotificationDestinationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNotificationDestinationResultOutput, error) {
			args := v.(LookupNotificationDestinationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("newrelic:index/getNotificationDestination:getNotificationDestination", args, LookupNotificationDestinationResultOutput{}, options).(LookupNotificationDestinationResultOutput), nil
		}).(LookupNotificationDestinationResultOutput)
}

// A collection of arguments for invoking getNotificationDestination.
type LookupNotificationDestinationOutputArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// The id of the notification destination in New Relic.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the notification destination.
	//
	// Optional:
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
	SecureUrls GetNotificationDestinationSecureUrlArrayInput `pulumi:"secureUrls"`
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

func (o LookupNotificationDestinationResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// An indication whether the notification destination is active or not.
func (o LookupNotificationDestinationResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// The unique entity identifier of the destination in New Relic.
func (o LookupNotificationDestinationResultOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.Guid }).(pulumi.StringOutput)
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

// The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
func (o LookupNotificationDestinationResultOutput) SecureUrls() GetNotificationDestinationSecureUrlArrayOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) []GetNotificationDestinationSecureUrl { return v.SecureUrls }).(GetNotificationDestinationSecureUrlArrayOutput)
}

// The status of the notification destination.
func (o LookupNotificationDestinationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.Status }).(pulumi.StringOutput)
}

// The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK`, `SLACK_COLLABORATION` and `MICROSOFT_TEAMS`.
func (o LookupNotificationDestinationResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNotificationDestinationResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNotificationDestinationResultOutput{})
}
