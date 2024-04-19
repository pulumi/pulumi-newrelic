// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.EventsToMetricsRuleArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.EventsToMetricsRuleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete New Relic Events to Metrics rules.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.EventsToMetricsRule;
 * import com.pulumi.newrelic.EventsToMetricsRuleArgs;
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
 *         var foo = new EventsToMetricsRule(&#34;foo&#34;, EventsToMetricsRuleArgs.builder()        
 *             .accountId(12345)
 *             .name(&#34;Example events to metrics rule&#34;)
 *             .description(&#34;Example description&#34;)
 *             .nrql(&#34;SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * New Relic Events to Metrics rules can be imported using a concatenated string of the format
 * 
 *  `&lt;account_id&gt;:&lt;rule_id&gt;`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
 * ```
 * 
 */
@ResourceType(type="newrelic:index/eventsToMetricsRule:EventsToMetricsRule")
public class EventsToMetricsRule extends com.pulumi.resources.CustomResource {
    /**
     * Account with the event and where the metrics will be put.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return Account with the event and where the metrics will be put.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Provides additional information about the rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Provides additional information about the rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * True means this rule is enabled. False means the rule is currently not creating metrics.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return True means this rule is enabled. False means the rule is currently not creating metrics.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The name of the rule. This must be unique within an account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule. This must be unique within an account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Explains how to create metrics from events.
     * 
     */
    @Export(name="nrql", refs={String.class}, tree="[0]")
    private Output<String> nrql;

    /**
     * @return Explains how to create metrics from events.
     * 
     */
    public Output<String> nrql() {
        return this.nrql;
    }
    /**
     * The id, uniquely identifying the rule.
     * 
     */
    @Export(name="ruleId", refs={String.class}, tree="[0]")
    private Output<String> ruleId;

    /**
     * @return The id, uniquely identifying the rule.
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventsToMetricsRule(String name) {
        this(name, EventsToMetricsRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventsToMetricsRule(String name, EventsToMetricsRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventsToMetricsRule(String name, EventsToMetricsRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, args == null ? EventsToMetricsRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventsToMetricsRule(String name, Output<String> id, @Nullable EventsToMetricsRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/eventsToMetricsRule:EventsToMetricsRule", name, state, makeResourceOptions(options, id));
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
    public static EventsToMetricsRule get(String name, Output<String> id, @Nullable EventsToMetricsRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventsToMetricsRule(name, id, state, options);
    }
}
