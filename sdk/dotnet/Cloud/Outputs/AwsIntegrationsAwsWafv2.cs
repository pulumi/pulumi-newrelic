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
    public sealed class AwsIntegrationsAwsWafv2
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// Furthermore, below integration types supports the following common arguments.
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private AwsIntegrationsAwsWafv2(
            ImmutableArray<string> awsRegions,

            int? metricsPollingInterval)
        {
            AwsRegions = awsRegions;
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
