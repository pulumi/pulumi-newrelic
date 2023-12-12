// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHeatmapColor;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHeatmapNrqlQuery;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHeatmapNullValue;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHeatmapUnit;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetHeatmap {
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetHeatmapColor> colors;
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
     * @return (Optional) Use this item to filter the current dashboard.
     * 
     */
    private @Nullable Boolean filterCurrentDashboard;
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
     * @return (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * 
     */
    private @Nullable List<String> linkedEntityGuids;
    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    private List<OneDashboardPageWidgetHeatmapNrqlQuery> nrqlQueries;
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetHeatmapNullValue> nullValues;
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
    private @Nullable List<OneDashboardPageWidgetHeatmapUnit> units;
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

    private OneDashboardPageWidgetHeatmap() {}
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetHeatmapColor> colors() {
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
     * @return (Optional) Use this item to filter the current dashboard.
     * 
     */
    public Optional<Boolean> filterCurrentDashboard() {
        return Optional.ofNullable(this.filterCurrentDashboard);
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
     * @return (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * 
     */
    public List<String> linkedEntityGuids() {
        return this.linkedEntityGuids == null ? List.of() : this.linkedEntityGuids;
    }
    /**
     * @return (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
     * 
     */
    public List<OneDashboardPageWidgetHeatmapNrqlQuery> nrqlQueries() {
        return this.nrqlQueries;
    }
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetHeatmapNullValue> nullValues() {
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
    public List<OneDashboardPageWidgetHeatmapUnit> units() {
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

    public static Builder builder(OneDashboardPageWidgetHeatmap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetHeatmapColor> colors;
        private Integer column;
        private @Nullable Boolean facetShowOtherSeries;
        private @Nullable Boolean filterCurrentDashboard;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private @Nullable Boolean legendEnabled;
        private @Nullable List<String> linkedEntityGuids;
        private List<OneDashboardPageWidgetHeatmapNrqlQuery> nrqlQueries;
        private @Nullable List<OneDashboardPageWidgetHeatmapNullValue> nullValues;
        private Integer row;
        private String title;
        private @Nullable List<OneDashboardPageWidgetHeatmapUnit> units;
        private @Nullable Integer width;
        private @Nullable Double yAxisLeftMax;
        private @Nullable Double yAxisLeftMin;
        public Builder() {}
        public Builder(OneDashboardPageWidgetHeatmap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.column = defaults.column;
    	      this.facetShowOtherSeries = defaults.facetShowOtherSeries;
    	      this.filterCurrentDashboard = defaults.filterCurrentDashboard;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.legendEnabled = defaults.legendEnabled;
    	      this.linkedEntityGuids = defaults.linkedEntityGuids;
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
        public Builder colors(@Nullable List<OneDashboardPageWidgetHeatmapColor> colors) {
            this.colors = colors;
            return this;
        }
        public Builder colors(OneDashboardPageWidgetHeatmapColor... colors) {
            return colors(List.of(colors));
        }
        @CustomType.Setter
        public Builder column(Integer column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        @CustomType.Setter
        public Builder facetShowOtherSeries(@Nullable Boolean facetShowOtherSeries) {
            this.facetShowOtherSeries = facetShowOtherSeries;
            return this;
        }
        @CustomType.Setter
        public Builder filterCurrentDashboard(@Nullable Boolean filterCurrentDashboard) {
            this.filterCurrentDashboard = filterCurrentDashboard;
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
        public Builder linkedEntityGuids(@Nullable List<String> linkedEntityGuids) {
            this.linkedEntityGuids = linkedEntityGuids;
            return this;
        }
        public Builder linkedEntityGuids(String... linkedEntityGuids) {
            return linkedEntityGuids(List.of(linkedEntityGuids));
        }
        @CustomType.Setter
        public Builder nrqlQueries(List<OneDashboardPageWidgetHeatmapNrqlQuery> nrqlQueries) {
            this.nrqlQueries = Objects.requireNonNull(nrqlQueries);
            return this;
        }
        public Builder nrqlQueries(OneDashboardPageWidgetHeatmapNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }
        @CustomType.Setter
        public Builder nullValues(@Nullable List<OneDashboardPageWidgetHeatmapNullValue> nullValues) {
            this.nullValues = nullValues;
            return this;
        }
        public Builder nullValues(OneDashboardPageWidgetHeatmapNullValue... nullValues) {
            return nullValues(List.of(nullValues));
        }
        @CustomType.Setter
        public Builder row(Integer row) {
            this.row = Objects.requireNonNull(row);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable List<OneDashboardPageWidgetHeatmapUnit> units) {
            this.units = units;
            return this;
        }
        public Builder units(OneDashboardPageWidgetHeatmapUnit... units) {
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
        public OneDashboardPageWidgetHeatmap build() {
            final var _resultValue = new OneDashboardPageWidgetHeatmap();
            _resultValue.colors = colors;
            _resultValue.column = column;
            _resultValue.facetShowOtherSeries = facetShowOtherSeries;
            _resultValue.filterCurrentDashboard = filterCurrentDashboard;
            _resultValue.height = height;
            _resultValue.id = id;
            _resultValue.ignoreTimeRange = ignoreTimeRange;
            _resultValue.legendEnabled = legendEnabled;
            _resultValue.linkedEntityGuids = linkedEntityGuids;
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
