// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetBillboardColorSeriesOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetBillboardColorSeriesOverrideArgs Empty = new OneDashboardPageWidgetBillboardColorSeriesOverrideArgs();

    /**
     * (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    @Import(name="color")
    private @Nullable Output<String> color;

    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    @Import(name="seriesName")
    private @Nullable Output<String> seriesName;

    public Optional<Output<String>> seriesName() {
        return Optional.ofNullable(this.seriesName);
    }

    private OneDashboardPageWidgetBillboardColorSeriesOverrideArgs() {}

    private OneDashboardPageWidgetBillboardColorSeriesOverrideArgs(OneDashboardPageWidgetBillboardColorSeriesOverrideArgs $) {
        this.color = $.color;
        this.seriesName = $.seriesName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetBillboardColorSeriesOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetBillboardColorSeriesOverrideArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetBillboardColorSeriesOverrideArgs();
        }

        public Builder(OneDashboardPageWidgetBillboardColorSeriesOverrideArgs defaults) {
            $ = new OneDashboardPageWidgetBillboardColorSeriesOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param color (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
         * 
         * @return builder
         * 
         */
        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        public Builder seriesName(@Nullable Output<String> seriesName) {
            $.seriesName = seriesName;
            return this;
        }

        public Builder seriesName(String seriesName) {
            return seriesName(Output.of(seriesName));
        }

        public OneDashboardPageWidgetBillboardColorSeriesOverrideArgs build() {
            return $;
        }
    }

}
