// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetJsonGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("colors")]
        private InputList<Inputs.OneDashboardPageWidgetJsonColorGetArgs>? _colors;

        /// <summary>
        /// (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonColorGetArgs> Colors
        {
            get => _colors ?? (_colors = new InputList<Inputs.OneDashboardPageWidgetJsonColorGetArgs>());
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
        /// (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
        /// </summary>
        [Input("ignoreTimeRange")]
        public Input<bool>? IgnoreTimeRange { get; set; }

        /// <summary>
        /// (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
        /// </summary>
        [Input("legendEnabled")]
        public Input<bool>? LegendEnabled { get; set; }

        [Input("nrqlQueries", required: true)]
        private InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryGetArgs>? _nrqlQueries;

        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryGetArgs> NrqlQueries
        {
            get => _nrqlQueries ?? (_nrqlQueries = new InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryGetArgs>());
            set => _nrqlQueries = value;
        }

        [Input("nullValues")]
        private InputList<Inputs.OneDashboardPageWidgetJsonNullValueGetArgs>? _nullValues;

        /// <summary>
        /// (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonNullValueGetArgs> NullValues
        {
            get => _nullValues ?? (_nullValues = new InputList<Inputs.OneDashboardPageWidgetJsonNullValueGetArgs>());
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
        private InputList<Inputs.OneDashboardPageWidgetJsonUnitGetArgs>? _units;

        /// <summary>
        /// (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonUnitGetArgs> Units
        {
            get => _units ?? (_units = new InputList<Inputs.OneDashboardPageWidgetJsonUnitGetArgs>());
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

        public OneDashboardPageWidgetJsonGetArgs()
        {
        }
        public static new OneDashboardPageWidgetJsonGetArgs Empty => new OneDashboardPageWidgetJsonGetArgs();
    }
}
