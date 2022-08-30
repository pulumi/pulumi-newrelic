// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package plugins

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **NOTE:** Applications are not created by this resource, but are created by
// a reporting agent.
//
// Use this resource to manage configuration for an application that already
// exists in New Relic.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/plugins"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := plugins.NewApplicationSettings(ctx, "app", &plugins.ApplicationSettingsArgs{
//				AppApdexThreshold:        pulumi.Float64(0.7),
//				EnableRealUserMonitoring: pulumi.Bool(false),
//				EndUserApdexThreshold:    pulumi.Float64(0.8),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Notes
//
// > **NOTE:** Applications that have reported data in the last twelve hours
// cannot be deleted.
//
// ## Import
//
// Applications can be imported using notation `application_id`, e.g.
//
// ```sh
//
//	$ pulumi import newrelic:plugins/applicationSettings:ApplicationSettings main 6789012345
//
// ```
type ApplicationSettings struct {
	pulumi.CustomResourceState

	// The appex threshold for the New Relic application.
	AppApdexThreshold pulumi.Float64Output `pulumi:"appApdexThreshold"`
	// Enable or disable real user monitoring for the New Relic application.
	EnableRealUserMonitoring pulumi.BoolOutput `pulumi:"enableRealUserMonitoring"`
	// The user's apdex threshold for the New Relic application.
	EndUserApdexThreshold pulumi.Float64Output `pulumi:"endUserApdexThreshold"`
	// The name of the application in New Relic APM.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewApplicationSettings registers a new resource with the given unique name, arguments, and options.
func NewApplicationSettings(ctx *pulumi.Context,
	name string, args *ApplicationSettingsArgs, opts ...pulumi.ResourceOption) (*ApplicationSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppApdexThreshold == nil {
		return nil, errors.New("invalid value for required argument 'AppApdexThreshold'")
	}
	if args.EnableRealUserMonitoring == nil {
		return nil, errors.New("invalid value for required argument 'EnableRealUserMonitoring'")
	}
	if args.EndUserApdexThreshold == nil {
		return nil, errors.New("invalid value for required argument 'EndUserApdexThreshold'")
	}
	var resource ApplicationSettings
	err := ctx.RegisterResource("newrelic:plugins/applicationSettings:ApplicationSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationSettings gets an existing ApplicationSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationSettingsState, opts ...pulumi.ResourceOption) (*ApplicationSettings, error) {
	var resource ApplicationSettings
	err := ctx.ReadResource("newrelic:plugins/applicationSettings:ApplicationSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationSettings resources.
type applicationSettingsState struct {
	// The appex threshold for the New Relic application.
	AppApdexThreshold *float64 `pulumi:"appApdexThreshold"`
	// Enable or disable real user monitoring for the New Relic application.
	EnableRealUserMonitoring *bool `pulumi:"enableRealUserMonitoring"`
	// The user's apdex threshold for the New Relic application.
	EndUserApdexThreshold *float64 `pulumi:"endUserApdexThreshold"`
	// The name of the application in New Relic APM.
	Name *string `pulumi:"name"`
}

type ApplicationSettingsState struct {
	// The appex threshold for the New Relic application.
	AppApdexThreshold pulumi.Float64PtrInput
	// Enable or disable real user monitoring for the New Relic application.
	EnableRealUserMonitoring pulumi.BoolPtrInput
	// The user's apdex threshold for the New Relic application.
	EndUserApdexThreshold pulumi.Float64PtrInput
	// The name of the application in New Relic APM.
	Name pulumi.StringPtrInput
}

func (ApplicationSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSettingsState)(nil)).Elem()
}

type applicationSettingsArgs struct {
	// The appex threshold for the New Relic application.
	AppApdexThreshold float64 `pulumi:"appApdexThreshold"`
	// Enable or disable real user monitoring for the New Relic application.
	EnableRealUserMonitoring bool `pulumi:"enableRealUserMonitoring"`
	// The user's apdex threshold for the New Relic application.
	EndUserApdexThreshold float64 `pulumi:"endUserApdexThreshold"`
	// The name of the application in New Relic APM.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ApplicationSettings resource.
type ApplicationSettingsArgs struct {
	// The appex threshold for the New Relic application.
	AppApdexThreshold pulumi.Float64Input
	// Enable or disable real user monitoring for the New Relic application.
	EnableRealUserMonitoring pulumi.BoolInput
	// The user's apdex threshold for the New Relic application.
	EndUserApdexThreshold pulumi.Float64Input
	// The name of the application in New Relic APM.
	Name pulumi.StringPtrInput
}

func (ApplicationSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSettingsArgs)(nil)).Elem()
}

type ApplicationSettingsInput interface {
	pulumi.Input

	ToApplicationSettingsOutput() ApplicationSettingsOutput
	ToApplicationSettingsOutputWithContext(ctx context.Context) ApplicationSettingsOutput
}

func (*ApplicationSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSettings)(nil)).Elem()
}

func (i *ApplicationSettings) ToApplicationSettingsOutput() ApplicationSettingsOutput {
	return i.ToApplicationSettingsOutputWithContext(context.Background())
}

func (i *ApplicationSettings) ToApplicationSettingsOutputWithContext(ctx context.Context) ApplicationSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSettingsOutput)
}

