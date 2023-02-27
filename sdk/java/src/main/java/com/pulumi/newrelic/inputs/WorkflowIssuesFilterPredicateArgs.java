// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkflowIssuesFilterPredicateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowIssuesFilterPredicateArgs Empty = new WorkflowIssuesFilterPredicateArgs();

    /**
     * Issue event attribute to check
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return Issue event attribute to check
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * An operator to use to compare the attribute with the provided `values`, see supported operators below
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return An operator to use to compare the attribute with the provided `values`, see supported operators below
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The `attribute` must match **any** of the values in this list
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The `attribute` must match **any** of the values in this list
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private WorkflowIssuesFilterPredicateArgs() {}

    private WorkflowIssuesFilterPredicateArgs(WorkflowIssuesFilterPredicateArgs $) {
        this.attribute = $.attribute;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowIssuesFilterPredicateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowIssuesFilterPredicateArgs $;

        public Builder() {
            $ = new WorkflowIssuesFilterPredicateArgs();
        }

        public Builder(WorkflowIssuesFilterPredicateArgs defaults) {
            $ = new WorkflowIssuesFilterPredicateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute Issue event attribute to check
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute Issue event attribute to check
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param operator An operator to use to compare the attribute with the provided `values`, see supported operators below
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator An operator to use to compare the attribute with the provided `values`, see supported operators below
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values The `attribute` must match **any** of the values in this list
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The `attribute` must match **any** of the values in this list
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The `attribute` must match **any** of the values in this list
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public WorkflowIssuesFilterPredicateArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
