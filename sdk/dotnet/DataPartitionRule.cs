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
    /// Use this resource to create, update and delete New Relic Data partition rule.
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
    ///     var foo = new NewRelic.DataPartitionRule("foo", new()
    ///     {
    ///         Description = "description",
    ///         Enabled = true,
    ///         Nrql = "logtype='node'",
    ///         RetentionPolicy = "STANDARD",
    ///         TargetDataPartition = "Log_name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Additional Information
    /// 
    /// More details about the data partition can be found [here](https://docs.newrelic.com/docs/logs/ui-data/data-partitions/)
    /// 
    /// ## Import
    /// 
    /// New Relic data partition rule can be imported using the rule ID, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/dataPartitionRule:DataPartitionRule foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/dataPartitionRule:DataPartitionRule")]
    public partial class DataPartitionRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account id associated with the data partition rule.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        /// </summary>
        [Output("deleted")]
        public Output<bool> Deleted { get; private set; } = null!;

        /// <summary>
        /// The description of the data partition rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether or not this data partition rule is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        /// </summary>
        [Output("nrql")]
        public Output<string> Nrql { get; private set; } = null!;

        /// <summary>
        /// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        /// </summary>
        [Output("retentionPolicy")]
        public Output<string> RetentionPolicy { get; private set; } = null!;

        /// <summary>
        /// The name of the data partition where logs will be allocated once the rule is enabled.
        /// </summary>
        [Output("targetDataPartition")]
        public Output<string> TargetDataPartition { get; private set; } = null!;


        /// <summary>
        /// Create a DataPartitionRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataPartitionRule(string name, DataPartitionRuleArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/dataPartitionRule:DataPartitionRule", name, args ?? new DataPartitionRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataPartitionRule(string name, Input<string> id, DataPartitionRuleState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/dataPartitionRule:DataPartitionRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataPartitionRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataPartitionRule Get(string name, Input<string> id, DataPartitionRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new DataPartitionRule(name, id, state, options);
        }
    }

    public sealed class DataPartitionRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id associated with the data partition rule.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The description of the data partition rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether or not this data partition rule is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        /// </summary>
        [Input("nrql", required: true)]
        public Input<string> Nrql { get; set; } = null!;

        /// <summary>
        /// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        /// </summary>
        [Input("retentionPolicy", required: true)]
        public Input<string> RetentionPolicy { get; set; } = null!;

        /// <summary>
        /// The name of the data partition where logs will be allocated once the rule is enabled.
        /// </summary>
        [Input("targetDataPartition", required: true)]
        public Input<string> TargetDataPartition { get; set; } = null!;

        public DataPartitionRuleArgs()
        {
        }
        public static new DataPartitionRuleArgs Empty => new DataPartitionRuleArgs();
    }

    public sealed class DataPartitionRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id associated with the data partition rule.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        /// </summary>
        [Input("deleted")]
        public Input<bool>? Deleted { get; set; }

        /// <summary>
        /// The description of the data partition rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether or not this data partition rule is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        /// </summary>
        [Input("nrql")]
        public Input<string>? Nrql { get; set; }

        /// <summary>
        /// The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        /// </summary>
        [Input("retentionPolicy")]
        public Input<string>? RetentionPolicy { get; set; }

        /// <summary>
        /// The name of the data partition where logs will be allocated once the rule is enabled.
        /// </summary>
        [Input("targetDataPartition")]
        public Input<string>? TargetDataPartition { get; set; }

        public DataPartitionRuleState()
        {
        }
        public static new DataPartitionRuleState Empty => new DataPartitionRuleState();
    }
}
