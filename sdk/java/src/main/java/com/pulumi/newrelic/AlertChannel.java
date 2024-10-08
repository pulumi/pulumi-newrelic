// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.AlertChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.AlertChannelState;
import com.pulumi.newrelic.outputs.AlertChannelConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic alert channels.
 * 
 * &gt; **WARNING:** The `newrelic.AlertChannel` resource is **deprecated** and will be **removed in a future major release**. As an alternative, you can set up channels using a combination of the newer resources `newrelic.NotificationDestination` and `newrelic.NotificationChannel`. We **strongly recommend** migrating to these new resources at the earliest. Please refer to this example for a detailed illustration on setting up channels with these resources.
 * 
 * ## Example Usage
 * 
 * ### Email
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("foo")
 *             .type("email")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .recipients("foo}{@literal @}{@code example.com")
 *                 .includeJsonAttachment("true")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Additional Examples
 * 
 * ##### Slack
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("slack-example")
 *             .type("slack")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .url("https://hooks.slack.com/services/XXXXXXX/XXXXXXX/XXXXXXXXXX")
 *                 .channel("example-alerts-channel")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **NOTE:** For instructions on setting up Webhooks with Slack, please visit the article linked under the argument `slack` in the aforementioned configuration, or [this article](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-notifications/notification-channels-control-where-send-alerts/#slack) in New Relic&#39;s docs for additional details on setting up the `New Relic Alerts` Slack application, and subsequently using the generated Webhook URL.
 * 
 * ### OpsGenie
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("opsgenie-example")
 *             .type("opsgenie")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .apiKey("abc123")
 *                 .teams("team1, team2")
 *                 .tags("tag1, tag2")
 *                 .recipients("user1}{@literal @}{@code domain.com, user2}{@literal @}{@code domain.com")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### PagerDuty
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("pagerduty-example")
 *             .type("pagerduty")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .serviceKey("abc123")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### VictorOps
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("victorops-example")
 *             .type("victorops")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .key("abc123")
 *                 .routeKey("/example")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Webhook
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("webhook-example")
 *             .type("webhook")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .baseUrl("http://www.test.com")
 *                 .payloadType("application/json")
 *                 .payload(Map.ofEntries(
 *                     Map.entry("condition_name", "$CONDITION_NAME"),
 *                     Map.entry("policy_name", "$POLICY_NAME")
 *                 ))
 *                 .headers(Map.ofEntries(
 *                     Map.entry("header1", value1),
 *                     Map.entry("header2", value2)
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Webhook with complex payload
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertChannel;
 * import com.pulumi.newrelic.AlertChannelArgs;
 * import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
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
 *         var foo = new AlertChannel("foo", AlertChannelArgs.builder()
 *             .name("webhook-example")
 *             .type("webhook")
 *             .config(AlertChannelConfigArgs.builder()
 *                 .baseUrl("http://www.test.com")
 *                 .payloadType("application/json")
 *                 .payloadString("""
 * {
 *   "my_custom_values": {
 *     "condition_name": "$CONDITION_NAME",
 *     "policy_name": "$POLICY_NAME"
 *   }
 * }
 *                 """)
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
 * Alert channels can be imported using the `id`, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:index/alertChannel:AlertChannel main &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/alertChannel:AlertChannel")
public class AlertChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     * 
     */
    @Export(name="config", refs={AlertChannelConfig.class}, tree="[0]")
    private Output</* @Nullable */ AlertChannelConfig> config;

    /**
     * @return A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     * 
     */
    public Output<Optional<AlertChannelConfig>> config() {
        return Codegen.optional(this.config);
    }
    /**
     * The name of the channel.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertChannel(java.lang.String name) {
        this(name, AlertChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertChannel(java.lang.String name, AlertChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertChannel(java.lang.String name, AlertChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertChannel:AlertChannel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AlertChannel(java.lang.String name, Output<java.lang.String> id, @Nullable AlertChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertChannel:AlertChannel", name, state, makeResourceOptions(options, id), false);
    }

    private static AlertChannelArgs makeArgs(AlertChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AlertChannelArgs.Empty : args;
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
    public static AlertChannel get(java.lang.String name, Output<java.lang.String> id, @Nullable AlertChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertChannel(name, id, state, options);
    }
}
