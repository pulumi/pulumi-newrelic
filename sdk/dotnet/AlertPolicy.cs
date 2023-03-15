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
    /// Use this resource to create and manage New Relic alert policies.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         IncidentPreference = "PER_POLICY",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Provision multiple notification channels and add those channels to a policy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Provision a Slack notification channel.
    ///     var slackChannel = new NewRelic.AlertChannel("slackChannel", new()
    ///     {
    ///         Type = "slack",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             Url = "https://hooks.slack.com/services/xxxxxxx/yyyyyyyy",
    ///             Channel = "example-alerts-channel",
    ///         },
    ///     });
    /// 
    ///     // Provision an email notification channel.
    ///     var emailChannel = new NewRelic.AlertChannel("emailChannel", new()
    ///     {
    ///         Type = "email",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             Recipients = "example@testing.com",
    ///             IncludeJsonAttachment = "1",
    ///         },
    ///     });
    /// 
    ///     // Provision the alert policy.
    ///     var policyWithChannels = new NewRelic.AlertPolicy("policyWithChannels", new()
    ///     {
    ///         IncidentPreference = "PER_CONDITION",
    ///         ChannelIds = new[]
    ///         {
    ///             slackChannel.Id,
    ///             emailChannel.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Reference existing notification channels and add those channel to a policy
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var slackChannel = NewRelic.GetAlertChannel.Invoke(new()
    ///     {
    ///         Name = "slack-channel-notification",
    ///     });
    /// 
    ///     var emailChannel = NewRelic.GetAlertChannel.Invoke(new()
    ///     {
    ///         Name = "test@example.com",
    ///     });
    /// 
    ///     // Provision the alert policy.
    ///     var policyWithChannels = new NewRelic.AlertPolicy("policyWithChannels", new()
    ///     {
    ///         IncidentPreference = "PER_CONDITION",
    ///         ChannelIds = new[]
    ///         {
    ///             slackChannel.Apply(getAlertChannelResult =&gt; getAlertChannelResult.Id),
    ///             emailChannel.Apply(getAlertChannelResult =&gt; getAlertChannelResult.Id),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alert policies can be imported using a composite ID of `&lt;id&gt;:&lt;account_id&gt;`, where `account_id` is the account number scoped to the alert policy resource. Example import
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/alertPolicy:AlertPolicy foo 23423556:4593020
    /// ```
    /// 
    ///  Please note that channel IDs (`channel_ids`) _cannot_ be imported due channels being a separate resource. However, to add channels to an imported alert policy, you can import the policy, add the `channel_ids` attribute with the associated channel IDs, then run `terraform apply`. This will result in the original alert policy being destroyed and a new alert policy being created along with the channels being added to the policy.
    /// </summary>
    [NewRelicResourceType("newrelic:index/alertPolicy:AlertPolicy")]
    public partial class AlertPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        /// </summary>
        [Output("channelIds")]
        public Output<ImmutableArray<int>> ChannelIds { get; private set; } = null!;

        /// <summary>
        /// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        /// </summary>
        [Output("incidentPreference")]
        public Output<string?> IncidentPreference { get; private set; } = null!;

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AlertPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertPolicy(string name, AlertPolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertPolicy:AlertPolicy", name, args ?? new AlertPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertPolicy(string name, Input<string> id, AlertPolicyState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertPolicy:AlertPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertPolicy Get(string name, Input<string> id, AlertPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertPolicy(name, id, state, options);
        }
    }

    public sealed class AlertPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("channelIds")]
        private InputList<int>? _channelIds;

        /// <summary>
        /// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        /// </summary>
        [Obsolete(@"The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.")]
        public InputList<int> ChannelIds
        {
            get => _channelIds ?? (_channelIds = new InputList<int>());
            set => _channelIds = value;
        }

        /// <summary>
        /// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        /// </summary>
        [Input("incidentPreference")]
        public Input<string>? IncidentPreference { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AlertPolicyArgs()
        {
        }
        public static new AlertPolicyArgs Empty => new AlertPolicyArgs();
    }

    public sealed class AlertPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("channelIds")]
        private InputList<int>? _channelIds;

        /// <summary>
        /// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs _cannot_ be imported.
        /// </summary>
        [Obsolete(@"The `channel_ids` attribute is deprecated and will be removed in the next major release of the provider.")]
        public InputList<int> ChannelIds
        {
            get => _channelIds ?? (_channelIds = new InputList<int>());
            set => _channelIds = value;
        }

        /// <summary>
        /// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
        /// </summary>
        [Input("incidentPreference")]
        public Input<string>? IncidentPreference { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AlertPolicyState()
        {
        }
        public static new AlertPolicyState Empty => new AlertPolicyState();
    }
}
