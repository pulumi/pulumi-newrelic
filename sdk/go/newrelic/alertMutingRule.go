// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewAlertMutingRule(ctx, "foo", &newrelic.AlertMutingRuleArgs{
//				Name:        pulumi.String("Example Muting Rule"),
//				Enabled:     pulumi.Bool(true),
//				Description: pulumi.String("muting rule test."),
//				Condition: &newrelic.AlertMutingRuleConditionArgs{
//					Conditions: newrelic.AlertMutingRuleConditionConditionArray{
//						&newrelic.AlertMutingRuleConditionConditionArgs{
//							Attribute: pulumi.String("product"),
//							Operator:  pulumi.String("EQUALS"),
//							Values: pulumi.StringArray{
//								pulumi.String("APM"),
//							},
//						},
//						&newrelic.AlertMutingRuleConditionConditionArgs{
//							Attribute: pulumi.String("targetId"),
//							Operator:  pulumi.String("EQUALS"),
//							Values: pulumi.StringArray{
//								pulumi.String("Muted"),
//							},
//						},
//					},
//					Operator: pulumi.String("AND"),
//				},
//				Schedule: &newrelic.AlertMutingRuleScheduleArgs{
//					StartTime: pulumi.String("2021-01-28T15:30:00"),
//					EndTime:   pulumi.String("2021-01-28T16:30:00"),
//					TimeZone:  pulumi.String("America/Los_Angeles"),
//					Repeat:    pulumi.String("WEEKLY"),
//					WeeklyRepeatDays: pulumi.StringArray{
//						pulumi.String("MONDAY"),
//						pulumi.String("WEDNESDAY"),
//						pulumi.String("FRIDAY"),
//					},
//					RepeatCount: pulumi.Int(42),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.
//
// ```sh
// $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
// ```
type AlertMutingRule struct {
	pulumi.CustomResourceState

	// The account id of the MutingRule.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The condition that defines which incidents to target. See Nested condition blocks below for details.
	Condition AlertMutingRuleConditionOutput `pulumi:"condition"`
	// The description of the MutingRule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the MutingRule is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The name of the MutingRule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specify a schedule for enabling the MutingRule. See Schedule below for details
	Schedule AlertMutingRuleSchedulePtrOutput `pulumi:"schedule"`
}

