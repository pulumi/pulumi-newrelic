// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.MonitorScriptArgs;
import com.pulumi.newrelic.synthetics.inputs.MonitorScriptState;
import com.pulumi.newrelic.synthetics.outputs.MonitorScriptLocation;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to update a synthetics monitor script in New Relic.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.Monitor;
 * import com.pulumi.newrelic.synthetics.MonitorArgs;
 * import com.pulumi.newrelic.synthetics.MonitorScript;
 * import com.pulumi.newrelic.synthetics.MonitorScriptArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorScriptLocationArgs;
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
 *         var foo = new Monitor(&#34;foo&#34;, MonitorArgs.builder()        
 *             .type(&#34;SCRIPT_BROWSER&#34;)
 *             .frequency(5)
 *             .status(&#34;ENABLED&#34;)
 *             .locations(&#34;AWS_US_EAST_1&#34;)
 *             .build());
 * 
 *         var fooScript = new MonitorScript(&#34;fooScript&#34;, MonitorScriptArgs.builder()        
 *             .monitorId(foo.id())
 *             .text(Files.readString(Paths.get(String.format(&#34;%s/foo_script.js&#34;, path.module()))))
 *             .locations(MonitorScriptLocationArgs.builder()
 *                 .name(&#34;YWJjZAo=&#34;)
 *                 .hmac(&#34;ZmFrZWxvY2F0aW9uc2NyaXB0ZmFrZQ==&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synthetics monitor scripts can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:synthetics/monitorScript:MonitorScript main &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/monitorScript:MonitorScript")
public class MonitorScript extends com.pulumi.resources.CustomResource {
    /**
     * A nested block that describes a monitor script location. See Nested location blocks below for details
     * 
     */
    @Export(name="locations", type=List.class, parameters={MonitorScriptLocation.class})
    private Output</* @Nullable */ List<MonitorScriptLocation>> locations;

    /**
     * @return A nested block that describes a monitor script location. See Nested location blocks below for details
     * 
     */
    public Output<Optional<List<MonitorScriptLocation>>> locations() {
        return Codegen.optional(this.locations);
    }
    /**
     * The ID of the monitor to attach the script to.
     * 
     */
    @Export(name="monitorId", type=String.class, parameters={})
    private Output<String> monitorId;

    /**
     * @return The ID of the monitor to attach the script to.
     * 
     */
    public Output<String> monitorId() {
        return this.monitorId;
    }
    /**
     * The plaintext representing the monitor script.
     * 
     */
    @Export(name="text", type=String.class, parameters={})
    private Output<String> text;

    /**
     * @return The plaintext representing the monitor script.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorScript(String name) {
        this(name, MonitorScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorScript(String name, MonitorScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorScript(String name, MonitorScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitorScript:MonitorScript", name, args == null ? MonitorScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitorScript(String name, Output<String> id, @Nullable MonitorScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitorScript:MonitorScript", name, state, makeResourceOptions(options, id));
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
    public static MonitorScript get(String name, Output<String> id, @Nullable MonitorScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorScript(name, id, state, options);
    }
}
