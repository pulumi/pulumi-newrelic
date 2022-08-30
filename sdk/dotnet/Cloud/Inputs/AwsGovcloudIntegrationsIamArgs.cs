// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsGovcloudIntegrationsIamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data polling interval in seconds.
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
        /// * `api Gateway`
        /// * `auto scaling`
        /// * `ebs`
        /// * `ec2`
        /// * `elastic search`
        /// * `elb`
        /// * `iam`
        /// * `lambda`
        /// * `rds`
        /// * `redshift`
        /// * `route53`
        /// * `sns`
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AwsGovcloudIntegrationsIamArgs()
        {
        }
        public static new AwsGovcloudIntegrationsIamArgs Empty => new AwsGovcloudIntegrationsIamArgs();
    }
}
