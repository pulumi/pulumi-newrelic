// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.GcpLinkAccountArgs;
import com.pulumi.newrelic.cloud.inputs.GcpLinkAccountState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Use this resource to link a GCP account to New Relic.
 * 
 * ## Prerequisite
 * 
 * To start receiving Google Cloud Platform (GCP) data with New Relic GCP integrations, connect your Google project to New Relic infrastructure monitoring. If you don&#39;t have one already, create a New Relic account. It&#39;s free, forever.
 * 
 * Setup is required in GCP for this resource to work properly. The New Relic GCP integration can be done by creating a user account or a service account.
 * 
 * A user with Project IAM Admin role is needed to add the service account ID as a member in your GCP project.
 * 
 * In the GCP project IAM &amp; admin, the service account must have the Project Viewer role and the Service Usage Consumer role or, alternatively, a custom role.
 * 
 * Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/google-cloud-platform-integrations/get-started/connect-google-cloud-platform-services-new-relic) to set up the integration.
 * 
 * ## Example Usage
 * 
 * You can also use the full example, including the GCP set up, found in our guides.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.cloud.GcpLinkAccount;
 * import com.pulumi.newrelic.cloud.GcpLinkAccountArgs;
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
 *         var foo = new GcpLinkAccount("foo", GcpLinkAccountArgs.builder()
 *             .accountId("account id of newrelic account")
 *             .projectId("id of the Project")
 *             .name("account name")
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
 * Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/gcpLinkAccount:GcpLinkAccount")
public class GcpLinkAccount extends com.pulumi.resources.CustomResource {
    /**
     * Account ID of the New Relic account.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account ID of the New Relic account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * name of the linked account
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return name of the linked account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Project ID of the GCP account.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project ID of the GCP account.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GcpLinkAccount(String name) {
        this(name, GcpLinkAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcpLinkAccount(String name, GcpLinkAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcpLinkAccount(String name, GcpLinkAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, args == null ? GcpLinkAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GcpLinkAccount(String name, Output<String> id, @Nullable GcpLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, state, makeResourceOptions(options, id));
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
    public static GcpLinkAccount get(String name, Output<String> id, @Nullable GcpLinkAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcpLinkAccount(name, id, state, options);
    }
}
