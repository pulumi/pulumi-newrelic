// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class AlertMutingRuleConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        private InputList<Inputs.AlertMutingRuleConditionConditionGetArgs>? _conditions;

        /// <summary>
        /// The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
        /// </summary>
        public InputList<Inputs.AlertMutingRuleConditionConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AlertMutingRuleConditionConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// The operator used to combine all the MutingRuleConditions within the group.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        public AlertMutingRuleConditionGetArgs()
        {
        }
        public static new AlertMutingRuleConditionGetArgs Empty => new AlertMutingRuleConditionGetArgs();
    }
}
