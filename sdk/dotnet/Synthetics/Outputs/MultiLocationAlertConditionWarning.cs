// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Outputs
{

    [OutputType]
    public sealed class MultiLocationAlertConditionWarning
    {
        /// <summary>
        /// The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        /// </summary>
        public readonly int Threshold;

        [OutputConstructor]
        private MultiLocationAlertConditionWarning(int threshold)
        {
            Threshold = threshold;
        }
    }
}
