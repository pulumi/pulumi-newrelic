// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MonitorScriptLocation struct {
	// The monitor script authentication code for the location.
	Hmac *string `pulumi:"hmac"`
	// The monitor script location name.
	Name        string  `pulumi:"name"`
	VsePassword *string `pulumi:"vsePassword"`
}

// MonitorScriptLocationInput is an input type that accepts MonitorScriptLocationArgs and MonitorScriptLocationOutput values.
// You can construct a concrete instance of `MonitorScriptLocationInput` via:
//
//          MonitorScriptLocationArgs{...}
type MonitorScriptLocationInput interface {
	pulumi.Input

	ToMonitorScriptLocationOutput() MonitorScriptLocationOutput
	ToMonitorScriptLocationOutputWithContext(context.Context) MonitorScriptLocationOutput
}

type MonitorScriptLocationArgs struct {
	// The monitor script authentication code for the location.
	Hmac pulumi.StringPtrInput `pulumi:"hmac"`
	// The monitor script location name.
	Name        pulumi.StringInput    `pulumi:"name"`
	VsePassword pulumi.StringPtrInput `pulumi:"vsePassword"`
}

func (MonitorScriptLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorScriptLocation)(nil)).Elem()
}

func (i MonitorScriptLocationArgs) ToMonitorScriptLocationOutput() MonitorScriptLocationOutput {
	return i.ToMonitorScriptLocationOutputWithContext(context.Background())
}

func (i MonitorScriptLocationArgs) ToMonitorScriptLocationOutputWithContext(ctx context.Context) MonitorScriptLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptLocationOutput)
}

// MonitorScriptLocationArrayInput is an input type that accepts MonitorScriptLocationArray and MonitorScriptLocationArrayOutput values.
// You can construct a concrete instance of `MonitorScriptLocationArrayInput` via:
//
//          MonitorScriptLocationArray{ MonitorScriptLocationArgs{...} }
type MonitorScriptLocationArrayInput interface {
	pulumi.Input

	ToMonitorScriptLocationArrayOutput() MonitorScriptLocationArrayOutput
	ToMonitorScriptLocationArrayOutputWithContext(context.Context) MonitorScriptLocationArrayOutput
}

type MonitorScriptLocationArray []MonitorScriptLocationInput

func (MonitorScriptLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]MonitorScriptLocation)(nil)).Elem()
}

func (i MonitorScriptLocationArray) ToMonitorScriptLocationArrayOutput() MonitorScriptLocationArrayOutput {
	return i.ToMonitorScriptLocationArrayOutputWithContext(context.Background())
}

func (i MonitorScriptLocationArray) ToMonitorScriptLocationArrayOutputWithContext(ctx context.Context) MonitorScriptLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptLocationArrayOutput)
}

type MonitorScriptLocationOutput struct{ *pulumi.OutputState }

func (MonitorScriptLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorScriptLocation)(nil)).Elem()
}

func (o MonitorScriptLocationOutput) ToMonitorScriptLocationOutput() MonitorScriptLocationOutput {
	return o
}

func (o MonitorScriptLocationOutput) ToMonitorScriptLocationOutputWithContext(ctx context.Context) MonitorScriptLocationOutput {
	return o
}

// The monitor script authentication code for the location.
func (o MonitorScriptLocationOutput) Hmac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v MonitorScriptLocation) *string { return v.Hmac }).(pulumi.StringPtrOutput)
}

// The monitor script location name.
func (o MonitorScriptLocationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v MonitorScriptLocation) string { return v.Name }).(pulumi.StringOutput)
}

func (o MonitorScriptLocationOutput) VsePassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v MonitorScriptLocation) *string { return v.VsePassword }).(pulumi.StringPtrOutput)
}

type MonitorScriptLocationArrayOutput struct{ *pulumi.OutputState }

func (MonitorScriptLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]MonitorScriptLocation)(nil)).Elem()
}

func (o MonitorScriptLocationArrayOutput) ToMonitorScriptLocationArrayOutput() MonitorScriptLocationArrayOutput {
	return o
}

