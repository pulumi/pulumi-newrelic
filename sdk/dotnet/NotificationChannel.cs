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
    /// Use this resource to create and manage New Relic notification channels.
    /// 
    /// ## Example Usage
    /// 
    /// ##### Webhook
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         DestinationId = "1234",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "payload",
    ///                 Label = "Payload Template",
    ///                 Value = @"{
    /// 	""name"": ""foo""
    /// }
    /// ",
    ///             },
    ///         },
    ///         Type = "WEBHOOK",
    ///     });
    /// 
    /// });
    /// ```
    /// See additional examples.
    /// ## Additional Examples
    /// 
    /// ##### ServiceNow
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         DestinationId = "1234",
    ///         Product = "PD",
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
    ///         Type = "SERVICENOW_INCIDENTS",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### Email
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         DestinationId = "1234",
    ///         Product = "ERROR_TRACKING",
    ///         Type = "EMAIL",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### PagerDuty with account integration
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         DestinationId = "1234",
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
    ///                 Value = "1234",
    ///             },
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "email",
    ///                 Value = "test@test.com",
    ///             },
    ///         },
    ///         Type = "PAGERDUTY_ACCOUNT_INTEGRATION",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ##### PagerDuty with service integration
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.NotificationChannel("foo", new()
    ///     {
    ///         DestinationId = "1234",
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "summary",
    ///                 Value = "General summary",
    ///             },
    ///         },
    ///         Type = "PAGERDUTY_SERVICE_INTEGRATION",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
    /// </summary>
    [NewRelicResourceType("newrelic:index/notificationChannel:NotificationChannel")]
    public partial class NotificationChannel : global::Pulumi.CustomResource
    {
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
        /// The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableArray<Outputs.NotificationChannelProperty>> Properties { get; private set; } = null!;

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
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
        /// The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        [Input("properties")]
        private InputList<Inputs.NotificationChannelPropertyArgs>? _properties;

        /// <summary>
        /// A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        /// </summary>
        public InputList<Inputs.NotificationChannelPropertyArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.NotificationChannelPropertyArgs>());
            set => _properties = value;
        }

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
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
        /// The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        [Input("properties")]
        private InputList<Inputs.NotificationChannelPropertyGetArgs>? _properties;

        /// <summary>
        /// A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        /// </summary>
        public InputList<Inputs.NotificationChannelPropertyGetArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.NotificationChannelPropertyGetArgs>());
            set => _properties = value;
        }

        /// <summary>
        /// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationChannelState()
        {
        }
        public static new NotificationChannelState Empty => new NotificationChannelState();
    }
}