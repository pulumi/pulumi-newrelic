// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetTableUnitSeriesOverrideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetTableUnitArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetTableUnitArgs Empty = new OneDashboardPageWidgetTableUnitArgs();

    /**
     * (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    @Import(name="seriesOverrides")
    private @Nullable Output<List<OneDashboardPageWidgetTableUnitSeriesOverrideArgs>> seriesOverrides;

    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public Optional<Output<List<OneDashboardPageWidgetTableUnitSeriesOverrideArgs>>> seriesOverrides() {
        return Optional.ofNullable(this.seriesOverrides);
    }

    /**
     * (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private OneDashboardPageWidgetTableUnitArgs() {}

    private OneDashboardPageWidgetTableUnitArgs(OneDashboardPageWidgetTableUnitArgs $) {
        this.seriesOverrides = $.seriesOverrides;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetTableUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetTableUnitArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetTableUnitArgs();
        }

        public Builder(OneDashboardPageWidgetTableUnitArgs defaults) {
            $ = new OneDashboardPageWidgetTableUnitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param seriesOverrides (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
         * 
         * @return builder
         * 
         */
        public Builder seriesOverrides(@Nullable Output<List<OneDashboardPageWidgetTableUnitSeriesOverrideArgs>> seriesOverrides) {
            $.seriesOverrides = seriesOverrides;
            return this;
        }

        /**
         * @param seriesOverrides (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
         * 
         * @return builder
         * 
         */
        public Builder seriesOverrides(List<OneDashboardPageWidgetTableUnitSeriesOverrideArgs> seriesOverrides) {
            return seriesOverrides(Output.of(seriesOverrides));
        }

        /**
         * @param seriesOverrides (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
         * 
         * @return builder
         * 
         */
        public Builder seriesOverrides(OneDashboardPageWidgetTableUnitSeriesOverrideArgs... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }

        /**
         * @param unit (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public OneDashboardPageWidgetTableUnitArgs build() {
            return $;
        }
    }

}
