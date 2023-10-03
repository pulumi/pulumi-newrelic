// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Inputs
{

    public sealed class WorkloadStatusConfigAutomaticArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the static status configuration is enabled or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// An additional meta-rule that can consider all entities that haven't been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
        /// </summary>
        [Input("remainingEntitiesRule")]
        public Input<Inputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs>? RemainingEntitiesRule { get; set; }

        [Input("rules")]
        private InputList<Inputs.WorkloadStatusConfigAutomaticRuleArgs>? _rules;

        /// <summary>
        /// The input object used to represent a rollup strategy. See Nested rule blocks below for details.
        /// </summary>
        public InputList<Inputs.WorkloadStatusConfigAutomaticRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WorkloadStatusConfigAutomaticRuleArgs>());
            set => _rules = value;
        }

        public WorkloadStatusConfigAutomaticArgs()
        {
        }
        public static new WorkloadStatusConfigAutomaticArgs Empty => new WorkloadStatusConfigAutomaticArgs();
    }
}
