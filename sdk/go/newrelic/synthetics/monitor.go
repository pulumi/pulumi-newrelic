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

// > **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
//
// Use this resource to create, update, and delete a Simple or Browser Synthetics Monitor in New Relic.
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
//			_, err := synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("monitor"),
//				Period: pulumi.String("EVERY_MINUTE"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//				Type:   pulumi.String("SIMPLE"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("some_name"),
//						Value: pulumi.String("some_value"),
//					},
//				},
//				TreatRedirectAsFailure: pulumi.Bool(true),
//				ValidationString:       pulumi.String("success"),
//				BypassHeadRequest:      pulumi.Bool(true),
//				VerifySsl:              pulumi.Bool(true),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
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
// ##### Type: `SIMPLE BROWSER`
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
//			_, err := synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("monitor"),
//				Period: pulumi.String("EVERY_MINUTE"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//				Type:   pulumi.String("BROWSER"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("some_name"),
//						Value: pulumi.String("some_value"),
//					},
//				},
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(true),
//				ValidationString:                   pulumi.String("success"),
//				VerifySsl:                          pulumi.Bool(true),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
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
// ##### Type: `SIMPLE`
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
//			location, err := synthetics.NewPrivateLocation(ctx, "location", &synthetics.PrivateLocationArgs{
//				Description:             pulumi.String("Example private location"),
//				Name:                    pulumi.String("private_location"),
//				VerifiedScriptExecution: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("monitor"),
//				Period: pulumi.String("EVERY_MINUTE"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//				Type:   pulumi.String("SIMPLE"),
//				LocationsPrivates: pulumi.StringArray{
//					location.ID(),
//				},
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("some_name"),
//						Value: pulumi.String("some_value"),
//					},
//				},
//				TreatRedirectAsFailure: pulumi.Bool(true),
//				ValidationString:       pulumi.String("success"),
//				BypassHeadRequest:      pulumi.Bool(true),
//				VerifySsl:              pulumi.Bool(true),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
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
// ##### Type: `BROWSER`
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
//			location, err := synthetics.NewPrivateLocation(ctx, "location", &synthetics.PrivateLocationArgs{
//				Description:             pulumi.String("Example private location"),
//				Name:                    pulumi.String("private-location"),
//				VerifiedScriptExecution: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Type:   pulumi.String("BROWSER"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//				Name:   pulumi.String("monitor"),
//				Period: pulumi.String("EVERY_MINUTE"),
//				LocationsPrivates: pulumi.StringArray{
//					location.ID(),
//				},
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("some_name"),
//						Value: pulumi.String("some_value"),
//					},
//				},
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(true),
//				ValidationString:                   pulumi.String("success"),
//				VerifySsl:                          pulumi.Bool(true),
//				RuntimeTypeVersion:                 pulumi.String("100"),
//				RuntimeType:                        pulumi.String("CHROME_BROWSER"),
//				ScriptLanguage:                     pulumi.String("JAVASCRIPT"),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
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
// Synthetics monitor can be imported using the `guid`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:synthetics/monitor:Monitor monitor <guid>
// ```
type Monitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	//
	// The `BROWSER` monitor type supports the following additional arguments:
	BypassHeadRequest pulumi.BoolPtrOutput `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayOutput `pulumi:"customHeaders"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrOutput `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrOutput `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrOutput `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayOutput `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringOutput `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntOutput `pulumi:"periodInMinutes"`
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrOutput `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrOutput `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrOutput `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SIMPLE` monitor type supports the following additional arguments:
	Tags MonitorTagArrayOutput `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrOutput `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The URI the monitor runs against.
	Uri pulumi.StringPtrOutput `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrOutput `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl pulumi.BoolPtrOutput `pulumi:"verifySsl"`
}

// NewMonitor registers a new resource with the given unique name, arguments, and options.
func NewMonitor(ctx *pulumi.Context,
	name string, args *MonitorArgs, opts ...pulumi.ResourceOption) (*Monitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	//
	// The `BROWSER` monitor type supports the following additional arguments:
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
	CustomHeaders []MonitorCustomHeader `pulumi:"customHeaders"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation *string `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType *string `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes *int `pulumi:"periodInMinutes"`
	// The runtime type that the monitor will run.
	RuntimeType *string `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status *string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SIMPLE` monitor type supports the following additional arguments:
	Tags []MonitorTag `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type *string `pulumi:"type"`
	// The URI the monitor runs against.
	Uri *string `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString *string `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl *bool `pulumi:"verifySsl"`
}

type MonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// Monitor should skip default HEAD request and instead use GET verb in check.
	//
	// The `BROWSER` monitor type supports the following additional arguments:
	BypassHeadRequest pulumi.BoolPtrInput
	// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayInput
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrInput
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The human-readable identifier for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntPtrInput
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringPtrInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SIMPLE` monitor type supports the following additional arguments:
	Tags MonitorTagArrayInput
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringPtrInput
	// The URI the monitor runs against.
	Uri pulumi.StringPtrInput
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrInput
	// Monitor should validate SSL certificate chain.
	VerifySsl pulumi.BoolPtrInput
}

func (MonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorState)(nil)).Elem()
}

type monitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	//
	// The `BROWSER` monitor type supports the following additional arguments:
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
	CustomHeaders []MonitorCustomHeader `pulumi:"customHeaders"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation *string `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType *string `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The runtime type that the monitor will run.
	RuntimeType *string `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SIMPLE` monitor type supports the following additional arguments:
	Tags []MonitorTag `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type string `pulumi:"type"`
	// The URI the monitor runs against.
	Uri *string `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString *string `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl *bool `pulumi:"verifySsl"`
}

