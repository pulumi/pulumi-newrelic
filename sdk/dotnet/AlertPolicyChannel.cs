// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to map alert policies to alert channels in New Relic.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/alert_policy_channel.html.markdown.
    /// </summary>
    public partial class AlertPolicyChannel : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the channel.
        /// </summary>
        [Output("channelId")]
        public Output<int> ChannelId { get; private set; } = null!;

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
            : base("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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

    public sealed class AlertPolicyChannelArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the channel.
        /// </summary>
        [Input("channelId", required: true)]
        public Input<int> ChannelId { get; set; } = null!;

        /// <summary>
        /// The ID of the policy.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<int> PolicyId { get; set; } = null!;

        public AlertPolicyChannelArgs()
        {
        }
    }

    public sealed class AlertPolicyChannelState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the channel.
        /// </summary>
        [Input("channelId")]
        public Input<int>? ChannelId { get; set; }

        /// <summary>
        /// The ID of the policy.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        public AlertPolicyChannelState()
        {
        }
    }
}
