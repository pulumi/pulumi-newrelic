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
    /// Use this resource to create, update, and delete New Relic Events to Metrics rules.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.EventsToMetricsRule("foo", new()
    ///     {
    ///         AccountId = "12345",
    ///         Description = "Example description",
    ///         Nrql = "SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// New Relic Events to Metrics rules can be imported using a concatenated string of the format
    /// 
    ///  `&lt;account_id&gt;:&lt;rule_id&gt;`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/eventsToMetricsRule:EventsToMetricsRule")]
    public partial class EventsToMetricsRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account with the event and where the metrics will be put.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Provides additional information about the rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// True means this rule is enabled. False means the rule is currently not creating metrics.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The name of the rule. This must be unique within an account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Explains how to create metrics from events.
        /// </summary>
        [Output("nrql")]
        public Output<string> Nrql { get; private set; } = null!;

        /// <summary>
        /// The id, uniquely identifying the rule.
        /// </summary>
        [Output("ruleId")]
        public Output<string> RuleId { get; private set; } = null!;


        /// <summary>
        /// Create a EventsToMetricsRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventsToMetricsRule(string name, EventsToMetricsRuleArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, args ?? new EventsToMetricsRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventsToMetricsRule(string name, Input<string> id, EventsToMetricsRuleState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventsToMetricsRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventsToMetricsRule Get(string name, Input<string> id, EventsToMetricsRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new EventsToMetricsRule(name, id, state, options);
        }
    }

    public sealed class EventsToMetricsRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account with the event and where the metrics will be put.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Provides additional information about the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// True means this rule is enabled. False means the rule is currently not creating metrics.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the rule. This must be unique within an account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Explains how to create metrics from events.
        /// </summary>
        [Input("nrql", required: true)]
        public Input<string> Nrql { get; set; } = null!;

        public EventsToMetricsRuleArgs()
        {
        }
        public static new EventsToMetricsRuleArgs Empty => new EventsToMetricsRuleArgs();
    }

    public sealed class EventsToMetricsRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account with the event and where the metrics will be put.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Provides additional information about the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// True means this rule is enabled. False means the rule is currently not creating metrics.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the rule. This must be unique within an account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Explains how to create metrics from events.
        /// </summary>
        [Input("nrql")]
        public Input<string>? Nrql { get; set; }

        /// <summary>
        /// The id, uniquely identifying the rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        public EventsToMetricsRuleState()
        {
        }
        public static new EventsToMetricsRuleState Empty => new EventsToMetricsRuleState();
    }
}
