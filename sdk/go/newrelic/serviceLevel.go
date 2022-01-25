// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **New Relic Service Level Management is in preview. [Read more](https://docs.newrelic.com/docs/service-level-management/intro-slm)**
//
// Use this resource to create, update, and delete New Relic Service Level Indicators and Objectives.
//
// A New Relic User API key is required to provision this resource.  Set the `apiKey`
// attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
// variable with your User API key.
//
// Important:
// - Only roles that provide [permissions](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/) to create events to metric rules can create SLI/SLOs.
// - Only [Full users](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/#user-type) can view SLI/SLOs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := newrelic.NewServiceLevel(ctx, "foo", &newrelic.ServiceLevelArgs{
// 			Description: pulumi.String("SLI that measures the availability of the service."),
// 			Events: &ServiceLevelEventsArgs{
// 				AccountId: pulumi.Int(12345678),
// 				BadEvents: &ServiceLevelEventsBadEventsArgs{
// 					From:  pulumi.String("TransactionError"),
// 					Where: pulumi.String("appName = 'Example application' AND error.expected is false"),
// 				},
// 				ValidEvents: &ServiceLevelEventsValidEventsArgs{
// 					From:  pulumi.String("Transaction"),
// 					Where: pulumi.String("appName = 'Example application'"),
// 				},
// 			},
// 			Guid: pulumi.String("MXxBUE18QVBQTElDQVRJT058MQ"),
// 			Objectives: ServiceLevelObjectiveArray{
// 				&ServiceLevelObjectiveArgs{
// 					Target: pulumi.Float64(99),
// 					TimeWindow: &ServiceLevelObjectiveTimeWindowArgs{
// 						Rolling: &ServiceLevelObjectiveTimeWindowRollingArgs{
// 							Count: pulumi.Int(7),
// 							Unit:  pulumi.String("DAY"),
// 						},
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// New Relic Service Levels can be imported using a concatenated string of the format
//
// `<account_id>:<sli_id>:<guid>`, where the `guid` is the entity the SLI relates to. Examplebash
//
// ```sh
//  $ pulumi import newrelic:index/serviceLevel:ServiceLevel foo 12345678:4321:MXxBUE18QVBQTElDQVRJT058MQ
// ```
type ServiceLevel struct {
	pulumi.CustomResourceState

	// The description of the SLI.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The events that define the NRDB data for the SLI/SLO calculations.
	// See Events below for details.
	Events ServiceLevelEventsOutput `pulumi:"events"`
	// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// A short name for the SLI that will help anyone understand what it is about.
	Name pulumi.StringOutput `pulumi:"name"`
	// An objective for the SLI. Multiple objective blocks can be defined for an SLI.
	// See Nested objective blocks below for details.
	Objectives ServiceLevelObjectiveArrayOutput `pulumi:"objectives"`
	// The unique entity identifier of the Service Level Indicator.
	SliId pulumi.StringOutput `pulumi:"sliId"`
}

