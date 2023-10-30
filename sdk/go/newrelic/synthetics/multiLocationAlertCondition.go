// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.
//
// > **NOTE:** This is a legacy resource. The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			policy, err := newrelic.NewAlertPolicy(ctx, "policy", nil)
//			if err != nil {
//				return err
//			}
//			monitor, err := synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("US_WEST_1"),
//				},
//				Period: pulumi.String("EVERY_10_MINUTES"),
//				Status: pulumi.String("DISABLED"),
//				Type:   pulumi.String("SIMPLE"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synthetics.NewMultiLocationAlertCondition(ctx, "example", &synthetics.MultiLocationAlertConditionArgs{
//				PolicyId:                  policy.ID(),
//				RunbookUrl:                pulumi.String("https://example.com"),
//				Enabled:                   pulumi.Bool(true),
//				ViolationTimeLimitSeconds: pulumi.Int(3600),
//				Entities: pulumi.StringArray{
//					monitor.ID(),
//				},
//				Critical: &synthetics.MultiLocationAlertConditionCriticalArgs{
//					Threshold: pulumi.Int(2),
//				},
//				Warning: &synthetics.MultiLocationAlertConditionWarningArgs{
//					Threshold: pulumi.Int(1),
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
// ## Tags
//
// Manage synthetics multilocation alert condition tags with `EntityTags`. For up-to-date documentation about the tagging resource, please check EntityTags
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooAlertPolicy, err := newrelic.NewAlertPolicy(ctx, "fooAlertPolicy", nil)
//			if err != nil {
//				return err
//			}
//			fooMonitor, err := synthetics.NewMonitor(ctx, "fooMonitor", &synthetics.MonitorArgs{
//				Status: pulumi.String("ENABLED"),
//				Period: pulumi.String("EVERY_MINUTE"),
//				Uri:    pulumi.String("https://www.one.newrelic.com"),
//				Type:   pulumi.String("SIMPLE"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_EAST_1"),
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
//			fooMultiLocationAlertCondition, err := synthetics.NewMultiLocationAlertCondition(ctx, "fooMultiLocationAlertCondition", &synthetics.MultiLocationAlertConditionArgs{
//				PolicyId:                  fooAlertPolicy.ID(),
//				RunbookUrl:                pulumi.String("https://example.com"),
//				Enabled:                   pulumi.Bool(true),
//				ViolationTimeLimitSeconds: pulumi.Int(3600),
//				Entities: pulumi.StringArray{
//					fooMonitor.ID(),
//				},
//				Critical: &synthetics.MultiLocationAlertConditionCriticalArgs{
//					Threshold: pulumi.Int(2),
//				},
//				Warning: &synthetics.MultiLocationAlertConditionWarningArgs{
//					Threshold: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewEntityTags(ctx, "myConditionEntityTags", &newrelic.EntityTagsArgs{
//				Guid: fooMultiLocationAlertCondition.EntityGuid,
//				Tags: newrelic.EntityTagsTagArray{
//					&newrelic.EntityTagsTagArgs{
//						Key: pulumi.String("my-key"),
//						Values: pulumi.StringArray{
//							pulumi.String("my-value"),
//							pulumi.String("my-other-value"),
//						},
//					},
//					&newrelic.EntityTagsTagArgs{
//						Key: pulumi.String("my-key-2"),
//						Values: pulumi.StringArray{
//							pulumi.String("my-value-2"),
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
// # New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format
//
// `<policy_id>:<condition_id>`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
//
// ```
type MultiLocationAlertCondition struct {
	pulumi.CustomResourceState

	// A condition term with the priority set to critical.
	Critical MultiLocationAlertConditionCriticalOutput `pulumi:"critical"`
	// Set whether to enable the alert condition.  Defaults to true.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The Monitor GUID's of the Synthetics monitors to alert on.
	Entities pulumi.StringArrayOutput `pulumi:"entities"`
	// The unique entity identifier of the condition in New Relic.
	EntityGuid pulumi.StringOutput `pulumi:"entityGuid"`
	// The title of the condition.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the policy where this condition will be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
	// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
	ViolationTimeLimitSeconds pulumi.IntPtrOutput `pulumi:"violationTimeLimitSeconds"`
	// A condition term with the priority set to warning.
	//
	// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
	Warning MultiLocationAlertConditionWarningPtrOutput `pulumi:"warning"`
}

// NewMultiLocationAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewMultiLocationAlertCondition(ctx *pulumi.Context,
	name string, args *MultiLocationAlertConditionArgs, opts ...pulumi.ResourceOption) (*MultiLocationAlertCondition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Critical == nil {
		return nil, errors.New("invalid value for required argument 'Critical'")
	}
	if args.Entities == nil {
		return nil, errors.New("invalid value for required argument 'Entities'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MultiLocationAlertCondition
	err := ctx.RegisterResource("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMultiLocationAlertCondition gets an existing MultiLocationAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMultiLocationAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MultiLocationAlertConditionState, opts ...pulumi.ResourceOption) (*MultiLocationAlertCondition, error) {
	var resource MultiLocationAlertCondition
	err := ctx.ReadResource("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MultiLocationAlertCondition resources.
type multiLocationAlertConditionState struct {
	// A condition term with the priority set to critical.
	Critical *MultiLocationAlertConditionCritical `pulumi:"critical"`
	// Set whether to enable the alert condition.  Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The Monitor GUID's of the Synthetics monitors to alert on.
	Entities []string `pulumi:"entities"`
	// The unique entity identifier of the condition in New Relic.
	EntityGuid *string `pulumi:"entityGuid"`
	// The title of the condition.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition will be used.
	PolicyId *int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
	ViolationTimeLimitSeconds *int `pulumi:"violationTimeLimitSeconds"`
	// A condition term with the priority set to warning.
	//
	// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
	Warning *MultiLocationAlertConditionWarning `pulumi:"warning"`
}

type MultiLocationAlertConditionState struct {
	// A condition term with the priority set to critical.
	Critical MultiLocationAlertConditionCriticalPtrInput
	// Set whether to enable the alert condition.  Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The Monitor GUID's of the Synthetics monitors to alert on.
	Entities pulumi.StringArrayInput
	// The unique entity identifier of the condition in New Relic.
	EntityGuid pulumi.StringPtrInput
	// The title of the condition.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition will be used.
	PolicyId pulumi.IntPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
	ViolationTimeLimitSeconds pulumi.IntPtrInput
	// A condition term with the priority set to warning.
	//
	// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
	Warning MultiLocationAlertConditionWarningPtrInput
}

func (MultiLocationAlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*multiLocationAlertConditionState)(nil)).Elem()
}

type multiLocationAlertConditionArgs struct {
	// A condition term with the priority set to critical.
	Critical MultiLocationAlertConditionCritical `pulumi:"critical"`
	// Set whether to enable the alert condition.  Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The Monitor GUID's of the Synthetics monitors to alert on.
	Entities []string `pulumi:"entities"`
	// The title of the condition.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition will be used.
	PolicyId int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
	ViolationTimeLimitSeconds *int `pulumi:"violationTimeLimitSeconds"`
	// A condition term with the priority set to warning.
	//
	// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
	Warning *MultiLocationAlertConditionWarning `pulumi:"warning"`
}

// The set of arguments for constructing a MultiLocationAlertCondition resource.
type MultiLocationAlertConditionArgs struct {
	// A condition term with the priority set to critical.
	Critical MultiLocationAlertConditionCriticalInput
	// Set whether to enable the alert condition.  Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The Monitor GUID's of the Synthetics monitors to alert on.
	Entities pulumi.StringArrayInput
	// The title of the condition.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition will be used.
	PolicyId pulumi.IntInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
	ViolationTimeLimitSeconds pulumi.IntPtrInput
	// A condition term with the priority set to warning.
	//
	// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
	Warning MultiLocationAlertConditionWarningPtrInput
}

func (MultiLocationAlertConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*multiLocationAlertConditionArgs)(nil)).Elem()
}

type MultiLocationAlertConditionInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionOutput() MultiLocationAlertConditionOutput
	ToMultiLocationAlertConditionOutputWithContext(ctx context.Context) MultiLocationAlertConditionOutput
}

func (*MultiLocationAlertCondition) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertCondition)(nil)).Elem()
}

