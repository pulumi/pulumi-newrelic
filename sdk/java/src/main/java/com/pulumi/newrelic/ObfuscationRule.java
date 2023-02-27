// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.ObfuscationRuleArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.ObfuscationRuleState;
import com.pulumi.newrelic.outputs.ObfuscationRuleAction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update and delete New Relic Obfuscation Rule.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.ObfuscationExpression;
 * import com.pulumi.newrelic.ObfuscationExpressionArgs;
 * import com.pulumi.newrelic.ObfuscationRule;
 * import com.pulumi.newrelic.ObfuscationRuleArgs;
 * import com.pulumi.newrelic.inputs.ObfuscationRuleActionArgs;
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
 *         var bar = new ObfuscationExpression(&#34;bar&#34;, ObfuscationExpressionArgs.builder()        
 *             .description(&#34;description of the expression&#34;)
 *             .regex(&#34;(^http)&#34;)
 *             .build());
 * 
 *         var foo = new ObfuscationRule(&#34;foo&#34;, ObfuscationRuleArgs.builder()        
 *             .description(&#34;description of the rule&#34;)
 *             .filter(&#34;hostStatus=running&#34;)
 *             .enabled(true)
 *             .actions(ObfuscationRuleActionArgs.builder()
 *                 .attributes(&#34;message&#34;)
 *                 .expressionId(bar.id())
 *                 .method(&#34;MASK&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * New Relic obfuscation rule can be imported using the rule ID, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/obfuscationRule:ObfuscationRule foo 34567
 * ```
 * 
 */
@ResourceType(type="newrelic:index/obfuscationRule:ObfuscationRule")
public class ObfuscationRule extends com.pulumi.resources.CustomResource {
    /**
     * The account id associated with the obfuscation rule.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The account id associated with the obfuscation rule.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Actions for the rule. The actions will be applied in the order specified by this list.
     * 
     */
    @Export(name="actions", type=List.class, parameters={ObfuscationRuleAction.class})
    private Output<List<ObfuscationRuleAction>> actions;

    /**
     * @return Actions for the rule. The actions will be applied in the order specified by this list.
     * 
     */
    public Output<List<ObfuscationRuleAction>> actions() {
        return this.actions;
    }
    /**
     * Description of rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the rule should be applied or not to incoming data.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether the rule should be applied or not to incoming data.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * NRQL for determining whether a given log record should have obfuscation actions applied.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return NRQL for determining whether a given log record should have obfuscation actions applied.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    /**
     * Name of rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObfuscationRule(String name) {
        this(name, ObfuscationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObfuscationRule(String name, ObfuscationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObfuscationRule(String name, ObfuscationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/obfuscationRule:ObfuscationRule", name, args == null ? ObfuscationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObfuscationRule(String name, Output<String> id, @Nullable ObfuscationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/obfuscationRule:ObfuscationRule", name, state, makeResourceOptions(options, id));
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
    public static ObfuscationRule get(String name, Output<String> id, @Nullable ObfuscationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObfuscationRule(name, id, state, options);
    }
}