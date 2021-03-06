// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a synthetics monitor in New Relic.
//
// ## Example Usage
//
// ##### Type: `SIMPLE`
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/synthetics"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := synthetics.NewMonitor(ctx, "foo", &synthetics.MonitorArgs{
// 			Frequency: pulumi.Int(5),
// 			Locations: pulumi.StringArray{
// 				pulumi.String("AWS_US_EAST_1"),
// 				pulumi.String("AWS_US_EAST_2"),
// 			},
// 			Status:           pulumi.String("ENABLED"),
// 			Type:             pulumi.String("SIMPLE"),
// 			Uri:              pulumi.String("https://example.com"),
// 			ValidationString: pulumi.String("add example validation check here"),
// 			VerifySsl:        pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ##### Type: `BROWSER`
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/synthetics"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := synthetics.NewMonitor(ctx, "foo", &synthetics.MonitorArgs{
// 			BypassHeadRequest: pulumi.Bool(true),
// 			Frequency:         pulumi.Int(5),
// 			Locations: pulumi.StringArray{
// 				pulumi.String("AWS_US_EAST_1"),
// 			},
// 			Status:                 pulumi.String("ENABLED"),
// 			TreatRedirectAsFailure: pulumi.Bool(true),
// 			Type:                   pulumi.String("BROWSER"),
// 			Uri:                    pulumi.String("https://example.com"),
// 			ValidationString:       pulumi.String("add example validation check here"),
// 			VerifySsl:              pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ##### Type: `SCRIPT_BROWSER`
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/synthetics"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := synthetics.NewMonitor(ctx, "foo", &synthetics.MonitorArgs{
// 			Frequency: pulumi.Int(5),
// 			Locations: pulumi.StringArray{
// 				pulumi.String("AWS_US_EAST_1"),
// 			},
// 			Status: pulumi.String("ENABLED"),
// 			Type:   pulumi.String("SCRIPT_BROWSER"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ##### Type: `SCRIPT_API`
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/synthetics"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := synthetics.NewMonitor(ctx, "foo", &synthetics.MonitorArgs{
// 			Frequency: pulumi.Int(5),
// 			Locations: pulumi.StringArray{
// 				pulumi.String("AWS_US_EAST_1"),
// 			},
// 			Status: pulumi.String("ENABLED"),
// 			Type:   pulumi.String("SCRIPT_API"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Synthetics monitors can be imported using the `id`, e.g. bash
//
// ```sh
//  $ pulumi import newrelic:synthetics/monitor:Monitor main <id>
// ```
type Monitor struct {
	pulumi.CustomResourceState

	// Bypass HEAD request.
	BypassHeadRequest pulumi.BoolPtrOutput `pulumi:"bypassHeadRequest"`
	// The interval (in minutes) at which this monitor should run.
	Frequency pulumi.IntOutput `pulumi:"frequency"`
	// The locations in which this monitor should be run.
	Locations pulumi.StringArrayOutput `pulumi:"locations"`
	// The title of this monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The base threshold for the SLA report.
	SlaThreshold pulumi.Float64PtrOutput `pulumi:"slaThreshold"`
	// The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
	Status pulumi.StringOutput `pulumi:"status"`
	// Fail the monitor check if redirected.
	TreatRedirectAsFailure pulumi.BoolPtrOutput `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The URI for the monitor to hit.
	Uri pulumi.StringPtrOutput `pulumi:"uri"`
	// The string to validate against in the response.
	ValidationString pulumi.StringPtrOutput `pulumi:"validationString"`
	// Verify SSL.
	VerifySsl pulumi.BoolPtrOutput `pulumi:"verifySsl"`
}

// NewMonitor registers a new resource with the given unique name, arguments, and options.
func NewMonitor(ctx *pulumi.Context,
	name string, args *MonitorArgs, opts ...pulumi.ResourceOption) (*Monitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Frequency == nil {
		return nil, errors.New("invalid value for required argument 'Frequency'")
	}
	if args.Locations == nil {
		return nil, errors.New("invalid value for required argument 'Locations'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Monitor
	err := ctx.RegisterResource("newrelic:synthetics/monitor:Monitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitor gets an existing Monitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorState, opts ...pulumi.ResourceOption) (*Monitor, error) {
	var resource Monitor
	err := ctx.ReadResource("newrelic:synthetics/monitor:Monitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Monitor resources.
type monitorState struct {
	// Bypass HEAD request.
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// The interval (in minutes) at which this monitor should run.
	Frequency *int `pulumi:"frequency"`
	// The locations in which this monitor should be run.
	Locations []string `pulumi:"locations"`
	// The title of this monitor.
	Name *string `pulumi:"name"`
	// The base threshold for the SLA report.
	SlaThreshold *float64 `pulumi:"slaThreshold"`
	// The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
	Status *string `pulumi:"status"`
	// Fail the monitor check if redirected.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
	Type *string `pulumi:"type"`
	// The URI for the monitor to hit.
	Uri *string `pulumi:"uri"`
	// The string to validate against in the response.
	ValidationString *string `pulumi:"validationString"`
	// Verify SSL.
	VerifySsl *bool `pulumi:"verifySsl"`
}

type MonitorState struct {
	// Bypass HEAD request.
	BypassHeadRequest pulumi.BoolPtrInput
	// The interval (in minutes) at which this monitor should run.
	Frequency pulumi.IntPtrInput
	// The locations in which this monitor should be run.
	Locations pulumi.StringArrayInput
	// The title of this monitor.
	Name pulumi.StringPtrInput
	// The base threshold for the SLA report.
	SlaThreshold pulumi.Float64PtrInput
	// The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
	Status pulumi.StringPtrInput
	// Fail the monitor check if redirected.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
	Type pulumi.StringPtrInput
	// The URI for the monitor to hit.
	Uri pulumi.StringPtrInput
	// The string to validate against in the response.
	ValidationString pulumi.StringPtrInput
	// Verify SSL.
	VerifySsl pulumi.BoolPtrInput
}

func (MonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorState)(nil)).Elem()
}

type monitorArgs struct {
	// Bypass HEAD request.
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// The interval (in minutes) at which this monitor should run.
	Frequency int `pulumi:"frequency"`
	// The locations in which this monitor should be run.
	Locations []string `pulumi:"locations"`
	// The title of this monitor.
	Name *string `pulumi:"name"`
	// The base threshold for the SLA report.
	SlaThreshold *float64 `pulumi:"slaThreshold"`
	// The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
	Status string `pulumi:"status"`
	// Fail the monitor check if redirected.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
	Type string `pulumi:"type"`
	// The URI for the monitor to hit.
	Uri *string `pulumi:"uri"`
	// The string to validate against in the response.
	ValidationString *string `pulumi:"validationString"`
	// Verify SSL.
	VerifySsl *bool `pulumi:"verifySsl"`
}

// The set of arguments for constructing a Monitor resource.
type MonitorArgs struct {
	// Bypass HEAD request.
	BypassHeadRequest pulumi.BoolPtrInput
	// The interval (in minutes) at which this monitor should run.
	Frequency pulumi.IntInput
	// The locations in which this monitor should be run.
	Locations pulumi.StringArrayInput
	// The title of this monitor.
	Name pulumi.StringPtrInput
	// The base threshold for the SLA report.
	SlaThreshold pulumi.Float64PtrInput
	// The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
	Status pulumi.StringInput
	// Fail the monitor check if redirected.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
	Type pulumi.StringInput
	// The URI for the monitor to hit.
	Uri pulumi.StringPtrInput
	// The string to validate against in the response.
	ValidationString pulumi.StringPtrInput
	// Verify SSL.
	VerifySsl pulumi.BoolPtrInput
}

func (MonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorArgs)(nil)).Elem()
}

type MonitorInput interface {
	pulumi.Input

	ToMonitorOutput() MonitorOutput
	ToMonitorOutputWithContext(ctx context.Context) MonitorOutput
}

func (*Monitor) ElementType() reflect.Type {
	return reflect.TypeOf((*Monitor)(nil))
}

func (i *Monitor) ToMonitorOutput() MonitorOutput {
	return i.ToMonitorOutputWithContext(context.Background())
}

func (i *Monitor) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorOutput)
}

func (i *Monitor) ToMonitorPtrOutput() MonitorPtrOutput {
	return i.ToMonitorPtrOutputWithContext(context.Background())
}

func (i *Monitor) ToMonitorPtrOutputWithContext(ctx context.Context) MonitorPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorPtrOutput)
}

type MonitorPtrInput interface {
	pulumi.Input

	ToMonitorPtrOutput() MonitorPtrOutput
	ToMonitorPtrOutputWithContext(ctx context.Context) MonitorPtrOutput
}

type monitorPtrType MonitorArgs

func (*monitorPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil))
}

func (i *monitorPtrType) ToMonitorPtrOutput() MonitorPtrOutput {
	return i.ToMonitorPtrOutputWithContext(context.Background())
}

func (i *monitorPtrType) ToMonitorPtrOutputWithContext(ctx context.Context) MonitorPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorPtrOutput)
}

// MonitorArrayInput is an input type that accepts MonitorArray and MonitorArrayOutput values.
// You can construct a concrete instance of `MonitorArrayInput` via:
//
//          MonitorArray{ MonitorArgs{...} }
type MonitorArrayInput interface {
	pulumi.Input

	ToMonitorArrayOutput() MonitorArrayOutput
	ToMonitorArrayOutputWithContext(context.Context) MonitorArrayOutput
}

type MonitorArray []MonitorInput

func (MonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Monitor)(nil))
}

func (i MonitorArray) ToMonitorArrayOutput() MonitorArrayOutput {
	return i.ToMonitorArrayOutputWithContext(context.Background())
}

func (i MonitorArray) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorArrayOutput)
}

// MonitorMapInput is an input type that accepts MonitorMap and MonitorMapOutput values.
// You can construct a concrete instance of `MonitorMapInput` via:
//
//          MonitorMap{ "key": MonitorArgs{...} }
type MonitorMapInput interface {
	pulumi.Input

	ToMonitorMapOutput() MonitorMapOutput
	ToMonitorMapOutputWithContext(context.Context) MonitorMapOutput
}

type MonitorMap map[string]MonitorInput

func (MonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Monitor)(nil))
}

func (i MonitorMap) ToMonitorMapOutput() MonitorMapOutput {
	return i.ToMonitorMapOutputWithContext(context.Background())
}

func (i MonitorMap) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorMapOutput)
}

type MonitorOutput struct {
	*pulumi.OutputState
}

func (MonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Monitor)(nil))
}

func (o MonitorOutput) ToMonitorOutput() MonitorOutput {
	return o
}

func (o MonitorOutput) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return o
}

func (o MonitorOutput) ToMonitorPtrOutput() MonitorPtrOutput {
	return o.ToMonitorPtrOutputWithContext(context.Background())
}

func (o MonitorOutput) ToMonitorPtrOutputWithContext(ctx context.Context) MonitorPtrOutput {
	return o.ApplyT(func(v Monitor) *Monitor {
		return &v
	}).(MonitorPtrOutput)
}

type MonitorPtrOutput struct {
	*pulumi.OutputState
}

func (MonitorPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil))
}

func (o MonitorPtrOutput) ToMonitorPtrOutput() MonitorPtrOutput {
	return o
}

func (o MonitorPtrOutput) ToMonitorPtrOutputWithContext(ctx context.Context) MonitorPtrOutput {
	return o
}

type MonitorArrayOutput struct{ *pulumi.OutputState }

func (MonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Monitor)(nil))
}

func (o MonitorArrayOutput) ToMonitorArrayOutput() MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) Index(i pulumi.IntInput) MonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Monitor {
		return vs[0].([]Monitor)[vs[1].(int)]
	}).(MonitorOutput)
}

type MonitorMapOutput struct{ *pulumi.OutputState }

func (MonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Monitor)(nil))
}

func (o MonitorMapOutput) ToMonitorMapOutput() MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) MapIndex(k pulumi.StringInput) MonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Monitor {
		return vs[0].(map[string]Monitor)[vs[1].(string)]
	}).(MonitorOutput)
}

func init() {
	pulumi.RegisterOutputType(MonitorOutput{})
	pulumi.RegisterOutputType(MonitorPtrOutput{})
	pulumi.RegisterOutputType(MonitorArrayOutput{})
	pulumi.RegisterOutputType(MonitorMapOutput{})
}
