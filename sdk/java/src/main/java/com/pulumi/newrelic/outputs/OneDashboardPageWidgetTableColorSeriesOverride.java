// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetTableColorSeriesOverride {
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    private @Nullable String color;
    /**
     * @return Series name
     * 
     */
    private @Nullable String seriesName;

    private OneDashboardPageWidgetTableColorSeriesOverride() {}
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    /**
     * @return Series name
     * 
     */
    public Optional<String> seriesName() {
        return Optional.ofNullable(this.seriesName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetTableColorSeriesOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String seriesName;
        public Builder() {}
        public Builder(OneDashboardPageWidgetTableColorSeriesOverride defaults) {
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
        public OneDashboardPageWidgetTableColorSeriesOverride build() {
            final var _resultValue = new OneDashboardPageWidgetTableColorSeriesOverride();
            _resultValue.color = color;
            _resultValue.seriesName = seriesName;
            return _resultValue;
        }
    }
}
