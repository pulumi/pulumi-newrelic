// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPyNrqlQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetPy {
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    private Integer column;
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
    private @Nullable List<String> linkedEntityGuids;
    /**
     * @return (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
     * 
     */
    private List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries;
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    private Integer row;
    /**
     * @return (Required) A title for the widget.
     * 
     */
    private String title;
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    private @Nullable Integer width;

    private OneDashboardPageWidgetPy() {}
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    public Integer column() {
        return this.column;
    }
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
    public List<String> linkedEntityGuids() {
        return this.linkedEntityGuids == null ? List.of() : this.linkedEntityGuids;
    }
    /**
     * @return (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
     * 
     */
    public List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries() {
        return this.nrqlQueries;
    }
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    public Integer row() {
        return this.row;
    }
    /**
     * @return (Required) A title for the widget.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetPy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer column;
        private @Nullable Boolean filterCurrentDashboard;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private @Nullable List<String> linkedEntityGuids;
        private List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries;
        private Integer row;
        private String title;
        private @Nullable Integer width;
        public Builder() {}
        public Builder(OneDashboardPageWidgetPy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.filterCurrentDashboard = defaults.filterCurrentDashboard;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.linkedEntityGuids = defaults.linkedEntityGuids;
    	      this.nrqlQueries = defaults.nrqlQueries;
    	      this.row = defaults.row;
    	      this.title = defaults.title;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder column(Integer column) {
            this.column = Objects.requireNonNull(column);
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
        public Builder linkedEntityGuids(@Nullable List<String> linkedEntityGuids) {
            this.linkedEntityGuids = linkedEntityGuids;
            return this;
        }
        public Builder linkedEntityGuids(String... linkedEntityGuids) {
            return linkedEntityGuids(List.of(linkedEntityGuids));
        }
        @CustomType.Setter
        public Builder nrqlQueries(List<OneDashboardPageWidgetPyNrqlQuery> nrqlQueries) {
            this.nrqlQueries = Objects.requireNonNull(nrqlQueries);
            return this;
        }
        public Builder nrqlQueries(OneDashboardPageWidgetPyNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
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
        public Builder width(@Nullable Integer width) {
            this.width = width;
            return this;
        }
        public OneDashboardPageWidgetPy build() {
            final var o = new OneDashboardPageWidgetPy();
            o.column = column;
            o.filterCurrentDashboard = filterCurrentDashboard;
            o.height = height;
            o.id = id;
            o.ignoreTimeRange = ignoreTimeRange;
            o.linkedEntityGuids = linkedEntityGuids;
            o.nrqlQueries = nrqlQueries;
            o.row = row;
            o.title = title;
            o.width = width;
            return o;
        }
    }
}
