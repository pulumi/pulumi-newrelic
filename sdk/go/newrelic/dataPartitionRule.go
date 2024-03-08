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

// Use this resource to create, update and delete New Relic Data partition rule.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewDataPartitionRule(ctx, "foo", &newrelic.DataPartitionRuleArgs{
//				Description:         pulumi.String("description"),
//				Enabled:             pulumi.Bool(true),
//				Nrql:                pulumi.String("logtype='node'"),
//				RetentionPolicy:     pulumi.String("STANDARD"),
//				TargetDataPartition: pulumi.String("Log_name"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Additional Information
//
// More details about the data partition can be found [here](https://docs.newrelic.com/docs/logs/ui-data/data-partitions/)
//
// ## Import
//
// New Relic data partition rule can be imported using the rule ID, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/dataPartitionRule:DataPartitionRule foo <id>
// ```
type DataPartitionRule struct {
	pulumi.CustomResourceState

	// The account id associated with the data partition rule.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
	Deleted pulumi.BoolOutput `pulumi:"deleted"`
	// The description of the data partition rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether or not this data partition rule is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
	Nrql pulumi.StringOutput `pulumi:"nrql"`
	// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
	RetentionPolicy pulumi.StringOutput `pulumi:"retentionPolicy"`
	// The name of the data partition where logs will be allocated once the rule is enabled.
	TargetDataPartition pulumi.StringOutput `pulumi:"targetDataPartition"`
}

// NewDataPartitionRule registers a new resource with the given unique name, arguments, and options.
func NewDataPartitionRule(ctx *pulumi.Context,
	name string, args *DataPartitionRuleArgs, opts ...pulumi.ResourceOption) (*DataPartitionRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Nrql == nil {
		return nil, errors.New("invalid value for required argument 'Nrql'")
	}
	if args.RetentionPolicy == nil {
		return nil, errors.New("invalid value for required argument 'RetentionPolicy'")
	}
	if args.TargetDataPartition == nil {
		return nil, errors.New("invalid value for required argument 'TargetDataPartition'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataPartitionRule
	err := ctx.RegisterResource("newrelic:index/dataPartitionRule:DataPartitionRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataPartitionRule gets an existing DataPartitionRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataPartitionRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataPartitionRuleState, opts ...pulumi.ResourceOption) (*DataPartitionRule, error) {
	var resource DataPartitionRule
	err := ctx.ReadResource("newrelic:index/dataPartitionRule:DataPartitionRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataPartitionRule resources.
type dataPartitionRuleState struct {
	// The account id associated with the data partition rule.
	AccountId *int `pulumi:"accountId"`
	// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
	Deleted *bool `pulumi:"deleted"`
	// The description of the data partition rule.
	Description *string `pulumi:"description"`
	// Whether or not this data partition rule is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
	Nrql *string `pulumi:"nrql"`
	// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
	RetentionPolicy *string `pulumi:"retentionPolicy"`
	// The name of the data partition where logs will be allocated once the rule is enabled.
	TargetDataPartition *string `pulumi:"targetDataPartition"`
}

type DataPartitionRuleState struct {
	// The account id associated with the data partition rule.
	AccountId pulumi.IntPtrInput
	// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
	Deleted pulumi.BoolPtrInput
	// The description of the data partition rule.
	Description pulumi.StringPtrInput
	// Whether or not this data partition rule is enabled.
	Enabled pulumi.BoolPtrInput
	// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
	Nrql pulumi.StringPtrInput
	// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
	RetentionPolicy pulumi.StringPtrInput
	// The name of the data partition where logs will be allocated once the rule is enabled.
	TargetDataPartition pulumi.StringPtrInput
}

func (DataPartitionRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPartitionRuleState)(nil)).Elem()
}

type dataPartitionRuleArgs struct {
	// The account id associated with the data partition rule.
	AccountId *int `pulumi:"accountId"`
	// The description of the data partition rule.
	Description *string `pulumi:"description"`
	// Whether or not this data partition rule is enabled.
	Enabled bool `pulumi:"enabled"`
	// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
	Nrql string `pulumi:"nrql"`
	// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
	RetentionPolicy string `pulumi:"retentionPolicy"`
	// The name of the data partition where logs will be allocated once the rule is enabled.
	TargetDataPartition string `pulumi:"targetDataPartition"`
}

// The set of arguments for constructing a DataPartitionRule resource.
type DataPartitionRuleArgs struct {
	// The account id associated with the data partition rule.
	AccountId pulumi.IntPtrInput
	// The description of the data partition rule.
	Description pulumi.StringPtrInput
	// Whether or not this data partition rule is enabled.
	Enabled pulumi.BoolInput
	// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
	Nrql pulumi.StringInput
	// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
	RetentionPolicy pulumi.StringInput
	// The name of the data partition where logs will be allocated once the rule is enabled.
	TargetDataPartition pulumi.StringInput
}

func (DataPartitionRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPartitionRuleArgs)(nil)).Elem()
}

type DataPartitionRuleInput interface {
	pulumi.Input

	ToDataPartitionRuleOutput() DataPartitionRuleOutput
	ToDataPartitionRuleOutputWithContext(ctx context.Context) DataPartitionRuleOutput
}

func (*DataPartitionRule) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPartitionRule)(nil)).Elem()
}

func (i *DataPartitionRule) ToDataPartitionRuleOutput() DataPartitionRuleOutput {
	return i.ToDataPartitionRuleOutputWithContext(context.Background())
}

func (i *DataPartitionRule) ToDataPartitionRuleOutputWithContext(ctx context.Context) DataPartitionRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPartitionRuleOutput)
}