// NewServiceLevel registers a new resource with the given unique name, arguments, and options.
func NewServiceLevel(ctx *pulumi.Context,
	name string, args *ServiceLevelArgs, opts ...pulumi.ResourceOption) (*ServiceLevel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Events == nil {
		return nil, errors.New("invalid value for required argument 'Events'")
	}
	if args.Guid == nil {
		return nil, errors.New("invalid value for required argument 'Guid'")
	}
	var resource ServiceLevel
	err := ctx.RegisterResource("newrelic:index/serviceLevel:ServiceLevel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceLevel gets an existing ServiceLevel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceLevel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceLevelState, opts ...pulumi.ResourceOption) (*ServiceLevel, error) {
	var resource ServiceLevel
	err := ctx.ReadResource("newrelic:index/serviceLevel:ServiceLevel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceLevel resources.
type serviceLevelState struct {
	// The description of the SLI.
	Description *string `pulumi:"description"`
	// The events that define the NRDB data for the SLI/SLO calculations.
	// See Events below for details.
	Events *ServiceLevelEvents `pulumi:"events"`
	// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
	Guid *string `pulumi:"guid"`
	// A short name for the SLI that will help anyone understand what it is about.
	Name *string `pulumi:"name"`
	// An objective for the SLI. Multiple objective blocks can be defined for an SLI.
	// See Nested objective blocks below for details.
	Objectives []ServiceLevelObjective `pulumi:"objectives"`
	// The unique entity identifier of the Service Level Indicator.
	SliId *string `pulumi:"sliId"`
}

type ServiceLevelState struct {
	// The description of the SLI.
	Description pulumi.StringPtrInput
	// The events that define the NRDB data for the SLI/SLO calculations.
	// See Events below for details.
	Events ServiceLevelEventsPtrInput
	// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
	Guid pulumi.StringPtrInput
	// A short name for the SLI that will help anyone understand what it is about.
	Name pulumi.StringPtrInput
	// An objective for the SLI. Multiple objective blocks can be defined for an SLI.
	// See Nested objective blocks below for details.
	Objectives ServiceLevelObjectiveArrayInput
	// The unique entity identifier of the Service Level Indicator.
	SliId pulumi.StringPtrInput
}

func (ServiceLevelState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLevelState)(nil)).Elem()
}

type serviceLevelArgs struct {
	// The description of the SLI.
	Description *string `pulumi:"description"`
	// The events that define the NRDB data for the SLI/SLO calculations.
	// See Events below for details.
	Events ServiceLevelEvents `pulumi:"events"`
	// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
	Guid string `pulumi:"guid"`
	// A short name for the SLI that will help anyone understand what it is about.
	Name *string `pulumi:"name"`
	// An objective for the SLI. Multiple objective blocks can be defined for an SLI.
	// See Nested objective blocks below for details.
	Objectives []ServiceLevelObjective `pulumi:"objectives"`
}

// The set of arguments for constructing a ServiceLevel resource.
type ServiceLevelArgs struct {
	// The description of the SLI.
	Description pulumi.StringPtrInput
	// The events that define the NRDB data for the SLI/SLO calculations.
	// See Events below for details.
	Events ServiceLevelEventsInput
	// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
	Guid pulumi.StringInput
	// A short name for the SLI that will help anyone understand what it is about.
	Name pulumi.StringPtrInput
	// An objective for the SLI. Multiple objective blocks can be defined for an SLI.
	// See Nested objective blocks below for details.
	Objectives ServiceLevelObjectiveArrayInput
}

func (ServiceLevelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLevelArgs)(nil)).Elem()
}

type ServiceLevelInput interface {
	pulumi.Input

	ToServiceLevelOutput() ServiceLevelOutput
	ToServiceLevelOutputWithContext(ctx context.Context) ServiceLevelOutput
}

func (*ServiceLevel) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceLevel)(nil))
}

func (i *ServiceLevel) ToServiceLevelOutput() ServiceLevelOutput {
	return i.ToServiceLevelOutputWithContext(context.Background())
}

func (i *ServiceLevel) ToServiceLevelOutputWithContext(ctx context.Context) ServiceLevelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLevelOutput)
}

func (i *ServiceLevel) ToServiceLevelPtrOutput() ServiceLevelPtrOutput {
	return i.ToServiceLevelPtrOutputWithContext(context.Background())
}

func (i *ServiceLevel) ToServiceLevelPtrOutputWithContext(ctx context.Context) ServiceLevelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLevelPtrOutput)
}

type ServiceLevelPtrInput interface {
	pulumi.Input

	ToServiceLevelPtrOutput() ServiceLevelPtrOutput
	ToServiceLevelPtrOutputWithContext(ctx context.Context) ServiceLevelPtrOutput
}

type serviceLevelPtrType ServiceLevelArgs

func (*serviceLevelPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLevel)(nil))
}

func (i *serviceLevelPtrType) ToServiceLevelPtrOutput() ServiceLevelPtrOutput {
	return i.ToServiceLevelPtrOutputWithContext(context.Background())
}

func (i *serviceLevelPtrType) ToServiceLevelPtrOutputWithContext(ctx context.Context) ServiceLevelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLevelPtrOutput)
}

// ServiceLevelArrayInput is an input type that accepts ServiceLevelArray and ServiceLevelArrayOutput values.
// You can construct a concrete instance of `ServiceLevelArrayInput` via:
//
//          ServiceLevelArray{ ServiceLevelArgs{...} }
type ServiceLevelArrayInput interface {
	pulumi.Input

	ToServiceLevelArrayOutput() ServiceLevelArrayOutput
	ToServiceLevelArrayOutputWithContext(context.Context) ServiceLevelArrayOutput
}

type ServiceLevelArray []ServiceLevelInput

func (ServiceLevelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLevel)(nil)).Elem()
}

func (i ServiceLevelArray) ToServiceLevelArrayOutput() ServiceLevelArrayOutput {
	return i.ToServiceLevelArrayOutputWithContext(context.Background())
}