// ApplicationSettingsArrayInput is an input type that accepts ApplicationSettingsArray and ApplicationSettingsArrayOutput values.
// You can construct a concrete instance of `ApplicationSettingsArrayInput` via:
//
//	ApplicationSettingsArray{ ApplicationSettingsArgs{...} }
type ApplicationSettingsArrayInput interface {
	pulumi.Input

	ToApplicationSettingsArrayOutput() ApplicationSettingsArrayOutput
	ToApplicationSettingsArrayOutputWithContext(context.Context) ApplicationSettingsArrayOutput
}

type ApplicationSettingsArray []ApplicationSettingsInput

func (ApplicationSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSettings)(nil)).Elem()
}

func (i ApplicationSettingsArray) ToApplicationSettingsArrayOutput() ApplicationSettingsArrayOutput {
	return i.ToApplicationSettingsArrayOutputWithContext(context.Background())
}

func (i ApplicationSettingsArray) ToApplicationSettingsArrayOutputWithContext(ctx context.Context) ApplicationSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSettingsArrayOutput)
}

// ApplicationSettingsMapInput is an input type that accepts ApplicationSettingsMap and ApplicationSettingsMapOutput values.
// You can construct a concrete instance of `ApplicationSettingsMapInput` via:
//
//	ApplicationSettingsMap{ "key": ApplicationSettingsArgs{...} }
type ApplicationSettingsMapInput interface {
	pulumi.Input

	ToApplicationSettingsMapOutput() ApplicationSettingsMapOutput
	ToApplicationSettingsMapOutputWithContext(context.Context) ApplicationSettingsMapOutput
}

type ApplicationSettingsMap map[string]ApplicationSettingsInput

func (ApplicationSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSettings)(nil)).Elem()
}

func (i ApplicationSettingsMap) ToApplicationSettingsMapOutput() ApplicationSettingsMapOutput {
	return i.ToApplicationSettingsMapOutputWithContext(context.Background())
}

func (i ApplicationSettingsMap) ToApplicationSettingsMapOutputWithContext(ctx context.Context) ApplicationSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSettingsMapOutput)
}

type ApplicationSettingsOutput struct{ *pulumi.OutputState }

func (ApplicationSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSettings)(nil)).Elem()
}

func (o ApplicationSettingsOutput) ToApplicationSettingsOutput() ApplicationSettingsOutput {
	return o
}

func (o ApplicationSettingsOutput) ToApplicationSettingsOutputWithContext(ctx context.Context) ApplicationSettingsOutput {
	return o
}

// The appex threshold for the New Relic application.
func (o ApplicationSettingsOutput) AppApdexThreshold() pulumi.Float64Output {
	return o.ApplyT(func(v *ApplicationSettings) pulumi.Float64Output { return v.AppApdexThreshold }).(pulumi.Float64Output)
}

// Enable or disable real user monitoring for the New Relic application.
func (o ApplicationSettingsOutput) EnableRealUserMonitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v *ApplicationSettings) pulumi.BoolOutput { return v.EnableRealUserMonitoring }).(pulumi.BoolOutput)
}

// The user's apdex threshold for the New Relic application.
func (o ApplicationSettingsOutput) EndUserApdexThreshold() pulumi.Float64Output {
	return o.ApplyT(func(v *ApplicationSettings) pulumi.Float64Output { return v.EndUserApdexThreshold }).(pulumi.Float64Output)
}

// The name of the application in New Relic APM.
func (o ApplicationSettingsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSettings) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ApplicationSettingsArrayOutput struct{ *pulumi.OutputState }

func (ApplicationSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSettings)(nil)).Elem()
}

func (o ApplicationSettingsArrayOutput) ToApplicationSettingsArrayOutput() ApplicationSettingsArrayOutput {
	return o
}

func (o ApplicationSettingsArrayOutput) ToApplicationSettingsArrayOutputWithContext(ctx context.Context) ApplicationSettingsArrayOutput {
	return o
}

func (o ApplicationSettingsArrayOutput) Index(i pulumi.IntInput) ApplicationSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationSettings {
		return vs[0].([]*ApplicationSettings)[vs[1].(int)]
	}).(ApplicationSettingsOutput)
}

type ApplicationSettingsMapOutput struct{ *pulumi.OutputState }

func (ApplicationSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSettings)(nil)).Elem()
}

func (o ApplicationSettingsMapOutput) ToApplicationSettingsMapOutput() ApplicationSettingsMapOutput {
	return o
}

func (o ApplicationSettingsMapOutput) ToApplicationSettingsMapOutputWithContext(ctx context.Context) ApplicationSettingsMapOutput {
	return o
}

func (o ApplicationSettingsMapOutput) MapIndex(k pulumi.StringInput) ApplicationSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationSettings {
		return vs[0].(map[string]*ApplicationSettings)[vs[1].(string)]
	}).(ApplicationSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSettingsInput)(nil)).Elem(), &ApplicationSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSettingsArrayInput)(nil)).Elem(), ApplicationSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSettingsMapInput)(nil)).Elem(), ApplicationSettingsMap{})
	pulumi.RegisterOutputType(ApplicationSettingsOutput{})
	pulumi.RegisterOutputType(ApplicationSettingsArrayOutput{})
	pulumi.RegisterOutputType(ApplicationSettingsMapOutput{})
}
