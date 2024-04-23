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

// Use this resource to create, update, and delete [Monitor Downtimes](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/using-monitors/monitor-downtimes-disable-monitoring-during-scheduled-maintenance-times/) in New Relic.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "foo", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("WEEKLY"),
//				StartTime: pulumi.String("2023-11-30T10:30:00"),
//				EndTime:   pulumi.String("2023-12-10T02:45:30"),
//				TimeZone:  pulumi.String("Asia/Kolkata"),
//				EndRepeat: &newrelic.MonitorDowntimeEndRepeatArgs{
//					OnDate: pulumi.String("2023-12-20"),
//				},
//				MaintenanceDays: pulumi.StringArray{
//					pulumi.String("FRIDAY"),
//					pulumi.String("SATURDAY"),
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
// Monitor Downtimes are of four types; **one-time**, **daily**, **weekly** and **monthly**. For more details on each type and the right arguments that go with them, check out the argument reference and examples sections below.
//
// ## Examples
//
// ### One-Time Monitor Downtime
//
// The below example illustrates creating a **one-time** monitor downtime.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "sample_one_time_newrelic_monitor_downtime", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample One Time Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("ONE_TIME"),
//				StartTime: pulumi.String("2023-12-04T10:15:00"),
//				EndTime:   pulumi.String("2024-01-04T16:24:30"),
//				TimeZone:  pulumi.String("America/Los_Angeles"),
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
// ### Daily Monitor Downtime
//
// The below example illustrates creating a **daily** monitor downtime.
//
// Note that `endRepeat` has been specified in the configuration; however, this is optional, in accordance with the rules of `endRepeat` specified in the argument reference section above. This example uses the `onDate` nested argument of `endRepeat`, however, the other nested argument, `onRepeat` may also be used _instead_, as you may see in some of the other examples below; though both `onDate` and `onRepeat` cannot be specified together, as they are mutually exclusive.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "sample_daily_newrelic_monitor_downtime", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample Daily Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("DAILY"),
//				StartTime: pulumi.String("2023-12-04T18:15:00"),
//				EndTime:   pulumi.String("2024-01-04T07:15:00"),
//				EndRepeat: &newrelic.MonitorDowntimeEndRepeatArgs{
//					OnDate: pulumi.String("2023-12-25"),
//				},
//				TimeZone: pulumi.String("Asia/Kolkata"),
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
// ### Weekly Monitor Downtime
//
// The below example illustrates creating a **weekly** monitor downtime.
//
// Note that `maintenanceDays` has been specified in the configuration as it is required with weekly monitor downtimes; and `endRepeat` has not been specified as it is optional, all in accordance with the rules of these arguments specified in the argument reference section above.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "sample_weekly_newrelic_monitor_downtime", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample Weekly Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("WEEKLY"),
//				StartTime: pulumi.String("2023-12-04T14:15:00"),
//				EndTime:   pulumi.String("2024-01-04T23:55:00"),
//				TimeZone:  pulumi.String("US/Hawaii"),
//				MaintenanceDays: pulumi.StringArray{
//					pulumi.String("SATURDAY"),
//					pulumi.String("SUNDAY"),
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
// ### Monthly Monitor Downtime
//
// The below example illustrates creating a **monthly** monitor downtime.
//
// Note that `frequency` has been specified in the configuration as it is required with monthly monitor downtimes, and `endRepeat` has been specified too, though it is optional. `frequency` has been specified with `daysOfWeek` comprising both of its nested arguments, `ordinalDayOfMonth` and `weekDay`; all in accordance with the rules of these arguments specified in the argument reference section above.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "sample_monthly_newrelic_monitor_downtime", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample Monthly Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("MONTHLY"),
//				StartTime: pulumi.String("2023-12-04T07:15:00"),
//				EndTime:   pulumi.String("2024-01-04T19:15:00"),
//				EndRepeat: &newrelic.MonitorDowntimeEndRepeatArgs{
//					OnRepeat: pulumi.Int(6),
//				},
//				TimeZone: pulumi.String("Europe/Dublin"),
//				Frequency: &newrelic.MonitorDowntimeFrequencyArgs{
//					DaysOfWeek: &newrelic.MonitorDowntimeFrequencyDaysOfWeekArgs{
//						OrdinalDayOfMonth: pulumi.String("SECOND"),
//						WeekDay:           pulumi.String("SATURDAY"),
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
// However, the `frequency` block in monthly monitor downtimes may also be specified with its other nested argument, `daysOfMonth`, as shown in the example below - though both `daysOfMonth` and `daysOfWeek` cannot be specified together, as they are mutually exclusive.
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewMonitorDowntime(ctx, "sample_monthly_newrelic_monitor_downtime", &newrelic.MonitorDowntimeArgs{
//				Name: pulumi.String("Sample Monthly Monitor Downtime"),
//				MonitorGuids: pulumi.StringArray{
//					pulumi.String("<GUID-1>"),
//					pulumi.String("<GUID-2>"),
//				},
//				Mode:      pulumi.String("MONTHLY"),
//				StartTime: pulumi.String("2023-12-04T07:15:00"),
//				EndTime:   pulumi.String("2024-01-04T19:15:00"),
//				EndRepeat: &newrelic.MonitorDowntimeEndRepeatArgs{
//					OnRepeat: pulumi.Int(6),
//				},
//				TimeZone: pulumi.String("Europe/Dublin"),
//				Frequency: &newrelic.MonitorDowntimeFrequencyArgs{
//					DaysOfMonths: pulumi.IntArray{
//						pulumi.Int(3),
//						pulumi.Int(6),
//						pulumi.Int(14),
//						pulumi.Int(23),
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
// A monitor downtime can be imported into Terraform configuration using its `guid`, i.e.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/monitorDowntime:MonitorDowntime monitor <guid>
// ```
type MonitorDowntime struct {
	pulumi.CustomResourceState

	// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
	// provider{} configuration if not specified.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
	EndRepeat MonitorDowntimeEndRepeatPtrOutput `pulumi:"endRepeat"`
	// A datetime stamp signifying the end of the Monitor Downtime.
	EndTime pulumi.StringOutput `pulumi:"endTime"`
	// Configuration options for which days of the month a monitor downtime will occur
	Frequency MonitorDowntimeFrequencyPtrOutput `pulumi:"frequency"`
	// A list of maintenance days to be included with the created weekly Monitor Downtime.
	MaintenanceDays pulumi.StringArrayOutput `pulumi:"maintenanceDays"`
	// An identifier of the type of Monitor Downtime to be created.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
	MonitorGuids pulumi.StringArrayOutput `pulumi:"monitorGuids"`
	// A name to identify the Monitor Downtime to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A datetime stamp signifying the start of the Monitor Downtime.
	StartTime pulumi.StringOutput `pulumi:"startTime"`
	// The timezone that applies to the Monitor Downtime schedule.
	TimeZone pulumi.StringOutput `pulumi:"timeZone"`
}

// NewMonitorDowntime registers a new resource with the given unique name, arguments, and options.
func NewMonitorDowntime(ctx *pulumi.Context,
	name string, args *MonitorDowntimeArgs, opts ...pulumi.ResourceOption) (*MonitorDowntime, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndTime == nil {
		return nil, errors.New("invalid value for required argument 'EndTime'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.StartTime == nil {
		return nil, errors.New("invalid value for required argument 'StartTime'")
	}
	if args.TimeZone == nil {
		return nil, errors.New("invalid value for required argument 'TimeZone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MonitorDowntime
	err := ctx.RegisterResource("newrelic:index/monitorDowntime:MonitorDowntime", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorDowntime gets an existing MonitorDowntime resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorDowntime(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorDowntimeState, opts ...pulumi.ResourceOption) (*MonitorDowntime, error) {
	var resource MonitorDowntime
	err := ctx.ReadResource("newrelic:index/monitorDowntime:MonitorDowntime", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorDowntime resources.
type monitorDowntimeState struct {
	// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
	// provider{} configuration if not specified.
	AccountId *int `pulumi:"accountId"`
	// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
	EndRepeat *MonitorDowntimeEndRepeat `pulumi:"endRepeat"`
	// A datetime stamp signifying the end of the Monitor Downtime.
	EndTime *string `pulumi:"endTime"`
	// Configuration options for which days of the month a monitor downtime will occur
	Frequency *MonitorDowntimeFrequency `pulumi:"frequency"`
	// A list of maintenance days to be included with the created weekly Monitor Downtime.
	MaintenanceDays []string `pulumi:"maintenanceDays"`
	// An identifier of the type of Monitor Downtime to be created.
	Mode *string `pulumi:"mode"`
	// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
	MonitorGuids []string `pulumi:"monitorGuids"`
	// A name to identify the Monitor Downtime to be created.
	Name *string `pulumi:"name"`
	// A datetime stamp signifying the start of the Monitor Downtime.
	StartTime *string `pulumi:"startTime"`
	// The timezone that applies to the Monitor Downtime schedule.
	TimeZone *string `pulumi:"timeZone"`
}

type MonitorDowntimeState struct {
	// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
	// provider{} configuration if not specified.
	AccountId pulumi.IntPtrInput
	// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
	EndRepeat MonitorDowntimeEndRepeatPtrInput
	// A datetime stamp signifying the end of the Monitor Downtime.
	EndTime pulumi.StringPtrInput
	// Configuration options for which days of the month a monitor downtime will occur
	Frequency MonitorDowntimeFrequencyPtrInput
	// A list of maintenance days to be included with the created weekly Monitor Downtime.
	MaintenanceDays pulumi.StringArrayInput
	// An identifier of the type of Monitor Downtime to be created.
	Mode pulumi.StringPtrInput
	// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
	MonitorGuids pulumi.StringArrayInput
	// A name to identify the Monitor Downtime to be created.
	Name pulumi.StringPtrInput
	// A datetime stamp signifying the start of the Monitor Downtime.
	StartTime pulumi.StringPtrInput
	// The timezone that applies to the Monitor Downtime schedule.
	TimeZone pulumi.StringPtrInput
}

func (MonitorDowntimeState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorDowntimeState)(nil)).Elem()
}

type monitorDowntimeArgs struct {
	// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
	// provider{} configuration if not specified.
	AccountId *int `pulumi:"accountId"`
	// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
	EndRepeat *MonitorDowntimeEndRepeat `pulumi:"endRepeat"`
	// A datetime stamp signifying the end of the Monitor Downtime.
	EndTime string `pulumi:"endTime"`
	// Configuration options for which days of the month a monitor downtime will occur
	Frequency *MonitorDowntimeFrequency `pulumi:"frequency"`
	// A list of maintenance days to be included with the created weekly Monitor Downtime.
	MaintenanceDays []string `pulumi:"maintenanceDays"`
	// An identifier of the type of Monitor Downtime to be created.
	Mode string `pulumi:"mode"`
	// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
	MonitorGuids []string `pulumi:"monitorGuids"`
	// A name to identify the Monitor Downtime to be created.
	Name *string `pulumi:"name"`
	// A datetime stamp signifying the start of the Monitor Downtime.
	StartTime string `pulumi:"startTime"`
	// The timezone that applies to the Monitor Downtime schedule.
	TimeZone string `pulumi:"timeZone"`
}

// The set of arguments for constructing a MonitorDowntime resource.
type MonitorDowntimeArgs struct {
	// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
	// provider{} configuration if not specified.
	AccountId pulumi.IntPtrInput
	// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
	EndRepeat MonitorDowntimeEndRepeatPtrInput
	// A datetime stamp signifying the end of the Monitor Downtime.
	EndTime pulumi.StringInput
	// Configuration options for which days of the month a monitor downtime will occur
	Frequency MonitorDowntimeFrequencyPtrInput
	// A list of maintenance days to be included with the created weekly Monitor Downtime.
	MaintenanceDays pulumi.StringArrayInput
	// An identifier of the type of Monitor Downtime to be created.
	Mode pulumi.StringInput
	// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
	MonitorGuids pulumi.StringArrayInput
	// A name to identify the Monitor Downtime to be created.
	Name pulumi.StringPtrInput
	// A datetime stamp signifying the start of the Monitor Downtime.
	StartTime pulumi.StringInput
	// The timezone that applies to the Monitor Downtime schedule.
	TimeZone pulumi.StringInput
}

func (MonitorDowntimeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorDowntimeArgs)(nil)).Elem()
}

type MonitorDowntimeInput interface {
	pulumi.Input

	ToMonitorDowntimeOutput() MonitorDowntimeOutput
	ToMonitorDowntimeOutputWithContext(ctx context.Context) MonitorDowntimeOutput
}

func (*MonitorDowntime) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorDowntime)(nil)).Elem()
}

func (i *MonitorDowntime) ToMonitorDowntimeOutput() MonitorDowntimeOutput {
	return i.ToMonitorDowntimeOutputWithContext(context.Background())
}

func (i *MonitorDowntime) ToMonitorDowntimeOutputWithContext(ctx context.Context) MonitorDowntimeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorDowntimeOutput)
}