func (i ServiceLevelArray) ToServiceLevelArrayOutputWithContext(ctx context.Context) ServiceLevelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLevelArrayOutput)
}

// ServiceLevelMapInput is an input type that accepts ServiceLevelMap and ServiceLevelMapOutput values.
// You can construct a concrete instance of `ServiceLevelMapInput` via:
//
//          ServiceLevelMap{ "key": ServiceLevelArgs{...} }
type ServiceLevelMapInput interface {
	pulumi.Input

	ToServiceLevelMapOutput() ServiceLevelMapOutput
	ToServiceLevelMapOutputWithContext(context.Context) ServiceLevelMapOutput
}

type ServiceLevelMap map[string]ServiceLevelInput

func (ServiceLevelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLevel)(nil)).Elem()
}

func (i ServiceLevelMap) ToServiceLevelMapOutput() ServiceLevelMapOutput {
	return i.ToServiceLevelMapOutputWithContext(context.Background())
}

func (i ServiceLevelMap) ToServiceLevelMapOutputWithContext(ctx context.Context) ServiceLevelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLevelMapOutput)
}

type ServiceLevelOutput struct{ *pulumi.OutputState }

func (ServiceLevelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceLevel)(nil))
}

func (o ServiceLevelOutput) ToServiceLevelOutput() ServiceLevelOutput {
	return o
}

func (o ServiceLevelOutput) ToServiceLevelOutputWithContext(ctx context.Context) ServiceLevelOutput {
	return o
}

func (o ServiceLevelOutput) ToServiceLevelPtrOutput() ServiceLevelPtrOutput {
	return o.ToServiceLevelPtrOutputWithContext(context.Background())
}

func (o ServiceLevelOutput) ToServiceLevelPtrOutputWithContext(ctx context.Context) ServiceLevelPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ServiceLevel) *ServiceLevel {
		return &v
	}).(ServiceLevelPtrOutput)
}

type ServiceLevelPtrOutput struct{ *pulumi.OutputState }

func (ServiceLevelPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLevel)(nil))
}

func (o ServiceLevelPtrOutput) ToServiceLevelPtrOutput() ServiceLevelPtrOutput {
	return o
}

func (o ServiceLevelPtrOutput) ToServiceLevelPtrOutputWithContext(ctx context.Context) ServiceLevelPtrOutput {
	return o
}

func (o ServiceLevelPtrOutput) Elem() ServiceLevelOutput {
	return o.ApplyT(func(v *ServiceLevel) ServiceLevel {
		if v != nil {
			return *v
		}
		var ret ServiceLevel
		return ret
	}).(ServiceLevelOutput)
}

type ServiceLevelArrayOutput struct{ *pulumi.OutputState }

func (ServiceLevelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServiceLevel)(nil))
}

func (o ServiceLevelArrayOutput) ToServiceLevelArrayOutput() ServiceLevelArrayOutput {
	return o
}

func (o ServiceLevelArrayOutput) ToServiceLevelArrayOutputWithContext(ctx context.Context) ServiceLevelArrayOutput {
	return o
}

func (o ServiceLevelArrayOutput) Index(i pulumi.IntInput) ServiceLevelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServiceLevel {
		return vs[0].([]ServiceLevel)[vs[1].(int)]
	}).(ServiceLevelOutput)
}

type ServiceLevelMapOutput struct{ *pulumi.OutputState }

func (ServiceLevelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ServiceLevel)(nil))
}

func (o ServiceLevelMapOutput) ToServiceLevelMapOutput() ServiceLevelMapOutput {
	return o
}

func (o ServiceLevelMapOutput) ToServiceLevelMapOutputWithContext(ctx context.Context) ServiceLevelMapOutput {
	return o
}

func (o ServiceLevelMapOutput) MapIndex(k pulumi.StringInput) ServiceLevelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ServiceLevel {
		return vs[0].(map[string]ServiceLevel)[vs[1].(string)]
	}).(ServiceLevelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLevelInput)(nil)).Elem(), &ServiceLevel{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLevelPtrInput)(nil)).Elem(), &ServiceLevel{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLevelArrayInput)(nil)).Elem(), ServiceLevelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLevelMapInput)(nil)).Elem(), ServiceLevelMap{})
	pulumi.RegisterOutputType(ServiceLevelOutput{})
	pulumi.RegisterOutputType(ServiceLevelPtrOutput{})
	pulumi.RegisterOutputType(ServiceLevelArrayOutput{})
	pulumi.RegisterOutputType(ServiceLevelMapOutput{})
}