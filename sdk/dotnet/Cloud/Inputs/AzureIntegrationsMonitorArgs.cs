// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AzureIntegrationsMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A flag that specifies if the integration is active
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("excludeTags")]
        private InputList<string>? _excludeTags;

        /// <summary>
        /// Specify resource tags in 'key:value' form to be excluded from monitoring
        /// </summary>
        public InputList<string> ExcludeTags
        {
            get => _excludeTags ?? (_excludeTags = new InputList<string>());
            set => _excludeTags = value;
        }

        [Input("includeTags")]
        private InputList<string>? _includeTags;

        /// <summary>
        /// Specify resource tags in 'key:value' form to be monitored
        /// </summary>
        public InputList<string> IncludeTags
        {
            get => _includeTags ?? (_includeTags = new InputList<string>());
            set => _includeTags = value;
        }

        /// <summary>
        /// The data polling interval in seconds
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

        [Input("resourceTypes")]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// Specify each Azure resource type that needs to be monitored
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        public AzureIntegrationsMonitorArgs()
        {
        }
        public static new AzureIntegrationsMonitorArgs Empty => new AzureIntegrationsMonitorArgs();
    }
}
