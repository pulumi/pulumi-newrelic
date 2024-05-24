// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alertType in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fastBurn` or `slowBurn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).
//
// ## Example Usage
//
// Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.
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
//			fooTarget := 99.9
//			fooPeriod := 28
//			_, err := newrelic.NewServiceLevel(ctx, "foo", &newrelic.ServiceLevelArgs{
//				Guid:        pulumi.String("MXxBUE18QVBQTElDQVRJT058MQ"),
//				Name:        pulumi.String("Latency"),
//				Description: pulumi.String("Proportion of requests that are served faster than a threshold."),
//				Events: &newrelic.ServiceLevelEventsArgs{
//					AccountId: pulumi.String("12345678"),
//					ValidEvents: &newrelic.ServiceLevelEventsValidEventsArgs{
//						From:  pulumi.String("Transaction"),
//						Where: pulumi.String("appName = 'Example application' AND (transactionType='Web')"),
//					},
//					BadEvents: &newrelic.ServiceLevelEventsBadEventsArgs{
//						From:  pulumi.String("Transaction"),
//						Where: pulumi.String("appName = 'Example application' AND (transactionType= 'Web') AND duration > 0.1"),
//					},
//				},
//				Objective: &newrelic.ServiceLevelObjectiveArgs{
//					Target: pulumi.Float64(fooTarget),
//					TimeWindow: &newrelic.ServiceLevelObjectiveTimeWindowArgs{
//						Rolling: &newrelic.ServiceLevelObjectiveTimeWindowRollingArgs{
//							Count: pulumi.Float64(fooPeriod),
//							Unit:  pulumi.String("DAY"),
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
// Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
// Note that the Service Level was set up using bad events, that's why `isBadEvents` is set to `true`.
// If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.
//
// Here is an example of a `slowBurn` alert.
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
//			fooSlowBurn, err := newrelic.GetServiceLevelAlertHelper(ctx, &newrelic.GetServiceLevelAlertHelperArgs{
//				AlertType:   "slow_burn",
//				SliGuid:     foo.SliGuid,
//				SloTarget:   fooTarget,
//				SloPeriod:   fooPeriod,
//				IsBadEvents: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewNrqlAlertCondition(ctx, "your_condition", &newrelic.NrqlAlertConditionArgs{
//				AccountId:                 pulumi.String("12345678"),
//				PolicyId:                  pulumi.String("67890"),
//				Type:                      pulumi.String("static"),
//				Name:                      pulumi.String("Slow burn alert"),
//				Enabled:                   pulumi.Bool(true),
//				ViolationTimeLimitSeconds: pulumi.Int(259200),
//				Nrql: &newrelic.NrqlAlertConditionNrqlArgs{
//					Query: pulumi.String(fooSlowBurn.Nrql),
//				},
//				Critical: &newrelic.NrqlAlertConditionCriticalArgs{
//					Operator:             pulumi.String("above_or_equals"),
//					Threshold:            pulumi.Float64(fooSlowBurn.Threshold),
//					ThresholdDuration:    pulumi.Int(900),
//					ThresholdOccurrences: pulumi.String("at_least_once"),
//				},
//				FillOption:        pulumi.String("none"),
//				AggregationWindow: pulumi.Int(fooSlowBurn.EvaluationPeriod),
//				AggregationMethod: pulumi.String("event_flow"),
//				AggregationDelay:  pulumi.String("120"),
//				SlideBy:           pulumi.Int(900),
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
// Here is an example of a custom alert:
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
//			fooCustom, err := newrelic.GetServiceLevelAlertHelper(ctx, &newrelic.GetServiceLevelAlertHelperArgs{
//				AlertType:                        "custom",
//				SliGuid:                          foo.SliGuid,
//				SloTarget:                        fooTarget,
//				SloPeriod:                        fooPeriod,
//				CustomToleratedBudgetConsumption: pulumi.Float64Ref(4),
//				CustomEvaluationPeriod:           pulumi.IntRef(5400),
//				IsBadEvents:                      pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewNrqlAlertCondition(ctx, "your_condition", &newrelic.NrqlAlertConditionArgs{
//				AccountId:                 pulumi.String("12345678"),
//				PolicyId:                  pulumi.String("67890"),
//				Type:                      pulumi.String("static"),
//				Name:                      pulumi.String("Custom burn alert"),
//				Enabled:                   pulumi.Bool(true),
//				ViolationTimeLimitSeconds: pulumi.Int(259200),
//				Nrql: &newrelic.NrqlAlertConditionNrqlArgs{
//					Query: pulumi.String(fooCustom.Nrql),
//				},
//				Critical: &newrelic.NrqlAlertConditionCriticalArgs{
//					Operator:             pulumi.String("above_or_equals"),
//					Threshold:            pulumi.Float64(fooCustom.Threshold),
//					ThresholdDuration:    pulumi.Int(900),
//					ThresholdOccurrences: pulumi.String("at_least_once"),
//				},
//				FillOption:        pulumi.String("none"),
//				AggregationWindow: pulumi.Int(fooCustom.EvaluationPeriod),
//				AggregationMethod: pulumi.String("event_flow"),
//				AggregationDelay:  pulumi.String("120"),
//				SlideBy:           pulumi.Int(60),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetServiceLevelAlertHelper(ctx *pulumi.Context, args *GetServiceLevelAlertHelperArgs, opts ...pulumi.InvokeOption) (*GetServiceLevelAlertHelperResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceLevelAlertHelperResult
	err := ctx.Invoke("newrelic:index/getServiceLevelAlertHelper:getServiceLevelAlertHelper", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceLevelAlertHelper.
type GetServiceLevelAlertHelperArgs struct {
	// The type of alert we want to set. Valid values are:
	AlertType string `pulumi:"alertType"`
	// Aggregation window taken into consideration in seconds. Mandatory if `alertType` is `custom`.
	CustomEvaluationPeriod *int `pulumi:"customEvaluationPeriod"`
	// How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alertType` is `custom`.
	CustomToleratedBudgetConsumption *float64 `pulumi:"customToleratedBudgetConsumption"`
	// If the SLI is defined using bad events. Defaults to `false`
	IsBadEvents *bool `pulumi:"isBadEvents"`
	// The guid of the sli we want to set the alert on.
	SliGuid string `pulumi:"sliGuid"`
	// The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
	SloPeriod int `pulumi:"sloPeriod"`
	// The target of the Service Level Objective, valid values between `0` and `100`.
	SloTarget float64 `pulumi:"sloTarget"`
}

// A collection of values returned by getServiceLevelAlertHelper.
type GetServiceLevelAlertHelperResult struct {
	AlertType                        string   `pulumi:"alertType"`
	CustomEvaluationPeriod           *int     `pulumi:"customEvaluationPeriod"`
	CustomToleratedBudgetConsumption *float64 `pulumi:"customToleratedBudgetConsumption"`
	// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customEvaluationPeriod`.
	EvaluationPeriod int `pulumi:"evaluationPeriod"`
	// The provider-assigned unique ID for this managed resource.
	Id          string `pulumi:"id"`
	IsBadEvents *bool  `pulumi:"isBadEvents"`
	// (Computed) The nrql query for the selected type of alert.
	Nrql      string  `pulumi:"nrql"`
	SliGuid   string  `pulumi:"sliGuid"`
	SloPeriod int     `pulumi:"sloPeriod"`
	SloTarget float64 `pulumi:"sloTarget"`
	// (Computed) The computed threshold given the provided arguments.
	Threshold float64 `pulumi:"threshold"`
	// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customToleratedBudgetConsumption`.
	ToleratedBudgetConsumption float64 `pulumi:"toleratedBudgetConsumption"`
}

func GetServiceLevelAlertHelperOutput(ctx *pulumi.Context, args GetServiceLevelAlertHelperOutputArgs, opts ...pulumi.InvokeOption) GetServiceLevelAlertHelperResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceLevelAlertHelperResult, error) {
			args := v.(GetServiceLevelAlertHelperArgs)
			r, err := GetServiceLevelAlertHelper(ctx, &args, opts...)
			var s GetServiceLevelAlertHelperResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceLevelAlertHelperResultOutput)
}

