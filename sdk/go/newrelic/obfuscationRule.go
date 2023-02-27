// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update and delete New Relic Obfuscation Rule.
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
//			bar, err := newrelic.NewObfuscationExpression(ctx, "bar", &newrelic.ObfuscationExpressionArgs{
//				Description: pulumi.String("description of the expression"),
//				Regex:       pulumi.String("(^http)"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewObfuscationRule(ctx, "foo", &newrelic.ObfuscationRuleArgs{
//				Description: pulumi.String("description of the rule"),
//				Filter:      pulumi.String("hostStatus=running"),
//				Enabled:     pulumi.Bool(true),
//				Actions: newrelic.ObfuscationRuleActionArray{
//					&newrelic.ObfuscationRuleActionArgs{
//						Attributes: pulumi.StringArray{
//							pulumi.String("message"),
//						},
//						ExpressionId: bar.ID(),
//						Method:       pulumi.String("MASK"),
//					},
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
// New Relic obfuscation rule can be imported using the rule ID, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:index/obfuscationRule:ObfuscationRule foo 34567
//
// ```
type ObfuscationRule struct {
	pulumi.CustomResourceState

	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Actions for the rule. The actions will be applied in the order specified by this list.
	Actions ObfuscationRuleActionArrayOutput `pulumi:"actions"`
	// Description of rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// NRQL for determining whether a given log record should have obfuscation actions applied.
	Filter pulumi.StringOutput `pulumi:"filter"`
	// Name of rule.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewObfuscationRule registers a new resource with the given unique name, arguments, and options.
func NewObfuscationRule(ctx *pulumi.Context,
	name string, args *ObfuscationRuleArgs, opts ...pulumi.ResourceOption) (*ObfuscationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	var resource ObfuscationRule
	err := ctx.RegisterResource("newrelic:index/obfuscationRule:ObfuscationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObfuscationRule gets an existing ObfuscationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObfuscationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObfuscationRuleState, opts ...pulumi.ResourceOption) (*ObfuscationRule, error) {
	var resource ObfuscationRule
	err := ctx.ReadResource("newrelic:index/obfuscationRule:ObfuscationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObfuscationRule resources.
type obfuscationRuleState struct {
	// The account id associated with the obfuscation rule.
	AccountId *int `pulumi:"accountId"`
	// Actions for the rule. The actions will be applied in the order specified by this list.
	Actions []ObfuscationRuleAction `pulumi:"actions"`
	// Description of rule.
	Description *string `pulumi:"description"`
	// Whether the rule should be applied or not to incoming data.
	Enabled *bool `pulumi:"enabled"`
	// NRQL for determining whether a given log record should have obfuscation actions applied.
	Filter *string `pulumi:"filter"`
	// Name of rule.
	Name *string `pulumi:"name"`
}

type ObfuscationRuleState struct {
	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntPtrInput
	// Actions for the rule. The actions will be applied in the order specified by this list.
	Actions ObfuscationRuleActionArrayInput
	// Description of rule.
	Description pulumi.StringPtrInput
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolPtrInput
	// NRQL for determining whether a given log record should have obfuscation actions applied.
	Filter pulumi.StringPtrInput
	// Name of rule.
	Name pulumi.StringPtrInput
}

func (ObfuscationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*obfuscationRuleState)(nil)).Elem()
}

type obfuscationRuleArgs struct {
	// The account id associated with the obfuscation rule.
	AccountId *int `pulumi:"accountId"`
	// Actions for the rule. The actions will be applied in the order specified by this list.
	Actions []ObfuscationRuleAction `pulumi:"actions"`
	// Description of rule.
	Description *string `pulumi:"description"`
	// Whether the rule should be applied or not to incoming data.
	Enabled bool `pulumi:"enabled"`
	// NRQL for determining whether a given log record should have obfuscation actions applied.
	Filter string `pulumi:"filter"`
	// Name of rule.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ObfuscationRule resource.
type ObfuscationRuleArgs struct {
	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntPtrInput
	// Actions for the rule. The actions will be applied in the order specified by this list.
	Actions ObfuscationRuleActionArrayInput
	// Description of rule.
	Description pulumi.StringPtrInput
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolInput
	// NRQL for determining whether a given log record should have obfuscation actions applied.
	Filter pulumi.StringInput
	// Name of rule.
	Name pulumi.StringPtrInput
}

func (ObfuscationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*obfuscationRuleArgs)(nil)).Elem()
}

type ObfuscationRuleInput interface {
	pulumi.Input

	ToObfuscationRuleOutput() ObfuscationRuleOutput
	ToObfuscationRuleOutputWithContext(ctx context.Context) ObfuscationRuleOutput
}

func (*ObfuscationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ObfuscationRule)(nil)).Elem()
}

func (i *ObfuscationRule) ToObfuscationRuleOutput() ObfuscationRuleOutput {
	return i.ToObfuscationRuleOutputWithContext(context.Background())
}

func (i *ObfuscationRule) ToObfuscationRuleOutputWithContext(ctx context.Context) ObfuscationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationRuleOutput)
}

