// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetHeatmapNullValueSeriesOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        [Input("nullValue")]
        public Input<string>? NullValue { get; set; }

        /// <summary>
        /// Series name
        /// </summary>
        [Input("seriesName")]
        public Input<string>? SeriesName { get; set; }

        public OneDashboardPageWidgetHeatmapNullValueSeriesOverrideArgs()
        {
        }
        public static new OneDashboardPageWidgetHeatmapNullValueSeriesOverrideArgs Empty => new OneDashboardPageWidgetHeatmapNullValueSeriesOverrideArgs();
    }
}
