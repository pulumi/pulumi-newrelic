// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// New Relic legacy Dashboards reached end of life Wednesday July 28, 2021.
//
// **This resource has been removed.**
//
// For more information, [click here](https://discuss.newrelic.com/t/important-insights-dashboard-api-end-of-life/149357)
type Dashboard struct {
	pulumi.CustomResourceState

	// The URL for viewing the dashboard.
	DashboardUrl pulumi.StringOutput `pulumi:"dashboardUrl"`
	// Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
	// read_only. Defaults to editable_by_all.
	Editable pulumi.StringPtrOutput `pulumi:"editable"`
	// A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
	Filter DashboardFilterPtrOutput `pulumi:"filter"`
	// New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
	GridColumnCount pulumi.IntPtrOutput `pulumi:"gridColumnCount"`
	// The icon for the dashboard.
	Icon pulumi.StringPtrOutput `pulumi:"icon"`
	// The title of the dashboard.
	Title pulumi.StringOutput `pulumi:"title"`
	// Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
	Visibility pulumi.StringPtrOutput `pulumi:"visibility"`
	// A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
	Widgets DashboardWidgetArrayOutput `pulumi:"widgets"`
}

// NewDashboard registers a new resource with the given unique name, arguments, and options.
func NewDashboard(ctx *pulumi.Context,
	name string, args *DashboardArgs, opts ...pulumi.ResourceOption) (*Dashboard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	var resource Dashboard
	err := ctx.RegisterResource("newrelic:index/dashboard:Dashboard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDashboard gets an existing Dashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDashboard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DashboardState, opts ...pulumi.ResourceOption) (*Dashboard, error) {
	var resource Dashboard
	err := ctx.ReadResource("newrelic:index/dashboard:Dashboard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Dashboard resources.
type dashboardState struct {
	// The URL for viewing the dashboard.
	DashboardUrl *string `pulumi:"dashboardUrl"`
	// Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
	// read_only. Defaults to editable_by_all.
	Editable *string `pulumi:"editable"`
	// A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
	Filter *DashboardFilter `pulumi:"filter"`
	// New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
	GridColumnCount *int `pulumi:"gridColumnCount"`
	// The icon for the dashboard.
	Icon *string `pulumi:"icon"`
	// The title of the dashboard.
	Title *string `pulumi:"title"`
	// Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
	Visibility *string `pulumi:"visibility"`
	// A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
	Widgets []DashboardWidget `pulumi:"widgets"`
}

type DashboardState struct {
	// The URL for viewing the dashboard.
	DashboardUrl pulumi.StringPtrInput
	// Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
	// read_only. Defaults to editable_by_all.
	Editable pulumi.StringPtrInput
	// A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
	Filter DashboardFilterPtrInput
	// New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
	GridColumnCount pulumi.IntPtrInput
	// The icon for the dashboard.
	Icon pulumi.StringPtrInput
	// The title of the dashboard.
	Title pulumi.StringPtrInput
	// Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
	Visibility pulumi.StringPtrInput
	// A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
	Widgets DashboardWidgetArrayInput
}

func (DashboardState) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardState)(nil)).Elem()
}

type dashboardArgs struct {
	// Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
	// read_only. Defaults to editable_by_all.
	Editable *string `pulumi:"editable"`
	// A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
	Filter *DashboardFilter `pulumi:"filter"`
	// New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
	GridColumnCount *int `pulumi:"gridColumnCount"`
	// The icon for the dashboard.
	Icon *string `pulumi:"icon"`
	// The title of the dashboard.
	Title string `pulumi:"title"`
	// Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
	Visibility *string `pulumi:"visibility"`
	// A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
	Widgets []DashboardWidget `pulumi:"widgets"`
}

// The set of arguments for constructing a Dashboard resource.
type DashboardArgs struct {
	// Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
	// read_only. Defaults to editable_by_all.
	Editable pulumi.StringPtrInput
	// A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
	Filter DashboardFilterPtrInput
	// New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
	GridColumnCount pulumi.IntPtrInput
	// The icon for the dashboard.
	Icon pulumi.StringPtrInput
	// The title of the dashboard.
	Title pulumi.StringInput
	// Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
	Visibility pulumi.StringPtrInput
	// A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
	Widgets DashboardWidgetArrayInput
}

func (DashboardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardArgs)(nil)).Elem()
}

type DashboardInput interface {
	pulumi.Input

	ToDashboardOutput() DashboardOutput
	ToDashboardOutputWithContext(ctx context.Context) DashboardOutput
}

func (*Dashboard) ElementType() reflect.Type {
	return reflect.TypeOf((*Dashboard)(nil))
}

func (i *Dashboard) ToDashboardOutput() DashboardOutput {
	return i.ToDashboardOutputWithContext(context.Background())
}

func (i *Dashboard) ToDashboardOutputWithContext(ctx context.Context) DashboardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardOutput)
}

func (i *Dashboard) ToDashboardPtrOutput() DashboardPtrOutput {
	return i.ToDashboardPtrOutputWithContext(context.Background())
}

func (i *Dashboard) ToDashboardPtrOutputWithContext(ctx context.Context) DashboardPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardPtrOutput)
}

