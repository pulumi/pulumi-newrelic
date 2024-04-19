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
    ///     var foo = new NewRelic.AlertMutingRule("foo", new()
    ///     {
    ///         Name = "Example Muting Rule",
    ///         Enabled = true,
    ///         Description = "muting rule test.",
    ///         Condition = new NewRelic.Inputs.AlertMutingRuleConditionArgs
    ///         {
    ///             Conditions = new[]
    ///             {
    ///                 new NewRelic.Inputs.AlertMutingRuleConditionConditionArgs
    ///                 {
    ///                     Attribute = "product",
    ///                     Operator = "EQUALS",
    ///                     Values = new[]
    ///                     {
    ///                         "APM",
    ///                     },
    ///                 },
    ///                 new NewRelic.Inputs.AlertMutingRuleConditionConditionArgs
    ///                 {
    ///                     Attribute = "targetId",
    ///                     Operator = "EQUALS",
    ///                     Values = new[]
    ///                     {
    ///                         "Muted",
    ///                     },
    ///                 },
    ///             },
    ///             Operator = "AND",
    ///         },
    ///         Schedule = new NewRelic.Inputs.AlertMutingRuleScheduleArgs
    ///         {
    ///             StartTime = "2021-01-28T15:30:00",
    ///             EndTime = "2021-01-28T16:30:00",
    ///             TimeZone = "America/Los_Angeles",
    ///             Repeat = "WEEKLY",
    ///             WeeklyRepeatDays = new[]
    ///             {
    ///                 "MONDAY",
    ///                 "WEDNESDAY",
    ///                 "FRIDAY",
    ///             },
    ///             RepeatCount = 42,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Alert conditions can be imported using a composite ID of `&lt;account_id&gt;:&lt;muting_rule_id&gt;`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/alertMutingRule:AlertMutingRule")]
    public partial class AlertMutingRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account id of the MutingRule.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The condition that defines which incidents to target. See Nested condition blocks below for details.
        /// </summary>
        [Output("condition")]
        public Output<Outputs.AlertMutingRuleCondition> Condition { get; private set; } = null!;

        /// <summary>
        /// The description of the MutingRule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether the MutingRule is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The name of the MutingRule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specify a schedule for enabling the MutingRule. See Schedule below for details
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.AlertMutingRuleSchedule?> Schedule { get; private set; } = null!;


        /// <summary>
        /// Create a AlertMutingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertMutingRule(string name, AlertMutingRuleArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/alertMutingRule:AlertMutingRule", name, args ?? new AlertMutingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertMutingRule(string name, Input<string> id, AlertMutingRuleState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertMutingRule:AlertMutingRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertMutingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertMutingRule Get(string name, Input<string> id, AlertMutingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertMutingRule(name, id, state, options);
        }
    }

    public sealed class AlertMutingRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id of the MutingRule.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The condition that defines which incidents to target. See Nested condition blocks below for details.
        /// </summary>
        [Input("condition", required: true)]
        public Input<Inputs.AlertMutingRuleConditionArgs> Condition { get; set; } = null!;

        /// <summary>
        /// The description of the MutingRule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the MutingRule is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The name of the MutingRule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specify a schedule for enabling the MutingRule. See Schedule below for details
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.AlertMutingRuleScheduleArgs>? Schedule { get; set; }

        public AlertMutingRuleArgs()
        {
        }
        public static new AlertMutingRuleArgs Empty => new AlertMutingRuleArgs();
    }

    public sealed class AlertMutingRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id of the MutingRule.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The condition that defines which incidents to target. See Nested condition blocks below for details.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.AlertMutingRuleConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// The description of the MutingRule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the MutingRule is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the MutingRule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specify a schedule for enabling the MutingRule. See Schedule below for details
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.AlertMutingRuleScheduleGetArgs>? Schedule { get; set; }

        public AlertMutingRuleState()
        {
        }
        public static new AlertMutingRuleState Empty => new AlertMutingRuleState();
    }
}
