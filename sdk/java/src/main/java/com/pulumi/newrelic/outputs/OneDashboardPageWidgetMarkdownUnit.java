// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetMarkdownUnitSeriesOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetMarkdownUnit {
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetMarkdownUnitSeriesOverride> seriesOverrides;
    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    private @Nullable String unit;

    private OneDashboardPageWidgetMarkdownUnit() {}
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public List<OneDashboardPageWidgetMarkdownUnitSeriesOverride> seriesOverrides() {
        return this.seriesOverrides == null ? List.of() : this.seriesOverrides;
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

    public static Builder builder(OneDashboardPageWidgetMarkdownUnit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetMarkdownUnitSeriesOverride> seriesOverrides;
        private @Nullable String unit;
        public Builder() {}
        public Builder(OneDashboardPageWidgetMarkdownUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seriesOverrides = defaults.seriesOverrides;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder seriesOverrides(@Nullable List<OneDashboardPageWidgetMarkdownUnitSeriesOverride> seriesOverrides) {

            this.seriesOverrides = seriesOverrides;
            return this;
        }
        public Builder seriesOverrides(OneDashboardPageWidgetMarkdownUnitSeriesOverride... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {

            this.unit = unit;
            return this;
        }
        public OneDashboardPageWidgetMarkdownUnit build() {
            final var _resultValue = new OneDashboardPageWidgetMarkdownUnit();
            _resultValue.seriesOverrides = seriesOverrides;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}
