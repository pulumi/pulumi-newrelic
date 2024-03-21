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

// Use this resource to create, update, and delete tags for a New Relic One entity.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			fooEntity, err := newrelic.GetEntity(ctx, &newrelic.GetEntityArgs{
//				Name:   "Example application",
//				Type:   pulumi.StringRef("APPLICATION"),
//				Domain: pulumi.StringRef("APM"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewEntityTags(ctx, "fooEntityTags", &newrelic.EntityTagsArgs{
//				Guid: pulumi.String(fooEntity.Guid),
//				Tags: newrelic.EntityTagsTagArray{
//					&newrelic.EntityTagsTagArgs{
//						Key: pulumi.String("my-key"),
//						Values: pulumi.StringArray{
//							pulumi.String("my-value"),
//							pulumi.String("my-other-value"),
//						},
//					},
//					&newrelic.EntityTagsTagArgs{
//						Key: pulumi.String("my-key-2"),
//						Values: pulumi.StringArray{
//							pulumi.String("my-value-2"),
//						},
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// New Relic One entity tags can be imported using a concatenated string of the format
//
//	`<guid>`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/entityTags:EntityTags foo MjUyMDUyOHxBUE18QVBRTElDQVRJT058MjE1MDM3Nzk1
// ```
type EntityTags struct {
	pulumi.CustomResourceState

	// The guid of the entity to tag.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// A nested block that describes an entity tag. See Nested tag blocks below for details.
	Tags EntityTagsTagArrayOutput `pulumi:"tags"`
}

// NewEntityTags registers a new resource with the given unique name, arguments, and options.
func NewEntityTags(ctx *pulumi.Context,
	name string, args *EntityTagsArgs, opts ...pulumi.ResourceOption) (*EntityTags, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Guid == nil {
		return nil, errors.New("invalid value for required argument 'Guid'")
	}
	if args.Tags == nil {
		return nil, errors.New("invalid value for required argument 'Tags'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EntityTags
	err := ctx.RegisterResource("newrelic:index/entityTags:EntityTags", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEntityTags gets an existing EntityTags resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEntityTags(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EntityTagsState, opts ...pulumi.ResourceOption) (*EntityTags, error) {
	var resource EntityTags
	err := ctx.ReadResource("newrelic:index/entityTags:EntityTags", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EntityTags resources.
type entityTagsState struct {
	// The guid of the entity to tag.
	Guid *string `pulumi:"guid"`
	// A nested block that describes an entity tag. See Nested tag blocks below for details.
	Tags []EntityTagsTag `pulumi:"tags"`
}

type EntityTagsState struct {
	// The guid of the entity to tag.
	Guid pulumi.StringPtrInput
	// A nested block that describes an entity tag. See Nested tag blocks below for details.
	Tags EntityTagsTagArrayInput
}

func (EntityTagsState) ElementType() reflect.Type {
	return reflect.TypeOf((*entityTagsState)(nil)).Elem()
}

type entityTagsArgs struct {
	// The guid of the entity to tag.
	Guid string `pulumi:"guid"`
	// A nested block that describes an entity tag. See Nested tag blocks below for details.
	Tags []EntityTagsTag `pulumi:"tags"`
}

// The set of arguments for constructing a EntityTags resource.
type EntityTagsArgs struct {
	// The guid of the entity to tag.
	Guid pulumi.StringInput
	// A nested block that describes an entity tag. See Nested tag blocks below for details.
	Tags EntityTagsTagArrayInput
}

func (EntityTagsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*entityTagsArgs)(nil)).Elem()
}

type EntityTagsInput interface {
	pulumi.Input

	ToEntityTagsOutput() EntityTagsOutput
	ToEntityTagsOutputWithContext(ctx context.Context) EntityTagsOutput
}

func (*EntityTags) ElementType() reflect.Type {
	return reflect.TypeOf((**EntityTags)(nil)).Elem()
}

func (i *EntityTags) ToEntityTagsOutput() EntityTagsOutput {
	return i.ToEntityTagsOutputWithContext(context.Background())
}

func (i *EntityTags) ToEntityTagsOutputWithContext(ctx context.Context) EntityTagsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntityTagsOutput)
}

// EntityTagsArrayInput is an input type that accepts EntityTagsArray and EntityTagsArrayOutput values.
// You can construct a concrete instance of `EntityTagsArrayInput` via:
//
//	EntityTagsArray{ EntityTagsArgs{...} }
type EntityTagsArrayInput interface {
	pulumi.Input

	ToEntityTagsArrayOutput() EntityTagsArrayOutput
	ToEntityTagsArrayOutputWithContext(context.Context) EntityTagsArrayOutput
}

type EntityTagsArray []EntityTagsInput

func (EntityTagsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EntityTags)(nil)).Elem()
}

