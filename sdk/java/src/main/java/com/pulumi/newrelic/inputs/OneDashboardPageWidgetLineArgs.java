// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineColorArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineNrqlQueryArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineNullValueArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineThresholdArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineUnitArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineYAxisRightArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetLineArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetLineArgs Empty = new OneDashboardPageWidgetLineArgs();

    /**
     * (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    @Import(name="colors")
    private @Nullable Output<List<OneDashboardPageWidgetLineColorArgs>> colors;

    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLineColorArgs>>> colors() {
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
     * (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
     * 
     */
    @Import(name="isLabelVisible")
    private @Nullable Output<Boolean> isLabelVisible;

    /**
     * @return (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
     * 
     */
    public Optional<Output<Boolean>> isLabelVisible() {
        return Optional.ofNullable(this.isLabelVisible);
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
    private Output<List<OneDashboardPageWidgetLineNrqlQueryArgs>> nrqlQueries;

    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    public Output<List<OneDashboardPageWidgetLineNrqlQueryArgs>> nrqlQueries() {
        return this.nrqlQueries;
    }

    /**
     * (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    @Import(name="nullValues")
    private @Nullable Output<List<OneDashboardPageWidgetLineNullValueArgs>> nullValues;

    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLineNullValueArgs>>> nullValues() {
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
     * (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
     * 
     */
    @Import(name="thresholds")
    private @Nullable Output<List<OneDashboardPageWidgetLineThresholdArgs>> thresholds;

    /**
     * @return (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLineThresholdArgs>>> thresholds() {
        return Optional.ofNullable(this.thresholds);
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
    private @Nullable Output<List<OneDashboardPageWidgetLineUnitArgs>> units;

    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLineUnitArgs>>> units() {
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

    /**
     * (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
     * 
     */
    @Import(name="yAxisLeftZero")
    private @Nullable Output<Boolean> yAxisLeftZero;

    /**
     * @return (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
     * 
     */
    public Optional<Output<Boolean>> yAxisLeftZero() {
        return Optional.ofNullable(this.yAxisLeftZero);
    }

    /**
     * (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
     * 
     */
    @Import(name="yAxisRight")
    private @Nullable Output<OneDashboardPageWidgetLineYAxisRightArgs> yAxisRight;

    /**
     * @return (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
     * 
     */
    public Optional<Output<OneDashboardPageWidgetLineYAxisRightArgs>> yAxisRight() {
        return Optional.ofNullable(this.yAxisRight);
    }

    private OneDashboardPageWidgetLineArgs() {}

    private OneDashboardPageWidgetLineArgs(OneDashboardPageWidgetLineArgs $) {
        this.colors = $.colors;
        this.column = $.column;
        this.facetShowOtherSeries = $.facetShowOtherSeries;
        this.height = $.height;
        this.id = $.id;
        this.ignoreTimeRange = $.ignoreTimeRange;
        this.isLabelVisible = $.isLabelVisible;
        this.legendEnabled = $.legendEnabled;
        this.nrqlQueries = $.nrqlQueries;
        this.nullValues = $.nullValues;
        this.row = $.row;
        this.thresholds = $.thresholds;
        this.title = $.title;
        this.units = $.units;
        this.width = $.width;
        this.yAxisLeftMax = $.yAxisLeftMax;
        this.yAxisLeftMin = $.yAxisLeftMin;
        this.yAxisLeftZero = $.yAxisLeftZero;
        this.yAxisRight = $.yAxisRight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetLineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetLineArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetLineArgs();
        }

        public Builder(OneDashboardPageWidgetLineArgs defaults) {
            $ = new OneDashboardPageWidgetLineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(@Nullable Output<List<OneDashboardPageWidgetLineColorArgs>> colors) {
            $.colors = colors;
            return this;
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(List<OneDashboardPageWidgetLineColorArgs> colors) {
            return colors(Output.of(colors));
        }

        /**
         * @param colors (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder colors(OneDashboardPageWidgetLineColorArgs... colors) {
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
         * @param isLabelVisible (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isLabelVisible(@Nullable Output<Boolean> isLabelVisible) {
            $.isLabelVisible = isLabelVisible;
            return this;
        }

        /**
         * @param isLabelVisible (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isLabelVisible(Boolean isLabelVisible) {
            return isLabelVisible(Output.of(isLabelVisible));
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
        public Builder nrqlQueries(Output<List<OneDashboardPageWidgetLineNrqlQueryArgs>> nrqlQueries) {
            $.nrqlQueries = nrqlQueries;
            return this;
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(List<OneDashboardPageWidgetLineNrqlQueryArgs> nrqlQueries) {
            return nrqlQueries(Output.of(nrqlQueries));
        }

        /**
         * @param nrqlQueries (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(OneDashboardPageWidgetLineNrqlQueryArgs... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(@Nullable Output<List<OneDashboardPageWidgetLineNullValueArgs>> nullValues) {
            $.nullValues = nullValues;
            return this;
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(List<OneDashboardPageWidgetLineNullValueArgs> nullValues) {
            return nullValues(Output.of(nullValues));
        }

        /**
         * @param nullValues (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder nullValues(OneDashboardPageWidgetLineNullValueArgs... nullValues) {
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
         * @param thresholds (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
         * 
         * @return builder
         * 
         */
        public Builder thresholds(@Nullable Output<List<OneDashboardPageWidgetLineThresholdArgs>> thresholds) {
            $.thresholds = thresholds;
            return this;
        }

        /**
         * @param thresholds (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
         * 
         * @return builder
         * 
         */
        public Builder thresholds(List<OneDashboardPageWidgetLineThresholdArgs> thresholds) {
            return thresholds(Output.of(thresholds));
        }

        /**
         * @param thresholds (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
         * 
         * @return builder
         * 
         */
        public Builder thresholds(OneDashboardPageWidgetLineThresholdArgs... thresholds) {
            return thresholds(List.of(thresholds));
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
        public Builder units(@Nullable Output<List<OneDashboardPageWidgetLineUnitArgs>> units) {
            $.units = units;
            return this;
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(List<OneDashboardPageWidgetLineUnitArgs> units) {
            return units(Output.of(units));
        }

        /**
         * @param units (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder units(OneDashboardPageWidgetLineUnitArgs... units) {
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

        /**
         * @param yAxisLeftZero (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
         * 
         * @return builder
         * 
         */
        public Builder yAxisLeftZero(@Nullable Output<Boolean> yAxisLeftZero) {
            $.yAxisLeftZero = yAxisLeftZero;
            return this;
        }

        /**
         * @param yAxisLeftZero (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
         * 
         * @return builder
         * 
         */
        public Builder yAxisLeftZero(Boolean yAxisLeftZero) {
            return yAxisLeftZero(Output.of(yAxisLeftZero));
        }

        /**
         * @param yAxisRight (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder yAxisRight(@Nullable Output<OneDashboardPageWidgetLineYAxisRightArgs> yAxisRight) {
            $.yAxisRight = yAxisRight;
            return this;
        }

        /**
         * @param yAxisRight (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder yAxisRight(OneDashboardPageWidgetLineYAxisRightArgs yAxisRight) {
            return yAxisRight(Output.of(yAxisRight));
        }

        public OneDashboardPageWidgetLineArgs build() {
            if ($.column == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLineArgs", "column");
            }
            if ($.nrqlQueries == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLineArgs", "nrqlQueries");
            }
            if ($.row == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLineArgs", "row");
            }
            if ($.title == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetLineArgs", "title");
            }
            return $;
        }
    }

}
