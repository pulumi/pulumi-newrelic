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
    public sealed class OneDashboardPageWidgetTableThreshold
    {
        /// <summary>
        /// The name of the column in the table, to which the threshold would need to be applied.
        /// </summary>
        public readonly string? ColumnName;
        /// <summary>
        /// The value 'from' which the threshold would need to be applied.
        /// </summary>
        public readonly string? From;
        /// <summary>
        /// The severity of the threshold, which would affect the visual appearance of the threshold (such as its color) accordingly. The value of this attribute would need to be one of the following - `warning`, `severe`, `critical`, `success`, `unavailable` which correspond to the severity labels *Warning*, *Approaching critical*, *Critical*, *Good*, *Neutral* in the dropdown that helps specify the severity of thresholds in table widgets in the UI, respectively.
        /// </summary>
        public readonly string? Severity;
        /// <summary>
        /// The value until which the threshold would need to be applied.
        /// </summary>
        public readonly string? To;

        [OutputConstructor]
        private OneDashboardPageWidgetTableThreshold(
            string? columnName,

            string? from,

            string? severity,

            string? to)
        {
            ColumnName = columnName;
            From = from;
            Severity = severity;
            To = to;
        }
    }
}
