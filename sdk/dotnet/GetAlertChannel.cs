// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetAlertChannel
    {
        /// <summary>
        /// Use this data source to get information about a specific alert channel in New Relic that already exists. 
        /// </summary>
        public static Task<GetAlertChannelResult> InvokeAsync(GetAlertChannelArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAlertChannelResult>("newrelic:index/getAlertChannel:getAlertChannel", args ?? new GetAlertChannelArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific alert channel in New Relic that already exists. 
        /// </summary>
        public static Output<GetAlertChannelResult> Invoke(GetAlertChannelInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAlertChannelResult>("newrelic:index/getAlertChannel:getAlertChannel", args ?? new GetAlertChannelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlertChannelArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the alert channel in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAlertChannelArgs()
        {
        }
    }

    public sealed class GetAlertChannelInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the alert channel in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetAlertChannelInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAlertChannelResult
    {
        /// <summary>
        /// Alert channel configuration.
        /// </summary>
        public readonly Outputs.GetAlertChannelConfigResult Config;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// A list of policy IDs associated with the alert channel.
        /// </summary>
        public readonly ImmutableArray<int> PolicyIds;
        /// <summary>
        /// Alert channel type, either: `email`, `opsgenie`, `pagerduty`, `slack`, `victorops`, or `webhook`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAlertChannelResult(
            Outputs.GetAlertChannelConfigResult config,

            string id,

            string name,

            ImmutableArray<int> policyIds,

            string type)
        {
            Config = config;
            Id = id;
            Name = name;
            PolicyIds = policyIds;
            Type = type;
        }
    }
}
