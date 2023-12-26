// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.InfraAlertConditionArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.InfraAlertConditionState;
import com.pulumi.newrelic.outputs.InfraAlertConditionCritical;
import com.pulumi.newrelic.outputs.InfraAlertConditionWarning;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage Infrastructure alert conditions in New Relic.
 * 
 * &gt; **WARNING:** The `newrelic.InfraAlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.InfraAlertCondition;
 * import com.pulumi.newrelic.InfraAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.InfraAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.inputs.InfraAlertConditionWarningArgs;
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
 *         var foo = new AlertPolicy(&#34;foo&#34;);
 * 
 *         var highDiskUsage = new InfraAlertCondition(&#34;highDiskUsage&#34;, InfraAlertConditionArgs.builder()        
 *             .policyId(foo.id())
 *             .description(&#34;Warning if disk usage goes above 80% and critical alert if goes above 90%&#34;)
 *             .type(&#34;infra_metric&#34;)
 *             .event(&#34;StorageSample&#34;)
 *             .select(&#34;diskUsedPercent&#34;)
 *             .comparison(&#34;above&#34;)
 *             .where(&#34;(hostname LIKE &#39;%frontend%&#39;)&#34;)
 *             .critical(InfraAlertConditionCriticalArgs.builder()
 *                 .duration(25)
 *                 .value(90)
 *                 .timeFunction(&#34;all&#34;)
 *                 .build())
 *             .warning(InfraAlertConditionWarningArgs.builder()
 *                 .duration(10)
 *                 .value(80)
 *                 .timeFunction(&#34;all&#34;)
 *                 .build())
 *             .build());
 * 
 *         var highDbConnCount = new InfraAlertCondition(&#34;highDbConnCount&#34;, InfraAlertConditionArgs.builder()        
 *             .policyId(foo.id())
 *             .description(&#34;Critical alert when the number of database connections goes above 90&#34;)
 *             .type(&#34;infra_metric&#34;)
 *             .event(&#34;DatastoreSample&#34;)
 *             .select(&#34;provider.databaseConnections.Average&#34;)
 *             .comparison(&#34;above&#34;)
 *             .where(&#34;(hostname LIKE &#39;%db%&#39;)&#34;)
 *             .integrationProvider(&#34;RdsDbInstance&#34;)
 *             .critical(InfraAlertConditionCriticalArgs.builder()
 *                 .duration(25)
 *                 .value(90)
 *                 .timeFunction(&#34;all&#34;)
 *                 .build())
 *             .build());
 * 
 *         var processNotRunning = new InfraAlertCondition(&#34;processNotRunning&#34;, InfraAlertConditionArgs.builder()        
 *             .policyId(foo.id())
 *             .description(&#34;Critical alert when ruby isn&#39;t running&#34;)
 *             .type(&#34;infra_process_running&#34;)
 *             .comparison(&#34;equal&#34;)
 *             .where(&#34;hostname = &#39;web01&#39;&#34;)
 *             .processWhere(&#34;commandName = &#39;/usr/bin/ruby&#39;&#34;)
 *             .critical(InfraAlertConditionCriticalArgs.builder()
 *                 .duration(5)
 *                 .value(0)
 *                 .build())
 *             .build());
 * 
 *         var hostNotReporting = new InfraAlertCondition(&#34;hostNotReporting&#34;, InfraAlertConditionArgs.builder()        
 *             .policyId(foo.id())
 *             .description(&#34;Critical alert when the host is not reporting&#34;)
 *             .type(&#34;infra_host_not_reporting&#34;)
 *             .where(&#34;(hostname LIKE &#39;%frontend%&#39;)&#34;)
 *             .critical(InfraAlertConditionCriticalArgs.builder()
 *                 .duration(5)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Thresholds
 * 
 * The `critical` and `warning` threshold mapping supports the following arguments:
 * 
 *   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
 *   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by `infra_metric` and `infra_process_running` alert condition types.
 *   * `time_function` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the `infra_metric` alert condition type.
 * 
 * ## Tags
 * 
 * Manage infra alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.InfraAlertCondition;
 * import com.pulumi.newrelic.InfraAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.InfraAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.inputs.InfraAlertConditionWarningArgs;
 * import com.pulumi.newrelic.EntityTags;
 * import com.pulumi.newrelic.EntityTagsArgs;
 * import com.pulumi.newrelic.inputs.EntityTagsTagArgs;
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
 *         var fooAlertPolicy = new AlertPolicy(&#34;fooAlertPolicy&#34;);
 * 
 *         var fooInfraAlertCondition = new InfraAlertCondition(&#34;fooInfraAlertCondition&#34;, InfraAlertConditionArgs.builder()        
 *             .policyId(fooAlertPolicy.id())
 *             .description(&#34;Warning if disk usage goes above 80% and critical alert if goes above 90%&#34;)
 *             .type(&#34;infra_metric&#34;)
 *             .event(&#34;StorageSample&#34;)
 *             .select(&#34;diskUsedPercent&#34;)
 *             .comparison(&#34;above&#34;)
 *             .where(&#34;(hostname LIKE &#39;%frontend%&#39;)&#34;)
 *             .critical(InfraAlertConditionCriticalArgs.builder()
 *                 .duration(25)
 *                 .value(90)
 *                 .timeFunction(&#34;all&#34;)
 *                 .build())
 *             .warning(InfraAlertConditionWarningArgs.builder()
 *                 .duration(10)
 *                 .value(80)
 *                 .timeFunction(&#34;all&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myConditionEntityTags = new EntityTags(&#34;myConditionEntityTags&#34;, EntityTagsArgs.builder()        
 *             .guid(fooInfraAlertCondition.entityGuid())
 *             .tags(            
 *                 EntityTagsTagArgs.builder()
 *                     .key(&#34;my-key&#34;)
 *                     .values(                    
 *                         &#34;my-value&#34;,
 *                         &#34;my-other-value&#34;)
 *                     .build(),
 *                 EntityTagsTagArgs.builder()
 *                     .key(&#34;my-key-2&#34;)
 *                     .values(&#34;my-value-2&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Infrastructure alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import newrelic:index/infraAlertCondition:InfraAlertCondition main 12345:67890
 * ```
 * 
 */
