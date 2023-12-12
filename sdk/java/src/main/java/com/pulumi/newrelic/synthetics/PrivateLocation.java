// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
import com.pulumi.newrelic.synthetics.inputs.PrivateLocationState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic Synthetic private location.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.PrivateLocation;
 * import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
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
 *         var location = new PrivateLocation(&#34;location&#34;, PrivateLocationArgs.builder()        
 *             .description(&#34;The private location description&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A Synthetics private location can be imported using the `guid`
 * 
 * ```sh
 *  $ pulumi import newrelic:synthetics/privateLocation:PrivateLocation location GUID
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/privateLocation:PrivateLocation")
public class PrivateLocation extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the private location will be created.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The account in which the private location will be created.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The private location description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The private location description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The private location globally unique identifier.
     * 
     */
    @Export(name="domainId", refs={String.class}, tree="[0]")
    private Output<String> domainId;

    /**
     * @return The private location globally unique identifier.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * The unique client identifier for the private location in New Relic. Same as `id`.
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return The unique client identifier for the private location in New Relic. Same as `id`.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The private locations key.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The private locations key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * An alternate identifier based on name.
     * 
     */
    @Export(name="locationId", refs={String.class}, tree="[0]")
    private Output<String> locationId;

    /**
     * @return An alternate identifier based on name.
     * 
     */
    public Output<String> locationId() {
        return this.locationId;
    }
    /**
     * The name of the private location.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the private location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    @Export(name="verifiedScriptExecution", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> verifiedScriptExecution;

    /**
     * @return The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    public Output<Optional<Boolean>> verifiedScriptExecution() {
        return Codegen.optional(this.verifiedScriptExecution);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLocation(String name) {
        this(name, PrivateLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLocation(String name, PrivateLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLocation(String name, PrivateLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/privateLocation:PrivateLocation", name, args == null ? PrivateLocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLocation(String name, Output<String> id, @Nullable PrivateLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/privateLocation:PrivateLocation", name, state, makeResourceOptions(options, id));
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
    public static PrivateLocation get(String name, Output<String> id, @Nullable PrivateLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLocation(name, id, state, options);
    }
}
