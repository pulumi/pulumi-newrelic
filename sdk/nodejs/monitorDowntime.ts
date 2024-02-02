// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update, and delete [Monitor Downtimes](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/using-monitors/monitor-downtimes-disable-monitoring-during-scheduled-maintenance-times/) in New Relic.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.MonitorDowntime("foo", {
 *     endRepeat: {
 *         onDate: "2023-12-20",
 *     },
 *     endTime: "2023-12-10T02:45:30",
 *     maintenanceDays: [
 *         "FRIDAY",
 *         "SATURDAY",
 *     ],
 *     mode: "WEEKLY",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-11-30T10:30:00",
 *     timeZone: "Asia/Kolkata",
 * });
 * ```
 * Monitor Downtimes are of four types; **one-time**, **daily**, **weekly** and **monthly**. For more details on each type and the right arguments that go with them, check out the argument reference and examples sections below.
 * ## Examples
 *
 * ### One-Time Monitor Downtime
 *
 * The below example illustrates creating a **one-time** monitor downtime.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const sampleOneTimeNewrelicMonitorDowntime = new newrelic.MonitorDowntime("sampleOneTimeNewrelicMonitorDowntime", {
 *     endTime: "2024-01-04T16:24:30",
 *     mode: "ONE_TIME",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-12-04T10:15:00",
 *     timeZone: "America/Los_Angeles",
 * });
 * ```
 *
 * ### Daily Monitor Downtime
 *
 * The below example illustrates creating a **daily** monitor downtime.
 *
 * Note that `endRepeat` has been specified in the configuration; however, this is optional, in accordance with the rules of `endRepeat` specified in the argument reference section above. This example uses the `onDate` nested argument of `endRepeat`, however, the other nested argument, `onRepeat` may also be used _instead_, as you may see in some of the other examples below; though both `onDate` and `onRepeat` cannot be specified together, as they are mutually exclusive.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const sampleDailyNewrelicMonitorDowntime = new newrelic.MonitorDowntime("sampleDailyNewrelicMonitorDowntime", {
 *     endRepeat: {
 *         onDate: "2023-12-25",
 *     },
 *     endTime: "2024-01-04T07:15:00",
 *     mode: "DAILY",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-12-04T18:15:00",
 *     timeZone: "Asia/Kolkata",
 * });
 * ```
 *
 * ### Weekly Monitor Downtime
 *
 * The below example illustrates creating a **weekly** monitor downtime.
 *
 * Note that `maintenanceDays` has been specified in the configuration as it is required with weekly monitor downtimes; and `endRepeat` has not been specified as it is optional, all in accordance with the rules of these arguments specified in the argument reference section above.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const sampleWeeklyNewrelicMonitorDowntime = new newrelic.MonitorDowntime("sampleWeeklyNewrelicMonitorDowntime", {
 *     endTime: "2024-01-04T23:55:00",
 *     maintenanceDays: [
 *         "SATURDAY",
 *         "SUNDAY",
 *     ],
 *     mode: "WEEKLY",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-12-04T14:15:00",
 *     timeZone: "US/Hawaii",
 * });
 * ```
 *
 * ### Monthly Monitor Downtime
 *
 * The below example illustrates creating a **monthly** monitor downtime.
 *
 * Note that `frequency` has been specified in the configuration as it is required with monthly monitor downtimes, and `endRepeat` has been specified too, though it is optional. `frequency` has been specified with `daysOfWeek` comprising both of its nested arguments, `ordinalDayOfMonth` and `weekDay`; all in accordance with the rules of these arguments specified in the argument reference section above.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const sampleMonthlyNewrelicMonitorDowntime = new newrelic.MonitorDowntime("sampleMonthlyNewrelicMonitorDowntime", {
 *     endRepeat: {
 *         onRepeat: 6,
 *     },
 *     endTime: "2024-01-04T19:15:00",
 *     frequency: {
 *         daysOfWeek: {
 *             ordinalDayOfMonth: "SECOND",
 *             weekDay: "SATURDAY",
 *         },
 *     },
 *     mode: "MONTHLY",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-12-04T07:15:00",
 *     timeZone: "Europe/Dublin",
 * });
 * ```
 * However, the `frequency` block in monthly monitor downtimes may also be specified with its other nested argument, `daysOfMonth`, as shown in the example below - though both `daysOfMonth` and `daysOfWeek` cannot be specified together, as they are mutually exclusive.
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const sampleMonthlyNewrelicMonitorDowntime = new newrelic.MonitorDowntime("sampleMonthlyNewrelicMonitorDowntime", {
 *     endRepeat: {
 *         onRepeat: 6,
 *     },
 *     endTime: "2024-01-04T19:15:00",
 *     frequency: {
 *         daysOfMonths: [
 *             3,
 *             6,
 *             14,
 *             23,
 *         ],
 *     },
 *     mode: "MONTHLY",
 *     monitorGuids: [
 *         "<GUID-1>",
 *         "<GUID-2>",
 *     ],
 *     startTime: "2023-12-04T07:15:00",
 *     timeZone: "Europe/Dublin",
 * });
 * ```
 *
 * ## Import
 *
 * A monitor downtime can be imported into Terraform configuration using its `guid`, i.e. bash
 *
 * ```sh
 *  $ pulumi import newrelic:index/monitorDowntime:MonitorDowntime monitor <guid>
 * ```
 */
