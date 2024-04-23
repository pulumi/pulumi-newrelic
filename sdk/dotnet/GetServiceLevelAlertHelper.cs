// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetServiceLevelAlertHelper
    {
        /// <summary>
        /// Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alert_type in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fast_burn` or `slow_burn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).
        /// 
        /// ## Example Usage
        /// 
        /// Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooTarget = 99.9;
        /// 
        ///     var fooPeriod = 28;
        /// 
        ///     var foo = new NewRelic.ServiceLevel("foo", new()
        ///     {
        ///         Guid = "MXxBUE18QVBQTElDQVRJT058MQ",
        ///         Name = "Latency",
        ///         Description = "Proportion of requests that are served faster than a threshold.",
        ///         Events = new NewRelic.Inputs.ServiceLevelEventsArgs
        ///         {
        ///             AccountId = 12345678,
        ///             ValidEvents = new NewRelic.Inputs.ServiceLevelEventsValidEventsArgs
        ///             {
        ///                 From = "Transaction",
        ///                 Where = "appName = 'Example application' AND (transactionType='Web')",
        ///             },
        ///             BadEvents = new NewRelic.Inputs.ServiceLevelEventsBadEventsArgs
        ///             {
        ///                 From = "Transaction",
        ///                 Where = "appName = 'Example application' AND (transactionType= 'Web') AND duration &gt; 0.1",
        ///             },
        ///         },
        ///         Objective = new NewRelic.Inputs.ServiceLevelObjectiveArgs
        ///         {
        ///             Target = fooTarget,
        ///             TimeWindow = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowArgs
        ///             {
        ///                 Rolling = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowRollingArgs
        ///                 {
        ///                     Count = fooPeriod,
        ///                     Unit = "DAY",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
        /// Note that the Service Level was set up using bad events, that's why `is_bad_events` is set to `true`.
        /// If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.
        /// 
        /// Here is an example of a `slow_burn` alert.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooSlowBurn = NewRelic.GetServiceLevelAlertHelper.Invoke(new()
        ///     {
        ///         AlertType = "slow_burn",
        ///         SliGuid = foo.SliGuid,
        ///         SloTarget = fooTarget,
        ///         SloPeriod = fooPeriod,
        ///         IsBadEvents = true,
        ///     });
        /// 
        ///     var yourCondition = new NewRelic.NrqlAlertCondition("your_condition", new()
        ///     {
        ///         AccountId = 12345678,
        ///         PolicyId = 67890,
        ///         Type = "static",
        ///         Name = "Slow burn alert",
        ///         Enabled = true,
        ///         ViolationTimeLimitSeconds = 259200,
        ///         Nrql = new NewRelic.Inputs.NrqlAlertConditionNrqlArgs
        ///         {
        ///             Query = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Nrql),
        ///         },
        ///         Critical = new NewRelic.Inputs.NrqlAlertConditionCriticalArgs
        ///         {
        ///             Operator = "above_or_equals",
        ///             Threshold = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Threshold),
        ///             ThresholdDuration = 900,
        ///             ThresholdOccurrences = "at_least_once",
        ///         },
        ///         FillOption = "none",
        ///         AggregationWindow = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.EvaluationPeriod),
        ///         AggregationMethod = "event_flow",
        ///         AggregationDelay = "120",
        ///         SlideBy = 900,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Here is an example of a custom alert:
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooCustom = NewRelic.GetServiceLevelAlertHelper.Invoke(new()
        ///     {
        ///         AlertType = "custom",
        ///         SliGuid = foo.SliGuid,
        ///         SloTarget = fooTarget,
        ///         SloPeriod = fooPeriod,
        ///         CustomToleratedBudgetConsumption = 4,
        ///         CustomEvaluationPeriod = 5400,
        ///         IsBadEvents = true,
        ///     });
        /// 
        ///     var yourCondition = new NewRelic.NrqlAlertCondition("your_condition", new()
        ///     {
        ///         AccountId = 12345678,
        ///         PolicyId = 67890,
        ///         Type = "static",
        ///         Name = "Custom burn alert",
        ///         Enabled = true,
        ///         ViolationTimeLimitSeconds = 259200,
        ///         Nrql = new NewRelic.Inputs.NrqlAlertConditionNrqlArgs
        ///         {
        ///             Query = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Nrql),
        ///         },
        ///         Critical = new NewRelic.Inputs.NrqlAlertConditionCriticalArgs
        ///         {
        ///             Operator = "above_or_equals",
        ///             Threshold = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Threshold),
        ///             ThresholdDuration = 900,
        ///             ThresholdOccurrences = "at_least_once",
        ///         },
        ///         FillOption = "none",
        ///         AggregationWindow = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.EvaluationPeriod),
        ///         AggregationMethod = "event_flow",
        ///         AggregationDelay = "120",
        ///         SlideBy = 60,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceLevelAlertHelperResult> InvokeAsync(GetServiceLevelAlertHelperArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceLevelAlertHelperResult>("newrelic:index/getServiceLevelAlertHelper:getServiceLevelAlertHelper", args ?? new GetServiceLevelAlertHelperArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alert_type in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fast_burn` or `slow_burn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).
        /// 
        /// ## Example Usage
        /// 
        /// Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooTarget = 99.9;
        /// 
        ///     var fooPeriod = 28;
        /// 
        ///     var foo = new NewRelic.ServiceLevel("foo", new()
        ///     {
        ///         Guid = "MXxBUE18QVBQTElDQVRJT058MQ",
        ///         Name = "Latency",
        ///         Description = "Proportion of requests that are served faster than a threshold.",
        ///         Events = new NewRelic.Inputs.ServiceLevelEventsArgs
        ///         {
        ///             AccountId = 12345678,
        ///             ValidEvents = new NewRelic.Inputs.ServiceLevelEventsValidEventsArgs
        ///             {
        ///                 From = "Transaction",
        ///                 Where = "appName = 'Example application' AND (transactionType='Web')",
        ///             },
        ///             BadEvents = new NewRelic.Inputs.ServiceLevelEventsBadEventsArgs
        ///             {
        ///                 From = "Transaction",
        ///                 Where = "appName = 'Example application' AND (transactionType= 'Web') AND duration &gt; 0.1",
        ///             },
        ///         },
        ///         Objective = new NewRelic.Inputs.ServiceLevelObjectiveArgs
        ///         {
        ///             Target = fooTarget,
        ///             TimeWindow = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowArgs
        ///             {
        ///                 Rolling = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowRollingArgs
        ///                 {
        ///                     Count = fooPeriod,
        ///                     Unit = "DAY",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
        /// Note that the Service Level was set up using bad events, that's why `is_bad_events` is set to `true`.
        /// If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.
        /// 
        /// Here is an example of a `slow_burn` alert.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooSlowBurn = NewRelic.GetServiceLevelAlertHelper.Invoke(new()
        ///     {
        ///         AlertType = "slow_burn",
        ///         SliGuid = foo.SliGuid,
        ///         SloTarget = fooTarget,
        ///         SloPeriod = fooPeriod,
        ///         IsBadEvents = true,
        ///     });
        /// 
        ///     var yourCondition = new NewRelic.NrqlAlertCondition("your_condition", new()
        ///     {
        ///         AccountId = 12345678,
        ///         PolicyId = 67890,
        ///         Type = "static",
        ///         Name = "Slow burn alert",
        ///         Enabled = true,
        ///         ViolationTimeLimitSeconds = 259200,
        ///         Nrql = new NewRelic.Inputs.NrqlAlertConditionNrqlArgs
        ///         {
        ///             Query = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Nrql),
        ///         },
        ///         Critical = new NewRelic.Inputs.NrqlAlertConditionCriticalArgs
        ///         {
        ///             Operator = "above_or_equals",
        ///             Threshold = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Threshold),
        ///             ThresholdDuration = 900,
        ///             ThresholdOccurrences = "at_least_once",
        ///         },
        ///         FillOption = "none",
        ///         AggregationWindow = fooSlowBurn.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.EvaluationPeriod),
        ///         AggregationMethod = "event_flow",
        ///         AggregationDelay = "120",
        ///         SlideBy = 900,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Here is an example of a custom alert:
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var fooCustom = NewRelic.GetServiceLevelAlertHelper.Invoke(new()
        ///     {
        ///         AlertType = "custom",
        ///         SliGuid = foo.SliGuid,
        ///         SloTarget = fooTarget,
        ///         SloPeriod = fooPeriod,
        ///         CustomToleratedBudgetConsumption = 4,
        ///         CustomEvaluationPeriod = 5400,
        ///         IsBadEvents = true,
        ///     });
        /// 
        ///     var yourCondition = new NewRelic.NrqlAlertCondition("your_condition", new()
        ///     {
        ///         AccountId = 12345678,
        ///         PolicyId = 67890,
        ///         Type = "static",
        ///         Name = "Custom burn alert",
        ///         Enabled = true,
        ///         ViolationTimeLimitSeconds = 259200,
        ///         Nrql = new NewRelic.Inputs.NrqlAlertConditionNrqlArgs
        ///         {
        ///             Query = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Nrql),
        ///         },
        ///         Critical = new NewRelic.Inputs.NrqlAlertConditionCriticalArgs
        ///         {
        ///             Operator = "above_or_equals",
        ///             Threshold = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.Threshold),
        ///             ThresholdDuration = 900,
        ///             ThresholdOccurrences = "at_least_once",
        ///         },
        ///         FillOption = "none",
        ///         AggregationWindow = fooCustom.Apply(getServiceLevelAlertHelperResult =&gt; getServiceLevelAlertHelperResult.EvaluationPeriod),
        ///         AggregationMethod = "event_flow",
        ///         AggregationDelay = "120",
        ///         SlideBy = 60,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceLevelAlertHelperResult> Invoke(GetServiceLevelAlertHelperInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceLevelAlertHelperResult>("newrelic:index/getServiceLevelAlertHelper:getServiceLevelAlertHelper", args ?? new GetServiceLevelAlertHelperInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceLevelAlertHelperArgs : global::Pulumi.InvokeArgs
    {
        [Input("alertType", required: true)]
        public string AlertType { get; set; } = null!;

        [Input("customEvaluationPeriod")]
        public int? CustomEvaluationPeriod { get; set; }

        [Input("customToleratedBudgetConsumption")]
        public double? CustomToleratedBudgetConsumption { get; set; }

        [Input("isBadEvents")]
        public bool? IsBadEvents { get; set; }

        [Input("sliGuid", required: true)]
        public string SliGuid { get; set; } = null!;

        [Input("sloPeriod", required: true)]
        public int SloPeriod { get; set; }

        [Input("sloTarget", required: true)]
        public double SloTarget { get; set; }

        public GetServiceLevelAlertHelperArgs()
        {
        }
        public static new GetServiceLevelAlertHelperArgs Empty => new GetServiceLevelAlertHelperArgs();
    }

    public sealed class GetServiceLevelAlertHelperInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("alertType", required: true)]
        public Input<string> AlertType { get; set; } = null!;

        [Input("customEvaluationPeriod")]
        public Input<int>? CustomEvaluationPeriod { get; set; }

        [Input("customToleratedBudgetConsumption")]
        public Input<double>? CustomToleratedBudgetConsumption { get; set; }

        [Input("isBadEvents")]
        public Input<bool>? IsBadEvents { get; set; }

        [Input("sliGuid", required: true)]
        public Input<string> SliGuid { get; set; } = null!;

        [Input("sloPeriod", required: true)]
        public Input<int> SloPeriod { get; set; } = null!;

        [Input("sloTarget", required: true)]
        public Input<double> SloTarget { get; set; } = null!;

        public GetServiceLevelAlertHelperInvokeArgs()
        {
        }
        public static new GetServiceLevelAlertHelperInvokeArgs Empty => new GetServiceLevelAlertHelperInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceLevelAlertHelperResult
    {
        public readonly string AlertType;
        public readonly int? CustomEvaluationPeriod;
        public readonly double? CustomToleratedBudgetConsumption;
        /// <summary>
        /// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alert_type it has the same value as `custom_evaluation_period`.
        /// </summary>
        public readonly int EvaluationPeriod;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IsBadEvents;
        /// <summary>
        /// (Computed) The nrql query for the selected type of alert.
        /// </summary>
        public readonly string Nrql;
        public readonly string SliGuid;
        public readonly int SloPeriod;
        public readonly double SloTarget;
        /// <summary>
        /// (Computed) The computed threshold given the provided arguments.
        /// </summary>
        public readonly double Threshold;
        /// <summary>
        /// (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alert_type it has the same value as `custom_tolerated_budget_consumption`.
        /// </summary>
        public readonly double ToleratedBudgetConsumption;

        [OutputConstructor]
        private GetServiceLevelAlertHelperResult(
            string alertType,

            int? customEvaluationPeriod,

            double? customToleratedBudgetConsumption,

            int evaluationPeriod,

            string id,

            bool? isBadEvents,

            string nrql,

            string sliGuid,

            int sloPeriod,

            double sloTarget,

            double threshold,

            double toleratedBudgetConsumption)
        {
            AlertType = alertType;
            CustomEvaluationPeriod = customEvaluationPeriod;
            CustomToleratedBudgetConsumption = customToleratedBudgetConsumption;
            EvaluationPeriod = evaluationPeriod;
            Id = id;
            IsBadEvents = isBadEvents;
            Nrql = nrql;
            SliGuid = sliGuid;
            SloPeriod = sloPeriod;
            SloTarget = sloTarget;
            Threshold = threshold;
            ToleratedBudgetConsumption = toleratedBudgetConsumption;
        }
    }
}
