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

// Use this resource to create, update and delete New Relic Log Parsing Rule.
//
// ## Example Usage
//
// Use this example to create the log parse rule.
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
//			_, err := newrelic.NewLogParsingRule(ctx, "foo", &newrelic.LogParsingRuleArgs{
//				Attribute: pulumi.String("message"),
//				Enabled:   pulumi.Bool(true),
//				Grok:      pulumi.String("sampleattribute='%%{NUMBER:test:int}'"),
//				Lucene:    pulumi.String("logtype:linux_messages"),
//				Nrql:      pulumi.String("SELECT * FROM Log WHERE logtype = 'linux_messages'"),
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
// ## Additional Example
//
// Use this example to validate a grok pattern and create the log parse rule.  More
// information on grok pattern can be found [here](https://docs.newrelic.com/docs/logs/ui-data/parsing/#grok)
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
//			grok, err := newrelic.GetTestGrokPattern(ctx, &newrelic.GetTestGrokPatternArgs{
//				Grok: "%{IP:host_ip}",
//				LogLines: []string{
//					"host_ip: 43.3.120.2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewLogParsingRule(ctx, "foo", &newrelic.LogParsingRuleArgs{
//				Attribute: pulumi.String("message"),
//				Enabled:   pulumi.Bool(true),
//				Grok:      *pulumi.String(grok.Grok),
//				Lucene:    pulumi.String("logtype:linux_messages"),
//				Nrql:      pulumi.String("SELECT * FROM Log WHERE logtype = 'linux_messages'"),
//				Matched:   *pulumi.Bool(grok.TestGroks[0].Matched),
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
// ## Import
//
// New Relic log parsing rule can be imported using the rule ID, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/logParsingRule:LogParsingRule foo 3456789
// ```
type LogParsingRule struct {
	pulumi.CustomResourceState

	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
	Attribute pulumi.StringPtrOutput `pulumi:"attribute"`
	// Whether or not this rule is deleted.
	Deleted pulumi.BoolOutput `pulumi:"deleted"`
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The Grok of what to parse.
	Grok pulumi.StringOutput `pulumi:"grok"`
	// The Lucene to match events to the parsing rule.
	Lucene pulumi.StringOutput `pulumi:"lucene"`
	// Whether the Grok pattern matched.
	Matched pulumi.BoolOutput `pulumi:"matched"`
	// Name of rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// The NRQL to match events to the parsing rule.
	Nrql pulumi.StringOutput `pulumi:"nrql"`
}

