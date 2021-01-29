// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this resource to create, update, and delete New Relic Events to Metrics rules.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v3/go/newrelic/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := newrelic.NewEventsToMetricsRule(ctx, "foo", &newrelic.EventsToMetricsRuleArgs{
// 			AccountId:   pulumi.Int(12345),
// 			Description: pulumi.String("Example description"),
// 			Nrql:        pulumi.String("SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name"),
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
// New Relic Events to Metrics rules can be imported using a concatenated string of the format
//
// `<account_id>:<rule_id>`, e.g. bash
//
// ```sh
//  $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
// ```
type EventsToMetricsRule struct {
	pulumi.CustomResourceState

	// Account with the event and where the metrics will be put.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
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
	AccountId *int `pulumi:"accountId"`
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
	AccountId pulumi.IntPtrInput
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
	AccountId *int `pulumi:"accountId"`
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
	AccountId pulumi.IntPtrInput
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
	return reflect.TypeOf((*EventsToMetricsRule)(nil))
}

func (i *EventsToMetricsRule) ToEventsToMetricsRuleOutput() EventsToMetricsRuleOutput {
	return i.ToEventsToMetricsRuleOutputWithContext(context.Background())
}

func (i *EventsToMetricsRule) ToEventsToMetricsRuleOutputWithContext(ctx context.Context) EventsToMetricsRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventsToMetricsRuleOutput)
}

type EventsToMetricsRuleOutput struct {
	*pulumi.OutputState
}

func (EventsToMetricsRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventsToMetricsRule)(nil))
}

func (o EventsToMetricsRuleOutput) ToEventsToMetricsRuleOutput() EventsToMetricsRuleOutput {
	return o
}

func (o EventsToMetricsRuleOutput) ToEventsToMetricsRuleOutputWithContext(ctx context.Context) EventsToMetricsRuleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(EventsToMetricsRuleOutput{})
}
