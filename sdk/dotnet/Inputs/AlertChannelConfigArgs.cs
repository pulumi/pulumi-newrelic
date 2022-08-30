// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class AlertChannelConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API key for integrating with OpsGenie.
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// Specifies an authentication password for use with a channel.  Supported by the `webhook` channel type.
        /// </summary>
        [Input("authPassword")]
        public Input<string>? AuthPassword { get; set; }

        /// <summary>
        /// Specifies an authentication method for use with a channel.  Supported by the `webhook` channel type.  Only HTTP basic authentication is currently supported via the value `BASIC`.
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        /// <summary>
        /// Specifies an authentication username for use with a channel.  Supported by the `webhook` channel type.
        /// </summary>
        [Input("authUsername")]
        public Input<string>? AuthUsername { get; set; }

        /// <summary>
        /// The base URL of the webhook destination.
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// The Slack channel to send notifications to.
        /// * `opsgenie`
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;

        /// <summary>
        /// A map of key/value pairs that represents extra HTTP headers to be sent along with the webhook payload.
        /// </summary>
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// Use instead of `headers` if the desired payload is more complex than a list of key/value pairs (e.g. a set of headers that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `headers`.
        /// </summary>
        [Input("headersString")]
        public Input<string>? HeadersString { get; set; }

        /// <summary>
        /// `true` or `false`. Flag for whether or not to attach a JSON document containing information about the associated alert to the email that is sent to recipients.
        /// * `webhook`
        /// </summary>
        [Input("includeJsonAttachment")]
        public Input<string>? IncludeJsonAttachment { get; set; }

        /// <summary>
        /// The key for integrating with VictorOps.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("payload")]
        private InputMap<string>? _payload;

        /// <summary>
        /// A map of key/value pairs that represents the webhook payload.  Must provide `payload_type` if setting this argument.
        /// </summary>
        public InputMap<string> Payload
        {
            get => _payload ?? (_payload = new InputMap<string>());
            set => _payload = value;
        }

        /// <summary>
        /// Use instead of `payload` if the desired payload is more complex than a list of key/value pairs (e.g. a payload that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `payload`.
        /// </summary>
        [Input("payloadString")]
        public Input<string>? PayloadString { get; set; }

        /// <summary>
        /// Can either be `application/json` or `application/x-www-form-urlencoded`. The `payload_type` argument is _required_ if `payload` is set.
        /// * `pagerduty`
        /// </summary>
        [Input("payloadType")]
        public Input<string>? PayloadType { get; set; }

        /// <summary>
        /// A set of recipients for targeting notifications.  Multiple values are comma separated.
        /// </summary>
        [Input("recipients")]
        public Input<string>? Recipients { get; set; }

        /// <summary>
        /// The data center region to store your data.  Valid values are `US` and `EU`.  Default is `US`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The route key for integrating with VictorOps.
        /// * `slack`
        /// </summary>
        [Input("routeKey")]
        public Input<string>? RouteKey { get; set; }

        /// <summary>
        /// Specifies the service key for integrating with Pagerduty.
        /// * `victorops`
        /// </summary>
        [Input("serviceKey")]
        public Input<string>? ServiceKey { get; set; }

        /// <summary>
        /// A set of tags for targeting notifications. Multiple values are comma separated.
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// A set of teams for targeting notifications. Multiple values are comma separated.
        /// </summary>
        [Input("teams")]
        public Input<string>? Teams { get; set; }

        /// <summary>
        /// [Slack Webhook URL](https://slack.com/intl/en-es/help/articles/115005265063-Incoming-webhooks-for-Slack).
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public AlertChannelConfigArgs()
        {
        }
        public static new AlertChannelConfigArgs Empty => new AlertChannelConfigArgs();
    }
}
