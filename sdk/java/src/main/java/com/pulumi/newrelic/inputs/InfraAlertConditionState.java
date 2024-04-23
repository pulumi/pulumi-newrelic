// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.InfraAlertConditionCriticalArgs;
import com.pulumi.newrelic.inputs.InfraAlertConditionWarningArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfraAlertConditionState extends com.pulumi.resources.ResourceArgs {

    public static final InfraAlertConditionState Empty = new InfraAlertConditionState();

    /**
     * The operator used to evaluate the threshold value. Valid values are above, below, and equal. Supported by the
     * infra_metric and infra_process_running condition types.
     * 
     */
    @Import(name="comparison")
    private @Nullable Output<String> comparison;

    /**
     * @return The operator used to evaluate the threshold value. Valid values are above, below, and equal. Supported by the
     * infra_metric and infra_process_running condition types.
     * 
     */
    public Optional<Output<String>> comparison() {
        return Optional.ofNullable(this.comparison);
    }

    /**
     * The timestamp the alert condition was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    /**
     * @return The timestamp the alert condition was created.
     * 
     */
    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Identifies the threshold parameters for opening a critical alert incident.
     * 
     */
    @Import(name="critical")
    private @Nullable Output<InfraAlertConditionCriticalArgs> critical;

    /**
     * @return Identifies the threshold parameters for opening a critical alert incident.
     * 
     */
    public Optional<Output<InfraAlertConditionCriticalArgs>> critical() {
        return Optional.ofNullable(this.critical);
    }

    /**
     * The description of the Infrastructure alert condition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Infrastructure alert condition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the condition is turned on or off. Valid values are true and false. Defaults to true.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the condition is turned on or off. Valid values are true and false. Defaults to true.
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
     * The metric event; for example, SystemSample or StorageSample. Supported by the infra_metric condition type.
     * 
     */
    @Import(name="event")
    private @Nullable Output<String> event;

    /**
     * @return The metric event; for example, SystemSample or StorageSample. Supported by the infra_metric condition type.
     * 
     */
    public Optional<Output<String>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * For alerts on integrations, use this instead of event. Supported by the infra_metric condition type.
     * 
     */
    @Import(name="integrationProvider")
    private @Nullable Output<String> integrationProvider;

    /**
     * @return For alerts on integrations, use this instead of event. Supported by the infra_metric condition type.
     * 
     */
    public Optional<Output<String>> integrationProvider() {
        return Optional.ofNullable(this.integrationProvider);
    }

    /**
     * The Infrastructure alert condition&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Infrastructure alert condition&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the alert policy where this condition should be used.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<Integer> policyId;

    /**
     * @return The ID of the alert policy where this condition should be used.
     * 
     */
    public Optional<Output<Integer>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Any filters applied to processes; for example: commandName = &#39;java&#39;. Supported by the infra_process_running condition
     * type.
     * 
     */
    @Import(name="processWhere")
    private @Nullable Output<String> processWhere;

    /**
     * @return Any filters applied to processes; for example: commandName = &#39;java&#39;. Supported by the infra_process_running condition
     * type.
     * 
     */
    public Optional<Output<String>> processWhere() {
        return Optional.ofNullable(this.processWhere);
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
     * The attribute name to identify the metric being targeted; for example, cpuPercent, diskFreePercent, or
     * memoryResidentSizeBytes. The underlying API will automatically populate this value for Infrastructure integrations (for
     * example diskFreePercent), so make sure to explicitly include this value to avoid diff issues. Supported by the
     * infra_metric condition type.
     * 
     */
    @Import(name="select")
    private @Nullable Output<String> select;

    /**
     * @return The attribute name to identify the metric being targeted; for example, cpuPercent, diskFreePercent, or
     * memoryResidentSizeBytes. The underlying API will automatically populate this value for Infrastructure integrations (for
     * example diskFreePercent), so make sure to explicitly include this value to avoid diff issues. Supported by the
     * infra_metric condition type.
     * 
     */
    public Optional<Output<String>> select() {
        return Optional.ofNullable(this.select);
    }

    /**
     * The type of Infrastructure alert condition. Valid values are infra_process_running, infra_metric, and
     * infra_host_not_reporting.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of Infrastructure alert condition. Valid values are infra_process_running, infra_metric, and
     * infra_host_not_reporting.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The timestamp the alert condition was last updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<Integer> updatedAt;

    /**
     * @return The timestamp the alert condition was last updated.
     * 
     */
    public Optional<Output<Integer>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Determines how much time, in hours, will pass before an incident is automatically closed. Valid values are 1, 2, 4, 8,
     * 12, 24, 48, or 72
     * 
     */
    @Import(name="violationCloseTimer")
    private @Nullable Output<Integer> violationCloseTimer;

    /**
     * @return Determines how much time, in hours, will pass before an incident is automatically closed. Valid values are 1, 2, 4, 8,
     * 12, 24, 48, or 72
     * 
     */
    public Optional<Output<Integer>> violationCloseTimer() {
        return Optional.ofNullable(this.violationCloseTimer);
    }

    /**
     * Identifies the threshold parameters for opening a warning alert incident.
     * 
     */
    @Import(name="warning")
    private @Nullable Output<InfraAlertConditionWarningArgs> warning;

    /**
     * @return Identifies the threshold parameters for opening a warning alert incident.
     * 
     */
    public Optional<Output<InfraAlertConditionWarningArgs>> warning() {
        return Optional.ofNullable(this.warning);
    }

    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: hostname LIKE &#39;%cassandra%&#39;.
     * 
     */
    @Import(name="where")
    private @Nullable Output<String> where;

    /**
     * @return If applicable, this identifies any Infrastructure host filters used; for example: hostname LIKE &#39;%cassandra%&#39;.
     * 
     */
    public Optional<Output<String>> where() {
        return Optional.ofNullable(this.where);
    }

    private InfraAlertConditionState() {}

    private InfraAlertConditionState(InfraAlertConditionState $) {
        this.comparison = $.comparison;
        this.createdAt = $.createdAt;
        this.critical = $.critical;
        this.description = $.description;
        this.enabled = $.enabled;
        this.entityGuid = $.entityGuid;
        this.event = $.event;
        this.integrationProvider = $.integrationProvider;
        this.name = $.name;
        this.policyId = $.policyId;
        this.processWhere = $.processWhere;
        this.runbookUrl = $.runbookUrl;
        this.select = $.select;
        this.type = $.type;
        this.updatedAt = $.updatedAt;
        this.violationCloseTimer = $.violationCloseTimer;
        this.warning = $.warning;
        this.where = $.where;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfraAlertConditionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfraAlertConditionState $;

        public Builder() {
            $ = new InfraAlertConditionState();
        }

        public Builder(InfraAlertConditionState defaults) {
            $ = new InfraAlertConditionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparison The operator used to evaluate the threshold value. Valid values are above, below, and equal. Supported by the
         * infra_metric and infra_process_running condition types.
         * 
         * @return builder
         * 
         */
        public Builder comparison(@Nullable Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param comparison The operator used to evaluate the threshold value. Valid values are above, below, and equal. Supported by the
         * infra_metric and infra_process_running condition types.
         * 
         * @return builder
         * 
         */
        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        /**
         * @param createdAt The timestamp the alert condition was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp the alert condition was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param critical Identifies the threshold parameters for opening a critical alert incident.
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<InfraAlertConditionCriticalArgs> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Identifies the threshold parameters for opening a critical alert incident.
         * 
         * @return builder
         * 
         */
        public Builder critical(InfraAlertConditionCriticalArgs critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param description The description of the Infrastructure alert condition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Infrastructure alert condition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether the condition is turned on or off. Valid values are true and false. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the condition is turned on or off. Valid values are true and false. Defaults to true.
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
         * @param event The metric event; for example, SystemSample or StorageSample. Supported by the infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<String> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The metric event; for example, SystemSample or StorageSample. Supported by the infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder event(String event) {
            return event(Output.of(event));
        }

        /**
         * @param integrationProvider For alerts on integrations, use this instead of event. Supported by the infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder integrationProvider(@Nullable Output<String> integrationProvider) {
            $.integrationProvider = integrationProvider;
            return this;
        }

        /**
         * @param integrationProvider For alerts on integrations, use this instead of event. Supported by the infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder integrationProvider(String integrationProvider) {
            return integrationProvider(Output.of(integrationProvider));
        }

        /**
         * @param name The Infrastructure alert condition&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Infrastructure alert condition&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId The ID of the alert policy where this condition should be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<Integer> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the alert policy where this condition should be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Integer policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param processWhere Any filters applied to processes; for example: commandName = &#39;java&#39;. Supported by the infra_process_running condition
         * type.
         * 
         * @return builder
         * 
         */
        public Builder processWhere(@Nullable Output<String> processWhere) {
            $.processWhere = processWhere;
            return this;
        }

        /**
         * @param processWhere Any filters applied to processes; for example: commandName = &#39;java&#39;. Supported by the infra_process_running condition
         * type.
         * 
         * @return builder
         * 
         */
        public Builder processWhere(String processWhere) {
            return processWhere(Output.of(processWhere));
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
         * @param select The attribute name to identify the metric being targeted; for example, cpuPercent, diskFreePercent, or
         * memoryResidentSizeBytes. The underlying API will automatically populate this value for Infrastructure integrations (for
         * example diskFreePercent), so make sure to explicitly include this value to avoid diff issues. Supported by the
         * infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder select(@Nullable Output<String> select) {
            $.select = select;
            return this;
        }

        /**
         * @param select The attribute name to identify the metric being targeted; for example, cpuPercent, diskFreePercent, or
         * memoryResidentSizeBytes. The underlying API will automatically populate this value for Infrastructure integrations (for
         * example diskFreePercent), so make sure to explicitly include this value to avoid diff issues. Supported by the
         * infra_metric condition type.
         * 
         * @return builder
         * 
         */
        public Builder select(String select) {
            return select(Output.of(select));
        }

        /**
         * @param type The type of Infrastructure alert condition. Valid values are infra_process_running, infra_metric, and
         * infra_host_not_reporting.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Infrastructure alert condition. Valid values are infra_process_running, infra_metric, and
         * infra_host_not_reporting.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updatedAt The timestamp the alert condition was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<Integer> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The timestamp the alert condition was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(Integer updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param violationCloseTimer Determines how much time, in hours, will pass before an incident is automatically closed. Valid values are 1, 2, 4, 8,
         * 12, 24, 48, or 72
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(@Nullable Output<Integer> violationCloseTimer) {
            $.violationCloseTimer = violationCloseTimer;
            return this;
        }

        /**
         * @param violationCloseTimer Determines how much time, in hours, will pass before an incident is automatically closed. Valid values are 1, 2, 4, 8,
         * 12, 24, 48, or 72
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(Integer violationCloseTimer) {
            return violationCloseTimer(Output.of(violationCloseTimer));
        }

        /**
         * @param warning Identifies the threshold parameters for opening a warning alert incident.
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<InfraAlertConditionWarningArgs> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning Identifies the threshold parameters for opening a warning alert incident.
         * 
         * @return builder
         * 
         */
        public Builder warning(InfraAlertConditionWarningArgs warning) {
            return warning(Output.of(warning));
        }

        /**
         * @param where If applicable, this identifies any Infrastructure host filters used; for example: hostname LIKE &#39;%cassandra%&#39;.
         * 
         * @return builder
         * 
         */
        public Builder where(@Nullable Output<String> where) {
            $.where = where;
            return this;
        }

        /**
         * @param where If applicable, this identifies any Infrastructure host filters used; for example: hostname LIKE &#39;%cassandra%&#39;.
         * 
         * @return builder
         * 
         */
        public Builder where(String where) {
            return where(Output.of(where));
        }

        public InfraAlertConditionState build() {
            return $;
        }
    }

}
