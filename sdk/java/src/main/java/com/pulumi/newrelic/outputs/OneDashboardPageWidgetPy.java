// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyColor;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyDataFormat;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyInitialSorting;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyNrqlQuery;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyNullValue;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyUnit;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetPy {
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetPyColor> colors;
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    private Integer column;
    /**
     * @return (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetPyDataFormat> dataFormats;
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
     * @return (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
     * 
     */
    private @Nullable OneDashboardPageWidgetPyInitialSorting initialSorting;
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
    private List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries;
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetPyNullValue> nullValues;
    /**
     * @return (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
     * 
     */
    private @Nullable String refreshRate;
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
    private @Nullable List<OneDashboardPageWidgetPyUnit> units;
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

    private OneDashboardPageWidgetPy() {}
    /**
     * @return (Optional) A nested block that describes colors of your charts per series. See Nested Colors blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetPyColor> colors() {
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
     * @return (Optional) A nested block that describes data format. See Nested data_format blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetPyDataFormat> dataFormats() {
        return this.dataFormats == null ? List.of() : this.dataFormats;
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
     * @return (Optional) An attribute that describes the sorting mechanism for the table. This attribute requires specifying the following attributes in a nested block -
     * 
     */
    public Optional<OneDashboardPageWidgetPyInitialSorting> initialSorting() {
        return Optional.ofNullable(this.initialSorting);
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
    public List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries() {
        return this.nrqlQueries;
    }
    /**
     * @return (Optional) A nested block that describes a Null Values. See Nested Null Values blocks below for details.
     * 
     */
    public List<OneDashboardPageWidgetPyNullValue> nullValues() {
        return this.nullValues == null ? List.of() : this.nullValues;
    }
    /**
     * @return (Optional) This attribute determines the frequency for data refresh specified in milliseconds. Accepted values are `auto` for default value, `0` for no refresh, `5000` for 5 seconds, `30000` for 30 seconds, `60000` for 60 seconds, `300000` for 5 minutes, `1800000` for 30 minutes, `3600000` for 60 minute, `10800000` for 3 hours, `43200000` for 12 hours and `86400000` for 24 hours.
     * 
     */
    public Optional<String> refreshRate() {
        return Optional.ofNullable(this.refreshRate);
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
    public List<OneDashboardPageWidgetPyUnit> units() {
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

    public static Builder builder(OneDashboardPageWidgetPy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetPyColor> colors;
        private Integer column;
        private @Nullable List<OneDashboardPageWidgetPyDataFormat> dataFormats;
        private @Nullable Boolean facetShowOtherSeries;
        private @Nullable Boolean filterCurrentDashboard;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private @Nullable OneDashboardPageWidgetPyInitialSorting initialSorting;
        private @Nullable Boolean legendEnabled;
        private @Nullable List<String> linkedEntityGuids;
        private List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries;
        private @Nullable List<OneDashboardPageWidgetPyNullValue> nullValues;
        private @Nullable String refreshRate;
        private Integer row;
        private String title;
        private @Nullable List<OneDashboardPageWidgetPyUnit> units;
        private @Nullable Integer width;
        private @Nullable Double yAxisLeftMax;
        private @Nullable Double yAxisLeftMin;
        public Builder() {}
        public Builder(OneDashboardPageWidgetPy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.column = defaults.column;
    	      this.dataFormats = defaults.dataFormats;
    	      this.facetShowOtherSeries = defaults.facetShowOtherSeries;
    	      this.filterCurrentDashboard = defaults.filterCurrentDashboard;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.initialSorting = defaults.initialSorting;
    	      this.legendEnabled = defaults.legendEnabled;
    	      this.linkedEntityGuids = defaults.linkedEntityGuids;
    	      this.nrqlQueries = defaults.nrqlQueries;
    	      this.nullValues = defaults.nullValues;
    	      this.refreshRate = defaults.refreshRate;
    	      this.row = defaults.row;
    	      this.title = defaults.title;
    	      this.units = defaults.units;
    	      this.width = defaults.width;
    	      this.yAxisLeftMax = defaults.yAxisLeftMax;
    	      this.yAxisLeftMin = defaults.yAxisLeftMin;
        }

        @CustomType.Setter
        public Builder colors(@Nullable List<OneDashboardPageWidgetPyColor> colors) {

            this.colors = colors;
            return this;
        }
        public Builder colors(OneDashboardPageWidgetPyColor... colors) {
            return colors(List.of(colors));
        }
        @CustomType.Setter
        public Builder column(Integer column) {
            if (column == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetPy", "column");
            }
            this.column = column;
            return this;
        }
        @CustomType.Setter
        public Builder dataFormats(@Nullable List<OneDashboardPageWidgetPyDataFormat> dataFormats) {

            this.dataFormats = dataFormats;
            return this;
        }
        public Builder dataFormats(OneDashboardPageWidgetPyDataFormat... dataFormats) {
            return dataFormats(List.of(dataFormats));
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
        public Builder initialSorting(@Nullable OneDashboardPageWidgetPyInitialSorting initialSorting) {

            this.initialSorting = initialSorting;
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
        public Builder nrqlQueries(List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries) {
            if (nrqlQueries == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetPy", "nrqlQueries");
            }
            this.nrqlQueries = nrqlQueries;
            return this;
        }
        public Builder nrqlQueries(OneDashboardPageWidgetPyNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }
        @CustomType.Setter
        public Builder nullValues(@Nullable List<OneDashboardPageWidgetPyNullValue> nullValues) {

            this.nullValues = nullValues;
            return this;
        }
        public Builder nullValues(OneDashboardPageWidgetPyNullValue... nullValues) {
            return nullValues(List.of(nullValues));
        }
        @CustomType.Setter
        public Builder refreshRate(@Nullable String refreshRate) {

            this.refreshRate = refreshRate;
            return this;
        }
        @CustomType.Setter
        public Builder row(Integer row) {
            if (row == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetPy", "row");
            }
            this.row = row;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetPy", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable List<OneDashboardPageWidgetPyUnit> units) {

            this.units = units;
            return this;
        }
        public Builder units(OneDashboardPageWidgetPyUnit... units) {
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
        public OneDashboardPageWidgetPy build() {
            final var _resultValue = new OneDashboardPageWidgetPy();
            _resultValue.colors = colors;
            _resultValue.column = column;
            _resultValue.dataFormats = dataFormats;
            _resultValue.facetShowOtherSeries = facetShowOtherSeries;
            _resultValue.filterCurrentDashboard = filterCurrentDashboard;
            _resultValue.height = height;
            _resultValue.id = id;
            _resultValue.ignoreTimeRange = ignoreTimeRange;
            _resultValue.initialSorting = initialSorting;
            _resultValue.legendEnabled = legendEnabled;
            _resultValue.linkedEntityGuids = linkedEntityGuids;
            _resultValue.nrqlQueries = nrqlQueries;
            _resultValue.nullValues = nullValues;
            _resultValue.refreshRate = refreshRate;
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
