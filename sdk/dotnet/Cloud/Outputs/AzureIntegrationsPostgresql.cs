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
    public sealed class AzureIntegrationsPostgresql
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        public readonly int? MetricsPollingInterval;
        /// <summary>
        /// Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
        /// 
        /// Other integration type support an additional argument:
        /// </summary>
        public readonly ImmutableArray<string> ResourceGroups;

        [OutputConstructor]
        private AzureIntegrationsPostgresql(
            int? metricsPollingInterval,

            ImmutableArray<string> resourceGroups)
        {
            MetricsPollingInterval = metricsPollingInterval;
            ResourceGroups = resourceGroups;
        }
    }
}
