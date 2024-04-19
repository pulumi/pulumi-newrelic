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

// Use this resource to create, update and delete New Relic Obfuscation Expressions.
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
//			_, err := newrelic.NewObfuscationExpression(ctx, "foo", &newrelic.ObfuscationExpressionArgs{
//				AccountId:   pulumi.Int(12345),
//				Description: pulumi.String("The description"),
//				Regex:       pulumi.String("(regex.*)"),
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
// New Relic obfuscation expression can be imported using the expression ID, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
// ```
type ObfuscationExpression struct {
	pulumi.CustomResourceState

	// The account id associated with the obfuscation expression.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Description of expression.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of expression.
	Name pulumi.StringOutput `pulumi:"name"`
	// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
	Regex pulumi.StringOutput `pulumi:"regex"`
}

// NewObfuscationExpression registers a new resource with the given unique name, arguments, and options.
func NewObfuscationExpression(ctx *pulumi.Context,
	name string, args *ObfuscationExpressionArgs, opts ...pulumi.ResourceOption) (*ObfuscationExpression, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Regex == nil {
		return nil, errors.New("invalid value for required argument 'Regex'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ObfuscationExpression
	err := ctx.RegisterResource("newrelic:index/obfuscationExpression:ObfuscationExpression", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObfuscationExpression gets an existing ObfuscationExpression resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObfuscationExpression(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObfuscationExpressionState, opts ...pulumi.ResourceOption) (*ObfuscationExpression, error) {
	var resource ObfuscationExpression
	err := ctx.ReadResource("newrelic:index/obfuscationExpression:ObfuscationExpression", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObfuscationExpression resources.
type obfuscationExpressionState struct {
	// The account id associated with the obfuscation expression.
	AccountId *int `pulumi:"accountId"`
	// Description of expression.
	Description *string `pulumi:"description"`
	// Name of expression.
	Name *string `pulumi:"name"`
	// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
	Regex *string `pulumi:"regex"`
}

type ObfuscationExpressionState struct {
	// The account id associated with the obfuscation expression.
	AccountId pulumi.IntPtrInput
	// Description of expression.
	Description pulumi.StringPtrInput
	// Name of expression.
	Name pulumi.StringPtrInput
	// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
	Regex pulumi.StringPtrInput
}

func (ObfuscationExpressionState) ElementType() reflect.Type {
	return reflect.TypeOf((*obfuscationExpressionState)(nil)).Elem()
}

type obfuscationExpressionArgs struct {
	// The account id associated with the obfuscation expression.
	AccountId *int `pulumi:"accountId"`
	// Description of expression.
	Description *string `pulumi:"description"`
	// Name of expression.
	Name *string `pulumi:"name"`
	// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
	Regex string `pulumi:"regex"`
}

// The set of arguments for constructing a ObfuscationExpression resource.
type ObfuscationExpressionArgs struct {
	// The account id associated with the obfuscation expression.
	AccountId pulumi.IntPtrInput
	// Description of expression.
	Description pulumi.StringPtrInput
	// Name of expression.
	Name pulumi.StringPtrInput
	// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
	Regex pulumi.StringInput
}

func (ObfuscationExpressionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*obfuscationExpressionArgs)(nil)).Elem()
}

type ObfuscationExpressionInput interface {
	pulumi.Input

	ToObfuscationExpressionOutput() ObfuscationExpressionOutput
	ToObfuscationExpressionOutputWithContext(ctx context.Context) ObfuscationExpressionOutput
}

func (*ObfuscationExpression) ElementType() reflect.Type {
	return reflect.TypeOf((**ObfuscationExpression)(nil)).Elem()
}

func (i *ObfuscationExpression) ToObfuscationExpressionOutput() ObfuscationExpressionOutput {
	return i.ToObfuscationExpressionOutputWithContext(context.Background())
}

func (i *ObfuscationExpression) ToObfuscationExpressionOutputWithContext(ctx context.Context) ObfuscationExpressionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationExpressionOutput)
}

// ObfuscationExpressionArrayInput is an input type that accepts ObfuscationExpressionArray and ObfuscationExpressionArrayOutput values.
// You can construct a concrete instance of `ObfuscationExpressionArrayInput` via:
//
//	ObfuscationExpressionArray{ ObfuscationExpressionArgs{...} }
type ObfuscationExpressionArrayInput interface {
	pulumi.Input

	ToObfuscationExpressionArrayOutput() ObfuscationExpressionArrayOutput
	ToObfuscationExpressionArrayOutputWithContext(context.Context) ObfuscationExpressionArrayOutput
}

type ObfuscationExpressionArray []ObfuscationExpressionInput

func (ObfuscationExpressionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObfuscationExpression)(nil)).Elem()
}

