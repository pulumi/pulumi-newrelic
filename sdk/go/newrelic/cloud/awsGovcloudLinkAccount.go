// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

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
//				AccessKeyId:          pulumi.String("access-key-id of aws govcloud account"),
//				AccountId:            pulumi.Int("The New Relic account ID where you want to link the AWS GovCloud account"),
//				AwsAccountId:         pulumi.String("aws govcloud account id"),
//				MetricCollectionMode: pulumi.String("PULL"),
//				SecretAccessKey:      pulumi.String("secret access key of the aws govcloud account"),
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
// Linked AWSGovCloud accounts can be imported using the `id`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo <id>
//
// ```
type AwsGovcloudLinkAccount struct {
	pulumi.CustomResourceState

	// The access key of the AwsGovCloud.
	AccessKeyId pulumi.StringOutput `pulumi:"accessKeyId"`
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The AwsGovCloud account ID.
	AwsAccountId pulumi.StringOutput `pulumi:"awsAccountId"`
	// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
	MetricCollectionMode pulumi.StringPtrOutput `pulumi:"metricCollectionMode"`
	// The linked account name
	Name pulumi.StringOutput `pulumi:"name"`
	// The secret key of the AwsGovCloud.
	SecretAccessKey pulumi.StringOutput `pulumi:"secretAccessKey"`
}

// NewAwsGovcloudLinkAccount registers a new resource with the given unique name, arguments, and options.
func NewAwsGovcloudLinkAccount(ctx *pulumi.Context,
	name string, args *AwsGovcloudLinkAccountArgs, opts ...pulumi.ResourceOption) (*AwsGovcloudLinkAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessKeyId == nil {
		return nil, errors.New("invalid value for required argument 'AccessKeyId'")
	}
	if args.AwsAccountId == nil {
		return nil, errors.New("invalid value for required argument 'AwsAccountId'")
	}
	if args.SecretAccessKey == nil {
		return nil, errors.New("invalid value for required argument 'SecretAccessKey'")
	}
	if args.AccessKeyId != nil {
		args.AccessKeyId = pulumi.ToSecret(args.AccessKeyId).(pulumi.StringInput)
	}
	if args.SecretAccessKey != nil {
		args.SecretAccessKey = pulumi.ToSecret(args.SecretAccessKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessKeyId",
		"secretAccessKey",
	})
	opts = append(opts, secrets)
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
	// The access key of the AwsGovCloud.
	AccessKeyId *string `pulumi:"accessKeyId"`
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The AwsGovCloud account ID.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
	MetricCollectionMode *string `pulumi:"metricCollectionMode"`
	// The linked account name
	Name *string `pulumi:"name"`
	// The secret key of the AwsGovCloud.
	SecretAccessKey *string `pulumi:"secretAccessKey"`
}

type AwsGovcloudLinkAccountState struct {
	// The access key of the AwsGovCloud.
	AccessKeyId pulumi.StringPtrInput
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// The AwsGovCloud account ID.
	AwsAccountId pulumi.StringPtrInput
	// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
	MetricCollectionMode pulumi.StringPtrInput
	// The linked account name
	Name pulumi.StringPtrInput
	// The secret key of the AwsGovCloud.
	SecretAccessKey pulumi.StringPtrInput
}

func (AwsGovcloudLinkAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*awsGovcloudLinkAccountState)(nil)).Elem()
}

type awsGovcloudLinkAccountArgs struct {
	// The access key of the AwsGovCloud.
	AccessKeyId string `pulumi:"accessKeyId"`
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// The AwsGovCloud account ID.
	AwsAccountId string `pulumi:"awsAccountId"`
	// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
	MetricCollectionMode *string `pulumi:"metricCollectionMode"`
	// The linked account name
	Name *string `pulumi:"name"`
	// The secret key of the AwsGovCloud.
	SecretAccessKey string `pulumi:"secretAccessKey"`
}

// The set of arguments for constructing a AwsGovcloudLinkAccount resource.
type AwsGovcloudLinkAccountArgs struct {
	// The access key of the AwsGovCloud.
	AccessKeyId pulumi.StringInput
	// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// The AwsGovCloud account ID.
	AwsAccountId pulumi.StringInput
	// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
	MetricCollectionMode pulumi.StringPtrInput
	// The linked account name
	Name pulumi.StringPtrInput
	// The secret key of the AwsGovCloud.
	SecretAccessKey pulumi.StringInput
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

func (i *AwsGovcloudLinkAccount) ToOutput(ctx context.Context) pulumix.Output[*AwsGovcloudLinkAccount] {
	return pulumix.Output[*AwsGovcloudLinkAccount]{
		OutputState: i.ToAwsGovcloudLinkAccountOutputWithContext(ctx).OutputState,
	}
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

func (i AwsGovcloudLinkAccountArray) ToOutput(ctx context.Context) pulumix.Output[[]*AwsGovcloudLinkAccount] {
	return pulumix.Output[[]*AwsGovcloudLinkAccount]{
		OutputState: i.ToAwsGovcloudLinkAccountArrayOutputWithContext(ctx).OutputState,
	}
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

func (i AwsGovcloudLinkAccountMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*AwsGovcloudLinkAccount] {
	return pulumix.Output[map[string]*AwsGovcloudLinkAccount]{
		OutputState: i.ToAwsGovcloudLinkAccountMapOutputWithContext(ctx).OutputState,
	}
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

func (o AwsGovcloudLinkAccountOutput) ToOutput(ctx context.Context) pulumix.Output[*AwsGovcloudLinkAccount] {
	return pulumix.Output[*AwsGovcloudLinkAccount]{
		OutputState: o.OutputState,
	}
}

// The access key of the AwsGovCloud.
func (o AwsGovcloudLinkAccountOutput) AccessKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.AccessKeyId }).(pulumi.StringOutput)
}

// The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
func (o AwsGovcloudLinkAccountOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// The AwsGovCloud account ID.
func (o AwsGovcloudLinkAccountOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.AwsAccountId }).(pulumi.StringOutput)
}

// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
func (o AwsGovcloudLinkAccountOutput) MetricCollectionMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringPtrOutput { return v.MetricCollectionMode }).(pulumi.StringPtrOutput)
}

// The linked account name
func (o AwsGovcloudLinkAccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The secret key of the AwsGovCloud.
func (o AwsGovcloudLinkAccountOutput) SecretAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsGovcloudLinkAccount) pulumi.StringOutput { return v.SecretAccessKey }).(pulumi.StringOutput)
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

func (o AwsGovcloudLinkAccountArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*AwsGovcloudLinkAccount] {
	return pulumix.Output[[]*AwsGovcloudLinkAccount]{
		OutputState: o.OutputState,
	}
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

func (o AwsGovcloudLinkAccountMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*AwsGovcloudLinkAccount] {
	return pulumix.Output[map[string]*AwsGovcloudLinkAccount]{
		OutputState: o.OutputState,
	}
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
