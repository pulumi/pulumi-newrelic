// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific Obfuscation Expression in New Relic that already exists.
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
//			expression, err := newrelic.LookupObfuscationExpression(ctx, &newrelic.LookupObfuscationExpressionArgs{
//				AccountId: pulumi.StringRef("123456"),
//				Name:      "The expression",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewObfuscationRule(ctx, "rule", &newrelic.ObfuscationRuleArgs{
//				Name:        pulumi.String("ruleName"),
//				Description: pulumi.String("description of the rule"),
//				Filter:      pulumi.String("hostStatus=running"),
//				Enabled:     pulumi.Bool(true),
//				Actions: newrelic.ObfuscationRuleActionArray{
//					&newrelic.ObfuscationRuleActionArgs{
//						Attributes: pulumi.StringArray{
//							pulumi.String("message"),
//						},
//						ExpressionId: pulumi.String(expression.Id),
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
func LookupObfuscationExpression(ctx *pulumi.Context, args *LookupObfuscationExpressionArgs, opts ...pulumi.InvokeOption) (*LookupObfuscationExpressionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupObfuscationExpressionResult
	err := ctx.Invoke("newrelic:index/getObfuscationExpression:getObfuscationExpression", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getObfuscationExpression.
type LookupObfuscationExpressionArgs struct {
	// The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
	AccountId *string `pulumi:"accountId"`
	// Name of expression.
	Name string `pulumi:"name"`
}

// A collection of values returned by getObfuscationExpression.
type LookupObfuscationExpressionResult struct {
	AccountId *string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupObfuscationExpressionOutput(ctx *pulumi.Context, args LookupObfuscationExpressionOutputArgs, opts ...pulumi.InvokeOption) LookupObfuscationExpressionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupObfuscationExpressionResultOutput, error) {
			args := v.(LookupObfuscationExpressionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("newrelic:index/getObfuscationExpression:getObfuscationExpression", args, LookupObfuscationExpressionResultOutput{}, options).(LookupObfuscationExpressionResultOutput), nil
		}).(LookupObfuscationExpressionResultOutput)
}

// A collection of arguments for invoking getObfuscationExpression.
type LookupObfuscationExpressionOutputArgs struct {
	// The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// Name of expression.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupObfuscationExpressionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupObfuscationExpressionArgs)(nil)).Elem()
}

// A collection of values returned by getObfuscationExpression.
type LookupObfuscationExpressionResultOutput struct{ *pulumi.OutputState }

func (LookupObfuscationExpressionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupObfuscationExpressionResult)(nil)).Elem()
}

func (o LookupObfuscationExpressionResultOutput) ToLookupObfuscationExpressionResultOutput() LookupObfuscationExpressionResultOutput {
	return o
}

func (o LookupObfuscationExpressionResultOutput) ToLookupObfuscationExpressionResultOutputWithContext(ctx context.Context) LookupObfuscationExpressionResultOutput {
	return o
}

func (o LookupObfuscationExpressionResultOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupObfuscationExpressionResult) *string { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupObfuscationExpressionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupObfuscationExpressionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupObfuscationExpressionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupObfuscationExpressionResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupObfuscationExpressionResultOutput{})
}
