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
    public sealed class OneDashboardPageWidgetHistogramUnitSeriesOverride
    {
        public readonly string? SeriesName;
        /// <summary>
        /// (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
        /// </summary>
        public readonly string? Unit;

        [OutputConstructor]
        private OneDashboardPageWidgetHistogramUnitSeriesOverride(
            string? seriesName,

            string? unit)
        {
            SeriesName = seriesName;
            Unit = unit;
        }
    }
}
