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
    public sealed class OneDashboardPageWidgetTable
    {
        /// <summary>
        /// (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetTableColor> Colors;
        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Column;
        /// <summary>
        /// (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
        /// </summary>
        public readonly bool? FacetShowOtherSeries;
        /// <summary>
        /// (Optional) Use this item to filter the current dashboard.
        /// </summary>
        public readonly bool? FilterCurrentDashboard;
        /// <summary>
        /// (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
        /// </summary>
        public readonly int? Height;
        /// <summary>
        /// The ID of the widget.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
        /// </summary>
        public readonly bool? IgnoreTimeRange;
        /// <summary>
        /// (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
        /// </summary>
        public readonly Outputs.OneDashboardPageWidgetTableInitialSorting? InitialSorting;
        /// <summary>
        /// (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
        /// </summary>
        public readonly bool? LegendEnabled;
        /// <summary>
        /// (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
        /// </summary>
        public readonly ImmutableArray<string> LinkedEntityGuids;
        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetTableNrqlQuery> NrqlQueries;
        /// <summary>
        /// (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetTableNullValue> NullValues;
        /// <summary>
        /// (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
        /// </summary>
        public readonly string? RefreshRate;
        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Row;
        /// <summary>
        /// (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetTableThreshold> Thresholds;
        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        public readonly string Title;
        /// <summary>
        /// (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetTableUnit> Units;
        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        public readonly int? Width;
        public readonly double? YAxisLeftMax;
        /// <summary>
        /// , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
        /// </summary>
        public readonly double? YAxisLeftMin;

        [OutputConstructor]
        private OneDashboardPageWidgetTable(
            ImmutableArray<Outputs.OneDashboardPageWidgetTableColor> colors,

            int column,

            bool? facetShowOtherSeries,

            bool? filterCurrentDashboard,

            int? height,

            string? id,

            bool? ignoreTimeRange,

            Outputs.OneDashboardPageWidgetTableInitialSorting? initialSorting,

            bool? legendEnabled,

            ImmutableArray<string> linkedEntityGuids,

            ImmutableArray<Outputs.OneDashboardPageWidgetTableNrqlQuery> nrqlQueries,

            ImmutableArray<Outputs.OneDashboardPageWidgetTableNullValue> nullValues,

            string? refreshRate,

            int row,

            ImmutableArray<Outputs.OneDashboardPageWidgetTableThreshold> thresholds,

            string title,

            ImmutableArray<Outputs.OneDashboardPageWidgetTableUnit> units,

            int? width,

            double? yAxisLeftMax,

            double? yAxisLeftMin)
        {
            Colors = colors;
            Column = column;
            FacetShowOtherSeries = facetShowOtherSeries;
            FilterCurrentDashboard = filterCurrentDashboard;
            Height = height;
            Id = id;
            IgnoreTimeRange = ignoreTimeRange;
            InitialSorting = initialSorting;
            LegendEnabled = legendEnabled;
            LinkedEntityGuids = linkedEntityGuids;
            NrqlQueries = nrqlQueries;
            NullValues = nullValues;
            RefreshRate = refreshRate;
            Row = row;
            Thresholds = thresholds;
            Title = title;
            Units = units;
            Width = width;
            YAxisLeftMax = yAxisLeftMax;
            YAxisLeftMin = yAxisLeftMin;
        }
    }
}
