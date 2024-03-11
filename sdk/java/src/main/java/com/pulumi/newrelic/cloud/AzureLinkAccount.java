// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AzureLinkAccountArgs;
import com.pulumi.newrelic.cloud.inputs.AzureLinkAccountState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Use this resource to link an Azure account to New Relic.
 * 
 * ## Prerequisite
 * 
 * Some configuration is required in Azure for the New Relic Azure cloud integrations to be able to pull data.
 * 
 * To start receiving Azure data with New Relic Azure integrations, connect your Azure account to New Relic infrastructure monitoring. If you don&#39;t have one already, create a New Relic account. It&#39;s free, forever.
 * 
 * Setup is required in Azure for this resource to work properly. You can find instructions on how to set up Azure on [our documentation](https://docs.newrelic.com/docs/infrastructure/microsoft-azure-integrations/get-started/activate-azure-integrations/).
 * 
 * ## Example Usage
 * 
 * You can also use the full example, including the Azure set up, found in our guides.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.cloud.AzureLinkAccount;
 * import com.pulumi.newrelic.cloud.AzureLinkAccountArgs;
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
 *         var foo = new AzureLinkAccount(&#34;foo&#34;, AzureLinkAccountArgs.builder()        
 *             .accountId(&#34;The New Relic account ID where you want to link the Azure account&#34;)
 *             .applicationId(&#34;ID of the application&#34;)
 *             .clientSecret(&#34;Secret value of client&#39;s Azure account&#34;)
 *             .subscriptionId(&#34;Subscription ID of Azure&#34;)
 *             .tenantId(&#34;Tenant ID of the Azure&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:cloud/azureLinkAccount:AzureLinkAccount foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/azureLinkAccount:AzureLinkAccount")
public class AzureLinkAccount extends com.pulumi.resources.CustomResource {
    /**
     * Account ID of the New Relic.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return Account ID of the New Relic.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Application ID of the App.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return Application ID of the App.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Secret Value of the client.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output<String> clientSecret;

    /**
     * @return Secret Value of the client.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Name of the linked account
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the linked account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Subscription ID of the Azure cloud account.
     * 
     */
    @Export(name="subscriptionId", refs={String.class}, tree="[0]")
    private Output<String> subscriptionId;

    /**
     * @return Subscription ID of the Azure cloud account.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Tenant ID of the Azure cloud account.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return Tenant ID of the Azure cloud account.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureLinkAccount(String name) {
        this(name, AzureLinkAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureLinkAccount(String name, AzureLinkAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureLinkAccount(String name, AzureLinkAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/azureLinkAccount:AzureLinkAccount", name, args == null ? AzureLinkAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AzureLinkAccount(String name, Output<String> id, @Nullable AzureLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/azureLinkAccount:AzureLinkAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret"
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
    public static AzureLinkAccount get(String name, Output<String> id, @Nullable AzureLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AzureLinkAccount(name, id, state, options);
    }
}
