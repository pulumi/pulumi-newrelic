// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetMarkdownColorSeriesOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetMarkdownColor {
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    private @Nullable String color;
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetMarkdownColorSeriesOverride> seriesOverrides;

    private OneDashboardPageWidgetMarkdownColor() {}
    /**
     * @return (Optional) Choose a color to customize the color of your charts per series in area, bar, line, pie, and stacked bar charts. Accepted values are RGB, HEX, or HSL code.
     * 
     */
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public List<OneDashboardPageWidgetMarkdownColorSeriesOverride> seriesOverrides() {
        return this.seriesOverrides == null ? List.of() : this.seriesOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetMarkdownColor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable List<OneDashboardPageWidgetMarkdownColorSeriesOverride> seriesOverrides;
        public Builder() {}
        public Builder(OneDashboardPageWidgetMarkdownColor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.seriesOverrides = defaults.seriesOverrides;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {

            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder seriesOverrides(@Nullable List<OneDashboardPageWidgetMarkdownColorSeriesOverride> seriesOverrides) {

            this.seriesOverrides = seriesOverrides;
            return this;
        }
        public Builder seriesOverrides(OneDashboardPageWidgetMarkdownColorSeriesOverride... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }
        public OneDashboardPageWidgetMarkdownColor build() {
            final var _resultValue = new OneDashboardPageWidgetMarkdownColor();
            _resultValue.color = color;
            _resultValue.seriesOverrides = seriesOverrides;
            return _resultValue;
        }
    }
}