// MonitorDowntimeArrayInput is an input type that accepts MonitorDowntimeArray and MonitorDowntimeArrayOutput values.
// You can construct a concrete instance of `MonitorDowntimeArrayInput` via:
//
//	MonitorDowntimeArray{ MonitorDowntimeArgs{...} }
type MonitorDowntimeArrayInput interface {
	pulumi.Input

	ToMonitorDowntimeArrayOutput() MonitorDowntimeArrayOutput
	ToMonitorDowntimeArrayOutputWithContext(context.Context) MonitorDowntimeArrayOutput
}

type MonitorDowntimeArray []MonitorDowntimeInput

func (MonitorDowntimeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorDowntime)(nil)).Elem()
}

func (i MonitorDowntimeArray) ToMonitorDowntimeArrayOutput() MonitorDowntimeArrayOutput {
	return i.ToMonitorDowntimeArrayOutputWithContext(context.Background())
}

func (i MonitorDowntimeArray) ToMonitorDowntimeArrayOutputWithContext(ctx context.Context) MonitorDowntimeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorDowntimeArrayOutput)
}

// MonitorDowntimeMapInput is an input type that accepts MonitorDowntimeMap and MonitorDowntimeMapOutput values.
// You can construct a concrete instance of `MonitorDowntimeMapInput` via:
//
//	MonitorDowntimeMap{ "key": MonitorDowntimeArgs{...} }
type MonitorDowntimeMapInput interface {
	pulumi.Input

	ToMonitorDowntimeMapOutput() MonitorDowntimeMapOutput
	ToMonitorDowntimeMapOutputWithContext(context.Context) MonitorDowntimeMapOutput
}

