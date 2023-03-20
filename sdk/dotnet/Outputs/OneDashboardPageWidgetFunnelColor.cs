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
    public sealed class OneDashboardPageWidgetFunnelColor
    {
        /// <summary>
        /// (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
        /// </summary>
        public readonly string? Color;
        /// <summary>
        /// (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetFunnelColorSeriesOverride> SeriesOverrides;

        [OutputConstructor]
        private OneDashboardPageWidgetFunnelColor(
            string? color,

            ImmutableArray<Outputs.OneDashboardPageWidgetFunnelColorSeriesOverride> seriesOverrides)
        {
            Color = color;
            SeriesOverrides = seriesOverrides;
        }
    }
}