func (o MonitorScriptLocationArrayOutput) ToMonitorScriptLocationArrayOutputWithContext(ctx context.Context) MonitorScriptLocationArrayOutput {
	return o
}

func (o MonitorScriptLocationArrayOutput) Index(i pulumi.IntInput) MonitorScriptLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) MonitorScriptLocation {
		return vs[0].([]MonitorScriptLocation)[vs[1].(int)]
	}).(MonitorScriptLocationOutput)
}

type MultiLocationAlertConditionCritical struct {
	Threshold int `pulumi:"threshold"`
}

// MultiLocationAlertConditionCriticalInput is an input type that accepts MultiLocationAlertConditionCriticalArgs and MultiLocationAlertConditionCriticalOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionCriticalInput` via:
//
//          MultiLocationAlertConditionCriticalArgs{...}
type MultiLocationAlertConditionCriticalInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionCriticalOutput() MultiLocationAlertConditionCriticalOutput
	ToMultiLocationAlertConditionCriticalOutputWithContext(context.Context) MultiLocationAlertConditionCriticalOutput
}

type MultiLocationAlertConditionCriticalArgs struct {
	Threshold pulumi.IntInput `pulumi:"threshold"`
}

func (MultiLocationAlertConditionCriticalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiLocationAlertConditionCritical)(nil)).Elem()
}

func (i MultiLocationAlertConditionCriticalArgs) ToMultiLocationAlertConditionCriticalOutput() MultiLocationAlertConditionCriticalOutput {
	return i.ToMultiLocationAlertConditionCriticalOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionCriticalArgs) ToMultiLocationAlertConditionCriticalOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionCriticalOutput)
}

func (i MultiLocationAlertConditionCriticalArgs) ToMultiLocationAlertConditionCriticalPtrOutput() MultiLocationAlertConditionCriticalPtrOutput {
	return i.ToMultiLocationAlertConditionCriticalPtrOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionCriticalArgs) ToMultiLocationAlertConditionCriticalPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionCriticalOutput).ToMultiLocationAlertConditionCriticalPtrOutputWithContext(ctx)
}

// MultiLocationAlertConditionCriticalPtrInput is an input type that accepts MultiLocationAlertConditionCriticalArgs, MultiLocationAlertConditionCriticalPtr and MultiLocationAlertConditionCriticalPtrOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionCriticalPtrInput` via:
//
//          MultiLocationAlertConditionCriticalArgs{...}
//
//  or:
//
//          nil
type MultiLocationAlertConditionCriticalPtrInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionCriticalPtrOutput() MultiLocationAlertConditionCriticalPtrOutput
	ToMultiLocationAlertConditionCriticalPtrOutputWithContext(context.Context) MultiLocationAlertConditionCriticalPtrOutput
}

type multiLocationAlertConditionCriticalPtrType MultiLocationAlertConditionCriticalArgs

func MultiLocationAlertConditionCriticalPtr(v *MultiLocationAlertConditionCriticalArgs) MultiLocationAlertConditionCriticalPtrInput {
	return (*multiLocationAlertConditionCriticalPtrType)(v)
}

func (*multiLocationAlertConditionCriticalPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertConditionCritical)(nil)).Elem()
}

func (i *multiLocationAlertConditionCriticalPtrType) ToMultiLocationAlertConditionCriticalPtrOutput() MultiLocationAlertConditionCriticalPtrOutput {
	return i.ToMultiLocationAlertConditionCriticalPtrOutputWithContext(context.Background())
}

func (i *multiLocationAlertConditionCriticalPtrType) ToMultiLocationAlertConditionCriticalPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionCriticalPtrOutput)
}

type MultiLocationAlertConditionCriticalOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionCriticalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiLocationAlertConditionCritical)(nil)).Elem()
}

func (o MultiLocationAlertConditionCriticalOutput) ToMultiLocationAlertConditionCriticalOutput() MultiLocationAlertConditionCriticalOutput {
	return o
}

func (o MultiLocationAlertConditionCriticalOutput) ToMultiLocationAlertConditionCriticalOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalOutput {
	return o
}

