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
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var examplePolicy = Output.Create(NewRelic.GetAlertPolicy.InvokeAsync(new NewRelic.GetAlertPolicyArgs
    ///         {
    ///             Name = "my-alert-policy",
    ///         }));
    ///         // Creates an email alert channel.
    ///         var emailChannel = new NewRelic.AlertChannel("emailChannel", new NewRelic.AlertChannelArgs
    ///         {
    ///             Type = "email",
    ///             Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///             {
    ///                 Recipients = "foo@example.com",
    ///                 IncludeJsonAttachment = "1",
    ///             },
    ///         });
    ///         // Creates a Slack alert channel.
    ///         var slackChannel = new NewRelic.AlertChannel("slackChannel", new NewRelic.AlertChannelArgs
    ///         {
    ///             Type = "slack",
    ///             Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///             {
    ///                 Channel = "#example-channel",
    ///                 Url = "http://example-org.slack.com",
    ///             },
    ///         });
    ///         // Applies the created channels above to the alert policy
    ///         // referenced at the top of the config.
    ///         var foo = new NewRelic.AlertPolicyChannel("foo", new NewRelic.AlertPolicyChannelArgs
    ///         {
    ///             PolicyId = newrelic_alert_policy.Example_policy.Id,
    ///             ChannelIds = 
    ///             {
    ///                 emailChannel.Id,
    ///                 slackChannel.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class AlertPolicyChannel : Pulumi.CustomResource
    {
        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid
        /// drift your Terraform state.
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

    public sealed class AlertPolicyChannelArgs : Pulumi.ResourceArgs
    {
        [Input("channelIds", required: true)]
        private InputList<int>? _channelIds;

        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid
        /// drift your Terraform state.
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
    }

    public sealed class AlertPolicyChannelState : Pulumi.ResourceArgs
    {
        [Input("channelIds")]
        private InputList<int>? _channelIds;

        /// <summary>
        /// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid
        /// drift your Terraform state.
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
    }
}