@ResourceType(type="newrelic:index/infraAlertCondition:InfraAlertCondition")
public class InfraAlertCondition extends com.pulumi.resources.CustomResource {
    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
     * 
     */
    @Export(name="comparison", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comparison;

    /**
     * @return The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
     * 
     */
    public Output<Optional<String>> comparison() {
        return Codegen.optional(this.comparison);
    }
    /**
     * The timestamp the alert condition was created.
     * 
     */
    @Export(name="createdAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> createdAt;

    /**
     * @return The timestamp the alert condition was created.
     * 
     */
    public Output<Integer> createdAt() {
        return this.createdAt;
    }
    /**
     * Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     * 
     */
    @Export(name="critical", refs={InfraAlertConditionCritical.class}, tree="[0]")
    private Output</* @Nullable */ InfraAlertConditionCritical> critical;

    /**
     * @return Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     * 
     */
    public Output<Optional<InfraAlertConditionCritical>> critical() {
        return Codegen.optional(this.critical);
    }
    /**
     * The description of the Infrastructure alert condition.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Infrastructure alert condition.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The unique entity identifier of the condition in New Relic.
     * 
     */
    @Export(name="entityGuid", refs={String.class}, tree="[0]")
    private Output<String> entityGuid;

    /**
     * @return The unique entity identifier of the condition in New Relic.
     * 
     */
    public Output<String> entityGuid() {
        return this.entityGuid;
    }
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
     * 
     */
    @Export(name="event", refs={String.class}, tree="[0]")
    private Output<String> event;

    /**
     * @return The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
     * 
     */
    public Output<String> event() {
        return this.event;
    }
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
     * 
     */
    @Export(name="integrationProvider", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> integrationProvider;

    /**
     * @return For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
     * 
     */
    public Output<Optional<String>> integrationProvider() {
        return Codegen.optional(this.integrationProvider);
    }
    /**
     * The Infrastructure alert condition&#39;s name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Infrastructure alert condition&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the alert policy where this condition should be used.
     * 
     */
    @Export(name="policyId", refs={Integer.class}, tree="[0]")
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
    @Export(name="processWhere", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> processWhere;

    /**
     * @return Any filters applied to processes; for example: `commandName = &#39;java&#39;`.  Required by the `infra_process_running` condition type.
     * 
     */
    public Output<Optional<String>> processWhere() {
        return Codegen.optional(this.processWhere);
    }
    /**
     * Runbook URL to display in notifications.
     * 
     */
    @Export(name="runbookUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runbookUrl;

    /**
     * @return Runbook URL to display in notifications.
     * 
     */
    public Output<Optional<String>> runbookUrl() {
        return Codegen.optional(this.runbookUrl);
    }
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
     * 
     */
    @Export(name="select", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> select;

    /**
     * @return The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
     * 
     */
    public Output<Optional<String>> select() {
        return Codegen.optional(this.select);
    }
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The timestamp the alert condition was last updated.
     * 
     */
    @Export(name="updatedAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> updatedAt;

    /**
     * @return The timestamp the alert condition was last updated.
     * 
     */
    public Output<Integer> updatedAt() {
        return this.updatedAt;
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
    @Export(name="violationCloseTimer", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> violationCloseTimer;

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
    public Output<Optional<Integer>> violationCloseTimer() {
        return Codegen.optional(this.violationCloseTimer);
    }
    /**
     * Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     * 
     */
    @Export(name="warning", refs={InfraAlertConditionWarning.class}, tree="[0]")
    private Output</* @Nullable */ InfraAlertConditionWarning> warning;

    /**
     * @return Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     * 
     */
    public Output<Optional<InfraAlertConditionWarning>> warning() {
        return Codegen.optional(this.warning);
    }
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
     * 
     */
    @Export(name="where", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> where;

    /**
     * @return If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE &#39;%cassandra%&#39;`.
     * 
     */
    public Output<Optional<String>> where() {
        return Codegen.optional(this.where);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InfraAlertCondition(String name) {
        this(name, InfraAlertConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InfraAlertCondition(String name, InfraAlertConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InfraAlertCondition(String name, InfraAlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/infraAlertCondition:InfraAlertCondition", name, args == null ? InfraAlertConditionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InfraAlertCondition(String name, Output<String> id, @Nullable InfraAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/infraAlertCondition:InfraAlertCondition", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InfraAlertCondition get(String name, Output<String> id, @Nullable InfraAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InfraAlertCondition(name, id, state, options);
    }
}
