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
        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// The API key for integrating with OpsGenie.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("authPassword")]
        private Input<string>? _authPassword;

        /// <summary>
        /// Specifies an authentication password for use with a channel.  Supported by the `webhook` channel type.
        /// </summary>
        public Input<string>? AuthPassword
        {
            get => _authPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("authType")]
        private Input<string>? _authType;

        /// <summary>
        /// Specifies an authentication method for use with a channel.  Supported by the `webhook` channel type.  Only HTTP basic authentication is currently supported via the value `BASIC`.
        /// </summary>
        public Input<string>? AuthType
        {
            get => _authType;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authType = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies an authentication username for use with a channel.  Supported by the `webhook` channel type.
        /// </summary>
        [Input("authUsername")]
        public Input<string>? AuthUsername { get; set; }

        [Input("baseUrl")]
        private Input<string>? _baseUrl;

        /// <summary>
        /// The base URL of the webhook destination.
        /// </summary>
        public Input<string>? BaseUrl
        {
            get => _baseUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _baseUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Slack channel to send notifications to.
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
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _headers = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("headersString")]
        private Input<string>? _headersString;

        /// <summary>
        /// Use instead of `headers` if the desired payload is more complex than a list of key/value pairs (e.g. a set of headers that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `headers`.
        /// </summary>
        public Input<string>? HeadersString
        {
            get => _headersString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _headersString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// `true` or `false`. Flag for whether or not to attach a JSON document containing information about the associated alert to the email that is sent to recipients.
        /// </summary>
        [Input("includeJsonAttachment")]
        public Input<string>? IncludeJsonAttachment { get; set; }

        [Input("key")]
        private Input<string>? _key;

        /// <summary>
        /// The key for integrating with VictorOps.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("payload")]
        private InputMap<string>? _payload;

        /// <summary>
        /// A map of key/value pairs that represents the webhook payload.  Must provide `payload_type` if setting this argument.
        /// </summary>
        public InputMap<string> Payload
        {
            get => _payload ?? (_payload = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _payload = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("payloadString")]
        private Input<string>? _payloadString;

        /// <summary>
        /// Use instead of `payload` if the desired payload is more complex than a list of key/value pairs (e.g. a payload that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `payload`.
        /// </summary>
        public Input<string>? PayloadString
        {
            get => _payloadString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _payloadString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Can either be `application/json` or `application/x-www-form-urlencoded`. The `payload_type` argument is _required_ if `payload` is set.
        /// </summary>
        [Input("payloadType")]
        public Input<string>? PayloadType { get; set; }

        /// <summary>
        /// Comma delimited list of email addresses.
        /// </summary>
        [Input("recipients")]
        public Input<string>? Recipients { get; set; }

        /// <summary>
        /// The data center region to store your data.  Valid values are `US` and `EU`.  Default is `US`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("routeKey")]
        private Input<string>? _routeKey;

        /// <summary>
        /// The route key for integrating with VictorOps.
        /// </summary>
        public Input<string>? RouteKey
        {
            get => _routeKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _routeKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("serviceKey")]
        private Input<string>? _serviceKey;

        /// <summary>
        /// Specifies the service key for integrating with Pagerduty.
        /// </summary>
        public Input<string>? ServiceKey
        {
            get => _serviceKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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

        [Input("url")]
        private Input<string>? _url;

        /// <summary>
        /// [Slack Webhook URL](https://api.slack.com/messaging/webhooks#create_a_webhook).
        /// </summary>
        public Input<string>? Url
        {
            get => _url;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _url = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public AlertChannelConfigArgs()
        {
        }
        public static new AlertChannelConfigArgs Empty => new AlertChannelConfigArgs();
    }
}
