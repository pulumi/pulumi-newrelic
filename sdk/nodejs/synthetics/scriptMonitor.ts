// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create update, and delete a Script API or Script Browser Synthetics Monitor in New Relic.
 *
 * ## Example Usage
 *
 * ##### Type: `SCRIPT_API`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const monitor = new newrelic.synthetics.ScriptMonitor("monitor", {
 *     status: "ENABLED",
 *     name: "script_monitor",
 *     type: "SCRIPT_API",
 *     locationsPublics: [
 *         "AP_SOUTH_1",
 *         "AP_EAST_1",
 *     ],
 *     period: "EVERY_6_HOURS",
 *     script: "console.log('it works!')",
 *     scriptLanguage: "JAVASCRIPT",
 *     runtimeType: "NODE_API",
 *     runtimeTypeVersion: "16.10",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * ##### Type: `SCRIPT_BROWSER`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const monitor = new newrelic.synthetics.ScriptMonitor("monitor", {
 *     status: "ENABLED",
 *     name: "script_monitor",
 *     type: "SCRIPT_BROWSER",
 *     locationsPublics: [
 *         "AP_SOUTH_1",
 *         "AP_EAST_1",
 *     ],
 *     period: "EVERY_HOUR",
 *     enableScreenshotOnFailureAndScript: false,
 *     script: "$browser.get('https://one.newrelic.com')",
 *     runtimeTypeVersion: "100",
 *     runtimeType: "CHROME_BROWSER",
 *     scriptLanguage: "JAVASCRIPT",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * See additional examples.
 *
 * ## Additional Examples
 *
 * ### Create a monitor with a private location
 *
 * The below example shows how you can define a private location and attach it to a monitor.
 *
 * > **NOTE:** It can take up to 10 minutes for a private location to become available.
 *
 * ##### Type: `SCRIPT_API`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const location = new newrelic.synthetics.PrivateLocation("location", {
 *     description: "Example private location",
 *     name: "private_location",
 *     verifiedScriptExecution: true,
 * });
 * const monitor = new newrelic.synthetics.ScriptMonitor("monitor", {
 *     status: "ENABLED",
 *     name: "script_monitor",
 *     type: "SCRIPT_API",
 *     locationPrivates: [{
 *         guid: location.id,
 *         vsePassword: "secret",
 *     }],
 *     period: "EVERY_6_HOURS",
 *     script: "console.log('terraform integration test updated')",
 *     scriptLanguage: "JAVASCRIPT",
 *     runtimeType: "NODE_API",
 *     runtimeTypeVersion: "16.10",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * ##### Type: `SCRIPT_BROWSER`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const location = new newrelic.synthetics.PrivateLocation("location", {
 *     description: "Test Description",
 *     name: "private_location",
 *     verifiedScriptExecution: true,
 * });
 * const monitor = new newrelic.synthetics.ScriptMonitor("monitor", {
 *     status: "ENABLED",
 *     name: "script_monitor",
 *     type: "SCRIPT_BROWSER",
 *     period: "EVERY_HOUR",
 *     script: "$browser.get('https://one.newrelic.com')",
 *     enableScreenshotOnFailureAndScript: false,
 *     locationPrivates: [{
 *         guid: location.id,
 *         vsePassword: "secret",
 *     }],
 *     runtimeTypeVersion: "100",
 *     runtimeType: "CHROME_BROWSER",
 *     scriptLanguage: "JAVASCRIPT",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Synthetics monitor scripts can be imported using the `guid`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:synthetics/scriptMonitor:ScriptMonitor monitor <guid>
 * ```
 */
export class ScriptMonitor extends pulumi.CustomResource {
    /**
     * Get an existing ScriptMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScriptMonitorState, opts?: pulumi.CustomResourceOptions): ScriptMonitor {
        return new ScriptMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/scriptMonitor:ScriptMonitor';

    /**
     * Returns true if the given object is an instance of ScriptMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScriptMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScriptMonitor.__pulumiType;
    }

    /**
     * The account in which the Synthetics monitor will be created.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     */
    public readonly deviceOrientation!: pulumi.Output<string | undefined>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     */
    public readonly deviceType!: pulumi.Output<string | undefined>;
    /**
     * Capture a screenshot during job execution.
     */
    public readonly enableScreenshotOnFailureAndScript!: pulumi.Output<boolean | undefined>;
    /**
     * The unique entity identifier of the monitor in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
     */
    public readonly locationPrivates!: pulumi.Output<outputs.synthetics.ScriptMonitorLocationPrivate[] | undefined>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
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
     * The interval in minutes at which Synthetic monitor should run.
     */
    public /*out*/ readonly periodInMinutes!: pulumi.Output<number>;
    /**
     * The runtime that the monitor will use to run jobs.
     */
    public readonly runtimeType!: pulumi.Output<string | undefined>;
    /**
     * The specific version of the runtime type selected.
     */
    public readonly runtimeTypeVersion!: pulumi.Output<string | undefined>;
    /**
     * The script that the monitor runs.
     */
    public readonly script!: pulumi.Output<string | undefined>;
    /**
     * The programing language that should execute the script.
     */
    public readonly scriptLanguage!: pulumi.Output<string | undefined>;
    /**
     * The monitor status (ENABLED or DISABLED).
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
     */
    public readonly tags!: pulumi.Output<outputs.synthetics.ScriptMonitorTag[] | undefined>;
    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ScriptMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScriptMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScriptMonitorArgs | ScriptMonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScriptMonitorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["deviceOrientation"] = state ? state.deviceOrientation : undefined;
            resourceInputs["deviceType"] = state ? state.deviceType : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = state ? state.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["locationPrivates"] = state ? state.locationPrivates : undefined;
            resourceInputs["locationsPublics"] = state ? state.locationsPublics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodInMinutes"] = state ? state.periodInMinutes : undefined;
            resourceInputs["runtimeType"] = state ? state.runtimeType : undefined;
            resourceInputs["runtimeTypeVersion"] = state ? state.runtimeTypeVersion : undefined;
            resourceInputs["script"] = state ? state.script : undefined;
            resourceInputs["scriptLanguage"] = state ? state.scriptLanguage : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ScriptMonitorArgs | undefined;
            if ((!args || args.period === undefined) && !opts.urn) {
                throw new Error("Missing required property 'period'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["deviceOrientation"] = args ? args.deviceOrientation : undefined;
            resourceInputs["deviceType"] = args ? args.deviceType : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = args ? args.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["locationPrivates"] = args ? args.locationPrivates : undefined;
            resourceInputs["locationsPublics"] = args ? args.locationsPublics : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["runtimeType"] = args ? args.runtimeType : undefined;
            resourceInputs["runtimeTypeVersion"] = args ? args.runtimeTypeVersion : undefined;
            resourceInputs["script"] = args ? args.script : undefined;
            resourceInputs["scriptLanguage"] = args ? args.scriptLanguage : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["guid"] = undefined /*out*/;
            resourceInputs["periodInMinutes"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ScriptMonitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScriptMonitor resources.
 */
export interface ScriptMonitorState {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     */
    deviceOrientation?: pulumi.Input<string>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     */
    deviceType?: pulumi.Input<string>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The unique entity identifier of the monitor in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
     */
    locationPrivates?: pulumi.Input<pulumi.Input<inputs.synthetics.ScriptMonitorLocationPrivate>[]>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
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
     * The interval in minutes at which Synthetic monitor should run.
     */
    periodInMinutes?: pulumi.Input<number>;
    /**
     * The runtime that the monitor will use to run jobs.
     */
    runtimeType?: pulumi.Input<string>;
    /**
     * The specific version of the runtime type selected.
     */
    runtimeTypeVersion?: pulumi.Input<string>;
    /**
     * The script that the monitor runs.
     */
    script?: pulumi.Input<string>;
    /**
     * The programing language that should execute the script.
     */
    scriptLanguage?: pulumi.Input<string>;
    /**
     * The monitor status (ENABLED or DISABLED).
     */
    status?: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.ScriptMonitorTag>[]>;
    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ScriptMonitor resource.
 */
export interface ScriptMonitorArgs {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     */
    deviceOrientation?: pulumi.Input<string>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     */
    deviceType?: pulumi.Input<string>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The location the monitor will run from. See Nested locationPrivate blocks below for details. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
     */
    locationPrivates?: pulumi.Input<pulumi.Input<inputs.synthetics.ScriptMonitorLocationPrivate>[]>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locationsPublic` **or** `locationPrivate` **is required**.
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
     * The runtime that the monitor will use to run jobs.
     */
    runtimeType?: pulumi.Input<string>;
    /**
     * The specific version of the runtime type selected.
     */
    runtimeTypeVersion?: pulumi.Input<string>;
    /**
     * The script that the monitor runs.
     */
    script?: pulumi.Input<string>;
    /**
     * The programing language that should execute the script.
     */
    scriptLanguage?: pulumi.Input<string>;
    /**
     * The monitor status (ENABLED or DISABLED).
     */
    status: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.ScriptMonitorTag>[]>;
    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     */
    type: pulumi.Input<string>;
}
