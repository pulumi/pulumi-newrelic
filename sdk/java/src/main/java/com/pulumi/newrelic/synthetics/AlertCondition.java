// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.AlertConditionArgs;
import com.pulumi.newrelic.synthetics.inputs.AlertConditionState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage synthetics alert conditions in New Relic.
 * 
 * &gt; **WARNING:** The `newrelic.synthetics.AlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
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
 * import com.pulumi.newrelic.synthetics.AlertCondition;
 * import com.pulumi.newrelic.synthetics.AlertConditionArgs;
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
 *         var foo = new AlertCondition("foo", AlertConditionArgs.builder()
 *             .policyId(fooNewrelicAlertPolicy.id())
 *             .name("foo")
 *             .monitorId(fooNewrelicSyntheticsMonitor.id())
 *             .runbookUrl("https://www.example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Tags
 * 
 * Manage synthetics alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
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
 * import com.pulumi.newrelic.synthetics.AlertCondition;
 * import com.pulumi.newrelic.synthetics.AlertConditionArgs;
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
 *         var fooAlertCondition = new AlertCondition("fooAlertCondition", AlertConditionArgs.builder()
 *             .policyId(foo.id())
 *             .name("foo synthetics condition")
 *             .monitorId(fooMonitor.id())
 *             .runbookUrl("https://www.example.com")
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
 * Synthetics alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/alertCondition:AlertCondition")
public class AlertCondition extends com.pulumi.resources.CustomResource {
    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Set whether to enable the alert condition. Defaults to `true`.
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
     * The GUID of the Synthetics monitor to be referenced in the alert condition.
     * 
     */
    @Export(name="monitorId", refs={String.class}, tree="[0]")
    private Output<String> monitorId;

    /**
     * @return The GUID of the Synthetics monitor to be referenced in the alert condition.
     * 
     */
    public Output<String> monitorId() {
        return this.monitorId;
    }
    /**
     * The title of this condition.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The title of this condition.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertCondition(String name) {
        this(name, AlertConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertCondition(String name, AlertConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertCondition(String name, AlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/alertCondition:AlertCondition", name, args == null ? AlertConditionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertCondition(String name, Output<String> id, @Nullable AlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/alertCondition:AlertCondition", name, state, makeResourceOptions(options, id));
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
    public static AlertCondition get(String name, Output<String> id, @Nullable AlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertCondition(name, id, state, options);
    }
}
