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
    public sealed class WorkflowIssuesFilter
    {
        /// <summary>
        /// filter id.
        /// </summary>
        public readonly string? FilterId;
        /// <summary>
        /// (Required) Filter's name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A condition an issue event should satisfy to be processed by the workflow
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkflowIssuesFilterPredicate> Predicates;
        /// <summary>
        /// Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private WorkflowIssuesFilter(
            string? filterId,

            string name,

            ImmutableArray<Outputs.WorkflowIssuesFilterPredicate> predicates,

            string type)
        {
            FilterId = filterId;
            Name = name;
            Predicates = predicates;
            Type = type;
        }
    }
}
