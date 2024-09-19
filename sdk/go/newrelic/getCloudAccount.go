// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific cloud account linked to New Relic.
// Accounts can be located by a combination of New Relic Account ID, name and cloud provider (aws, gcp, azure, etc). Name and cloud provider are required attributes. If no accountId is specified on the resource the provider level accountId will be used.
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
//			_, err := newrelic.GetCloudAccount(ctx, &newrelic.GetCloudAccountArgs{
//				AccountId:     pulumi.StringRef("12345"),
//				CloudProvider: "aws",
//				Name:          "my aws account",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetCloudAccount(ctx *pulumi.Context, args *GetCloudAccountArgs, opts ...pulumi.InvokeOption) (*GetCloudAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCloudAccountResult
	err := ctx.Invoke("newrelic:index/getCloudAccount:getCloudAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudAccount.
type GetCloudAccountArgs struct {
	// The account ID in New Relic.
	AccountId *string `pulumi:"accountId"`
	// The cloud provider of the account (aws, gcp, azure, etc)
	CloudProvider string `pulumi:"cloudProvider"`
	// The cloud account name in New Relic.
	Name string `pulumi:"name"`
}

// A collection of values returned by getCloudAccount.
type GetCloudAccountResult struct {
	AccountId     *string `pulumi:"accountId"`
	CloudProvider string  `pulumi:"cloudProvider"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func GetCloudAccountOutput(ctx *pulumi.Context, args GetCloudAccountOutputArgs, opts ...pulumi.InvokeOption) GetCloudAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCloudAccountResultOutput, error) {
			args := v.(GetCloudAccountArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetCloudAccountResult
			secret, err := ctx.InvokePackageRaw("newrelic:index/getCloudAccount:getCloudAccount", args, &rv, "", opts...)
			if err != nil {
				return GetCloudAccountResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetCloudAccountResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetCloudAccountResultOutput), nil
			}
			return output, nil
		}).(GetCloudAccountResultOutput)
}

// A collection of arguments for invoking getCloudAccount.
type GetCloudAccountOutputArgs struct {
	// The account ID in New Relic.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// The cloud provider of the account (aws, gcp, azure, etc)
	CloudProvider pulumi.StringInput `pulumi:"cloudProvider"`
	// The cloud account name in New Relic.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetCloudAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCloudAccountArgs)(nil)).Elem()
}

// A collection of values returned by getCloudAccount.
type GetCloudAccountResultOutput struct{ *pulumi.OutputState }

func (GetCloudAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCloudAccountResult)(nil)).Elem()
}

func (o GetCloudAccountResultOutput) ToGetCloudAccountResultOutput() GetCloudAccountResultOutput {
	return o
}

func (o GetCloudAccountResultOutput) ToGetCloudAccountResultOutputWithContext(ctx context.Context) GetCloudAccountResultOutput {
	return o
}

func (o GetCloudAccountResultOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCloudAccountResult) *string { return v.AccountId }).(pulumi.StringPtrOutput)
}

func (o GetCloudAccountResultOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v GetCloudAccountResult) string { return v.CloudProvider }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCloudAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCloudAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCloudAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetCloudAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCloudAccountResultOutput{})
}
