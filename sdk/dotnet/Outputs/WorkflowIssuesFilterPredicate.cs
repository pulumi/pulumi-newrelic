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
    public sealed class WorkflowIssuesFilterPredicate
    {
        /// <summary>
        /// A predicates attribute.
        /// </summary>
        public readonly string Attribute;
        /// <summary>
        /// A predicates operator. One of: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_EXACTLY_MATCH`, `ENDS_WITH`, `EQUAL`, `EXACTLY_MATCHES`, `GREATER_OR_EQUAL`, `GREATER_THAN`, `IS`, `IS_NOT`, `LESS_OR_EQUAL`, `LESS_THAN` or `STARTS_WITH` (workflows).
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// A list of values.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private WorkflowIssuesFilterPredicate(
            string attribute,

            string @operator,

            ImmutableArray<string> values)
        {
            Attribute = attribute;
            Operator = @operator;
            Values = values;
        }
    }
}