func (i EntityTagsArray) ToEntityTagsArrayOutput() EntityTagsArrayOutput {
	return i.ToEntityTagsArrayOutputWithContext(context.Background())
}

func (i EntityTagsArray) ToEntityTagsArrayOutputWithContext(ctx context.Context) EntityTagsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntityTagsArrayOutput)
}

// EntityTagsMapInput is an input type that accepts EntityTagsMap and EntityTagsMapOutput values.
// You can construct a concrete instance of `EntityTagsMapInput` via:
//
//	EntityTagsMap{ "key": EntityTagsArgs{...} }
type EntityTagsMapInput interface {
	pulumi.Input

	ToEntityTagsMapOutput() EntityTagsMapOutput
	ToEntityTagsMapOutputWithContext(context.Context) EntityTagsMapOutput
}

type EntityTagsMap map[string]EntityTagsInput

func (EntityTagsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EntityTags)(nil)).Elem()
}

func (i EntityTagsMap) ToEntityTagsMapOutput() EntityTagsMapOutput {
	return i.ToEntityTagsMapOutputWithContext(context.Background())
}

func (i EntityTagsMap) ToEntityTagsMapOutputWithContext(ctx context.Context) EntityTagsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntityTagsMapOutput)
}

type EntityTagsOutput struct{ *pulumi.OutputState }

func (EntityTagsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EntityTags)(nil)).Elem()
}

func (o EntityTagsOutput) ToEntityTagsOutput() EntityTagsOutput {
	return o
}

func (o EntityTagsOutput) ToEntityTagsOutputWithContext(ctx context.Context) EntityTagsOutput {
	return o
}

// The guid of the entity to tag.
func (o EntityTagsOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *EntityTags) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// A nested block that describes an entity tag. See Nested tag blocks below for details.
func (o EntityTagsOutput) Tags() EntityTagsTagArrayOutput {
	return o.ApplyT(func(v *EntityTags) EntityTagsTagArrayOutput { return v.Tags }).(EntityTagsTagArrayOutput)
}

type EntityTagsArrayOutput struct{ *pulumi.OutputState }

func (EntityTagsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EntityTags)(nil)).Elem()
}

func (o EntityTagsArrayOutput) ToEntityTagsArrayOutput() EntityTagsArrayOutput {
	return o
}

func (o EntityTagsArrayOutput) ToEntityTagsArrayOutputWithContext(ctx context.Context) EntityTagsArrayOutput {
	return o
}

func (o EntityTagsArrayOutput) Index(i pulumi.IntInput) EntityTagsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EntityTags {
		return vs[0].([]*EntityTags)[vs[1].(int)]
	}).(EntityTagsOutput)
}

type EntityTagsMapOutput struct{ *pulumi.OutputState }

func (EntityTagsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EntityTags)(nil)).Elem()
}

func (o EntityTagsMapOutput) ToEntityTagsMapOutput() EntityTagsMapOutput {
	return o
}

func (o EntityTagsMapOutput) ToEntityTagsMapOutputWithContext(ctx context.Context) EntityTagsMapOutput {
	return o
}

func (o EntityTagsMapOutput) MapIndex(k pulumi.StringInput) EntityTagsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EntityTags {
		return vs[0].(map[string]*EntityTags)[vs[1].(string)]
	}).(EntityTagsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EntityTagsInput)(nil)).Elem(), &EntityTags{})
	pulumi.RegisterInputType(reflect.TypeOf((*EntityTagsArrayInput)(nil)).Elem(), EntityTagsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EntityTagsMapInput)(nil)).Elem(), EntityTagsMap{})
	pulumi.RegisterOutputType(EntityTagsOutput{})
	pulumi.RegisterOutputType(EntityTagsArrayOutput{})
	pulumi.RegisterOutputType(EntityTagsMapOutput{})
}
