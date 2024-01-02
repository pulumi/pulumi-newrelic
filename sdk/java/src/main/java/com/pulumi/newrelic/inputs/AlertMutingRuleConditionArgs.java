// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.AlertMutingRuleConditionConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AlertMutingRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertMutingRuleConditionArgs Empty = new AlertMutingRuleConditionArgs();

    /**
     * The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<AlertMutingRuleConditionConditionArgs>> conditions;

    /**
     * @return The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
     * 
     */
    public Output<List<AlertMutingRuleConditionConditionArgs>> conditions() {
        return this.conditions;
    }

    /**
     * The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    private AlertMutingRuleConditionArgs() {}

    private AlertMutingRuleConditionArgs(AlertMutingRuleConditionArgs $) {
        this.conditions = $.conditions;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertMutingRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertMutingRuleConditionArgs $;

        public Builder() {
            $ = new AlertMutingRuleConditionArgs();
        }

        public Builder(AlertMutingRuleConditionArgs defaults) {
            $ = new AlertMutingRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<AlertMutingRuleConditionConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<AlertMutingRuleConditionConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder conditions(AlertMutingRuleConditionConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param operator The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public AlertMutingRuleConditionArgs build() {
            if ($.conditions == null) {
                throw new MissingRequiredPropertyException("AlertMutingRuleConditionArgs", "conditions");
            }
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("AlertMutingRuleConditionArgs", "operator");
            }
            return $;
        }
    }

}
