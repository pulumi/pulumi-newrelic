// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Outputs
{

    [OutputType]
    public sealed class AwsIntegrationsRds
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        public readonly bool? FetchTags;
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// Furthermore, below integration types supports the following common arguments.
        /// </summary>
        public readonly int? MetricsPollingInterval;
        public readonly string? TagKey;
        public readonly string? TagValue;

        [OutputConstructor]
        private AwsIntegrationsRds(
            ImmutableArray<string> awsRegions,

            bool? fetchTags,

            int? metricsPollingInterval,

            string? tagKey,

            string? tagValue)
        {
            AwsRegions = awsRegions;
            FetchTags = fetchTags;
            MetricsPollingInterval = metricsPollingInterval;
            TagKey = tagKey;
            TagValue = tagValue;
        }
    }
}
