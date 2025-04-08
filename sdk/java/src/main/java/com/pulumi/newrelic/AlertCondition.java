// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.AlertConditionArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.AlertConditionState;
import com.pulumi.newrelic.outputs.AlertConditionTerm;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.
 * 
 * &gt; **WARNING:** The `newrelic.AlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetEntityArgs;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.AlertPolicyArgs;
 * import com.pulumi.newrelic.AlertCondition;
 * import com.pulumi.newrelic.AlertConditionArgs;
 * import com.pulumi.newrelic.inputs.AlertConditionTermArgs;
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
 *         final var app = NewrelicFunctions.getEntity(GetEntityArgs.builder()
 *             .name("my-app")
 *             .type("APPLICATION")
 *             .domain("APM")
 *             .build());
 * 
 *         var foo = new AlertPolicy("foo", AlertPolicyArgs.builder()
 *             .name("foo")
 *             .build());
 * 
 *         var fooAlertCondition = new AlertCondition("fooAlertCondition", AlertConditionArgs.builder()
 *             .policyId(foo.id())
 *             .name("foo")
 *             .type("apm_app_metric")
 *             .entities(app.applicationId())
 *             .metric("apdex")
 *             .runbookUrl("https://www.example.com")
 *             .conditionScope("application")
 *             .terms(AlertConditionTermArgs.builder()
 *                 .duration(5)
 *                 .operator("below")
 *                 .priority("critical")
 *                 .threshold(0.75)
 *                 .timeFunction("all")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Terms
 * 
 * The `term` mapping supports the following arguments:
 * 
 *   * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
 *   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
 *   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
 *   * `threshold` - (Required) Must be 0 or greater.
 *   * `time_function` - (Required) `all` or `any`.
 * 
 * ## Tags
 * 
 * Manage alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetEntityArgs;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.AlertPolicyArgs;
 * import com.pulumi.newrelic.AlertCondition;
 * import com.pulumi.newrelic.AlertConditionArgs;
 * import com.pulumi.newrelic.inputs.AlertConditionTermArgs;
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
 *         final var foo = NewrelicFunctions.getEntity(GetEntityArgs.builder()
 *             .name("foo entitiy")
 *             .build());
 * 
 *         var fooAlertPolicy = new AlertPolicy("fooAlertPolicy", AlertPolicyArgs.builder()
 *             .name("foo policy")
 *             .build());
 * 
 *         var fooAlertCondition = new AlertCondition("fooAlertCondition", AlertConditionArgs.builder()
 *             .policyId(fooAlertPolicy.id())
 *             .name("foo condition")
 *             .type("apm_app_metric")
 *             .entities(foo.applicationId())
 *             .metric("apdex")
 *             .runbookUrl("https://www.example.com")
 *             .conditionScope("application")
 *             .terms(AlertConditionTermArgs.builder()
 *                 .duration(5)
 *                 .operator("below")
 *                 .priority("critical")
 *                 .threshold(0.75)
 *                 .timeFunction("all")
 *                 .build())
 *             .build());
 * 
 *         var myConditionEntityTags = new EntityTags("myConditionEntityTags", EntityTagsArgs.builder()
 *             .guid(fooAlertCondition.entityGuid())
 *             .tags(            
 *                 EntityTagsTagArgs.builder()
 *                     .key("my-key")
 *                     .values(                    
 *                         "my-value",
 *                         "my-other-value")
 *                     .build(),
 *                 EntityTagsTagArgs.builder()
 *                     .key("my-key-2")
 *                     .values("my-value-2")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Alert conditions can be imported using notation `alert_policy_id:alert_condition_id`, e.g.
 * 
 * ```sh
 * $ pulumi import newrelic:index/alertCondition:AlertCondition main 123456:6789012345
 * ```
 * 
 */
@ResourceType(type="newrelic:index/alertCondition:AlertCondition")
public class AlertCondition extends com.pulumi.resources.CustomResource {
    /**
     * `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
     * 
     */
    @Export(name="conditionScope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> conditionScope;

    /**
     * @return `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
     * 
     */
    public Output<Optional<String>> conditionScope() {
        return Codegen.optional(this.conditionScope);
    }
    /**
     * Whether the condition is enabled or not. Defaults to true.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the condition is enabled or not. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The instance IDs associated with this condition.
     * 
     */
    @Export(name="entities", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> entities;

    /**
     * @return The instance IDs associated with this condition.
     * 
     */
    public Output<List<String>> entities() {
        return this.entities;
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
     * A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
     * 
     */
    @Export(name="gcMetric", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gcMetric;

    /**
     * @return A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
     * 
     */
    public Output<Optional<String>> gcMetric() {
        return Codegen.optional(this.gcMetric);
    }
    /**
     * The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
     * 
     */
    @Export(name="metric", refs={String.class}, tree="[0]")
    private Output<String> metric;

    /**
     * @return The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }
    /**
     * The title of the condition. Must be between 1 and 64 characters, inclusive.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The title of the condition. Must be between 1 and 64 characters, inclusive.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the policy where this condition should be used.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The ID of the policy where this condition should be used.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
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
     * A list of terms for this condition. See Terms below for details.
     * 
     */
    @Export(name="terms", refs={List.class,AlertConditionTerm.class}, tree="[0,1]")
    private Output<List<AlertConditionTerm>> terms;

    /**
     * @return A list of terms for this condition. See Terms below for details.
     * 
     */
    public Output<List<AlertConditionTerm>> terms() {
        return this.terms;
    }
    /**
     * The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of condition. One of: `apm_app_metric`, `apm_jvm_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A custom metric to be evaluated.
     * 
     */
    @Export(name="userDefinedMetric", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userDefinedMetric;

    /**
     * @return A custom metric to be evaluated.
     * 
     */
    public Output<Optional<String>> userDefinedMetric() {
        return Codegen.optional(this.userDefinedMetric);
    }
    /**
     * One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
     * 
     * &gt; **NOTE:** The `user_defined_value_function` can have `rate` or `percent` only when the `type` is `mobile_metric`.
     * 
     */
    @Export(name="userDefinedValueFunction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userDefinedValueFunction;

    /**
     * @return One of: `average`, `min`, `max`, `total`, `sample_size`, `rate` or `percent`.
     * 
     * &gt; **NOTE:** The `user_defined_value_function` can have `rate` or `percent` only when the `type` is `mobile_metric`.
     * 
     */
    public Output<Optional<String>> userDefinedValueFunction() {
        return Codegen.optional(this.userDefinedValueFunction);
    }
    /**
     * Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be between 1 and 720 hours. Must be specified in the following two cases, to prevent drift:
     * * when `type` = `apm_app_metric` and `condition_scope` = `instance`
     * * when `type` = `apm_jvm_metric`
     * 
     */
    @Export(name="violationCloseTimer", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> violationCloseTimer;

    /**
     * @return Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours specified. Must be between 1 and 720 hours. Must be specified in the following two cases, to prevent drift:
     * * when `type` = `apm_app_metric` and `condition_scope` = `instance`
     * * when `type` = `apm_jvm_metric`
     * 
     */
    public Output<Optional<Integer>> violationCloseTimer() {
        return Codegen.optional(this.violationCloseTimer);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertCondition(java.lang.String name) {
        this(name, AlertConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertCondition(java.lang.String name, AlertConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertCondition(java.lang.String name, AlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertCondition:AlertCondition", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AlertCondition(java.lang.String name, Output<java.lang.String> id, @Nullable AlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertCondition:AlertCondition", name, state, makeResourceOptions(options, id), false);
    }

    private static AlertConditionArgs makeArgs(AlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AlertConditionArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static AlertCondition get(java.lang.String name, Output<java.lang.String> id, @Nullable AlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertCondition(name, id, state, options);
    }
}
