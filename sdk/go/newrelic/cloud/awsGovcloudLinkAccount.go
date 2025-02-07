// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to link an AWS GovCloud account to New Relic.
//
// ## Prerequisite
//
// To link an AWS GovCloud account to New Relic, you need an AWS GovCloud account. AWS GovCloud is designed to address the specific regulatory needs of United States federal, state, and local agencies, educational institutions, and their supporting ecosystem. It is an isolated AWS region designed to host sensitive data and regulated workloads in the cloud, helping customers support their US government compliance requirements.
//
// To pull data from AWS GovCloud, follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/get-started/connect-aws-govcloud-new-relic).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/cloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloud.NewAwsGovcloudLinkAccount(ctx, "foo", &cloud.AwsGovcloudLinkAccountArgs{
//				AccountId:            pulumi.String("1234567"),
//				Name:                 pulumi.String("My New Relic - AWS GovCloud Linked Account"),
//				MetricCollectionMode: pulumi.String("PUSH"),
//				Arn:                  pulumi.String("arn:aws:service:region:account-id:resource-id"),
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
// Linked AWS GovCloud accounts can be imported using the `id`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo <id>
// ```
type AwsGovcloudLinkAccount struct {
	pulumi.CustomResourceState

	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The Amazon Resource Name (ARN) of the IAM role.
	//
	// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
	// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
	MetricCollectionMode pulumi.StringPtrOutput `pulumi:"metricCollectionMode"`
	// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAwsGovcloudLinkAccount registers a new resource with the given unique name, arguments, and options.
func NewAwsGovcloudLinkAccount(ctx *pulumi.Context,
	name string, args *AwsGovcloudLinkAccountArgs, opts ...pulumi.ResourceOption) (*AwsGovcloudLinkAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Arn == nil {
		return nil, errors.New("invalid value for required argument 'Arn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AwsGovcloudLinkAccount
	err := ctx.RegisterResource("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAwsGovcloudLinkAccount gets an existing AwsGovcloudLinkAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAwsGovcloudLinkAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AwsGovcloudLinkAccountState, opts ...pulumi.ResourceOption) (*AwsGovcloudLinkAccount, error) {
	var resource AwsGovcloudLinkAccount
	err := ctx.ReadResource("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AwsGovcloudLinkAccount resources.
type awsGovcloudLinkAccountState struct {
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
	AccountId *string `pulumi:"accountId"`
	// The Amazon Resource Name (ARN) of the IAM role.
	//
	// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
	Arn *string `pulumi:"arn"`
	// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
	// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
	MetricCollectionMode *string `pulumi:"metricCollectionMode"`
	// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
	Name *string `pulumi:"name"`
}

type AwsGovcloudLinkAccountState struct {
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
	AccountId pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the IAM role.
	//
	// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
	Arn pulumi.StringPtrInput
	// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
	// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
	MetricCollectionMode pulumi.StringPtrInput
	// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
	Name pulumi.StringPtrInput
}

func (AwsGovcloudLinkAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*awsGovcloudLinkAccountState)(nil)).Elem()
}

type awsGovcloudLinkAccountArgs struct {
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
	AccountId *string `pulumi:"accountId"`
	// The Amazon Resource Name (ARN) of the IAM role.
	//
	// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
	Arn string `pulumi:"arn"`
	// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
	// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
	MetricCollectionMode *string `pulumi:"metricCollectionMode"`
	// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AwsGovcloudLinkAccount resource.
type AwsGovcloudLinkAccountArgs struct {
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
	AccountId pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the IAM role.
	//
	// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
	Arn pulumi.StringInput
	// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
	// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
	MetricCollectionMode pulumi.StringPtrInput
	// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
	Name pulumi.StringPtrInput
}

func (AwsGovcloudLinkAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*awsGovcloudLinkAccountArgs)(nil)).Elem()
}

type AwsGovcloudLinkAccountInput interface {
	pulumi.Input

	ToAwsGovcloudLinkAccountOutput() AwsGovcloudLinkAccountOutput
	ToAwsGovcloudLinkAccountOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountOutput
}

func (*AwsGovcloudLinkAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsGovcloudLinkAccount)(nil)).Elem()
}

func (i *AwsGovcloudLinkAccount) ToAwsGovcloudLinkAccountOutput() AwsGovcloudLinkAccountOutput {
	return i.ToAwsGovcloudLinkAccountOutputWithContext(context.Background())
}

func (i *AwsGovcloudLinkAccount) ToAwsGovcloudLinkAccountOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsGovcloudLinkAccountOutput)
}

// AwsGovcloudLinkAccountArrayInput is an input type that accepts AwsGovcloudLinkAccountArray and AwsGovcloudLinkAccountArrayOutput values.
// You can construct a concrete instance of `AwsGovcloudLinkAccountArrayInput` via:
//
//	AwsGovcloudLinkAccountArray{ AwsGovcloudLinkAccountArgs{...} }
type AwsGovcloudLinkAccountArrayInput interface {
	pulumi.Input

	ToAwsGovcloudLinkAccountArrayOutput() AwsGovcloudLinkAccountArrayOutput
	ToAwsGovcloudLinkAccountArrayOutputWithContext(context.Context) AwsGovcloudLinkAccountArrayOutput
}

type AwsGovcloudLinkAccountArray []AwsGovcloudLinkAccountInput

