// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsIntegrationsHealthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// 
        /// &lt;details&gt;
        /// &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        public AwsIntegrationsHealthArgs()
        {
        }
        public static new AwsIntegrationsHealthArgs Empty => new AwsIntegrationsHealthArgs();
    }
}
