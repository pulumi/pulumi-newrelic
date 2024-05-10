// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NrqlDropRuleState extends com.pulumi.resources.ResourceArgs {

    public static final NrqlDropRuleState Empty = new NrqlDropRuleState();

    /**
     * Account with the NRQL drop rule will be put.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account with the NRQL drop rule will be put.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The drop rule action (drop_data, drop_attributes, or drop_attributes_from_metric_aggregates).
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The drop rule action (drop_data, drop_attributes, or drop_attributes_from_metric_aggregates).
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Provides additional information about the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Provides additional information about the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Explains which data to apply the drop rule to.
     * 
     */
    @Import(name="nrql")
    private @Nullable Output<String> nrql;

    /**
     * @return Explains which data to apply the drop rule to.
     * 
     */
    public Optional<Output<String>> nrql() {
        return Optional.ofNullable(this.nrql);
    }

    /**
     * The id, uniquely identifying the rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return The id, uniquely identifying the rule.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    private NrqlDropRuleState() {}

    private NrqlDropRuleState(NrqlDropRuleState $) {
        this.accountId = $.accountId;
        this.action = $.action;
        this.description = $.description;
        this.nrql = $.nrql;
        this.ruleId = $.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NrqlDropRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NrqlDropRuleState $;

        public Builder() {
            $ = new NrqlDropRuleState();
        }

        public Builder(NrqlDropRuleState defaults) {
            $ = new NrqlDropRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account with the NRQL drop rule will be put.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account with the NRQL drop rule will be put.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param action The drop rule action (drop_data, drop_attributes, or drop_attributes_from_metric_aggregates).
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The drop rule action (drop_data, drop_attributes, or drop_attributes_from_metric_aggregates).
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description Provides additional information about the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Provides additional information about the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param nrql Explains which data to apply the drop rule to.
         * 
         * @return builder
         * 
         */
        public Builder nrql(@Nullable Output<String> nrql) {
            $.nrql = nrql;
            return this;
        }

        /**
         * @param nrql Explains which data to apply the drop rule to.
         * 
         * @return builder
         * 
         */
        public Builder nrql(String nrql) {
            return nrql(Output.of(nrql));
        }

        /**
         * @param ruleId The id, uniquely identifying the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId The id, uniquely identifying the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public NrqlDropRuleState build() {
            return $;
        }
    }

}
