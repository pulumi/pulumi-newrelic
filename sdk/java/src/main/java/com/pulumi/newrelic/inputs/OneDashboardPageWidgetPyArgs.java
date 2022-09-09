// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetPyNrqlQueryArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetPyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetPyArgs Empty = new OneDashboardPageWidgetPyArgs();

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

    @Import(name="filterCurrentDashboard")
    private @Nullable Output<Boolean> filterCurrentDashboard;

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

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    @Import(name="ignoreTimeRange")
    private @Nullable Output<Boolean> ignoreTimeRange;

    /**
     * @return (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }

    @Import(name="linkedEntityGuids")
    private @Nullable Output<List<String>> linkedEntityGuids;

    public Optional<Output<List<String>>> linkedEntityGuids() {
        return Optional.ofNullable(this.linkedEntityGuids);
    }

    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
     * 
     */
    @Import(name="nrqlQueries", required=true)
    private Output<List<OneDashboardPageWidgetPyNrqlQueryArgs>> nrqlQueries;

    /**
     * @return (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
     * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
     * 
     */
    public Output<List<OneDashboardPageWidgetPyNrqlQueryArgs>> nrqlQueries() {
        return this.nrqlQueries;
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
     * (Required) A title for the widget.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return (Required) A title for the widget.
     * 
     */
    public Output<String> title() {
        return this.title;
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

    private OneDashboardPageWidgetPyArgs() {}

    private OneDashboardPageWidgetPyArgs(OneDashboardPageWidgetPyArgs $) {
        this.column = $.column;
        this.filterCurrentDashboard = $.filterCurrentDashboard;
        this.height = $.height;
        this.id = $.id;
        this.ignoreTimeRange = $.ignoreTimeRange;
        this.linkedEntityGuids = $.linkedEntityGuids;
        this.nrqlQueries = $.nrqlQueries;
        this.row = $.row;
        this.title = $.title;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetPyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetPyArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetPyArgs();
        }

        public Builder(OneDashboardPageWidgetPyArgs defaults) {
            $ = new OneDashboardPageWidgetPyArgs(Objects.requireNonNull(defaults));
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

        public Builder filterCurrentDashboard(@Nullable Output<Boolean> filterCurrentDashboard) {
            $.filterCurrentDashboard = filterCurrentDashboard;
            return this;
        }

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

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ignoreTimeRange (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(@Nullable Output<Boolean> ignoreTimeRange) {
            $.ignoreTimeRange = ignoreTimeRange;
            return this;
        }

        /**
         * @param ignoreTimeRange (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(Boolean ignoreTimeRange) {
            return ignoreTimeRange(Output.of(ignoreTimeRange));
        }

        public Builder linkedEntityGuids(@Nullable Output<List<String>> linkedEntityGuids) {
            $.linkedEntityGuids = linkedEntityGuids;
            return this;
        }

        public Builder linkedEntityGuids(List<String> linkedEntityGuids) {
            return linkedEntityGuids(Output.of(linkedEntityGuids));
        }

        public Builder linkedEntityGuids(String... linkedEntityGuids) {
            return linkedEntityGuids(List.of(linkedEntityGuids));
        }

        /**
         * @param nrqlQueries (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
         * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(Output<List<OneDashboardPageWidgetPyNrqlQueryArgs>> nrqlQueries) {
            $.nrqlQueries = nrqlQueries;
            return this;
        }

        /**
         * @param nrqlQueries (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
         * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(List<OneDashboardPageWidgetPyNrqlQueryArgs> nrqlQueries) {
            return nrqlQueries(Output.of(nrqlQueries));
        }

        /**
         * @param nrqlQueries (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
         * * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
         * * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(OneDashboardPageWidgetPyNrqlQueryArgs... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
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
         * @param title (Required) A title for the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title (Required) A title for the widget.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
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

        public OneDashboardPageWidgetPyArgs build() {
            $.column = Objects.requireNonNull($.column, "expected parameter 'column' to be non-null");
            $.nrqlQueries = Objects.requireNonNull($.nrqlQueries, "expected parameter 'nrqlQueries' to be non-null");
            $.row = Objects.requireNonNull($.row, "expected parameter 'row' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}