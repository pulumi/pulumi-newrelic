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
    public sealed class AwsIntegrationsApiGateway
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// &lt;/details&gt;
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// &lt;details&gt;
        /// &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
        /// </summary>
        public readonly int? MetricsPollingInterval;
        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly ImmutableArray<string> StagePrefixes;
        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly string? TagKey;
        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly string? TagValue;

        [OutputConstructor]
        private AwsIntegrationsApiGateway(
            ImmutableArray<string> awsRegions,

            int? metricsPollingInterval,

            ImmutableArray<string> stagePrefixes,

            string? tagKey,

            string? tagValue)
        {
            AwsRegions = awsRegions;
            MetricsPollingInterval = metricsPollingInterval;
            StagePrefixes = stagePrefixes;
            TagKey = tagKey;
            TagValue = tagValue;
        }
    }
}