// The set of arguments for constructing a Monitor resource.
type MonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// Monitor should skip default HEAD request and instead use GET verb in check.
	//
	// The `BROWSER` monitor type supports the following additional arguments:
	BypassHeadRequest pulumi.BoolPtrInput
	// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayInput
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrInput
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The human-readable identifier for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SIMPLE` monitor type supports the following additional arguments:
	Tags MonitorTagArrayInput
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringInput
	// The URI the monitor runs against.
	Uri pulumi.StringPtrInput
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrInput
	// Monitor should validate SSL certificate chain.
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
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (i *Monitor) ToMonitorOutput() MonitorOutput {
	return i.ToMonitorOutputWithContext(context.Background())
}

func (i *Monitor) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorOutput)
}

// MonitorArrayInput is an input type that accepts MonitorArray and MonitorArrayOutput values.
// You can construct a concrete instance of `MonitorArrayInput` via:
//
//	MonitorArray{ MonitorArgs{...} }
type MonitorArrayInput interface {
	pulumi.Input

	ToMonitorArrayOutput() MonitorArrayOutput
	ToMonitorArrayOutputWithContext(context.Context) MonitorArrayOutput
}

type MonitorArray []MonitorInput

func (MonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
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
//	MonitorMap{ "key": MonitorArgs{...} }
type MonitorMapInput interface {
	pulumi.Input

	ToMonitorMapOutput() MonitorMapOutput
	ToMonitorMapOutputWithContext(context.Context) MonitorMapOutput
}

type MonitorMap map[string]MonitorInput

func (MonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (i MonitorMap) ToMonitorMapOutput() MonitorMapOutput {
	return i.ToMonitorMapOutputWithContext(context.Background())
}

func (i MonitorMap) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorMapOutput)
}

type MonitorOutput struct{ *pulumi.OutputState }

func (MonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (o MonitorOutput) ToMonitorOutput() MonitorOutput {
	return o
}

func (o MonitorOutput) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o MonitorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Monitor should skip default HEAD request and instead use GET verb in check.
//
// The `BROWSER` monitor type supports the following additional arguments:
func (o MonitorOutput) BypassHeadRequest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.BypassHeadRequest }).(pulumi.BoolPtrOutput)
}

// Custom headers to use in monitor job. See Nested customHeader blocks below for details.
func (o MonitorOutput) CustomHeaders() MonitorCustomHeaderArrayOutput {
	return o.ApplyT(func(v *Monitor) MonitorCustomHeaderArrayOutput { return v.CustomHeaders }).(MonitorCustomHeaderArrayOutput)
}

// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
func (o MonitorOutput) DeviceOrientation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.DeviceOrientation }).(pulumi.StringPtrOutput)
}

// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
func (o MonitorOutput) DeviceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.DeviceType }).(pulumi.StringPtrOutput)
}

// Capture a screenshot during job execution.
func (o MonitorOutput) EnableScreenshotOnFailureAndScript() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.EnableScreenshotOnFailureAndScript }).(pulumi.BoolPtrOutput)
}

// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
func (o MonitorOutput) LocationsPrivates() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringArrayOutput { return v.LocationsPrivates }).(pulumi.StringArrayOutput)
}

// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
func (o MonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The human-readable identifier for the monitor.
func (o MonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
func (o MonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The interval in minutes at which Synthetic monitor should run.
func (o MonitorOutput) PeriodInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *Monitor) pulumi.IntOutput { return v.PeriodInMinutes }).(pulumi.IntOutput)
}

// The runtime type that the monitor will run.
func (o MonitorOutput) RuntimeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.RuntimeType }).(pulumi.StringPtrOutput)
}

// The runtime type that the monitor will run.
func (o MonitorOutput) RuntimeTypeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.RuntimeTypeVersion }).(pulumi.StringPtrOutput)
}

// The programing language that should execute the script.
func (o MonitorOutput) ScriptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.ScriptLanguage }).(pulumi.StringPtrOutput)
}

// The monitor status (ENABLED or DISABLED).
func (o MonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details.
//
// The `SIMPLE` monitor type supports the following additional arguments:
func (o MonitorOutput) Tags() MonitorTagArrayOutput {
	return o.ApplyT(func(v *Monitor) MonitorTagArrayOutput { return v.Tags }).(MonitorTagArrayOutput)
}

// Categorize redirects during a monitor job as a failure.
func (o MonitorOutput) TreatRedirectAsFailure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.TreatRedirectAsFailure }).(pulumi.BoolPtrOutput)
}

// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
func (o MonitorOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The URI the monitor runs against.
func (o MonitorOutput) Uri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.Uri }).(pulumi.StringPtrOutput)
}

// Validation text for monitor to search for at given URI.
func (o MonitorOutput) ValidationString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.ValidationString }).(pulumi.StringPtrOutput)
}

// Monitor should validate SSL certificate chain.
func (o MonitorOutput) VerifySsl() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.VerifySsl }).(pulumi.BoolPtrOutput)
}

type MonitorArrayOutput struct{ *pulumi.OutputState }

func (MonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
}

func (o MonitorArrayOutput) ToMonitorArrayOutput() MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) Index(i pulumi.IntInput) MonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].([]*Monitor)[vs[1].(int)]
	}).(MonitorOutput)
}

type MonitorMapOutput struct{ *pulumi.OutputState }

func (MonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (o MonitorMapOutput) ToMonitorMapOutput() MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) MapIndex(k pulumi.StringInput) MonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].(map[string]*Monitor)[vs[1].(string)]
	}).(MonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorInput)(nil)).Elem(), &Monitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorArrayInput)(nil)).Elem(), MonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorMapInput)(nil)).Elem(), MonitorMap{})
	pulumi.RegisterOutputType(MonitorOutput{})
	pulumi.RegisterOutputType(MonitorArrayOutput{})
	pulumi.RegisterOutputType(MonitorMapOutput{})
}
