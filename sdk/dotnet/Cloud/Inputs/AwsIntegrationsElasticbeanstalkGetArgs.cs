// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsIntegrationsElasticbeanstalkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsRegions")]
        private InputList<string>? _awsRegions;

        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// </summary>
        public InputList<string> AwsRegions
        {
            get => _awsRegions ?? (_awsRegions = new InputList<string>());
            set => _awsRegions = value;
        }

        [Input("fetchExtendedInventory")]
        public Input<bool>? FetchExtendedInventory { get; set; }

        [Input("fetchTags")]
        public Input<bool>? FetchTags { get; set; }

        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// Furthermore, below integration types supports the following common arguments.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        [Input("tagKey")]
        public Input<string>? TagKey { get; set; }

        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AwsIntegrationsElasticbeanstalkGetArgs()
        {
        }
        public static new AwsIntegrationsElasticbeanstalkGetArgs Empty => new AwsIntegrationsElasticbeanstalkGetArgs();
    }
}