type MonitorDowntimeMap map[string]MonitorDowntimeInput

func (MonitorDowntimeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorDowntime)(nil)).Elem()
}

func (i MonitorDowntimeMap) ToMonitorDowntimeMapOutput() MonitorDowntimeMapOutput {
	return i.ToMonitorDowntimeMapOutputWithContext(context.Background())
}

func (i MonitorDowntimeMap) ToMonitorDowntimeMapOutputWithContext(ctx context.Context) MonitorDowntimeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorDowntimeMapOutput)
}

type MonitorDowntimeOutput struct{ *pulumi.OutputState }

func (MonitorDowntimeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorDowntime)(nil)).Elem()
}

func (o MonitorDowntimeOutput) ToMonitorDowntimeOutput() MonitorDowntimeOutput {
	return o
}

func (o MonitorDowntimeOutput) ToMonitorDowntimeOutputWithContext(ctx context.Context) MonitorDowntimeOutput {
	return o
}

// The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
// provider{} configuration if not specified.
func (o MonitorDowntimeOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
func (o MonitorDowntimeOutput) EndRepeat() MonitorDowntimeEndRepeatPtrOutput {
	return o.ApplyT(func(v *MonitorDowntime) MonitorDowntimeEndRepeatPtrOutput { return v.EndRepeat }).(MonitorDowntimeEndRepeatPtrOutput)
}

// A datetime stamp signifying the end of the Monitor Downtime.
func (o MonitorDowntimeOutput) EndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringOutput { return v.EndTime }).(pulumi.StringOutput)
}

