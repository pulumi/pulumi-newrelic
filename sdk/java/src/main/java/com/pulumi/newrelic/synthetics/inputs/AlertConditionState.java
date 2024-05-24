// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConditionState extends com.pulumi.resources.ResourceArgs {

    public static final AlertConditionState Empty = new AlertConditionState();

    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Set whether to enable the alert condition. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The unique entity identifier of the condition in New Relic.
     * 
     */
    @Import(name="entityGuid")
    private @Nullable Output<String> entityGuid;

    /**
     * @return The unique entity identifier of the condition in New Relic.
     * 
     */
    public Optional<Output<String>> entityGuid() {
        return Optional.ofNullable(this.entityGuid);
    }

    /**
     * The GUID of the Synthetics monitor to be referenced in the alert condition.
     * 
     */
    @Import(name="monitorId")
    private @Nullable Output<String> monitorId;

    /**
     * @return The GUID of the Synthetics monitor to be referenced in the alert condition.
     * 
     */
    public Optional<Output<String>> monitorId() {
        return Optional.ofNullable(this.monitorId);
    }

    /**
     * The title of this condition.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of this condition.
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
    private @Nullable Output<String> policyId;

    /**
     * @return The ID of the policy where this condition should be used.
     * 
     */
    public Optional<Output<String>> policyId() {
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

    private AlertConditionState() {}

    private AlertConditionState(AlertConditionState $) {
        this.enabled = $.enabled;
        this.entityGuid = $.entityGuid;
        this.monitorId = $.monitorId;
        this.name = $.name;
        this.policyId = $.policyId;
        this.runbookUrl = $.runbookUrl;
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
         * @param enabled Set whether to enable the alert condition. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Set whether to enable the alert condition. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entityGuid The unique entity identifier of the condition in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder entityGuid(@Nullable Output<String> entityGuid) {
            $.entityGuid = entityGuid;
            return this;
        }

        /**
         * @param entityGuid The unique entity identifier of the condition in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder entityGuid(String entityGuid) {
            return entityGuid(Output.of(entityGuid));
        }

        /**
         * @param monitorId The GUID of the Synthetics monitor to be referenced in the alert condition.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(@Nullable Output<String> monitorId) {
            $.monitorId = monitorId;
            return this;
        }

        /**
         * @param monitorId The GUID of the Synthetics monitor to be referenced in the alert condition.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(String monitorId) {
            return monitorId(Output.of(monitorId));
        }

        /**
         * @param name The title of this condition.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of this condition.
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
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the policy where this condition should be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
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

        public AlertConditionState build() {
            return $;
        }
    }

}
