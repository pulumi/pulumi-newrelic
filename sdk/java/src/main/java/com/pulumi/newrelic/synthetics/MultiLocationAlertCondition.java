// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.MultiLocationAlertConditionArgs;
import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionState;
import com.pulumi.newrelic.synthetics.outputs.MultiLocationAlertConditionCritical;
import com.pulumi.newrelic.synthetics.outputs.MultiLocationAlertConditionWarning;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.
 * 
 * &gt; **NOTE:** This is a legacy resource. The newrelic.NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.
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
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.AlertPolicyArgs;
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.MultiLocationAlertCondition;
 * import com.pulumi.newrelic.synthetics.MultiLocationAlertConditionArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionWarningArgs;
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
 *         var policy = new AlertPolicy("policy", AlertPolicyArgs.builder()
 *             .name("my-policy")
 *             .build());
 * 
 *         var monitor = new Monitor("monitor", MonitorArgs.builder()
 *             .locationsPublics("US_WEST_1")
 *             .name("my-monitor")
 *             .period("EVERY_10_MINUTES")
 *             .status("DISABLED")
 *             .type("SIMPLE")
 *             .uri("https://www.one.newrelic.com")
 *             .build());
 * 
 *         var example = new MultiLocationAlertCondition("example", MultiLocationAlertConditionArgs.builder()
 *             .policyId(policy.id())
 *             .name("Example condition")
 *             .runbookUrl("https://example.com")
 *             .enabled(true)
 *             .violationTimeLimitSeconds(3600)
 *             .entities(monitor.id())
 *             .critical(MultiLocationAlertConditionCriticalArgs.builder()
 *                 .threshold(2)
 *                 .build())
 *             .warning(MultiLocationAlertConditionWarningArgs.builder()
 *                 .threshold(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ## Tags
 * 
 * Manage synthetics multilocation alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.AlertPolicyArgs;
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
 * import com.pulumi.newrelic.synthetics.MultiLocationAlertCondition;
 * import com.pulumi.newrelic.synthetics.MultiLocationAlertConditionArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionWarningArgs;
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
 *         var foo = new AlertPolicy("foo", AlertPolicyArgs.builder()
 *             .name("foo policy")
 *             .build());
 * 
 *         var fooMonitor = new Monitor("fooMonitor", MonitorArgs.builder()
 *             .status("ENABLED")
 *             .name("foo monitor")
 *             .period("EVERY_MINUTE")
 *             .uri("https://www.one.newrelic.com")
 *             .type("SIMPLE")
 *             .locationsPublics("AP_EAST_1")
 *             .customHeaders(MonitorCustomHeaderArgs.builder()
 *                 .name("some_name")
 *                 .value("some_value")
 *                 .build())
 *             .treatRedirectAsFailure(true)
 *             .validationString("success")
 *             .bypassHeadRequest(true)
 *             .verifySsl(true)
 *             .tags(MonitorTagArgs.builder()
 *                 .key("some_key")
 *                 .values("some_value")
 *                 .build())
 *             .build());
 * 
 *         var fooMultiLocationAlertCondition = new MultiLocationAlertCondition("fooMultiLocationAlertCondition", MultiLocationAlertConditionArgs.builder()
 *             .policyId(foo.id())
 *             .name("foo condition")
 *             .runbookUrl("https://example.com")
 *             .enabled(true)
 *             .violationTimeLimitSeconds(3600)
 *             .entities(fooMonitor.id())
 *             .critical(MultiLocationAlertConditionCriticalArgs.builder()
 *                 .threshold(2)
 *                 .build())
 *             .warning(MultiLocationAlertConditionWarningArgs.builder()
 *                 .threshold(1)
 *                 .build())
 *             .build());
 * 
 *         var myConditionEntityTags = new EntityTags("myConditionEntityTags", EntityTagsArgs.builder()
 *             .guid(fooMultiLocationAlertCondition.entityGuid())
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
 * New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format
 * 
 *  `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition")
public class MultiLocationAlertCondition extends com.pulumi.resources.CustomResource {
    /**
     * A condition term with the priority set to critical.
     * 
     */
    @Export(name="critical", refs={MultiLocationAlertConditionCritical.class}, tree="[0]")
    private Output<MultiLocationAlertConditionCritical> critical;

    /**
     * @return A condition term with the priority set to critical.
     * 
     */
    public Output<MultiLocationAlertConditionCritical> critical() {
        return this.critical;
    }
    /**
     * Set whether to enable the alert condition.  Defaults to true.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Set whether to enable the alert condition.  Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The Monitor GUID&#39;s of the Synthetics monitors to alert on.
     * 
     */
    @Export(name="entities", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> entities;

    /**
     * @return The Monitor GUID&#39;s of the Synthetics monitors to alert on.
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
     * The title of the condition.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The title of the condition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the policy where this condition will be used.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The ID of the policy where this condition will be used.
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
     * The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
     * 
     */
    @Export(name="violationTimeLimitSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> violationTimeLimitSeconds;

    /**
     * @return The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
     * 
     */
    public Output<Optional<Integer>> violationTimeLimitSeconds() {
        return Codegen.optional(this.violationTimeLimitSeconds);
    }
    /**
     * A condition term with the priority set to warning.
     * 
     * &gt; **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     * 
     */
    @Export(name="warning", refs={MultiLocationAlertConditionWarning.class}, tree="[0]")
    private Output</* @Nullable */ MultiLocationAlertConditionWarning> warning;

    /**
     * @return A condition term with the priority set to warning.
     * 
     * &gt; **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     * 
     */
    public Output<Optional<MultiLocationAlertConditionWarning>> warning() {
        return Codegen.optional(this.warning);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiLocationAlertCondition(java.lang.String name) {
        this(name, MultiLocationAlertConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiLocationAlertCondition(java.lang.String name, MultiLocationAlertConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiLocationAlertCondition(java.lang.String name, MultiLocationAlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MultiLocationAlertCondition(java.lang.String name, Output<java.lang.String> id, @Nullable MultiLocationAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, state, makeResourceOptions(options, id), false);
    }

    private static MultiLocationAlertConditionArgs makeArgs(MultiLocationAlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MultiLocationAlertConditionArgs.Empty : args;
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
    public static MultiLocationAlertCondition get(java.lang.String name, Output<java.lang.String> id, @Nullable MultiLocationAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MultiLocationAlertCondition(name, id, state, options);
    }
}
