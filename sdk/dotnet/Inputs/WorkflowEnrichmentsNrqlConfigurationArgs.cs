// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowEnrichmentsNrqlConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the nrql query.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public WorkflowEnrichmentsNrqlConfigurationArgs()
        {
        }
        public static new WorkflowEnrichmentsNrqlConfigurationArgs Empty => new WorkflowEnrichmentsNrqlConfigurationArgs();
    }
}
