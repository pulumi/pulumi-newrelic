// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.OneDashboardArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.OneDashboardState;
import com.pulumi.newrelic.outputs.OneDashboardPage;
import com.pulumi.newrelic.outputs.OneDashboardVariable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * New Relic dashboards can be imported using their GUID, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/oneDashboard:OneDashboard my_dashboard &lt;dashboard GUID&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/oneDashboard:OneDashboard")
public class OneDashboard extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Brief text describing the dashboard.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The title of the dashboard.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    @Export(name="pages", refs={List.class,OneDashboardPage.class}, tree="[0,1]")
    private Output<List<OneDashboardPage>> pages;

    /**
     * @return A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    public Output<List<OneDashboardPage>> pages() {
        return this.pages;
    }
    /**
     * The URL for viewing the dashboard.
     * 
     */
    @Export(name="permalink", refs={String.class}, tree="[0]")
    private Output<String> permalink;

    /**
     * @return The URL for viewing the dashboard.
     * 
     */
    public Output<String> permalink() {
        return this.permalink;
    }
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    @Export(name="permissions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> permissions;

    /**
     * @return Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    public Output<Optional<String>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
     * 
     */
    @Export(name="variables", refs={List.class,OneDashboardVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OneDashboardVariable>> variables;

    /**
     * @return A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
     * 
     */
    public Output<Optional<List<OneDashboardVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OneDashboard(String name) {
        this(name, OneDashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OneDashboard(String name, OneDashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OneDashboard(String name, OneDashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboard:OneDashboard", name, args == null ? OneDashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OneDashboard(String name, Output<String> id, @Nullable OneDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboard:OneDashboard", name, state, makeResourceOptions(options, id));
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
    public static OneDashboard get(String name, Output<String> id, @Nullable OneDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OneDashboard(name, id, state, options);
    }
}