// NewLogParsingRule registers a new resource with the given unique name, arguments, and options.
func NewLogParsingRule(ctx *pulumi.Context,
	name string, args *LogParsingRuleArgs, opts ...pulumi.ResourceOption) (*LogParsingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Grok == nil {
		return nil, errors.New("invalid value for required argument 'Grok'")
	}
	if args.Lucene == nil {
		return nil, errors.New("invalid value for required argument 'Lucene'")
	}
	if args.Nrql == nil {
		return nil, errors.New("invalid value for required argument 'Nrql'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogParsingRule
	err := ctx.RegisterResource("newrelic:index/logParsingRule:LogParsingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogParsingRule gets an existing LogParsingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogParsingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogParsingRuleState, opts ...pulumi.ResourceOption) (*LogParsingRule, error) {
	var resource LogParsingRule
	err := ctx.ReadResource("newrelic:index/logParsingRule:LogParsingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogParsingRule resources.
type logParsingRuleState struct {
	// The account id associated with the obfuscation rule.
	AccountId *int `pulumi:"accountId"`
	// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
	Attribute *string `pulumi:"attribute"`
	// Whether or not this rule is deleted.
	Deleted *bool `pulumi:"deleted"`
	// Whether the rule should be applied or not to incoming data.
	Enabled *bool `pulumi:"enabled"`
	// The Grok of what to parse.
	Grok *string `pulumi:"grok"`
	// The Lucene to match events to the parsing rule.
	Lucene *string `pulumi:"lucene"`
	// Whether the Grok pattern matched.
	Matched *bool `pulumi:"matched"`
	// Name of rule.
	Name *string `pulumi:"name"`
	// The NRQL to match events to the parsing rule.
	Nrql *string `pulumi:"nrql"`
}

type LogParsingRuleState struct {
	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntPtrInput
	// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
	Attribute pulumi.StringPtrInput
	// Whether or not this rule is deleted.
	Deleted pulumi.BoolPtrInput
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolPtrInput
	// The Grok of what to parse.
	Grok pulumi.StringPtrInput
	// The Lucene to match events to the parsing rule.
	Lucene pulumi.StringPtrInput
	// Whether the Grok pattern matched.
	Matched pulumi.BoolPtrInput
	// Name of rule.
	Name pulumi.StringPtrInput
	// The NRQL to match events to the parsing rule.
	Nrql pulumi.StringPtrInput
}

func (LogParsingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*logParsingRuleState)(nil)).Elem()
}

type logParsingRuleArgs struct {
	// The account id associated with the obfuscation rule.
	AccountId *int `pulumi:"accountId"`
	// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
	Attribute *string `pulumi:"attribute"`
	// Whether the rule should be applied or not to incoming data.
	Enabled bool `pulumi:"enabled"`
	// The Grok of what to parse.
	Grok string `pulumi:"grok"`
	// The Lucene to match events to the parsing rule.
	Lucene string `pulumi:"lucene"`
	// Whether the Grok pattern matched.
	Matched *bool `pulumi:"matched"`
	// Name of rule.
	Name *string `pulumi:"name"`
	// The NRQL to match events to the parsing rule.
	Nrql string `pulumi:"nrql"`
}

// The set of arguments for constructing a LogParsingRule resource.
type LogParsingRuleArgs struct {
	// The account id associated with the obfuscation rule.
	AccountId pulumi.IntPtrInput
	// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
	Attribute pulumi.StringPtrInput
	// Whether the rule should be applied or not to incoming data.
	Enabled pulumi.BoolInput
	// The Grok of what to parse.
	Grok pulumi.StringInput
	// The Lucene to match events to the parsing rule.
	Lucene pulumi.StringInput
	// Whether the Grok pattern matched.
	Matched pulumi.BoolPtrInput
	// Name of rule.
	Name pulumi.StringPtrInput
	// The NRQL to match events to the parsing rule.
	Nrql pulumi.StringInput
}

func (LogParsingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logParsingRuleArgs)(nil)).Elem()
}

type LogParsingRuleInput interface {
	pulumi.Input

	ToLogParsingRuleOutput() LogParsingRuleOutput
	ToLogParsingRuleOutputWithContext(ctx context.Context) LogParsingRuleOutput
}

func (*LogParsingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**LogParsingRule)(nil)).Elem()
}

func (i *LogParsingRule) ToLogParsingRuleOutput() LogParsingRuleOutput {
	return i.ToLogParsingRuleOutputWithContext(context.Background())
}

func (i *LogParsingRule) ToLogParsingRuleOutputWithContext(ctx context.Context) LogParsingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogParsingRuleOutput)
}

// LogParsingRuleArrayInput is an input type that accepts LogParsingRuleArray and LogParsingRuleArrayOutput values.
// You can construct a concrete instance of `LogParsingRuleArrayInput` via:
//
//	LogParsingRuleArray{ LogParsingRuleArgs{...} }
type LogParsingRuleArrayInput interface {
	pulumi.Input

	ToLogParsingRuleArrayOutput() LogParsingRuleArrayOutput
	ToLogParsingRuleArrayOutputWithContext(context.Context) LogParsingRuleArrayOutput
}

type LogParsingRuleArray []LogParsingRuleInput

func (LogParsingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogParsingRule)(nil)).Elem()
}

func (i LogParsingRuleArray) ToLogParsingRuleArrayOutput() LogParsingRuleArrayOutput {
	return i.ToLogParsingRuleArrayOutputWithContext(context.Background())
}

func (i LogParsingRuleArray) ToLogParsingRuleArrayOutputWithContext(ctx context.Context) LogParsingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogParsingRuleArrayOutput)
}

// LogParsingRuleMapInput is an input type that accepts LogParsingRuleMap and LogParsingRuleMapOutput values.
// You can construct a concrete instance of `LogParsingRuleMapInput` via:
//
//	LogParsingRuleMap{ "key": LogParsingRuleArgs{...} }
type LogParsingRuleMapInput interface {
	pulumi.Input

	ToLogParsingRuleMapOutput() LogParsingRuleMapOutput
	ToLogParsingRuleMapOutputWithContext(context.Context) LogParsingRuleMapOutput
}

