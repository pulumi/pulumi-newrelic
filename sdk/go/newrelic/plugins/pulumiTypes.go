// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package plugins

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AlertConditionTerm struct {
	Duration     int     `pulumi:"duration"`
	Operator     *string `pulumi:"operator"`
	Priority     *string `pulumi:"priority"`
	Threshold    float64 `pulumi:"threshold"`
	TimeFunction string  `pulumi:"timeFunction"`
}

// AlertConditionTermInput is an input type that accepts AlertConditionTermArgs and AlertConditionTermOutput values.
// You can construct a concrete instance of `AlertConditionTermInput` via:
//
//	AlertConditionTermArgs{...}
type AlertConditionTermInput interface {
	pulumi.Input

	ToAlertConditionTermOutput() AlertConditionTermOutput
	ToAlertConditionTermOutputWithContext(context.Context) AlertConditionTermOutput
}

type AlertConditionTermArgs struct {
	Duration     pulumi.IntInput       `pulumi:"duration"`
	Operator     pulumi.StringPtrInput `pulumi:"operator"`
	Priority     pulumi.StringPtrInput `pulumi:"priority"`
	Threshold    pulumi.Float64Input   `pulumi:"threshold"`
	TimeFunction pulumi.StringInput    `pulumi:"timeFunction"`
}

func (AlertConditionTermArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertConditionTerm)(nil)).Elem()
}

func (i AlertConditionTermArgs) ToAlertConditionTermOutput() AlertConditionTermOutput {
	return i.ToAlertConditionTermOutputWithContext(context.Background())
}

func (i AlertConditionTermArgs) ToAlertConditionTermOutputWithContext(ctx context.Context) AlertConditionTermOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConditionTermOutput)
}

// AlertConditionTermArrayInput is an input type that accepts AlertConditionTermArray and AlertConditionTermArrayOutput values.
// You can construct a concrete instance of `AlertConditionTermArrayInput` via:
//
//	AlertConditionTermArray{ AlertConditionTermArgs{...} }
type AlertConditionTermArrayInput interface {
	pulumi.Input

	ToAlertConditionTermArrayOutput() AlertConditionTermArrayOutput
	ToAlertConditionTermArrayOutputWithContext(context.Context) AlertConditionTermArrayOutput
}

type AlertConditionTermArray []AlertConditionTermInput

func (AlertConditionTermArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AlertConditionTerm)(nil)).Elem()
}

func (i AlertConditionTermArray) ToAlertConditionTermArrayOutput() AlertConditionTermArrayOutput {
	return i.ToAlertConditionTermArrayOutputWithContext(context.Background())
}

func (i AlertConditionTermArray) ToAlertConditionTermArrayOutputWithContext(ctx context.Context) AlertConditionTermArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConditionTermArrayOutput)
}

type AlertConditionTermOutput struct{ *pulumi.OutputState }

func (AlertConditionTermOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertConditionTerm)(nil)).Elem()
}

func (o AlertConditionTermOutput) ToAlertConditionTermOutput() AlertConditionTermOutput {
	return o
}

func (o AlertConditionTermOutput) ToAlertConditionTermOutputWithContext(ctx context.Context) AlertConditionTermOutput {
	return o
}

func (o AlertConditionTermOutput) Duration() pulumi.IntOutput {
	return o.ApplyT(func(v AlertConditionTerm) int { return v.Duration }).(pulumi.IntOutput)
}

func (o AlertConditionTermOutput) Operator() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AlertConditionTerm) *string { return v.Operator }).(pulumi.StringPtrOutput)
}

func (o AlertConditionTermOutput) Priority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AlertConditionTerm) *string { return v.Priority }).(pulumi.StringPtrOutput)
}

func (o AlertConditionTermOutput) Threshold() pulumi.Float64Output {
	return o.ApplyT(func(v AlertConditionTerm) float64 { return v.Threshold }).(pulumi.Float64Output)
}

func (o AlertConditionTermOutput) TimeFunction() pulumi.StringOutput {
	return o.ApplyT(func(v AlertConditionTerm) string { return v.TimeFunction }).(pulumi.StringOutput)
}

type AlertConditionTermArrayOutput struct{ *pulumi.OutputState }

func (AlertConditionTermArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AlertConditionTerm)(nil)).Elem()
}

func (o AlertConditionTermArrayOutput) ToAlertConditionTermArrayOutput() AlertConditionTermArrayOutput {
	return o
}

func (o AlertConditionTermArrayOutput) ToAlertConditionTermArrayOutputWithContext(ctx context.Context) AlertConditionTermArrayOutput {
	return o
}

func (o AlertConditionTermArrayOutput) Index(i pulumi.IntInput) AlertConditionTermOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AlertConditionTerm {
		return vs[0].([]AlertConditionTerm)[vs[1].(int)]
	}).(AlertConditionTermOutput)
}

type WorkloadEntitySearchQuery struct {
	// The query.
	Query string `pulumi:"query"`
}

