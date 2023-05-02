// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetTableUnitSeriesOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetTableUnit {
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetTableUnitSeriesOverride> seriesOverrides;
    /**
     * @return (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
     * 
     */
    private @Nullable String unit;

    private OneDashboardPageWidgetTableUnit() {}
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public List<OneDashboardPageWidgetTableUnitSeriesOverride> seriesOverrides() {
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

    public static Builder builder(OneDashboardPageWidgetTableUnit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OneDashboardPageWidgetTableUnitSeriesOverride> seriesOverrides;
        private @Nullable String unit;
        public Builder() {}
        public Builder(OneDashboardPageWidgetTableUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seriesOverrides = defaults.seriesOverrides;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder seriesOverrides(@Nullable List<OneDashboardPageWidgetTableUnitSeriesOverride> seriesOverrides) {
            this.seriesOverrides = seriesOverrides;
            return this;
        }
        public Builder seriesOverrides(OneDashboardPageWidgetTableUnitSeriesOverride... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public OneDashboardPageWidgetTableUnit build() {
            final var o = new OneDashboardPageWidgetTableUnit();
            o.seriesOverrides = seriesOverrides;
            o.unit = unit;
            return o;
        }
    }
}