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
    public sealed class AlertMutingRuleConditionCondition
    {
        /// <summary>
        /// The attribute on a violation. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
        /// </summary>
        public readonly string Attribute;
        /// <summary>
        /// The operator used to compare the attribute's value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// The value(s) to compare against the attribute's value.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private AlertMutingRuleConditionCondition(
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
