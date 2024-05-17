// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.OneDashboardRawArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.OneDashboardRawState;
import com.pulumi.newrelic.outputs.OneDashboardRawPage;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** The newrelic.OneDashboardJson resource is preferred for configuring dashboards in New Relic. This resource does not support the latest dashboard features and will receive less investment compared to newrelic_one_dashboard_json.
 * 
 * ## Example Usage
 * 
 * ### Create A New Relic One Dashboard With RawConfiguration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.OneDashboardRaw;
 * import com.pulumi.newrelic.OneDashboardRawArgs;
 * import com.pulumi.newrelic.inputs.OneDashboardRawPageArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampledash = new OneDashboardRaw("exampledash", OneDashboardRawArgs.builder()
 *             .name("New Relic Terraform Example")
 *             .pages(OneDashboardRawPageArgs.builder()
 *                 .name("Page Name")
 *                 .widgets(                
 *                     OneDashboardRawPageWidgetArgs.builder()
 *                         .title("Custom widget")
 *                         .row(1)
 *                         .column(1)
 *                         .width(1)
 *                         .height(1)
 *                         .visualizationId("viz.custom")
 *                         .configuration("""
 *       {
 *         "legend": {
 *           "enabled": false
 *         },
 *         "nrqlQueries": [
 *           {
 *             "accountId": ` + accountID + `,
 *             "query": "SELECT average(loadAverageOneMinute), average(loadAverageFiveMinute), average(loadAverageFifteenMinute) from SystemSample SINCE 60 minutes ago    TIMESERIES"
 *           }
 *         ],
 *         "yAxisLeft": {
 *           "max": 100,
 *           "min": 50,
 *           "zero": false
 *         }
 *       }
 *                         """)
 *                         .build(),
 *                     OneDashboardRawPageWidgetArgs.builder()
 *                         .title("Server CPU")
 *                         .row(1)
 *                         .column(2)
 *                         .width(1)
 *                         .height(1)
 *                         .visualizationId("viz.testing")
 *                         .configuration("""
 *       {
 *         "nrqlQueries": [
 *           {
 *             "accountId": ` + accountID + `,
 *             "query": "SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400"
 *           }
 *         ]
 *       }
 *                         """)
 *                         .build(),
 *                     OneDashboardRawPageWidgetArgs.builder()
 *                         .title("Docker Server CPU")
 *                         .row(1)
 *                         .column(3)
 *                         .height(1)
 *                         .width(1)
 *                         .visualizationId("viz.bar")
 *                         .configuration(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("facet", jsonObject(
 *                                     jsonProperty("showOtherSeries", false)
 *                                 )),
 *                                 jsonProperty("nrqlQueries", jsonArray(jsonObject(
 *                                     jsonProperty("accountId", accountID),
 *                                     jsonProperty("query", "SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400")
 *                                 )))
 *                             )))
 *                         .linkedEntityGuids("MzI5ODAxNnxWSVp8REFTSEJPQVJEfDI2MTcxNDc")
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="newrelic:index/oneDashboardRaw:OneDashboardRaw")
public class OneDashboardRaw extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<String> accountId() {
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
    @Export(name="pages", refs={List.class,OneDashboardRawPage.class}, tree="[0,1]")
    private Output<List<OneDashboardRawPage>> pages;

    /**
     * @return A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    public Output<List<OneDashboardRawPage>> pages() {
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
     * Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
     * 
     */
    @Export(name="permissions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> permissions;

    /**
     * @return Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
     * 
     */
    public Output<Optional<String>> permissions() {
        return Codegen.optional(this.permissions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OneDashboardRaw(String name) {
        this(name, OneDashboardRawArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OneDashboardRaw(String name, OneDashboardRawArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OneDashboardRaw(String name, OneDashboardRawArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboardRaw:OneDashboardRaw", name, args == null ? OneDashboardRawArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OneDashboardRaw(String name, Output<String> id, @Nullable OneDashboardRawState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboardRaw:OneDashboardRaw", name, state, makeResourceOptions(options, id));
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
    public static OneDashboardRaw get(String name, Output<String> id, @Nullable OneDashboardRawState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OneDashboardRaw(name, id, state, options);
    }
}
