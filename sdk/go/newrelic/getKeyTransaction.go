// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific key transaction in New Relic that already exists.
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
//			txn, err := newrelic.LookupKeyTransaction(ctx, &newrelic.LookupKeyTransactionArgs{
//				Name: "txn",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			foo, err := newrelic.NewAlertPolicy(ctx, "foo", &newrelic.AlertPolicyArgs{
//				Name: pulumi.String("foo"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewAlertCondition(ctx, "foo", &newrelic.AlertConditionArgs{
//				PolicyId: foo.ID(),
//				Name:     pulumi.String("foo"),
//				Type:     pulumi.String("apm_kt_metric"),
//				Entities: pulumi.StringArray{
//					pulumi.String(txn.Id),
//				},
//				Metric:     pulumi.String("error_percentage"),
//				RunbookUrl: pulumi.String("https://www.example.com"),
//				Terms: newrelic.AlertConditionTermArray{
//					&newrelic.AlertConditionTermArgs{
//						Duration:     pulumi.Int(5),
//						Operator:     pulumi.String("below"),
//						Priority:     pulumi.String("critical"),
//						Threshold:    pulumi.Float64(0.75),
//						TimeFunction: pulumi.String("all"),
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
func LookupKeyTransaction(ctx *pulumi.Context, args *LookupKeyTransactionArgs, opts ...pulumi.InvokeOption) (*LookupKeyTransactionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKeyTransactionResult
	err := ctx.Invoke("newrelic:index/getKeyTransaction:getKeyTransaction", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKeyTransaction.
type LookupKeyTransactionArgs struct {
	// The account ID you would like to search for key transactions in. Defaults to `accountId` in the `provider{}` (or `NEW_RELIC_ACCOUNT_ID` in your environment) if not specified.
	//
	// > **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
	AccountId *string `pulumi:"accountId"`
	// GUID of the key transaction in New Relic.
	Guid *string `pulumi:"guid"`
	// The name of the key transaction in New Relic.
	Name string `pulumi:"name"`
}

// A collection of values returned by getKeyTransaction.
type LookupKeyTransactionResult struct {
	AccountId string `pulumi:"accountId"`
	// Domain of the key transaction in New Relic.
	Domain string `pulumi:"domain"`
	// GUID of the key transaction in New Relic.
	Guid string `pulumi:"guid"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Type of the key transaction in New Relic.
	Type string `pulumi:"type"`
}

func LookupKeyTransactionOutput(ctx *pulumi.Context, args LookupKeyTransactionOutputArgs, opts ...pulumi.InvokeOption) LookupKeyTransactionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupKeyTransactionResultOutput, error) {
			args := v.(LookupKeyTransactionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("newrelic:index/getKeyTransaction:getKeyTransaction", args, LookupKeyTransactionResultOutput{}, options).(LookupKeyTransactionResultOutput), nil
		}).(LookupKeyTransactionResultOutput)
}

// A collection of arguments for invoking getKeyTransaction.
type LookupKeyTransactionOutputArgs struct {
	// The account ID you would like to search for key transactions in. Defaults to `accountId` in the `provider{}` (or `NEW_RELIC_ACCOUNT_ID` in your environment) if not specified.
	//
	// > **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// GUID of the key transaction in New Relic.
	Guid pulumi.StringPtrInput `pulumi:"guid"`
	// The name of the key transaction in New Relic.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupKeyTransactionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyTransactionArgs)(nil)).Elem()
}

// A collection of values returned by getKeyTransaction.
type LookupKeyTransactionResultOutput struct{ *pulumi.OutputState }

func (LookupKeyTransactionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyTransactionResult)(nil)).Elem()
}

func (o LookupKeyTransactionResultOutput) ToLookupKeyTransactionResultOutput() LookupKeyTransactionResultOutput {
	return o
}

func (o LookupKeyTransactionResultOutput) ToLookupKeyTransactionResultOutputWithContext(ctx context.Context) LookupKeyTransactionResultOutput {
	return o
}

func (o LookupKeyTransactionResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Domain of the key transaction in New Relic.
func (o LookupKeyTransactionResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.Domain }).(pulumi.StringOutput)
}

// GUID of the key transaction in New Relic.
func (o LookupKeyTransactionResultOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.Guid }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKeyTransactionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupKeyTransactionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Type of the key transaction in New Relic.
func (o LookupKeyTransactionResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyTransactionResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKeyTransactionResultOutput{})
}
