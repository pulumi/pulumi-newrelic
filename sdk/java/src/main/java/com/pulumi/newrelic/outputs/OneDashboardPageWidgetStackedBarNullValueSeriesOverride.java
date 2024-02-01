// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetStackedBarNullValueSeriesOverride {
    /**
     * @return Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    private @Nullable String nullValue;
    /**
     * @return Series name
     * 
     */
    private @Nullable String seriesName;

    private OneDashboardPageWidgetStackedBarNullValueSeriesOverride() {}
    /**
     * @return Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    public Optional<String> nullValue() {
        return Optional.ofNullable(this.nullValue);
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

    public static Builder builder(OneDashboardPageWidgetStackedBarNullValueSeriesOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nullValue;
        private @Nullable String seriesName;
        public Builder() {}
        public Builder(OneDashboardPageWidgetStackedBarNullValueSeriesOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nullValue = defaults.nullValue;
    	      this.seriesName = defaults.seriesName;
        }

        @CustomType.Setter
        public Builder nullValue(@Nullable String nullValue) {

            this.nullValue = nullValue;
            return this;
        }
        @CustomType.Setter
        public Builder seriesName(@Nullable String seriesName) {

            this.seriesName = seriesName;
            return this;
        }
        public OneDashboardPageWidgetStackedBarNullValueSeriesOverride build() {
            final var _resultValue = new OneDashboardPageWidgetStackedBarNullValueSeriesOverride();
            _resultValue.nullValue = nullValue;
            _resultValue.seriesName = seriesName;
            return _resultValue;
        }
    }
}
