// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJsonColor;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJsonNrqlQuery;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJsonNullValue;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJsonUnit;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetJson {
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetJsonColor> colors;
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
    private @Nullable String id;
    /**
     * @return (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    private @Nullable Boolean ignoreTimeRange;
    /**
     * @return (Optional) With this turned on, the legend will be displayed. Defaults to `true`.
     * 
     */
    private @Nullable Boolean legendEnabled;
    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    private List<OneDashboardPageWidgetJsonNrqlQuery> nrqlQueries;
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetJsonNullValue> nullValues;
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    private Integer row;
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    private String title;
    /**
     * @return (Optional) A nested block that describes units on your Y axis. See Nested Units blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetJsonUnit> units;
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

    private OneDashboardPageWidgetJson() {}
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetJsonColor> colors() {
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
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    public Optional<Boolean> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
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
    public List<OneDashboardPageWidgetJsonNrqlQuery> nrqlQueries() {
        return this.nrqlQueries;
    }
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetJsonNullValue> nullValues() {
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
    public List<OneDashboardPageWidgetJsonUnit> units() {
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetJson defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetJsonColor> colors;
        private Integer column;
        private @Nullable Boolean facetShowOtherSeries;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private @Nullable Boolean legendEnabled;
        private List<OneDashboardPageWidgetJsonNrqlQuery> nrqlQueries;
        private @Nullable List<OneDashboardPageWidgetJsonNullValue> nullValues;
        private Integer row;
        private String title;
        private @Nullable List<OneDashboardPageWidgetJsonUnit> units;
        private @Nullable Integer width;
        private @Nullable Double yAxisLeftMax;
        private @Nullable Double yAxisLeftMin;
        public Builder() {}
        public Builder(OneDashboardPageWidgetJson defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.column = defaults.column;
    	      this.facetShowOtherSeries = defaults.facetShowOtherSeries;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.legendEnabled = defaults.legendEnabled;
    	      this.nrqlQueries = defaults.nrqlQueries;
    	      this.nullValues = defaults.nullValues;
    	      this.row = defaults.row;
    	      this.title = defaults.title;
    	      this.units = defaults.units;
    	      this.width = defaults.width;
    	      this.yAxisLeftMax = defaults.yAxisLeftMax;
    	      this.yAxisLeftMin = defaults.yAxisLeftMin;
        }

        @CustomType.Setter
        public Builder colors(@Nullable List<OneDashboardPageWidgetJsonColor> colors) {

            this.colors = colors;
            return this;
        }
        public Builder colors(OneDashboardPageWidgetJsonColor... colors) {
            return colors(List.of(colors));
        }
        @CustomType.Setter
        public Builder column(Integer column) {
            if (column == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJson", "column");
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
        public Builder legendEnabled(@Nullable Boolean legendEnabled) {

            this.legendEnabled = legendEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder nrqlQueries(List<OneDashboardPageWidgetJsonNrqlQuery> nrqlQueries) {
            if (nrqlQueries == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJson", "nrqlQueries");
            }
            this.nrqlQueries = nrqlQueries;
            return this;
        }
        public Builder nrqlQueries(OneDashboardPageWidgetJsonNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }
        @CustomType.Setter
        public Builder nullValues(@Nullable List<OneDashboardPageWidgetJsonNullValue> nullValues) {

            this.nullValues = nullValues;
            return this;
        }
        public Builder nullValues(OneDashboardPageWidgetJsonNullValue... nullValues) {
            return nullValues(List.of(nullValues));
        }
        @CustomType.Setter
        public Builder row(Integer row) {
            if (row == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJson", "row");
            }
            this.row = row;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJson", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable List<OneDashboardPageWidgetJsonUnit> units) {

            this.units = units;
            return this;
        }
        public Builder units(OneDashboardPageWidgetJsonUnit... units) {
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
        public OneDashboardPageWidgetJson build() {
            final var _resultValue = new OneDashboardPageWidgetJson();
            _resultValue.colors = colors;
            _resultValue.column = column;
            _resultValue.facetShowOtherSeries = facetShowOtherSeries;
            _resultValue.height = height;
            _resultValue.id = id;
            _resultValue.ignoreTimeRange = ignoreTimeRange;
            _resultValue.legendEnabled = legendEnabled;
            _resultValue.nrqlQueries = nrqlQueries;
            _resultValue.nullValues = nullValues;
            _resultValue.row = row;
            _resultValue.title = title;
            _resultValue.units = units;
            _resultValue.width = width;
            _resultValue.yAxisLeftMax = yAxisLeftMax;
            _resultValue.yAxisLeftMin = yAxisLeftMin;
            return _resultValue;
        }
    }
}
