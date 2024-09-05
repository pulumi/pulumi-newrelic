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
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Use this resource to map alert policies to alert channels in New Relic.
 * 
 * &gt; **WARNING:** The `newrelic.AlertPolicyChannel` resource is **deprecated** and will be **removed in a future major release**. As an alternative, you can map channels to policies using the resource `newrelic.Workflow`, with the channels to be mapped created using a combination of the newer resources `newrelic.NotificationDestination` and `newrelic.NotificationChannel`. We **strongly recommend** migrating to these new resources at the earliest. Please refer to this example for a detailed illustration on setting up channels and workflows with these resources.
 * 
 * ## Example Usage
 * 
 * The example below will apply multiple alert channels to an existing New Relic alert policy.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
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
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         // Fetches the data for this policy from your New Relic account
 *         // and is referenced in the newrelic_alert_policy_channel block below.
 *         final var examplePolicy = NewrelicFunctions.getAlertPolicy(GetAlertPolicyArgs.builder()
 *             .name("my-alert-policy")
 *             .build());
 * 
 *         // Creates an email alert channel.
 *         var emailChannel = new AlertChannel("emailChannel", AlertChannelArgs.builder()
 *             .name("bar")
 *             .type("email")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .recipients("foo}{@literal @}{@code example.com")
 *                 .includeJsonAttachment("1")
 *                 .build())
 *             .build());
 * 
 *         // Creates a Slack alert channel.
 *         var slackChannel = new AlertChannel("slackChannel", AlertChannelArgs.builder()
 *             .name("slack-channel-example")
 *             .type("slack")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .channel("#example-channel")
 *                 .url("http://example-org.slack.com")
 *                 .build())
 *             .build());
 * 
 *         // Applies the created channels above to the alert policy
 *         // referenced at the top of the config.
 *         var foo = new AlertPolicyChannel("foo", AlertPolicyChannelArgs.builder()
 *             .policyId(examplePolicy.applyValue(getAlertPolicyResult -> getAlertPolicyResult.id()))
 *             .channelIds(            
 *                 emailChannel.id(),
 *                 slackChannel.id())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Alert policy channels can be imported using the following notation: `&lt;policyID&gt;:&lt;channelID&gt;:&lt;channelID&gt;`, e.g.
 * 
 * ```sh
 * $ pulumi import newrelic:index/alertPolicyChannel:AlertPolicyChannel foo 123456:3462754:2938324
 * ```
 * When importing `newrelic_alert_policy_channel` resource, the attribute `channel_ids`* will be set in your Terraform state. You can import multiple channels as long as those channel IDs are included as part of the import ID hash.
 * 
 */
@ResourceType(type="newrelic:index/alertPolicyChannel:AlertPolicyChannel")
public class AlertPolicyChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     * 
     */
    @Export(name="channelIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> channelIds;

    /**
     * @return Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     * 
     */
    public Output<List<String>> channelIds() {
        return this.channelIds;
    }
    /**
     * The ID of the policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The ID of the policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertPolicyChannel(java.lang.String name) {
        this(name, AlertPolicyChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertPolicyChannel(java.lang.String name, AlertPolicyChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertPolicyChannel(java.lang.String name, AlertPolicyChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AlertPolicyChannel(java.lang.String name, Output<java.lang.String> id, @Nullable AlertPolicyChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, state, makeResourceOptions(options, id), false);
    }

    private static AlertPolicyChannelArgs makeArgs(AlertPolicyChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AlertPolicyChannelArgs.Empty : args;
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
    public static AlertPolicyChannel get(java.lang.String name, Output<java.lang.String> id, @Nullable AlertPolicyChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertPolicyChannel(name, id, state, options);
    }
}
