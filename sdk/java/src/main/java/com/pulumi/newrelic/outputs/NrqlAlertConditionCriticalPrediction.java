// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NrqlAlertConditionCriticalPrediction {
    /**
     * @return BETA PREVIEW: the `predict_by` field is in limited release and only enabled for preview on a per-account basis. - The duration, in seconds, that the prediction should look into the future.
     * 
     */
    private @Nullable Integer predictBy;
    /**
     * @return BETA PREVIEW: the `prefer_prediction_violation` field is in limited release and only enabled for preview on a per-account basis. - If a prediction incident is open when a term&#39;s static threshold is breached by the actual signal, default behavior is to close the prediction incident and open a static incident. Setting `prefer_prediction_violation` to `true` overrides this behavior leaving the prediction incident open and preventing a static incident from opening.
     * 
     */
    private @Nullable Boolean preferPredictionViolation;

    private NrqlAlertConditionCriticalPrediction() {}
    /**
     * @return BETA PREVIEW: the `predict_by` field is in limited release and only enabled for preview on a per-account basis. - The duration, in seconds, that the prediction should look into the future.
     * 
     */
    public Optional<Integer> predictBy() {
        return Optional.ofNullable(this.predictBy);
    }
    /**
     * @return BETA PREVIEW: the `prefer_prediction_violation` field is in limited release and only enabled for preview on a per-account basis. - If a prediction incident is open when a term&#39;s static threshold is breached by the actual signal, default behavior is to close the prediction incident and open a static incident. Setting `prefer_prediction_violation` to `true` overrides this behavior leaving the prediction incident open and preventing a static incident from opening.
     * 
     */
    public Optional<Boolean> preferPredictionViolation() {
        return Optional.ofNullable(this.preferPredictionViolation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NrqlAlertConditionCriticalPrediction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer predictBy;
        private @Nullable Boolean preferPredictionViolation;
        public Builder() {}
        public Builder(NrqlAlertConditionCriticalPrediction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictBy = defaults.predictBy;
    	      this.preferPredictionViolation = defaults.preferPredictionViolation;
        }

        @CustomType.Setter
        public Builder predictBy(@Nullable Integer predictBy) {

            this.predictBy = predictBy;
            return this;
        }
        @CustomType.Setter
        public Builder preferPredictionViolation(@Nullable Boolean preferPredictionViolation) {

            this.preferPredictionViolation = preferPredictionViolation;
            return this;
        }
        public NrqlAlertConditionCriticalPrediction build() {
            final var _resultValue = new NrqlAlertConditionCriticalPrediction();
            _resultValue.predictBy = predictBy;
            _resultValue.preferPredictionViolation = preferPredictionViolation;
            return _resultValue;
        }
    }
}
