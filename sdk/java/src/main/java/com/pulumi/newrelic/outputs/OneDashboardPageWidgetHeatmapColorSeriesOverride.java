// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetHeatmapColorSeriesOverride {
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    private @Nullable String color;
    private @Nullable String seriesName;

    private OneDashboardPageWidgetHeatmapColorSeriesOverride() {}
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> seriesName() {
        return Optional.ofNullable(this.seriesName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetHeatmapColorSeriesOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String seriesName;
        public Builder() {}
        public Builder(OneDashboardPageWidgetHeatmapColorSeriesOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.seriesName = defaults.seriesName;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {
            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder seriesName(@Nullable String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public OneDashboardPageWidgetHeatmapColorSeriesOverride build() {
            final var o = new OneDashboardPageWidgetHeatmapColorSeriesOverride();
            o.color = color;
            o.seriesName = seriesName;
            return o;
        }
    }
}
