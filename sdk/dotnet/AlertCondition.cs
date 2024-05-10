// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.
    /// 
    /// &gt; **WARNING:** The `newrelic.AlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var app = NewRelic.GetEntity.Invoke(new()
    ///     {
    ///         Name = "my-app",
    ///         Type = "APPLICATION",
    ///         Domain = "APM",
    ///     });
    /// 
    ///     var foo = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         Name = "foo",
    ///     });
    /// 
    ///     var fooAlertCondition = new NewRelic.AlertCondition("foo", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "foo",
    ///         Type = "apm_app_metric",
    ///         Entities = new[]
    ///         {
    ///             app.Apply(getEntityResult =&gt; getEntityResult.ApplicationId),
    ///         },
    ///         Metric = "apdex",
    ///         RunbookUrl = "https://www.example.com",
    ///         ConditionScope = "application",
    ///         Terms = new[]
    ///         {
    ///             new NewRelic.Inputs.AlertConditionTermArgs
    ///             {
    ///                 Duration = 5,
    ///                 Operator = "below",
    ///                 Priority = "critical",
    ///                 Threshold = 0.75,
    ///                 TimeFunction = "all",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Terms
    /// 
    /// The `term` mapping supports the following arguments:
    /// 
    ///   * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
    ///   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
    ///   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
    ///   * `threshold` - (Required) Must be 0 or greater.
    ///   * `time_function` - (Required) `all` or `any`.
    /// 
    /// ## Tags
    /// 
    /// Manage alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = NewRelic.GetEntity.Invoke(new()
    ///     {
    ///         Name = "foo entitiy",
    ///     });
    /// 
    ///     var fooAlertPolicy = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         Name = "foo policy",
    ///     });
    /// 
    ///     var fooAlertCondition = new NewRelic.AlertCondition("foo", new()
    ///     {
    ///         PolicyId = fooAlertPolicy.Id,
    ///         Name = "foo condition",
    ///         Type = "apm_app_metric",
    ///         Entities = new[]
    ///         {
    ///             foo.Apply(getEntityResult =&gt; getEntityResult.ApplicationId),
    ///         },
    ///         Metric = "apdex",
    ///         RunbookUrl = "https://www.example.com",
    ///         ConditionScope = "application",
    ///         Terms = new[]
    ///         {
    ///             new NewRelic.Inputs.AlertConditionTermArgs
    ///             {
    ///                 Duration = 5,
    ///                 Operator = "below",
    ///                 Priority = "critical",
    ///                 Threshold = 0.75,
    ///                 TimeFunction = "all",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var myConditionEntityTags = new NewRelic.EntityTags("my_condition_entity_tags", new()
    ///     {
    ///         Guid = fooAlertCondition.EntityGuid,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value",
    ///                     "my-other-value",
    ///                 },
    ///             },
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key-2",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value-2",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alert conditions can be imported using notation `alert_policy_id:alert_condition_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/alertCondition:AlertCondition main 123456:6789012345
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/alertCondition:AlertCondition")]
    public partial class AlertCondition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
        /// instance setting allows your condition to trigger for specific app instances.
        /// </summary>
        [Output("conditionScope")]
        public Output<string?> ConditionScope { get; private set; } = null!;

        /// <summary>
        /// Whether the condition is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The instance IDs associated with this condition.
        /// </summary>
        [Output("entities")]
        public Output<ImmutableArray<string>> Entities { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Output("entityGuid")]
        public Output<string> EntityGuid { get; private set; } = null!;

        /// <summary>
        /// A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
        /// gc_cpu_time condition type.
        /// </summary>
        [Output("gcMetric")]
        public Output<string?> GcMetric { get; private set; } = null!;

        /// <summary>
        /// The metric field accepts parameters based on the type set.
        /// </summary>
        [Output("metric")]
        public Output<string> Metric { get; private set; } = null!;

        /// <summary>
        /// The title of the condition. Must be between 1 and 128 characters, inclusive.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;

        [Output("terms")]
        public Output<ImmutableArray<Outputs.AlertConditionTerm>> Terms { get; private set; } = null!;

        /// <summary>
        /// The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
        /// servers_metric).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// A custom metric to be evaluated.
        /// </summary>
        [Output("userDefinedMetric")]
        public Output<string?> UserDefinedMetric { get; private set; } = null!;

        /// <summary>
        /// One of: (average, min, max, total, sample_size, percent, rate).
        /// </summary>
        [Output("userDefinedValueFunction")]
        public Output<string?> UserDefinedValueFunction { get; private set; } = null!;

        /// <summary>
        /// Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
        /// specified. Must be between 1 and 720 hours.
        /// </summary>
        [Output("violationCloseTimer")]
        public Output<int?> ViolationCloseTimer { get; private set; } = null!;


        /// <summary>
        /// Create a AlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertCondition(string name, AlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/alertCondition:AlertCondition", name, args ?? new AlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertCondition(string name, Input<string> id, AlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertCondition:AlertCondition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AlertCondition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertCondition Get(string name, Input<string> id, AlertConditionState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertCondition(name, id, state, options);
        }
    }

    public sealed class AlertConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
        /// instance setting allows your condition to trigger for specific app instances.
        /// </summary>
        [Input("conditionScope")]
        public Input<string>? ConditionScope { get; set; }

        /// <summary>
        /// Whether the condition is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities", required: true)]
        private InputList<string>? _entities;

        /// <summary>
        /// The instance IDs associated with this condition.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        /// <summary>
        /// A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
        /// gc_cpu_time condition type.
        /// </summary>
        [Input("gcMetric")]
        public Input<string>? GcMetric { get; set; }

        /// <summary>
        /// The metric field accepts parameters based on the type set.
        /// </summary>
        [Input("metric", required: true)]
        public Input<string> Metric { get; set; } = null!;

        /// <summary>
        /// The title of the condition. Must be between 1 and 128 characters, inclusive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms", required: true)]
        private InputList<Inputs.AlertConditionTermArgs>? _terms;
        public InputList<Inputs.AlertConditionTermArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.AlertConditionTermArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
        /// servers_metric).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// A custom metric to be evaluated.
        /// </summary>
        [Input("userDefinedMetric")]
        public Input<string>? UserDefinedMetric { get; set; }

        /// <summary>
        /// One of: (average, min, max, total, sample_size, percent, rate).
        /// </summary>
        [Input("userDefinedValueFunction")]
        public Input<string>? UserDefinedValueFunction { get; set; }

        /// <summary>
        /// Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
        /// specified. Must be between 1 and 720 hours.
        /// </summary>
        [Input("violationCloseTimer")]
        public Input<int>? ViolationCloseTimer { get; set; }

        public AlertConditionArgs()
        {
        }
        public static new AlertConditionArgs Empty => new AlertConditionArgs();
    }

    public sealed class AlertConditionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
        /// instance setting allows your condition to trigger for specific app instances.
        /// </summary>
        [Input("conditionScope")]
        public Input<string>? ConditionScope { get; set; }

        /// <summary>
        /// Whether the condition is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities")]
        private InputList<string>? _entities;

        /// <summary>
        /// The instance IDs associated with this condition.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Input("entityGuid")]
        public Input<string>? EntityGuid { get; set; }

        /// <summary>
        /// A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
        /// gc_cpu_time condition type.
        /// </summary>
        [Input("gcMetric")]
        public Input<string>? GcMetric { get; set; }

        /// <summary>
        /// The metric field accepts parameters based on the type set.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The title of the condition. Must be between 1 and 128 characters, inclusive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms")]
        private InputList<Inputs.AlertConditionTermGetArgs>? _terms;
        public InputList<Inputs.AlertConditionTermGetArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.AlertConditionTermGetArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
        /// servers_metric).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A custom metric to be evaluated.
        /// </summary>
        [Input("userDefinedMetric")]
        public Input<string>? UserDefinedMetric { get; set; }

        /// <summary>
        /// One of: (average, min, max, total, sample_size, percent, rate).
        /// </summary>
        [Input("userDefinedValueFunction")]
        public Input<string>? UserDefinedValueFunction { get; set; }

        /// <summary>
        /// Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
        /// specified. Must be between 1 and 720 hours.
        /// </summary>
        [Input("violationCloseTimer")]
        public Input<int>? ViolationCloseTimer { get; set; }

        public AlertConditionState()
        {
        }
        public static new AlertConditionState Empty => new AlertConditionState();
    }
}