func (i *MultiLocationAlertCondition) ToMultiLocationAlertConditionOutput() MultiLocationAlertConditionOutput {
	return i.ToMultiLocationAlertConditionOutputWithContext(context.Background())
}

func (i *MultiLocationAlertCondition) ToMultiLocationAlertConditionOutputWithContext(ctx context.Context) MultiLocationAlertConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionOutput)
}

func (i *MultiLocationAlertCondition) ToOutput(ctx context.Context) pulumix.Output[*MultiLocationAlertCondition] {
	return pulumix.Output[*MultiLocationAlertCondition]{
		OutputState: i.ToMultiLocationAlertConditionOutputWithContext(ctx).OutputState,
	}
}

// MultiLocationAlertConditionArrayInput is an input type that accepts MultiLocationAlertConditionArray and MultiLocationAlertConditionArrayOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionArrayInput` via:
//
//	MultiLocationAlertConditionArray{ MultiLocationAlertConditionArgs{...} }
type MultiLocationAlertConditionArrayInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionArrayOutput() MultiLocationAlertConditionArrayOutput
	ToMultiLocationAlertConditionArrayOutputWithContext(context.Context) MultiLocationAlertConditionArrayOutput
}

type MultiLocationAlertConditionArray []MultiLocationAlertConditionInput

func (MultiLocationAlertConditionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MultiLocationAlertCondition)(nil)).Elem()
}

func (i MultiLocationAlertConditionArray) ToMultiLocationAlertConditionArrayOutput() MultiLocationAlertConditionArrayOutput {
	return i.ToMultiLocationAlertConditionArrayOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionArray) ToMultiLocationAlertConditionArrayOutputWithContext(ctx context.Context) MultiLocationAlertConditionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionArrayOutput)
}

func (i MultiLocationAlertConditionArray) ToOutput(ctx context.Context) pulumix.Output[[]*MultiLocationAlertCondition] {
	return pulumix.Output[[]*MultiLocationAlertCondition]{
		OutputState: i.ToMultiLocationAlertConditionArrayOutputWithContext(ctx).OutputState,
	}
}

// MultiLocationAlertConditionMapInput is an input type that accepts MultiLocationAlertConditionMap and MultiLocationAlertConditionMapOutput values.
// You can construct a concrete instance of `MultiLocationAlertConditionMapInput` via:
//
//	MultiLocationAlertConditionMap{ "key": MultiLocationAlertConditionArgs{...} }
type MultiLocationAlertConditionMapInput interface {
	pulumi.Input

	ToMultiLocationAlertConditionMapOutput() MultiLocationAlertConditionMapOutput
	ToMultiLocationAlertConditionMapOutputWithContext(context.Context) MultiLocationAlertConditionMapOutput
}

type MultiLocationAlertConditionMap map[string]MultiLocationAlertConditionInput

func (MultiLocationAlertConditionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MultiLocationAlertCondition)(nil)).Elem()
}

func (i MultiLocationAlertConditionMap) ToMultiLocationAlertConditionMapOutput() MultiLocationAlertConditionMapOutput {
	return i.ToMultiLocationAlertConditionMapOutputWithContext(context.Background())
}

func (i MultiLocationAlertConditionMap) ToMultiLocationAlertConditionMapOutputWithContext(ctx context.Context) MultiLocationAlertConditionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiLocationAlertConditionMapOutput)
}

func (i MultiLocationAlertConditionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MultiLocationAlertCondition] {
	return pulumix.Output[map[string]*MultiLocationAlertCondition]{
		OutputState: i.ToMultiLocationAlertConditionMapOutputWithContext(ctx).OutputState,
	}
}

type MultiLocationAlertConditionOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiLocationAlertCondition)(nil)).Elem()
}

func (o MultiLocationAlertConditionOutput) ToMultiLocationAlertConditionOutput() MultiLocationAlertConditionOutput {
	return o
}

func (o MultiLocationAlertConditionOutput) ToMultiLocationAlertConditionOutputWithContext(ctx context.Context) MultiLocationAlertConditionOutput {
	return o
}

func (o MultiLocationAlertConditionOutput) ToOutput(ctx context.Context) pulumix.Output[*MultiLocationAlertCondition] {
	return pulumix.Output[*MultiLocationAlertCondition]{
		OutputState: o.OutputState,
	}
}

