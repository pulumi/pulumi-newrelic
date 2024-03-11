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

// > **NOTE:** The OneDashboardJson resource is preferred for configuring dashboards in New Relic. This resource does not support the latest dashboard features and will receive less investment compared to newrelic_one_dashboard_json.
//
// ## Example Usage
//
// ### Create A New Relic One Dashboard With RawConfiguration
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"facet": map[string]interface{}{
//					"showOtherSeries": false,
//				},
//				"nrqlQueries": []map[string]interface{}{
//					map[string]interface{}{
//						"accountId": local.AccountID,
//						"query":     "SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = newrelic.NewOneDashboardRaw(ctx, "exampledash", &newrelic.OneDashboardRawArgs{
//				Pages: newrelic.OneDashboardRawPageArray{
//					&newrelic.OneDashboardRawPageArgs{
//						Name: pulumi.String("Page Name"),
//						Widgets: newrelic.OneDashboardRawPageWidgetArray{
//							&newrelic.OneDashboardRawPageWidgetArgs{
//								Title:           pulumi.String("Custom widget"),
//								Row:             pulumi.Int(1),
//								Column:          pulumi.Int(1),
//								Width:           pulumi.Int(1),
//								Height:          pulumi.Int(1),
//								VisualizationId: pulumi.String("viz.custom"),
//								Configuration:   pulumi.String("      {\n        \"legend\": {\n          \"enabled\": false\n        },\n        \"nrqlQueries\": [\n          {\n            \"accountId\": ` + accountID + `,\n            \"query\": \"SELECT average(loadAverageOneMinute), average(loadAverageFiveMinute), average(loadAverageFifteenMinute) from SystemSample SINCE 60 minutes ago    TIMESERIES\"\n          }\n        ],\n        \"yAxisLeft\": {\n          \"max\": 100,\n          \"min\": 50,\n          \"zero\": false\n        }\n      }\n"),
//							},
//							&newrelic.OneDashboardRawPageWidgetArgs{
//								Title:           pulumi.String("Server CPU"),
//								Row:             pulumi.Int(1),
//								Column:          pulumi.Int(2),
//								Width:           pulumi.Int(1),
//								Height:          pulumi.Int(1),
//								VisualizationId: pulumi.String("viz.testing"),
//								Configuration:   pulumi.String("      {\n        \"nrqlQueries\": [\n          {\n            \"accountId\": ` + accountID + `,\n            \"query\": \"SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400\"\n          }\n        ]\n      }\n"),
//							},
//							&newrelic.OneDashboardRawPageWidgetArgs{
//								Title:           pulumi.String("Docker Server CPU"),
//								Row:             pulumi.Int(1),
//								Column:          pulumi.Int(3),
//								Height:          pulumi.Int(1),
//								Width:           pulumi.Int(1),
//								VisualizationId: pulumi.String("viz.bar"),
//								Configuration:   pulumi.String(json0),
//								LinkedEntityGuids: pulumi.StringArray{
//									pulumi.String("MzI5ODAxNnxWSVp8REFTSEJPQVJEfDI2MTcxNDc"),
//								},
//							},
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
type OneDashboardRaw struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The unique entity identifier of the dashboard page in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The title of the dashboard.
	Name pulumi.StringOutput `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardRawPageArrayOutput `pulumi:"pages"`
	// The URL for viewing the dashboard.
	Permalink pulumi.StringOutput `pulumi:"permalink"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrOutput `pulumi:"permissions"`
}

