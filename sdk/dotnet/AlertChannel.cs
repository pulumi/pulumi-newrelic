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
    /// Use this resource to create and manage New Relic alert channels.
    /// 
    /// &gt; **WARNING:** The `newrelic.AlertChannel` resource is deprecated and will be removed in the next major release. For managing channel resources in Workflows, use `newrelic.NotificationChannel`.
    /// 
    /// ## Example Usage
    /// 
    /// ### Email
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "foo",
    ///         Type = "email",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             Recipients = "foo@example.com",
    ///             IncludeJsonAttachment = "true",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Additional Examples
    /// 
    /// ##### Slack
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "slack-example",
    ///         Type = "slack",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             Url = "https://hooks.slack.com/services/XXXXXXX/XXXXXXX/XXXXXXXXXX",
    ///             Channel = "example-alerts-channel",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **NOTE:** For instructions on setting up Webhooks with Slack, please visit the article linked under the argument `slack` in the aforementioned configuration, or [this article](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-notifications/notification-channels-control-where-send-alerts/#slack) in New Relic's docs for additional details on setting up the `New Relic Alerts` Slack application, and subsequently using the generated Webhook URL.
    /// 
    /// ### OpsGenie
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "opsgenie-example",
    ///         Type = "opsgenie",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             ApiKey = "abc123",
    ///             Teams = "team1, team2",
    ///             Tags = "tag1, tag2",
    ///             Recipients = "user1@domain.com, user2@domain.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### PagerDuty
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "pagerduty-example",
    ///         Type = "pagerduty",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             ServiceKey = "abc123",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### VictorOps
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "victorops-example",
    ///         Type = "victorops",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             Key = "abc123",
    ///             RouteKey = "/example",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Webhook
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "webhook-example",
    ///         Type = "webhook",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             BaseUrl = "http://www.test.com",
    ///             PayloadType = "application/json",
    ///             Payload = 
    ///             {
    ///                 { "condition_name", "$CONDITION_NAME" },
    ///                 { "policy_name", "$POLICY_NAME" },
    ///             },
    ///             Headers = 
    ///             {
    ///                 { "header1", value1 },
    ///                 { "header2", value2 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Webhook with complex payload
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertChannel("foo", new()
    ///     {
    ///         Name = "webhook-example",
    ///         Type = "webhook",
    ///         Config = new NewRelic.Inputs.AlertChannelConfigArgs
    ///         {
    ///             BaseUrl = "http://www.test.com",
    ///             PayloadType = "application/json",
    ///             PayloadString = @"{
    ///   ""my_custom_values"": {
    ///     ""condition_name"": ""$CONDITION_NAME"",
    ///     ""policy_name"": ""$POLICY_NAME""
    ///   }
    /// }
    /// ",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alert channels can be imported using the `id`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/alertChannel:AlertChannel main &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/alertChannel:AlertChannel")]
    public partial class AlertChannel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID where you want to create alert channels.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The configuration block for the alert channel.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AlertChannelConfig?> Config { get; private set; } = null!;

        /// <summary>
        /// (Required) The name of the channel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AlertChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertChannel(string name, AlertChannelArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/alertChannel:AlertChannel", name, args ?? new AlertChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertChannel(string name, Input<string> id, AlertChannelState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertChannel:AlertChannel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertChannel Get(string name, Input<string> id, AlertChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertChannel(name, id, state, options);
        }
    }

    public sealed class AlertChannelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID where you want to create alert channels.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The configuration block for the alert channel.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigArgs>? Config { get; set; }

        /// <summary>
        /// (Required) The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AlertChannelArgs()
        {
        }
        public static new AlertChannelArgs Empty => new AlertChannelArgs();
    }

    public sealed class AlertChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID where you want to create alert channels.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The configuration block for the alert channel.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// (Required) The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertChannelState()
        {
        }
        public static new AlertChannelState Empty => new AlertChannelState();
    }
}
