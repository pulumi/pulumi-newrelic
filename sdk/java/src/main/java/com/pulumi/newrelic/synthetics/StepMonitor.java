// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.StepMonitorArgs;
import com.pulumi.newrelic.synthetics.inputs.StepMonitorState;
import com.pulumi.newrelic.synthetics.outputs.StepMonitorLocationPrivate;
import com.pulumi.newrelic.synthetics.outputs.StepMonitorStep;
import com.pulumi.newrelic.synthetics.outputs.StepMonitorTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
 * 
 * Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.
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
 * import com.pulumi.newrelic.synthetics.StepMonitor;
 * import com.pulumi.newrelic.synthetics.StepMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.StepMonitorStepArgs;
 * import com.pulumi.newrelic.synthetics.inputs.StepMonitorTagArgs;
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
 *         var foo = new StepMonitor("foo", StepMonitorArgs.builder()
 *             .name("Sample Step Monitor")
 *             .enableScreenshotOnFailureAndScript(true)
 *             .locationsPublics(            
 *                 "US_EAST_1",
 *                 "US_EAST_2")
 *             .period("EVERY_6_HOURS")
 *             .status("ENABLED")
 *             .runtimeType("CHROME_BROWSER")
 *             .runtimeTypeVersion("100")
 *             .steps(StepMonitorStepArgs.builder()
 *                 .ordinal(0)
 *                 .type("NAVIGATE")
 *                 .values("https://www.newrelic.com")
 *                 .build())
 *             .tags(StepMonitorTagArgs.builder()
 *                 .key("some_key")
 *                 .values("some_value")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
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
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.PrivateLocation;
 * import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
 * import com.pulumi.newrelic.synthetics.StepMonitor;
 * import com.pulumi.newrelic.synthetics.StepMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.StepMonitorLocationPrivateArgs;
 * import com.pulumi.newrelic.synthetics.inputs.StepMonitorStepArgs;
 * import com.pulumi.newrelic.synthetics.inputs.StepMonitorTagArgs;
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
 *         var foo = new PrivateLocation("foo", PrivateLocationArgs.builder()
 *             .name("Sample Private Location")
 *             .description("Sample Private Location Description")
 *             .verifiedScriptExecution(true)
 *             .build());
 * 
 *         var fooStepMonitor = new StepMonitor("fooStepMonitor", StepMonitorArgs.builder()
 *             .name("Sample Step Monitor")
 *             .period("EVERY_6_HOURS")
 *             .status("ENABLED")
 *             .locationPrivates(StepMonitorLocationPrivateArgs.builder()
 *                 .guid(foo.id())
 *                 .vsePassword("secret")
 *                 .build())
 *             .steps(StepMonitorStepArgs.builder()
 *                 .ordinal(0)
 *                 .type("NAVIGATE")
 *                 .values("https://google.com")
 *                 .build())
 *             .tags(StepMonitorTagArgs.builder()
 *                 .key("some_key")
 *                 .values("some_value")
 *                 .build())
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
 * A step monitor can be imported using its GUID, using the following command.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/stepMonitor:StepMonitor")
public class StepMonitor extends com.pulumi.resources.CustomResource {
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
     * Capture a screenshot during job execution.
     * 
     */
    @Export(name="enableScreenshotOnFailureAndScript", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableScreenshotOnFailureAndScript;

    /**
     * @return Capture a screenshot during job execution.
     * 
     */
    public Output<Optional<Boolean>> enableScreenshotOnFailureAndScript() {
        return Codegen.optional(this.enableScreenshotOnFailureAndScript);
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
     * The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    @Export(name="locationPrivates", refs={List.class,StepMonitorLocationPrivate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StepMonitorLocationPrivate>> locationPrivates;

    /**
     * @return The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    public Output<Optional<List<StepMonitorLocationPrivate>>> locationPrivates() {
        return Codegen.optional(this.locationPrivates);
    }
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Export(name="locationsPublics", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
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
     * The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
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
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `CHROME_BROWSER` and `100` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
     * 
     */
    @Export(name="runtimeTypeVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected.
     * 
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `CHROME_BROWSER` and `100` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
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
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     * 
     */
    @Export(name="steps", refs={List.class,StepMonitorStep.class}, tree="[0,1]")
    private Output<List<StepMonitorStep>> steps;

    /**
     * @return The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     * 
     */
    public Output<List<StepMonitorStep>> steps() {
        return this.steps;
    }
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    @Export(name="tags", refs={List.class,StepMonitorTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StepMonitorTag>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    public Output<Optional<List<StepMonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StepMonitor(java.lang.String name) {
        this(name, StepMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StepMonitor(java.lang.String name, StepMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StepMonitor(java.lang.String name, StepMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/stepMonitor:StepMonitor", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StepMonitor(java.lang.String name, Output<java.lang.String> id, @Nullable StepMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/stepMonitor:StepMonitor", name, state, makeResourceOptions(options, id), false);
    }

    private static StepMonitorArgs makeArgs(StepMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StepMonitorArgs.Empty : args;
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
    public static StepMonitor get(java.lang.String name, Output<java.lang.String> id, @Nullable StepMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StepMonitor(name, id, state, options);
    }
}