// NewOneDashboardRaw registers a new resource with the given unique name, arguments, and options.
func NewOneDashboardRaw(ctx *pulumi.Context,
	name string, args *OneDashboardRawArgs, opts ...pulumi.ResourceOption) (*OneDashboardRaw, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Pages == nil {
		return nil, errors.New("invalid value for required argument 'Pages'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OneDashboardRaw
	err := ctx.RegisterResource("newrelic:index/oneDashboardRaw:OneDashboardRaw", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOneDashboardRaw gets an existing OneDashboardRaw resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOneDashboardRaw(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OneDashboardRawState, opts ...pulumi.ResourceOption) (*OneDashboardRaw, error) {
	var resource OneDashboardRaw
	err := ctx.ReadResource("newrelic:index/oneDashboardRaw:OneDashboardRaw", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OneDashboardRaw resources.
type oneDashboardRawState struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description *string `pulumi:"description"`
	// The unique entity identifier of the dashboard page in New Relic.
	Guid *string `pulumi:"guid"`
	// The title of the dashboard.
	Name *string `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages []OneDashboardRawPage `pulumi:"pages"`
	// The URL for viewing the dashboard.
	Permalink *string `pulumi:"permalink"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
	Permissions *string `pulumi:"permissions"`
}

type OneDashboardRawState struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// Brief text describing the dashboard.
	Description pulumi.StringPtrInput
	// The unique entity identifier of the dashboard page in New Relic.
	Guid pulumi.StringPtrInput
	// The title of the dashboard.
	Name pulumi.StringPtrInput
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardRawPageArrayInput
	// The URL for viewing the dashboard.
	Permalink pulumi.StringPtrInput
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrInput
}

func (OneDashboardRawState) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardRawState)(nil)).Elem()
}

type oneDashboardRawArgs struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// Brief text describing the dashboard.
	Description *string `pulumi:"description"`
	// The title of the dashboard.
	Name *string `pulumi:"name"`
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages []OneDashboardRawPage `pulumi:"pages"`
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
	Permissions *string `pulumi:"permissions"`
}

// The set of arguments for constructing a OneDashboardRaw resource.
type OneDashboardRawArgs struct {
	// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// Brief text describing the dashboard.
	Description pulumi.StringPtrInput
	// The title of the dashboard.
	Name pulumi.StringPtrInput
	// A nested block that describes a page. See Nested page blocks below for details.
	Pages OneDashboardRawPageArrayInput
	// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
	Permissions pulumi.StringPtrInput
}

func (OneDashboardRawArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardRawArgs)(nil)).Elem()
}

type OneDashboardRawInput interface {
	pulumi.Input

	ToOneDashboardRawOutput() OneDashboardRawOutput
	ToOneDashboardRawOutputWithContext(ctx context.Context) OneDashboardRawOutput
}

func (*OneDashboardRaw) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboardRaw)(nil)).Elem()
}

func (i *OneDashboardRaw) ToOneDashboardRawOutput() OneDashboardRawOutput {
	return i.ToOneDashboardRawOutputWithContext(context.Background())
}

func (i *OneDashboardRaw) ToOneDashboardRawOutputWithContext(ctx context.Context) OneDashboardRawOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardRawOutput)
}

// OneDashboardRawArrayInput is an input type that accepts OneDashboardRawArray and OneDashboardRawArrayOutput values.
// You can construct a concrete instance of `OneDashboardRawArrayInput` via:
//
//	OneDashboardRawArray{ OneDashboardRawArgs{...} }
type OneDashboardRawArrayInput interface {
	pulumi.Input

	ToOneDashboardRawArrayOutput() OneDashboardRawArrayOutput
	ToOneDashboardRawArrayOutputWithContext(context.Context) OneDashboardRawArrayOutput
}

type OneDashboardRawArray []OneDashboardRawInput

func (OneDashboardRawArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboardRaw)(nil)).Elem()
}

func (i OneDashboardRawArray) ToOneDashboardRawArrayOutput() OneDashboardRawArrayOutput {
	return i.ToOneDashboardRawArrayOutputWithContext(context.Background())
}

func (i OneDashboardRawArray) ToOneDashboardRawArrayOutputWithContext(ctx context.Context) OneDashboardRawArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardRawArrayOutput)
}

// OneDashboardRawMapInput is an input type that accepts OneDashboardRawMap and OneDashboardRawMapOutput values.
// You can construct a concrete instance of `OneDashboardRawMapInput` via:
//
//	OneDashboardRawMap{ "key": OneDashboardRawArgs{...} }
type OneDashboardRawMapInput interface {
	pulumi.Input

	ToOneDashboardRawMapOutput() OneDashboardRawMapOutput
	ToOneDashboardRawMapOutputWithContext(context.Context) OneDashboardRawMapOutput
}

