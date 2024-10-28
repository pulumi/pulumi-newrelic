// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := synthetics.NewBrokenLinksMonitor(ctx, "foo", &synthetics.BrokenLinksMonitorArgs{
//				Name: pulumi.String("Sample Broken Links Monitor"),
//				Uri:  pulumi.String("https://www.one.example.com"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				Period:             pulumi.String("EVERY_6_HOURS"),
//				Status:             pulumi.String("ENABLED"),
//				RuntimeType:        pulumi.String("NODE_API"),
//				RuntimeTypeVersion: pulumi.String("16.10"),
//				Tags: synthetics.BrokenLinksMonitorTagArray{
//					&synthetics.BrokenLinksMonitorTagArgs{
//						Key: pulumi.String("some_key"),
//						Values: pulumi.StringArray{
//							pulumi.String("some_value"),
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
// See additional examples.
//
// ## Additional Examples
//
// ### Create a monitor with a private location
//
// The below example shows how you can define a private location and attach it to a monitor.
//
// > **NOTE:** It can take up to 10 minutes for a private location to become available.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo, err := synthetics.NewPrivateLocation(ctx, "foo", &synthetics.PrivateLocationArgs{
//				Name:                    pulumi.String("Sample Private Location"),
//				Description:             pulumi.String("Sample Private Location Description"),
//				VerifiedScriptExecution: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewBrokenLinksMonitor(ctx, "foo", &synthetics.BrokenLinksMonitorArgs{
//				Name: pulumi.String("Sample Broken Links Monitor"),
//				Uri:  pulumi.String("https://www.one.example.com"),
//				LocationsPrivates: pulumi.StringArray{
//					foo.ID(),
//				},
//				Period: pulumi.String("EVERY_6_HOURS"),
//				Status: pulumi.String("ENABLED"),
//				Tags: synthetics.BrokenLinksMonitorTagArray{
//					&synthetics.BrokenLinksMonitorTagArgs{
//						Key: pulumi.String("some_key"),
//						Values: pulumi.StringArray{
//							pulumi.String("some_value"),
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
//
// ## Import
//
// A broken links monitor can be imported using its GUID, using the following command.
//
// bash
//
// ```sh
// $ pulumi import newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor monitor <guid>
// ```
type BrokenLinksMonitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The unique entity identifier of the monitor in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayOutput `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringOutput `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntOutput `pulumi:"periodInMinutes"`
	// The runtime that the monitor will use to run jobs (`NODE_API`).
	RuntimeType pulumi.StringPtrOutput `pulumi:"runtimeType"`
	// The specific semver version of the runtime type.
	RuntimeTypeVersion pulumi.StringPtrOutput `pulumi:"runtimeTypeVersion"`
	// The run state of the monitor. (`ENABLED` or `DISABLED`).
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags BrokenLinksMonitorTagArrayOutput `pulumi:"tags"`
	// The URI the monitor runs against.
	Uri                         pulumi.StringOutput  `pulumi:"uri"`
	UseUnsupportedLegacyRuntime pulumi.BoolPtrOutput `pulumi:"useUnsupportedLegacyRuntime"`
}

// NewBrokenLinksMonitor registers a new resource with the given unique name, arguments, and options.
func NewBrokenLinksMonitor(ctx *pulumi.Context,
	name string, args *BrokenLinksMonitorArgs, opts ...pulumi.ResourceOption) (*BrokenLinksMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Uri == nil {
		return nil, errors.New("invalid value for required argument 'Uri'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BrokenLinksMonitor
	err := ctx.RegisterResource("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBrokenLinksMonitor gets an existing BrokenLinksMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBrokenLinksMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrokenLinksMonitorState, opts ...pulumi.ResourceOption) (*BrokenLinksMonitor, error) {
	var resource BrokenLinksMonitor
	err := ctx.ReadResource("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BrokenLinksMonitor resources.
type brokenLinksMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// The unique entity identifier of the monitor in New Relic.
	Guid *string `pulumi:"guid"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period *string `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes *int `pulumi:"periodInMinutes"`
	// The runtime that the monitor will use to run jobs (`NODE_API`).
	RuntimeType *string `pulumi:"runtimeType"`
	// The specific semver version of the runtime type.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The run state of the monitor. (`ENABLED` or `DISABLED`).
	Status *string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags []BrokenLinksMonitorTag `pulumi:"tags"`
	// The URI the monitor runs against.
	Uri                         *string `pulumi:"uri"`
	UseUnsupportedLegacyRuntime *bool   `pulumi:"useUnsupportedLegacyRuntime"`
}

type BrokenLinksMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// The unique entity identifier of the monitor in New Relic.
	Guid pulumi.StringPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringPtrInput
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntPtrInput
	// The runtime that the monitor will use to run jobs (`NODE_API`).
	RuntimeType pulumi.StringPtrInput
	// The specific semver version of the runtime type.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The run state of the monitor. (`ENABLED` or `DISABLED`).
	Status pulumi.StringPtrInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags BrokenLinksMonitorTagArrayInput
	// The URI the monitor runs against.
	Uri                         pulumi.StringPtrInput
	UseUnsupportedLegacyRuntime pulumi.BoolPtrInput
}

func (BrokenLinksMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*brokenLinksMonitorState)(nil)).Elem()
}

type brokenLinksMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period string `pulumi:"period"`
	// The runtime that the monitor will use to run jobs (`NODE_API`).
	RuntimeType *string `pulumi:"runtimeType"`
	// The specific semver version of the runtime type.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The run state of the monitor. (`ENABLED` or `DISABLED`).
	Status string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags []BrokenLinksMonitorTag `pulumi:"tags"`
	// The URI the monitor runs against.
	Uri                         string `pulumi:"uri"`
	UseUnsupportedLegacyRuntime *bool  `pulumi:"useUnsupportedLegacyRuntime"`
}

