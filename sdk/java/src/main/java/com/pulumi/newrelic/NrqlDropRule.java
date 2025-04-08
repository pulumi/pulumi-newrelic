// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NrqlDropRuleArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NrqlDropRuleState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.newrelic.NrqlDropRule;
 * import com.pulumi.newrelic.NrqlDropRuleArgs;
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
 *         var foo = new NrqlDropRule("foo", NrqlDropRuleArgs.builder()
 *             .accountId("12345")
 *             .description("Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it.")
 *             .action("drop_data")
 *             .nrql("SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'")
 *             .build());
 * 
 *         var bar = new NrqlDropRule("bar", NrqlDropRuleArgs.builder()
 *             .accountId("12345")
 *             .description("Removes the user name and email fields from MyCustomEvent")
 *             .action("drop_attributes")
 *             .nrql("SELECT userEmail, userName FROM MyCustomEvent")
 *             .build());
 * 
 *         var baz = new NrqlDropRule("baz", NrqlDropRuleArgs.builder()
 *             .accountId("12345")
 *             .description("Removes containerId from metric aggregates to reduce metric cardinality.")
 *             .action("drop_attributes_from_metric_aggregates")
 *             .nrql("SELECT containerId FROM Metric")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Using `newrelic-cli` to List Out Drop Rules
 * 
 * All NRQL Drop Rules associated with a New Relic account may be listed out using the following newrelic-cli command:
 * 
 * This would print all drop rules associated with your New Relic account to the terminal.
 * The number of rules to be printed can be customized using the `limit` argument of this command.
 * For instance, the following command limits the number of drop rules printed to two.
 * 
 * More details on the command and its arguments (for instance, the format in which the droprules are to be listed in the terminal, which is JSON by default) can be found in the output of the `newrelic nrql droprules --help` command.
 * If you do not have **newrelic-cli** installed on your device already, head over to [this page](https://github.com/newrelic/newrelic-cli#installation--upgrades) for instructions.
 * 
 * ## Import
 * 
 * New Relic NRQL drop rules can be imported using a concatenated string of the format
 * 
 *  `&lt;account_id&gt;:&lt;rule_id&gt;`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
 * ```
 * 
 */
@ResourceType(type="newrelic:index/nrqlDropRule:NrqlDropRule")
public class NrqlDropRule extends com.pulumi.resources.CustomResource {
    /**
     * Account where the drop rule will be put. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account where the drop rule will be put. Defaults to the account associated with the API key used.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The description of the drop rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the drop rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A NRQL string that specifies what data types to drop.
     * 
     */
    @Export(name="nrql", refs={String.class}, tree="[0]")
    private Output<String> nrql;

    /**
     * @return A NRQL string that specifies what data types to drop.
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
    public NrqlDropRule(java.lang.String name) {
        this(name, NrqlDropRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NrqlDropRule(java.lang.String name, NrqlDropRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NrqlDropRule(java.lang.String name, NrqlDropRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/nrqlDropRule:NrqlDropRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NrqlDropRule(java.lang.String name, Output<java.lang.String> id, @Nullable NrqlDropRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/nrqlDropRule:NrqlDropRule", name, state, makeResourceOptions(options, id), false);
    }

    private static NrqlDropRuleArgs makeArgs(NrqlDropRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NrqlDropRuleArgs.Empty : args;
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
    public static NrqlDropRule get(java.lang.String name, Output<java.lang.String> id, @Nullable NrqlDropRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NrqlDropRule(name, id, state, options);
    }
}