// A collection of arguments for invoking getServiceLevelAlertHelper.
type GetServiceLevelAlertHelperOutputArgs struct {
	// The type of alert we want to set. Valid values are:
	AlertType pulumi.StringInput `pulumi:"alertType"`
	// Aggregation window taken into consideration in seconds. Mandatory if `alertType` is `custom`.
	CustomEvaluationPeriod pulumi.IntPtrInput `pulumi:"customEvaluationPeriod"`
	// How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alertType` is `custom`.
	CustomToleratedBudgetConsumption pulumi.Float64PtrInput `pulumi:"customToleratedBudgetConsumption"`
	// If the SLI is defined using bad events. Defaults to `false`
	IsBadEvents pulumi.BoolPtrInput `pulumi:"isBadEvents"`
	// The guid of the sli we want to set the alert on.
	SliGuid pulumi.StringInput `pulumi:"sliGuid"`
	// The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
	SloPeriod pulumi.IntInput `pulumi:"sloPeriod"`
	// The target of the Service Level Objective, valid values between `0` and `100`.
	SloTarget pulumi.Float64Input `pulumi:"sloTarget"`
}

func (GetServiceLevelAlertHelperOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceLevelAlertHelperArgs)(nil)).Elem()
}

// A collection of values returned by getServiceLevelAlertHelper.
type GetServiceLevelAlertHelperResultOutput struct{ *pulumi.OutputState }

func (GetServiceLevelAlertHelperResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceLevelAlertHelperResult)(nil)).Elem()
}

func (o GetServiceLevelAlertHelperResultOutput) ToGetServiceLevelAlertHelperResultOutput() GetServiceLevelAlertHelperResultOutput {
	return o
}

func (o GetServiceLevelAlertHelperResultOutput) ToGetServiceLevelAlertHelperResultOutputWithContext(ctx context.Context) GetServiceLevelAlertHelperResultOutput {
	return o
}

func (o GetServiceLevelAlertHelperResultOutput) AlertType() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) string { return v.AlertType }).(pulumi.StringOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) CustomEvaluationPeriod() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) *int { return v.CustomEvaluationPeriod }).(pulumi.IntPtrOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) CustomToleratedBudgetConsumption() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) *float64 { return v.CustomToleratedBudgetConsumption }).(pulumi.Float64PtrOutput)
}

// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customEvaluationPeriod`.
func (o GetServiceLevelAlertHelperResultOutput) EvaluationPeriod() pulumi.IntOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) int { return v.EvaluationPeriod }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceLevelAlertHelperResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) IsBadEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) *bool { return v.IsBadEvents }).(pulumi.BoolPtrOutput)
}

// (Computed) The nrql query for the selected type of alert.
func (o GetServiceLevelAlertHelperResultOutput) Nrql() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) string { return v.Nrql }).(pulumi.StringOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) SliGuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) string { return v.SliGuid }).(pulumi.StringOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) SloPeriod() pulumi.IntOutput {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) int { return v.SloPeriod }).(pulumi.IntOutput)
}

func (o GetServiceLevelAlertHelperResultOutput) SloTarget() pulumi.Float64Output {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) float64 { return v.SloTarget }).(pulumi.Float64Output)
}

// (Computed) The computed threshold given the provided arguments.
func (o GetServiceLevelAlertHelperResultOutput) Threshold() pulumi.Float64Output {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) float64 { return v.Threshold }).(pulumi.Float64Output)
}

// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customToleratedBudgetConsumption`.
func (o GetServiceLevelAlertHelperResultOutput) ToleratedBudgetConsumption() pulumi.Float64Output {
	return o.ApplyT(func(v GetServiceLevelAlertHelperResult) float64 { return v.ToleratedBudgetConsumption }).(pulumi.Float64Output)
}

func init() {
	pulumi.RegisterOutputType(GetServiceLevelAlertHelperResultOutput{})
}
