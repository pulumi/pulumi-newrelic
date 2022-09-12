// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowDestinationConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("channelId", required: true)]
        public Input<string> ChannelId { get; set; } = null!;

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// the filter's type.   One of: `FILTER` or `VIEW`.
        /// * `predicates`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WorkflowDestinationConfigurationArgs()
        {
        }
        public static new WorkflowDestinationConfigurationArgs Empty => new WorkflowDestinationConfigurationArgs();
    }
}
