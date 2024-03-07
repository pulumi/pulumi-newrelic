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

// Use this resource to link a GCP account to New Relic.
//
// ## Prerequisite
//
// To start receiving Google Cloud Platform (GCP) data with New Relic GCP integrations, connect your Google project to New Relic infrastructure monitoring. If you don't have one already, create a New Relic account. It's free, forever.
//
// Setup is required in GCP for this resource to work properly. The New Relic GCP integration can be done by creating a user account or a service account.
//
// A user with Project IAM Admin role is needed to add the service account ID as a member in your GCP project.
//
// In the GCP project IAM & admin, the service account must have the Project Viewer role and the Service Usage Consumer role or, alternatively, a custom role.
//
// Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/google-cloud-platform-integrations/get-started/connect-google-cloud-platform-services-new-relic) to set up the integration.
//
// ## Example Usage
//
// You can also use the full example, including the GCP set up, found in our guides.
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := cloud.NewGcpLinkAccount(ctx, "foo", &cloud.GcpLinkAccountArgs{
//				AccountId: pulumi.Int("account id of newrelic account"),
//				ProjectId: pulumi.String("id of the Project"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console.
//
// bash
//
// ```sh
// $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo <id>
// ```
type GcpLinkAccount struct {
	pulumi.CustomResourceState

	// Account ID of the New Relic account.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// name of the linked account
	Name pulumi.StringOutput `pulumi:"name"`
	// Project ID of the GCP account.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewGcpLinkAccount registers a new resource with the given unique name, arguments, and options.
func NewGcpLinkAccount(ctx *pulumi.Context,
	name string, args *GcpLinkAccountArgs, opts ...pulumi.ResourceOption) (*GcpLinkAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GcpLinkAccount
	err := ctx.RegisterResource("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGcpLinkAccount gets an existing GcpLinkAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGcpLinkAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GcpLinkAccountState, opts ...pulumi.ResourceOption) (*GcpLinkAccount, error) {
	var resource GcpLinkAccount
	err := ctx.ReadResource("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GcpLinkAccount resources.
type gcpLinkAccountState struct {
	// Account ID of the New Relic account.
	AccountId *int `pulumi:"accountId"`
	// name of the linked account
	Name *string `pulumi:"name"`
	// Project ID of the GCP account.
	ProjectId *string `pulumi:"projectId"`
}

type GcpLinkAccountState struct {
	// Account ID of the New Relic account.
	AccountId pulumi.IntPtrInput
	// name of the linked account
	Name pulumi.StringPtrInput
	// Project ID of the GCP account.
	ProjectId pulumi.StringPtrInput
}

func (GcpLinkAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpLinkAccountState)(nil)).Elem()
}

type gcpLinkAccountArgs struct {
	// Account ID of the New Relic account.
	AccountId *int `pulumi:"accountId"`
	// name of the linked account
	Name *string `pulumi:"name"`
	// Project ID of the GCP account.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a GcpLinkAccount resource.
type GcpLinkAccountArgs struct {
	// Account ID of the New Relic account.
	AccountId pulumi.IntPtrInput
	// name of the linked account
	Name pulumi.StringPtrInput
	// Project ID of the GCP account.
	ProjectId pulumi.StringInput
}

func (GcpLinkAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpLinkAccountArgs)(nil)).Elem()
}

type GcpLinkAccountInput interface {
	pulumi.Input

	ToGcpLinkAccountOutput() GcpLinkAccountOutput
	ToGcpLinkAccountOutputWithContext(ctx context.Context) GcpLinkAccountOutput
}

func (*GcpLinkAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpLinkAccount)(nil)).Elem()
}

func (i *GcpLinkAccount) ToGcpLinkAccountOutput() GcpLinkAccountOutput {
	return i.ToGcpLinkAccountOutputWithContext(context.Background())
}

func (i *GcpLinkAccount) ToGcpLinkAccountOutputWithContext(ctx context.Context) GcpLinkAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpLinkAccountOutput)
}

// GcpLinkAccountArrayInput is an input type that accepts GcpLinkAccountArray and GcpLinkAccountArrayOutput values.
// You can construct a concrete instance of `GcpLinkAccountArrayInput` via:
//
//	GcpLinkAccountArray{ GcpLinkAccountArgs{...} }
type GcpLinkAccountArrayInput interface {
	pulumi.Input

	ToGcpLinkAccountArrayOutput() GcpLinkAccountArrayOutput
	ToGcpLinkAccountArrayOutputWithContext(context.Context) GcpLinkAccountArrayOutput
}

