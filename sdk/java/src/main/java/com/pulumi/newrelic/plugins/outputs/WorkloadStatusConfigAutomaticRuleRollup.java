// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadStatusConfigAutomaticRuleRollup {
    /**
     * @return The rollup strategy that is applied to a group of entities.
     * 
     */
    private String strategy;
    /**
     * @return Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
     * 
     */
    private @Nullable String thresholdType;
    /**
     * @return Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
     * 
     */
    private @Nullable Integer thresholdValue;

    private WorkloadStatusConfigAutomaticRuleRollup() {}
    /**
     * @return The rollup strategy that is applied to a group of entities.
     * 
     */
    public String strategy() {
        return this.strategy;
    }
    /**
     * @return Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
     * 
     */
    public Optional<String> thresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }
    /**
     * @return Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
     * 
     */
    public Optional<Integer> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadStatusConfigAutomaticRuleRollup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String strategy;
        private @Nullable String thresholdType;
        private @Nullable Integer thresholdValue;
        public Builder() {}
        public Builder(WorkloadStatusConfigAutomaticRuleRollup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strategy = defaults.strategy;
    	      this.thresholdType = defaults.thresholdType;
    	      this.thresholdValue = defaults.thresholdValue;
        }

        @CustomType.Setter
        public Builder strategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdType(@Nullable String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdValue(@Nullable Integer thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public WorkloadStatusConfigAutomaticRuleRollup build() {
            final var o = new WorkloadStatusConfigAutomaticRuleRollup();
            o.strategy = strategy;
            o.thresholdType = thresholdType;
            o.thresholdValue = thresholdValue;
            return o;
        }
    }
}