// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventsToMetricsRuleState extends com.pulumi.resources.ResourceArgs {

    public static final EventsToMetricsRuleState Empty = new EventsToMetricsRuleState();

    /**
     * Account with the event and where the metrics will be put.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account with the event and where the metrics will be put.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
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
     * True means this rule is enabled. False means the rule is currently not creating metrics.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True means this rule is enabled. False means the rule is currently not creating metrics.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the rule. This must be unique within an account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule. This must be unique within an account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Explains how to create metrics from events.
     * 
     */
    @Import(name="nrql")
    private @Nullable Output<String> nrql;

    /**
     * @return Explains how to create metrics from events.
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

    private EventsToMetricsRuleState() {}

    private EventsToMetricsRuleState(EventsToMetricsRuleState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.name = $.name;
        this.nrql = $.nrql;
        this.ruleId = $.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventsToMetricsRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventsToMetricsRuleState $;

        public Builder() {
            $ = new EventsToMetricsRuleState();
        }

        public Builder(EventsToMetricsRuleState defaults) {
            $ = new EventsToMetricsRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account with the event and where the metrics will be put.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account with the event and where the metrics will be put.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
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
         * @param enabled True means this rule is enabled. False means the rule is currently not creating metrics.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True means this rule is enabled. False means the rule is currently not creating metrics.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name of the rule. This must be unique within an account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule. This must be unique within an account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nrql Explains how to create metrics from events.
         * 
         * @return builder
         * 
         */
        public Builder nrql(@Nullable Output<String> nrql) {
            $.nrql = nrql;
            return this;
        }

        /**
         * @param nrql Explains how to create metrics from events.
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

        public EventsToMetricsRuleState build() {
            return $;
        }
    }

}