// NewAlertMutingRule registers a new resource with the given unique name, arguments, and options.
func NewAlertMutingRule(ctx *pulumi.Context,
	name string, args *AlertMutingRuleArgs, opts ...pulumi.ResourceOption) (*AlertMutingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Condition == nil {
		return nil, errors.New("invalid value for required argument 'Condition'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AlertMutingRule
	err := ctx.RegisterResource("newrelic:index/alertMutingRule:AlertMutingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertMutingRule gets an existing AlertMutingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertMutingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertMutingRuleState, opts ...pulumi.ResourceOption) (*AlertMutingRule, error) {
	var resource AlertMutingRule
	err := ctx.ReadResource("newrelic:index/alertMutingRule:AlertMutingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertMutingRule resources.
type alertMutingRuleState struct {
	// The account id of the MutingRule.
	AccountId *string `pulumi:"accountId"`
	// The condition that defines which incidents to target. See Nested condition blocks below for details.
	Condition *AlertMutingRuleCondition `pulumi:"condition"`
	// The description of the MutingRule.
	Description *string `pulumi:"description"`
	// Whether the MutingRule is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The name of the MutingRule.
	Name *string `pulumi:"name"`
	// Specify a schedule for enabling the MutingRule. See Schedule below for details
	Schedule *AlertMutingRuleSchedule `pulumi:"schedule"`
}

type AlertMutingRuleState struct {
	// The account id of the MutingRule.
	AccountId pulumi.StringPtrInput
	// The condition that defines which incidents to target. See Nested condition blocks below for details.
	Condition AlertMutingRuleConditionPtrInput
	// The description of the MutingRule.
	Description pulumi.StringPtrInput
	// Whether the MutingRule is enabled.
	Enabled pulumi.BoolPtrInput
	// The name of the MutingRule.
	Name pulumi.StringPtrInput
	// Specify a schedule for enabling the MutingRule. See Schedule below for details
	Schedule AlertMutingRuleSchedulePtrInput
}

func (AlertMutingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertMutingRuleState)(nil)).Elem()
}

type alertMutingRuleArgs struct {
	// The account id of the MutingRule.
	AccountId *string `pulumi:"accountId"`
	// The condition that defines which incidents to target. See Nested condition blocks below for details.
	Condition AlertMutingRuleCondition `pulumi:"condition"`
	// The description of the MutingRule.
	Description *string `pulumi:"description"`
	// Whether the MutingRule is enabled.
	Enabled bool `pulumi:"enabled"`
	// The name of the MutingRule.
	Name *string `pulumi:"name"`
	// Specify a schedule for enabling the MutingRule. See Schedule below for details
	Schedule *AlertMutingRuleSchedule `pulumi:"schedule"`
}

// The set of arguments for constructing a AlertMutingRule resource.
type AlertMutingRuleArgs struct {
	// The account id of the MutingRule.
	AccountId pulumi.StringPtrInput
	// The condition that defines which incidents to target. See Nested condition blocks below for details.
	Condition AlertMutingRuleConditionInput
	// The description of the MutingRule.
	Description pulumi.StringPtrInput
	// Whether the MutingRule is enabled.
	Enabled pulumi.BoolInput
	// The name of the MutingRule.
	Name pulumi.StringPtrInput
	// Specify a schedule for enabling the MutingRule. See Schedule below for details
	Schedule AlertMutingRuleSchedulePtrInput
}

func (AlertMutingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertMutingRuleArgs)(nil)).Elem()
}

type AlertMutingRuleInput interface {
	pulumi.Input

	ToAlertMutingRuleOutput() AlertMutingRuleOutput
	ToAlertMutingRuleOutputWithContext(ctx context.Context) AlertMutingRuleOutput
}

func (*AlertMutingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertMutingRule)(nil)).Elem()
}

func (i *AlertMutingRule) ToAlertMutingRuleOutput() AlertMutingRuleOutput {
	return i.ToAlertMutingRuleOutputWithContext(context.Background())
}

func (i *AlertMutingRule) ToAlertMutingRuleOutputWithContext(ctx context.Context) AlertMutingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertMutingRuleOutput)
}

// AlertMutingRuleArrayInput is an input type that accepts AlertMutingRuleArray and AlertMutingRuleArrayOutput values.
// You can construct a concrete instance of `AlertMutingRuleArrayInput` via:
//
//	AlertMutingRuleArray{ AlertMutingRuleArgs{...} }
type AlertMutingRuleArrayInput interface {
	pulumi.Input

	ToAlertMutingRuleArrayOutput() AlertMutingRuleArrayOutput
	ToAlertMutingRuleArrayOutputWithContext(context.Context) AlertMutingRuleArrayOutput
}

type AlertMutingRuleArray []AlertMutingRuleInput

func (AlertMutingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertMutingRule)(nil)).Elem()
}

func (i AlertMutingRuleArray) ToAlertMutingRuleArrayOutput() AlertMutingRuleArrayOutput {
	return i.ToAlertMutingRuleArrayOutputWithContext(context.Background())
}

func (i AlertMutingRuleArray) ToAlertMutingRuleArrayOutputWithContext(ctx context.Context) AlertMutingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertMutingRuleArrayOutput)
}

// AlertMutingRuleMapInput is an input type that accepts AlertMutingRuleMap and AlertMutingRuleMapOutput values.
// You can construct a concrete instance of `AlertMutingRuleMapInput` via:
//
//	AlertMutingRuleMap{ "key": AlertMutingRuleArgs{...} }
type AlertMutingRuleMapInput interface {
	pulumi.Input

	ToAlertMutingRuleMapOutput() AlertMutingRuleMapOutput
	ToAlertMutingRuleMapOutputWithContext(context.Context) AlertMutingRuleMapOutput
}