type GcpLinkAccountArray []GcpLinkAccountInput

func (GcpLinkAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpLinkAccount)(nil)).Elem()
}

func (i GcpLinkAccountArray) ToGcpLinkAccountArrayOutput() GcpLinkAccountArrayOutput {
	return i.ToGcpLinkAccountArrayOutputWithContext(context.Background())
}

func (i GcpLinkAccountArray) ToGcpLinkAccountArrayOutputWithContext(ctx context.Context) GcpLinkAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpLinkAccountArrayOutput)
}

// GcpLinkAccountMapInput is an input type that accepts GcpLinkAccountMap and GcpLinkAccountMapOutput values.
// You can construct a concrete instance of `GcpLinkAccountMapInput` via:
//
//	GcpLinkAccountMap{ "key": GcpLinkAccountArgs{...} }
type GcpLinkAccountMapInput interface {
	pulumi.Input

	ToGcpLinkAccountMapOutput() GcpLinkAccountMapOutput
	ToGcpLinkAccountMapOutputWithContext(context.Context) GcpLinkAccountMapOutput
}

type GcpLinkAccountMap map[string]GcpLinkAccountInput

func (GcpLinkAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpLinkAccount)(nil)).Elem()
}

func (i GcpLinkAccountMap) ToGcpLinkAccountMapOutput() GcpLinkAccountMapOutput {
	return i.ToGcpLinkAccountMapOutputWithContext(context.Background())
}

func (i GcpLinkAccountMap) ToGcpLinkAccountMapOutputWithContext(ctx context.Context) GcpLinkAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpLinkAccountMapOutput)
}

type GcpLinkAccountOutput struct{ *pulumi.OutputState }

func (GcpLinkAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpLinkAccount)(nil)).Elem()
}

func (o GcpLinkAccountOutput) ToGcpLinkAccountOutput() GcpLinkAccountOutput {
	return o
}

func (o GcpLinkAccountOutput) ToGcpLinkAccountOutputWithContext(ctx context.Context) GcpLinkAccountOutput {
	return o
}

// Account ID of the New Relic account.
func (o GcpLinkAccountOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *GcpLinkAccount) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// name of the linked account
func (o GcpLinkAccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpLinkAccount) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Project ID of the GCP account.
func (o GcpLinkAccountOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpLinkAccount) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type GcpLinkAccountArrayOutput struct{ *pulumi.OutputState }

func (GcpLinkAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpLinkAccount)(nil)).Elem()
}

func (o GcpLinkAccountArrayOutput) ToGcpLinkAccountArrayOutput() GcpLinkAccountArrayOutput {
	return o
}

func (o GcpLinkAccountArrayOutput) ToGcpLinkAccountArrayOutputWithContext(ctx context.Context) GcpLinkAccountArrayOutput {
	return o
}

func (o GcpLinkAccountArrayOutput) Index(i pulumi.IntInput) GcpLinkAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GcpLinkAccount {
		return vs[0].([]*GcpLinkAccount)[vs[1].(int)]
	}).(GcpLinkAccountOutput)
}

type GcpLinkAccountMapOutput struct{ *pulumi.OutputState }

func (GcpLinkAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpLinkAccount)(nil)).Elem()
}

func (o GcpLinkAccountMapOutput) ToGcpLinkAccountMapOutput() GcpLinkAccountMapOutput {
	return o
}

func (o GcpLinkAccountMapOutput) ToGcpLinkAccountMapOutputWithContext(ctx context.Context) GcpLinkAccountMapOutput {
	return o
}

func (o GcpLinkAccountMapOutput) MapIndex(k pulumi.StringInput) GcpLinkAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GcpLinkAccount {
		return vs[0].(map[string]*GcpLinkAccount)[vs[1].(string)]
	}).(GcpLinkAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GcpLinkAccountInput)(nil)).Elem(), &GcpLinkAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpLinkAccountArrayInput)(nil)).Elem(), GcpLinkAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpLinkAccountMapInput)(nil)).Elem(), GcpLinkAccountMap{})
	pulumi.RegisterOutputType(GcpLinkAccountOutput{})
	pulumi.RegisterOutputType(GcpLinkAccountArrayOutput{})
	pulumi.RegisterOutputType(GcpLinkAccountMapOutput{})
}
