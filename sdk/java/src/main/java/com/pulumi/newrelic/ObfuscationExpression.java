// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.ObfuscationExpressionArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.ObfuscationExpressionState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update and delete New Relic Obfuscation Expressions.
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
 * import com.pulumi.newrelic.ObfuscationExpression;
 * import com.pulumi.newrelic.ObfuscationExpressionArgs;
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
 *         var foo = new ObfuscationExpression("foo", ObfuscationExpressionArgs.builder()
 *             .accountId(12345)
 *             .name("OExp")
 *             .description("The description")
 *             .regex("(regex.*)")
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
 * New Relic obfuscation expression can be imported using the expression ID, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
 * ```
 * 
 */
@ResourceType(type="newrelic:index/obfuscationExpression:ObfuscationExpression")
public class ObfuscationExpression extends com.pulumi.resources.CustomResource {
    /**
     * The account id associated with the obfuscation expression.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account id associated with the obfuscation expression.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Description of expression.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of expression.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of expression.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of expression.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     * 
     */
    @Export(name="regex", refs={String.class}, tree="[0]")
    private Output<String> regex;

    /**
     * @return Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     * 
     */
    public Output<String> regex() {
        return this.regex;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObfuscationExpression(java.lang.String name) {
        this(name, ObfuscationExpressionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObfuscationExpression(java.lang.String name, ObfuscationExpressionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObfuscationExpression(java.lang.String name, ObfuscationExpressionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/obfuscationExpression:ObfuscationExpression", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ObfuscationExpression(java.lang.String name, Output<java.lang.String> id, @Nullable ObfuscationExpressionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/obfuscationExpression:ObfuscationExpression", name, state, makeResourceOptions(options, id), false);
    }

    private static ObfuscationExpressionArgs makeArgs(ObfuscationExpressionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ObfuscationExpressionArgs.Empty : args;
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
    public static ObfuscationExpression get(java.lang.String name, Output<java.lang.String> id, @Nullable ObfuscationExpressionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObfuscationExpression(name, id, state, options);
    }
}
