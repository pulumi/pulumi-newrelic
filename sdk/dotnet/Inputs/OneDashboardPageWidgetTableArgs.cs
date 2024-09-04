// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("colors")]
        private InputList<Inputs.OneDashboardPageWidgetTableColorArgs>? _colors;

        /// <summary>
        /// (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableColorArgs> Colors
        {
            get => _colors ?? (_colors = new InputList<Inputs.OneDashboardPageWidgetTableColorArgs>());
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

        /// <summary>
        /// The ID of the widget.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
        /// </summary>
        [Input("ignoreTimeRange")]
        public Input<bool>? IgnoreTimeRange { get; set; }

        /// <summary>
        /// (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
        /// </summary>
        [Input("initialSorting")]
        public Input<Inputs.OneDashboardPageWidgetTableInitialSortingArgs>? InitialSorting { get; set; }

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
        private InputList<Inputs.OneDashboardPageWidgetTableNrqlQueryArgs>? _nrqlQueries;

        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableNrqlQueryArgs> NrqlQueries
        {
            get => _nrqlQueries ?? (_nrqlQueries = new InputList<Inputs.OneDashboardPageWidgetTableNrqlQueryArgs>());
            set => _nrqlQueries = value;
        }

        [Input("nullValues")]
        private InputList<Inputs.OneDashboardPageWidgetTableNullValueArgs>? _nullValues;

        /// <summary>
        /// (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableNullValueArgs> NullValues
        {
            get => _nullValues ?? (_nullValues = new InputList<Inputs.OneDashboardPageWidgetTableNullValueArgs>());
            set => _nullValues = value;
        }

        /// <summary>
        /// (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
        /// </summary>
        [Input("refreshRate")]
        public Input<string>? RefreshRate { get; set; }

        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        [Input("row", required: true)]
        public Input<int> Row { get; set; } = null!;

        [Input("thresholds")]
        private InputList<Inputs.OneDashboardPageWidgetTableThresholdArgs>? _thresholds;

        /// <summary>
        /// (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableThresholdArgs> Thresholds
        {
            get => _thresholds ?? (_thresholds = new InputList<Inputs.OneDashboardPageWidgetTableThresholdArgs>());
            set => _thresholds = value;
        }

        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("units")]
        private InputList<Inputs.OneDashboardPageWidgetTableUnitArgs>? _units;

        /// <summary>
        /// (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableUnitArgs> Units
        {
            get => _units ?? (_units = new InputList<Inputs.OneDashboardPageWidgetTableUnitArgs>());
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

        public OneDashboardPageWidgetTableArgs()
        {
        }
        public static new OneDashboardPageWidgetTableArgs Empty => new OneDashboardPageWidgetTableArgs();
    }
}
