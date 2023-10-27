// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.DataPartitionRuleArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.DataPartitionRuleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update and delete New Relic Data partition rule.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.DataPartitionRule;
 * import com.pulumi.newrelic.DataPartitionRuleArgs;
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
 *         var foo = new DataPartitionRule(&#34;foo&#34;, DataPartitionRuleArgs.builder()        
 *             .description(&#34;description&#34;)
 *             .enabled(true)
 *             .nrql(&#34;logtype=&#39;node&#39;&#34;)
 *             .retentionPolicy(&#34;STANDARD&#34;)
 *             .targetDataPartition(&#34;Log_name&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Additional Information
 * 
 * More details about the data partition can be found [here](https://docs.newrelic.com/docs/logs/ui-data/data-partitions/)
 * 
 * ## Import
 * 
 * New Relic data partition rule can be imported using the rule ID, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/dataPartitionRule:DataPartitionRule foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/dataPartitionRule:DataPartitionRule")
public class DataPartitionRule extends com.pulumi.resources.CustomResource {
    /**
     * The account id associated with the data partition rule.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The account id associated with the data partition rule.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
     * 
     */
    @Export(name="deleted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleted;

    /**
     * @return Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
     * 
     */
    public Output<Boolean> deleted() {
        return this.deleted;
    }
    /**
     * The description of the data partition rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the data partition rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether or not this data partition rule is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether or not this data partition rule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    @Export(name="nrql", refs={String.class}, tree="[0]")
    private Output<String> nrql;

    /**
     * @return The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    public Output<String> nrql() {
        return this.nrql;
    }
    /**
     * The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    @Export(name="retentionPolicy", refs={String.class}, tree="[0]")
    private Output<String> retentionPolicy;

    /**
     * @return The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    public Output<String> retentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    @Export(name="targetDataPartition", refs={String.class}, tree="[0]")
    private Output<String> targetDataPartition;

    /**
     * @return The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    public Output<String> targetDataPartition() {
        return this.targetDataPartition;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataPartitionRule(String name) {
        this(name, DataPartitionRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataPartitionRule(String name, DataPartitionRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataPartitionRule(String name, DataPartitionRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/dataPartitionRule:DataPartitionRule", name, args == null ? DataPartitionRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataPartitionRule(String name, Output<String> id, @Nullable DataPartitionRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/dataPartitionRule:DataPartitionRule", name, state, makeResourceOptions(options, id));
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
    public static DataPartitionRule get(String name, Output<String> id, @Nullable DataPartitionRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataPartitionRule(name, id, state, options);
    }
}
