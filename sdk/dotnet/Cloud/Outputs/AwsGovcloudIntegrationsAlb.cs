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
    public sealed class AwsGovcloudIntegrationsAlb
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// * `direct connect`
        /// * `aws states`
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly bool? FetchExtendedInventory;
        /// <summary>
        /// Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly bool? FetchTags;
        /// <summary>
        /// Specify each name or prefix for the LBs that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly ImmutableArray<string> LoadBalancerPrefixes;
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
        /// * `api Gateway`
        /// * `auto scaling`
        /// * `elastic search`
        /// </summary>
        public readonly string? TagValue;

        [OutputConstructor]
        private AwsGovcloudIntegrationsAlb(
            ImmutableArray<string> awsRegions,

            bool? fetchExtendedInventory,

            bool? fetchTags,

            ImmutableArray<string> loadBalancerPrefixes,

            int? metricsPollingInterval,

            string? tagKey,

            string? tagValue)
        {
            AwsRegions = awsRegions;
            FetchExtendedInventory = fetchExtendedInventory;
            FetchTags = fetchTags;
            LoadBalancerPrefixes = loadBalancerPrefixes;
            MetricsPollingInterval = metricsPollingInterval;
            TagKey = tagKey;
            TagValue = tagValue;
        }
    }
}
