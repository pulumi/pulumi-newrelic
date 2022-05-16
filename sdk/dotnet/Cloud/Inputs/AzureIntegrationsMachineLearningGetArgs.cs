// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AzureIntegrationsMachineLearningGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        [Input("resourceGroups")]
        private InputList<string>? _resourceGroups;

        /// <summary>
        /// Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
        /// </summary>
        public InputList<string> ResourceGroups
        {
            get => _resourceGroups ?? (_resourceGroups = new InputList<string>());
            set => _resourceGroups = value;
        }

        public AzureIntegrationsMachineLearningGetArgs()
        {
        }
    }
}