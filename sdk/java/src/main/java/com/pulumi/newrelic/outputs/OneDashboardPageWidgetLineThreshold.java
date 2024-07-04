// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetLineThreshold {
    /**
     * @return The value &#39;from&#39; which the threshold would need to be applied.
     * 
     */
    private @Nullable Integer from;
    /**
     * @return The title of the dashboard.
     * 
     */
    private @Nullable String name;
    /**
     * @return The severity of the threshold, which would affect the visual appearance of the threshold (such as its color) accordingly. The value of this attribute would need to be one of the following - `warning`, `severe`, `critical`, `success`, `unavailable` which correspond to the severity labels _Warning_, _Approaching critical_, _Critical_, _Good_, _Neutral_ in the dropdown that helps specify the severity of thresholds in table widgets in the UI, respectively.
     * 
     */
    private @Nullable String severity;
    /**
     * @return The value until which the threshold would need to be applied.
     * 
     */
    private @Nullable Integer to;

    private OneDashboardPageWidgetLineThreshold() {}
    /**
     * @return The value &#39;from&#39; which the threshold would need to be applied.
     * 
     */
    public Optional<Integer> from() {
        return Optional.ofNullable(this.from);
    }
    /**
     * @return The title of the dashboard.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The severity of the threshold, which would affect the visual appearance of the threshold (such as its color) accordingly. The value of this attribute would need to be one of the following - `warning`, `severe`, `critical`, `success`, `unavailable` which correspond to the severity labels _Warning_, _Approaching critical_, _Critical_, _Good_, _Neutral_ in the dropdown that helps specify the severity of thresholds in table widgets in the UI, respectively.
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return The value until which the threshold would need to be applied.
     * 
     */
    public Optional<Integer> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetLineThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer from;
        private @Nullable String name;
        private @Nullable String severity;
        private @Nullable Integer to;
        public Builder() {}
        public Builder(OneDashboardPageWidgetLineThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.name = defaults.name;
    	      this.severity = defaults.severity;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(@Nullable Integer from) {

            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder severity(@Nullable String severity) {

            this.severity = severity;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable Integer to) {

            this.to = to;
            return this;
        }
        public OneDashboardPageWidgetLineThreshold build() {
            final var _resultValue = new OneDashboardPageWidgetLineThreshold();
            _resultValue.from = from;
            _resultValue.name = name;
            _resultValue.severity = severity;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}