// A condition term with the priority set to critical.
func (o MultiLocationAlertConditionOutput) Critical() MultiLocationAlertConditionCriticalOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) MultiLocationAlertConditionCriticalOutput { return v.Critical }).(MultiLocationAlertConditionCriticalOutput)
}

// Set whether to enable the alert condition.  Defaults to true.
func (o MultiLocationAlertConditionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The Monitor GUID's of the Synthetics monitors to alert on.
func (o MultiLocationAlertConditionOutput) Entities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.StringArrayOutput { return v.Entities }).(pulumi.StringArrayOutput)
}

// The unique entity identifier of the condition in New Relic.
func (o MultiLocationAlertConditionOutput) EntityGuid() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.StringOutput { return v.EntityGuid }).(pulumi.StringOutput)
}

// The title of the condition.
func (o MultiLocationAlertConditionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the policy where this condition will be used.
func (o MultiLocationAlertConditionOutput) PolicyId() pulumi.IntOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.IntOutput { return v.PolicyId }).(pulumi.IntOutput)
}

// Runbook URL to display in notifications.
func (o MultiLocationAlertConditionOutput) RunbookUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.StringPtrOutput { return v.RunbookUrl }).(pulumi.StringPtrOutput)
}

// The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
func (o MultiLocationAlertConditionOutput) ViolationTimeLimitSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) pulumi.IntPtrOutput { return v.ViolationTimeLimitSeconds }).(pulumi.IntPtrOutput)
}

// A condition term with the priority set to warning.
//
// > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
func (o MultiLocationAlertConditionOutput) Warning() MultiLocationAlertConditionWarningPtrOutput {
	return o.ApplyT(func(v *MultiLocationAlertCondition) MultiLocationAlertConditionWarningPtrOutput { return v.Warning }).(MultiLocationAlertConditionWarningPtrOutput)
}

type MultiLocationAlertConditionArrayOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MultiLocationAlertCondition)(nil)).Elem()
}

func (o MultiLocationAlertConditionArrayOutput) ToMultiLocationAlertConditionArrayOutput() MultiLocationAlertConditionArrayOutput {
	return o
}

func (o MultiLocationAlertConditionArrayOutput) ToMultiLocationAlertConditionArrayOutputWithContext(ctx context.Context) MultiLocationAlertConditionArrayOutput {
	return o
}

func (o MultiLocationAlertConditionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MultiLocationAlertCondition] {
	return pulumix.Output[[]*MultiLocationAlertCondition]{
		OutputState: o.OutputState,
	}
}

func (o MultiLocationAlertConditionArrayOutput) Index(i pulumi.IntInput) MultiLocationAlertConditionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MultiLocationAlertCondition {
		return vs[0].([]*MultiLocationAlertCondition)[vs[1].(int)]
	}).(MultiLocationAlertConditionOutput)
}

type MultiLocationAlertConditionMapOutput struct{ *pulumi.OutputState }

func (MultiLocationAlertConditionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MultiLocationAlertCondition)(nil)).Elem()
}

func (o MultiLocationAlertConditionMapOutput) ToMultiLocationAlertConditionMapOutput() MultiLocationAlertConditionMapOutput {
	return o
}

func (o MultiLocationAlertConditionMapOutput) ToMultiLocationAlertConditionMapOutputWithContext(ctx context.Context) MultiLocationAlertConditionMapOutput {
	return o
}

func (o MultiLocationAlertConditionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MultiLocationAlertCondition] {
	return pulumix.Output[map[string]*MultiLocationAlertCondition]{
		OutputState: o.OutputState,
	}
}

func (o MultiLocationAlertConditionMapOutput) MapIndex(k pulumi.StringInput) MultiLocationAlertConditionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MultiLocationAlertCondition {
		return vs[0].(map[string]*MultiLocationAlertCondition)[vs[1].(string)]
	}).(MultiLocationAlertConditionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionInput)(nil)).Elem(), &MultiLocationAlertCondition{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionArrayInput)(nil)).Elem(), MultiLocationAlertConditionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiLocationAlertConditionMapInput)(nil)).Elem(), MultiLocationAlertConditionMap{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionArrayOutput{})
	pulumi.RegisterOutputType(MultiLocationAlertConditionMapOutput{})
}
