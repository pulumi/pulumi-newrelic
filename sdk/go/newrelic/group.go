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

// The `Group` resource facilitates creating, updating, and deleting groups in New Relic, while also enabling the addition and removal of users from these groups.
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
//			fooAuthenticationDomain, err := newrelic.GetAuthenticationDomain(ctx, &newrelic.GetAuthenticationDomainArgs{
//				Name: "Test Authentication Domain",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewGroup(ctx, "fooGroup", &newrelic.GroupArgs{
//				AuthenticationDomainId: pulumi.String(fooAuthenticationDomain.Id),
//				UserIds: pulumi.StringArray{
//					pulumi.String("0001112222"),
//					pulumi.String("2221110000"),
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
// ## Additional Examples
//
// ### Addition of New Users to a New Group
//
// The following example illustrates the creation of a group using the `Group` resource, to which users created using the `User` resource are added.
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
//			fooAuthenticationDomain, err := newrelic.GetAuthenticationDomain(ctx, &newrelic.GetAuthenticationDomainArgs{
//				Name: "Test Authentication Domain",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			fooUser, err := newrelic.NewUser(ctx, "fooUser", &newrelic.UserArgs{
//				EmailId:                pulumi.String("test_user_one@test.com"),
//				AuthenticationDomainId: pulumi.String(fooAuthenticationDomain.Id),
//				UserType:               pulumi.String("CORE_USER_TIER"),
//			})
//			if err != nil {
//				return err
//			}
//			bar, err := newrelic.NewUser(ctx, "bar", &newrelic.UserArgs{
//				EmailId:                pulumi.String("test_user_two@test.com"),
//				AuthenticationDomainId: pulumi.String(fooAuthenticationDomain.Id),
//				UserType:               pulumi.String("BASIC_USER_TIER"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewGroup(ctx, "fooGroup", &newrelic.GroupArgs{
//				AuthenticationDomainId: pulumi.String(fooAuthenticationDomain.Id),
//				UserIds: pulumi.StringArray{
//					fooUser.ID(),
//					bar.ID(),
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
// ### Addition of Existing Users to a New Group
//
// The following example demonstrates the usage of the `Group` resource to create a group, wherein the `User` data source is employed to associate existing users with the newly formed group.
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
//			fooAuthenticationDomain, err := newrelic.GetAuthenticationDomain(ctx, &newrelic.GetAuthenticationDomainArgs{
//				Name: "Test Authentication Domain",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			fooUser, err := newrelic.LookupUser(ctx, &newrelic.LookupUserArgs{
//				AuthenticationDomainId: fooAuthenticationDomain.Id,
//				EmailId:                pulumi.StringRef("test_user_one@test.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			bar, err := newrelic.LookupUser(ctx, &newrelic.LookupUserArgs{
//				AuthenticationDomainId: fooAuthenticationDomain.Id,
//				Name:                   pulumi.StringRef("Test User Two"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewGroup(ctx, "fooGroup", &newrelic.GroupArgs{
//				AuthenticationDomainId: pulumi.String(fooAuthenticationDomain.Id),
//				UserIds: pulumi.StringArray{
//					pulumi.String(fooUser.Id),
//					pulumi.String(bar.Id),
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
// > **NOTE** Please note that the addition of users to groups is only possible when both the group and the users to be added to it belong to the _same authentication domain_. If the group being created and the users being added to it belong to different authentication domains, an error indicating `user not found` or an equivalent error will be thrown.
//
// ## Import
//
// A group can be imported using its ID. Example:
//
// ```sh
// $ pulumi import newrelic:index/group:Group foo <group_id>
// ```
type Group struct {
	pulumi.CustomResourceState

	// The ID of the authentication domain to which the group to be created would belong.
	AuthenticationDomainId pulumi.StringOutput `pulumi:"authenticationDomainId"`
	// The name of the group to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of IDs of users to be included in the group to be created.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	//
	// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
	UserIds pulumi.StringArrayOutput `pulumi:"userIds"`
}

