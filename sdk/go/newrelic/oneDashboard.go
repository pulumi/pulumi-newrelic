// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// New Relic dashboards can be imported using their GUID, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/oneDashboard:OneDashboard my_dashboard <dashboard GUID>
// ```
type OneDashboard struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The unique entity identifier of the dashboard page in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The title of the dashboard.
	Name pulumi.StringOutput `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardPageArrayOutput `pulumi:"pages"`
	// The URL for viewing the dashboard.
	Permalink pulumi.StringOutput `pulumi:"permalink"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrOutput `pulumi:"permissions"`
	// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
	Variables OneDashboardVariableArrayOutput `pulumi:"variables"`
}

// NewOneDashboard registers a new resource with the given unique name, arguments, and options.
func NewOneDashboard(ctx *pulumi.Context,
	name string, args *OneDashboardArgs, opts ...pulumi.ResourceOption) (*OneDashboard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Pages == nil {
		return nil, errors.New("invalid value for required argument 'Pages'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OneDashboard
	err := ctx.RegisterResource("newrelic:index/oneDashboard:OneDashboard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOneDashboard gets an existing OneDashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOneDashboard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OneDashboardState, opts ...pulumi.ResourceOption) (*OneDashboard, error) {
	var resource OneDashboard
	err := ctx.ReadResource("newrelic:index/oneDashboard:OneDashboard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OneDashboard resources.
type oneDashboardState struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId *string `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description *string `pulumi:"description"`
	// The unique entity identifier of the dashboard page in New Relic.
	Guid *string `pulumi:"guid"`
	// The title of the dashboard.
	Name *string `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages []OneDashboardPage `pulumi:"pages"`
	// The URL for viewing the dashboard.
	Permalink *string `pulumi:"permalink"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
	Permissions *string `pulumi:"permissions"`
	// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
	Variables []OneDashboardVariable `pulumi:"variables"`
}

type OneDashboardState struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringPtrInput
	// Brief text describing the dashboard.
	Description pulumi.StringPtrInput
	// The unique entity identifier of the dashboard page in New Relic.
	Guid pulumi.StringPtrInput
	// The title of the dashboard.
	Name pulumi.StringPtrInput
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardPageArrayInput
	// The URL for viewing the dashboard.
	Permalink pulumi.StringPtrInput
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrInput
	// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
	Variables OneDashboardVariableArrayInput
}

func (OneDashboardState) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardState)(nil)).Elem()
}

type oneDashboardArgs struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId *string `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description *string `pulumi:"description"`
	// The title of the dashboard.
	Name *string `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages []OneDashboardPage `pulumi:"pages"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
	Permissions *string `pulumi:"permissions"`
	// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
	Variables []OneDashboardVariable `pulumi:"variables"`
}

// The set of arguments for constructing a OneDashboard resource.
type OneDashboardArgs struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringPtrInput
	// Brief text describing the dashboard.
	Description pulumi.StringPtrInput
	// The title of the dashboard.
	Name pulumi.StringPtrInput
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardPageArrayInput
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrInput
	// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
	Variables OneDashboardVariableArrayInput
}

func (OneDashboardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardArgs)(nil)).Elem()
}

type OneDashboardInput interface {
	pulumi.Input

	ToOneDashboardOutput() OneDashboardOutput
	ToOneDashboardOutputWithContext(ctx context.Context) OneDashboardOutput
}

func (*OneDashboard) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboard)(nil)).Elem()
}

func (i *OneDashboard) ToOneDashboardOutput() OneDashboardOutput {
	return i.ToOneDashboardOutputWithContext(context.Background())
}

func (i *OneDashboard) ToOneDashboardOutputWithContext(ctx context.Context) OneDashboardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardOutput)
}

// OneDashboardArrayInput is an input type that accepts OneDashboardArray and OneDashboardArrayOutput values.
// You can construct a concrete instance of `OneDashboardArrayInput` via:
//
//	OneDashboardArray{ OneDashboardArgs{...} }
type OneDashboardArrayInput interface {
	pulumi.Input

	ToOneDashboardArrayOutput() OneDashboardArrayOutput
	ToOneDashboardArrayOutputWithContext(context.Context) OneDashboardArrayOutput
}

type OneDashboardArray []OneDashboardInput

func (OneDashboardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboard)(nil)).Elem()
}

