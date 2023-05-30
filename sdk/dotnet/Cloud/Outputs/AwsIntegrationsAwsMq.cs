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
    public sealed class AwsIntegrationsAwsMq
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
        /// &lt;summary&gt; Some integration types support an additional set of arguments. To delve deeper into the list of arguments, click here. &lt;/summary&gt;
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private AwsIntegrationsAwsMq(
            ImmutableArray<string> awsRegions,

            int? metricsPollingInterval)
        {
            AwsRegions = awsRegions;
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
