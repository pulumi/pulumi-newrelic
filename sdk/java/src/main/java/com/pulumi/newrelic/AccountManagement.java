// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.AccountManagementArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.AccountManagementState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic sub accounts.
 * 
 * &gt; **WARNING:** The `newrelic.AccountManagement` resource will only create/update but won&#39;t delete a sub account. Please visit our documentation on  [`Account Management`](https://docs.newrelic.com/docs/apis/nerdgraph/examples/manage-accounts-nerdgraph/#delete) for more information .
 * 
 * ## Example Usage
 * 
 * ##### Create Account
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AccountManagement;
 * import com.pulumi.newrelic.AccountManagementArgs;
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
 *         var foo = new AccountManagement("foo", AccountManagementArgs.builder()        
 *             .name("Test Account Name")
 *             .region("us01")
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
 * Accounts can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/accountManagement:AccountManagement foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/accountManagement:AccountManagement")
public class AccountManagement extends com.pulumi.resources.CustomResource {
    /**
     * Name of the account to be created
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the account to be created
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A description of what this parsing rule represents.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return A description of what this parsing rule represents.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountManagement(String name) {
        this(name, AccountManagementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountManagement(String name, AccountManagementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountManagement(String name, AccountManagementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/accountManagement:AccountManagement", name, args == null ? AccountManagementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountManagement(String name, Output<String> id, @Nullable AccountManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/accountManagement:AccountManagement", name, state, makeResourceOptions(options, id));
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
    public static AccountManagement get(String name, Output<String> id, @Nullable AccountManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountManagement(name, id, state, options);
    }
}