type AlertMutingRuleMap map[string]AlertMutingRuleInput

func (AlertMutingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertMutingRule)(nil)).Elem()
}

func (i AlertMutingRuleMap) ToAlertMutingRuleMapOutput() AlertMutingRuleMapOutput {
	return i.ToAlertMutingRuleMapOutputWithContext(context.Background())
}

func (i AlertMutingRuleMap) ToAlertMutingRuleMapOutputWithContext(ctx context.Context) AlertMutingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertMutingRuleMapOutput)
}

type AlertMutingRuleOutput struct{ *pulumi.OutputState }

func (AlertMutingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertMutingRule)(nil)).Elem()
}

func (o AlertMutingRuleOutput) ToAlertMutingRuleOutput() AlertMutingRuleOutput {
	return o
}

func (o AlertMutingRuleOutput) ToAlertMutingRuleOutputWithContext(ctx context.Context) AlertMutingRuleOutput {
	return o
}

// The account id of the MutingRule.
func (o AlertMutingRuleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertMutingRule) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The condition that defines which incidents to target. See Nested condition blocks below for details.
func (o AlertMutingRuleOutput) Condition() AlertMutingRuleConditionOutput {
	return o.ApplyT(func(v *AlertMutingRule) AlertMutingRuleConditionOutput { return v.Condition }).(AlertMutingRuleConditionOutput)
}

// The description of the MutingRule.
func (o AlertMutingRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertMutingRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the MutingRule is enabled.
func (o AlertMutingRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AlertMutingRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The name of the MutingRule.
func (o AlertMutingRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertMutingRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specify a schedule for enabling the MutingRule. See Schedule below for details
func (o AlertMutingRuleOutput) Schedule() AlertMutingRuleSchedulePtrOutput {
	return o.ApplyT(func(v *AlertMutingRule) AlertMutingRuleSchedulePtrOutput { return v.Schedule }).(AlertMutingRuleSchedulePtrOutput)
}

type AlertMutingRuleArrayOutput struct{ *pulumi.OutputState }

func (AlertMutingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertMutingRule)(nil)).Elem()
}

func (o AlertMutingRuleArrayOutput) ToAlertMutingRuleArrayOutput() AlertMutingRuleArrayOutput {
	return o
}

func (o AlertMutingRuleArrayOutput) ToAlertMutingRuleArrayOutputWithContext(ctx context.Context) AlertMutingRuleArrayOutput {
	return o
}

func (o AlertMutingRuleArrayOutput) Index(i pulumi.IntInput) AlertMutingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertMutingRule {
		return vs[0].([]*AlertMutingRule)[vs[1].(int)]
	}).(AlertMutingRuleOutput)
}

type AlertMutingRuleMapOutput struct{ *pulumi.OutputState }

func (AlertMutingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertMutingRule)(nil)).Elem()
}

func (o AlertMutingRuleMapOutput) ToAlertMutingRuleMapOutput() AlertMutingRuleMapOutput {
	return o
}

func (o AlertMutingRuleMapOutput) ToAlertMutingRuleMapOutputWithContext(ctx context.Context) AlertMutingRuleMapOutput {
	return o
}

func (o AlertMutingRuleMapOutput) MapIndex(k pulumi.StringInput) AlertMutingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertMutingRule {
		return vs[0].(map[string]*AlertMutingRule)[vs[1].(string)]
	}).(AlertMutingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertMutingRuleInput)(nil)).Elem(), &AlertMutingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertMutingRuleArrayInput)(nil)).Elem(), AlertMutingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertMutingRuleMapInput)(nil)).Elem(), AlertMutingRuleMap{})
	pulumi.RegisterOutputType(AlertMutingRuleOutput{})
	pulumi.RegisterOutputType(AlertMutingRuleArrayOutput{})
	pulumi.RegisterOutputType(AlertMutingRuleMapOutput{})
}