// ObfuscationRuleArrayInput is an input type that accepts ObfuscationRuleArray and ObfuscationRuleArrayOutput values.
// You can construct a concrete instance of `ObfuscationRuleArrayInput` via:
//
//	ObfuscationRuleArray{ ObfuscationRuleArgs{...} }
type ObfuscationRuleArrayInput interface {
	pulumi.Input

	ToObfuscationRuleArrayOutput() ObfuscationRuleArrayOutput
	ToObfuscationRuleArrayOutputWithContext(context.Context) ObfuscationRuleArrayOutput
}

type ObfuscationRuleArray []ObfuscationRuleInput

func (ObfuscationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObfuscationRule)(nil)).Elem()
}

func (i ObfuscationRuleArray) ToObfuscationRuleArrayOutput() ObfuscationRuleArrayOutput {
	return i.ToObfuscationRuleArrayOutputWithContext(context.Background())
}

func (i ObfuscationRuleArray) ToObfuscationRuleArrayOutputWithContext(ctx context.Context) ObfuscationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationRuleArrayOutput)
}

// ObfuscationRuleMapInput is an input type that accepts ObfuscationRuleMap and ObfuscationRuleMapOutput values.
// You can construct a concrete instance of `ObfuscationRuleMapInput` via:
//
//	ObfuscationRuleMap{ "key": ObfuscationRuleArgs{...} }
type ObfuscationRuleMapInput interface {
	pulumi.Input

	ToObfuscationRuleMapOutput() ObfuscationRuleMapOutput
	ToObfuscationRuleMapOutputWithContext(context.Context) ObfuscationRuleMapOutput
}

type ObfuscationRuleMap map[string]ObfuscationRuleInput

func (ObfuscationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObfuscationRule)(nil)).Elem()
}

func (i ObfuscationRuleMap) ToObfuscationRuleMapOutput() ObfuscationRuleMapOutput {
	return i.ToObfuscationRuleMapOutputWithContext(context.Background())
}

func (i ObfuscationRuleMap) ToObfuscationRuleMapOutputWithContext(ctx context.Context) ObfuscationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationRuleMapOutput)
}

type ObfuscationRuleOutput struct{ *pulumi.OutputState }

func (ObfuscationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObfuscationRule)(nil)).Elem()
}

func (o ObfuscationRuleOutput) ToObfuscationRuleOutput() ObfuscationRuleOutput {
	return o
}

func (o ObfuscationRuleOutput) ToObfuscationRuleOutputWithContext(ctx context.Context) ObfuscationRuleOutput {
	return o
}

// The account id associated with the obfuscation rule.
func (o ObfuscationRuleOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *ObfuscationRule) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Actions for the rule. The actions will be applied in the order specified by this list.
func (o ObfuscationRuleOutput) Actions() ObfuscationRuleActionArrayOutput {
	return o.ApplyT(func(v *ObfuscationRule) ObfuscationRuleActionArrayOutput { return v.Actions }).(ObfuscationRuleActionArrayOutput)
}

// Description of rule.
func (o ObfuscationRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObfuscationRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the rule should be applied or not to incoming data.
func (o ObfuscationRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ObfuscationRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// NRQL for determining whether a given log record should have obfuscation actions applied.
func (o ObfuscationRuleOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *ObfuscationRule) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

// Name of rule.
func (o ObfuscationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ObfuscationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ObfuscationRuleArrayOutput struct{ *pulumi.OutputState }

func (ObfuscationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObfuscationRule)(nil)).Elem()
}

func (o ObfuscationRuleArrayOutput) ToObfuscationRuleArrayOutput() ObfuscationRuleArrayOutput {
	return o
}

func (o ObfuscationRuleArrayOutput) ToObfuscationRuleArrayOutputWithContext(ctx context.Context) ObfuscationRuleArrayOutput {
	return o
}

func (o ObfuscationRuleArrayOutput) Index(i pulumi.IntInput) ObfuscationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObfuscationRule {
		return vs[0].([]*ObfuscationRule)[vs[1].(int)]
	}).(ObfuscationRuleOutput)
}

type ObfuscationRuleMapOutput struct{ *pulumi.OutputState }

func (ObfuscationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObfuscationRule)(nil)).Elem()
}

func (o ObfuscationRuleMapOutput) ToObfuscationRuleMapOutput() ObfuscationRuleMapOutput {
	return o
}

func (o ObfuscationRuleMapOutput) ToObfuscationRuleMapOutputWithContext(ctx context.Context) ObfuscationRuleMapOutput {
	return o
}

func (o ObfuscationRuleMapOutput) MapIndex(k pulumi.StringInput) ObfuscationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObfuscationRule {
		return vs[0].(map[string]*ObfuscationRule)[vs[1].(string)]
	}).(ObfuscationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationRuleInput)(nil)).Elem(), &ObfuscationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationRuleArrayInput)(nil)).Elem(), ObfuscationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationRuleMapInput)(nil)).Elem(), ObfuscationRuleMap{})
	pulumi.RegisterOutputType(ObfuscationRuleOutput{})
	pulumi.RegisterOutputType(ObfuscationRuleArrayOutput{})
	pulumi.RegisterOutputType(ObfuscationRuleMapOutput{})
}