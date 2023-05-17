// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

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


public final class InfraAlertConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfraAlertConditionArgs Empty = new InfraAlertConditionArgs();

    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
     * 
     */
    @Import(name="comparison")
    private @Nullable Output<String> comparison;

    /**
     * @return The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
     * 
     */
    public Optional<Output<String>> comparison() {
        return Optional.ofNullable(this.comparison);
    }

    /**
     * Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     * 
     */
    @Import(name="critical")
    private @Nullable Output<InfraAlertConditionCriticalArgs> critical;

    /**
     * @return Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
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
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
     * 
     */
    @Import(name="event")
    private @Nullable Output<String> event;

    /**
     * @return The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
     * 
     */
    public Optional<Output<String>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
     * 
     */
    @Import(name="integrationProvider")
    private @Nullable Output<String> integrationProvider;

    /**
     * @return For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
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
    @Import(name="policyId", required=true)
    private Output<Integer> policyId;

    /**
     * @return The ID of the alert policy where this condition should be used.
     * 
     */
    public Output<Integer> policyId() {
        return this.policyId;
    }

    /**
     * Any filters applied to processes; for example: `commandName = &#39;java&#39;`.  Required by the `infra_process_running` condition type.
     * 
     */
    @Import(name="processWhere")
    private @Nullable Output<String> processWhere;

    /**
     * @return Any filters applied to processes; for example: `commandName = &#39;java&#39;`.  Required by the `infra_process_running` condition type.
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
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
     * 
     */
    @Import(name="select")
    private @Nullable Output<String> select;

    /**
     * @return The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
     * 
     */
    public Optional<Output<String>> select() {
        return Optional.ofNullable(this.select);
    }

    /**
     * The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    @Import(name="violationCloseTimer")
    private @Nullable Output<Integer> violationCloseTimer;

    /**
     * @return Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<Integer>> violationCloseTimer() {
        return Optional.ofNullable(this.violationCloseTimer);
    }

    /**
     * Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     * 
     */
    @Import(name="warning")
    private @Nullable Output<InfraAlertConditionWarningArgs> warning;

    /**
     * @return Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     * 
     */
    public Optional<Output<InfraAlertConditionWarningArgs>> warning() {
        return Optional.ofNullable(this.warning);
    }

    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
     * 
     */
    @Import(name="where")
    private @Nullable Output<String> where;

    /**
     * @return If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
     * 
     */
    public Optional<Output<String>> where() {
        return Optional.ofNullable(this.where);
    }

    private InfraAlertConditionArgs() {}

    private InfraAlertConditionArgs(InfraAlertConditionArgs $) {
        this.comparison = $.comparison;
        this.critical = $.critical;
        this.description = $.description;
        this.enabled = $.enabled;
        this.event = $.event;
        this.integrationProvider = $.integrationProvider;
        this.name = $.name;
        this.policyId = $.policyId;
        this.processWhere = $.processWhere;
        this.runbookUrl = $.runbookUrl;
        this.select = $.select;
        this.type = $.type;
        this.violationCloseTimer = $.violationCloseTimer;
        this.warning = $.warning;
        this.where = $.where;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfraAlertConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfraAlertConditionArgs $;

        public Builder() {
            $ = new InfraAlertConditionArgs();
        }

        public Builder(InfraAlertConditionArgs defaults) {
            $ = new InfraAlertConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparison The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
         * 
         * @return builder
         * 
         */
        public Builder comparison(@Nullable Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param comparison The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
         * 
         * @return builder
         * 
         */
        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        /**
         * @param critical Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<InfraAlertConditionCriticalArgs> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
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
         * @param enabled Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param event The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<String> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
         * 
         * @return builder
         * 
         */
        public Builder event(String event) {
            return event(Output.of(event));
        }

        /**
         * @param integrationProvider For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
         * 
         * @return builder
         * 
         */
        public Builder integrationProvider(@Nullable Output<String> integrationProvider) {
            $.integrationProvider = integrationProvider;
            return this;
        }

        /**
         * @param integrationProvider For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
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
        public Builder policyId(Output<Integer> policyId) {
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
         * @param processWhere Any filters applied to processes; for example: `commandName = &#39;java&#39;`.  Required by the `infra_process_running` condition type.
         * 
         * @return builder
         * 
         */
        public Builder processWhere(@Nullable Output<String> processWhere) {
            $.processWhere = processWhere;
            return this;
        }

        /**
         * @param processWhere Any filters applied to processes; for example: `commandName = &#39;java&#39;`.  Required by the `infra_process_running` condition type.
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
         * @param select The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
         * 
         * @return builder
         * 
         */
        public Builder select(@Nullable Output<String> select) {
            $.select = select;
            return this;
        }

        /**
         * @param select The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
         * 
         * @return builder
         * 
         */
        public Builder select(String select) {
            return select(Output.of(select));
        }

        /**
         * @param type The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param violationCloseTimer Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(@Nullable Output<Integer> violationCloseTimer) {
            $.violationCloseTimer = violationCloseTimer;
            return this;
        }

        /**
         * @param violationCloseTimer Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder violationCloseTimer(Integer violationCloseTimer) {
            return violationCloseTimer(Output.of(violationCloseTimer));
        }

        /**
         * @param warning Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<InfraAlertConditionWarningArgs> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
         * 
         * @return builder
         * 
         */
        public Builder warning(InfraAlertConditionWarningArgs warning) {
            return warning(Output.of(warning));
        }

        /**
         * @param where If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
         * 
         * @return builder
         * 
         */
        public Builder where(@Nullable Output<String> where) {
            $.where = where;
            return this;
        }

        /**
         * @param where If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
         * 
         * @return builder
         * 
         */
        public Builder where(String where) {
            return where(Output.of(where));
        }

        public InfraAlertConditionArgs build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