// Configuration options for which days of the month a monitor downtime will occur
func (o MonitorDowntimeOutput) Frequency() MonitorDowntimeFrequencyPtrOutput {
	return o.ApplyT(func(v *MonitorDowntime) MonitorDowntimeFrequencyPtrOutput { return v.Frequency }).(MonitorDowntimeFrequencyPtrOutput)
}

// A list of maintenance days to be included with the created weekly Monitor Downtime.
func (o MonitorDowntimeOutput) MaintenanceDays() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringArrayOutput { return v.MaintenanceDays }).(pulumi.StringArrayOutput)
}

// An identifier of the type of Monitor Downtime to be created.
func (o MonitorDowntimeOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
func (o MonitorDowntimeOutput) MonitorGuids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringArrayOutput { return v.MonitorGuids }).(pulumi.StringArrayOutput)
}

// A name to identify the Monitor Downtime to be created.
func (o MonitorDowntimeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A datetime stamp signifying the start of the Monitor Downtime.
func (o MonitorDowntimeOutput) StartTime() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringOutput { return v.StartTime }).(pulumi.StringOutput)
}

// The timezone that applies to the Monitor Downtime schedule.
func (o MonitorDowntimeOutput) TimeZone() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorDowntime) pulumi.StringOutput { return v.TimeZone }).(pulumi.StringOutput)
}