type DashboardPtrInput interface {
	pulumi.Input

	ToDashboardPtrOutput() DashboardPtrOutput
	ToDashboardPtrOutputWithContext(ctx context.Context) DashboardPtrOutput
}

type dashboardPtrType DashboardArgs

func (*dashboardPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Dashboard)(nil))
}

func (i *dashboardPtrType) ToDashboardPtrOutput() DashboardPtrOutput {
	return i.ToDashboardPtrOutputWithContext(context.Background())
}

func (i *dashboardPtrType) ToDashboardPtrOutputWithContext(ctx context.Context) DashboardPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardPtrOutput)
}

// DashboardArrayInput is an input type that accepts DashboardArray and DashboardArrayOutput values.
// You can construct a concrete instance of `DashboardArrayInput` via:
//
//          DashboardArray{ DashboardArgs{...} }
type DashboardArrayInput interface {
	pulumi.Input

	ToDashboardArrayOutput() DashboardArrayOutput
	ToDashboardArrayOutputWithContext(context.Context) DashboardArrayOutput
}

type DashboardArray []DashboardInput

func (DashboardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Dashboard)(nil)).Elem()
}

func (i DashboardArray) ToDashboardArrayOutput() DashboardArrayOutput {
	return i.ToDashboardArrayOutputWithContext(context.Background())
}

func (i DashboardArray) ToDashboardArrayOutputWithContext(ctx context.Context) DashboardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardArrayOutput)
}

// DashboardMapInput is an input type that accepts DashboardMap and DashboardMapOutput values.
// You can construct a concrete instance of `DashboardMapInput` via:
//
//          DashboardMap{ "key": DashboardArgs{...} }
type DashboardMapInput interface {
	pulumi.Input

	ToDashboardMapOutput() DashboardMapOutput
	ToDashboardMapOutputWithContext(context.Context) DashboardMapOutput
}

type DashboardMap map[string]DashboardInput

func (DashboardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Dashboard)(nil)).Elem()
}

func (i DashboardMap) ToDashboardMapOutput() DashboardMapOutput {
	return i.ToDashboardMapOutputWithContext(context.Background())
}

func (i DashboardMap) ToDashboardMapOutputWithContext(ctx context.Context) DashboardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardMapOutput)
}

type DashboardOutput struct{ *pulumi.OutputState }

func (DashboardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Dashboard)(nil))
}

func (o DashboardOutput) ToDashboardOutput() DashboardOutput {
	return o
}

func (o DashboardOutput) ToDashboardOutputWithContext(ctx context.Context) DashboardOutput {
	return o
}

func (o DashboardOutput) ToDashboardPtrOutput() DashboardPtrOutput {
	return o.ToDashboardPtrOutputWithContext(context.Background())
}

func (o DashboardOutput) ToDashboardPtrOutputWithContext(ctx context.Context) DashboardPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Dashboard) *Dashboard {
		return &v
	}).(DashboardPtrOutput)
}

type DashboardPtrOutput struct{ *pulumi.OutputState }

func (DashboardPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Dashboard)(nil))
}

func (o DashboardPtrOutput) ToDashboardPtrOutput() DashboardPtrOutput {
	return o
}

func (o DashboardPtrOutput) ToDashboardPtrOutputWithContext(ctx context.Context) DashboardPtrOutput {
	return o
}

func (o DashboardPtrOutput) Elem() DashboardOutput {
	return o.ApplyT(func(v *Dashboard) Dashboard {
		if v != nil {
			return *v
		}
		var ret Dashboard
		return ret
	}).(DashboardOutput)
}

type DashboardArrayOutput struct{ *pulumi.OutputState }

func (DashboardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Dashboard)(nil))
}

func (o DashboardArrayOutput) ToDashboardArrayOutput() DashboardArrayOutput {
	return o
}

func (o DashboardArrayOutput) ToDashboardArrayOutputWithContext(ctx context.Context) DashboardArrayOutput {
	return o
}

func (o DashboardArrayOutput) Index(i pulumi.IntInput) DashboardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Dashboard {
		return vs[0].([]Dashboard)[vs[1].(int)]
	}).(DashboardOutput)
}

type DashboardMapOutput struct{ *pulumi.OutputState }

func (DashboardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Dashboard)(nil))
}

func (o DashboardMapOutput) ToDashboardMapOutput() DashboardMapOutput {
	return o
}

func (o DashboardMapOutput) ToDashboardMapOutputWithContext(ctx context.Context) DashboardMapOutput {
	return o
}

func (o DashboardMapOutput) MapIndex(k pulumi.StringInput) DashboardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Dashboard {
		return vs[0].(map[string]Dashboard)[vs[1].(string)]
	}).(DashboardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardInput)(nil)).Elem(), &Dashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardPtrInput)(nil)).Elem(), &Dashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardArrayInput)(nil)).Elem(), DashboardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardMapInput)(nil)).Elem(), DashboardMap{})
	pulumi.RegisterOutputType(DashboardOutput{})
	pulumi.RegisterOutputType(DashboardPtrOutput{})
	pulumi.RegisterOutputType(DashboardArrayOutput{})
	pulumi.RegisterOutputType(DashboardMapOutput{})
}
