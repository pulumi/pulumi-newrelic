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
    public sealed class GcpIntegrationsComposer
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// Other integration supports an additional argument:
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private GcpIntegrationsComposer(int? metricsPollingInterval)
        {
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
