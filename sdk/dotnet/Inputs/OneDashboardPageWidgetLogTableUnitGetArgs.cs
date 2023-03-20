// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetLogTableUnitGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("seriesOverrides")]
        private InputList<Inputs.OneDashboardPageWidgetLogTableUnitSeriesOverrideGetArgs>? _seriesOverrides;

        /// <summary>
        /// (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetLogTableUnitSeriesOverrideGetArgs> SeriesOverrides
        {
            get => _seriesOverrides ?? (_seriesOverrides = new InputList<Inputs.OneDashboardPageWidgetLogTableUnitSeriesOverrideGetArgs>());
            set => _seriesOverrides = value;
        }

        /// <summary>
        /// (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public OneDashboardPageWidgetLogTableUnitGetArgs()
        {
        }
        public static new OneDashboardPageWidgetLogTableUnitGetArgs Empty => new OneDashboardPageWidgetLogTableUnitGetArgs();
    }
}
