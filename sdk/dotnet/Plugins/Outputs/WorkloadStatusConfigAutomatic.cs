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
    public sealed class WorkloadStatusConfigAutomatic
    {
        /// <summary>
        /// Whether the automatic status configuration is enabled or not.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// An additional meta-rule that can consider all entities that haven't been evaluated by any other rule.
        /// </summary>
        public readonly Outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRule? RemainingEntitiesRule;
        /// <summary>
        /// A list of rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkloadStatusConfigAutomaticRule> Rules;

        [OutputConstructor]
        private WorkloadStatusConfigAutomatic(
            bool enabled,

            Outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRule? remainingEntitiesRule,

            ImmutableArray<Outputs.WorkloadStatusConfigAutomaticRule> rules)
        {
            Enabled = enabled;
            RemainingEntitiesRule = remainingEntitiesRule;
            Rules = rules;
        }
    }
}