type LogParsingRuleMap map[string]LogParsingRuleInput

func (LogParsingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogParsingRule)(nil)).Elem()
}

func (i LogParsingRuleMap) ToLogParsingRuleMapOutput() LogParsingRuleMapOutput {
	return i.ToLogParsingRuleMapOutputWithContext(context.Background())
}

func (i LogParsingRuleMap) ToLogParsingRuleMapOutputWithContext(ctx context.Context) LogParsingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogParsingRuleMapOutput)
}

type LogParsingRuleOutput struct{ *pulumi.OutputState }

func (LogParsingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogParsingRule)(nil)).Elem()
}

func (o LogParsingRuleOutput) ToLogParsingRuleOutput() LogParsingRuleOutput {
	return o
}

func (o LogParsingRuleOutput) ToLogParsingRuleOutputWithContext(ctx context.Context) LogParsingRuleOutput {
	return o
}

// The account id associated with the obfuscation rule.
func (o LogParsingRuleOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
func (o LogParsingRuleOutput) Attribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.StringPtrOutput { return v.Attribute }).(pulumi.StringPtrOutput)
}

// Whether or not this rule is deleted.
func (o LogParsingRuleOutput) Deleted() pulumi.BoolOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.BoolOutput { return v.Deleted }).(pulumi.BoolOutput)
}

// Whether the rule should be applied or not to incoming data.
func (o LogParsingRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The Grok of what to parse.
func (o LogParsingRuleOutput) Grok() pulumi.StringOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.StringOutput { return v.Grok }).(pulumi.StringOutput)
}

// The Lucene to match events to the parsing rule.
func (o LogParsingRuleOutput) Lucene() pulumi.StringOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.StringOutput { return v.Lucene }).(pulumi.StringOutput)
}

// Whether the Grok pattern matched.
func (o LogParsingRuleOutput) Matched() pulumi.BoolOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.BoolOutput { return v.Matched }).(pulumi.BoolOutput)
}

// Name of rule.
func (o LogParsingRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The NRQL to match events to the parsing rule.
func (o LogParsingRuleOutput) Nrql() pulumi.StringOutput {
	return o.ApplyT(func(v *LogParsingRule) pulumi.StringOutput { return v.Nrql }).(pulumi.StringOutput)
}

type LogParsingRuleArrayOutput struct{ *pulumi.OutputState }

func (LogParsingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogParsingRule)(nil)).Elem()
}

func (o LogParsingRuleArrayOutput) ToLogParsingRuleArrayOutput() LogParsingRuleArrayOutput {
	return o
}

func (o LogParsingRuleArrayOutput) ToLogParsingRuleArrayOutputWithContext(ctx context.Context) LogParsingRuleArrayOutput {
	return o
}

func (o LogParsingRuleArrayOutput) Index(i pulumi.IntInput) LogParsingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogParsingRule {
		return vs[0].([]*LogParsingRule)[vs[1].(int)]
	}).(LogParsingRuleOutput)
}

type LogParsingRuleMapOutput struct{ *pulumi.OutputState }

func (LogParsingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogParsingRule)(nil)).Elem()
}

func (o LogParsingRuleMapOutput) ToLogParsingRuleMapOutput() LogParsingRuleMapOutput {
	return o
}

func (o LogParsingRuleMapOutput) ToLogParsingRuleMapOutputWithContext(ctx context.Context) LogParsingRuleMapOutput {
	return o
}

func (o LogParsingRuleMapOutput) MapIndex(k pulumi.StringInput) LogParsingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogParsingRule {
		return vs[0].(map[string]*LogParsingRule)[vs[1].(string)]
	}).(LogParsingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogParsingRuleInput)(nil)).Elem(), &LogParsingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogParsingRuleArrayInput)(nil)).Elem(), LogParsingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogParsingRuleMapInput)(nil)).Elem(), LogParsingRuleMap{})
	pulumi.RegisterOutputType(LogParsingRuleOutput{})
	pulumi.RegisterOutputType(LogParsingRuleArrayOutput{})
	pulumi.RegisterOutputType(LogParsingRuleMapOutput{})
}