func (AwsGovcloudLinkAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsGovcloudLinkAccount)(nil)).Elem()
}

func (i AwsGovcloudLinkAccountArray) ToAwsGovcloudLinkAccountArrayOutput() AwsGovcloudLinkAccountArrayOutput {
	return i.ToAwsGovcloudLinkAccountArrayOutputWithContext(context.Background())
}

func (i AwsGovcloudLinkAccountArray) ToAwsGovcloudLinkAccountArrayOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsGovcloudLinkAccountArrayOutput)
}

// AwsGovcloudLinkAccountMapInput is an input type that accepts AwsGovcloudLinkAccountMap and AwsGovcloudLinkAccountMapOutput values.
// You can construct a concrete instance of `AwsGovcloudLinkAccountMapInput` via:
//
//	AwsGovcloudLinkAccountMap{ "key": AwsGovcloudLinkAccountArgs{...} }
type AwsGovcloudLinkAccountMapInput interface {
	pulumi.Input

	ToAwsGovcloudLinkAccountMapOutput() AwsGovcloudLinkAccountMapOutput
	ToAwsGovcloudLinkAccountMapOutputWithContext(context.Context) AwsGovcloudLinkAccountMapOutput
}

type AwsGovcloudLinkAccountMap map[string]AwsGovcloudLinkAccountInput

func (AwsGovcloudLinkAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsGovcloudLinkAccount)(nil)).Elem()
}

func (i AwsGovcloudLinkAccountMap) ToAwsGovcloudLinkAccountMapOutput() AwsGovcloudLinkAccountMapOutput {
	return i.ToAwsGovcloudLinkAccountMapOutputWithContext(context.Background())
}

func (i AwsGovcloudLinkAccountMap) ToAwsGovcloudLinkAccountMapOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsGovcloudLinkAccountMapOutput)
}

type AwsGovcloudLinkAccountOutput struct{ *pulumi.OutputState }

func (AwsGovcloudLinkAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsGovcloudLinkAccount)(nil)).Elem()
}

func (o AwsGovcloudLinkAccountOutput) ToAwsGovcloudLinkAccountOutput() AwsGovcloudLinkAccountOutput {
	return o
}

func (o AwsGovcloudLinkAccountOutput) ToAwsGovcloudLinkAccountOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountOutput {
	return o
}

// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`, if not specified in the configuration.
func (o AwsGovcloudLinkAccountOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the IAM role.
//
// > **NOTE:** Altering the `accountId` (or) `metricCollectionMode` of an already applied `cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
func (o AwsGovcloudLinkAccountOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The mode by which metric data is to be collected from the linked AWS GovCloud account. Defaults to `PULL`, if not specified in the configuration.
// - Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
func (o AwsGovcloudLinkAccountOutput) MetricCollectionMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringPtrOutput { return v.MetricCollectionMode }).(pulumi.StringPtrOutput)
}

// The name/identifier of the AWS GovCloud - New Relic 'linked' account.
func (o AwsGovcloudLinkAccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type AwsGovcloudLinkAccountArrayOutput struct{ *pulumi.OutputState }

func (AwsGovcloudLinkAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsGovcloudLinkAccount)(nil)).Elem()
}

func (o AwsGovcloudLinkAccountArrayOutput) ToAwsGovcloudLinkAccountArrayOutput() AwsGovcloudLinkAccountArrayOutput {
	return o
}

func (o AwsGovcloudLinkAccountArrayOutput) ToAwsGovcloudLinkAccountArrayOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountArrayOutput {
	return o
}

func (o AwsGovcloudLinkAccountArrayOutput) Index(i pulumi.IntInput) AwsGovcloudLinkAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AwsGovcloudLinkAccount {
		return vs[0].([]*AwsGovcloudLinkAccount)[vs[1].(int)]
	}).(AwsGovcloudLinkAccountOutput)
}

type AwsGovcloudLinkAccountMapOutput struct{ *pulumi.OutputState }

func (AwsGovcloudLinkAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsGovcloudLinkAccount)(nil)).Elem()
}

func (o AwsGovcloudLinkAccountMapOutput) ToAwsGovcloudLinkAccountMapOutput() AwsGovcloudLinkAccountMapOutput {
	return o
}

func (o AwsGovcloudLinkAccountMapOutput) ToAwsGovcloudLinkAccountMapOutputWithContext(ctx context.Context) AwsGovcloudLinkAccountMapOutput {
	return o
}

func (o AwsGovcloudLinkAccountMapOutput) MapIndex(k pulumi.StringInput) AwsGovcloudLinkAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AwsGovcloudLinkAccount {
		return vs[0].(map[string]*AwsGovcloudLinkAccount)[vs[1].(string)]
	}).(AwsGovcloudLinkAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AwsGovcloudLinkAccountInput)(nil)).Elem(), &AwsGovcloudLinkAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsGovcloudLinkAccountArrayInput)(nil)).Elem(), AwsGovcloudLinkAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsGovcloudLinkAccountMapInput)(nil)).Elem(), AwsGovcloudLinkAccountMap{})
	pulumi.RegisterOutputType(AwsGovcloudLinkAccountOutput{})
	pulumi.RegisterOutputType(AwsGovcloudLinkAccountArrayOutput{})
	pulumi.RegisterOutputType(AwsGovcloudLinkAccountMapOutput{})
}
