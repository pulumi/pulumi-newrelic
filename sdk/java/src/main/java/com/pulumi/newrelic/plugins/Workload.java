// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.plugins.WorkloadArgs;
import com.pulumi.newrelic.plugins.inputs.WorkloadState;
import com.pulumi.newrelic.plugins.outputs.WorkloadEntitySearchQuery;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomatic;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigStatic;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete a New Relic One workload.
 * 
 * A New Relic User API key is required to provision this resource.  Set the `api_key`
 * attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
 * variable with your User API key.
 * 
 * ## Example Usage
 * 
 * Include entities with a certain string on the name.
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.plugins.Workload;
 * import com.pulumi.newrelic.plugins.WorkloadArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
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
 *         var foo = new Workload(&#34;foo&#34;, WorkloadArgs.builder()        
 *             .accountId(12345678)
 *             .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *             .entitySearchQueries(WorkloadEntitySearchQueryArgs.builder()
 *                 .query(&#34;name like &#39;%Example application%&#39;&#34;)
 *                 .build())
 *             .scopeAccountIds(12345678)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Include entities with a set of tags.
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.plugins.Workload;
 * import com.pulumi.newrelic.plugins.WorkloadArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
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
 *         var foo = new Workload(&#34;foo&#34;, WorkloadArgs.builder()        
 *             .accountId(12345678)
 *             .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *             .entitySearchQueries(WorkloadEntitySearchQueryArgs.builder()
 *                 .query(&#34;tags.accountId = &#39;12345678&#39; AND tags.environment=&#39;production&#39; AND tags.language=&#39;java&#39;&#34;)
 *                 .build())
 *             .scopeAccountIds(12345678)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Include entities with a set of tags.
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.plugins.Workload;
 * import com.pulumi.newrelic.plugins.WorkloadArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
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
 *         var foo = new Workload(&#34;foo&#34;, WorkloadArgs.builder()        
 *             .accountId(12345678)
 *             .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *             .entitySearchQueries(WorkloadEntitySearchQueryArgs.builder()
 *                 .query(&#34;tags.accountId = &#39;12345678&#39; AND tags.environment=&#39;production&#39; AND tags.language=&#39;java&#39;&#34;)
 *                 .build())
 *             .scopeAccountIds(12345678)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Include automatic status
 * 
 * &gt; The global status of your workload is a quick indicator of the workload health. You can configure it to be calculated automatically, and you can also set an alert and get a notification whenever the workload stops being operational. Alternatively, you can communicate a certain status of the workload by setting up a static value and a description. [See our docs](https://docs.newrelic.com/docs/workloads/use-workloads/workloads/workload-status)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.plugins.Workload;
 * import com.pulumi.newrelic.plugins.WorkloadArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs;
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
 *         var foo = new Workload(&#34;foo&#34;, WorkloadArgs.builder()        
 *             .accountId(12345678)
 *             .description(&#34;Description&#34;)
 *             .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *             .entitySearchQueries(WorkloadEntitySearchQueryArgs.builder()
 *                 .query(&#34;name like &#39;%Example application%&#39;&#34;)
 *                 .build())
 *             .scopeAccountIds(12345678)
 *             .statusConfigAutomatic(WorkloadStatusConfigAutomaticArgs.builder()
 *                 .enabled(true)
 *                 .remainingEntitiesRule(WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs.builder()
 *                     .remainingEntitiesRuleRollup(WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs.builder()
 *                         .groupBy(&#34;ENTITY_TYPE&#34;)
 *                         .strategy(&#34;BEST_STATUS_WINS&#34;)
 *                         .thresholdType(&#34;FIXED&#34;)
 *                         .thresholdValue(100)
 *                         .build())
 *                     .build())
 *                 .rules(WorkloadStatusConfigAutomaticRuleArgs.builder()
 *                     .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *                     .nrqlQuery(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .rollup(WorkloadStatusConfigAutomaticRuleRollupArgs.builder()
 *                         .strategy(&#34;BEST_STATUS_WINS&#34;)
 *                         .thresholdType(&#34;FIXED&#34;)
 *                         .thresholdValue(100)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Include static status
 * 
 * &gt; You can use this during maintenance tasks or any other time you want to provide a fixed status for your workload. This overrides all automatic rules. [See our docs](https://docs.newrelic.com/docs/workloads/use-workloads/workloads/workload-status#configure-static)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.plugins.Workload;
 * import com.pulumi.newrelic.plugins.WorkloadArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
 * import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigStaticArgs;
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
 *         var foo = new Workload(&#34;foo&#34;, WorkloadArgs.builder()        
 *             .accountId(12345678)
 *             .description(&#34;Description&#34;)
 *             .entityGuids(&#34;MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1&#34;)
 *             .entitySearchQueries(WorkloadEntitySearchQueryArgs.builder()
 *                 .query(&#34;name like &#39;%Example application%&#39;&#34;)
 *                 .build())
 *             .scopeAccountIds(12345678)
 *             .statusConfigStatic(WorkloadStatusConfigStaticArgs.builder()
 *                 .description(&#34;test&#34;)
 *                 .enabled(true)
 *                 .status(&#34;OPERATIONAL&#34;)
 *                 .summary(&#34;summary of the status&#34;)
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
 * New Relic workloads can be imported using a concatenated string of the format
 * 
 *  `&lt;account_id&gt;:&lt;workload_id&gt;:&lt;guid&gt;`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:plugins/workload:Workload foo 12345678:1456:MjUyMDUyOHxBUE18QVBRTElDQVRJT058MjE1MDM3Nzk1
 * ```
 * 
 */
@ResourceType(type="newrelic:plugins/workload:Workload")
public class Workload extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID where you want to create the workload.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The New Relic account ID where you want to create the workload.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The composite query used to compose a dynamic workload.
     * 
     */
    @Export(name="compositeEntitySearchQuery", refs={String.class}, tree="[0]")
    private Output<String> compositeEntitySearchQuery;

    /**
     * @return The composite query used to compose a dynamic workload.
     * 
     */
    public Output<String> compositeEntitySearchQuery() {
        return this.compositeEntitySearchQuery;
    }
    /**
     * Relevant information about the workload.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Relevant information about the workload.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A list of entity GUIDs manually assigned to this workload. At least one of either `entity_guids` or `entity_search_query` is required.
     * 
     */
    @Export(name="entityGuids", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> entityGuids;

    /**
     * @return A list of entity GUIDs manually assigned to this workload. At least one of either `entity_guids` or `entity_search_query` is required.
     * 
     */
    public Output<List<String>> entityGuids() {
        return this.entityGuids;
    }
    /**
     * A list of search queries that define a dynamic workload. At least one of either `entity_guids` or `entity_search_query` is required. See Nested entity_search_query blocks below for details.
     * 
     */
    @Export(name="entitySearchQueries", refs={List.class,WorkloadEntitySearchQuery.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkloadEntitySearchQuery>> entitySearchQueries;

    /**
     * @return A list of search queries that define a dynamic workload. At least one of either `entity_guids` or `entity_search_query` is required. See Nested entity_search_query blocks below for details.
     * 
     */
    public Output<Optional<List<WorkloadEntitySearchQuery>>> entitySearchQueries() {
        return Codegen.optional(this.entitySearchQueries);
    }
    /**
     * The unique entity identifier of the workload in New Relic.
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return The unique entity identifier of the workload in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The workload&#39;s name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The workload&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the workload.
     * 
     */
    @Export(name="permalink", refs={String.class}, tree="[0]")
    private Output<String> permalink;

    /**
     * @return The URL of the workload.
     * 
     */
    public Output<String> permalink() {
        return this.permalink;
    }
    /**
     * A list of account IDs that will be used to get entities from.
     * 
     */
    @Export(name="scopeAccountIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> scopeAccountIds;

    /**
     * @return A list of account IDs that will be used to get entities from.
     * 
     */
    public Output<List<String>> scopeAccountIds() {
        return this.scopeAccountIds;
    }
    /**
     * An input object used to represent an automatic status configuration.See Nested status_config_automatic blocks below for details.
     * 
     */
    @Export(name="statusConfigAutomatic", refs={WorkloadStatusConfigAutomatic.class}, tree="[0]")
    private Output</* @Nullable */ WorkloadStatusConfigAutomatic> statusConfigAutomatic;

    /**
     * @return An input object used to represent an automatic status configuration.See Nested status_config_automatic blocks below for details.
     * 
     */
    public Output<Optional<WorkloadStatusConfigAutomatic>> statusConfigAutomatic() {
        return Codegen.optional(this.statusConfigAutomatic);
    }
    /**
     * A list of static status configurations. You can only configure one static status for a workload.See Nested status_config_static blocks below for details.
     * 
     */
    @Export(name="statusConfigStatic", refs={WorkloadStatusConfigStatic.class}, tree="[0]")
    private Output</* @Nullable */ WorkloadStatusConfigStatic> statusConfigStatic;

    /**
     * @return A list of static status configurations. You can only configure one static status for a workload.See Nested status_config_static blocks below for details.
     * 
     */
    public Output<Optional<WorkloadStatusConfigStatic>> statusConfigStatic() {
        return Codegen.optional(this.statusConfigStatic);
    }
    /**
     * The unique entity identifier of the workload.
     * 
     */
    @Export(name="workloadId", refs={String.class}, tree="[0]")
    private Output<String> workloadId;

    /**
     * @return The unique entity identifier of the workload.
     * 
     */
    public Output<String> workloadId() {
        return this.workloadId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workload(String name) {
        this(name, WorkloadArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workload(String name, @Nullable WorkloadArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workload(String name, @Nullable WorkloadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:plugins/workload:Workload", name, args == null ? WorkloadArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workload(String name, Output<String> id, @Nullable WorkloadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:plugins/workload:Workload", name, state, makeResourceOptions(options, id));
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
    public static Workload get(String name, Output<String> id, @Nullable WorkloadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workload(name, id, state, options);
    }
}
