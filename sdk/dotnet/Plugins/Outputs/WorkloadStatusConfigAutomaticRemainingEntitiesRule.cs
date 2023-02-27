// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Outputs
{

    [OutputType]
    public sealed class WorkloadStatusConfigAutomaticRemainingEntitiesRule
    {
        /// <summary>
        /// The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
        /// </summary>
        public readonly Outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup RemainingEntitiesRuleRollup;

        [OutputConstructor]
        private WorkloadStatusConfigAutomaticRemainingEntitiesRule(Outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup remainingEntitiesRuleRollup)
        {
            RemainingEntitiesRuleRollup = remainingEntitiesRuleRollup;
        }
    }
}