// The set of arguments for constructing a BrokenLinksMonitor resource.
type BrokenLinksMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringInput
	// The runtime that the monitor will use to run jobs (`NODE_API`).
	RuntimeType pulumi.StringPtrInput
	// The specific semver version of the runtime type.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The run state of the monitor. (`ENABLED` or `DISABLED`).
	Status pulumi.StringInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags BrokenLinksMonitorTagArrayInput
	// The URI the monitor runs against.
	Uri                         pulumi.StringInput
	UseUnsupportedLegacyRuntime pulumi.BoolPtrInput
}

func (BrokenLinksMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*brokenLinksMonitorArgs)(nil)).Elem()
}

type BrokenLinksMonitorInput interface {
	pulumi.Input

	ToBrokenLinksMonitorOutput() BrokenLinksMonitorOutput
	ToBrokenLinksMonitorOutputWithContext(ctx context.Context) BrokenLinksMonitorOutput
}

func (*BrokenLinksMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**BrokenLinksMonitor)(nil)).Elem()
}

func (i *BrokenLinksMonitor) ToBrokenLinksMonitorOutput() BrokenLinksMonitorOutput {
	return i.ToBrokenLinksMonitorOutputWithContext(context.Background())
}

func (i *BrokenLinksMonitor) ToBrokenLinksMonitorOutputWithContext(ctx context.Context) BrokenLinksMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokenLinksMonitorOutput)
}

// BrokenLinksMonitorArrayInput is an input type that accepts BrokenLinksMonitorArray and BrokenLinksMonitorArrayOutput values.
// You can construct a concrete instance of `BrokenLinksMonitorArrayInput` via:
//
//	BrokenLinksMonitorArray{ BrokenLinksMonitorArgs{...} }
type BrokenLinksMonitorArrayInput interface {
	pulumi.Input

	ToBrokenLinksMonitorArrayOutput() BrokenLinksMonitorArrayOutput
	ToBrokenLinksMonitorArrayOutputWithContext(context.Context) BrokenLinksMonitorArrayOutput
}

type BrokenLinksMonitorArray []BrokenLinksMonitorInput

func (BrokenLinksMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrokenLinksMonitor)(nil)).Elem()
}

func (i BrokenLinksMonitorArray) ToBrokenLinksMonitorArrayOutput() BrokenLinksMonitorArrayOutput {
	return i.ToBrokenLinksMonitorArrayOutputWithContext(context.Background())
}

func (i BrokenLinksMonitorArray) ToBrokenLinksMonitorArrayOutputWithContext(ctx context.Context) BrokenLinksMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokenLinksMonitorArrayOutput)
}

// BrokenLinksMonitorMapInput is an input type that accepts BrokenLinksMonitorMap and BrokenLinksMonitorMapOutput values.
// You can construct a concrete instance of `BrokenLinksMonitorMapInput` via:
//
//	BrokenLinksMonitorMap{ "key": BrokenLinksMonitorArgs{...} }
type BrokenLinksMonitorMapInput interface {
	pulumi.Input

	ToBrokenLinksMonitorMapOutput() BrokenLinksMonitorMapOutput
	ToBrokenLinksMonitorMapOutputWithContext(context.Context) BrokenLinksMonitorMapOutput
}

type BrokenLinksMonitorMap map[string]BrokenLinksMonitorInput

func (BrokenLinksMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrokenLinksMonitor)(nil)).Elem()
}

