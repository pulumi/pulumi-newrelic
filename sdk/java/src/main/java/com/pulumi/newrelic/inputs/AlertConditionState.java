// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.AlertConditionTermArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConditionState extends com.pulumi.resources.ResourceArgs {

    public static final AlertConditionState Empty = new AlertConditionState();

    /**
     * `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
     * 
     */
    @Import(name="conditionScope")
    private @Nullable Output<String> conditionScope;

    /**
     * @return `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
     * 
     */
    public Optional<Output<String>> conditionScope() {
        return Optional.ofNullable(this.conditionScope);
    }

    /**
     * Whether the condition is enabled or not. Defaults to true.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the condition is enabled or not. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The instance IDs associated with this condition.
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<Integer>> entities;

    /**
     * @return The instance IDs associated with this condition.
     * 
     */
    public Optional<Output<List<Integer>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    /**
     * A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
     * 
     */
    @Import(name="gcMetric")
    private @Nullable Output<String> gcMetric;

    /**
     * @return A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
     * 
     */
    public Optional<Output<String>> gcMetric() {
        return Optional.ofNullable(this.gcMetric);
    }

    /**
     * The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * The title of the condition. Must be between 1 and 64 characters, inclusive.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of the condition. Must be between 1 and 64 characters, inclusive.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the policy where this condition should be used.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<Integer> policyId;

    /**
     * @return The ID of the policy where this condition should be used.
     * 
     */
    public Optional<Output<Integer>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Runbook URL to display in notifications.
     * 
     */
    @Import(name="runbookUrl")
    private @Nullable Output<String> runbookUrl;

    /**
     * @return Runbook URL to display in notifications.
     * 
     */
    public Optional<Output<String>> runbookUrl() {
        return Optional.ofNullable(this.runbookUrl);
    }

    /**
     * A list of terms for this condition. See Terms below for details.
     * 
     */
    @Import(name="terms")
    private @Nullable Output<List<AlertConditionTermArgs>> terms;

    /**
     * @return A list of terms for this condition. See Terms below for details.
     * 
     */
    public Optional<Output<List<AlertConditionTermArgs>>> terms() {
        return Optional.ofNullable(this.terms);
    }

    /**
     * The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A custom metric to be evaluated.
     * 
     */
    @Import(name="userDefinedMetric")
    private @Nullable Output<String> userDefinedMetric;

    /**
     * @return A custom metric to be evaluated.
     * 
     */
    public Optional<Output<String>> userDefinedMetric() {
        return Optional.ofNullable(this.userDefinedMetric);
    }

    /**
     * One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
     * 
     */
    @Import(name="userDefinedValueFunction")
    private @Nullable Output<String> userDefinedValueFunction;

    /**
     * @return One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
     * 
     */
    public Optional<Output<String>> userDefinedValueFunction() {
        return Optional.ofNullable(this.userDefinedValueFunction);
    }

    /**
     * Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
     * 
     */
    @Import(name="violationCloseTimer")
    private @Nullable Output<Integer> violationCloseTimer;

    /**
     * @return Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
     * 
     */
    public Optional<Output<Integer>> violationCloseTimer() {
        return Optional.ofNullable(this.violationCloseTimer);
    }

    private AlertConditionState() {}

    private AlertConditionState(AlertConditionState $) {
        this.conditionScope = $.conditionScope;
        this.enabled = $.enabled;
        this.entities = $.entities;
        this.gcMetric = $.gcMetric;
        this.metric = $.metric;
        this.name = $.name;
        this.policyId = $.policyId;
        this.runbookUrl = $.runbookUrl;
        this.terms = $.terms;
        this.type = $.type;
        this.userDefinedMetric = $.userDefinedMetric;
        this.userDefinedValueFunction = $.userDefinedValueFunction;
        this.violationCloseTimer = $.violationCloseTimer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConditionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConditionState $;

        public Builder() {
            $ = new AlertConditionState();
        }

        public Builder(AlertConditionState defaults) {
            $ = new AlertConditionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionScope `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
         * 
         * @return builder
         * 
         */
        public Builder conditionScope(@Nullable Output<String> conditionScope) {
            $.conditionScope = conditionScope;
            return this;
        }

        /**
         * @param conditionScope `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
         * 
         * @return builder
         * 
         */
        public Builder conditionScope(String conditionScope) {
            return conditionScope(Output.of(conditionScope));
        }

        /**
         * @param enabled Whether the condition is enabled or not. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the condition is enabled or not. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entities The instance IDs associated with this condition.
         * 
         * @return builder
         * 
         */
        public Builder entities(@Nullable Output<List<Integer>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities The instance IDs associated with this condition.
         * 
         * @return builder
         * 
         */
        public Builder entities(List<Integer> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities The instance IDs associated with this condition.
         * 
         * @return builder
         * 
         */
        public Builder entities(Integer... entities) {
            return entities(List.of(entities));
        }

        /**
         * @param gcMetric A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
         * 
         * @return builder
         * 
         */
        public Builder gcMetric(@Nullable Output<String> gcMetric) {
            $.gcMetric = gcMetric;
            return this;
        }

        /**
         * @param gcMetric A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
         * 
         * @return builder
         * 
         */
        public Builder gcMetric(String gcMetric) {
            return gcMetric(Output.of(gcMetric));
        }

        /**
         * @param metric The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param name The title of the condition. Must be between 1 and 64 characters, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of the condition. Must be between 1 and 64 characters, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId The ID of the policy where this condition should be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<Integer> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the policy where this condition should be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Integer policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param runbookUrl Runbook URL to display in notifications.
         * 
         * @return builder
         * 
         */
        public Builder runbookUrl(@Nullable Output<String> runbookUrl) {
            $.runbookUrl = runbookUrl;
            return this;
        }

        /**
         * @param runbookUrl Runbook URL to display in notifications.
         * 
         * @return builder
         * 
         */
        public Builder runbookUrl(String runbookUrl) {
            return runbookUrl(Output.of(runbookUrl));
        }

        /**
         * @param terms A list of terms for this condition. See Terms below for details.
         * 
         * @return builder
         * 
         */
        public Builder terms(@Nullable Output<List<AlertConditionTermArgs>> terms) {
            $.terms = terms;
            return this;
        }

        /**
         * @param terms A list of terms for this condition. See Terms below for details.
         * 
         * @return builder
         * 
         */
        public Builder terms(List<AlertConditionTermArgs> terms) {
            return terms(Output.of(terms));
        }

        /**
         * @param terms A list of terms for this condition. See Terms below for details.
         * 
         * @return builder
         * 
         */
        public Builder terms(AlertConditionTermArgs... terms) {
            return terms(List.of(terms));
        }

        /**
         * @param type The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userDefinedMetric A custom metric to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedMetric(@Nullable Output<String> userDefinedMetric) {
            $.userDefinedMetric = userDefinedMetric;
            return this;
        }

        /**
         * @param userDefinedMetric A custom metric to be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedMetric(String userDefinedMetric) {
            return userDefinedMetric(Output.of(userDefinedMetric));
        }

        /**
         * @param userDefinedValueFunction One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedValueFunction(@Nullable Output<String> userDefinedValueFunction) {
            $.userDefinedValueFunction = userDefinedValueFunction;
            return this;
        }

        /**
         * @param userDefinedValueFunction One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedValueFunction(String userDefinedValueFunction) {
            return userDefinedValueFunction(Output.of(userDefinedValueFunction));
        }

        /**
         * @param violationCloseTimer Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(@Nullable Output<Integer> violationCloseTimer) {
            $.violationCloseTimer = violationCloseTimer;
            return this;
        }

        /**
         * @param violationCloseTimer Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(Integer violationCloseTimer) {
            return violationCloseTimer(Output.of(violationCloseTimer));
        }

        public AlertConditionState build() {
            return $;
        }
    }

}
