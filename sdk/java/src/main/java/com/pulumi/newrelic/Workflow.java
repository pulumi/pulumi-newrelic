// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.WorkflowArgs;
import com.pulumi.newrelic.inputs.WorkflowState;
import com.pulumi.newrelic.outputs.WorkflowDestination;
import com.pulumi.newrelic.outputs.WorkflowEnrichments;
import com.pulumi.newrelic.outputs.WorkflowIssuesFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic workflows.
 * 
 * ## Example Usage
 * 
 * ##### Workflow
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var foo = new Workflow("foo", WorkflowArgs.builder()        
 *             .name("workflow-example")
 *             .mutingRulesHandling("NOTIFY_ALL_ISSUES")
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name("filter-name")
 *                 .type("FILTER")
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute("accumulations.tag.team")
 *                     .operator("EXACTLY_MATCHES")
 *                     .values("growth")
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(someChannel.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Policy-Based Workflow Example
 * 
 * This scenario describes one of most common ways of using workflows by defining a set of policies the workflow handles
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
 * import com.pulumi.newrelic.NotificationDestination;
 * import com.pulumi.newrelic.NotificationDestinationArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationPropertyArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationAuthBasicArgs;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         // Create a policy to track
 *         var my_policy = new AlertPolicy("my-policy", AlertPolicyArgs.builder()        
 *             .name("my_policy")
 *             .build());
 * 
 *         // Create a reusable notification destination
 *         var webhook_destination = new NotificationDestination("webhook-destination", NotificationDestinationArgs.builder()        
 *             .name("destination-webhook")
 *             .type("WEBHOOK")
 *             .properties(NotificationDestinationPropertyArgs.builder()
 *                 .key("url")
 *                 .value("https://example.com")
 *                 .build())
 *             .authBasic(NotificationDestinationAuthBasicArgs.builder()
 *                 .user("username")
 *                 .password("password")
 *                 .build())
 *             .build());
 * 
 *         // Create a notification channel to use in the workflow
 *         var webhook_channel = new NotificationChannel("webhook-channel", NotificationChannelArgs.builder()        
 *             .name("channel-webhook")
 *             .type("WEBHOOK")
 *             .destinationId(webhook_destination.id())
 *             .product("IINT")
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key("payload")
 *                 .value("{}")
 *                 .label("Payload Template")
 *                 .build())
 *             .build());
 * 
 *         // A workflow that matches issues that include incidents triggered by the policy
 *         var workflow_example = new Workflow("workflow-example", WorkflowArgs.builder()        
 *             .name("workflow-example")
 *             .mutingRulesHandling("NOTIFY_ALL_ISSUES")
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name("Filter-name")
 *                 .type("FILTER")
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute("labels.policyIds")
 *                     .operator("EXACTLY_MATCHES")
 *                     .values(my_policy.id())
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(webhook_channel.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### An example of a workflow with enrichments
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowEnrichmentsArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var workflow_example = new Workflow("workflow-example", WorkflowArgs.builder()        
 *             .name("workflow-enrichment-example")
 *             .mutingRulesHandling("NOTIFY_ALL_ISSUES")
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name("Filter-name")
 *                 .type("FILTER")
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute("accumulations.tag.team")
 *                     .operator("EXACTLY_MATCHES")
 *                     .values("my_team")
 *                     .build())
 *                 .build())
 *             .enrichments(WorkflowEnrichmentsArgs.builder()
 *                 .nrqls(WorkflowEnrichmentsNrqlArgs.builder()
 *                     .name("Log Count")
 *                     .configurations(WorkflowEnrichmentsNrqlConfigurationArgs.builder()
 *                         .query("SELECT count(*) FROM Log WHERE message like '%error%' since 10 minutes ago")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(webhook_channel.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### An example of a workflow with notification triggers
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var workflow_example = new Workflow("workflow-example", WorkflowArgs.builder()        
 *             .name("workflow-enrichment-example")
 *             .mutingRulesHandling("NOTIFY_ALL_ISSUES")
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name("Filter-name")
 *                 .type("FILTER")
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute("accumulations.tag.team")
 *                     .operator("EXACTLY_MATCHES")
 *                     .values("my_team")
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(webhook_channel.id())
 *                 .notificationTriggers("ACTIVATED")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Additional Information
 * 
 * More details about the workflows can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/applied-intelligence/incident-workflows/incident-workflows/).
 * 
 * ## v3.3 changes
 * 
 * In version v3.3 we renamed the following arguments:
 * 
 * - `workflow_enabled` changed to `enabled`.
 * - `destination_configuration` changed to `destination`.
 * - `predicates` changed to `predicate`.
 * - Enrichment&#39;s `configurations` changed to `configuration`.
 * 
 * ## Import
 * 
 * Workflows can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/workflow:Workflow foo &lt;id&gt;
 * ```
 * 
 * You can find the workflow ID from the workflow table by clicking on ... at the end of the row and choosing `Copy workflow id to clipboard`.
 * 
 */
@ResourceType(type="newrelic:index/workflow:Workflow")
public class Workflow extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Notification configuration. See Nested destination blocks below for details.
     * 
     */
    @Export(name="destinations", refs={List.class,WorkflowDestination.class}, tree="[0,1]")
    private Output<List<WorkflowDestination>> destinations;

    /**
     * @return Notification configuration. See Nested destination blocks below for details.
     * 
     */
    public Output<List<WorkflowDestination>> destinations() {
        return this.destinations;
    }
    /**
     * **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
     * these two are different flags, but they are functionally identical. Defaults to true.
     * 
     * @deprecated
     * Please use &#39;enabled&#39; instead
     * 
     */
    @Deprecated /* Please use 'enabled' instead */
    @Export(name="destinationsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> destinationsEnabled;

    /**
     * @return **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
     * these two are different flags, but they are functionally identical. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> destinationsEnabled() {
        return Codegen.optional(this.destinationsEnabled);
    }
    /**
     * Whether workflow is enabled. Defaults to true.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether workflow is enabled. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    @Export(name="enrichments", refs={WorkflowEnrichments.class}, tree="[0]")
    private Output</* @Nullable */ WorkflowEnrichments> enrichments;

    /**
     * @return Workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    public Output<Optional<WorkflowEnrichments>> enrichments() {
        return Codegen.optional(this.enrichments);
    }
    /**
     * Whether enrichments are enabled. Defaults to true.
     * 
     */
    @Export(name="enrichmentsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enrichmentsEnabled;

    /**
     * @return Whether enrichments are enabled. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enrichmentsEnabled() {
        return Codegen.optional(this.enrichmentsEnabled);
    }
    /**
     * Workflow entity GUID
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return Workflow entity GUID
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * A filter used to identify issues handled by this workflow. See Nested issues_filter blocks below for details.
     * 
     */
    @Export(name="issuesFilter", refs={WorkflowIssuesFilter.class}, tree="[0]")
    private Output<WorkflowIssuesFilter> issuesFilter;

    /**
     * @return A filter used to identify issues handled by this workflow. See Nested issues_filter blocks below for details.
     * 
     */
    public Output<WorkflowIssuesFilter> issuesFilter() {
        return this.issuesFilter;
    }
    /**
     * The last time notification was sent for this workflow.
     * 
     */
    @Export(name="lastRun", refs={String.class}, tree="[0]")
    private Output<String> lastRun;

    /**
     * @return The last time notification was sent for this workflow.
     * 
     */
    public Output<String> lastRun() {
        return this.lastRun;
    }
    /**
     * How to handle muted issues. See Muting Rules below for details.
     * 
     */
    @Export(name="mutingRulesHandling", refs={String.class}, tree="[0]")
    private Output<String> mutingRulesHandling;

    /**
     * @return How to handle muted issues. See Muting Rules below for details.
     * 
     */
    public Output<String> mutingRulesHandling() {
        return this.mutingRulesHandling;
    }
    /**
     * The name of the workflow.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The id of the workflow.
     * 
     */
    @Export(name="workflowId", refs={String.class}, tree="[0]")
    private Output<String> workflowId;

    /**
     * @return The id of the workflow.
     * 
     */
    public Output<String> workflowId() {
        return this.workflowId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/workflow:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/workflow:Workflow", name, state, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, state, options);
    }
}
