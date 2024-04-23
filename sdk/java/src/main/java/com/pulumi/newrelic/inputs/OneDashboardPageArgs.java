// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetAreaArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBarArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBillboardArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBulletArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetFunnelArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHistogramArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetJsonArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetMarkdownArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetPyArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetStackedBarArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageArgs Empty = new OneDashboardPageArgs();

    /**
     * (Optional) Brief text describing the page.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Optional) Brief text describing the page.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * (Required) The variable identifier.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return (Required) The variable identifier.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * An area widget.
     * 
     */
    @Import(name="widgetAreas")
    private @Nullable Output<List<OneDashboardPageWidgetAreaArgs>> widgetAreas;

    /**
     * @return An area widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetAreaArgs>>> widgetAreas() {
        return Optional.ofNullable(this.widgetAreas);
    }

    /**
     * A bar widget.
     * 
     */
    @Import(name="widgetBars")
    private @Nullable Output<List<OneDashboardPageWidgetBarArgs>> widgetBars;

    /**
     * @return A bar widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetBarArgs>>> widgetBars() {
        return Optional.ofNullable(this.widgetBars);
    }

    /**
     * A billboard widget.
     * 
     */
    @Import(name="widgetBillboards")
    private @Nullable Output<List<OneDashboardPageWidgetBillboardArgs>> widgetBillboards;

    /**
     * @return A billboard widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetBillboardArgs>>> widgetBillboards() {
        return Optional.ofNullable(this.widgetBillboards);
    }

    /**
     * A bullet widget.
     * 
     */
    @Import(name="widgetBullets")
    private @Nullable Output<List<OneDashboardPageWidgetBulletArgs>> widgetBullets;

    /**
     * @return A bullet widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetBulletArgs>>> widgetBullets() {
        return Optional.ofNullable(this.widgetBullets);
    }

    /**
     * A funnel widget.
     * 
     */
    @Import(name="widgetFunnels")
    private @Nullable Output<List<OneDashboardPageWidgetFunnelArgs>> widgetFunnels;

    /**
     * @return A funnel widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetFunnelArgs>>> widgetFunnels() {
        return Optional.ofNullable(this.widgetFunnels);
    }

    /**
     * A heatmap widget.
     * 
     */
    @Import(name="widgetHeatmaps")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapArgs>> widgetHeatmaps;

    /**
     * @return A heatmap widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHeatmapArgs>>> widgetHeatmaps() {
        return Optional.ofNullable(this.widgetHeatmaps);
    }

    /**
     * A histogram widget.
     * 
     */
    @Import(name="widgetHistograms")
    private @Nullable Output<List<OneDashboardPageWidgetHistogramArgs>> widgetHistograms;

    /**
     * @return A histogram widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetHistogramArgs>>> widgetHistograms() {
        return Optional.ofNullable(this.widgetHistograms);
    }

    /**
     * A JSON widget.
     * 
     */
    @Import(name="widgetJsons")
    private @Nullable Output<List<OneDashboardPageWidgetJsonArgs>> widgetJsons;

    /**
     * @return A JSON widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetJsonArgs>>> widgetJsons() {
        return Optional.ofNullable(this.widgetJsons);
    }

    /**
     * A line widget.
     * 
     */
    @Import(name="widgetLines")
    private @Nullable Output<List<OneDashboardPageWidgetLineArgs>> widgetLines;

    /**
     * @return A line widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLineArgs>>> widgetLines() {
        return Optional.ofNullable(this.widgetLines);
    }

    /**
     * A log table widget.
     * 
     */
    @Import(name="widgetLogTables")
    private @Nullable Output<List<OneDashboardPageWidgetLogTableArgs>> widgetLogTables;

    /**
     * @return A log table widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetLogTableArgs>>> widgetLogTables() {
        return Optional.ofNullable(this.widgetLogTables);
    }

    /**
     * A markdown widget.
     * 
     */
    @Import(name="widgetMarkdowns")
    private @Nullable Output<List<OneDashboardPageWidgetMarkdownArgs>> widgetMarkdowns;

    /**
     * @return A markdown widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetMarkdownArgs>>> widgetMarkdowns() {
        return Optional.ofNullable(this.widgetMarkdowns);
    }

    /**
     * A pie widget.
     * 
     */
    @Import(name="widgetPies")
    private @Nullable Output<List<OneDashboardPageWidgetPyArgs>> widgetPies;

    /**
     * @return A pie widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetPyArgs>>> widgetPies() {
        return Optional.ofNullable(this.widgetPies);
    }

    /**
     * A stacked bar widget.
     * 
     */
    @Import(name="widgetStackedBars")
    private @Nullable Output<List<OneDashboardPageWidgetStackedBarArgs>> widgetStackedBars;

    /**
     * @return A stacked bar widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetStackedBarArgs>>> widgetStackedBars() {
        return Optional.ofNullable(this.widgetStackedBars);
    }

    /**
     * A table widget.
     * 
     */
    @Import(name="widgetTables")
    private @Nullable Output<List<OneDashboardPageWidgetTableArgs>> widgetTables;

    /**
     * @return A table widget.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetTableArgs>>> widgetTables() {
        return Optional.ofNullable(this.widgetTables);
    }

    private OneDashboardPageArgs() {}

    private OneDashboardPageArgs(OneDashboardPageArgs $) {
        this.description = $.description;
        this.guid = $.guid;
        this.name = $.name;
        this.widgetAreas = $.widgetAreas;
        this.widgetBars = $.widgetBars;
        this.widgetBillboards = $.widgetBillboards;
        this.widgetBullets = $.widgetBullets;
        this.widgetFunnels = $.widgetFunnels;
        this.widgetHeatmaps = $.widgetHeatmaps;
        this.widgetHistograms = $.widgetHistograms;
        this.widgetJsons = $.widgetJsons;
        this.widgetLines = $.widgetLines;
        this.widgetLogTables = $.widgetLogTables;
        this.widgetMarkdowns = $.widgetMarkdowns;
        this.widgetPies = $.widgetPies;
        this.widgetStackedBars = $.widgetStackedBars;
        this.widgetTables = $.widgetTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageArgs $;

        public Builder() {
            $ = new OneDashboardPageArgs();
        }

        public Builder(OneDashboardPageArgs defaults) {
            $ = new OneDashboardPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description (Optional) Brief text describing the page.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Optional) Brief text describing the page.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param name (Required) The variable identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Required) The variable identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param widgetAreas An area widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetAreas(@Nullable Output<List<OneDashboardPageWidgetAreaArgs>> widgetAreas) {
            $.widgetAreas = widgetAreas;
            return this;
        }

        /**
         * @param widgetAreas An area widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetAreas(List<OneDashboardPageWidgetAreaArgs> widgetAreas) {
            return widgetAreas(Output.of(widgetAreas));
        }

        /**
         * @param widgetAreas An area widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetAreas(OneDashboardPageWidgetAreaArgs... widgetAreas) {
            return widgetAreas(List.of(widgetAreas));
        }

        /**
         * @param widgetBars A bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBars(@Nullable Output<List<OneDashboardPageWidgetBarArgs>> widgetBars) {
            $.widgetBars = widgetBars;
            return this;
        }

        /**
         * @param widgetBars A bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBars(List<OneDashboardPageWidgetBarArgs> widgetBars) {
            return widgetBars(Output.of(widgetBars));
        }

        /**
         * @param widgetBars A bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBars(OneDashboardPageWidgetBarArgs... widgetBars) {
            return widgetBars(List.of(widgetBars));
        }

        /**
         * @param widgetBillboards A billboard widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBillboards(@Nullable Output<List<OneDashboardPageWidgetBillboardArgs>> widgetBillboards) {
            $.widgetBillboards = widgetBillboards;
            return this;
        }

        /**
         * @param widgetBillboards A billboard widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBillboards(List<OneDashboardPageWidgetBillboardArgs> widgetBillboards) {
            return widgetBillboards(Output.of(widgetBillboards));
        }

        /**
         * @param widgetBillboards A billboard widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBillboards(OneDashboardPageWidgetBillboardArgs... widgetBillboards) {
            return widgetBillboards(List.of(widgetBillboards));
        }

        /**
         * @param widgetBullets A bullet widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBullets(@Nullable Output<List<OneDashboardPageWidgetBulletArgs>> widgetBullets) {
            $.widgetBullets = widgetBullets;
            return this;
        }

        /**
         * @param widgetBullets A bullet widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBullets(List<OneDashboardPageWidgetBulletArgs> widgetBullets) {
            return widgetBullets(Output.of(widgetBullets));
        }

        /**
         * @param widgetBullets A bullet widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetBullets(OneDashboardPageWidgetBulletArgs... widgetBullets) {
            return widgetBullets(List.of(widgetBullets));
        }

        /**
         * @param widgetFunnels A funnel widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetFunnels(@Nullable Output<List<OneDashboardPageWidgetFunnelArgs>> widgetFunnels) {
            $.widgetFunnels = widgetFunnels;
            return this;
        }

        /**
         * @param widgetFunnels A funnel widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetFunnels(List<OneDashboardPageWidgetFunnelArgs> widgetFunnels) {
            return widgetFunnels(Output.of(widgetFunnels));
        }

        /**
         * @param widgetFunnels A funnel widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetFunnels(OneDashboardPageWidgetFunnelArgs... widgetFunnels) {
            return widgetFunnels(List.of(widgetFunnels));
        }

        /**
         * @param widgetHeatmaps A heatmap widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHeatmaps(@Nullable Output<List<OneDashboardPageWidgetHeatmapArgs>> widgetHeatmaps) {
            $.widgetHeatmaps = widgetHeatmaps;
            return this;
        }

        /**
         * @param widgetHeatmaps A heatmap widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHeatmaps(List<OneDashboardPageWidgetHeatmapArgs> widgetHeatmaps) {
            return widgetHeatmaps(Output.of(widgetHeatmaps));
        }

        /**
         * @param widgetHeatmaps A heatmap widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHeatmaps(OneDashboardPageWidgetHeatmapArgs... widgetHeatmaps) {
            return widgetHeatmaps(List.of(widgetHeatmaps));
        }

        /**
         * @param widgetHistograms A histogram widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHistograms(@Nullable Output<List<OneDashboardPageWidgetHistogramArgs>> widgetHistograms) {
            $.widgetHistograms = widgetHistograms;
            return this;
        }

        /**
         * @param widgetHistograms A histogram widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHistograms(List<OneDashboardPageWidgetHistogramArgs> widgetHistograms) {
            return widgetHistograms(Output.of(widgetHistograms));
        }

        /**
         * @param widgetHistograms A histogram widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetHistograms(OneDashboardPageWidgetHistogramArgs... widgetHistograms) {
            return widgetHistograms(List.of(widgetHistograms));
        }

        /**
         * @param widgetJsons A JSON widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetJsons(@Nullable Output<List<OneDashboardPageWidgetJsonArgs>> widgetJsons) {
            $.widgetJsons = widgetJsons;
            return this;
        }

        /**
         * @param widgetJsons A JSON widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetJsons(List<OneDashboardPageWidgetJsonArgs> widgetJsons) {
            return widgetJsons(Output.of(widgetJsons));
        }

        /**
         * @param widgetJsons A JSON widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetJsons(OneDashboardPageWidgetJsonArgs... widgetJsons) {
            return widgetJsons(List.of(widgetJsons));
        }

        /**
         * @param widgetLines A line widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLines(@Nullable Output<List<OneDashboardPageWidgetLineArgs>> widgetLines) {
            $.widgetLines = widgetLines;
            return this;
        }

        /**
         * @param widgetLines A line widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLines(List<OneDashboardPageWidgetLineArgs> widgetLines) {
            return widgetLines(Output.of(widgetLines));
        }

        /**
         * @param widgetLines A line widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLines(OneDashboardPageWidgetLineArgs... widgetLines) {
            return widgetLines(List.of(widgetLines));
        }

        /**
         * @param widgetLogTables A log table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLogTables(@Nullable Output<List<OneDashboardPageWidgetLogTableArgs>> widgetLogTables) {
            $.widgetLogTables = widgetLogTables;
            return this;
        }

        /**
         * @param widgetLogTables A log table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLogTables(List<OneDashboardPageWidgetLogTableArgs> widgetLogTables) {
            return widgetLogTables(Output.of(widgetLogTables));
        }

        /**
         * @param widgetLogTables A log table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetLogTables(OneDashboardPageWidgetLogTableArgs... widgetLogTables) {
            return widgetLogTables(List.of(widgetLogTables));
        }

        /**
         * @param widgetMarkdowns A markdown widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetMarkdowns(@Nullable Output<List<OneDashboardPageWidgetMarkdownArgs>> widgetMarkdowns) {
            $.widgetMarkdowns = widgetMarkdowns;
            return this;
        }

        /**
         * @param widgetMarkdowns A markdown widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetMarkdowns(List<OneDashboardPageWidgetMarkdownArgs> widgetMarkdowns) {
            return widgetMarkdowns(Output.of(widgetMarkdowns));
        }

        /**
         * @param widgetMarkdowns A markdown widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetMarkdowns(OneDashboardPageWidgetMarkdownArgs... widgetMarkdowns) {
            return widgetMarkdowns(List.of(widgetMarkdowns));
        }

        /**
         * @param widgetPies A pie widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetPies(@Nullable Output<List<OneDashboardPageWidgetPyArgs>> widgetPies) {
            $.widgetPies = widgetPies;
            return this;
        }

        /**
         * @param widgetPies A pie widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetPies(List<OneDashboardPageWidgetPyArgs> widgetPies) {
            return widgetPies(Output.of(widgetPies));
        }

        /**
         * @param widgetPies A pie widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetPies(OneDashboardPageWidgetPyArgs... widgetPies) {
            return widgetPies(List.of(widgetPies));
        }

        /**
         * @param widgetStackedBars A stacked bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetStackedBars(@Nullable Output<List<OneDashboardPageWidgetStackedBarArgs>> widgetStackedBars) {
            $.widgetStackedBars = widgetStackedBars;
            return this;
        }

        /**
         * @param widgetStackedBars A stacked bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetStackedBars(List<OneDashboardPageWidgetStackedBarArgs> widgetStackedBars) {
            return widgetStackedBars(Output.of(widgetStackedBars));
        }

        /**
         * @param widgetStackedBars A stacked bar widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetStackedBars(OneDashboardPageWidgetStackedBarArgs... widgetStackedBars) {
            return widgetStackedBars(List.of(widgetStackedBars));
        }

        /**
         * @param widgetTables A table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetTables(@Nullable Output<List<OneDashboardPageWidgetTableArgs>> widgetTables) {
            $.widgetTables = widgetTables;
            return this;
        }

        /**
         * @param widgetTables A table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetTables(List<OneDashboardPageWidgetTableArgs> widgetTables) {
            return widgetTables(Output.of(widgetTables));
        }

        /**
         * @param widgetTables A table widget.
         * 
         * @return builder
         * 
         */
        public Builder widgetTables(OneDashboardPageWidgetTableArgs... widgetTables) {
            return widgetTables(List.of(widgetTables));
        }

        public OneDashboardPageArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageArgs", "name");
            }
            return $;
        }
    }

}
