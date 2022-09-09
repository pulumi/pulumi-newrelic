// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NotificationChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NotificationChannelState;
import com.pulumi.newrelic.outputs.NotificationChannelProperty;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic notification channels.
 * 
 * ## Example Usage
 * 
 * ##### Webhook
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .destinationId(&#34;1234&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;payload&#34;)
 *                 .label(&#34;Payload Template&#34;)
 *                 .value(&#34;&#34;&#34;
 * {
 * 	&#34;name&#34;: &#34;foo&#34;
 * }
 *                 &#34;&#34;&#34;)
 *                 .build())
 *             .type(&#34;WEBHOOK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * See additional examples.
 * ## Additional Examples
 * 
 * ##### ServiceNow
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .destinationId(&#34;1234&#34;)
 *             .product(&#34;PD&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;description&#34;)
 *                     .value(&#34;General description&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;short_description&#34;)
 *                     .value(&#34;Short description&#34;)
 *                     .build())
 *             .type(&#34;SERVICENOW_INCIDENTS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### Email
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
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
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .destinationId(&#34;1234&#34;)
 *             .product(&#34;ERROR_TRACKING&#34;)
 *             .type(&#34;EMAIL&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### PagerDuty with account integration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .destinationId(&#34;1234&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;summary&#34;)
 *                     .value(&#34;General summary&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;service&#34;)
 *                     .value(&#34;1234&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;email&#34;)
 *                     .value(&#34;test@test.com&#34;)
 *                     .build())
 *             .type(&#34;PAGERDUTY_ACCOUNT_INTEGRATION&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### PagerDuty with service integration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
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
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .destinationId(&#34;1234&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;summary&#34;)
 *                 .value(&#34;General summary&#34;)
 *                 .build())
 *             .type(&#34;PAGERDUTY_SERVICE_INTEGRATION&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
 * 
 */
@ResourceType(type="newrelic:index/notificationChannel:NotificationChannel")
public class NotificationChannel extends com.pulumi.resources.CustomResource {
    /**
     * The id of the destination.
     * 
     */
    @Export(name="destinationId", type=String.class, parameters={})
    private Output<String> destinationId;

    /**
     * @return The id of the destination.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
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
     * The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output<String> product;

    /**
     * @return The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
     * 
     */
    public Output<String> product() {
        return this.product;
    }
    /**
     * A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
     * 
     */
    @Export(name="properties", type=List.class, parameters={NotificationChannelProperty.class})
    private Output</* @Nullable */ List<NotificationChannelProperty>> properties;

    /**
     * @return A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
     * 
     */
    public Output<Optional<List<NotificationChannelProperty>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(String name, NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, args == null ? NotificationChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationChannel(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, state, makeResourceOptions(options, id));
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
    public static NotificationChannel get(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, state, options);
    }
}