func (i BrokenLinksMonitorMap) ToBrokenLinksMonitorMapOutput() BrokenLinksMonitorMapOutput {
	return i.ToBrokenLinksMonitorMapOutputWithContext(context.Background())
}

func (i BrokenLinksMonitorMap) ToBrokenLinksMonitorMapOutputWithContext(ctx context.Context) BrokenLinksMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokenLinksMonitorMapOutput)
}

type BrokenLinksMonitorOutput struct{ *pulumi.OutputState }

func (BrokenLinksMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BrokenLinksMonitor)(nil)).Elem()
}

func (o BrokenLinksMonitorOutput) ToBrokenLinksMonitorOutput() BrokenLinksMonitorOutput {
	return o
}

func (o BrokenLinksMonitorOutput) ToBrokenLinksMonitorOutputWithContext(ctx context.Context) BrokenLinksMonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o BrokenLinksMonitorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The unique entity identifier of the monitor in New Relic.
func (o BrokenLinksMonitorOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
func (o BrokenLinksMonitorOutput) LocationsPrivates() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringArrayOutput { return v.LocationsPrivates }).(pulumi.StringArrayOutput)
}

// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
func (o BrokenLinksMonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The name for the monitor.
func (o BrokenLinksMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
func (o BrokenLinksMonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The interval in minutes at which Synthetic monitor should run.
func (o BrokenLinksMonitorOutput) PeriodInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.IntOutput { return v.PeriodInMinutes }).(pulumi.IntOutput)
}

// The runtime that the monitor will use to run jobs (`NODE_API`).
func (o BrokenLinksMonitorOutput) RuntimeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringPtrOutput { return v.RuntimeType }).(pulumi.StringPtrOutput)
}

// The specific semver version of the runtime type.
func (o BrokenLinksMonitorOutput) RuntimeTypeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringPtrOutput { return v.RuntimeTypeVersion }).(pulumi.StringPtrOutput)
}

// The run state of the monitor. (`ENABLED` or `DISABLED`).
func (o BrokenLinksMonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details
func (o BrokenLinksMonitorOutput) Tags() BrokenLinksMonitorTagArrayOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) BrokenLinksMonitorTagArrayOutput { return v.Tags }).(BrokenLinksMonitorTagArrayOutput)
}

// The URI the monitor runs against.
func (o BrokenLinksMonitorOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

func (o BrokenLinksMonitorOutput) UseUnsupportedLegacyRuntime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BrokenLinksMonitor) pulumi.BoolPtrOutput { return v.UseUnsupportedLegacyRuntime }).(pulumi.BoolPtrOutput)
}

type BrokenLinksMonitorArrayOutput struct{ *pulumi.OutputState }

func (BrokenLinksMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrokenLinksMonitor)(nil)).Elem()
}

func (o BrokenLinksMonitorArrayOutput) ToBrokenLinksMonitorArrayOutput() BrokenLinksMonitorArrayOutput {
	return o
}

func (o BrokenLinksMonitorArrayOutput) ToBrokenLinksMonitorArrayOutputWithContext(ctx context.Context) BrokenLinksMonitorArrayOutput {
	return o
}

func (o BrokenLinksMonitorArrayOutput) Index(i pulumi.IntInput) BrokenLinksMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BrokenLinksMonitor {
		return vs[0].([]*BrokenLinksMonitor)[vs[1].(int)]
	}).(BrokenLinksMonitorOutput)
}

type BrokenLinksMonitorMapOutput struct{ *pulumi.OutputState }

func (BrokenLinksMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrokenLinksMonitor)(nil)).Elem()
}

func (o BrokenLinksMonitorMapOutput) ToBrokenLinksMonitorMapOutput() BrokenLinksMonitorMapOutput {
	return o
}

func (o BrokenLinksMonitorMapOutput) ToBrokenLinksMonitorMapOutputWithContext(ctx context.Context) BrokenLinksMonitorMapOutput {
	return o
}

func (o BrokenLinksMonitorMapOutput) MapIndex(k pulumi.StringInput) BrokenLinksMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BrokenLinksMonitor {
		return vs[0].(map[string]*BrokenLinksMonitor)[vs[1].(string)]
	}).(BrokenLinksMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrokenLinksMonitorInput)(nil)).Elem(), &BrokenLinksMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrokenLinksMonitorArrayInput)(nil)).Elem(), BrokenLinksMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrokenLinksMonitorMapInput)(nil)).Elem(), BrokenLinksMonitorMap{})
	pulumi.RegisterOutputType(BrokenLinksMonitorOutput{})
	pulumi.RegisterOutputType(BrokenLinksMonitorArrayOutput{})
	pulumi.RegisterOutputType(BrokenLinksMonitorMapOutput{})
}
