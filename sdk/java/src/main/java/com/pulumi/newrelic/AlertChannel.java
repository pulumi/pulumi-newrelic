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
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Email
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .includeJsonAttachment(&#34;true&#34;)
 *                 .recipients(&#34;foo@example.com&#34;)
 *                 .build())
 *             .type(&#34;email&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Additional Examples
 * 
 * ##### Slack
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .channel(&#34;example-alerts-channel&#34;)
 *                 .url(&#34;https://hooks.slack.com/services/XXXXXXX/XXXXXXX/XXXXXXXXXX&#34;)
 *                 .build())
 *             .type(&#34;slack&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** For instructions on setting up Webhooks with Slack, please visit the article linked under the argument `slack` in the aforementioned configuration, or [this article](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-notifications/notification-channels-control-where-send-alerts/#slack) in New Relic&#39;s docs for additional details on setting up the `New Relic Alerts` Slack application, and subsequently using the generated Webhook URL.
 * 
 * ### OpsGenie
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .apiKey(&#34;abc123&#34;)
 *                 .recipients(&#34;user1@domain.com, user2@domain.com&#34;)
 *                 .tags(&#34;tag1, tag2&#34;)
 *                 .teams(&#34;team1, team2&#34;)
 *                 .build())
 *             .type(&#34;opsgenie&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### PagerDuty
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .serviceKey(&#34;abc123&#34;)
 *                 .build())
 *             .type(&#34;pagerduty&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### VictorOps
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .key(&#34;abc123&#34;)
 *                 .routeKey(&#34;/example&#34;)
 *                 .build())
 *             .type(&#34;victorops&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### Webhook
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .type(&#34;webhook&#34;)
 *             .config(AlertChannelConfigArgs.builder()
 *                 .baseUrl(&#34;http://www.test.com&#34;)
 *                 .payloadType(&#34;application/json&#34;)
 *                 .payload(Map.ofEntries(
 *                     Map.entry(&#34;condition_name&#34;, &#34;$CONDITION_NAME&#34;),
 *                     Map.entry(&#34;policy_name&#34;, &#34;$POLICY_NAME&#34;)
 *                 ))
 *                 .headers(Map.ofEntries(
 *                     Map.entry(&#34;header1&#34;, value1),
 *                     Map.entry(&#34;header2&#34;, value2)
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### Webhook with complex payload
 * ```java
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
 *         var foo = new AlertChannel(&#34;foo&#34;, AlertChannelArgs.builder()        
 *             .config(AlertChannelConfigArgs.builder()
 *                 .baseUrl(&#34;http://www.test.com&#34;)
 *                 .payloadString(&#34;&#34;&#34;
 * {
 *   &#34;my_custom_values&#34;: {
 *     &#34;condition_name&#34;: &#34;$CONDITION_NAME&#34;,
 *     &#34;policy_name&#34;: &#34;$POLICY_NAME&#34;
 *   }
 * }
 * 
 *                 &#34;&#34;&#34;)
 *                 .payloadType(&#34;application/json&#34;)
 *                 .build())
 *             .type(&#34;webhook&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Alert channels can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/alertChannel:AlertChannel main &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:index/alertChannel:AlertChannel")
public class AlertChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     * 
     */
    @Export(name="config", type=AlertChannelConfig.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="type", type=String.class, parameters={})
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
    public AlertChannel(String name) {
        this(name, AlertChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertChannel(String name, AlertChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertChannel(String name, AlertChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertChannel:AlertChannel", name, args == null ? AlertChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertChannel(String name, Output<String> id, @Nullable AlertChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertChannel:AlertChannel", name, state, makeResourceOptions(options, id));
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
    public static AlertChannel get(String name, Output<String> id, @Nullable AlertChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertChannel(name, id, state, options);
    }
}
