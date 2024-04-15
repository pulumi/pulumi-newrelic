// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeState;
import com.pulumi.newrelic.synthetics.outputs.MonitorDowntimeEndRepeat;
import com.pulumi.newrelic.synthetics.outputs.MonitorDowntimeFrequency;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create, update, and delete [Monitor Downtimes](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/using-monitors/monitor-downtimes-disable-monitoring-during-scheduled-maintenance-times/) in New Relic.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeEndRepeatArgs;
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
 *         var foo = new MonitorDowntime(&#34;foo&#34;, MonitorDowntimeArgs.builder()        
 *             .endRepeat(MonitorDowntimeEndRepeatArgs.builder()
 *                 .onDate(&#34;2023-12-20&#34;)
 *                 .build())
 *             .endTime(&#34;2023-12-10T02:45:30&#34;)
 *             .maintenanceDays(            
 *                 &#34;FRIDAY&#34;,
 *                 &#34;SATURDAY&#34;)
 *             .mode(&#34;WEEKLY&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-11-30T10:30:00&#34;)
 *             .timeZone(&#34;Asia/Kolkata&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * Monitor Downtimes are of four types; **one-time**, **daily**, **weekly** and **monthly**. For more details on each type and the right arguments that go with them, check out the argument reference and examples sections below.
 * 
 * ## Examples
 * 
 * ### One-Time Monitor Downtime
 * 
 * The below example illustrates creating a **one-time** monitor downtime.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
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
 *         var sampleOneTimeNewrelicMonitorDowntime = new MonitorDowntime(&#34;sampleOneTimeNewrelicMonitorDowntime&#34;, MonitorDowntimeArgs.builder()        
 *             .endTime(&#34;2024-01-04T16:24:30&#34;)
 *             .mode(&#34;ONE_TIME&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-12-04T10:15:00&#34;)
 *             .timeZone(&#34;America/Los_Angeles&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Daily Monitor Downtime
 * 
 * The below example illustrates creating a **daily** monitor downtime.
 * 
 * Note that `end_repeat` has been specified in the configuration; however, this is optional, in accordance with the rules of `end_repeat` specified in the argument reference section above. This example uses the `on_date` nested argument of `end_repeat`, however, the other nested argument, `on_repeat` may also be used _instead_, as you may see in some of the other examples below; though both `on_date` and `on_repeat` cannot be specified together, as they are mutually exclusive.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeEndRepeatArgs;
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
 *         var sampleDailyNewrelicMonitorDowntime = new MonitorDowntime(&#34;sampleDailyNewrelicMonitorDowntime&#34;, MonitorDowntimeArgs.builder()        
 *             .endRepeat(MonitorDowntimeEndRepeatArgs.builder()
 *                 .onDate(&#34;2023-12-25&#34;)
 *                 .build())
 *             .endTime(&#34;2024-01-04T07:15:00&#34;)
 *             .mode(&#34;DAILY&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-12-04T18:15:00&#34;)
 *             .timeZone(&#34;Asia/Kolkata&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Weekly Monitor Downtime
 * 
 * The below example illustrates creating a **weekly** monitor downtime.
 * 
 * Note that `maintenance_days` has been specified in the configuration as it is required with weekly monitor downtimes; and `end_repeat` has not been specified as it is optional, all in accordance with the rules of these arguments specified in the argument reference section above.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
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
 *         var sampleWeeklyNewrelicMonitorDowntime = new MonitorDowntime(&#34;sampleWeeklyNewrelicMonitorDowntime&#34;, MonitorDowntimeArgs.builder()        
 *             .endTime(&#34;2024-01-04T23:55:00&#34;)
 *             .maintenanceDays(            
 *                 &#34;SATURDAY&#34;,
 *                 &#34;SUNDAY&#34;)
 *             .mode(&#34;WEEKLY&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-12-04T14:15:00&#34;)
 *             .timeZone(&#34;US/Hawaii&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Monthly Monitor Downtime
 * 
 * The below example illustrates creating a **monthly** monitor downtime.
 * 
 * Note that `frequency` has been specified in the configuration as it is required with monthly monitor downtimes, and `end_repeat` has been specified too, though it is optional. `frequency` has been specified with `days_of_week` comprising both of its nested arguments, `ordinal_day_of_month` and `week_day`; all in accordance with the rules of these arguments specified in the argument reference section above.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeEndRepeatArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeFrequencyArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeFrequencyDaysOfWeekArgs;
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
 *         var sampleMonthlyNewrelicMonitorDowntime = new MonitorDowntime(&#34;sampleMonthlyNewrelicMonitorDowntime&#34;, MonitorDowntimeArgs.builder()        
 *             .endRepeat(MonitorDowntimeEndRepeatArgs.builder()
 *                 .onRepeat(6)
 *                 .build())
 *             .endTime(&#34;2024-01-04T19:15:00&#34;)
 *             .frequency(MonitorDowntimeFrequencyArgs.builder()
 *                 .daysOfWeek(MonitorDowntimeFrequencyDaysOfWeekArgs.builder()
 *                     .ordinalDayOfMonth(&#34;SECOND&#34;)
 *                     .weekDay(&#34;SATURDAY&#34;)
 *                     .build())
 *                 .build())
 *             .mode(&#34;MONTHLY&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-12-04T07:15:00&#34;)
 *             .timeZone(&#34;Europe/Dublin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * However, the `frequency` block in monthly monitor downtimes may also be specified with its other nested argument, `days_of_month`, as shown in the example below - though both `days_of_month` and `days_of_week` cannot be specified together, as they are mutually exclusive.
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.MonitorDowntime;
 * import com.pulumi.newrelic.synthetics.MonitorDowntimeArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeEndRepeatArgs;
 * import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeFrequencyArgs;
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
 *         var sampleMonthlyNewrelicMonitorDowntime = new MonitorDowntime(&#34;sampleMonthlyNewrelicMonitorDowntime&#34;, MonitorDowntimeArgs.builder()        
 *             .endRepeat(MonitorDowntimeEndRepeatArgs.builder()
 *                 .onRepeat(6)
 *                 .build())
 *             .endTime(&#34;2024-01-04T19:15:00&#34;)
 *             .frequency(MonitorDowntimeFrequencyArgs.builder()
 *                 .daysOfMonths(                
 *                     3,
 *                     6,
 *                     14,
 *                     23)
 *                 .build())
 *             .mode(&#34;MONTHLY&#34;)
 *             .monitorGuids(            
 *                 &#34;&lt;GUID-1&gt;&#34;,
 *                 &#34;&lt;GUID-2&gt;&#34;)
 *             .startTime(&#34;2023-12-04T07:15:00&#34;)
 *             .timeZone(&#34;Europe/Dublin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * A monitor downtime can be imported into Terraform configuration using its `guid`, i.e.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import newrelic:synthetics/monitorDowntime:MonitorDowntime monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/monitorDowntime:MonitorDowntime")
public class MonitorDowntime extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the monitor downtime would be created. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` (or the `account_id` specified in the `provider{}`), if not specified.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account in which the monitor downtime would be created. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` (or the `account_id` specified in the `provider{}`), if not specified.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Options which may be used to specify when the repeat cycle of the monitor should end. This argument comprises the following nested arguments -
     * 
     */
    @Export(name="endRepeat", refs={MonitorDowntimeEndRepeat.class}, tree="[0]")
    private Output</* @Nullable */ MonitorDowntimeEndRepeat> endRepeat;

    /**
     * @return Options which may be used to specify when the repeat cycle of the monitor should end. This argument comprises the following nested arguments -
     * 
     */
    public Output<Optional<MonitorDowntimeEndRepeat>> endRepeat() {
        return Codegen.optional(this.endRepeat);
    }
    /**
     * The time at which the monitor downtime would end operating, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2024-01-05T14:27:07`.
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return The time at which the monitor downtime would end operating, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2024-01-05T14:27:07`.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * Options which may be used to specify the configuration of a monthly monitor downtime. This argument comprises the following nested arguments -
     * 
     */
    @Export(name="frequency", refs={MonitorDowntimeFrequency.class}, tree="[0]")
    private Output</* @Nullable */ MonitorDowntimeFrequency> frequency;

    /**
     * @return Options which may be used to specify the configuration of a monthly monitor downtime. This argument comprises the following nested arguments -
     * 
     */
    public Output<Optional<MonitorDowntimeFrequency>> frequency() {
        return Codegen.optional(this.frequency);
    }
    /**
     * A list of days on which weekly monitor downtimes would function. Valid values which go into this list would be `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` and/or `&#34;SATURDAY&#34;`.
     * 
     * &gt; **NOTE:** `maintenance_days` **can only be used with the mode** `WEEKLY`, and **is a required argument** with weekly monitor downtimes (i.e. if the `mode` is `WEEKLY`).
     * 
     */
    @Export(name="maintenanceDays", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> maintenanceDays;

    /**
     * @return A list of days on which weekly monitor downtimes would function. Valid values which go into this list would be `&#34;SUNDAY&#34;`, `&#34;MONDAY&#34;`, `&#34;TUESDAY&#34;`, `&#34;WEDNESDAY&#34;`, `&#34;THURSDAY&#34;`, `&#34;FRIDAY&#34;` and/or `&#34;SATURDAY&#34;`.
     * 
     * &gt; **NOTE:** `maintenance_days` **can only be used with the mode** `WEEKLY`, and **is a required argument** with weekly monitor downtimes (i.e. if the `mode` is `WEEKLY`).
     * 
     */
    public Output<Optional<List<String>>> maintenanceDays() {
        return Codegen.optional(this.maintenanceDays);
    }
    /**
     * One of the four modes of operation of monitor downtimes - `ONE_TIME`, `DAILY`, `MONTHLY` or `WEEKLY`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return One of the four modes of operation of monitor downtimes - `ONE_TIME`, `DAILY`, `MONTHLY` or `WEEKLY`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * A list of GUIDs of synthetic monitors the monitor downtime would need to be applied to.
     * 
     */
    @Export(name="monitorGuids", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> monitorGuids;

    /**
     * @return A list of GUIDs of synthetic monitors the monitor downtime would need to be applied to.
     * 
     */
    public Output<Optional<List<String>>> monitorGuids() {
        return Codegen.optional(this.monitorGuids);
    }
    /**
     * Name of the monitor downtime to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the monitor downtime to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The time at which the monitor downtime would begin to operate, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2023-12-20T10:48:53`.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return The time at which the monitor downtime would begin to operate, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2023-12-20T10:48:53`.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The timezone that applies to the Monitor Downtime schedule.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return The timezone that applies to the Monitor Downtime schedule.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorDowntime(String name) {
        this(name, MonitorDowntimeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorDowntime(String name, MonitorDowntimeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorDowntime(String name, MonitorDowntimeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitorDowntime:MonitorDowntime", name, args == null ? MonitorDowntimeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitorDowntime(String name, Output<String> id, @Nullable MonitorDowntimeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/monitorDowntime:MonitorDowntime", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("newrelic:index/monitorDowntime:MonitorDowntime").build())
            ))
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
    public static MonitorDowntime get(String name, Output<String> id, @Nullable MonitorDowntimeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorDowntime(name, id, state, options);
    }
}
