// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableColorArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableNrqlQueryArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableNullValueArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableUnitArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetLogTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetLogTableArgs Empty = new OneDashboardPageWidgetLogTableArgs();

    /**
     * (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    @Import(name="colors")
    private @Nullable Output<List<OneDashboardPageWidgetLogTableColorArgs>> colors;

    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLogTableColorArgs>>> colors() {
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
     * (Optional) An argument with a boolean value that is supported only by variables of `type` *nrql* - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    @Import(name="ignoreTimeRange")
    private @Nullable Output<Boolean> ignoreTimeRange;

    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` *nrql* - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    public Optional<Output<Boolean>> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
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
     * (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    @Import(name="nrqlQueries", required=true)
    private Output<List<OneDashboardPageWidgetLogTableNrqlQueryArgs>> nrqlQueries;

    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    public Output<List<OneDashboardPageWidgetLogTableNrqlQueryArgs>> nrqlQueries() {
        return this.nrqlQueries;
    }

    /**
     * (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    @Import(name="nullValues")
    private @Nullable Output<List<OneDashboardPageWidgetLogTableNullValueArgs>> nullValues;

    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLogTableNullValueArgs>>> nullValues() {
        return Optional.ofNullable(this.nullValues);
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
    private @Nullable Output<List<OneDashboardPageWidgetLogTableUnitArgs>> units;

    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLogTableUnitArgs>>> units() {
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

    private OneDashboardPageWidgetLogTableArgs() {}

    private OneDashboardPageWidgetLogTableArgs(OneDashboardPageWidgetLogTableArgs $) {
        this.colors = $.colors;
        this.column = $.column;
        this.facetShowOtherSeries = $.facetShowOtherSeries;
        this.height = $.height;
        this.id = $.id;
        this.ignoreTimeRange = $.ignoreTimeRange;
        this.legendEnabled = $.legendEnabled;
        this.nrqlQueries = $.nrqlQueries;
        this.nullValues = $.nullValues;
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
    public static Builder builder(OneDashboardPageWidgetLogTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetLogTableArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetLogTableArgs();
        }

        public Builder(OneDashboardPageWidgetLogTableArgs defaults) {
            $ = new OneDashboardPageWidgetLogTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(@Nullable Output<List<OneDashboardPageWidgetLogTableColorArgs>> colors) {
            $.colors = colors;
            return this;
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(List<OneDashboardPageWidgetLogTableColorArgs> colors) {
            return colors(Output.of(colors));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(OneDashboardPageWidgetLogTableColorArgs... colors) {
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
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` *nrql* - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(@Nullable Output<Boolean> ignoreTimeRange) {
            $.ignoreTimeRange = ignoreTimeRange;
            return this;
        }

        /**
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` *nrql* - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(Boolean ignoreTimeRange) {
            return ignoreTimeRange(Output.of(ignoreTimeRange));
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
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(Output<List<OneDashboardPageWidgetLogTableNrqlQueryArgs>> nrqlQueries) {
            $.nrqlQueries = nrqlQueries;
            return this;
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(List<OneDashboardPageWidgetLogTableNrqlQueryArgs> nrqlQueries) {
            return nrqlQueries(Output.of(nrqlQueries));
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(OneDashboardPageWidgetLogTableNrqlQueryArgs... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(@Nullable Output<List<OneDashboardPageWidgetLogTableNullValueArgs>> nullValues) {
            $.nullValues = nullValues;
            return this;
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(List<OneDashboardPageWidgetLogTableNullValueArgs> nullValues) {
            return nullValues(Output.of(nullValues));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(OneDashboardPageWidgetLogTableNullValueArgs... nullValues) {
            return nullValues(List.of(nullValues));
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
        public Builder units(@Nullable Output<List<OneDashboardPageWidgetLogTableUnitArgs>> units) {
            $.units = units;
            return this;
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(List<OneDashboardPageWidgetLogTableUnitArgs> units) {
            return units(Output.of(units));
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(OneDashboardPageWidgetLogTableUnitArgs... units) {
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

        public OneDashboardPageWidgetLogTableArgs build() {
            if ($.column == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLogTableArgs", "column");
            }
            if ($.nrqlQueries == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLogTableArgs", "nrqlQueries");
            }
            if ($.row == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLogTableArgs", "row");
            }
            if ($.title == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLogTableArgs", "title");
            }
            return $;
        }
    }

}
