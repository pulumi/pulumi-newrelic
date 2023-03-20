// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetStackedBarColorSeriesOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

        [Input("seriesName")]
        public Input<string>? SeriesName { get; set; }

        public OneDashboardPageWidgetStackedBarColorSeriesOverrideGetArgs()
        {
        }
        public static new OneDashboardPageWidgetStackedBarColorSeriesOverrideGetArgs Empty => new OneDashboardPageWidgetStackedBarColorSeriesOverrideGetArgs();
    }
}