func (i ObfuscationExpressionArray) ToObfuscationExpressionArrayOutput() ObfuscationExpressionArrayOutput {
	return i.ToObfuscationExpressionArrayOutputWithContext(context.Background())
}

func (i ObfuscationExpressionArray) ToObfuscationExpressionArrayOutputWithContext(ctx context.Context) ObfuscationExpressionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationExpressionArrayOutput)
}

// ObfuscationExpressionMapInput is an input type that accepts ObfuscationExpressionMap and ObfuscationExpressionMapOutput values.
// You can construct a concrete instance of `ObfuscationExpressionMapInput` via:
//
//	ObfuscationExpressionMap{ "key": ObfuscationExpressionArgs{...} }
type ObfuscationExpressionMapInput interface {
	pulumi.Input

	ToObfuscationExpressionMapOutput() ObfuscationExpressionMapOutput
	ToObfuscationExpressionMapOutputWithContext(context.Context) ObfuscationExpressionMapOutput
}

type ObfuscationExpressionMap map[string]ObfuscationExpressionInput

func (ObfuscationExpressionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObfuscationExpression)(nil)).Elem()
}

func (i ObfuscationExpressionMap) ToObfuscationExpressionMapOutput() ObfuscationExpressionMapOutput {
	return i.ToObfuscationExpressionMapOutputWithContext(context.Background())
}

func (i ObfuscationExpressionMap) ToObfuscationExpressionMapOutputWithContext(ctx context.Context) ObfuscationExpressionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObfuscationExpressionMapOutput)
}

type ObfuscationExpressionOutput struct{ *pulumi.OutputState }

func (ObfuscationExpressionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObfuscationExpression)(nil)).Elem()
}

func (o ObfuscationExpressionOutput) ToObfuscationExpressionOutput() ObfuscationExpressionOutput {
	return o
}

func (o ObfuscationExpressionOutput) ToObfuscationExpressionOutputWithContext(ctx context.Context) ObfuscationExpressionOutput {
	return o
}

// The account id associated with the obfuscation expression.
func (o ObfuscationExpressionOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *ObfuscationExpression) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Description of expression.
func (o ObfuscationExpressionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObfuscationExpression) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of expression.
func (o ObfuscationExpressionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ObfuscationExpression) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
func (o ObfuscationExpressionOutput) Regex() pulumi.StringOutput {
	return o.ApplyT(func(v *ObfuscationExpression) pulumi.StringOutput { return v.Regex }).(pulumi.StringOutput)
}

type ObfuscationExpressionArrayOutput struct{ *pulumi.OutputState }

func (ObfuscationExpressionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObfuscationExpression)(nil)).Elem()
}

func (o ObfuscationExpressionArrayOutput) ToObfuscationExpressionArrayOutput() ObfuscationExpressionArrayOutput {
	return o
}

func (o ObfuscationExpressionArrayOutput) ToObfuscationExpressionArrayOutputWithContext(ctx context.Context) ObfuscationExpressionArrayOutput {
	return o
}

func (o ObfuscationExpressionArrayOutput) Index(i pulumi.IntInput) ObfuscationExpressionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObfuscationExpression {
		return vs[0].([]*ObfuscationExpression)[vs[1].(int)]
	}).(ObfuscationExpressionOutput)
}

type ObfuscationExpressionMapOutput struct{ *pulumi.OutputState }

func (ObfuscationExpressionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObfuscationExpression)(nil)).Elem()
}

func (o ObfuscationExpressionMapOutput) ToObfuscationExpressionMapOutput() ObfuscationExpressionMapOutput {
	return o
}

func (o ObfuscationExpressionMapOutput) ToObfuscationExpressionMapOutputWithContext(ctx context.Context) ObfuscationExpressionMapOutput {
	return o
}

func (o ObfuscationExpressionMapOutput) MapIndex(k pulumi.StringInput) ObfuscationExpressionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObfuscationExpression {
		return vs[0].(map[string]*ObfuscationExpression)[vs[1].(string)]
	}).(ObfuscationExpressionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationExpressionInput)(nil)).Elem(), &ObfuscationExpression{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationExpressionArrayInput)(nil)).Elem(), ObfuscationExpressionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObfuscationExpressionMapInput)(nil)).Elem(), ObfuscationExpressionMap{})
	pulumi.RegisterOutputType(ObfuscationExpressionOutput{})
	pulumi.RegisterOutputType(ObfuscationExpressionArrayOutput{})
	pulumi.RegisterOutputType(ObfuscationExpressionMapOutput{})
}
