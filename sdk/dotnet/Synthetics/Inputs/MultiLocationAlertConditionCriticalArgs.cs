// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Inputs
{

    public sealed class MultiLocationAlertConditionCriticalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public MultiLocationAlertConditionCriticalArgs()
        {
        }
        public static new MultiLocationAlertConditionCriticalArgs Empty => new MultiLocationAlertConditionCriticalArgs();
    }
}
