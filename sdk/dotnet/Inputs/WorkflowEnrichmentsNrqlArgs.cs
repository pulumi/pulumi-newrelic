// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowEnrichmentsNrqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("configurations", required: true)]
        private InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs>? _configurations;

        /// <summary>
        /// A set of key-value pairs to represent a enrichment configuration.
        /// </summary>
        public InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs> Configurations
        {
            get => _configurations ?? (_configurations = new InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs>());
            set => _configurations = value;
        }

        /// <summary>
        /// Enrichment's id.
        /// </summary>
        [Input("enrichmentId")]
        public Input<string>? EnrichmentId { get; set; }

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of the enrichment. One of: (NRQL).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WorkflowEnrichmentsNrqlArgs()
        {
        }
        public static new WorkflowEnrichmentsNrqlArgs Empty => new WorkflowEnrichmentsNrqlArgs();
    }
}
