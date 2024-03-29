// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.AlertMutingRuleConditionCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AlertMutingRuleCondition {
    /**
     * @return The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
     * 
     */
    private List<AlertMutingRuleConditionCondition> conditions;
    /**
     * @return The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
     * 
     */
    private String operator;

    private AlertMutingRuleCondition() {}
    /**
     * @return The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
     * 
     */
    public List<AlertMutingRuleConditionCondition> conditions() {
        return this.conditions;
    }
    /**
     * @return The operator used to combine all the MutingRuleConditions within the group. Valid values are `AND`, `OR`.
     * 
     */
    public String operator() {
        return this.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertMutingRuleCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AlertMutingRuleConditionCondition> conditions;
        private String operator;
        public Builder() {}
        public Builder(AlertMutingRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.operator = defaults.operator;
        }

        @CustomType.Setter
        public Builder conditions(List<AlertMutingRuleConditionCondition> conditions) {
            if (conditions == null) {
              throw new MissingRequiredPropertyException("AlertMutingRuleCondition", "conditions");
            }
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(AlertMutingRuleConditionCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("AlertMutingRuleCondition", "operator");
            }
            this.operator = operator;
            return this;
        }
        public AlertMutingRuleCondition build() {
            final var _resultValue = new AlertMutingRuleCondition();
            _resultValue.conditions = conditions;
            _resultValue.operator = operator;
            return _resultValue;
        }
    }
}
