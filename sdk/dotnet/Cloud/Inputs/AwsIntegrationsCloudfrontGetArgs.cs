// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsIntegrationsCloudfrontGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fetchLambdasAtEdge")]
        public Input<bool>? FetchLambdasAtEdge { get; set; }

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

        public AwsIntegrationsCloudfrontGetArgs()
        {
        }
        public static new AwsIntegrationsCloudfrontGetArgs Empty => new AwsIntegrationsCloudfrontGetArgs();
    }
}
