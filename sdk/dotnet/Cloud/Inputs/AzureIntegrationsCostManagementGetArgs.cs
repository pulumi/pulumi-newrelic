// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AzureIntegrationsCostManagementGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        [Input("tagKeys")]
        private InputList<string>? _tagKeys;

        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public InputList<string> TagKeys
        {
            get => _tagKeys ?? (_tagKeys = new InputList<string>());
            set => _tagKeys = value;
        }

        public AzureIntegrationsCostManagementGetArgs()
        {
        }
        public static new AzureIntegrationsCostManagementGetArgs Empty => new AzureIntegrationsCostManagementGetArgs();
    }
}
