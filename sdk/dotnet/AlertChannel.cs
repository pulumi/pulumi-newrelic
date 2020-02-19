// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create and manage New Relic alert policies.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/alert_channel.html.markdown.
    /// </summary>
    public partial class AlertChannel : Pulumi.CustomResource
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AlertChannelConfig?> Config { get; private set; } = null!;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        [Output("configuration")]
        public Output<ImmutableDictionary<string, object>?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
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
            : base("newrelic:index/alertChannel:AlertChannel", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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

    public sealed class AlertChannelArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigArgs>? Config { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AlertChannelArgs()
        {
        }
    }

    public sealed class AlertChannelState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigGetArgs>? Config { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertChannelState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class AlertChannelConfigArgs : Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        [Input("authPassword")]
        public Input<string>? AuthPassword { get; set; }

        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("authUsername")]
        public Input<string>? AuthUsername { get; set; }

        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        [Input("headersString")]
        public Input<string>? HeadersString { get; set; }

        [Input("includeJsonAttachment")]
        public Input<string>? IncludeJsonAttachment { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("payload")]
        private InputMap<string>? _payload;
        public InputMap<string> Payload
        {
            get => _payload ?? (_payload = new InputMap<string>());
            set => _payload = value;
        }

        [Input("payloadString")]
        public Input<string>? PayloadString { get; set; }

        [Input("payloadType")]
        public Input<string>? PayloadType { get; set; }

        [Input("recipients")]
        public Input<string>? Recipients { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("routeKey")]
        public Input<string>? RouteKey { get; set; }

        [Input("serviceKey")]
        public Input<string>? ServiceKey { get; set; }

        [Input("tags")]
        public Input<string>? Tags { get; set; }

        [Input("teams")]
        public Input<string>? Teams { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public AlertChannelConfigArgs()
        {
        }
    }

    public sealed class AlertChannelConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        [Input("authPassword")]
        public Input<string>? AuthPassword { get; set; }

        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("authUsername")]
        public Input<string>? AuthUsername { get; set; }

        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        [Input("headersString")]
        public Input<string>? HeadersString { get; set; }

        [Input("includeJsonAttachment")]
        public Input<string>? IncludeJsonAttachment { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("payload")]
        private InputMap<string>? _payload;
        public InputMap<string> Payload
        {
            get => _payload ?? (_payload = new InputMap<string>());
            set => _payload = value;
        }

        [Input("payloadString")]
        public Input<string>? PayloadString { get; set; }

        [Input("payloadType")]
        public Input<string>? PayloadType { get; set; }

        [Input("recipients")]
        public Input<string>? Recipients { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("routeKey")]
        public Input<string>? RouteKey { get; set; }

        [Input("serviceKey")]
        public Input<string>? ServiceKey { get; set; }

        [Input("tags")]
        public Input<string>? Tags { get; set; }

        [Input("teams")]
        public Input<string>? Teams { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public AlertChannelConfigGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class AlertChannelConfig
    {
        public readonly string? ApiKey;
        public readonly string? AuthPassword;
        public readonly string? AuthType;
        public readonly string? AuthUsername;
        public readonly string? BaseUrl;
        public readonly string? Channel;
        public readonly ImmutableDictionary<string, string>? Headers;
        public readonly string? HeadersString;
        public readonly string? IncludeJsonAttachment;
        public readonly string? Key;
        public readonly ImmutableDictionary<string, string>? Payload;
        public readonly string? PayloadString;
        public readonly string? PayloadType;
        public readonly string? Recipients;
        public readonly string? Region;
        public readonly string? RouteKey;
        public readonly string? ServiceKey;
        public readonly string? Tags;
        public readonly string? Teams;
        public readonly string? Url;
        public readonly string? UserId;

        [OutputConstructor]
        private AlertChannelConfig(
            string? apiKey,
            string? authPassword,
            string? authType,
            string? authUsername,
            string? baseUrl,
            string? channel,
            ImmutableDictionary<string, string>? headers,
            string? headersString,
            string? includeJsonAttachment,
            string? key,
            ImmutableDictionary<string, string>? payload,
            string? payloadString,
            string? payloadType,
            string? recipients,
            string? region,
            string? routeKey,
            string? serviceKey,
            string? tags,
            string? teams,
            string? url,
            string? userId)
        {
            ApiKey = apiKey;
            AuthPassword = authPassword;
            AuthType = authType;
            AuthUsername = authUsername;
            BaseUrl = baseUrl;
            Channel = channel;
            Headers = headers;
            HeadersString = headersString;
            IncludeJsonAttachment = includeJsonAttachment;
            Key = key;
            Payload = payload;
            PayloadString = payloadString;
            PayloadType = payloadType;
            Recipients = recipients;
            Region = region;
            RouteKey = routeKey;
            ServiceKey = serviceKey;
            Tags = tags;
            Teams = teams;
            Url = url;
            UserId = userId;
        }
    }
    }
}
