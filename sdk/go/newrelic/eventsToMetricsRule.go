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

// Use this resource to create, update, and delete New Relic Events to Metrics rules.
//
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
//			_, err := newrelic.NewEventsToMetricsRule(ctx, "foo", &newrelic.EventsToMetricsRuleArgs{
//				AccountId:   pulumi.String("12345"),
//				Name:        pulumi.String("Example events to metrics rule"),
//				Description: pulumi.String("Example description"),
//				Nrql:        pulumi.String("SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name"),
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
// New Relic Events to Metrics rules can be imported using a concatenated string of the format
//
//	`<account_id>:<rule_id>`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
// ```
type EventsToMetricsRule struct {
	pulumi.CustomResourceState

	// Account with the event and where the metrics will be put.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Provides additional information about the rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// True means this rule is enabled. False means the rule is currently not creating metrics.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The name of the rule. This must be unique within an account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Explains how to create metrics from events.
	Nrql pulumi.StringOutput `pulumi:"nrql"`
	// The id, uniquely identifying the rule.
	RuleId pulumi.StringOutput `pulumi:"ruleId"`
}

// NewEventsToMetricsRule registers a new resource with the given unique name, arguments, and options.
func NewEventsToMetricsRule(ctx *pulumi.Context,
	name string, args *EventsToMetricsRuleArgs, opts ...pulumi.ResourceOption) (*EventsToMetricsRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Nrql == nil {
		return nil, errors.New("invalid value for required argument 'Nrql'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventsToMetricsRule
	err := ctx.RegisterResource("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventsToMetricsRule gets an existing EventsToMetricsRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventsToMetricsRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventsToMetricsRuleState, opts ...pulumi.ResourceOption) (*EventsToMetricsRule, error) {
	var resource EventsToMetricsRule
	err := ctx.ReadResource("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventsToMetricsRule resources.
type eventsToMetricsRuleState struct {
	// Account with the event and where the metrics will be put.
	AccountId *string `pulumi:"accountId"`
	// Provides additional information about the rule.
	Description *string `pulumi:"description"`
	// True means this rule is enabled. False means the rule is currently not creating metrics.
	Enabled *bool `pulumi:"enabled"`
	// The name of the rule. This must be unique within an account.
	Name *string `pulumi:"name"`
	// Explains how to create metrics from events.
	Nrql *string `pulumi:"nrql"`
	// The id, uniquely identifying the rule.
	RuleId *string `pulumi:"ruleId"`
}

type EventsToMetricsRuleState struct {
	// Account with the event and where the metrics will be put.
	AccountId pulumi.StringPtrInput
	// Provides additional information about the rule.
	Description pulumi.StringPtrInput
	// True means this rule is enabled. False means the rule is currently not creating metrics.
	Enabled pulumi.BoolPtrInput
	// The name of the rule. This must be unique within an account.
	Name pulumi.StringPtrInput
	// Explains how to create metrics from events.
	Nrql pulumi.StringPtrInput
	// The id, uniquely identifying the rule.
	RuleId pulumi.StringPtrInput
}

func (EventsToMetricsRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventsToMetricsRuleState)(nil)).Elem()
}

type eventsToMetricsRuleArgs struct {
	// Account with the event and where the metrics will be put.
	AccountId *string `pulumi:"accountId"`
	// Provides additional information about the rule.
	Description *string `pulumi:"description"`
	// True means this rule is enabled. False means the rule is currently not creating metrics.
	Enabled *bool `pulumi:"enabled"`
	// The name of the rule. This must be unique within an account.
	Name *string `pulumi:"name"`
	// Explains how to create metrics from events.
	Nrql string `pulumi:"nrql"`
}

// The set of arguments for constructing a EventsToMetricsRule resource.
type EventsToMetricsRuleArgs struct {
	// Account with the event and where the metrics will be put.
	AccountId pulumi.StringPtrInput
	// Provides additional information about the rule.
	Description pulumi.StringPtrInput
	// True means this rule is enabled. False means the rule is currently not creating metrics.
	Enabled pulumi.BoolPtrInput
	// The name of the rule. This must be unique within an account.
	Name pulumi.StringPtrInput
	// Explains how to create metrics from events.
	Nrql pulumi.StringInput
}

func (EventsToMetricsRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventsToMetricsRuleArgs)(nil)).Elem()
}

type EventsToMetricsRuleInput interface {
	pulumi.Input

	ToEventsToMetricsRuleOutput() EventsToMetricsRuleOutput
	ToEventsToMetricsRuleOutputWithContext(ctx context.Context) EventsToMetricsRuleOutput
}

func (*EventsToMetricsRule) ElementType() reflect.Type {
	return reflect.TypeOf((**EventsToMetricsRule)(nil)).Elem()
}

func (i *EventsToMetricsRule) ToEventsToMetricsRuleOutput() EventsToMetricsRuleOutput {
	return i.ToEventsToMetricsRuleOutputWithContext(context.Background())
}

func (i *EventsToMetricsRule) ToEventsToMetricsRuleOutputWithContext(ctx context.Context) EventsToMetricsRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventsToMetricsRuleOutput)
}

