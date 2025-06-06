// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Outputs
{

    [OutputType]
    public sealed class AwsGovcloudIntegrationsRoute53
    {
        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly bool? FetchExtendedInventory;
        /// <summary>
        /// The data polling interval in seconds
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private AwsGovcloudIntegrationsRoute53(
            bool? fetchExtendedInventory,

            int? metricsPollingInterval)
        {
            FetchExtendedInventory = fetchExtendedInventory;
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
