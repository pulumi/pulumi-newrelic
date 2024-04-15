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
    ///     var foo = new NewRelic.NrqlDropRule("foo", new()
    ///     {
    ///         AccountId = "12345",
    ///         Action = "drop_data",
    ///         Description = "Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it.",
    ///         Nrql = "SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'",
    ///     });
    /// 
    ///     var bar = new NewRelic.NrqlDropRule("bar", new()
    ///     {
    ///         AccountId = "12345",
    ///         Action = "drop_attributes",
    ///         Description = "Removes the user name and email fields from MyCustomEvent",
    ///         Nrql = "SELECT userEmail, userName FROM MyCustomEvent",
    ///     });
    /// 
    ///     var baz = new NewRelic.NrqlDropRule("baz", new()
    ///     {
    ///         AccountId = "12345",
    ///         Action = "drop_attributes_from_metric_aggregates",
    ///         Description = "Removes containerId from metric aggregates to reduce metric cardinality.",
    ///         Nrql = "SELECT containerId FROM Metric",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Using `newrelic-cli` to List Out Drop Rules
    /// 
    /// All NRQL Drop Rules associated with a New Relic account may be listed out using the following newrelic-cli command:
    /// 
    /// This would print all drop rules associated with your New Relic account to the terminal.
    /// The number of rules to be printed can be customized using the `limit` argument of this command.
    /// For instance, the following command limits the number of drop rules printed to two.
    /// 
    /// More details on the command and its arguments (for instance, the format in which the droprules are to be listed in the terminal, which is JSON by default) can be found in the output of the `newrelic nrql droprules --help` command.
    /// If you do not have **newrelic-cli** installed on your device already, head over to [this page](https://github.com/newrelic/newrelic-cli#installation--upgrades) for instructions.
    /// 
    /// ## Import
    /// 
    /// New Relic NRQL drop rules can be imported using a concatenated string of the format
    /// 
    ///  `&lt;account_id&gt;:&lt;rule_id&gt;`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/nrqlDropRule:NrqlDropRule")]
    public partial class NrqlDropRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account where the drop rule will be put. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The description of the drop rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A NRQL string that specifies what data types to drop.
        /// </summary>
        [Output("nrql")]
        public Output<string> Nrql { get; private set; } = null!;

        /// <summary>
        /// The id, uniquely identifying the rule.
        /// </summary>
        [Output("ruleId")]
        public Output<string> RuleId { get; private set; } = null!;


        /// <summary>
        /// Create a NrqlDropRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NrqlDropRule(string name, NrqlDropRuleArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/nrqlDropRule:NrqlDropRule", name, args ?? new NrqlDropRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NrqlDropRule(string name, Input<string> id, NrqlDropRuleState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/nrqlDropRule:NrqlDropRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NrqlDropRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NrqlDropRule Get(string name, Input<string> id, NrqlDropRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new NrqlDropRule(name, id, state, options);
        }
    }

    public sealed class NrqlDropRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account where the drop rule will be put. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The description of the drop rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A NRQL string that specifies what data types to drop.
        /// </summary>
        [Input("nrql", required: true)]
        public Input<string> Nrql { get; set; } = null!;

        public NrqlDropRuleArgs()
        {
        }
        public static new NrqlDropRuleArgs Empty => new NrqlDropRuleArgs();
    }

    public sealed class NrqlDropRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account where the drop rule will be put. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// The description of the drop rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A NRQL string that specifies what data types to drop.
        /// </summary>
        [Input("nrql")]
        public Input<string>? Nrql { get; set; }

        /// <summary>
        /// The id, uniquely identifying the rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        public NrqlDropRuleState()
        {
        }
        public static new NrqlDropRuleState Empty => new NrqlDropRuleState();
    }
}
