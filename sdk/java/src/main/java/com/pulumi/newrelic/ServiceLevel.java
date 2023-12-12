// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.ServiceLevelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.ServiceLevelState;
import com.pulumi.newrelic.outputs.ServiceLevelEvents;
import com.pulumi.newrelic.outputs.ServiceLevelObjective;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete New Relic Service Level Indicators and Objectives.
 * 
 * A New Relic User API key is required to provision this resource.  Set the `api_key`
 * attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
 * variable with your User API key.
 * 
 * Important:
 * - Only roles that provide [permissions](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/) to create events to metric rules can create SLI/SLOs.
 * - Only [Full users](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/#user-type) can view SLI/SLOs.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.ServiceLevel;
 * import com.pulumi.newrelic.ServiceLevelArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsGoodEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsValidEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowRollingArgs;
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
 *         var foo = new ServiceLevel(&#34;foo&#34;, ServiceLevelArgs.builder()        
 *             .description(&#34;Proportion of requests that are served faster than a threshold.&#34;)
 *             .events(ServiceLevelEventsArgs.builder()
 *                 .accountId(12345678)
 *                 .goodEvents(ServiceLevelEventsGoodEventsArgs.builder()
 *                     .from(&#34;Transaction&#34;)
 *                     .where(&#34;appName = &#39;Example application&#39; AND (transactionType= &#39;Web&#39;) AND duration &lt; 0.1&#34;)
 *                     .build())
 *                 .validEvents(ServiceLevelEventsValidEventsArgs.builder()
 *                     .from(&#34;Transaction&#34;)
 *                     .where(&#34;appName = &#39;Example application&#39; AND (transactionType=&#39;Web&#39;)&#34;)
 *                     .build())
 *                 .build())
 *             .guid(&#34;MXxBUE18QVBQTElDQVRJT058MQ&#34;)
 *             .objective(ServiceLevelObjectiveArgs.builder()
 *                 .target(99)
 *                 .timeWindow(ServiceLevelObjectiveTimeWindowArgs.builder()
 *                     .rolling(ServiceLevelObjectiveTimeWindowRollingArgs.builder()
 *                         .count(7)
 *                         .unit(&#34;DAY&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Additional Example
 * 
 * Service level with tags:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.ServiceLevel;
 * import com.pulumi.newrelic.ServiceLevelArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsValidEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsGoodEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowRollingArgs;
 * import com.pulumi.newrelic.EntityTags;
 * import com.pulumi.newrelic.EntityTagsArgs;
 * import com.pulumi.newrelic.inputs.EntityTagsTagArgs;
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
 *         var mySyntheticMonitorServiceLevel = new ServiceLevel(&#34;mySyntheticMonitorServiceLevel&#34;, ServiceLevelArgs.builder()        
 *             .guid(&#34;MXxBUE18QVBQTElDQVRJT058MQ&#34;)
 *             .description(&#34;Proportion of successful synthetic checks.&#34;)
 *             .events(ServiceLevelEventsArgs.builder()
 *                 .accountId(12345678)
 *                 .validEvents(ServiceLevelEventsValidEventsArgs.builder()
 *                     .from(&#34;SyntheticCheck&#34;)
 *                     .where(&#34;entityGuid = &#39;MXxBUE18QVBQTElDQVRJT058MQ&#39;&#34;)
 *                     .build())
 *                 .goodEvents(ServiceLevelEventsGoodEventsArgs.builder()
 *                     .from(&#34;SyntheticCheck&#34;)
 *                     .where(&#34;entityGuid = &#39;MXxBUE18QVBQTElDQVRJT058MQ&#39; AND result=&#39;SUCCESS&#39;&#34;)
 *                     .build())
 *                 .build())
 *             .objective(ServiceLevelObjectiveArgs.builder()
 *                 .target(99)
 *                 .timeWindow(ServiceLevelObjectiveTimeWindowArgs.builder()
 *                     .rolling(ServiceLevelObjectiveTimeWindowRollingArgs.builder()
 *                         .count(7)
 *                         .unit(&#34;DAY&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var mySyntheticMonitorServiceLevelTags = new EntityTags(&#34;mySyntheticMonitorServiceLevelTags&#34;, EntityTagsArgs.builder()        
 *             .guid(mySyntheticMonitorServiceLevel.sliGuid())
 *             .tags(            
 *                 EntityTagsTagArgs.builder()
 *                     .key(&#34;user_journey&#34;)
 *                     .values(                    
 *                         &#34;authentication&#34;,
 *                         &#34;sso&#34;)
 *                     .build(),
 *                 EntityTagsTagArgs.builder()
 *                     .key(&#34;owner&#34;)
 *                     .values(&#34;identityTeam&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Using `select` for events
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.ServiceLevel;
 * import com.pulumi.newrelic.ServiceLevelArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsGoodEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsGoodEventsSelectArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsValidEventsArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelEventsValidEventsSelectArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowArgs;
 * import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowRollingArgs;
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
 *         var mySyntheticMonitorDurationServiceLevel = new ServiceLevel(&#34;mySyntheticMonitorDurationServiceLevel&#34;, ServiceLevelArgs.builder()        
 *             .description(&#34;Monitor created to test concurrent request from terraform&#34;)
 *             .events(ServiceLevelEventsArgs.builder()
 *                 .accountId(313870)
 *                 .goodEvents(ServiceLevelEventsGoodEventsArgs.builder()
 *                     .from(&#34;Metric&#34;)
 *                     .select(ServiceLevelEventsGoodEventsSelectArgs.builder()
 *                         .attribute(&#34;`query.wallClockTime.negative.distribution`&#34;)
 *                         .function(&#34;GET_CDF_COUNT&#34;)
 *                         .threshold(7)
 *                         .build())
 *                     .where(&#34;metricName = &#39;query.wallClockTime.negative.distribution&#39;&#34;)
 *                     .build())
 *                 .validEvents(ServiceLevelEventsValidEventsArgs.builder()
 *                     .from(&#34;Metric&#34;)
 *                     .select(ServiceLevelEventsValidEventsSelectArgs.builder()
 *                         .attribute(&#34;`query.wallClockTime.negative.distribution`&#34;)
 *                         .function(&#34;GET_FIELD&#34;)
 *                         .build())
 *                     .where(&#34;metricName = &#39;query.wallClockTime.negative.distribution&#39;&#34;)
 *                     .build())
 *                 .build())
 *             .guid(&#34;MXxBUE18QVBQTElDQVRJT058MQ&#34;)
 *             .objective(ServiceLevelObjectiveArgs.builder()
 *                 .target(49)
 *                 .timeWindow(ServiceLevelObjectiveTimeWindowArgs.builder()
 *                     .rolling(ServiceLevelObjectiveTimeWindowRollingArgs.builder()
 *                         .count(7)
 *                         .unit(&#34;DAY&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 * 
 * ## Import
 * 
 * New Relic Service Levels can be imported using a concatenated string of the format
 * 
 * `&lt;account_id&gt;:&lt;sli_id&gt;:&lt;guid&gt;`, where the `guid` is the entity the SLI relates to. Examplebash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/serviceLevel:ServiceLevel foo 12345678:4321:MXxBUE18QVBQTElDQVRJT058MQ
 * ```
 * 
 */
@ResourceType(type="newrelic:index/serviceLevel:ServiceLevel")
public class ServiceLevel extends com.pulumi.resources.CustomResource {
    /**
     * The description of the SLI.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the SLI.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     * 
     */
    @Export(name="events", refs={ServiceLevelEvents.class}, tree="[0]")
    private Output<ServiceLevelEvents> events;

    /**
     * @return The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     * 
     */
    public Output<ServiceLevelEvents> events() {
        return this.events;
    }
    /**
     * The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
     * 
     */
    @Export(name="guid", refs={String.class}, tree="[0]")
    private Output<String> guid;

    /**
     * @return The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The objective of the SLI, only one can be defined.
     * See Objective below for details.
     * 
     */
    @Export(name="objective", refs={ServiceLevelObjective.class}, tree="[0]")
    private Output<ServiceLevelObjective> objective;

    /**
     * @return The objective of the SLI, only one can be defined.
     * See Objective below for details.
     * 
     */
    public Output<ServiceLevelObjective> objective() {
        return this.objective;
    }
    /**
     * The unique entity identifier of the Service Level Indicator in New Relic.
     * 
     */
    @Export(name="sliGuid", refs={String.class}, tree="[0]")
    private Output<String> sliGuid;

    /**
     * @return The unique entity identifier of the Service Level Indicator in New Relic.
     * 
     */
    public Output<String> sliGuid() {
        return this.sliGuid;
    }
    /**
     * The unique entity identifier of the Service Level Indicator.
     * 
     */
    @Export(name="sliId", refs={String.class}, tree="[0]")
    private Output<String> sliId;

    /**
     * @return The unique entity identifier of the Service Level Indicator.
     * 
     */
    public Output<String> sliId() {
        return this.sliId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceLevel(String name) {
        this(name, ServiceLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceLevel(String name, ServiceLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceLevel(String name, ServiceLevelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/serviceLevel:ServiceLevel", name, args == null ? ServiceLevelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceLevel(String name, Output<String> id, @Nullable ServiceLevelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/serviceLevel:ServiceLevel", name, state, makeResourceOptions(options, id));
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
    public static ServiceLevel get(String name, Output<String> id, @Nullable ServiceLevelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceLevel(name, id, state, options);
    }
}
