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
// ##### Type: `SCRIPT_API`
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
//			_, err := synthetics.NewScriptMonitor(ctx, "monitor", &synthetics.ScriptMonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("script_monitor"),
//				Type:   pulumi.String("SCRIPT_API"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//					pulumi.String("AP_EAST_1"),
//				},
//				Period:             pulumi.String("EVERY_6_HOURS"),
//				Script:             pulumi.String("console.log('it works!')"),
//				ScriptLanguage:     pulumi.String("JAVASCRIPT"),
//				RuntimeType:        pulumi.String("NODE_API"),
//				RuntimeTypeVersion: pulumi.String("16.10"),
//				Tags: synthetics.ScriptMonitorTagArray{
//					&synthetics.ScriptMonitorTagArgs{
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
// ##### Type: `SCRIPT_BROWSER`
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
//			_, err := synthetics.NewScriptMonitor(ctx, "monitor", &synthetics.ScriptMonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("script_monitor"),
//				Type:   pulumi.String("SCRIPT_BROWSER"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//					pulumi.String("AP_EAST_1"),
//				},
//				Period:                             pulumi.String("EVERY_HOUR"),
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(false),
//				Script:                             pulumi.String("$browser.get('https://one.newrelic.com')"),
//				RuntimeTypeVersion:                 pulumi.String("100"),
//				RuntimeType:                        pulumi.String("CHROME_BROWSER"),
//				ScriptLanguage:                     pulumi.String("JAVASCRIPT"),
//				Tags: synthetics.ScriptMonitorTagArray{
//					&synthetics.ScriptMonitorTagArgs{
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
// ##### Type: `SCRIPT_API`
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
//				VerifiedScriptExecution: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewScriptMonitor(ctx, "monitor", &synthetics.ScriptMonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Name:   pulumi.String("script_monitor"),
//				Type:   pulumi.String("SCRIPT_API"),
//				LocationPrivates: synthetics.ScriptMonitorLocationPrivateArray{
//					&synthetics.ScriptMonitorLocationPrivateArgs{
//						Guid:        location.ID(),
//						VsePassword: pulumi.String("secret"),
//					},
//				},
//				Period:             pulumi.String("EVERY_6_HOURS"),
//				Script:             pulumi.String("console.log('terraform integration test updated')"),
//				ScriptLanguage:     pulumi.String("JAVASCRIPT"),
//				RuntimeType:        pulumi.String("NODE_API"),
//				RuntimeTypeVersion: pulumi.String("16.10"),
//				Tags: synthetics.ScriptMonitorTagArray{
//					&synthetics.ScriptMonitorTagArgs{
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
// ##### Type: `SCRIPT_BROWSER`
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
//				Description:             pulumi.String("Test Description"),
//				Name:                    pulumi.String("private_location"),
//				VerifiedScriptExecution: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewScriptMonitor(ctx, "monitor", &synthetics.ScriptMonitorArgs{
//				Status:                             pulumi.String("ENABLED"),
//				Name:                               pulumi.String("script_monitor"),
//				Type:                               pulumi.String("SCRIPT_BROWSER"),
//				Period:                             pulumi.String("EVERY_HOUR"),
//				Script:                             pulumi.String("$browser.get('https://one.newrelic.com')"),
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(false),
//				LocationPrivates: synthetics.ScriptMonitorLocationPrivateArray{
//					&synthetics.ScriptMonitorLocationPrivateArgs{
//						Guid:        location.ID(),
//						VsePassword: pulumi.String("secret"),
//					},
//				},
//				RuntimeTypeVersion: pulumi.String("100"),
//				RuntimeType:        pulumi.String("CHROME_BROWSER"),
//				ScriptLanguage:     pulumi.String("JAVASCRIPT"),
//				DeviceType:         pulumi.String("MOBILE"),
//				DeviceOrientation:  pulumi.String("LANDSCAPE"),
//				Tags: synthetics.ScriptMonitorTagArray{
//					&synthetics.ScriptMonitorTagArgs{
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
// Synthetics monitor scripts can be imported using the `guid`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:synthetics/scriptMonitor:ScriptMonitor monitor <guid>
// ```
type ScriptMonitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrOutput `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrOutput `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrOutput `pulumi:"enableScreenshotOnFailureAndScript"`
	// The unique entity identifier of the monitor in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationPrivates ScriptMonitorLocationPrivateArrayOutput `pulumi:"locationPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringOutput `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntOutput `pulumi:"periodInMinutes"`
	// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
	RuntimeType pulumi.StringPtrOutput `pulumi:"runtimeType"`
	// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
	RuntimeTypeVersion pulumi.StringPtrOutput `pulumi:"runtimeTypeVersion"`
	// The script that the monitor runs.
	Script pulumi.StringPtrOutput `pulumi:"script"`
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrOutput `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
	Tags ScriptMonitorTagArrayOutput `pulumi:"tags"`
	// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
	Type                        pulumi.StringOutput  `pulumi:"type"`
	UseUnsupportedLegacyRuntime pulumi.BoolPtrOutput `pulumi:"useUnsupportedLegacyRuntime"`
}

// NewScriptMonitor registers a new resource with the given unique name, arguments, and options.
func NewScriptMonitor(ctx *pulumi.Context,
	name string, args *ScriptMonitorArgs, opts ...pulumi.ResourceOption) (*ScriptMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScriptMonitor
	err := ctx.RegisterResource("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScriptMonitor gets an existing ScriptMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScriptMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScriptMonitorState, opts ...pulumi.ResourceOption) (*ScriptMonitor, error) {
	var resource ScriptMonitor
	err := ctx.ReadResource("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScriptMonitor resources.
type scriptMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation *string `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType *string `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The unique entity identifier of the monitor in New Relic.
	Guid *string `pulumi:"guid"`
	// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationPrivates []ScriptMonitorLocationPrivate `pulumi:"locationPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period *string `pulumi:"period"`
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes *int `pulumi:"periodInMinutes"`
	// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
	RuntimeType *string `pulumi:"runtimeType"`
	// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The script that the monitor runs.
	Script *string `pulumi:"script"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status *string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
	Tags []ScriptMonitorTag `pulumi:"tags"`
	// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
	Type                        *string `pulumi:"type"`
	UseUnsupportedLegacyRuntime *bool   `pulumi:"useUnsupportedLegacyRuntime"`
}

type ScriptMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrInput
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The unique entity identifier of the monitor in New Relic.
	Guid pulumi.StringPtrInput
	// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationPrivates ScriptMonitorLocationPrivateArrayInput
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringPtrInput
	// The interval in minutes at which Synthetic monitor should run.
	PeriodInMinutes pulumi.IntPtrInput
	// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
	RuntimeType pulumi.StringPtrInput
	// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The script that the monitor runs.
	Script pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringPtrInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
	Tags ScriptMonitorTagArrayInput
	// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
	Type                        pulumi.StringPtrInput
	UseUnsupportedLegacyRuntime pulumi.BoolPtrInput
}

func (ScriptMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptMonitorState)(nil)).Elem()
}

type scriptMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *string `pulumi:"accountId"`
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation *string `pulumi:"deviceOrientation"`
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType *string `pulumi:"deviceType"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationPrivates []ScriptMonitorLocationPrivate `pulumi:"locationPrivates"`
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period string `pulumi:"period"`
	// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
	RuntimeType *string `pulumi:"runtimeType"`
	// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The script that the monitor runs.
	Script *string `pulumi:"script"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The monitor status (ENABLED or DISABLED).
	Status string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
	Tags []ScriptMonitorTag `pulumi:"tags"`
	// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
	Type                        string `pulumi:"type"`
	UseUnsupportedLegacyRuntime *bool  `pulumi:"useUnsupportedLegacyRuntime"`
}

// The set of arguments for constructing a ScriptMonitor resource.
type ScriptMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.StringPtrInput
	// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
	DeviceOrientation pulumi.StringPtrInput
	// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
	DeviceType pulumi.StringPtrInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationPrivates ScriptMonitorLocationPrivateArrayInput
	// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
	Period pulumi.StringInput
	// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
	RuntimeType pulumi.StringPtrInput
	// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The script that the monitor runs.
	Script pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The monitor status (ENABLED or DISABLED).
	Status pulumi.StringInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	//
	// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
	Tags ScriptMonitorTagArrayInput
	// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
	Type                        pulumi.StringInput
	UseUnsupportedLegacyRuntime pulumi.BoolPtrInput
}

func (ScriptMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptMonitorArgs)(nil)).Elem()
}

type ScriptMonitorInput interface {
	pulumi.Input

	ToScriptMonitorOutput() ScriptMonitorOutput
	ToScriptMonitorOutputWithContext(ctx context.Context) ScriptMonitorOutput
}

func (*ScriptMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**ScriptMonitor)(nil)).Elem()
}

func (i *ScriptMonitor) ToScriptMonitorOutput() ScriptMonitorOutput {
	return i.ToScriptMonitorOutputWithContext(context.Background())
}

func (i *ScriptMonitor) ToScriptMonitorOutputWithContext(ctx context.Context) ScriptMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptMonitorOutput)
}

// ScriptMonitorArrayInput is an input type that accepts ScriptMonitorArray and ScriptMonitorArrayOutput values.
// You can construct a concrete instance of `ScriptMonitorArrayInput` via:
//
//	ScriptMonitorArray{ ScriptMonitorArgs{...} }
type ScriptMonitorArrayInput interface {
	pulumi.Input

	ToScriptMonitorArrayOutput() ScriptMonitorArrayOutput
	ToScriptMonitorArrayOutputWithContext(context.Context) ScriptMonitorArrayOutput
}

type ScriptMonitorArray []ScriptMonitorInput

func (ScriptMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScriptMonitor)(nil)).Elem()
}

func (i ScriptMonitorArray) ToScriptMonitorArrayOutput() ScriptMonitorArrayOutput {
	return i.ToScriptMonitorArrayOutputWithContext(context.Background())
}

func (i ScriptMonitorArray) ToScriptMonitorArrayOutputWithContext(ctx context.Context) ScriptMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptMonitorArrayOutput)
}

// ScriptMonitorMapInput is an input type that accepts ScriptMonitorMap and ScriptMonitorMapOutput values.
// You can construct a concrete instance of `ScriptMonitorMapInput` via:
//
//	ScriptMonitorMap{ "key": ScriptMonitorArgs{...} }
type ScriptMonitorMapInput interface {
	pulumi.Input

	ToScriptMonitorMapOutput() ScriptMonitorMapOutput
	ToScriptMonitorMapOutputWithContext(context.Context) ScriptMonitorMapOutput
}

type ScriptMonitorMap map[string]ScriptMonitorInput

func (ScriptMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScriptMonitor)(nil)).Elem()
}

func (i ScriptMonitorMap) ToScriptMonitorMapOutput() ScriptMonitorMapOutput {
	return i.ToScriptMonitorMapOutputWithContext(context.Background())
}

func (i ScriptMonitorMap) ToScriptMonitorMapOutputWithContext(ctx context.Context) ScriptMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptMonitorMapOutput)
}

type ScriptMonitorOutput struct{ *pulumi.OutputState }

func (ScriptMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScriptMonitor)(nil)).Elem()
}

func (o ScriptMonitorOutput) ToScriptMonitorOutput() ScriptMonitorOutput {
	return o
}

func (o ScriptMonitorOutput) ToScriptMonitorOutputWithContext(ctx context.Context) ScriptMonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o ScriptMonitorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
func (o ScriptMonitorOutput) DeviceOrientation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.DeviceOrientation }).(pulumi.StringPtrOutput)
}

// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
func (o ScriptMonitorOutput) DeviceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.DeviceType }).(pulumi.StringPtrOutput)
}

// Capture a screenshot during job execution.
func (o ScriptMonitorOutput) EnableScreenshotOnFailureAndScript() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.BoolPtrOutput { return v.EnableScreenshotOnFailureAndScript }).(pulumi.BoolPtrOutput)
}

// The unique entity identifier of the monitor in New Relic.
func (o ScriptMonitorOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
func (o ScriptMonitorOutput) LocationPrivates() ScriptMonitorLocationPrivateArrayOutput {
	return o.ApplyT(func(v *ScriptMonitor) ScriptMonitorLocationPrivateArrayOutput { return v.LocationPrivates }).(ScriptMonitorLocationPrivateArrayOutput)
}

// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
func (o ScriptMonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The name for the monitor.
func (o ScriptMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
func (o ScriptMonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The interval in minutes at which Synthetic monitor should run.
func (o ScriptMonitorOutput) PeriodInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.IntOutput { return v.PeriodInMinutes }).(pulumi.IntOutput)
}

// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
func (o ScriptMonitorOutput) RuntimeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.RuntimeType }).(pulumi.StringPtrOutput)
}

// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
func (o ScriptMonitorOutput) RuntimeTypeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.RuntimeTypeVersion }).(pulumi.StringPtrOutput)
}

// The script that the monitor runs.
func (o ScriptMonitorOutput) Script() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.Script }).(pulumi.StringPtrOutput)
}

// The programing language that should execute the script.
func (o ScriptMonitorOutput) ScriptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringPtrOutput { return v.ScriptLanguage }).(pulumi.StringPtrOutput)
}

// The monitor status (ENABLED or DISABLED).
func (o ScriptMonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details.
//
// The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
func (o ScriptMonitorOutput) Tags() ScriptMonitorTagArrayOutput {
	return o.ApplyT(func(v *ScriptMonitor) ScriptMonitorTagArrayOutput { return v.Tags }).(ScriptMonitorTagArrayOutput)
}

// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
func (o ScriptMonitorOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o ScriptMonitorOutput) UseUnsupportedLegacyRuntime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ScriptMonitor) pulumi.BoolPtrOutput { return v.UseUnsupportedLegacyRuntime }).(pulumi.BoolPtrOutput)
}

type ScriptMonitorArrayOutput struct{ *pulumi.OutputState }

func (ScriptMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScriptMonitor)(nil)).Elem()
}

func (o ScriptMonitorArrayOutput) ToScriptMonitorArrayOutput() ScriptMonitorArrayOutput {
	return o
}

func (o ScriptMonitorArrayOutput) ToScriptMonitorArrayOutputWithContext(ctx context.Context) ScriptMonitorArrayOutput {
	return o
}

func (o ScriptMonitorArrayOutput) Index(i pulumi.IntInput) ScriptMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScriptMonitor {
		return vs[0].([]*ScriptMonitor)[vs[1].(int)]
	}).(ScriptMonitorOutput)
}

type ScriptMonitorMapOutput struct{ *pulumi.OutputState }

func (ScriptMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScriptMonitor)(nil)).Elem()
}

func (o ScriptMonitorMapOutput) ToScriptMonitorMapOutput() ScriptMonitorMapOutput {
	return o
}

func (o ScriptMonitorMapOutput) ToScriptMonitorMapOutputWithContext(ctx context.Context) ScriptMonitorMapOutput {
	return o
}

func (o ScriptMonitorMapOutput) MapIndex(k pulumi.StringInput) ScriptMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScriptMonitor {
		return vs[0].(map[string]*ScriptMonitor)[vs[1].(string)]
	}).(ScriptMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptMonitorInput)(nil)).Elem(), &ScriptMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptMonitorArrayInput)(nil)).Elem(), ScriptMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScriptMonitorMapInput)(nil)).Elem(), ScriptMonitorMap{})
	pulumi.RegisterOutputType(ScriptMonitorOutput{})
	pulumi.RegisterOutputType(ScriptMonitorArrayOutput{})
	pulumi.RegisterOutputType(ScriptMonitorMapOutput{})
}
