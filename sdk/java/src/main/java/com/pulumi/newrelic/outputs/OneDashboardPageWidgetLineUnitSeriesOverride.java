// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetLineUnitSeriesOverride {
    private @Nullable String seriesName;
    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    private @Nullable String unit;

    private OneDashboardPageWidgetLineUnitSeriesOverride() {}
    public Optional<String> seriesName() {
        return Optional.ofNullable(this.seriesName);
    }
    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetLineUnitSeriesOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String seriesName;
        private @Nullable String unit;
        public Builder() {}
        public Builder(OneDashboardPageWidgetLineUnitSeriesOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seriesName = defaults.seriesName;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder seriesName(@Nullable String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public OneDashboardPageWidgetLineUnitSeriesOverride build() {
            final var o = new OneDashboardPageWidgetLineUnitSeriesOverride();
            o.seriesName = seriesName;
            o.unit = unit;
            return o;
        }
    }
}
