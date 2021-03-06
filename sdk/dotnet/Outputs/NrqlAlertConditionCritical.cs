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
    public sealed class NrqlAlertConditionCritical
    {
        public readonly int? Duration;
        public readonly string? Operator;
        public readonly double Threshold;
        public readonly int? ThresholdDuration;
        public readonly string? ThresholdOccurrences;
        public readonly string? TimeFunction;

        [OutputConstructor]
        private NrqlAlertConditionCritical(
            int? duration,

            string? @operator,

            double threshold,

            int? thresholdDuration,

            string? thresholdOccurrences,

            string? timeFunction)
        {
            Duration = duration;
            Operator = @operator;
            Threshold = threshold;
            ThresholdDuration = thresholdDuration;
            ThresholdOccurrences = thresholdOccurrences;
            TimeFunction = timeFunction;
        }
    }
}
