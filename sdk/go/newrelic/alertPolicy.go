// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage New Relic alert policies.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := newrelic.NewAlertPolicy(ctx, "foo", &newrelic.AlertPolicyArgs{
// 			IncidentPreference: pulumi.String("PER_POLICY"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Alert policies can be imported using a composite ID of `<id>:<account_id>`, where `account_id` is the account number scoped to the alert policy resource. Example import
//
// ```sh
//  $ pulumi import newrelic:index/alertPolicy:AlertPolicy foo 23423556:4593020
// ```
//
//  Please note that channel IDs (`channel_ids`) _cannot_ be imported due channels being a separate resource. However, to add channels to an imported alert policy, you can import the policy, add the `channel_ids` attribute with the associated channel IDs, then run `terraform apply`. This will result in the original alert policy being destroyed and a new alert policy being created along with the channels being added to the policy.
type AlertPolicy struct {
	pulumi.CustomResourceState

	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
	ChannelIds pulumi.IntArrayOutput `pulumi:"channelIds"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrOutput `pulumi:"incidentPreference"`
	// The name of the policy.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAlertPolicy registers a new resource with the given unique name, arguments, and options.
func NewAlertPolicy(ctx *pulumi.Context,
	name string, args *AlertPolicyArgs, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	if args == nil {
		args = &AlertPolicyArgs{}
	}

	var resource AlertPolicy
	err := ctx.RegisterResource("newrelic:index/alertPolicy:AlertPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertPolicy gets an existing AlertPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertPolicyState, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	var resource AlertPolicy
	err := ctx.ReadResource("newrelic:index/alertPolicy:AlertPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertPolicy resources.
type alertPolicyState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
	ChannelIds []int `pulumi:"channelIds"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference *string `pulumi:"incidentPreference"`
	// The name of the policy.
	Name *string `pulumi:"name"`
}

type AlertPolicyState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
	ChannelIds pulumi.IntArrayInput
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
}

func (AlertPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyState)(nil)).Elem()
}

type alertPolicyArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
	ChannelIds []int `pulumi:"channelIds"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference *string `pulumi:"incidentPreference"`
	// The name of the policy.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AlertPolicy resource.
type AlertPolicyArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
	ChannelIds pulumi.IntArrayInput
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
}

func (AlertPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyArgs)(nil)).Elem()
}

type AlertPolicyInput interface {
	pulumi.Input

	ToAlertPolicyOutput() AlertPolicyOutput
	ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput
}

func (*AlertPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertPolicy)(nil))
}

func (i *AlertPolicy) ToAlertPolicyOutput() AlertPolicyOutput {
	return i.ToAlertPolicyOutputWithContext(context.Background())
}

func (i *AlertPolicy) ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyOutput)
}

func (i *AlertPolicy) ToAlertPolicyPtrOutput() AlertPolicyPtrOutput {
	return i.ToAlertPolicyPtrOutputWithContext(context.Background())
}

func (i *AlertPolicy) ToAlertPolicyPtrOutputWithContext(ctx context.Context) AlertPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyPtrOutput)
}

type AlertPolicyPtrInput interface {
	pulumi.Input

	ToAlertPolicyPtrOutput() AlertPolicyPtrOutput
	ToAlertPolicyPtrOutputWithContext(ctx context.Context) AlertPolicyPtrOutput
}

type alertPolicyPtrType AlertPolicyArgs

func (*alertPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicy)(nil))
}

func (i *alertPolicyPtrType) ToAlertPolicyPtrOutput() AlertPolicyPtrOutput {
	return i.ToAlertPolicyPtrOutputWithContext(context.Background())
}

func (i *alertPolicyPtrType) ToAlertPolicyPtrOutputWithContext(ctx context.Context) AlertPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyPtrOutput)
}

// AlertPolicyArrayInput is an input type that accepts AlertPolicyArray and AlertPolicyArrayOutput values.
// You can construct a concrete instance of `AlertPolicyArrayInput` via:
//
//          AlertPolicyArray{ AlertPolicyArgs{...} }
type AlertPolicyArrayInput interface {
	pulumi.Input

	ToAlertPolicyArrayOutput() AlertPolicyArrayOutput
	ToAlertPolicyArrayOutputWithContext(context.Context) AlertPolicyArrayOutput
}

type AlertPolicyArray []AlertPolicyInput

func (AlertPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AlertPolicy)(nil))
}

func (i AlertPolicyArray) ToAlertPolicyArrayOutput() AlertPolicyArrayOutput {
	return i.ToAlertPolicyArrayOutputWithContext(context.Background())
}

func (i AlertPolicyArray) ToAlertPolicyArrayOutputWithContext(ctx context.Context) AlertPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyArrayOutput)
}

// AlertPolicyMapInput is an input type that accepts AlertPolicyMap and AlertPolicyMapOutput values.
// You can construct a concrete instance of `AlertPolicyMapInput` via:
//
//          AlertPolicyMap{ "key": AlertPolicyArgs{...} }
type AlertPolicyMapInput interface {
	pulumi.Input

	ToAlertPolicyMapOutput() AlertPolicyMapOutput
	ToAlertPolicyMapOutputWithContext(context.Context) AlertPolicyMapOutput
}

type AlertPolicyMap map[string]AlertPolicyInput

func (AlertPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AlertPolicy)(nil))
}

func (i AlertPolicyMap) ToAlertPolicyMapOutput() AlertPolicyMapOutput {
	return i.ToAlertPolicyMapOutputWithContext(context.Background())
}

func (i AlertPolicyMap) ToAlertPolicyMapOutputWithContext(ctx context.Context) AlertPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyMapOutput)
}

type AlertPolicyOutput struct {
	*pulumi.OutputState
}

func (AlertPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertPolicy)(nil))
}

func (o AlertPolicyOutput) ToAlertPolicyOutput() AlertPolicyOutput {
	return o
}

func (o AlertPolicyOutput) ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput {
	return o
}

func (o AlertPolicyOutput) ToAlertPolicyPtrOutput() AlertPolicyPtrOutput {
	return o.ToAlertPolicyPtrOutputWithContext(context.Background())
}

func (o AlertPolicyOutput) ToAlertPolicyPtrOutputWithContext(ctx context.Context) AlertPolicyPtrOutput {
	return o.ApplyT(func(v AlertPolicy) *AlertPolicy {
		return &v
	}).(AlertPolicyPtrOutput)
}

type AlertPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (AlertPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicy)(nil))
}

func (o AlertPolicyPtrOutput) ToAlertPolicyPtrOutput() AlertPolicyPtrOutput {
	return o
}

func (o AlertPolicyPtrOutput) ToAlertPolicyPtrOutputWithContext(ctx context.Context) AlertPolicyPtrOutput {
	return o
}

type AlertPolicyArrayOutput struct{ *pulumi.OutputState }

func (AlertPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AlertPolicy)(nil))
}

func (o AlertPolicyArrayOutput) ToAlertPolicyArrayOutput() AlertPolicyArrayOutput {
	return o
}

func (o AlertPolicyArrayOutput) ToAlertPolicyArrayOutputWithContext(ctx context.Context) AlertPolicyArrayOutput {
	return o
}

func (o AlertPolicyArrayOutput) Index(i pulumi.IntInput) AlertPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AlertPolicy {
		return vs[0].([]AlertPolicy)[vs[1].(int)]
	}).(AlertPolicyOutput)
}

type AlertPolicyMapOutput struct{ *pulumi.OutputState }

func (AlertPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AlertPolicy)(nil))
}

func (o AlertPolicyMapOutput) ToAlertPolicyMapOutput() AlertPolicyMapOutput {
	return o
}

func (o AlertPolicyMapOutput) ToAlertPolicyMapOutputWithContext(ctx context.Context) AlertPolicyMapOutput {
	return o
}

func (o AlertPolicyMapOutput) MapIndex(k pulumi.StringInput) AlertPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AlertPolicy {
		return vs[0].(map[string]AlertPolicy)[vs[1].(string)]
	}).(AlertPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(AlertPolicyOutput{})
	pulumi.RegisterOutputType(AlertPolicyPtrOutput{})
	pulumi.RegisterOutputType(AlertPolicyArrayOutput{})
	pulumi.RegisterOutputType(AlertPolicyMapOutput{})
}
