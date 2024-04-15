// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class WorkflowEnrichmentsNrql
    {
        /// <summary>
        /// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// A set of key-value pairs to represent a enrichment configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkflowEnrichmentsNrqlConfiguration> Configurations;
        /// <summary>
        /// Enrichment's id.
        /// </summary>
        public readonly string? EnrichmentId;
        /// <summary>
        /// The name of the workflow.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of the enrichment. One of: (NRQL).
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private WorkflowEnrichmentsNrql(
            string? accountId,

            ImmutableArray<Outputs.WorkflowEnrichmentsNrqlConfiguration> configurations,

            string? enrichmentId,

            string name,

            string? type)
        {
            AccountId = accountId;
            Configurations = configurations;
            EnrichmentId = enrichmentId;
            Name = name;
            Type = type;
        }
    }
}
