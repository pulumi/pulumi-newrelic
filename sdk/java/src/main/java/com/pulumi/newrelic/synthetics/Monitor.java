// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.MonitorArgs;
import com.pulumi.newrelic.synthetics.inputs.MonitorState;
import com.pulumi.newrelic.synthetics.outputs.MonitorCustomHeader;
import com.pulumi.newrelic.synthetics.outputs.MonitorTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
 * 
 * Use this resource to create, update, and delete a Simple or Browser Synthetics Monitor in New Relic.
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
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
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
 *         var monitor = new Monitor("monitor", MonitorArgs.builder()
 *             .status("ENABLED")
 *             .name("monitor")
 *             .period("EVERY_MINUTE")
 *             .uri("https://www.one.newrelic.com")
 *             .type("SIMPLE")
 *             .locationsPublics("AP_SOUTH_1")
 *             .customHeaders(MonitorCustomHeaderArgs.builder()
 *                 .name("some_name")
 *                 .value("some_value")
 *                 .build())
 *             .treatRedirectAsFailure(true)
 *             .validationString("success")
 *             .bypassHeadRequest(true)
 *             .verifySsl(true)
 *             .tags(MonitorTagArgs.builder()
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
 * ##### Type: `SIMPLE BROWSER`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
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
 *         var monitor = new Monitor("monitor", MonitorArgs.builder()
 *             .status("ENABLED")
 *             .name("monitor")
 *             .period("EVERY_MINUTE")
 *             .uri("https://www.one.newrelic.com")
 *             .type("BROWSER")
 *             .locationsPublics("AP_SOUTH_1")
 *             .customHeaders(MonitorCustomHeaderArgs.builder()
 *                 .name("some_name")
 *                 .value("some_value")
 *                 .build())
 *             .enableScreenshotOnFailureAndScript(true)
 *             .validationString("success")
 *             .verifySsl(true)
 *             .runtimeType("CHROME_BROWSER")
 *             .runtimeTypeVersion("100")
 *             .scriptLanguage("JAVASCRIPT")
 *             .deviceType("MOBILE")
 *             .deviceOrientation("LANDSCAPE")
 *             .tags(MonitorTagArgs.builder()
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
 * ##### Type: `SIMPLE`
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
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
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
 *         var location = new PrivateLocation("location", PrivateLocationArgs.builder()
 *             .description("Example private location")
 *             .name("private_location")
 *             .verifiedScriptExecution(false)
 *             .build());
 * 
 *         var monitor = new Monitor("monitor", MonitorArgs.builder()
 *             .status("ENABLED")
 *             .name("monitor")
 *             .period("EVERY_MINUTE")
 *             .uri("https://www.one.newrelic.com")
 *             .type("SIMPLE")
 *             .locationsPrivates(location.id())
 *             .customHeaders(MonitorCustomHeaderArgs.builder()
 *                 .name("some_name")
 *                 .value("some_value")
 *                 .build())
 *             .treatRedirectAsFailure(true)
 *             .validationString("success")
 *             .bypassHeadRequest(true)
 *             .verifySsl(true)
 *             .tags(MonitorTagArgs.builder()
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
 * ##### Type: `BROWSER`
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
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
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
 *         var location = new PrivateLocation("location", PrivateLocationArgs.builder()
 *             .description("Example private location")
 *             .name("private-location")
 *             .verifiedScriptExecution(false)
 *             .build());
 * 
 *         var monitor = new Monitor("monitor", MonitorArgs.builder()
 *             .status("ENABLED")
 *             .type("BROWSER")
 *             .uri("https://www.one.newrelic.com")
 *             .name("monitor")
 *             .period("EVERY_MINUTE")
 *             .locationsPrivates(location.id())
 *             .customHeaders(MonitorCustomHeaderArgs.builder()
 *                 .name("some_name")
 *                 .value("some_value")
 *                 .build())
 *             .enableScreenshotOnFailureAndScript(true)
 *             .validationString("success")
 *             .verifySsl(true)
 *             .runtimeTypeVersion("100")
 *             .runtimeType("CHROME_BROWSER")
 *             .scriptLanguage("JAVASCRIPT")
 *             .tags(MonitorTagArgs.builder()
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
 * Synthetics monitor can be imported using the `guid`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/monitor:Monitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/monitor:Monitor")
public class Monitor extends com.pulumi.resources.CustomResource {
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
     * Monitor should skip default HEAD request and instead use GET verb in check.
     * 
     * The `BROWSER` monitor type supports the following additional arguments:
     * 
     */
    @Export(name="bypassHeadRequest", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bypassHeadRequest;

    /**
     * @return Monitor should skip default HEAD request and instead use GET verb in check.
     * 
     * The `BROWSER` monitor type supports the following additional arguments:
     * 
     */
    public Output<Optional<Boolean>> bypassHeadRequest() {
        return Codegen.optional(this.bypassHeadRequest);
    }
    /**
     * Custom headers to use in monitor job. See Nested custom_header blocks below for details.
     * 
     */
    @Export(name="customHeaders", refs={List.class,MonitorCustomHeader.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MonitorCustomHeader>> customHeaders;

    /**
     * @return Custom headers to use in monitor job. See Nested custom_header blocks below for details.
     * 
     */
    public Output<Optional<List<MonitorCustomHeader>>> customHeaders() {
        return Codegen.optional(this.customHeaders);
    }
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     * 
     */
    @Export(name="deviceOrientation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deviceOrientation;

    /**
     * @return Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     * 
     */
    public Output<Optional<String>> deviceOrientation() {
        return Codegen.optional(this.deviceOrientation);
    }
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     * 
     */
    @Export(name="deviceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deviceType;

    /**
     * @return Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     * 
     */
    public Output<Optional<String>> deviceType() {
        return Codegen.optional(this.deviceType);
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
     * The human-readable identifier for the monitor.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The human-readable identifier for the monitor.
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
     * The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
     * 
     */
    @Export(name="runtimeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeType;

    /**
     * @return The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
     * 
     */
    public Output<Optional<String>> runtimeType() {
        return Codegen.optional(this.runtimeType);
    }
    /**
     * The runtime type that the monitor will run. Valid value is `100`.
     * 
     */
    @Export(name="runtimeTypeVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeTypeVersion;

    /**
     * @return The runtime type that the monitor will run. Valid value is `100`.
     * 
     */
    public Output<Optional<String>> runtimeTypeVersion() {
        return Codegen.optional(this.runtimeTypeVersion);
    }
    /**
     * The programing language that should execute the script.
     * 
     */
    @Export(name="scriptLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scriptLanguage;

    /**
     * @return The programing language that should execute the script.
     * 
     */
    public Output<Optional<String>> scriptLanguage() {
        return Codegen.optional(this.scriptLanguage);
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
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SIMPLE` monitor type supports the following additional arguments:
     * 
     */
    @Export(name="tags", refs={List.class,MonitorTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MonitorTag>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SIMPLE` monitor type supports the following additional arguments:
     * 
     */
    public Output<Optional<List<MonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Categorize redirects during a monitor job as a failure.
     * 
     */
    @Export(name="treatRedirectAsFailure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> treatRedirectAsFailure;

    /**
     * @return Categorize redirects during a monitor job as a failure.
     * 
     */
    public Output<Optional<Boolean>> treatRedirectAsFailure() {
        return Codegen.optional(this.treatRedirectAsFailure);
    }
    /**
     * The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The URI the monitor runs against.
     * 
     */
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uri;

    /**
     * @return The URI the monitor runs against.
     * 
     */
    public Output<Optional<String>> uri() {
        return Codegen.optional(this.uri);
    }
    /**
     * Validation text for monitor to search for at given URI.
     * 
     */
    @Export(name="validationString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validationString;

    /**
     * @return Validation text for monitor to search for at given URI.
     * 
     */
    public Output<Optional<String>> validationString() {
        return Codegen.optional(this.validationString);
    }
    /**
     * Monitor should validate SSL certificate chain.
     * 
     */
    @Export(name="verifySsl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> verifySsl;

    /**
     * @return Monitor should validate SSL certificate chain.
     * 
     */
    public Output<Optional<Boolean>> verifySsl() {
        return Codegen.optional(this.verifySsl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Monitor(String name) {
        this(name, MonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Monitor(String name, MonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Monitor(String name, MonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitor:Monitor", name, args == null ? MonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Monitor(String name, Output<String> id, @Nullable MonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitor:Monitor", name, state, makeResourceOptions(options, id));
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
    public static Monitor get(String name, Output<String> id, @Nullable MonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Monitor(name, id, state, options);
    }
}
