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
        /// <summary>
        /// In minutes, must be in the range of 1 to 120 (inclusive).
        /// </summary>
        public readonly int? Duration;
        /// <summary>
        /// One of (above, above_or_equals, below, below_or_equals, equals, not_equals). Defaults to 'equals'.
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// BETA PREVIEW: the `prediction` field is in limited release and only enabled for preview on a per-account basis. - Use `prediction` to open alerts when your static threshold is predicted to be reached in the future. The `prediction` field is only available for static conditions.
        /// </summary>
        public readonly Outputs.NrqlAlertConditionCriticalPrediction? Prediction;
        /// <summary>
        /// For baseline conditions must be in range [1, 1000].
        /// </summary>
        public readonly double Threshold;
        /// <summary>
        /// The duration, in seconds, that the threshold must violate in order to create an incident. Value must be a multiple of the 'aggregation_window' (which has a default of 60 seconds). Value must be within 120-86400 seconds for baseline conditions, and within 60-86400 seconds for static conditions
        /// </summary>
        public readonly int? ThresholdDuration;
        /// <summary>
        /// The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: 'ALL' or 'AT_LEAST_ONCE' (case insensitive).
        /// </summary>
        public readonly string? ThresholdOccurrences;
        /// <summary>
        /// Valid values are: 'all' or 'any'
        /// </summary>
        public readonly string? TimeFunction;

        [OutputConstructor]
        private NrqlAlertConditionCritical(
            int? duration,

            string? @operator,

            Outputs.NrqlAlertConditionCriticalPrediction? prediction,

            double threshold,

            int? thresholdDuration,

            string? thresholdOccurrences,

            string? timeFunction)
        {
            Duration = duration;
            Operator = @operator;
            Prediction = prediction;
            Threshold = threshold;
            ThresholdDuration = thresholdDuration;
            ThresholdOccurrences = thresholdOccurrences;
            TimeFunction = timeFunction;
        }
    }
}
