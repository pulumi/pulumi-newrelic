// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelObjectiveGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the SLI.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A short name for the SLI that will help anyone understand what it is about.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The target of the objective, valid values between `0` and `100`. Up to 5 decimals accepted.
        /// </summary>
        [Input("target", required: true)]
        public Input<double> Target { get; set; } = null!;

        /// <summary>
        /// Time window is the period of the objective.
        /// </summary>
        [Input("timeWindow", required: true)]
        public Input<Inputs.ServiceLevelObjectiveTimeWindowGetArgs> TimeWindow { get; set; } = null!;

        public ServiceLevelObjectiveGetArgs()
        {
        }
        public static new ServiceLevelObjectiveGetArgs Empty => new ServiceLevelObjectiveGetArgs();
    }
}