export class MonitorDowntime extends pulumi.CustomResource {
    /**
     * Get an existing MonitorDowntime resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MonitorDowntimeState, opts?: pulumi.CustomResourceOptions): MonitorDowntime {
        return new MonitorDowntime(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/monitorDowntime:MonitorDowntime';

    /**
     * Returns true if the given object is an instance of MonitorDowntime.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MonitorDowntime {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MonitorDowntime.__pulumiType;
    }

    /**
     * The account in which the monitor downtime would be created. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` (or the `accountId` specified in the `provider{}`), if not specified.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Options which may be used to specify when the repeat cycle of the monitor should end. This argument comprises the following nested arguments -
     */
    public readonly endRepeat!: pulumi.Output<outputs.MonitorDowntimeEndRepeat | undefined>;
    /**
     * The time at which the monitor downtime would end operating, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2024-01-05T14:27:07`.
     */
    public readonly endTime!: pulumi.Output<string>;
    /**
     * Options which may be used to specify the configuration of a monthly monitor downtime. This argument comprises the following nested arguments -
     */
    public readonly frequency!: pulumi.Output<outputs.MonitorDowntimeFrequency | undefined>;
    /**
     * A list of days on which weekly monitor downtimes would function. Valid values which go into this list would be `"SUNDAY"`, `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"` and/or `"SATURDAY"`.
     *
     * > **NOTE:** `maintenanceDays` **can only be used with the mode** `WEEKLY`, and **is a required argument** with weekly monitor downtimes (i.e. if the `mode` is `WEEKLY`).
     */
    public readonly maintenanceDays!: pulumi.Output<string[] | undefined>;
    /**
     * One of the four modes of operation of monitor downtimes - `ONE_TIME`, `DAILY`, `MONTHLY` or `WEEKLY`.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * A list of GUIDs of synthetic monitors the monitor downtime would need to be applied to.
     */
    public readonly monitorGuids!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the monitor downtime to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The time at which the monitor downtime would begin to operate, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2023-12-20T10:48:53`.
     */
    public readonly startTime!: pulumi.Output<string>;
    /**
     * The timezone that applies to the Monitor Downtime schedule.
     */
    public readonly timeZone!: pulumi.Output<string>;

    /**
     * Create a MonitorDowntime resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MonitorDowntimeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MonitorDowntimeArgs | MonitorDowntimeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MonitorDowntimeState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["endRepeat"] = state ? state.endRepeat : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["maintenanceDays"] = state ? state.maintenanceDays : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["monitorGuids"] = state ? state.monitorGuids : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
        } else {
            const args = argsOrState as MonitorDowntimeArgs | undefined;
            if ((!args || args.endTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endTime'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.startTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'startTime'");
            }
            if ((!args || args.timeZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeZone'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["endRepeat"] = args ? args.endRepeat : undefined;
            resourceInputs["endTime"] = args ? args.endTime : undefined;
            resourceInputs["frequency"] = args ? args.frequency : undefined;
            resourceInputs["maintenanceDays"] = args ? args.maintenanceDays : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["monitorGuids"] = args ? args.monitorGuids : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["startTime"] = args ? args.startTime : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MonitorDowntime.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MonitorDowntime resources.
 */
export interface MonitorDowntimeState {
    /**
     * The account in which the monitor downtime would be created. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` (or the `accountId` specified in the `provider{}`), if not specified.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Options which may be used to specify when the repeat cycle of the monitor should end. This argument comprises the following nested arguments -
     */
    endRepeat?: pulumi.Input<inputs.MonitorDowntimeEndRepeat>;
    /**
     * The time at which the monitor downtime would end operating, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2024-01-05T14:27:07`.
     */
    endTime?: pulumi.Input<string>;
    /**
     * Options which may be used to specify the configuration of a monthly monitor downtime. This argument comprises the following nested arguments -
     */
    frequency?: pulumi.Input<inputs.MonitorDowntimeFrequency>;
    /**
     * A list of days on which weekly monitor downtimes would function. Valid values which go into this list would be `"SUNDAY"`, `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"` and/or `"SATURDAY"`.
     *
     * > **NOTE:** `maintenanceDays` **can only be used with the mode** `WEEKLY`, and **is a required argument** with weekly monitor downtimes (i.e. if the `mode` is `WEEKLY`).
     */
    maintenanceDays?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One of the four modes of operation of monitor downtimes - `ONE_TIME`, `DAILY`, `MONTHLY` or `WEEKLY`.
     */
    mode?: pulumi.Input<string>;
    /**
     * A list of GUIDs of synthetic monitors the monitor downtime would need to be applied to.
     */
    monitorGuids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the monitor downtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The time at which the monitor downtime would begin to operate, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2023-12-20T10:48:53`.
     */
    startTime?: pulumi.Input<string>;
    /**
     * The timezone that applies to the Monitor Downtime schedule.
     */
    timeZone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MonitorDowntime resource.
 */
export interface MonitorDowntimeArgs {
    /**
     * The account in which the monitor downtime would be created. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` (or the `accountId` specified in the `provider{}`), if not specified.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Options which may be used to specify when the repeat cycle of the monitor should end. This argument comprises the following nested arguments -
     */
    endRepeat?: pulumi.Input<inputs.MonitorDowntimeEndRepeat>;
    /**
     * The time at which the monitor downtime would end operating, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2024-01-05T14:27:07`.
     */
    endTime: pulumi.Input<string>;
    /**
     * Options which may be used to specify the configuration of a monthly monitor downtime. This argument comprises the following nested arguments -
     */
    frequency?: pulumi.Input<inputs.MonitorDowntimeFrequency>;
    /**
     * A list of days on which weekly monitor downtimes would function. Valid values which go into this list would be `"SUNDAY"`, `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"` and/or `"SATURDAY"`.
     *
     * > **NOTE:** `maintenanceDays` **can only be used with the mode** `WEEKLY`, and **is a required argument** with weekly monitor downtimes (i.e. if the `mode` is `WEEKLY`).
     */
    maintenanceDays?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One of the four modes of operation of monitor downtimes - `ONE_TIME`, `DAILY`, `MONTHLY` or `WEEKLY`.
     */
    mode: pulumi.Input<string>;
    /**
     * A list of GUIDs of synthetic monitors the monitor downtime would need to be applied to.
     */
    monitorGuids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the monitor downtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The time at which the monitor downtime would begin to operate, a timestamp specified in the ISO 8601 format without the offset/timezone - for instance, `2023-12-20T10:48:53`.
     */
    startTime: pulumi.Input<string>;
    /**
     * The timezone that applies to the Monitor Downtime schedule.
     */
    timeZone: pulumi.Input<string>;
}
