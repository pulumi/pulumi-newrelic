// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NrqlAlertConditionCritical {
    /**
     * @return **DEPRECATED:** Use `threshold_duration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
     * 
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    private @Nullable Integer duration;
    /**
     * @return Valid values are `above`, `below`, or `equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `outlier` or `baseline`, the only valid option here is `above`.
     * 
     */
    private @Nullable String operator;
    /**
     * @return The value which will trigger a violation. Must be `0` or greater.
     * 
     */
    private Double threshold;
    /**
     * @return The duration, in seconds, that the threshold must violate in order to create a violation. Value must be a multiple of the `aggregation_window` (which has a default of 60 seconds).
     * &lt;br&gt;For _baseline_ and _outlier_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
     * &lt;br&gt;For _static_ NRQL alert conditions with the `sum` value function, the value must be within 120-7200 seconds (inclusive).
     * &lt;br&gt;For _static_ NRQL alert conditions with the `single_value` value function, the value must be within 60-7200 seconds (inclusive).
     * 
     */
    private @Nullable Integer thresholdDuration;
    /**
     * @return The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `at_least_once` (case insensitive).
     * 
     */
    private @Nullable String thresholdOccurrences;
    /**
     * @return **DEPRECATED:** Use `threshold_occurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
     * 
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    private @Nullable String timeFunction;

    private NrqlAlertConditionCritical() {}
    /**
     * @return **DEPRECATED:** Use `threshold_duration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
     * 
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return Valid values are `above`, `below`, or `equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `outlier` or `baseline`, the only valid option here is `above`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The value which will trigger a violation. Must be `0` or greater.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return The duration, in seconds, that the threshold must violate in order to create a violation. Value must be a multiple of the `aggregation_window` (which has a default of 60 seconds).
     * &lt;br&gt;For _baseline_ and _outlier_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
     * &lt;br&gt;For _static_ NRQL alert conditions with the `sum` value function, the value must be within 120-7200 seconds (inclusive).
     * &lt;br&gt;For _static_ NRQL alert conditions with the `single_value` value function, the value must be within 60-7200 seconds (inclusive).
     * 
     */
    public Optional<Integer> thresholdDuration() {
        return Optional.ofNullable(this.thresholdDuration);
    }
    /**
     * @return The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `at_least_once` (case insensitive).
     * 
     */
    public Optional<String> thresholdOccurrences() {
        return Optional.ofNullable(this.thresholdOccurrences);
    }
    /**
     * @return **DEPRECATED:** Use `threshold_occurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
     * 
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    public Optional<String> timeFunction() {
        return Optional.ofNullable(this.timeFunction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NrqlAlertConditionCritical defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer duration;
        private @Nullable String operator;
        private Double threshold;
        private @Nullable Integer thresholdDuration;
        private @Nullable String thresholdOccurrences;
        private @Nullable String timeFunction;
        public Builder() {}
        public Builder(NrqlAlertConditionCritical defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdDuration = defaults.thresholdDuration;
    	      this.thresholdOccurrences = defaults.thresholdOccurrences;
    	      this.timeFunction = defaults.timeFunction;
        }

        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdDuration(@Nullable Integer thresholdDuration) {
            this.thresholdDuration = thresholdDuration;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdOccurrences(@Nullable String thresholdOccurrences) {
            this.thresholdOccurrences = thresholdOccurrences;
            return this;
        }
        @CustomType.Setter
        public Builder timeFunction(@Nullable String timeFunction) {
            this.timeFunction = timeFunction;
            return this;
        }
        public NrqlAlertConditionCritical build() {
            final var o = new NrqlAlertConditionCritical();
            o.duration = duration;
            o.operator = operator;
            o.threshold = threshold;
            o.thresholdDuration = thresholdDuration;
            o.thresholdOccurrences = thresholdOccurrences;
            o.timeFunction = timeFunction;
            return o;
        }
    }
}
