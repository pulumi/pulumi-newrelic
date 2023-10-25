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
    /// Use this resource to map alert policies to alert channels in New Relic.
    /// 
    /// &gt; **WARNING:** The `newrelic.AlertPolicyChannel` resource is deprecated and will be removed in the next major release. For managing channel resources in Workflows, use `newrelic.NotificationChannel`.
    /// 
    /// ## Import
    /// 
    /// Alert policy channels can be imported using the following notation`&lt;policyID&gt;:&lt;channelID&gt;:&lt;channelID&gt;`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/alertPolicyChannel:AlertPolicyChannel foo 123456:3462754:2938324
    /// ```
    ///  When importing `newrelic_alert_policy_channel` resource, the attribute `channel_ids`* will be set in your Terraform state. You can import multiple channels as long as those channel IDs are included as part of the import ID hash.
    /// </summary>
    [NewRelicResourceType("newrelic:index/alertPolicyChannel:AlertPolicyChannel")]
    public partial class AlertPolicyChannel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
        /// </summary>
        [Output("channelIds")]
        public Output<ImmutableArray<int>> ChannelIds { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy.
        /// </summary>
        [Output("policyId")]
        public Output<int> PolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a AlertPolicyChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertPolicyChannel(string name, AlertPolicyChannelArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, args ?? new AlertPolicyChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertPolicyChannel(string name, Input<string> id, AlertPolicyChannelState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertPolicyChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertPolicyChannel Get(string name, Input<string> id, AlertPolicyChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertPolicyChannel(name, id, state, options);
        }
    }

    public sealed class AlertPolicyChannelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("channelIds", required: true)]
        private InputList<int>? _channelIds;

        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
        /// </summary>
        public InputList<int> ChannelIds
        {
            get => _channelIds ?? (_channelIds = new InputList<int>());
            set => _channelIds = value;
        }

        /// <summary>
        /// The ID of the policy.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<int> PolicyId { get; set; } = null!;

        public AlertPolicyChannelArgs()
        {
        }
        public static new AlertPolicyChannelArgs Empty => new AlertPolicyChannelArgs();
    }

    public sealed class AlertPolicyChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("channelIds")]
        private InputList<int>? _channelIds;

        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
        /// </summary>
        public InputList<int> ChannelIds
        {
            get => _channelIds ?? (_channelIds = new InputList<int>());
            set => _channelIds = value;
        }

        /// <summary>
        /// The ID of the policy.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        public AlertPolicyChannelState()
        {
        }
        public static new AlertPolicyChannelState Empty => new AlertPolicyChannelState();
    }
}
