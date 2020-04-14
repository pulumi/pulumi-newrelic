// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class AlertConditionTermGetArgs : Pulumi.ResourceArgs
    {
        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("priority")]
        public Input<string>? Priority { get; set; }

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        [Input("timeFunction", required: true)]
        public Input<string> TimeFunction { get; set; } = null!;

        public AlertConditionTermGetArgs()
        {
        }
    }
}
