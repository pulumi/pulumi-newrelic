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

// Use this data source to get information about a specific account in New Relic.
// Accounts can be located by ID or name.  At most one of the two attributes can
// be provided. If neither are provided, the provider's `accountId` will be used.
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
//			_, err := newrelic.GetAccount(ctx, &newrelic.GetAccountArgs{
//				Scope: pulumi.StringRef("global"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAccount(ctx *pulumi.Context, args *GetAccountArgs, opts ...pulumi.InvokeOption) (*GetAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountResult
	err := ctx.Invoke("newrelic:index/getAccount:getAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccount.
type GetAccountArgs struct {
	// The account ID in New Relic.
	AccountId *int `pulumi:"accountId"`
	// The account name in New Relic.
	Name *string `pulumi:"name"`
	// The scope of the account in New Relic.  Valid values are "global" and "inRegion".  Defaults to "inRegion".
	Scope *string `pulumi:"scope"`
}

// A collection of values returned by getAccount.
type GetAccountResult struct {
	AccountId *int `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id    string  `pulumi:"id"`
	Name  *string `pulumi:"name"`
	Scope *string `pulumi:"scope"`
}

func GetAccountOutput(ctx *pulumi.Context, args GetAccountOutputArgs, opts ...pulumi.InvokeOption) GetAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccountResult, error) {
			args := v.(GetAccountArgs)
			r, err := GetAccount(ctx, &args, opts...)
			var s GetAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAccountResultOutput)
}

// A collection of arguments for invoking getAccount.
type GetAccountOutputArgs struct {
	// The account ID in New Relic.
	AccountId pulumi.IntPtrInput `pulumi:"accountId"`
	// The account name in New Relic.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The scope of the account in New Relic.  Valid values are "global" and "inRegion".  Defaults to "inRegion".
	Scope pulumi.StringPtrInput `pulumi:"scope"`
}

func (GetAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountArgs)(nil)).Elem()
}

// A collection of values returned by getAccount.
type GetAccountResultOutput struct{ *pulumi.OutputState }

func (GetAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountResult)(nil)).Elem()
}

func (o GetAccountResultOutput) ToGetAccountResultOutput() GetAccountResultOutput {
	return o
}

func (o GetAccountResultOutput) ToGetAccountResultOutputWithContext(ctx context.Context) GetAccountResultOutput {
	return o
}

func (o GetAccountResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAccountResult] {
	return pulumix.Output[GetAccountResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAccountResultOutput) AccountId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetAccountResult) *int { return v.AccountId }).(pulumi.IntPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccountResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetAccountResultOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountResult) *string { return v.Scope }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountResultOutput{})
}