type OneDashboardRawMap map[string]OneDashboardRawInput

func (OneDashboardRawMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboardRaw)(nil)).Elem()
}

func (i OneDashboardRawMap) ToOneDashboardRawMapOutput() OneDashboardRawMapOutput {
	return i.ToOneDashboardRawMapOutputWithContext(context.Background())
}

func (i OneDashboardRawMap) ToOneDashboardRawMapOutputWithContext(ctx context.Context) OneDashboardRawMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardRawMapOutput)
}

type OneDashboardRawOutput struct{ *pulumi.OutputState }

func (OneDashboardRawOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboardRaw)(nil)).Elem()
}

func (o OneDashboardRawOutput) ToOneDashboardRawOutput() OneDashboardRawOutput {
	return o
}

func (o OneDashboardRawOutput) ToOneDashboardRawOutputWithContext(ctx context.Context) OneDashboardRawOutput {
	return o
}

// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
func (o OneDashboardRawOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Brief text describing the dashboard.
func (o OneDashboardRawOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The unique entity identifier of the dashboard page in New Relic.
func (o OneDashboardRawOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The title of the dashboard.
func (o OneDashboardRawOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A nested block that describes a page. See Nested page blocks below for details.
func (o OneDashboardRawOutput) Pages() OneDashboardRawPageArrayOutput {
	return o.ApplyT(func(v *OneDashboardRaw) OneDashboardRawPageArrayOutput { return v.Pages }).(OneDashboardRawPageArrayOutput)
}

// The URL for viewing the dashboard.
func (o OneDashboardRawOutput) Permalink() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.StringOutput { return v.Permalink }).(pulumi.StringOutput)
}

// Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
func (o OneDashboardRawOutput) Permissions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OneDashboardRaw) pulumi.StringPtrOutput { return v.Permissions }).(pulumi.StringPtrOutput)
}

type OneDashboardRawArrayOutput struct{ *pulumi.OutputState }

func (OneDashboardRawArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboardRaw)(nil)).Elem()
}

func (o OneDashboardRawArrayOutput) ToOneDashboardRawArrayOutput() OneDashboardRawArrayOutput {
	return o
}

func (o OneDashboardRawArrayOutput) ToOneDashboardRawArrayOutputWithContext(ctx context.Context) OneDashboardRawArrayOutput {
	return o
}

func (o OneDashboardRawArrayOutput) Index(i pulumi.IntInput) OneDashboardRawOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OneDashboardRaw {
		return vs[0].([]*OneDashboardRaw)[vs[1].(int)]
	}).(OneDashboardRawOutput)
}

type OneDashboardRawMapOutput struct{ *pulumi.OutputState }

func (OneDashboardRawMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboardRaw)(nil)).Elem()
}

func (o OneDashboardRawMapOutput) ToOneDashboardRawMapOutput() OneDashboardRawMapOutput {
	return o
}

func (o OneDashboardRawMapOutput) ToOneDashboardRawMapOutputWithContext(ctx context.Context) OneDashboardRawMapOutput {
	return o
}

func (o OneDashboardRawMapOutput) MapIndex(k pulumi.StringInput) OneDashboardRawOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OneDashboardRaw {
		return vs[0].(map[string]*OneDashboardRaw)[vs[1].(string)]
	}).(OneDashboardRawOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardRawInput)(nil)).Elem(), &OneDashboardRaw{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardRawArrayInput)(nil)).Elem(), OneDashboardRawArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardRawMapInput)(nil)).Elem(), OneDashboardRawMap{})
	pulumi.RegisterOutputType(OneDashboardRawOutput{})
	pulumi.RegisterOutputType(OneDashboardRawArrayOutput{})
	pulumi.RegisterOutputType(OneDashboardRawMapOutput{})
}
