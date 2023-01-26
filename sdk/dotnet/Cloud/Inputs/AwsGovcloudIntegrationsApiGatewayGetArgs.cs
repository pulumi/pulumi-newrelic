// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsGovcloudIntegrationsApiGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsRegions")]
        private InputList<string>? _awsRegions;

        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// * `direct connect`
        /// * `aws states`
        /// </summary>
        public InputList<string> AwsRegions
        {
            get => _awsRegions ?? (_awsRegions = new InputList<string>());
            set => _awsRegions = value;
        }

        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        [Input("stagePrefixes")]
        private InputList<string>? _stagePrefixes;

        /// <summary>
        /// Specify each name or prefix for the Stages that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public InputList<string> StagePrefixes
        {
            get => _stagePrefixes ?? (_stagePrefixes = new InputList<string>());
            set => _stagePrefixes = value;
        }

        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        [Input("tagKey")]
        public Input<string>? TagKey { get; set; }

        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// * `api Gateway`
        /// * `auto scaling`
        /// * `elastic search`
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AwsGovcloudIntegrationsApiGatewayGetArgs()
        {
        }
        public static new AwsGovcloudIntegrationsApiGatewayGetArgs Empty => new AwsGovcloudIntegrationsApiGatewayGetArgs();
    }
}
