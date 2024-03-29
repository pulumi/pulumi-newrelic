// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsIntegrationsEcsArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsRegions")]
        private InputList<string>? _awsRegions;

        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.  
        /// &lt;/details&gt;
        /// </summary>
        public InputList<string> AwsRegions
        {
            get => _awsRegions ?? (_awsRegions = new InputList<string>());
            set => _awsRegions = value;
        }

        /// <summary>
        /// Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        [Input("fetchTags")]
        public Input<bool>? FetchTags { get; set; }

        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// &lt;details&gt;
        /// &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        [Input("tagKey")]
        public Input<string>? TagKey { get; set; }

        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AwsIntegrationsEcsArgs()
        {
        }
        public static new AwsIntegrationsEcsArgs Empty => new AwsIntegrationsEcsArgs();
    }
}