// DataPartitionRuleArrayInput is an input type that accepts DataPartitionRuleArray and DataPartitionRuleArrayOutput values.
// You can construct a concrete instance of `DataPartitionRuleArrayInput` via:
//
//	DataPartitionRuleArray{ DataPartitionRuleArgs{...} }
type DataPartitionRuleArrayInput interface {
	pulumi.Input

	ToDataPartitionRuleArrayOutput() DataPartitionRuleArrayOutput
	ToDataPartitionRuleArrayOutputWithContext(context.Context) DataPartitionRuleArrayOutput
}

type DataPartitionRuleArray []DataPartitionRuleInput

func (DataPartitionRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPartitionRule)(nil)).Elem()
}

func (i DataPartitionRuleArray) ToDataPartitionRuleArrayOutput() DataPartitionRuleArrayOutput {
	return i.ToDataPartitionRuleArrayOutputWithContext(context.Background())
}

func (i DataPartitionRuleArray) ToDataPartitionRuleArrayOutputWithContext(ctx context.Context) DataPartitionRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPartitionRuleArrayOutput)
}

// DataPartitionRuleMapInput is an input type that accepts DataPartitionRuleMap and DataPartitionRuleMapOutput values.
// You can construct a concrete instance of `DataPartitionRuleMapInput` via:
//
//	DataPartitionRuleMap{ "key": DataPartitionRuleArgs{...} }
type DataPartitionRuleMapInput interface {
	pulumi.Input

	ToDataPartitionRuleMapOutput() DataPartitionRuleMapOutput
	ToDataPartitionRuleMapOutputWithContext(context.Context) DataPartitionRuleMapOutput
}

type DataPartitionRuleMap map[string]DataPartitionRuleInput

func (DataPartitionRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPartitionRule)(nil)).Elem()
}

func (i DataPartitionRuleMap) ToDataPartitionRuleMapOutput() DataPartitionRuleMapOutput {
	return i.ToDataPartitionRuleMapOutputWithContext(context.Background())
}

func (i DataPartitionRuleMap) ToDataPartitionRuleMapOutputWithContext(ctx context.Context) DataPartitionRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPartitionRuleMapOutput)
}

type DataPartitionRuleOutput struct{ *pulumi.OutputState }

func (DataPartitionRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPartitionRule)(nil)).Elem()
}

func (o DataPartitionRuleOutput) ToDataPartitionRuleOutput() DataPartitionRuleOutput {
	return o
}

func (o DataPartitionRuleOutput) ToDataPartitionRuleOutputWithContext(ctx context.Context) DataPartitionRuleOutput {
	return o
}

// The account id associated with the data partition rule.
func (o DataPartitionRuleOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
func (o DataPartitionRuleOutput) Deleted() pulumi.BoolOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.BoolOutput { return v.Deleted }).(pulumi.BoolOutput)
}

// The description of the data partition rule.
func (o DataPartitionRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether or not this data partition rule is enabled.
func (o DataPartitionRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
func (o DataPartitionRuleOutput) Nrql() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.StringOutput { return v.Nrql }).(pulumi.StringOutput)
}

// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
func (o DataPartitionRuleOutput) RetentionPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.StringOutput { return v.RetentionPolicy }).(pulumi.StringOutput)
}

// The name of the data partition where logs will be allocated once the rule is enabled.
func (o DataPartitionRuleOutput) TargetDataPartition() pulumi.StringOutput {
	return o.ApplyT(func(v *DataPartitionRule) pulumi.StringOutput { return v.TargetDataPartition }).(pulumi.StringOutput)
}

type DataPartitionRuleArrayOutput struct{ *pulumi.OutputState }

func (DataPartitionRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPartitionRule)(nil)).Elem()
}

func (o DataPartitionRuleArrayOutput) ToDataPartitionRuleArrayOutput() DataPartitionRuleArrayOutput {
	return o
}

func (o DataPartitionRuleArrayOutput) ToDataPartitionRuleArrayOutputWithContext(ctx context.Context) DataPartitionRuleArrayOutput {
	return o
}

func (o DataPartitionRuleArrayOutput) Index(i pulumi.IntInput) DataPartitionRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataPartitionRule {
		return vs[0].([]*DataPartitionRule)[vs[1].(int)]
	}).(DataPartitionRuleOutput)
}

type DataPartitionRuleMapOutput struct{ *pulumi.OutputState }

func (DataPartitionRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPartitionRule)(nil)).Elem()
}

func (o DataPartitionRuleMapOutput) ToDataPartitionRuleMapOutput() DataPartitionRuleMapOutput {
	return o
}

func (o DataPartitionRuleMapOutput) ToDataPartitionRuleMapOutputWithContext(ctx context.Context) DataPartitionRuleMapOutput {
	return o
}

func (o DataPartitionRuleMapOutput) MapIndex(k pulumi.StringInput) DataPartitionRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataPartitionRule {
		return vs[0].(map[string]*DataPartitionRule)[vs[1].(string)]
	}).(DataPartitionRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataPartitionRuleInput)(nil)).Elem(), &DataPartitionRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPartitionRuleArrayInput)(nil)).Elem(), DataPartitionRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPartitionRuleMapInput)(nil)).Elem(), DataPartitionRuleMap{})
	pulumi.RegisterOutputType(DataPartitionRuleOutput{})
	pulumi.RegisterOutputType(DataPartitionRuleArrayOutput{})
	pulumi.RegisterOutputType(DataPartitionRuleMapOutput{})
}
