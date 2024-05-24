// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineColor;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineNrqlQuery;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineNullValue;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineThreshold;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineUnit;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLineYAxisRight;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetLine {
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetLineColor> colors;
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    private Integer column;
    /**
     * @return (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
     * 
     */
    private @Nullable Boolean facetShowOtherSeries;
    /**
     * @return (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    private @Nullable Integer height;
    /**
     * @return The ID of the widget.
     * 
     */
    private @Nullable String id;
    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    private @Nullable Boolean ignoreTimeRange;
    /**
     * @return (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
     * 
     */
    private @Nullable Boolean isLabelVisible;
    /**
     * @return (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
     * 
     */
    private @Nullable Boolean legendEnabled;
    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    private List<OneDashboardPageWidgetLineNrqlQuery> nrqlQueries;
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetLineNullValue> nullValues;
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    private Integer row;
    /**
     * @return (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
     * 
     */
    private @Nullable List<OneDashboardPageWidgetLineThreshold> thresholds;
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    private String title;
    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetLineUnit> units;
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    private @Nullable Integer width;
    private @Nullable Double yAxisLeftMax;
    /**
     * @return , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
     * 
     */
    private @Nullable Double yAxisLeftMin;
    /**
     * @return (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
     * 
     */
    private @Nullable Boolean yAxisLeftZero;
    /**
     * @return (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
     * 
     */
    private @Nullable OneDashboardPageWidgetLineYAxisRight yAxisRight;

    private OneDashboardPageWidgetLine() {}
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetLineColor> colors() {
        return this.colors == null ? List.of() : this.colors;
    }
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    public Integer column() {
        return this.column;
    }
    /**
     * @return (Optional) Enable or disable the Other group in visualisations. The other group is used if a facet on a query returns more than 2000 items for bar charts, pie charts, and tables. The other group aggregates the rest of the facets. Defaults to `false`
     * 
     */
    public Optional<Boolean> facetShowOtherSeries() {
        return Optional.ofNullable(this.facetShowOtherSeries);
    }
    /**
     * @return (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    public Optional<Integer> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * @return The ID of the widget.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    public Optional<Boolean> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }
    /**
     * @return (Optional) A boolean value, which when true, sets the label to be visibly displayed within thresholds. In other words, if this attribute is set to true, the _label always visible_ toggle in the _Thresholds_ section in the settings of the widget is enabled.
     * 
     */
    public Optional<Boolean> isLabelVisible() {
        return Optional.ofNullable(this.isLabelVisible);
    }
    /**
     * @return (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
     * 
     */
    public Optional<Boolean> legendEnabled() {
        return Optional.ofNullable(this.legendEnabled);
    }
    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    public List<OneDashboardPageWidgetLineNrqlQuery> nrqlQueries() {
        return this.nrqlQueries;
    }
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetLineNullValue> nullValues() {
        return this.nullValues == null ? List.of() : this.nullValues;
    }
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    public Integer row() {
        return this.row;
    }
    /**
     * @return (Optional) An attribute that helps specify multiple thresholds, each inclusive of a range of values between which the threshold would need to function, the name of the threshold and its severity. Multiple thresholds can be defined in a table widget. The `threshold` attribute requires specifying the following attributes in a nested block -
     * 
     */
    public List<OneDashboardPageWidgetLineThreshold> thresholds() {
        return this.thresholds == null ? List.of() : this.thresholds;
    }
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetLineUnit> units() {
        return this.units == null ? List.of() : this.units;
    }
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }
    public Optional<Double> yAxisLeftMax() {
        return Optional.ofNullable(this.yAxisLeftMax);
    }
    /**
     * @return , `y_axis_left_max` - (Optional) Adjust the Y axis to display the data within certain values by setting a minimum and maximum value for the axis for line charts and area charts. If no customization option is selected, dashboards automatically displays the full Y axis from 0 to the top value plus a margin.
     * 
     */
    public Optional<Double> yAxisLeftMin() {
        return Optional.ofNullable(this.yAxisLeftMin);
    }
    /**
     * @return (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_left_min` (or 0 if it is not defined) to `y_axis_left_max`. Use `y_axis_left_zero = true` with a combination of `y_axis_left_min` and `y_axis_left_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_left_zero = false` to fit the graph to scale.
     * 
     */
    public Optional<Boolean> yAxisLeftZero() {
        return Optional.ofNullable(this.yAxisLeftZero);
    }
    /**
     * @return (Optional) An attribute which helps specify the configuration of the Y-Axis displayed on the right side of the line widget. This is a nested block, which includes the following attributes:
     * 
     */
    public Optional<OneDashboardPageWidgetLineYAxisRight> yAxisRight() {
        return Optional.ofNullable(this.yAxisRight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetLine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetLineColor> colors;
        private Integer column;
        private @Nullable Boolean facetShowOtherSeries;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private @Nullable Boolean isLabelVisible;
        private @Nullable Boolean legendEnabled;
        private List<OneDashboardPageWidgetLineNrqlQuery> nrqlQueries;
        private @Nullable List<OneDashboardPageWidgetLineNullValue> nullValues;
        private Integer row;
        private @Nullable List<OneDashboardPageWidgetLineThreshold> thresholds;
        private String title;
        private @Nullable List<OneDashboardPageWidgetLineUnit> units;
        private @Nullable Integer width;
        private @Nullable Double yAxisLeftMax;
        private @Nullable Double yAxisLeftMin;
        private @Nullable Boolean yAxisLeftZero;
        private @Nullable OneDashboardPageWidgetLineYAxisRight yAxisRight;
        public Builder() {}
        public Builder(OneDashboardPageWidgetLine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.column = defaults.column;
    	      this.facetShowOtherSeries = defaults.facetShowOtherSeries;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.isLabelVisible = defaults.isLabelVisible;
    	      this.legendEnabled = defaults.legendEnabled;
    	      this.nrqlQueries = defaults.nrqlQueries;
    	      this.nullValues = defaults.nullValues;
    	      this.row = defaults.row;
    	      this.thresholds = defaults.thresholds;
    	      this.title = defaults.title;
    	      this.units = defaults.units;
    	      this.width = defaults.width;
    	      this.yAxisLeftMax = defaults.yAxisLeftMax;
    	      this.yAxisLeftMin = defaults.yAxisLeftMin;
    	      this.yAxisLeftZero = defaults.yAxisLeftZero;
    	      this.yAxisRight = defaults.yAxisRight;
        }

        @CustomType.Setter
        public Builder colors(@Nullable List<OneDashboardPageWidgetLineColor> colors) {

            this.colors = colors;
            return this;
        }
        public Builder colors(OneDashboardPageWidgetLineColor... colors) {
            return colors(List.of(colors));
        }
        @CustomType.Setter
        public Builder column(Integer column) {
            if (column == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetLine", "column");
            }
            this.column = column;
            return this;
        }
        @CustomType.Setter
        public Builder facetShowOtherSeries(@Nullable Boolean facetShowOtherSeries) {

            this.facetShowOtherSeries = facetShowOtherSeries;
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable Integer height) {

            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreTimeRange(@Nullable Boolean ignoreTimeRange) {

            this.ignoreTimeRange = ignoreTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder isLabelVisible(@Nullable Boolean isLabelVisible) {

            this.isLabelVisible = isLabelVisible;
            return this;
        }
        @CustomType.Setter
        public Builder legendEnabled(@Nullable Boolean legendEnabled) {

            this.legendEnabled = legendEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder nrqlQueries(List<OneDashboardPageWidgetLineNrqlQuery> nrqlQueries) {
            if (nrqlQueries == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetLine", "nrqlQueries");
            }
            this.nrqlQueries = nrqlQueries;
            return this;
        }
        public Builder nrqlQueries(OneDashboardPageWidgetLineNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }
        @CustomType.Setter
        public Builder nullValues(@Nullable List<OneDashboardPageWidgetLineNullValue> nullValues) {

            this.nullValues = nullValues;
            return this;
        }
        public Builder nullValues(OneDashboardPageWidgetLineNullValue... nullValues) {
            return nullValues(List.of(nullValues));
        }
        @CustomType.Setter
        public Builder row(Integer row) {
            if (row == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetLine", "row");
            }
            this.row = row;
            return this;
        }
        @CustomType.Setter
        public Builder thresholds(@Nullable List<OneDashboardPageWidgetLineThreshold> thresholds) {

            this.thresholds = thresholds;
            return this;
        }
        public Builder thresholds(OneDashboardPageWidgetLineThreshold... thresholds) {
            return thresholds(List.of(thresholds));
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetLine", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable List<OneDashboardPageWidgetLineUnit> units) {

            this.units = units;
            return this;
        }
        public Builder units(OneDashboardPageWidgetLineUnit... units) {
            return units(List.of(units));
        }
        @CustomType.Setter
        public Builder width(@Nullable Integer width) {

            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder yAxisLeftMax(@Nullable Double yAxisLeftMax) {

            this.yAxisLeftMax = yAxisLeftMax;
            return this;
        }
        @CustomType.Setter
        public Builder yAxisLeftMin(@Nullable Double yAxisLeftMin) {

            this.yAxisLeftMin = yAxisLeftMin;
            return this;
        }
        @CustomType.Setter
        public Builder yAxisLeftZero(@Nullable Boolean yAxisLeftZero) {

            this.yAxisLeftZero = yAxisLeftZero;
            return this;
        }
        @CustomType.Setter
        public Builder yAxisRight(@Nullable OneDashboardPageWidgetLineYAxisRight yAxisRight) {

            this.yAxisRight = yAxisRight;
            return this;
        }
        public OneDashboardPageWidgetLine build() {
            final var _resultValue = new OneDashboardPageWidgetLine();
            _resultValue.colors = colors;
            _resultValue.column = column;
            _resultValue.facetShowOtherSeries = facetShowOtherSeries;
            _resultValue.height = height;
            _resultValue.id = id;
            _resultValue.ignoreTimeRange = ignoreTimeRange;
            _resultValue.isLabelVisible = isLabelVisible;
            _resultValue.legendEnabled = legendEnabled;
            _resultValue.nrqlQueries = nrqlQueries;
            _resultValue.nullValues = nullValues;
            _resultValue.row = row;
            _resultValue.thresholds = thresholds;
            _resultValue.title = title;
            _resultValue.units = units;
            _resultValue.width = width;
            _resultValue.yAxisLeftMax = yAxisLeftMax;
            _resultValue.yAxisLeftMin = yAxisLeftMin;
            _resultValue.yAxisLeftZero = yAxisLeftZero;
            _resultValue.yAxisRight = yAxisRight;
            return _resultValue;
        }
    }
}
