// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.CertCheckMonitorArgs;
import com.pulumi.newrelic.synthetics.inputs.CertCheckMonitorState;
import com.pulumi.newrelic.synthetics.outputs.CertCheckMonitorTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.
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
 * import com.pulumi.newrelic.synthetics.CertCheckMonitor;
 * import com.pulumi.newrelic.synthetics.CertCheckMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.CertCheckMonitorTagArgs;
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
 *         var cert_check_monitor = new CertCheckMonitor(&#34;cert-check-monitor&#34;, CertCheckMonitorArgs.builder()        
 *             .certificateExpiration(&#34;10&#34;)
 *             .domain(&#34;www.example.com&#34;)
 *             .locationsPublics(&#34;AP_SOUTH_1&#34;)
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(CertCheckMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
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
 * import com.pulumi.newrelic.synthetics.CertCheckMonitor;
 * import com.pulumi.newrelic.synthetics.CertCheckMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.CertCheckMonitorTagArgs;
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
 *             .description(&#34;Test Description&#34;)
 *             .verifiedScriptExecution(false)
 *             .build());
 * 
 *         var monitor = new CertCheckMonitor(&#34;monitor&#34;, CertCheckMonitorArgs.builder()        
 *             .domain(&#34;https://www.one.example.com&#34;)
 *             .locationsPrivates(location.id())
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(CertCheckMonitorTagArgs.builder()
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
 * Synthetics certificate check monitor scripts can be imported using the `guid`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/certCheckMonitor:CertCheckMonitor")
public class CertCheckMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    @Export(name="certificateExpiration", refs={Integer.class}, tree="[0]")
    private Output<Integer> certificateExpiration;

    /**
     * @return The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    public Output<Integer> certificateExpiration() {
        return this.certificateExpiration;
    }
    /**
     * The domain of the host that will have its certificate checked.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The domain of the host that will have its certificate checked.
     * 
     */
    public Output<String> domain() {
        return this.domain;
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
    @Export(name="tags", refs={List.class,CertCheckMonitorTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CertCheckMonitorTag>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    public Output<Optional<List<CertCheckMonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertCheckMonitor(String name) {
        this(name, CertCheckMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertCheckMonitor(String name, CertCheckMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertCheckMonitor(String name, CertCheckMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, args == null ? CertCheckMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertCheckMonitor(String name, Output<String> id, @Nullable CertCheckMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, state, makeResourceOptions(options, id));
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
    public static CertCheckMonitor get(String name, Output<String> id, @Nullable CertCheckMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertCheckMonitor(name, id, state, options);
    }
}
