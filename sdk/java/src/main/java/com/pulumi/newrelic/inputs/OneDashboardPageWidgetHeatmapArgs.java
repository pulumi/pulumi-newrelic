// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapColorArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapDataFormatArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapInitialSortingArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapNrqlQueryArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapNullValueArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapUnitArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetHeatmapArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetHeatmapArgs Empty = new OneDashboardPageWidgetHeatmapArgs();

    /**
     * (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    @Import(name="colors")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapColorArgs>> colors;

    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHeatmapColorArgs>>> colors() {
        return Optional.ofNullable(this.colors);
    }

    /**
     * (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    @Import(name="column", required=true)
    private Output<Integer> column;

    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    public Output<Integer> column() {
        return this.column;
    }

    /**
     * (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
     * 
     */
    @Import(name="dataFormats")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapDataFormatArgs>> dataFormats;

    /**
     * @return (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHeatmapDataFormatArgs>>> dataFormats() {
        return Optional.ofNullable(this.dataFormats);
    }

    /**
     * (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
     * 
     */
    @Import(name="facetShowOtherSeries")
    private @Nullable Output<Boolean> facetShowOtherSeries;

    /**
     * @return (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> facetShowOtherSeries() {
        return Optional.ofNullable(this.facetShowOtherSeries);
    }

    /**
     * (Optional) Use this item to filter the current dashboard.
     * 
     */
    @Import(name="filterCurrentDashboard")
    private @Nullable Output<Boolean> filterCurrentDashboard;

    /**
     * @return (Optional) Use this item to filter the current dashboard.
     * 
     */
    public Optional<Output<Boolean>> filterCurrentDashboard() {
        return Optional.ofNullable(this.filterCurrentDashboard);
    }

    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    @Import(name="height")
    private @Nullable Output<Integer> height;

    /**
     * @return (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    public Optional<Output<Integer>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The ID of the widget.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the widget.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    @Import(name="ignoreTimeRange")
    private @Nullable Output<Boolean> ignoreTimeRange;

    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    public Optional<Output<Boolean>> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }

    /**
     * (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
     * 
     */
    @Import(name="initialSorting")
    private @Nullable Output<OneDashboardPageWidgetHeatmapInitialSortingArgs> initialSorting;

    /**
     * @return (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
     * 
     */
    public Optional<Output<OneDashboardPageWidgetHeatmapInitialSortingArgs>> initialSorting() {
        return Optional.ofNullable(this.initialSorting);
    }

    /**
     * (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
     * 
     */
    @Import(name="legendEnabled")
    private @Nullable Output<Boolean> legendEnabled;

    /**
     * @return (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> legendEnabled() {
        return Optional.ofNullable(this.legendEnabled);
    }

    /**
     * (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * 
     */
    @Import(name="linkedEntityGuids")
    private @Nullable Output<List<String>> linkedEntityGuids;

    /**
     * @return (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * 
     */
    public Optional<Output<List<String>>> linkedEntityGuids() {
        return Optional.ofNullable(this.linkedEntityGuids);
    }

    /**
     * (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    @Import(name="nrqlQueries", required=true)
    private Output<List<OneDashboardPageWidgetHeatmapNrqlQueryArgs>> nrqlQueries;

    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    public Output<List<OneDashboardPageWidgetHeatmapNrqlQueryArgs>> nrqlQueries() {
        return this.nrqlQueries;
    }

    /**
     * (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    @Import(name="nullValues")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapNullValueArgs>> nullValues;

    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHeatmapNullValueArgs>>> nullValues() {
        return Optional.ofNullable(this.nullValues);
    }

    /**
     * (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
     * 
     */
    @Import(name="refreshRate")
    private @Nullable Output<String> refreshRate;

    /**
     * @return (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
     * 
     */
    public Optional<Output<String>> refreshRate() {
        return Optional.ofNullable(this.refreshRate);
    }

    /**
     * (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    @Import(name="row", required=true)
    private Output<Integer> row;

    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    public Output<Integer> row() {
        return this.row;
    }

    /**
     * (Optional) A human-friendly display string for this value.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     * (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    @Import(name="units")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapUnitArgs>> units;

    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHeatmapUnitArgs>>> units() {
        return Optional.ofNullable(this.units);
    }

    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    @Import(name="width")
    private @Nullable Output<Integer> width;

    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    public Optional<Output<Integer>> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="yAxisLeftMax")
    private @Nullable Output<Double> yAxisLeftMax;

    public Optional<Output<Double>> yAxisLeftMax() {
        return Optional.ofNullable(this.yAxisLeftMax);
    }

    /**
     * , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
     * 
     */
    @Import(name="yAxisLeftMin")
    private @Nullable Output<Double> yAxisLeftMin;

    /**
     * @return , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
     * 
     */
    public Optional<Output<Double>> yAxisLeftMin() {
        return Optional.ofNullable(this.yAxisLeftMin);
    }

    private OneDashboardPageWidgetHeatmapArgs() {}

    private OneDashboardPageWidgetHeatmapArgs(OneDashboardPageWidgetHeatmapArgs $) {
        this.colors = $.colors;
        this.column = $.column;
        this.dataFormats = $.dataFormats;
        this.facetShowOtherSeries = $.facetShowOtherSeries;
        this.filterCurrentDashboard = $.filterCurrentDashboard;
        this.height = $.height;
        this.id = $.id;
        this.ignoreTimeRange = $.ignoreTimeRange;
        this.initialSorting = $.initialSorting;
        this.legendEnabled = $.legendEnabled;
        this.linkedEntityGuids = $.linkedEntityGuids;
        this.nrqlQueries = $.nrqlQueries;
        this.nullValues = $.nullValues;
        this.refreshRate = $.refreshRate;
        this.row = $.row;
        this.title = $.title;
        this.units = $.units;
        this.width = $.width;
        this.yAxisLeftMax = $.yAxisLeftMax;
        this.yAxisLeftMin = $.yAxisLeftMin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetHeatmapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetHeatmapArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetHeatmapArgs();
        }

        public Builder(OneDashboardPageWidgetHeatmapArgs defaults) {
            $ = new OneDashboardPageWidgetHeatmapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(@Nullable Output<List<OneDashboardPageWidgetHeatmapColorArgs>> colors) {
            $.colors = colors;
            return this;
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(List<OneDashboardPageWidgetHeatmapColorArgs> colors) {
            return colors(Output.of(colors));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(OneDashboardPageWidgetHeatmapColorArgs... colors) {
            return colors(List.of(colors));
        }

        /**
         * @param column (Required) Column position of widget from top left, starting at `1`.
         * 
         * @return builder
         * 
         */
        public Builder column(Output<Integer> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column (Required) Column position of widget from top left, starting at `1`.
         * 
         * @return builder
         * 
         */
        public Builder column(Integer column) {
            return column(Output.of(column));
        }

        /**
         * @param dataFormats (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dataFormats(@Nullable Output<List<OneDashboardPageWidgetHeatmapDataFormatArgs>> dataFormats) {
            $.dataFormats = dataFormats;
            return this;
        }

        /**
         * @param dataFormats (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dataFormats(List<OneDashboardPageWidgetHeatmapDataFormatArgs> dataFormats) {
            return dataFormats(Output.of(dataFormats));
        }

        /**
         * @param dataFormats (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder dataFormats(OneDashboardPageWidgetHeatmapDataFormatArgs... dataFormats) {
            return dataFormats(List.of(dataFormats));
        }

        /**
         * @param facetShowOtherSeries (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder facetShowOtherSeries(@Nullable Output<Boolean> facetShowOtherSeries) {
            $.facetShowOtherSeries = facetShowOtherSeries;
            return this;
        }

        /**
         * @param facetShowOtherSeries (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder facetShowOtherSeries(Boolean facetShowOtherSeries) {
            return facetShowOtherSeries(Output.of(facetShowOtherSeries));
        }

        /**
         * @param filterCurrentDashboard (Optional) Use this item to filter the current dashboard.
         * 
         * @return builder
         * 
         */
        public Builder filterCurrentDashboard(@Nullable Output<Boolean> filterCurrentDashboard) {
            $.filterCurrentDashboard = filterCurrentDashboard;
            return this;
        }

        /**
         * @param filterCurrentDashboard (Optional) Use this item to filter the current dashboard.
         * 
         * @return builder
         * 
         */
        public Builder filterCurrentDashboard(Boolean filterCurrentDashboard) {
            return filterCurrentDashboard(Output.of(filterCurrentDashboard));
        }

        /**
         * @param height (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<Integer> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder height(Integer height) {
            return height(Output.of(height));
        }

        /**
         * @param id The ID of the widget.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the widget.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(@Nullable Output<Boolean> ignoreTimeRange) {
            $.ignoreTimeRange = ignoreTimeRange;
            return this;
        }

        /**
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(Boolean ignoreTimeRange) {
            return ignoreTimeRange(Output.of(ignoreTimeRange));
        }

        /**
         * @param initialSorting (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
         * 
         * @return builder
         * 
         */
        public Builder initialSorting(@Nullable Output<OneDashboardPageWidgetHeatmapInitialSortingArgs> initialSorting) {
            $.initialSorting = initialSorting;
            return this;
        }

        /**
         * @param initialSorting (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
         * 
         * @return builder
         * 
         */
        public Builder initialSorting(OneDashboardPageWidgetHeatmapInitialSortingArgs initialSorting) {
            return initialSorting(Output.of(initialSorting));
        }

        /**
         * @param legendEnabled (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder legendEnabled(@Nullable Output<Boolean> legendEnabled) {
            $.legendEnabled = legendEnabled;
            return this;
        }

        /**
         * @param legendEnabled (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder legendEnabled(Boolean legendEnabled) {
            return legendEnabled(Output.of(legendEnabled));
        }

        /**
         * @param linkedEntityGuids (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * 
         * @return builder
         * 
         */
        public Builder linkedEntityGuids(@Nullable Output<List<String>> linkedEntityGuids) {
            $.linkedEntityGuids = linkedEntityGuids;
            return this;
        }

        /**
         * @param linkedEntityGuids (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * 
         * @return builder
         * 
         */
        public Builder linkedEntityGuids(List<String> linkedEntityGuids) {
            return linkedEntityGuids(Output.of(linkedEntityGuids));
        }

        /**
         * @param linkedEntityGuids (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * 
         * @return builder
         * 
         */
        public Builder linkedEntityGuids(String... linkedEntityGuids) {
            return linkedEntityGuids(List.of(linkedEntityGuids));
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(Output<List<OneDashboardPageWidgetHeatmapNrqlQueryArgs>> nrqlQueries) {
            $.nrqlQueries = nrqlQueries;
            return this;
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(List<OneDashboardPageWidgetHeatmapNrqlQueryArgs> nrqlQueries) {
            return nrqlQueries(Output.of(nrqlQueries));
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(OneDashboardPageWidgetHeatmapNrqlQueryArgs... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(@Nullable Output<List<OneDashboardPageWidgetHeatmapNullValueArgs>> nullValues) {
            $.nullValues = nullValues;
            return this;
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(List<OneDashboardPageWidgetHeatmapNullValueArgs> nullValues) {
            return nullValues(Output.of(nullValues));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(OneDashboardPageWidgetHeatmapNullValueArgs... nullValues) {
            return nullValues(List.of(nullValues));
        }

        /**
         * @param refreshRate (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
         * 
         * @return builder
         * 
         */
        public Builder refreshRate(@Nullable Output<String> refreshRate) {
            $.refreshRate = refreshRate;
            return this;
        }

        /**
         * @param refreshRate (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
         * 
         * @return builder
         * 
         */
        public Builder refreshRate(String refreshRate) {
            return refreshRate(Output.of(refreshRate));
        }

        /**
         * @param row (Required) Row position of widget from top left, starting at `1`.
         * 
         * @return builder
         * 
         */
        public Builder row(Output<Integer> row) {
            $.row = row;
            return this;
        }

        /**
         * @param row (Required) Row position of widget from top left, starting at `1`.
         * 
         * @return builder
         * 
         */
        public Builder row(Integer row) {
            return row(Output.of(row));
        }

        /**
         * @param title (Optional) A human-friendly display string for this value.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title (Optional) A human-friendly display string for this value.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(@Nullable Output<List<OneDashboardPageWidgetHeatmapUnitArgs>> units) {
            $.units = units;
            return this;
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(List<OneDashboardPageWidgetHeatmapUnitArgs> units) {
            return units(Output.of(units));
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(OneDashboardPageWidgetHeatmapUnitArgs... units) {
            return units(List.of(units));
        }

        /**
         * @param width (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<Integer> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder width(Integer width) {
            return width(Output.of(width));
        }

        public Builder yAxisLeftMax(@Nullable Output<Double> yAxisLeftMax) {
            $.yAxisLeftMax = yAxisLeftMax;
            return this;
        }

        public Builder yAxisLeftMax(Double yAxisLeftMax) {
            return yAxisLeftMax(Output.of(yAxisLeftMax));
        }

        /**
         * @param yAxisLeftMin , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
         * 
         * @return builder
         * 
         */
        public Builder yAxisLeftMin(@Nullable Output<Double> yAxisLeftMin) {
            $.yAxisLeftMin = yAxisLeftMin;
            return this;
        }

        /**
         * @param yAxisLeftMin , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
         * 
         * @return builder
         * 
         */
        public Builder yAxisLeftMin(Double yAxisLeftMin) {
            return yAxisLeftMin(Output.of(yAxisLeftMin));
        }

        public OneDashboardPageWidgetHeatmapArgs build() {
            if ($.column == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetHeatmapArgs", "column");
            }
            if ($.nrqlQueries == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetHeatmapArgs", "nrqlQueries");
            }
            if ($.row == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetHeatmapArgs", "row");
            }
            if ($.title == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetHeatmapArgs", "title");
            }
            return $;
        }
    }

}
