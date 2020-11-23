// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins
{
    /// <summary>
    /// &gt; **DEPRECATED** Use at your own risk. Use the `newrelic.NrqlAlertCondition` resource instead. This feature may be removed in the next major release.
    /// 
    /// Use this resource to create and manage plugins alert conditions in New Relic.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var fooPlugin = Output.Create(NewRelic.Plugins.GetPlugin.InvokeAsync(new NewRelic.Plugins.GetPluginArgs
    ///         {
    ///             Guid = "com.example.my-plugin",
    ///         }));
    ///         var fooPluginComponent = fooPlugin.Apply(fooPlugin =&gt; Output.Create(NewRelic.Plugins.GetPluginComponent.InvokeAsync(new NewRelic.Plugins.GetPluginComponentArgs
    ///         {
    ///             PluginId = fooPlugin.Id,
    ///             Name = "MyPlugin",
    ///         })));
    ///         var fooAlertPolicy = new NewRelic.AlertPolicy("fooAlertPolicy", new NewRelic.AlertPolicyArgs
    ///         {
    ///         });
    ///         var fooAlertCondition = new NewRelic.Plugins.AlertCondition("fooAlertCondition", new NewRelic.Plugins.AlertConditionArgs
    ///         {
    ///             PolicyId = fooAlertPolicy.Id,
    ///             Entities = 
    ///             {
    ///                 fooPluginComponent.Apply(fooPluginComponent =&gt; fooPluginComponent.Id),
    ///             },
    ///             Metric = "Component/Summary/Consumers[consumers]",
    ///             PluginId = fooPlugin.Apply(fooPlugin =&gt; fooPlugin.Id),
    ///             PluginGuid = fooPlugin.Apply(fooPlugin =&gt; fooPlugin.Guid),
    ///             ValueFunction = "average",
    ///             MetricDescription = "Queue consumers",
    ///             Terms = 
    ///             {
    ///                 new NewRelic.Plugins.Inputs.AlertConditionTermArgs
    ///                 {
    ///                     Duration = 5,
    ///                     Operator = "below",
    ///                     Priority = "critical",
    ///                     Threshold = 0.75,
    ///                     TimeFunction = "all",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Terms
    /// 
    /// The `term` mapping supports the following arguments:
    /// 
    ///   * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
    ///   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
    ///   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`.
    ///   * `threshold` - (Required) Must be 0 or greater.
    ///   * `time_function` - (Required) `all` or `any`.
    /// 
    /// ## Import
    /// 
    /// Alert conditions can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:plugins/alertCondition:AlertCondition main 12345
    /// ```
    /// </summary>
    public partial class AlertCondition : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether or not this condition is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The plugin component IDs to target.
        /// </summary>
        [Output("entities")]
        public Output<ImmutableArray<int>> Entities { get; private set; } = null!;

        /// <summary>
        /// The plugin metric to evaluate.
        /// </summary>
        [Output("metric")]
        public Output<string> Metric { get; private set; } = null!;

        /// <summary>
        /// The metric description.
        /// </summary>
        [Output("metricDescription")]
        public Output<string> MetricDescription { get; private set; } = null!;

        /// <summary>
        /// The title of the condition. Must be between 1 and 64 characters, inclusive.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The GUID of the plugin which produces the metric.
        /// </summary>
        [Output("pluginGuid")]
        public Output<string> PluginGuid { get; private set; } = null!;

        /// <summary>
        /// The ID of the installed plugin instance which produces the metric.
        /// </summary>
        [Output("pluginId")]
        public Output<string> PluginId { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Output("policyId")]
        public Output<int> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;

        /// <summary>
        /// A list of terms for this condition. See Terms below for details.
        /// </summary>
        [Output("terms")]
        public Output<ImmutableArray<Outputs.AlertConditionTerm>> Terms { get; private set; } = null!;

        /// <summary>
        /// The value function to apply to the metric data.  One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        /// </summary>
        [Output("valueFunction")]
        public Output<string> ValueFunction { get; private set; } = null!;


        /// <summary>
        /// Create a AlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertCondition(string name, AlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:plugins/alertCondition:AlertCondition", name, args ?? new AlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertCondition(string name, Input<string> id, AlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:plugins/alertCondition:AlertCondition", name, state, MakeResourceOptions(options, id))
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

    public sealed class AlertConditionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not this condition is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities", required: true)]
        private InputList<int>? _entities;

        /// <summary>
        /// The plugin component IDs to target.
        /// </summary>
        public InputList<int> Entities
        {
            get => _entities ?? (_entities = new InputList<int>());
            set => _entities = value;
        }

        /// <summary>
        /// The plugin metric to evaluate.
        /// </summary>
        [Input("metric", required: true)]
        public Input<string> Metric { get; set; } = null!;

        /// <summary>
        /// The metric description.
        /// </summary>
        [Input("metricDescription", required: true)]
        public Input<string> MetricDescription { get; set; } = null!;

        /// <summary>
        /// The title of the condition. Must be between 1 and 64 characters, inclusive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The GUID of the plugin which produces the metric.
        /// </summary>
        [Input("pluginGuid", required: true)]
        public Input<string> PluginGuid { get; set; } = null!;

        /// <summary>
        /// The ID of the installed plugin instance which produces the metric.
        /// </summary>
        [Input("pluginId", required: true)]
        public Input<string> PluginId { get; set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<int> PolicyId { get; set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms", required: true)]
        private InputList<Inputs.AlertConditionTermArgs>? _terms;

        /// <summary>
        /// A list of terms for this condition. See Terms below for details.
        /// </summary>
        public InputList<Inputs.AlertConditionTermArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.AlertConditionTermArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The value function to apply to the metric data.  One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        /// </summary>
        [Input("valueFunction", required: true)]
        public Input<string> ValueFunction { get; set; } = null!;

        public AlertConditionArgs()
        {
        }
    }

    public sealed class AlertConditionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not this condition is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities")]
        private InputList<int>? _entities;

        /// <summary>
        /// The plugin component IDs to target.
        /// </summary>
        public InputList<int> Entities
        {
            get => _entities ?? (_entities = new InputList<int>());
            set => _entities = value;
        }

        /// <summary>
        /// The plugin metric to evaluate.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The metric description.
        /// </summary>
        [Input("metricDescription")]
        public Input<string>? MetricDescription { get; set; }

        /// <summary>
        /// The title of the condition. Must be between 1 and 64 characters, inclusive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The GUID of the plugin which produces the metric.
        /// </summary>
        [Input("pluginGuid")]
        public Input<string>? PluginGuid { get; set; }

        /// <summary>
        /// The ID of the installed plugin instance which produces the metric.
        /// </summary>
        [Input("pluginId")]
        public Input<string>? PluginId { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms")]
        private InputList<Inputs.AlertConditionTermGetArgs>? _terms;

        /// <summary>
        /// A list of terms for this condition. See Terms below for details.
        /// </summary>
        public InputList<Inputs.AlertConditionTermGetArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.AlertConditionTermGetArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The value function to apply to the metric data.  One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        /// </summary>
        [Input("valueFunction")]
        public Input<string>? ValueFunction { get; set; }

        public AlertConditionState()
        {
        }
    }
}
