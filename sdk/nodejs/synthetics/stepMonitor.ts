// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a synthetics step monitor in New Relic.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const monitor = new newrelic.synthetics.StepMonitor("monitor", {
 *     enableScreenshotOnFailureAndScript: true,
 *     locationsPublics: [
 *         "US_EAST_1",
 *         "US_EAST_2",
 *     ],
 *     period: "EVERY_6_HOURS",
 *     status: "ENABLED",
 *     steps: [{
 *         ordinal: 0,
 *         type: "NAVIGATE",
 *         values: ["https://www.newrelic.com"],
 *     }],
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * See additional examples.
 * ## Additional Examples
 *
 * ## Import
 *
 * Synthetics step monitor scripts can be imported using the `guid`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor bar <guid>
 * ```
 */
export class StepMonitor extends pulumi.CustomResource {
    /**
     * Get an existing StepMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StepMonitorState, opts?: pulumi.CustomResourceOptions): StepMonitor {
        return new StepMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/stepMonitor:StepMonitor';

    /**
     * Returns true if the given object is an instance of StepMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StepMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StepMonitor.__pulumiType;
    }

    /**
     * The account in which the Synthetics monitor will be created.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Capture a screenshot during job execution.
     */
    public readonly enableScreenshotOnFailureAndScript!: pulumi.Output<boolean | undefined>;
    /**
     * The unique identifier for the Synthetics private location in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The location the monitor will run from. Exactly one of `locationsPublic` or `locationsPrivate` is required. See Nested locationsPrivate blocks below for details.
     */
    public readonly locationPrivates!: pulumi.Output<outputs.synthetics.StepMonitorLocationPrivate[] | undefined>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. Exactly one of `locationsPublic` or `locationsPrivate` is required.
     */
    public readonly locationsPublics!: pulumi.Output<string[] | undefined>;
    /**
     * The name for the monitor.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    public readonly period!: pulumi.Output<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     */
    public readonly steps!: pulumi.Output<outputs.synthetics.StepMonitorStep[]>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     */
    public readonly tags!: pulumi.Output<outputs.synthetics.StepMonitorTag[] | undefined>;

    /**
     * Create a StepMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StepMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StepMonitorArgs | StepMonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StepMonitorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = state ? state.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["locationPrivates"] = state ? state.locationPrivates : undefined;
            resourceInputs["locationsPublics"] = state ? state.locationsPublics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["steps"] = state ? state.steps : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as StepMonitorArgs | undefined;
            if ((!args || args.period === undefined) && !opts.urn) {
                throw new Error("Missing required property 'period'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            if ((!args || args.steps === undefined) && !opts.urn) {
                throw new Error("Missing required property 'steps'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = args ? args.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["locationPrivates"] = args ? args.locationPrivates : undefined;
            resourceInputs["locationsPublics"] = args ? args.locationsPublics : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["steps"] = args ? args.steps : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["guid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StepMonitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StepMonitor resources.
 */
export interface StepMonitorState {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The unique identifier for the Synthetics private location in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The location the monitor will run from. Exactly one of `locationsPublic` or `locationsPrivate` is required. See Nested locationsPrivate blocks below for details.
     */
    locationPrivates?: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorLocationPrivate>[]>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. Exactly one of `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    period?: pulumi.Input<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    status?: pulumi.Input<string>;
    /**
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     */
    steps?: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorStep>[]>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorTag>[]>;
}

/**
 * The set of arguments for constructing a StepMonitor resource.
 */
export interface StepMonitorArgs {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The location the monitor will run from. Exactly one of `locationsPublic` or `locationsPrivate` is required. See Nested locationsPrivate blocks below for details.
     */
    locationPrivates?: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorLocationPrivate>[]>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. Exactly one of `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    period: pulumi.Input<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    status: pulumi.Input<string>;
    /**
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     */
    steps: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorStep>[]>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.StepMonitorTag>[]>;
}