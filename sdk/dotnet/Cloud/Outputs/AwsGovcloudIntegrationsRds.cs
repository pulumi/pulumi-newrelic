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
    public sealed class AwsGovcloudIntegrationsRds
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly bool? FetchTags;
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// Some integration types support an additional set of arguments:
        /// </summary>
        public readonly int? MetricsPollingInterval;
        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly string? TagKey;
        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly string? TagValue;

        [OutputConstructor]
        private AwsGovcloudIntegrationsRds(
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
