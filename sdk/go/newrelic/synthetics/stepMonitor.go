// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.
//
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
//			_, err := synthetics.NewStepMonitor(ctx, "monitor", &synthetics.StepMonitorArgs{
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(true),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("US_EAST_1"),
//					pulumi.String("US_EAST_2"),
//				},
//				Period: pulumi.String("EVERY_6_HOURS"),
//				Status: pulumi.String("ENABLED"),
//				Steps: synthetics.StepMonitorStepArray{
//					&synthetics.StepMonitorStepArgs{
//						Ordinal: pulumi.Int(0),
//						Type:    pulumi.String("NAVIGATE"),
//						Values: pulumi.StringArray{
//							pulumi.String("https://www.newrelic.com"),
//						},
//					},
//				},
//				Tags: synthetics.StepMonitorTagArray{
//					&synthetics.StepMonitorTagArgs{
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
// ## Additional Examples
//
// ## Import
//
// Synthetics step monitor scripts can be imported using the `guid`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor <guid>
//
// ```
type StepMonitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrOutput `pulumi:"enableScreenshotOnFailureAndScript"`
	// The unique identifier for the Synthetics private location in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
	LocationPrivates StepMonitorLocationPrivateArrayOutput `pulumi:"locationPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringOutput `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntOutput `pulumi:"periodInMinutes"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringOutput `pulumi:"status"`
	// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
	Steps StepMonitorStepArrayOutput `pulumi:"steps"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags StepMonitorTagArrayOutput `pulumi:"tags"`
}