// NewGroup registers a new resource with the given unique name, arguments, and options.
func NewGroup(ctx *pulumi.Context,
	name string, args *GroupArgs, opts ...pulumi.ResourceOption) (*Group, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthenticationDomainId == nil {
		return nil, errors.New("invalid value for required argument 'AuthenticationDomainId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Group
	err := ctx.RegisterResource("newrelic:index/group:Group", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroup gets an existing Group resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupState, opts ...pulumi.ResourceOption) (*Group, error) {
	var resource Group
	err := ctx.ReadResource("newrelic:index/group:Group", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Group resources.
type groupState struct {
	// The ID of the authentication domain to which the group to be created would belong.
	AuthenticationDomainId *string `pulumi:"authenticationDomainId"`
	// The name of the group to be created.
	Name *string `pulumi:"name"`
	// A list of IDs of users to be included in the group to be created.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	//
	// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
	UserIds []string `pulumi:"userIds"`
}

type GroupState struct {
	// The ID of the authentication domain to which the group to be created would belong.
	AuthenticationDomainId pulumi.StringPtrInput
	// The name of the group to be created.
	Name pulumi.StringPtrInput
	// A list of IDs of users to be included in the group to be created.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	//
	// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
	UserIds pulumi.StringArrayInput
}

func (GroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupState)(nil)).Elem()
}

type groupArgs struct {
	// The ID of the authentication domain to which the group to be created would belong.
	AuthenticationDomainId string `pulumi:"authenticationDomainId"`
	// The name of the group to be created.
	Name *string `pulumi:"name"`
	// A list of IDs of users to be included in the group to be created.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	//
	// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
	UserIds []string `pulumi:"userIds"`
}

// The set of arguments for constructing a Group resource.
type GroupArgs struct {
	// The ID of the authentication domain to which the group to be created would belong.
	AuthenticationDomainId pulumi.StringInput
	// The name of the group to be created.
	Name pulumi.StringPtrInput
	// A list of IDs of users to be included in the group to be created.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	//
	// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
	UserIds pulumi.StringArrayInput
}

func (GroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupArgs)(nil)).Elem()
}

type GroupInput interface {
	pulumi.Input

	ToGroupOutput() GroupOutput
	ToGroupOutputWithContext(ctx context.Context) GroupOutput
}

func (*Group) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (i *Group) ToGroupOutput() GroupOutput {
	return i.ToGroupOutputWithContext(context.Background())
}

func (i *Group) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupOutput)
}

// GroupArrayInput is an input type that accepts GroupArray and GroupArrayOutput values.
// You can construct a concrete instance of `GroupArrayInput` via:
//
//	GroupArray{ GroupArgs{...} }
type GroupArrayInput interface {
	pulumi.Input

	ToGroupArrayOutput() GroupArrayOutput
	ToGroupArrayOutputWithContext(context.Context) GroupArrayOutput
}

type GroupArray []GroupInput

func (GroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (i GroupArray) ToGroupArrayOutput() GroupArrayOutput {
	return i.ToGroupArrayOutputWithContext(context.Background())
}

func (i GroupArray) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupArrayOutput)
}

// GroupMapInput is an input type that accepts GroupMap and GroupMapOutput values.
// You can construct a concrete instance of `GroupMapInput` via:
//
//	GroupMap{ "key": GroupArgs{...} }
type GroupMapInput interface {
	pulumi.Input

	ToGroupMapOutput() GroupMapOutput
	ToGroupMapOutputWithContext(context.Context) GroupMapOutput
}

type GroupMap map[string]GroupInput

func (GroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (i GroupMap) ToGroupMapOutput() GroupMapOutput {
	return i.ToGroupMapOutputWithContext(context.Background())
}

func (i GroupMap) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMapOutput)
}

type GroupOutput struct{ *pulumi.OutputState }

func (GroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (o GroupOutput) ToGroupOutput() GroupOutput {
	return o
}

func (o GroupOutput) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return o
}

// The ID of the authentication domain to which the group to be created would belong.
func (o GroupOutput) AuthenticationDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.AuthenticationDomainId }).(pulumi.StringOutput)
}

// The name of the group to be created.
func (o GroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of IDs of users to be included in the group to be created.
//
// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
//
// > **WARNING:** Changing the `authenticationDomainId` of a `Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
func (o GroupOutput) UserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Group) pulumi.StringArrayOutput { return v.UserIds }).(pulumi.StringArrayOutput)
}

type GroupArrayOutput struct{ *pulumi.OutputState }

func (GroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (o GroupArrayOutput) ToGroupArrayOutput() GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) Index(i pulumi.IntInput) GroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Group {
		return vs[0].([]*Group)[vs[1].(int)]
	}).(GroupOutput)
}

type GroupMapOutput struct{ *pulumi.OutputState }

func (GroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (o GroupMapOutput) ToGroupMapOutput() GroupMapOutput {
	return o
}

func (o GroupMapOutput) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return o
}

func (o GroupMapOutput) MapIndex(k pulumi.StringInput) GroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Group {
		return vs[0].(map[string]*Group)[vs[1].(string)]
	}).(GroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupInput)(nil)).Elem(), &Group{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupArrayInput)(nil)).Elem(), GroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMapInput)(nil)).Elem(), GroupMap{})
	pulumi.RegisterOutputType(GroupOutput{})
	pulumi.RegisterOutputType(GroupArrayOutput{})
	pulumi.RegisterOutputType(GroupMapOutput{})
}
