// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetHeatmapArgs : global::Pulumi.ResourceArgs
    {
        [Input("colors")]
        private InputList<Inputs.OneDashboardPageWidgetHeatmapColorArgs>? _colors;

        /// <summary>
        /// (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHeatmapColorArgs> Colors
        {
            get => _colors ?? (_colors = new InputList<Inputs.OneDashboardPageWidgetHeatmapColorArgs>());
            set => _colors = value;
        }

        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        [Input("column", required: true)]
        public Input<int> Column { get; set; } = null!;

        /// <summary>
        /// (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
        /// </summary>
        [Input("facetShowOtherSeries")]
        public Input<bool>? FacetShowOtherSeries { get; set; }

        /// <summary>
        /// (Optional) Use this item to filter the current dashboard.
        /// </summary>
        [Input("filterCurrentDashboard")]
        public Input<bool>? FilterCurrentDashboard { get; set; }

        /// <summary>
        /// (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
        /// </summary>
        [Input("height")]
        public Input<int>? Height { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
        /// </summary>
        [Input("ignoreTimeRange")]
        public Input<bool>? IgnoreTimeRange { get; set; }

        /// <summary>
        /// (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
        /// </summary>
        [Input("legendEnabled")]
        public Input<bool>? LegendEnabled { get; set; }

        [Input("linkedEntityGuids")]
        private InputList<string>? _linkedEntityGuids;

        /// <summary>
        /// (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
        /// </summary>
        public InputList<string> LinkedEntityGuids
        {
            get => _linkedEntityGuids ?? (_linkedEntityGuids = new InputList<string>());
            set => _linkedEntityGuids = value;
        }

        [Input("nrqlQueries", required: true)]
        private InputList<Inputs.OneDashboardPageWidgetHeatmapNrqlQueryArgs>? _nrqlQueries;

        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHeatmapNrqlQueryArgs> NrqlQueries
        {
            get => _nrqlQueries ?? (_nrqlQueries = new InputList<Inputs.OneDashboardPageWidgetHeatmapNrqlQueryArgs>());
            set => _nrqlQueries = value;
        }

        [Input("nullValues")]
        private InputList<Inputs.OneDashboardPageWidgetHeatmapNullValueArgs>? _nullValues;

        /// <summary>
        /// (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHeatmapNullValueArgs> NullValues
        {
            get => _nullValues ?? (_nullValues = new InputList<Inputs.OneDashboardPageWidgetHeatmapNullValueArgs>());
            set => _nullValues = value;
        }

        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        [Input("row", required: true)]
        public Input<int> Row { get; set; } = null!;

        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("units")]
        private InputList<Inputs.OneDashboardPageWidgetHeatmapUnitArgs>? _units;

        /// <summary>
        /// (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHeatmapUnitArgs> Units
        {
            get => _units ?? (_units = new InputList<Inputs.OneDashboardPageWidgetHeatmapUnitArgs>());
            set => _units = value;
        }

        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        [Input("width")]
        public Input<int>? Width { get; set; }

        [Input("yAxisLeftMax")]
        public Input<double>? YAxisLeftMax { get; set; }

        /// <summary>
        /// , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
        /// </summary>
        [Input("yAxisLeftMin")]
        public Input<double>? YAxisLeftMin { get; set; }

        public OneDashboardPageWidgetHeatmapArgs()
        {
        }
        public static new OneDashboardPageWidgetHeatmapArgs Empty => new OneDashboardPageWidgetHeatmapArgs();
    }
}
