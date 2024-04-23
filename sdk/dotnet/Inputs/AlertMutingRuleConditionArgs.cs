// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class AlertMutingRuleConditionArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions", required: true)]
        private InputList<Inputs.AlertMutingRuleConditionConditionArgs>? _conditions;

        /// <summary>
        /// The individual MutingRuleConditions within the group.
        /// </summary>
        public InputList<Inputs.AlertMutingRuleConditionConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AlertMutingRuleConditionConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// The operator used to combine all the MutingRuleConditions within the group.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        public AlertMutingRuleConditionArgs()
        {
        }
        public static new AlertMutingRuleConditionArgs Empty => new AlertMutingRuleConditionArgs();
    }
}