// EventsToMetricsRuleArrayInput is an input type that accepts EventsToMetricsRuleArray and EventsToMetricsRuleArrayOutput values.
// You can construct a concrete instance of `EventsToMetricsRuleArrayInput` via:
//
//	EventsToMetricsRuleArray{ EventsToMetricsRuleArgs{...} }
type EventsToMetricsRuleArrayInput interface {
	pulumi.Input

	ToEventsToMetricsRuleArrayOutput() EventsToMetricsRuleArrayOutput
	ToEventsToMetricsRuleArrayOutputWithContext(context.Context) EventsToMetricsRuleArrayOutput
}

type EventsToMetricsRuleArray []EventsToMetricsRuleInput

func (EventsToMetricsRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventsToMetricsRule)(nil)).Elem()
}

func (i EventsToMetricsRuleArray) ToEventsToMetricsRuleArrayOutput() EventsToMetricsRuleArrayOutput {
	return i.ToEventsToMetricsRuleArrayOutputWithContext(context.Background())
}

func (i EventsToMetricsRuleArray) ToEventsToMetricsRuleArrayOutputWithContext(ctx context.Context) EventsToMetricsRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventsToMetricsRuleArrayOutput)
}

// EventsToMetricsRuleMapInput is an input type that accepts EventsToMetricsRuleMap and EventsToMetricsRuleMapOutput values.
// You can construct a concrete instance of `EventsToMetricsRuleMapInput` via:
//
//	EventsToMetricsRuleMap{ "key": EventsToMetricsRuleArgs{...} }
type EventsToMetricsRuleMapInput interface {
	pulumi.Input

	ToEventsToMetricsRuleMapOutput() EventsToMetricsRuleMapOutput
	ToEventsToMetricsRuleMapOutputWithContext(context.Context) EventsToMetricsRuleMapOutput
}

type EventsToMetricsRuleMap map[string]EventsToMetricsRuleInput

func (EventsToMetricsRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventsToMetricsRule)(nil)).Elem()
}

func (i EventsToMetricsRuleMap) ToEventsToMetricsRuleMapOutput() EventsToMetricsRuleMapOutput {
	return i.ToEventsToMetricsRuleMapOutputWithContext(context.Background())
}

func (i EventsToMetricsRuleMap) ToEventsToMetricsRuleMapOutputWithContext(ctx context.Context) EventsToMetricsRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventsToMetricsRuleMapOutput)
}

type EventsToMetricsRuleOutput struct{ *pulumi.OutputState }

func (EventsToMetricsRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventsToMetricsRule)(nil)).Elem()
}

func (o EventsToMetricsRuleOutput) ToEventsToMetricsRuleOutput() EventsToMetricsRuleOutput {
	return o
}

func (o EventsToMetricsRuleOutput) ToEventsToMetricsRuleOutputWithContext(ctx context.Context) EventsToMetricsRuleOutput {
	return o
}

// Account with the event and where the metrics will be put.
func (o EventsToMetricsRuleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Provides additional information about the rule.
func (o EventsToMetricsRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// True means this rule is enabled. False means the rule is currently not creating metrics.
func (o EventsToMetricsRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The name of the rule. This must be unique within an account.
func (o EventsToMetricsRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Explains how to create metrics from events.
func (o EventsToMetricsRuleOutput) Nrql() pulumi.StringOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.StringOutput { return v.Nrql }).(pulumi.StringOutput)
}

// The id, uniquely identifying the rule.
func (o EventsToMetricsRuleOutput) RuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventsToMetricsRule) pulumi.StringOutput { return v.RuleId }).(pulumi.StringOutput)
}

type EventsToMetricsRuleArrayOutput struct{ *pulumi.OutputState }

func (EventsToMetricsRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventsToMetricsRule)(nil)).Elem()
}

func (o EventsToMetricsRuleArrayOutput) ToEventsToMetricsRuleArrayOutput() EventsToMetricsRuleArrayOutput {
	return o
}

func (o EventsToMetricsRuleArrayOutput) ToEventsToMetricsRuleArrayOutputWithContext(ctx context.Context) EventsToMetricsRuleArrayOutput {
	return o
}

func (o EventsToMetricsRuleArrayOutput) Index(i pulumi.IntInput) EventsToMetricsRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventsToMetricsRule {
		return vs[0].([]*EventsToMetricsRule)[vs[1].(int)]
	}).(EventsToMetricsRuleOutput)
}

type EventsToMetricsRuleMapOutput struct{ *pulumi.OutputState }

func (EventsToMetricsRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventsToMetricsRule)(nil)).Elem()
}

func (o EventsToMetricsRuleMapOutput) ToEventsToMetricsRuleMapOutput() EventsToMetricsRuleMapOutput {
	return o
}

func (o EventsToMetricsRuleMapOutput) ToEventsToMetricsRuleMapOutputWithContext(ctx context.Context) EventsToMetricsRuleMapOutput {
	return o
}

func (o EventsToMetricsRuleMapOutput) MapIndex(k pulumi.StringInput) EventsToMetricsRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventsToMetricsRule {
		return vs[0].(map[string]*EventsToMetricsRule)[vs[1].(string)]
	}).(EventsToMetricsRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventsToMetricsRuleInput)(nil)).Elem(), &EventsToMetricsRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventsToMetricsRuleArrayInput)(nil)).Elem(), EventsToMetricsRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventsToMetricsRuleMapInput)(nil)).Elem(), EventsToMetricsRuleMap{})
	pulumi.RegisterOutputType(EventsToMetricsRuleOutput{})
	pulumi.RegisterOutputType(EventsToMetricsRuleArrayOutput{})
	pulumi.RegisterOutputType(EventsToMetricsRuleMapOutput{})
}
