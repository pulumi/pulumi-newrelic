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
    /// Use this resource to create and manage New Relic notification channels. Details regarding supported products and permissions can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/notifications/destinations).
    /// 
    /// A channel is an entity that is used to configure notifications. It is also called a message template. It is a separate entity from workflows, but a channel is required in order to create a workflow.
    /// 
    /// ## Example Usage
    /// 
    /// ##### [Webhook](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#webhook)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "webhook-example",
    ///         Type = "WEBHOOK",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "payload",
    ///                 Value = "name: {{ foo }}",
    ///                 Label = "Payload Template",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// See additional examples.
    /// 
    /// ## Additional Examples
    /// 
    /// &gt; **NOTE:** We support all properties. The mentioned properties are just an example.
    /// 
    /// ##### [ServiceNow](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenow)
    /// To see the properties’ keys for your account, check ServiceNow incidents table.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "servicenow-incident-example",
    ///         Type = "SERVICENOW_INCIDENTS",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "description",
    ///                 Value = "General description",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "short_description",
    ///                 Value = "Short description",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### [Email](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#email)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "email-example",
    ///         Type = "EMAIL",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "subject",
    ///                 Value = "New Subject Title",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "customDetailsEmail",
    ///                 Value = "issue id - {{issueId}}",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### [Jira Classic](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#jira)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "jira-example",
    ///         Type = "JIRA_CLASSIC",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "ERROR_TRACKING",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "project",
    ///                 Value = "10000",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "issuetype",
    ///                 Value = "10004",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "description",
    ///                 Value = "Issue ID: {{ issueId }}",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "summary",
    ///                 Value = "{{ annotations.title.[0] }}",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### [PagerDuty with account integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "pagerduty-account-example",
    ///         Type = "PAGERDUTY_ACCOUNT_INTEGRATION",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "summary",
    ///                 Value = "General summary",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "service",
    ///                 Label = "Service Name",
    ///                 Value = "PTQK3FM",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "email",
    ///                 Value = "example@email.com",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "customDetails",
    ///                 Value = @"{
    /// ""id"":{{json issueId}},
    /// ""IssueURL"":{{json issuePageUrl}},
    /// ""NewRelic priority"":{{json priority}},
    /// ""Total Incidents"":{{json totalIncidents}},
    /// ""Impacted Entities"":""{{#each entitiesData.names}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Runbook"":""{{#each accumulations.runbookUrl}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Description"":""{{#each annotations.description}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""isCorrelated"":{{json isCorrelated}},
    /// ""Alert Policy Names"":""{{#each accumulations.policyName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Alert Condition Names"":""{{#each accumulations.conditionName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Workflow Name"":{{json workflowName}}
    /// }
    /// ",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### [PagerDuty with service integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "pagerduty-account-example",
    ///         Type = "PAGERDUTY_SERVICE_INTEGRATION",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "summary",
    ///                 Value = "General summary",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "customDetails",
    ///                 Value = @"{
    /// ""id"":{{json issueId}},
    /// ""IssueURL"":{{json issuePageUrl}},
    /// ""NewRelic priority"":{{json priority}},
    /// ""Total Incidents"":{{json totalIncidents}},
    /// ""Impacted Entities"":""{{#each entitiesData.names}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Runbook"":""{{#each accumulations.runbookUrl}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Description"":""{{#each annotations.description}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""isCorrelated"":{{json isCorrelated}},
    /// ""Alert Policy Names"":""{{#each accumulations.policyName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Alert Condition Names"":""{{#each accumulations.conditionName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}"",
    /// ""Workflow Name"":{{json workflowName}}
    /// }
    /// ",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// #### Mobile Push
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "mobile-push-example",
    ///         Type = "MOBILE_PUSH",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// #### [AWS Event Bridge](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#eventBridge)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "event-bridge-example",
    ///         Type = "EVENT_BRIDGE",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "eventSource",
    ///                 Value = "aws.partner/mydomain/myaccountid/name",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "eventContent",
    ///                 Value = "{ id: {{ json issueId }} }",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// #### [SLACK](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#slack)
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "slack-example",
    ///         Type = "SLACK",
    ///         DestinationId = "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "channelId",
    ///                 Value = "123456",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "customDetailsSlack",
    ///                 Value = "issue id - {{issueId}}",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
    /// 
    /// ## Full Scenario Example
    /// 
    /// Create a destination resource and reference that destination to the channel resource:
    /// 
    /// ### Create a destination
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var webhook_destination = new NewRelic.NotificationDestination("webhook-destination", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "destination-webhook",
    ///         Type = "WEBHOOK",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationDestinationPropertyArgs
    ///             {
    ///                 Key = "url",
    ///                 Value = "https://webhook.mywebhook.com",
    ///             },
    ///         },
    ///         AuthBasic = new NewRelic.Inputs.NotificationDestinationAuthBasicArgs
    ///         {
    ///             User = "username",
    ///             Password = "password",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a channel
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var webhook_channel = new NewRelic.NotificationChannel("webhook-channel", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Name = "channel-webhook",
    ///         Type = "WEBHOOK",
    ///         DestinationId = webhook_destination.Id,
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "payload",
    ///                 Value = "{name: foo}",
    ///                 Label = "Payload Template",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Additional Information
    /// 
    /// More details about the channels API can be found [here](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels).
    /// 
    /// &gt; **NOTE:** `newrelic.AlertChannel` are legacy resources.
    /// 
    /// ## Import
    /// 
    /// Channels can only be used by a single workflow, therefore importing them is not particularly useful, because in the UI channels are created upon workflow creation.
    /// 
    /// Additionally, the channel id isn't available via the UI, and you'd need to look it up with the `channels` query in the NerdGraph API.
    /// 
    /// That being said, importing is possible using -
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/notificationChannel:NotificationChannel foo &lt;destination_id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/notificationChannel:NotificationChannel")]
    public partial class NotificationChannel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the channel is active.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// The id of the destination.
        /// </summary>
        [Output("destinationId")]
        public Output<string> DestinationId { get; private set; } = null!;

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a notification channel property. See Nested property blocks below for details.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableArray<Outputs.NotificationChannelProperty>> Properties { get; private set; } = null!;

        /// <summary>
        /// The status of the channel.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationChannel(string name, NotificationChannelArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/notificationChannel:NotificationChannel", name, args ?? new NotificationChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationChannel(string name, Input<string> id, NotificationChannelState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/notificationChannel:NotificationChannel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NotificationChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationChannel Get(string name, Input<string> id, NotificationChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationChannel(name, id, state, options);
        }
    }

    public sealed class NotificationChannelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Indicates whether the channel is active.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The id of the destination.
        /// </summary>
        [Input("destinationId", required: true)]
        public Input<string> DestinationId { get; set; } = null!;

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        [Input("properties", required: true)]
        private InputList<Inputs.NotificationChannelPropertyArgs>? _properties;

        /// <summary>
        /// A nested block that describes a notification channel property. See Nested property blocks below for details.
        /// </summary>
        public InputList<Inputs.NotificationChannelPropertyArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.NotificationChannelPropertyArgs>());
            set => _properties = value;
        }

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NotificationChannelArgs()
        {
        }
        public static new NotificationChannelArgs Empty => new NotificationChannelArgs();
    }

    public sealed class NotificationChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Indicates whether the channel is active.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The id of the destination.
        /// </summary>
        [Input("destinationId")]
        public Input<string>? DestinationId { get; set; }

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        [Input("properties")]
        private InputList<Inputs.NotificationChannelPropertyGetArgs>? _properties;

        /// <summary>
        /// A nested block that describes a notification channel property. See Nested property blocks below for details.
        /// </summary>
        public InputList<Inputs.NotificationChannelPropertyGetArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.NotificationChannelPropertyGetArgs>());
            set => _properties = value;
        }

        /// <summary>
        /// The status of the channel.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationChannelState()
        {
        }
        public static new NotificationChannelState Empty => new NotificationChannelState();
    }
}
