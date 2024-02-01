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
    public sealed class NrqlAlertConditionNrql
    {
        /// <summary>
        /// NRQL queries are evaluated in one-minute time windows. The start time depends on the value you provide in the NRQL condition's `evaluation_offset`.
        /// </summary>
        public readonly int? EvaluationOffset;
        public readonly string Query;
        /// <summary>
        /// NRQL queries are evaluated in one-minute time windows. The start time depends on the value you provide in the NRQL condition's `since_value`.
        /// </summary>
        public readonly string? SinceValue;

        [OutputConstructor]
        private NrqlAlertConditionNrql(
            int? evaluationOffset,

            string query,

            string? sinceValue)
        {
            EvaluationOffset = evaluationOffset;
            Query = query;
            SinceValue = sinceValue;
        }
    }
}
