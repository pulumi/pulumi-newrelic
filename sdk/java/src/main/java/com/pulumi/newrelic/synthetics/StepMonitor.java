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
 * Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.
 * 
 * ## Example Usage
 * ```java
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
 *         var monitor = new StepMonitor(&#34;monitor&#34;, StepMonitorArgs.builder()        
 *             .enableScreenshotOnFailureAndScript(true)
 *             .locationsPublics(            
 *                 &#34;US_EAST_1&#34;,
 *                 &#34;US_EAST_2&#34;)
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .steps(StepMonitorStepArgs.builder()
 *                 .ordinal(0)
 *                 .type(&#34;NAVIGATE&#34;)
 *                 .values(&#34;https://www.newrelic.com&#34;)
 *                 .build())
 *             .tags(StepMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * See additional examples.
 * ## Additional Examples
 * 
 * ### Create a monitor with a private location
 * 
 * The below example shows how you can define a private location and attach it to a monitor.
 * 
 * &gt; **NOTE:** It can take up to 10 minutes for a private location to become available.
 * 
 * ```java
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
 *         var location = new PrivateLocation(&#34;location&#34;, PrivateLocationArgs.builder()        
 *             .description(&#34;Test Description&#34;)
 *             .verifiedScriptExecution(true)
 *             .build());
 * 
 *         var bar = new StepMonitor(&#34;bar&#34;, StepMonitorArgs.builder()        
 *             .uri(&#34;https://www.one.example.com&#34;)
 *             .locationPrivates(StepMonitorLocationPrivateArgs.builder()
 *                 .guid(location.id())
 *                 .vsePassword(&#34;secret&#34;)
 *                 .build())
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .steps(StepMonitorStepArgs.builder()
 *                 .ordinal(0)
 *                 .type(&#34;NAVIGATE&#34;)
 *                 .values(&#34;https://google.com&#34;)
 *                 .build())
 *             .tags(StepMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synthetics step monitor scripts can be imported using the `guid`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/stepMonitor:StepMonitor")
public class StepMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Capture a screenshot during job execution.
     * 
     */
    @Export(name="enableScreenshotOnFailureAndScript", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableScreenshotOnFailureAndScript;

    /**
     * @return Capture a screenshot during job execution.
     * 
     */
    public Output<Optional<Boolean>> enableScreenshotOnFailureAndScript() {
        return Codegen.optional(this.enableScreenshotOnFailureAndScript);
    }
    /**
     * The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    @Export(name="guid", type=String.class, parameters={})
    private Output<String> guid;

    /**
     * @return The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    @Export(name="locationPrivates", type=List.class, parameters={StepMonitorLocationPrivate.class})
    private Output</* @Nullable */ List<StepMonitorLocationPrivate>> locationPrivates;

    /**
     * @return The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    public Output<Optional<List<StepMonitorLocationPrivate>>> locationPrivates() {
        return Codegen.optional(this.locationPrivates);
    }
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Export(name="locationsPublics", type=List.class, parameters={String.class})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="period", type=String.class, parameters={})
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
    @Export(name="periodInMinutes", type=Integer.class, parameters={})
    private Output<Integer> periodInMinutes;

    /**
     * @return The interval in minutes at which Synthetic monitor should run.
     * 
     */
    public Output<Integer> periodInMinutes() {
        return this.periodInMinutes;
    }
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     * 
     */
    @Export(name="steps", type=List.class, parameters={StepMonitorStep.class})
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
    @Export(name="tags", type=List.class, parameters={StepMonitorTag.class})
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
    public StepMonitor(String name) {
        this(name, StepMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StepMonitor(String name, StepMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StepMonitor(String name, StepMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/stepMonitor:StepMonitor", name, args == null ? StepMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StepMonitor(String name, Output<String> id, @Nullable StepMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/stepMonitor:StepMonitor", name, state, makeResourceOptions(options, id));
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
    public static StepMonitor get(String name, Output<String> id, @Nullable StepMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StepMonitor(name, id, state, options);
    }
}
