// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetLineColorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

        [Input("seriesOverrides")]
        private InputList<Inputs.OneDashboardPageWidgetLineColorSeriesOverrideArgs>? _seriesOverrides;

        /// <summary>
        /// (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetLineColorSeriesOverrideArgs> SeriesOverrides
        {
            get => _seriesOverrides ?? (_seriesOverrides = new InputList<Inputs.OneDashboardPageWidgetLineColorSeriesOverrideArgs>());
            set => _seriesOverrides = value;
        }

        public OneDashboardPageWidgetLineColorArgs()
        {
        }
        public static new OneDashboardPageWidgetLineColorArgs Empty => new OneDashboardPageWidgetLineColorArgs();
    }
}