func (o MultiLocationAlertConditionCriticalOutput) ToMultiLocationAlertConditionCriticalPtrOutput() MultiLocationAlertConditionCriticalPtrOutput {
	return o.ToMultiLocationAlertConditionCriticalPtrOutputWithContext(context.Background())
}

func (o MultiLocationAlertConditionCriticalOutput) ToMultiLocationAlertConditionCriticalPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v MultiLocationAlertConditionCritical) *MultiLocationAlertConditionCritical {
		return &v
	}).(MultiLocationAlertConditionCriticalPtrOutput)
}

func (o MultiLocationAlertConditionCriticalOutput) Threshold() pulumi.IntOutput {
	return o.ApplyT(func(v MultiLocationAlertConditionCritical) int { return v.Threshold }).(pulumi.IntOutput)
}

type MultiLocationAlertConditionCriticalPtrOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionCriticalPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertConditionCritical)(nil)).Elem()
}

func (o MultiLocationAlertConditionCriticalPtrOutput) ToMultiLocationAlertConditionCriticalPtrOutput() MultiLocationAlertConditionCriticalPtrOutput {
	return o
}

func (o MultiLocationAlertConditionCriticalPtrOutput) ToMultiLocationAlertConditionCriticalPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionCriticalPtrOutput {
	return o
}

func (o MultiLocationAlertConditionCriticalPtrOutput) Elem() MultiLocationAlertConditionCriticalOutput {
	return o.ApplyT(func(v *MultiLocationAlertConditionCritical) MultiLocationAlertConditionCritical {
		if v != nil {
			return *v
		}
		var ret MultiLocationAlertConditionCritical
		return ret
	}).(MultiLocationAlertConditionCriticalOutput)
}

func (o MultiLocationAlertConditionCriticalPtrOutput) Threshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertConditionCritical) *int {
		if v == nil {
			return nil
		}
		return &v.Threshold
	}).(pulumi.IntPtrOutput)
}

type MultiLocationAlertConditionWarning struct {
	Threshold int `pulumi:"threshold"`
}

// MultiLocationAlertConditionWarningInput is an input type that accepts MultiLocationAlertConditionWarningArgs and MultiLocationAlertConditionWarningOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionWarningInput` via:
//
//          MultiLocationAlertConditionWarningArgs{...}
type MultiLocationAlertConditionWarningInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionWarningOutput() MultiLocationAlertConditionWarningOutput
	ToMultiLocationAlertConditionWarningOutputWithContext(context.Context) MultiLocationAlertConditionWarningOutput
}

type MultiLocationAlertConditionWarningArgs struct {
	Threshold pulumi.IntInput `pulumi:"threshold"`
}

func (MultiLocationAlertConditionWarningArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiLocationAlertConditionWarning)(nil)).Elem()
}

func (i MultiLocationAlertConditionWarningArgs) ToMultiLocationAlertConditionWarningOutput() MultiLocationAlertConditionWarningOutput {
	return i.ToMultiLocationAlertConditionWarningOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionWarningArgs) ToMultiLocationAlertConditionWarningOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionWarningOutput)
}

func (i MultiLocationAlertConditionWarningArgs) ToMultiLocationAlertConditionWarningPtrOutput() MultiLocationAlertConditionWarningPtrOutput {
	return i.ToMultiLocationAlertConditionWarningPtrOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionWarningArgs) ToMultiLocationAlertConditionWarningPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionWarningOutput).ToMultiLocationAlertConditionWarningPtrOutputWithContext(ctx)
}

// MultiLocationAlertConditionWarningPtrInput is an input type that accepts MultiLocationAlertConditionWarningArgs, MultiLocationAlertConditionWarningPtr and MultiLocationAlertConditionWarningPtrOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionWarningPtrInput` via:
//
//          MultiLocationAlertConditionWarningArgs{...}
//
//  or:
//
//          nil
type MultiLocationAlertConditionWarningPtrInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionWarningPtrOutput() MultiLocationAlertConditionWarningPtrOutput
	ToMultiLocationAlertConditionWarningPtrOutputWithContext(context.Context) MultiLocationAlertConditionWarningPtrOutput
}

