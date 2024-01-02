// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadStatusConfigAutomaticRuleRollupArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadStatusConfigAutomaticRuleRollupArgs Empty = new WorkloadStatusConfigAutomaticRuleRollupArgs();

    /**
     * The rollup strategy that is applied to a group of entities.
     * 
     */
    @Import(name="strategy", required=true)
    private Output<String> strategy;

    /**
     * @return The rollup strategy that is applied to a group of entities.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }

    /**
     * Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
     * 
     */
    @Import(name="thresholdType")
    private @Nullable Output<String> thresholdType;

    /**
     * @return Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
     * 
     */
    public Optional<Output<String>> thresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }

    /**
     * Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
     * 
     */
    @Import(name="thresholdValue")
    private @Nullable Output<Integer> thresholdValue;

    /**
     * @return Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
     * 
     */
    public Optional<Output<Integer>> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
    }

    private WorkloadStatusConfigAutomaticRuleRollupArgs() {}

    private WorkloadStatusConfigAutomaticRuleRollupArgs(WorkloadStatusConfigAutomaticRuleRollupArgs $) {
        this.strategy = $.strategy;
        this.thresholdType = $.thresholdType;
        this.thresholdValue = $.thresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadStatusConfigAutomaticRuleRollupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadStatusConfigAutomaticRuleRollupArgs $;

        public Builder() {
            $ = new WorkloadStatusConfigAutomaticRuleRollupArgs();
        }

        public Builder(WorkloadStatusConfigAutomaticRuleRollupArgs defaults) {
            $ = new WorkloadStatusConfigAutomaticRuleRollupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param strategy The rollup strategy that is applied to a group of entities.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy The rollup strategy that is applied to a group of entities.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param thresholdType Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
         * 
         * @return builder
         * 
         */
        public Builder thresholdType(@Nullable Output<String> thresholdType) {
            $.thresholdType = thresholdType;
            return this;
        }

        /**
         * @param thresholdType Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
         * 
         * @return builder
         * 
         */
        public Builder thresholdType(String thresholdType) {
            return thresholdType(Output.of(thresholdType));
        }

        /**
         * @param thresholdValue Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(@Nullable Output<Integer> thresholdValue) {
            $.thresholdValue = thresholdValue;
            return this;
        }

        /**
         * @param thresholdValue Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(Integer thresholdValue) {
            return thresholdValue(Output.of(thresholdValue));
        }

        public WorkloadStatusConfigAutomaticRuleRollupArgs build() {
            if ($.strategy == null) {
                throw new MissingRequiredPropertyException("WorkloadStatusConfigAutomaticRuleRollupArgs", "strategy");
            }
            return $;
        }
    }

}
