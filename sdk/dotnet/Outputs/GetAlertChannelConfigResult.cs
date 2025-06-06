// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class GetAlertChannelConfigResult
    {
        public readonly string? ApiKey;
        public readonly string? AuthPassword;
        public readonly string? AuthType;
        public readonly string? AuthUsername;
        public readonly string? BaseUrl;
        public readonly string? Channel;
        public readonly ImmutableDictionary<string, string>? Headers;
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
        private GetAlertChannelConfigResult(
            string? apiKey,

            string? authPassword,

            string? authType,

            string? authUsername,

            string? baseUrl,

            string? channel,

            ImmutableDictionary<string, string>? headers,

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
