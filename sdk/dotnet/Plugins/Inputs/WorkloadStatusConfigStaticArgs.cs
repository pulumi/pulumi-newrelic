// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Inputs
{

    public sealed class WorkloadStatusConfigStaticArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description that provides additional details about the status of the workload.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the static status configuration is enabled or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The status of the workload.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// A short description of the status of the workload.
        /// </summary>
        [Input("summary")]
        public Input<string>? Summary { get; set; }

        public WorkloadStatusConfigStaticArgs()
        {
        }
        public static new WorkloadStatusConfigStaticArgs Empty => new WorkloadStatusConfigStaticArgs();
    }
}
