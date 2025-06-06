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
    public sealed class GcpIntegrationsBigTable
    {
        /// <summary>
        /// the data polling interval in seconds
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private GcpIntegrationsBigTable(int? metricsPollingInterval)
        {
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