// WorkloadEntitySearchQueryInput is an input type that accepts WorkloadEntitySearchQueryArgs and WorkloadEntitySearchQueryOutput values.
// You can construct a concrete instance of `WorkloadEntitySearchQueryInput` via:
//
//	WorkloadEntitySearchQueryArgs{...}
type WorkloadEntitySearchQueryInput interface {
	pulumi.Input

	ToWorkloadEntitySearchQueryOutput() WorkloadEntitySearchQueryOutput
	ToWorkloadEntitySearchQueryOutputWithContext(context.Context) WorkloadEntitySearchQueryOutput
}

type WorkloadEntitySearchQueryArgs struct {
	// The query.
	Query pulumi.StringInput `pulumi:"query"`
}

func (WorkloadEntitySearchQueryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkloadEntitySearchQuery)(nil)).Elem()
}

func (i WorkloadEntitySearchQueryArgs) ToWorkloadEntitySearchQueryOutput() WorkloadEntitySearchQueryOutput {
	return i.ToWorkloadEntitySearchQueryOutputWithContext(context.Background())
}

func (i WorkloadEntitySearchQueryArgs) ToWorkloadEntitySearchQueryOutputWithContext(ctx context.Context) WorkloadEntitySearchQueryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadEntitySearchQueryOutput)
}

// WorkloadEntitySearchQueryArrayInput is an input type that accepts WorkloadEntitySearchQueryArray and WorkloadEntitySearchQueryArrayOutput values.
// You can construct a concrete instance of `WorkloadEntitySearchQueryArrayInput` via:
//
//	WorkloadEntitySearchQueryArray{ WorkloadEntitySearchQueryArgs{...} }
type WorkloadEntitySearchQueryArrayInput interface {
	pulumi.Input

	ToWorkloadEntitySearchQueryArrayOutput() WorkloadEntitySearchQueryArrayOutput
	ToWorkloadEntitySearchQueryArrayOutputWithContext(context.Context) WorkloadEntitySearchQueryArrayOutput
}

type WorkloadEntitySearchQueryArray []WorkloadEntitySearchQueryInput

func (WorkloadEntitySearchQueryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkloadEntitySearchQuery)(nil)).Elem()
}

func (i WorkloadEntitySearchQueryArray) ToWorkloadEntitySearchQueryArrayOutput() WorkloadEntitySearchQueryArrayOutput {
	return i.ToWorkloadEntitySearchQueryArrayOutputWithContext(context.Background())
}

func (i WorkloadEntitySearchQueryArray) ToWorkloadEntitySearchQueryArrayOutputWithContext(ctx context.Context) WorkloadEntitySearchQueryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadEntitySearchQueryArrayOutput)
}

type WorkloadEntitySearchQueryOutput struct{ *pulumi.OutputState }

func (WorkloadEntitySearchQueryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkloadEntitySearchQuery)(nil)).Elem()
}

func (o WorkloadEntitySearchQueryOutput) ToWorkloadEntitySearchQueryOutput() WorkloadEntitySearchQueryOutput {
	return o
}

func (o WorkloadEntitySearchQueryOutput) ToWorkloadEntitySearchQueryOutputWithContext(ctx context.Context) WorkloadEntitySearchQueryOutput {
	return o
}

// The query.
func (o WorkloadEntitySearchQueryOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v WorkloadEntitySearchQuery) string { return v.Query }).(pulumi.StringOutput)
}

type WorkloadEntitySearchQueryArrayOutput struct{ *pulumi.OutputState }

func (WorkloadEntitySearchQueryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkloadEntitySearchQuery)(nil)).Elem()
}

func (o WorkloadEntitySearchQueryArrayOutput) ToWorkloadEntitySearchQueryArrayOutput() WorkloadEntitySearchQueryArrayOutput {
	return o
}

func (o WorkloadEntitySearchQueryArrayOutput) ToWorkloadEntitySearchQueryArrayOutputWithContext(ctx context.Context) WorkloadEntitySearchQueryArrayOutput {
	return o
}

func (o WorkloadEntitySearchQueryArrayOutput) Index(i pulumi.IntInput) WorkloadEntitySearchQueryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkloadEntitySearchQuery {
		return vs[0].([]WorkloadEntitySearchQuery)[vs[1].(int)]
	}).(WorkloadEntitySearchQueryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConditionTermInput)(nil)).Elem(), AlertConditionTermArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConditionTermArrayInput)(nil)).Elem(), AlertConditionTermArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadEntitySearchQueryInput)(nil)).Elem(), WorkloadEntitySearchQueryArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadEntitySearchQueryArrayInput)(nil)).Elem(), WorkloadEntitySearchQueryArray{})
	pulumi.RegisterOutputType(AlertConditionTermOutput{})
	pulumi.RegisterOutputType(AlertConditionTermArrayOutput{})
	pulumi.RegisterOutputType(WorkloadEntitySearchQueryOutput{})
	pulumi.RegisterOutputType(WorkloadEntitySearchQueryArrayOutput{})
}