type MonitorDowntimeArrayOutput struct{ *pulumi.OutputState }

func (MonitorDowntimeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorDowntime)(nil)).Elem()
}

func (o MonitorDowntimeArrayOutput) ToMonitorDowntimeArrayOutput() MonitorDowntimeArrayOutput {
	return o
}

func (o MonitorDowntimeArrayOutput) ToMonitorDowntimeArrayOutputWithContext(ctx context.Context) MonitorDowntimeArrayOutput {
	return o
}

func (o MonitorDowntimeArrayOutput) Index(i pulumi.IntInput) MonitorDowntimeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorDowntime {
		return vs[0].([]*MonitorDowntime)[vs[1].(int)]
	}).(MonitorDowntimeOutput)
}

type MonitorDowntimeMapOutput struct{ *pulumi.OutputState }

func (MonitorDowntimeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorDowntime)(nil)).Elem()
}

func (o MonitorDowntimeMapOutput) ToMonitorDowntimeMapOutput() MonitorDowntimeMapOutput {
	return o
}

func (o MonitorDowntimeMapOutput) ToMonitorDowntimeMapOutputWithContext(ctx context.Context) MonitorDowntimeMapOutput {
	return o
}

func (o MonitorDowntimeMapOutput) MapIndex(k pulumi.StringInput) MonitorDowntimeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorDowntime {
		return vs[0].(map[string]*MonitorDowntime)[vs[1].(string)]
	}).(MonitorDowntimeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorDowntimeInput)(nil)).Elem(), &MonitorDowntime{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorDowntimeArrayInput)(nil)).Elem(), MonitorDowntimeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorDowntimeMapInput)(nil)).Elem(), MonitorDowntimeMap{})
	pulumi.RegisterOutputType(MonitorDowntimeOutput{})
	pulumi.RegisterOutputType(MonitorDowntimeArrayOutput{})
	pulumi.RegisterOutputType(MonitorDowntimeMapOutput{})
}
