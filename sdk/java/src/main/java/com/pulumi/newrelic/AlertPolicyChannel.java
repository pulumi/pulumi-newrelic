// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.AlertPolicyChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.AlertPolicyChannelState;
import java.lang.Integer;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * The example below will apply multiple alert channels to an existing New Relic alert policy.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NewrelicFunctions;
 * import com.pulumi.newrelic.inputs.GetAlertPolicyArgs;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
 * import com.pulumi.newrelic.AlertPolicyChannel;
 * import com.pulumi.newrelic.AlertPolicyChannelArgs;
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
 *         final var examplePolicy = NewrelicFunctions.getAlertPolicy(GetAlertPolicyArgs.builder()
 *             .name(&#34;my-alert-policy&#34;)
 *             .build());
 * 
 *         var emailChannel = new AlertChannel(&#34;emailChannel&#34;, AlertChannelArgs.builder()        
 *             .type(&#34;email&#34;)
 *             .config(AlertChannelConfigArgs.builder()
 *                 .recipients(&#34;foo@example.com&#34;)
 *                 .includeJsonAttachment(&#34;1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var slackChannel = new AlertChannel(&#34;slackChannel&#34;, AlertChannelArgs.builder()        
 *             .type(&#34;slack&#34;)
 *             .config(AlertChannelConfigArgs.builder()
 *                 .channel(&#34;#example-channel&#34;)
 *                 .url(&#34;http://example-org.slack.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var foo = new AlertPolicyChannel(&#34;foo&#34;, AlertPolicyChannelArgs.builder()        
 *             .policyId(examplePolicy.applyValue(getAlertPolicyResult -&gt; getAlertPolicyResult.id()))
 *             .channelIds(            
 *                 emailChannel.id(),
 *                 slackChannel.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Alert policy channels can be imported using the following notation`&lt;policyID&gt;:&lt;channelID&gt;:&lt;channelID&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import newrelic:index/alertPolicyChannel:AlertPolicyChannel foo 123456:3462754:2938324
 * ```
 * 
 *  When importing `newrelic_alert_policy_channel` resource, the attribute `channel_ids`\* will be set in your Terraform state. You can import multiple channels as long as those channel IDs are included as part of the import ID hash.
 * 
 */
@ResourceType(type="newrelic:index/alertPolicyChannel:AlertPolicyChannel")
public class AlertPolicyChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     * 
     */
    @Export(name="channelIds", type=List.class, parameters={Integer.class})
    private Output<List<Integer>> channelIds;

    /**
     * @return Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     * 
     */
    public Output<List<Integer>> channelIds() {
        return this.channelIds;
    }
    /**
     * The ID of the policy.
     * 
     */
    @Export(name="policyId", type=Integer.class, parameters={})
    private Output<Integer> policyId;

    /**
     * @return The ID of the policy.
     * 
     */
    public Output<Integer> policyId() {
        return this.policyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertPolicyChannel(String name) {
        this(name, AlertPolicyChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertPolicyChannel(String name, AlertPolicyChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertPolicyChannel(String name, AlertPolicyChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, args == null ? AlertPolicyChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertPolicyChannel(String name, Output<String> id, @Nullable AlertPolicyChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, state, makeResourceOptions(options, id));
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
    public static AlertPolicyChannel get(String name, Output<String> id, @Nullable AlertPolicyChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertPolicyChannel(name, id, state, options);
    }
}
