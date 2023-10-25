// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package insights

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this resource to create one or more Insights events.
//
// ## Events
//
// The `event` mapping supports the following arguments:
//
//   - `type` - (Required) The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
//   - `timestamp` - (Optional) Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
//   - `attribute` - (Required) An attribute to include in your event payload. Multiple attribute blocks can be defined for an event. See Attributes below for details.
//
// ### Attributes
//
// The `attribute` mapping supports the following arguments:
//
//   - `key` - (Required) The name of the attribute.
//   - `value` - (Required) The value of the attribute.
//   - `type` - (Optional) Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are `string`, `int`, or `float`. Defaults to `string`.
type Event struct {
	pulumi.CustomResourceState

	// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
	Events EventEventArrayOutput `pulumi:"events"`
}

// NewEvent registers a new resource with the given unique name, arguments, and options.
func NewEvent(ctx *pulumi.Context,
	name string, args *EventArgs, opts ...pulumi.ResourceOption) (*Event, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Events == nil {
		return nil, errors.New("invalid value for required argument 'Events'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Event
	err := ctx.RegisterResource("newrelic:insights/event:Event", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEvent gets an existing Event resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEvent(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventState, opts ...pulumi.ResourceOption) (*Event, error) {
	var resource Event
	err := ctx.ReadResource("newrelic:insights/event:Event", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Event resources.
type eventState struct {
	// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
	Events []EventEvent `pulumi:"events"`
}

type EventState struct {
	// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
	Events EventEventArrayInput
}

func (EventState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventState)(nil)).Elem()
}

type eventArgs struct {
	// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
	Events []EventEvent `pulumi:"events"`
}

// The set of arguments for constructing a Event resource.
type EventArgs struct {
	// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
	Events EventEventArrayInput
}

func (EventArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventArgs)(nil)).Elem()
}

type EventInput interface {
	pulumi.Input

	ToEventOutput() EventOutput
	ToEventOutputWithContext(ctx context.Context) EventOutput
}

func (*Event) ElementType() reflect.Type {
	return reflect.TypeOf((**Event)(nil)).Elem()
}

func (i *Event) ToEventOutput() EventOutput {
	return i.ToEventOutputWithContext(context.Background())
}

func (i *Event) ToEventOutputWithContext(ctx context.Context) EventOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOutput)
}

func (i *Event) ToOutput(ctx context.Context) pulumix.Output[*Event] {
	return pulumix.Output[*Event]{
		OutputState: i.ToEventOutputWithContext(ctx).OutputState,
	}
}

// EventArrayInput is an input type that accepts EventArray and EventArrayOutput values.
// You can construct a concrete instance of `EventArrayInput` via:
//
//	EventArray{ EventArgs{...} }
type EventArrayInput interface {
	pulumi.Input

	ToEventArrayOutput() EventArrayOutput
	ToEventArrayOutputWithContext(context.Context) EventArrayOutput
}

type EventArray []EventInput

func (EventArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Event)(nil)).Elem()
}

func (i EventArray) ToEventArrayOutput() EventArrayOutput {
	return i.ToEventArrayOutputWithContext(context.Background())
}

func (i EventArray) ToEventArrayOutputWithContext(ctx context.Context) EventArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventArrayOutput)
}

func (i EventArray) ToOutput(ctx context.Context) pulumix.Output[[]*Event] {
	return pulumix.Output[[]*Event]{
		OutputState: i.ToEventArrayOutputWithContext(ctx).OutputState,
	}
}

// EventMapInput is an input type that accepts EventMap and EventMapOutput values.
// You can construct a concrete instance of `EventMapInput` via:
//
//	EventMap{ "key": EventArgs{...} }
type EventMapInput interface {
	pulumi.Input

	ToEventMapOutput() EventMapOutput
	ToEventMapOutputWithContext(context.Context) EventMapOutput
}

type EventMap map[string]EventInput

func (EventMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Event)(nil)).Elem()
}

func (i EventMap) ToEventMapOutput() EventMapOutput {
	return i.ToEventMapOutputWithContext(context.Background())
}

func (i EventMap) ToEventMapOutputWithContext(ctx context.Context) EventMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventMapOutput)
}

func (i EventMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Event] {
	return pulumix.Output[map[string]*Event]{
		OutputState: i.ToEventMapOutputWithContext(ctx).OutputState,
	}
}

type EventOutput struct{ *pulumi.OutputState }

func (EventOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Event)(nil)).Elem()
}

func (o EventOutput) ToEventOutput() EventOutput {
	return o
}

func (o EventOutput) ToEventOutputWithContext(ctx context.Context) EventOutput {
	return o
}

func (o EventOutput) ToOutput(ctx context.Context) pulumix.Output[*Event] {
	return pulumix.Output[*Event]{
		OutputState: o.OutputState,
	}
}

// An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
func (o EventOutput) Events() EventEventArrayOutput {
	return o.ApplyT(func(v *Event) EventEventArrayOutput { return v.Events }).(EventEventArrayOutput)
}

type EventArrayOutput struct{ *pulumi.OutputState }

func (EventArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Event)(nil)).Elem()
}

func (o EventArrayOutput) ToEventArrayOutput() EventArrayOutput {
	return o
}

func (o EventArrayOutput) ToEventArrayOutputWithContext(ctx context.Context) EventArrayOutput {
	return o
}

func (o EventArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Event] {
	return pulumix.Output[[]*Event]{
		OutputState: o.OutputState,
	}
}

func (o EventArrayOutput) Index(i pulumi.IntInput) EventOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Event {
		return vs[0].([]*Event)[vs[1].(int)]
	}).(EventOutput)
}

type EventMapOutput struct{ *pulumi.OutputState }

func (EventMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Event)(nil)).Elem()
}

func (o EventMapOutput) ToEventMapOutput() EventMapOutput {
	return o
}

func (o EventMapOutput) ToEventMapOutputWithContext(ctx context.Context) EventMapOutput {
	return o
}

func (o EventMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Event] {
	return pulumix.Output[map[string]*Event]{
		OutputState: o.OutputState,
	}
}

func (o EventMapOutput) MapIndex(k pulumi.StringInput) EventOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Event {
		return vs[0].(map[string]*Event)[vs[1].(string)]
	}).(EventOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventInput)(nil)).Elem(), &Event{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventArrayInput)(nil)).Elem(), EventArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventMapInput)(nil)).Elem(), EventMap{})
	pulumi.RegisterOutputType(EventOutput{})
	pulumi.RegisterOutputType(EventArrayOutput{})
	pulumi.RegisterOutputType(EventMapOutput{})
}
