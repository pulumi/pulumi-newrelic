// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.SecureCredentialArgs;
import com.pulumi.newrelic.synthetics.inputs.SecureCredentialState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic Synthetic secure credentials.
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
 * import com.pulumi.newrelic.synthetics.SecureCredential;
 * import com.pulumi.newrelic.synthetics.SecureCredentialArgs;
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
 *         var foo = new SecureCredential(&#34;foo&#34;, SecureCredentialArgs.builder()        
 *             .key(&#34;MY_KEY&#34;)
 *             .value(&#34;My value&#34;)
 *             .description(&#34;My description&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * A Synthetics secure credential can be imported using its `key`:
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/secureCredential:SecureCredential")
public class SecureCredential extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID where you want to create the secure credential.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID where you want to create the secure credential.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The secure credential&#39;s description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The secure credential&#39;s description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The secure credential&#39;s key name. Regardless of the case used in the configuration, the provider will provide an upcased
     * key to the underlying API.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The secure credential&#39;s key name. Regardless of the case used in the configuration, the provider will provide an upcased
     * key to the underlying API.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The time the secure credential was last updated.
     * 
     */
    @Export(name="lastUpdated", refs={String.class}, tree="[0]")
    private Output<String> lastUpdated;

    /**
     * @return The time the secure credential was last updated.
     * 
     */
    public Output<String> lastUpdated() {
        return this.lastUpdated;
    }
    /**
     * The secure credential&#39;s value.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The secure credential&#39;s value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecureCredential(String name) {
        this(name, SecureCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecureCredential(String name, SecureCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecureCredential(String name, SecureCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/secureCredential:SecureCredential", name, args == null ? SecureCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecureCredential(String name, Output<String> id, @Nullable SecureCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/secureCredential:SecureCredential", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
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
    public static SecureCredential get(String name, Output<String> id, @Nullable SecureCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecureCredential(name, id, state, options);
    }
}