func (i OneDashboardArray) ToOneDashboardArrayOutput() OneDashboardArrayOutput {
	return i.ToOneDashboardArrayOutputWithContext(context.Background())
}

func (i OneDashboardArray) ToOneDashboardArrayOutputWithContext(ctx context.Context) OneDashboardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardArrayOutput)
}

// OneDashboardMapInput is an input type that accepts OneDashboardMap and OneDashboardMapOutput values.
// You can construct a concrete instance of `OneDashboardMapInput` via:
//
//	OneDashboardMap{ "key": OneDashboardArgs{...} }
type OneDashboardMapInput interface {
	pulumi.Input

	ToOneDashboardMapOutput() OneDashboardMapOutput
	ToOneDashboardMapOutputWithContext(context.Context) OneDashboardMapOutput
}

type OneDashboardMap map[string]OneDashboardInput

func (OneDashboardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboard)(nil)).Elem()
}

func (i OneDashboardMap) ToOneDashboardMapOutput() OneDashboardMapOutput {
	return i.ToOneDashboardMapOutputWithContext(context.Background())
}

func (i OneDashboardMap) ToOneDashboardMapOutputWithContext(ctx context.Context) OneDashboardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardMapOutput)
}

type OneDashboardOutput struct{ *pulumi.OutputState }

func (OneDashboardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboard)(nil)).Elem()
}

func (o OneDashboardOutput) ToOneDashboardOutput() OneDashboardOutput {
	return o
}

func (o OneDashboardOutput) ToOneDashboardOutputWithContext(ctx context.Context) OneDashboardOutput {
	return o
}

// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
func (o OneDashboardOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Brief text describing the dashboard.
func (o OneDashboardOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The unique entity identifier of the dashboard page in New Relic.
func (o OneDashboardOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The title of the dashboard.
func (o OneDashboardOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A nested block that describes a page. See Nested page blocks below for details.
func (o OneDashboardOutput) Pages() OneDashboardPageArrayOutput {
	return o.ApplyT(func(v *OneDashboard) OneDashboardPageArrayOutput { return v.Pages }).(OneDashboardPageArrayOutput)
}

// The URL for viewing the dashboard.
func (o OneDashboardOutput) Permalink() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringOutput { return v.Permalink }).(pulumi.StringOutput)
}

// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
func (o OneDashboardOutput) Permissions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OneDashboard) pulumi.StringPtrOutput { return v.Permissions }).(pulumi.StringPtrOutput)
}

// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
func (o OneDashboardOutput) Variables() OneDashboardVariableArrayOutput {
	return o.ApplyT(func(v *OneDashboard) OneDashboardVariableArrayOutput { return v.Variables }).(OneDashboardVariableArrayOutput)
}

type OneDashboardArrayOutput struct{ *pulumi.OutputState }

func (OneDashboardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboard)(nil)).Elem()
}

func (o OneDashboardArrayOutput) ToOneDashboardArrayOutput() OneDashboardArrayOutput {
	return o
}

func (o OneDashboardArrayOutput) ToOneDashboardArrayOutputWithContext(ctx context.Context) OneDashboardArrayOutput {
	return o
}

func (o OneDashboardArrayOutput) Index(i pulumi.IntInput) OneDashboardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OneDashboard {
		return vs[0].([]*OneDashboard)[vs[1].(int)]
	}).(OneDashboardOutput)
}

type OneDashboardMapOutput struct{ *pulumi.OutputState }

func (OneDashboardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboard)(nil)).Elem()
}

func (o OneDashboardMapOutput) ToOneDashboardMapOutput() OneDashboardMapOutput {
	return o
}

func (o OneDashboardMapOutput) ToOneDashboardMapOutputWithContext(ctx context.Context) OneDashboardMapOutput {
	return o
}

func (o OneDashboardMapOutput) MapIndex(k pulumi.StringInput) OneDashboardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OneDashboard {
		return vs[0].(map[string]*OneDashboard)[vs[1].(string)]
	}).(OneDashboardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardInput)(nil)).Elem(), &OneDashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardArrayInput)(nil)).Elem(), OneDashboardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardMapInput)(nil)).Elem(), OneDashboardMap{})
	pulumi.RegisterOutputType(OneDashboardOutput{})
	pulumi.RegisterOutputType(OneDashboardArrayOutput{})
	pulumi.RegisterOutputType(OneDashboardMapOutput{})
}