type multiLocationAlertConditionWarningPtrType MultiLocationAlertConditionWarningArgs

func MultiLocationAlertConditionWarningPtr(v *MultiLocationAlertConditionWarningArgs) MultiLocationAlertConditionWarningPtrInput {
	return (*multiLocationAlertConditionWarningPtrType)(v)
}

func (*multiLocationAlertConditionWarningPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertConditionWarning)(nil)).Elem()
}

func (i *multiLocationAlertConditionWarningPtrType) ToMultiLocationAlertConditionWarningPtrOutput() MultiLocationAlertConditionWarningPtrOutput {
	return i.ToMultiLocationAlertConditionWarningPtrOutputWithContext(context.Background())
}

func (i *multiLocationAlertConditionWarningPtrType) ToMultiLocationAlertConditionWarningPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionWarningPtrOutput)
}

type MultiLocationAlertConditionWarningOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionWarningOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiLocationAlertConditionWarning)(nil)).Elem()
}

func (o MultiLocationAlertConditionWarningOutput) ToMultiLocationAlertConditionWarningOutput() MultiLocationAlertConditionWarningOutput {
	return o
}

func (o MultiLocationAlertConditionWarningOutput) ToMultiLocationAlertConditionWarningOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningOutput {
	return o
}

func (o MultiLocationAlertConditionWarningOutput) ToMultiLocationAlertConditionWarningPtrOutput() MultiLocationAlertConditionWarningPtrOutput {
	return o.ToMultiLocationAlertConditionWarningPtrOutputWithContext(context.Background())
}

func (o MultiLocationAlertConditionWarningOutput) ToMultiLocationAlertConditionWarningPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v MultiLocationAlertConditionWarning) *MultiLocationAlertConditionWarning {
		return &v
	}).(MultiLocationAlertConditionWarningPtrOutput)
}

func (o MultiLocationAlertConditionWarningOutput) Threshold() pulumi.IntOutput {
	return o.ApplyT(func(v MultiLocationAlertConditionWarning) int { return v.Threshold }).(pulumi.IntOutput)
}

type MultiLocationAlertConditionWarningPtrOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionWarningPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertConditionWarning)(nil)).Elem()
}

func (o MultiLocationAlertConditionWarningPtrOutput) ToMultiLocationAlertConditionWarningPtrOutput() MultiLocationAlertConditionWarningPtrOutput {
	return o
}

func (o MultiLocationAlertConditionWarningPtrOutput) ToMultiLocationAlertConditionWarningPtrOutputWithContext(ctx context.Context) MultiLocationAlertConditionWarningPtrOutput {
	return o
}

func (o MultiLocationAlertConditionWarningPtrOutput) Elem() MultiLocationAlertConditionWarningOutput {
	return o.ApplyT(func(v *MultiLocationAlertConditionWarning) MultiLocationAlertConditionWarning {
		if v != nil {
			return *v
		}
		var ret MultiLocationAlertConditionWarning
		return ret
	}).(MultiLocationAlertConditionWarningOutput)
}

func (o MultiLocationAlertConditionWarningPtrOutput) Threshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertConditionWarning) *int {
		if v == nil {
			return nil
		}
		return &v.Threshold
	}).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorScriptLocationInput)(nil)).Elem(), MonitorScriptLocationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorScriptLocationArrayInput)(nil)).Elem(), MonitorScriptLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionCriticalInput)(nil)).Elem(), MultiLocationAlertConditionCriticalArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionCriticalPtrInput)(nil)).Elem(), MultiLocationAlertConditionCriticalArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionWarningInput)(nil)).Elem(), MultiLocationAlertConditionWarningArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionWarningPtrInput)(nil)).Elem(), MultiLocationAlertConditionWarningArgs{})
	pulumi.RegisterOutputType(MonitorScriptLocationOutput{})
	pulumi.RegisterOutputType(MonitorScriptLocationArrayOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionCriticalOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionCriticalPtrOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionWarningOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionWarningPtrOutput{})
}
