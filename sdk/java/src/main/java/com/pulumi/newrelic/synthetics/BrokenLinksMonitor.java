// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.BrokenLinksMonitorArgs;
import com.pulumi.newrelic.synthetics.inputs.BrokenLinksMonitorState;
import com.pulumi.newrelic.synthetics.outputs.BrokenLinksMonitorTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete a Synthetics Broken Links monitor in New Relic.
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
 * import com.pulumi.newrelic.synthetics.BrokenLinksMonitor;
 * import com.pulumi.newrelic.synthetics.BrokenLinksMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.BrokenLinksMonitorTagArgs;
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
 *         var foo = new BrokenLinksMonitor(&#34;foo&#34;, BrokenLinksMonitorArgs.builder()        
 *             .locationsPublics(&#34;AP_SOUTH_1&#34;)
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .runtimeType(&#34;NODE_API&#34;)
 *             .runtimeTypeVersion(&#34;16.10&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(BrokenLinksMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .uri(&#34;https://www.one.example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * See additional examples.
 * 
 * ## Additional Examples
 * 
 * ### Create a monitor with a private location
 * 
 * The below example shows how you can define a private location and attach it to a monitor.
 * 
 * &gt; **NOTE:** It can take up to 10 minutes for a private location to become available.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.PrivateLocation;
 * import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
 * import com.pulumi.newrelic.synthetics.BrokenLinksMonitor;
 * import com.pulumi.newrelic.synthetics.BrokenLinksMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.BrokenLinksMonitorTagArgs;
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
 *         var fooPrivateLocation = new PrivateLocation(&#34;fooPrivateLocation&#34;, PrivateLocationArgs.builder()        
 *             .description(&#34;Sample Private Location Description&#34;)
 *             .verifiedScriptExecution(false)
 *             .build());
 * 
 *         var fooBrokenLinksMonitor = new BrokenLinksMonitor(&#34;fooBrokenLinksMonitor&#34;, BrokenLinksMonitorArgs.builder()        
 *             .uri(&#34;https://www.one.example.com&#34;)
 *             .locationsPrivates(fooPrivateLocation.id())
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(BrokenLinksMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * A broken links monitor can be imported using its GUID, using the following command.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor")
public class BrokenLinksMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The unique entity identifier of the monitor in New Relic.
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return The unique entity identifier of the monitor in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    @Export(name="locationsPrivates", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> locationsPrivates;

    /**
     * @return The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    public Output<Optional<List<String>>> locationsPrivates() {
        return Codegen.optional(this.locationsPrivates);
    }
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Export(name="locationsPublics", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Output<Optional<List<String>>> locationsPublics() {
        return Codegen.optional(this.locationsPublics);
    }
    /**
     * The name for the monitor.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the monitor.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    public Output<String> period() {
        return this.period;
    }
    /**
     * The interval in minutes at which Synthetic monitor should run.
     * 
     */
    @Export(name="periodInMinutes", refs={Integer.class}, tree="[0]")
    private Output<Integer> periodInMinutes;

    /**
     * @return The interval in minutes at which Synthetic monitor should run.
     * 
     */
    public Output<Integer> periodInMinutes() {
        return this.periodInMinutes;
    }
    /**
     * The runtime that the monitor will use to run jobs.
     * 
     */
    @Export(name="runtimeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeType;

    /**
     * @return The runtime that the monitor will use to run jobs.
     * 
     */
    public Output<Optional<String>> runtimeType() {
        return Codegen.optional(this.runtimeType);
    }
    /**
     * The specific version of the runtime type selected.
     * 
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     */
    @Export(name="runtimeTypeVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected.
     * 
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     */
    public Output<Optional<String>> runtimeTypeVersion() {
        return Codegen.optional(this.runtimeTypeVersion);
    }
    /**
     * The monitor status (ENABLED or DISABLED).
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The monitor status (ENABLED or DISABLED).
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    @Export(name="tags", refs={List.class,BrokenLinksMonitorTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BrokenLinksMonitorTag>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    public Output<Optional<List<BrokenLinksMonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The URI the monitor runs against.
     * 
     */
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output<String> uri;

    /**
     * @return The URI the monitor runs against.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BrokenLinksMonitor(String name) {
        this(name, BrokenLinksMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BrokenLinksMonitor(String name, BrokenLinksMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BrokenLinksMonitor(String name, BrokenLinksMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, args == null ? BrokenLinksMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BrokenLinksMonitor(String name, Output<String> id, @Nullable BrokenLinksMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, state, makeResourceOptions(options, id));
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
    public static BrokenLinksMonitor get(String name, Output<String> id, @Nullable BrokenLinksMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BrokenLinksMonitor(name, id, state, options);
    }
}
