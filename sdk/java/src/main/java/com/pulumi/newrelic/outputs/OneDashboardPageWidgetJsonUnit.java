// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJsonUnitSeriesOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetJsonUnit {
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetJsonUnitSeriesOverride> seriesOverrides;
    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    private @Nullable String unit;

    private OneDashboardPageWidgetJsonUnit() {}
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public List<OneDashboardPageWidgetJsonUnitSeriesOverride> seriesOverrides() {
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

    public static Builder builder(OneDashboardPageWidgetJsonUnit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetJsonUnitSeriesOverride> seriesOverrides;
        private @Nullable String unit;
        public Builder() {}
        public Builder(OneDashboardPageWidgetJsonUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seriesOverrides = defaults.seriesOverrides;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder seriesOverrides(@Nullable List<OneDashboardPageWidgetJsonUnitSeriesOverride> seriesOverrides) {
            this.seriesOverrides = seriesOverrides;
            return this;
        }
        public Builder seriesOverrides(OneDashboardPageWidgetJsonUnitSeriesOverride... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public OneDashboardPageWidgetJsonUnit build() {
            final var _resultValue = new OneDashboardPageWidgetJsonUnit();
            _resultValue.seriesOverrides = seriesOverrides;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}