// NewStepMonitor registers a new resource with the given unique name, arguments, and options.
func NewStepMonitor(ctx *pulumi.Context,
	name string, args *StepMonitorArgs, opts ...pulumi.ResourceOption) (*StepMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Steps == nil {
		return nil, errors.New("invalid value for required argument 'Steps'")
	}
	var resource StepMonitor
	err := ctx.RegisterResource("newrelic:synthetics/stepMonitor:StepMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStepMonitor gets an existing StepMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStepMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StepMonitorState, opts ...pulumi.ResourceOption) (*StepMonitor, error) {
	var resource StepMonitor
	err := ctx.ReadResource("newrelic:synthetics/stepMonitor:StepMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StepMonitor resources.
type stepMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The unique identifier for the Synthetics private location in New Relic.
	Guid *string `pulumi:"guid"`
	// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
	LocationPrivates []StepMonitorLocationPrivate `pulumi:"locationPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes *int `pulumi:"periodInMinutes"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status *string `pulumi:"status"`
	// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
	Steps []StepMonitorStep `pulumi:"steps"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags []StepMonitorTag `pulumi:"tags"`
}

type StepMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The unique identifier for the Synthetics private location in New Relic.
	Guid pulumi.StringPtrInput
	// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
	LocationPrivates StepMonitorLocationPrivateArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntPtrInput
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringPtrInput
	// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
	Steps StepMonitorStepArrayInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags StepMonitorTagArrayInput
}

func (StepMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*stepMonitorState)(nil)).Elem()
}

type stepMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
	LocationPrivates []StepMonitorLocationPrivate `pulumi:"locationPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period string `pulumi:"period"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status string `pulumi:"status"`
	// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
	Steps []StepMonitorStep `pulumi:"steps"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags []StepMonitorTag `pulumi:"tags"`
}

// The set of arguments for constructing a StepMonitor resource.
type StepMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
	LocationPrivates StepMonitorLocationPrivateArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringInput
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringInput
	// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
	Steps StepMonitorStepArrayInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags StepMonitorTagArrayInput
}

func (StepMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stepMonitorArgs)(nil)).Elem()
}

type StepMonitorInput interface {
	pulumi.Input

	ToStepMonitorOutput() StepMonitorOutput
	ToStepMonitorOutputWithContext(ctx context.Context) StepMonitorOutput
}

func (*StepMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**StepMonitor)(nil)).Elem()
}

func (i *StepMonitor) ToStepMonitorOutput() StepMonitorOutput {
	return i.ToStepMonitorOutputWithContext(context.Background())
}

func (i *StepMonitor) ToStepMonitorOutputWithContext(ctx context.Context) StepMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StepMonitorOutput)
}

// StepMonitorArrayInput is an input type that accepts StepMonitorArray and StepMonitorArrayOutput values.
// You can construct a concrete instance of `StepMonitorArrayInput` via:
//
//	StepMonitorArray{ StepMonitorArgs{...} }
type StepMonitorArrayInput interface {
	pulumi.Input

	ToStepMonitorArrayOutput() StepMonitorArrayOutput
	ToStepMonitorArrayOutputWithContext(context.Context) StepMonitorArrayOutput
}

type StepMonitorArray []StepMonitorInput

func (StepMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StepMonitor)(nil)).Elem()
}

func (i StepMonitorArray) ToStepMonitorArrayOutput() StepMonitorArrayOutput {
	return i.ToStepMonitorArrayOutputWithContext(context.Background())
}

func (i StepMonitorArray) ToStepMonitorArrayOutputWithContext(ctx context.Context) StepMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StepMonitorArrayOutput)
}

// StepMonitorMapInput is an input type that accepts StepMonitorMap and StepMonitorMapOutput values.
// You can construct a concrete instance of `StepMonitorMapInput` via:
//
//	StepMonitorMap{ "key": StepMonitorArgs{...} }
type StepMonitorMapInput interface {
	pulumi.Input

	ToStepMonitorMapOutput() StepMonitorMapOutput
	ToStepMonitorMapOutputWithContext(context.Context) StepMonitorMapOutput
}

type StepMonitorMap map[string]StepMonitorInput

func (StepMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StepMonitor)(nil)).Elem()
}

func (i StepMonitorMap) ToStepMonitorMapOutput() StepMonitorMapOutput {
	return i.ToStepMonitorMapOutputWithContext(context.Background())
}

func (i StepMonitorMap) ToStepMonitorMapOutputWithContext(ctx context.Context) StepMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StepMonitorMapOutput)
}

type StepMonitorOutput struct{ *pulumi.OutputState }

func (StepMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StepMonitor)(nil)).Elem()
}

func (o StepMonitorOutput) ToStepMonitorOutput() StepMonitorOutput {
	return o
}

func (o StepMonitorOutput) ToStepMonitorOutputWithContext(ctx context.Context) StepMonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o StepMonitorOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Capture a screenshot during job execution.
func (o StepMonitorOutput) EnableScreenshotOnFailureAndScript() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.BoolPtrOutput { return v.EnableScreenshotOnFailureAndScript }).(pulumi.BoolPtrOutput)
}

// The unique identifier for the Synthetics private location in New Relic.
func (o StepMonitorOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The location the monitor will run from. At least one of `locationsPublic` or `locationPrivate` is required. See Nested locationsPrivate blocks below for details.
func (o StepMonitorOutput) LocationPrivates() StepMonitorLocationPrivateArrayOutput {
	return o.ApplyT(func(v *StepMonitor) StepMonitorLocationPrivateArrayOutput { return v.LocationPrivates }).(StepMonitorLocationPrivateArrayOutput)
}

// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
func (o StepMonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The name for the monitor.
func (o StepMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
func (o StepMonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The interval in minutes at which Synthetic monitor should run.
func (o StepMonitorOutput) PeriodInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.IntOutput { return v.PeriodInMinutes }).(pulumi.IntOutput)
}

// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
func (o StepMonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *StepMonitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
func (o StepMonitorOutput) Steps() StepMonitorStepArrayOutput {
	return o.ApplyT(func(v *StepMonitor) StepMonitorStepArrayOutput { return v.Steps }).(StepMonitorStepArrayOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details.
func (o StepMonitorOutput) Tags() StepMonitorTagArrayOutput {
	return o.ApplyT(func(v *StepMonitor) StepMonitorTagArrayOutput { return v.Tags }).(StepMonitorTagArrayOutput)
}

type StepMonitorArrayOutput struct{ *pulumi.OutputState }

func (StepMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StepMonitor)(nil)).Elem()
}

func (o StepMonitorArrayOutput) ToStepMonitorArrayOutput() StepMonitorArrayOutput {
	return o
}

func (o StepMonitorArrayOutput) ToStepMonitorArrayOutputWithContext(ctx context.Context) StepMonitorArrayOutput {
	return o
}

func (o StepMonitorArrayOutput) Index(i pulumi.IntInput) StepMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StepMonitor {
		return vs[0].([]*StepMonitor)[vs[1].(int)]
	}).(StepMonitorOutput)
}

type StepMonitorMapOutput struct{ *pulumi.OutputState }

func (StepMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StepMonitor)(nil)).Elem()
}

func (o StepMonitorMapOutput) ToStepMonitorMapOutput() StepMonitorMapOutput {
	return o
}

func (o StepMonitorMapOutput) ToStepMonitorMapOutputWithContext(ctx context.Context) StepMonitorMapOutput {
	return o
}

func (o StepMonitorMapOutput) MapIndex(k pulumi.StringInput) StepMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StepMonitor {
		return vs[0].(map[string]*StepMonitor)[vs[1].(string)]
	}).(StepMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StepMonitorInput)(nil)).Elem(), &StepMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*StepMonitorArrayInput)(nil)).Elem(), StepMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StepMonitorMapInput)(nil)).Elem(), StepMonitorMap{})
	pulumi.RegisterOutputType(StepMonitorOutput{})
	pulumi.RegisterOutputType(StepMonitorArrayOutput{})
	pulumi.RegisterOutputType(StepMonitorMapOutput{})
}
