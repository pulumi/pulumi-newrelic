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
    public sealed class OneDashboardPageWidgetMarkdownColorSeriesOverride
    {
        /// <summary>
        /// (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
        /// </summary>
        public readonly string? Color;
        public readonly string? SeriesName;

        [OutputConstructor]
        private OneDashboardPageWidgetMarkdownColorSeriesOverride(
            string? color,

            string? seriesName)
        {
            Color = color;
            SeriesName = seriesName;
        }
    }
}
