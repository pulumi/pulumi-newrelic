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

func GetTestGrokPattern(ctx *pulumi.Context, args *GetTestGrokPatternArgs, opts ...pulumi.InvokeOption) (*GetTestGrokPatternResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTestGrokPatternResult
	err := ctx.Invoke("newrelic:index/getTestGrokPattern:getTestGrokPattern", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTestGrokPattern.
type GetTestGrokPatternArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The Grok pattern to test.
	Grok string `pulumi:"grok"`
	// The log lines to test the Grok pattern against.
	LogLines []string `pulumi:"logLines"`
}

// A collection of values returned by getTestGrokPattern.
type GetTestGrokPatternResult struct {
	AccountId *int   `pulumi:"accountId"`
	Grok      string `pulumi:"grok"`
	// The provider-assigned unique ID for this managed resource.
	Id       string   `pulumi:"id"`
	LogLines []string `pulumi:"logLines"`
	// Nested attribute containing information about the test of Grok pattern against a list of log lines.
	TestGroks []GetTestGrokPatternTestGrok `pulumi:"testGroks"`
}

func GetTestGrokPatternOutput(ctx *pulumi.Context, args GetTestGrokPatternOutputArgs, opts ...pulumi.InvokeOption) GetTestGrokPatternResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTestGrokPatternResult, error) {
			args := v.(GetTestGrokPatternArgs)
			r, err := GetTestGrokPattern(ctx, &args, opts...)
			var s GetTestGrokPatternResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTestGrokPatternResultOutput)
}

// A collection of arguments for invoking getTestGrokPattern.
type GetTestGrokPatternOutputArgs struct {
	// The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput `pulumi:"accountId"`
	// The Grok pattern to test.
	Grok pulumi.StringInput `pulumi:"grok"`
	// The log lines to test the Grok pattern against.
	LogLines pulumi.StringArrayInput `pulumi:"logLines"`
}

func (GetTestGrokPatternOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTestGrokPatternArgs)(nil)).Elem()
}

// A collection of values returned by getTestGrokPattern.
type GetTestGrokPatternResultOutput struct{ *pulumi.OutputState }

func (GetTestGrokPatternResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTestGrokPatternResult)(nil)).Elem()
}

func (o GetTestGrokPatternResultOutput) ToGetTestGrokPatternResultOutput() GetTestGrokPatternResultOutput {
	return o
}

func (o GetTestGrokPatternResultOutput) ToGetTestGrokPatternResultOutputWithContext(ctx context.Context) GetTestGrokPatternResultOutput {
	return o
}

func (o GetTestGrokPatternResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetTestGrokPatternResult] {
	return pulumix.Output[GetTestGrokPatternResult]{
		OutputState: o.OutputState,
	}
}

func (o GetTestGrokPatternResultOutput) AccountId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetTestGrokPatternResult) *int { return v.AccountId }).(pulumi.IntPtrOutput)
}

func (o GetTestGrokPatternResultOutput) Grok() pulumi.StringOutput {
	return o.ApplyT(func(v GetTestGrokPatternResult) string { return v.Grok }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTestGrokPatternResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTestGrokPatternResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTestGrokPatternResultOutput) LogLines() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTestGrokPatternResult) []string { return v.LogLines }).(pulumi.StringArrayOutput)
}

// Nested attribute containing information about the test of Grok pattern against a list of log lines.
func (o GetTestGrokPatternResultOutput) TestGroks() GetTestGrokPatternTestGrokArrayOutput {
	return o.ApplyT(func(v GetTestGrokPatternResult) []GetTestGrokPatternTestGrok { return v.TestGroks }).(GetTestGrokPatternTestGrokArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTestGrokPatternResultOutput{})
}
