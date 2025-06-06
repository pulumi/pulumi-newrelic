// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.NrqlAlertConditionWarningPredictionArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NrqlAlertConditionWarningArgs extends com.pulumi.resources.ResourceArgs {

    public static final NrqlAlertConditionWarningArgs Empty = new NrqlAlertConditionWarningArgs();

    /**
     * Violations will not change system health status for this term.
     * 
     */
    @Import(name="disableHealthStatusReporting")
    private @Nullable Output<Boolean> disableHealthStatusReporting;

    /**
     * @return Violations will not change system health status for this term.
     * 
     */
    public Optional<Output<Boolean>> disableHealthStatusReporting() {
        return Optional.ofNullable(this.disableHealthStatusReporting);
    }

    /**
     * In minutes, must be in the range of 1 to 120 (inclusive).
     * 
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return In minutes, must be in the range of 1 to 120 (inclusive).
     * 
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * One of (above, above_or_equals, below, below_or_equals, equals, not_equals). Defaults to &#39;equals&#39;.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return One of (above, above_or_equals, below, below_or_equals, equals, not_equals). Defaults to &#39;equals&#39;.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * BETA PREVIEW: the `prediction` field is in limited release and only enabled for preview on a per-account basis. - Use `prediction` to open alerts when your static threshold is predicted to be reached in the future. The `prediction` field is only available for static conditions.
     * 
     */
    @Import(name="prediction")
    private @Nullable Output<NrqlAlertConditionWarningPredictionArgs> prediction;

    /**
     * @return BETA PREVIEW: the `prediction` field is in limited release and only enabled for preview on a per-account basis. - Use `prediction` to open alerts when your static threshold is predicted to be reached in the future. The `prediction` field is only available for static conditions.
     * 
     */
    public Optional<Output<NrqlAlertConditionWarningPredictionArgs>> prediction() {
        return Optional.ofNullable(this.prediction);
    }

    /**
     * For baseline conditions must be in range [1, 1000].
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return For baseline conditions must be in range [1, 1000].
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * The duration, in seconds, that the threshold must violate in order to create an incident. Value must be a multiple of the &#39;aggregation_window&#39; (which has a default of 60 seconds). Value must be within 120-86400 seconds for baseline conditions, and within 60-86400 seconds for static conditions
     * 
     */
    @Import(name="thresholdDuration")
    private @Nullable Output<Integer> thresholdDuration;

    /**
     * @return The duration, in seconds, that the threshold must violate in order to create an incident. Value must be a multiple of the &#39;aggregation_window&#39; (which has a default of 60 seconds). Value must be within 120-86400 seconds for baseline conditions, and within 60-86400 seconds for static conditions
     * 
     */
    public Optional<Output<Integer>> thresholdDuration() {
        return Optional.ofNullable(this.thresholdDuration);
    }

    /**
     * The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: &#39;ALL&#39; or &#39;AT_LEAST_ONCE&#39; (case insensitive).
     * 
     */
    @Import(name="thresholdOccurrences")
    private @Nullable Output<String> thresholdOccurrences;

    /**
     * @return The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: &#39;ALL&#39; or &#39;AT_LEAST_ONCE&#39; (case insensitive).
     * 
     */
    public Optional<Output<String>> thresholdOccurrences() {
        return Optional.ofNullable(this.thresholdOccurrences);
    }

    /**
     * Valid values are: &#39;all&#39; or &#39;any&#39;
     * 
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    @Import(name="timeFunction")
    private @Nullable Output<String> timeFunction;

    /**
     * @return Valid values are: &#39;all&#39; or &#39;any&#39;
     * 
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    public Optional<Output<String>> timeFunction() {
        return Optional.ofNullable(this.timeFunction);
    }

    private NrqlAlertConditionWarningArgs() {}

    private NrqlAlertConditionWarningArgs(NrqlAlertConditionWarningArgs $) {
        this.disableHealthStatusReporting = $.disableHealthStatusReporting;
        this.duration = $.duration;
        this.operator = $.operator;
        this.prediction = $.prediction;
        this.threshold = $.threshold;
        this.thresholdDuration = $.thresholdDuration;
        this.thresholdOccurrences = $.thresholdOccurrences;
        this.timeFunction = $.timeFunction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NrqlAlertConditionWarningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NrqlAlertConditionWarningArgs $;

        public Builder() {
            $ = new NrqlAlertConditionWarningArgs();
        }

        public Builder(NrqlAlertConditionWarningArgs defaults) {
            $ = new NrqlAlertConditionWarningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableHealthStatusReporting Violations will not change system health status for this term.
         * 
         * @return builder
         * 
         */
        public Builder disableHealthStatusReporting(@Nullable Output<Boolean> disableHealthStatusReporting) {
            $.disableHealthStatusReporting = disableHealthStatusReporting;
            return this;
        }

        /**
         * @param disableHealthStatusReporting Violations will not change system health status for this term.
         * 
         * @return builder
         * 
         */
        public Builder disableHealthStatusReporting(Boolean disableHealthStatusReporting) {
            return disableHealthStatusReporting(Output.of(disableHealthStatusReporting));
        }

        /**
         * @param duration In minutes, must be in the range of 1 to 120 (inclusive).
         * 
         * @return builder
         * 
         * @deprecated
         * use `threshold_duration` attribute instead
         * 
         */
        @Deprecated /* use `threshold_duration` attribute instead */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration In minutes, must be in the range of 1 to 120 (inclusive).
         * 
         * @return builder
         * 
         * @deprecated
         * use `threshold_duration` attribute instead
         * 
         */
        @Deprecated /* use `threshold_duration` attribute instead */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param operator One of (above, above_or_equals, below, below_or_equals, equals, not_equals). Defaults to &#39;equals&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator One of (above, above_or_equals, below, below_or_equals, equals, not_equals). Defaults to &#39;equals&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param prediction BETA PREVIEW: the `prediction` field is in limited release and only enabled for preview on a per-account basis. - Use `prediction` to open alerts when your static threshold is predicted to be reached in the future. The `prediction` field is only available for static conditions.
         * 
         * @return builder
         * 
         */
        public Builder prediction(@Nullable Output<NrqlAlertConditionWarningPredictionArgs> prediction) {
            $.prediction = prediction;
            return this;
        }

        /**
         * @param prediction BETA PREVIEW: the `prediction` field is in limited release and only enabled for preview on a per-account basis. - Use `prediction` to open alerts when your static threshold is predicted to be reached in the future. The `prediction` field is only available for static conditions.
         * 
         * @return builder
         * 
         */
        public Builder prediction(NrqlAlertConditionWarningPredictionArgs prediction) {
            return prediction(Output.of(prediction));
        }

        /**
         * @param threshold For baseline conditions must be in range [1, 1000].
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold For baseline conditions must be in range [1, 1000].
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param thresholdDuration The duration, in seconds, that the threshold must violate in order to create an incident. Value must be a multiple of the &#39;aggregation_window&#39; (which has a default of 60 seconds). Value must be within 120-86400 seconds for baseline conditions, and within 60-86400 seconds for static conditions
         * 
         * @return builder
         * 
         */
        public Builder thresholdDuration(@Nullable Output<Integer> thresholdDuration) {
            $.thresholdDuration = thresholdDuration;
            return this;
        }

        /**
         * @param thresholdDuration The duration, in seconds, that the threshold must violate in order to create an incident. Value must be a multiple of the &#39;aggregation_window&#39; (which has a default of 60 seconds). Value must be within 120-86400 seconds for baseline conditions, and within 60-86400 seconds for static conditions
         * 
         * @return builder
         * 
         */
        public Builder thresholdDuration(Integer thresholdDuration) {
            return thresholdDuration(Output.of(thresholdDuration));
        }

        /**
         * @param thresholdOccurrences The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: &#39;ALL&#39; or &#39;AT_LEAST_ONCE&#39; (case insensitive).
         * 
         * @return builder
         * 
         */
        public Builder thresholdOccurrences(@Nullable Output<String> thresholdOccurrences) {
            $.thresholdOccurrences = thresholdOccurrences;
            return this;
        }

        /**
         * @param thresholdOccurrences The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: &#39;ALL&#39; or &#39;AT_LEAST_ONCE&#39; (case insensitive).
         * 
         * @return builder
         * 
         */
        public Builder thresholdOccurrences(String thresholdOccurrences) {
            return thresholdOccurrences(Output.of(thresholdOccurrences));
        }

        /**
         * @param timeFunction Valid values are: &#39;all&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         * @deprecated
         * use `threshold_occurrences` attribute instead
         * 
         */
        @Deprecated /* use `threshold_occurrences` attribute instead */
        public Builder timeFunction(@Nullable Output<String> timeFunction) {
            $.timeFunction = timeFunction;
            return this;
        }

        /**
         * @param timeFunction Valid values are: &#39;all&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         * @deprecated
         * use `threshold_occurrences` attribute instead
         * 
         */
        @Deprecated /* use `threshold_occurrences` attribute instead */
        public Builder timeFunction(String timeFunction) {
            return timeFunction(Output.of(timeFunction));
        }

        public NrqlAlertConditionWarningArgs build() {
            if ($.threshold == null) {
                throw new MissingRequiredPropertyException("NrqlAlertConditionWarningArgs", "threshold");
            }
            return $;
        }
    }

}
