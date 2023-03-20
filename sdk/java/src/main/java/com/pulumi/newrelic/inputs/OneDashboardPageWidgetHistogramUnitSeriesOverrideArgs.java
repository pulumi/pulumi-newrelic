// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs Empty = new OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs();

    @Import(name="seriesName")
    private @Nullable Output<String> seriesName;

    public Optional<Output<String>> seriesName() {
        return Optional.ofNullable(this.seriesName);
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

    private OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs() {}

    private OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs(OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs $) {
        this.seriesName = $.seriesName;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs();
        }

        public Builder(OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs defaults) {
            $ = new OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder seriesName(@Nullable Output<String> seriesName) {
            $.seriesName = seriesName;
            return this;
        }

        public Builder seriesName(String seriesName) {
            return seriesName(Output.of(seriesName));
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

        public OneDashboardPageWidgetHistogramUnitSeriesOverrideArgs build() {
            return $;
        }
    }

}
