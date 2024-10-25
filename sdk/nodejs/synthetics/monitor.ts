// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const monitor = new newrelic.synthetics.Monitor("monitor", {
 *     status: "ENABLED",
 *     name: "monitor",
 *     period: "EVERY_MINUTE",
 *     uri: "https://www.one.newrelic.com",
 *     type: "SIMPLE",
 *     locationsPublics: ["AP_SOUTH_1"],
 *     customHeaders: [{
 *         name: "some_name",
 *         value: "some_value",
 *     }],
 *     treatRedirectAsFailure: true,
 *     validationString: "success",
 *     bypassHeadRequest: true,
 *     verifySsl: true,
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * ##### Type: `SIMPLE BROWSER`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const monitor = new newrelic.synthetics.Monitor("monitor", {
 *     status: "ENABLED",
 *     name: "monitor",
 *     period: "EVERY_MINUTE",
 *     uri: "https://www.one.newrelic.com",
 *     type: "BROWSER",
 *     locationsPublics: ["AP_SOUTH_1"],
 *     enableScreenshotOnFailureAndScript: true,
 *     validationString: "success",
 *     verifySsl: true,
 *     runtimeType: "CHROME_BROWSER",
 *     runtimeTypeVersion: "100",
 *     scriptLanguage: "JAVASCRIPT",
 *     devices: [
 *         "DESKTOP",
 *         "TABLET_LANDSCAPE",
 *         "MOBILE_PORTRAIT",
 *     ],
 *     browsers: ["CHROME"],
 *     customHeaders: [{
 *         name: "some_name",
 *         value: "some_value",
 *     }],
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
 * ##### Type: `SIMPLE`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const location = new newrelic.synthetics.PrivateLocation("location", {
 *     description: "Example private location",
 *     name: "private_location",
 *     verifiedScriptExecution: false,
 * });
 * const monitor = new newrelic.synthetics.Monitor("monitor", {
 *     status: "ENABLED",
 *     name: "monitor",
 *     period: "EVERY_MINUTE",
 *     uri: "https://www.one.newrelic.com",
 *     type: "SIMPLE",
 *     locationsPrivates: [location.id],
 *     customHeaders: [{
 *         name: "some_name",
 *         value: "some_value",
 *     }],
 *     treatRedirectAsFailure: true,
 *     validationString: "success",
 *     bypassHeadRequest: true,
 *     verifySsl: true,
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * ##### Type: `BROWSER`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const location = new newrelic.synthetics.PrivateLocation("location", {
 *     description: "Example private location",
 *     name: "private-location",
 *     verifiedScriptExecution: false,
 * });
 * const monitor = new newrelic.synthetics.Monitor("monitor", {
 *     status: "ENABLED",
 *     type: "BROWSER",
 *     uri: "https://www.one.newrelic.com",
 *     name: "monitor",
 *     period: "EVERY_MINUTE",
 *     locationsPrivates: [location.id],
 *     enableScreenshotOnFailureAndScript: true,
 *     validationString: "success",
 *     verifySsl: true,
 *     runtimeTypeVersion: "100",
 *     runtimeType: "CHROME_BROWSER",
 *     scriptLanguage: "JAVASCRIPT",
 *     devices: [
 *         "DESKTOP",
 *         "TABLET_LANDSCAPE",
 *         "MOBILE_PORTRAIT",
 *     ],
 *     browsers: ["CHROME"],
 *     customHeaders: [{
 *         name: "some_name",
 *         value: "some_value",
 *     }],
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Synthetics monitor can be imported using the `guid`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:synthetics/monitor:Monitor monitor <guid>
 * ```
 */
export class Monitor extends pulumi.CustomResource {
    /**
     * Get an existing Monitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MonitorState, opts?: pulumi.CustomResourceOptions): Monitor {
        return new Monitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/monitor:Monitor';

    /**
     * Returns true if the given object is an instance of Monitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Monitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Monitor.__pulumiType;
    }

    /**
     * The account in which the Synthetics monitor will be created.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
     */
    public readonly browsers!: pulumi.Output<string[] | undefined>;
    /**
     * Monitor should skip default HEAD request and instead use GET verb in check.
     *
     * The `BROWSER` monitor type supports the following additional arguments:
     */
    public readonly bypassHeadRequest!: pulumi.Output<boolean | undefined>;
    /**
     * Custom headers to use in monitor job. See Nested customHeader blocks below for details.
     */
    public readonly customHeaders!: pulumi.Output<outputs.synthetics.MonitorCustomHeader[] | undefined>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    public readonly deviceOrientation!: pulumi.Output<string | undefined>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    public readonly deviceType!: pulumi.Output<string | undefined>;
    /**
     * The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
     */
    public readonly devices!: pulumi.Output<string[] | undefined>;
    /**
     * Capture a screenshot during job execution.
     */
    public readonly enableScreenshotOnFailureAndScript!: pulumi.Output<boolean | undefined>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    public readonly locationsPrivates!: pulumi.Output<string[] | undefined>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    public readonly locationsPublics!: pulumi.Output<string[] | undefined>;
    /**
     * The human-readable identifier for the monitor.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     */
    public readonly period!: pulumi.Output<string>;
    /**
     * The interval in minutes at which Synthetic monitor should run.
     */
    public /*out*/ readonly periodInMinutes!: pulumi.Output<number>;
    /**
     * The runtime that the monitor will use to run jobs (`CHROME_BROWSER`).
     */
    public readonly runtimeType!: pulumi.Output<string | undefined>;
    /**
     * The specific version of the runtime type selected (`100`).
     */
    public readonly runtimeTypeVersion!: pulumi.Output<string | undefined>;
    /**
     * The programing language that should execute the script.
     */
    public readonly scriptLanguage!: pulumi.Output<string | undefined>;
    /**
     * The run state of the monitor. (`ENABLED` or `DISABLED`).
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SIMPLE` monitor type supports the following additional arguments:
     */
    public readonly tags!: pulumi.Output<outputs.synthetics.MonitorTag[] | undefined>;
    /**
     * Categorize redirects during a monitor job as a failure.
     */
    public readonly treatRedirectAsFailure!: pulumi.Output<boolean | undefined>;
    /**
     * The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The URI the monitor runs against.
     */
    public readonly uri!: pulumi.Output<string | undefined>;
    public readonly useUnsupportedLegacyRuntime!: pulumi.Output<boolean | undefined>;
    /**
     * Validation text for monitor to search for at given URI.
     */
    public readonly validationString!: pulumi.Output<string | undefined>;
    /**
     * Monitor should validate SSL certificate chain.
     */
    public readonly verifySsl!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Monitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MonitorArgs | MonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MonitorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["browsers"] = state ? state.browsers : undefined;
            resourceInputs["bypassHeadRequest"] = state ? state.bypassHeadRequest : undefined;
            resourceInputs["customHeaders"] = state ? state.customHeaders : undefined;
            resourceInputs["deviceOrientation"] = state ? state.deviceOrientation : undefined;
            resourceInputs["deviceType"] = state ? state.deviceType : undefined;
            resourceInputs["devices"] = state ? state.devices : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = state ? state.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["locationsPrivates"] = state ? state.locationsPrivates : undefined;
            resourceInputs["locationsPublics"] = state ? state.locationsPublics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodInMinutes"] = state ? state.periodInMinutes : undefined;
            resourceInputs["runtimeType"] = state ? state.runtimeType : undefined;
            resourceInputs["runtimeTypeVersion"] = state ? state.runtimeTypeVersion : undefined;
            resourceInputs["scriptLanguage"] = state ? state.scriptLanguage : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["treatRedirectAsFailure"] = state ? state.treatRedirectAsFailure : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["useUnsupportedLegacyRuntime"] = state ? state.useUnsupportedLegacyRuntime : undefined;
            resourceInputs["validationString"] = state ? state.validationString : undefined;
            resourceInputs["verifySsl"] = state ? state.verifySsl : undefined;
        } else {
            const args = argsOrState as MonitorArgs | undefined;
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["browsers"] = args ? args.browsers : undefined;
            resourceInputs["bypassHeadRequest"] = args ? args.bypassHeadRequest : undefined;
            resourceInputs["customHeaders"] = args ? args.customHeaders : undefined;
            resourceInputs["deviceOrientation"] = args ? args.deviceOrientation : undefined;
            resourceInputs["deviceType"] = args ? args.deviceType : undefined;
            resourceInputs["devices"] = args ? args.devices : undefined;
            resourceInputs["enableScreenshotOnFailureAndScript"] = args ? args.enableScreenshotOnFailureAndScript : undefined;
            resourceInputs["locationsPrivates"] = args ? args.locationsPrivates : undefined;
            resourceInputs["locationsPublics"] = args ? args.locationsPublics : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["runtimeType"] = args ? args.runtimeType : undefined;
            resourceInputs["runtimeTypeVersion"] = args ? args.runtimeTypeVersion : undefined;
            resourceInputs["scriptLanguage"] = args ? args.scriptLanguage : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["treatRedirectAsFailure"] = args ? args.treatRedirectAsFailure : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["uri"] = args ? args.uri : undefined;
            resourceInputs["useUnsupportedLegacyRuntime"] = args ? args.useUnsupportedLegacyRuntime : undefined;
            resourceInputs["validationString"] = args ? args.validationString : undefined;
            resourceInputs["verifySsl"] = args ? args.verifySsl : undefined;
            resourceInputs["periodInMinutes"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Monitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Monitor resources.
 */
export interface MonitorState {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
     */
    browsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Monitor should skip default HEAD request and instead use GET verb in check.
     *
     * The `BROWSER` monitor type supports the following additional arguments:
     */
    bypassHeadRequest?: pulumi.Input<boolean>;
    /**
     * Custom headers to use in monitor job. See Nested customHeader blocks below for details.
     */
    customHeaders?: pulumi.Input<pulumi.Input<inputs.synthetics.MonitorCustomHeader>[]>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    deviceOrientation?: pulumi.Input<string>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    deviceType?: pulumi.Input<string>;
    /**
     * The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
     */
    devices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPrivates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The human-readable identifier for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     */
    period?: pulumi.Input<string>;
    /**
     * The interval in minutes at which Synthetic monitor should run.
     */
    periodInMinutes?: pulumi.Input<number>;
    /**
     * The runtime that the monitor will use to run jobs (`CHROME_BROWSER`).
     */
    runtimeType?: pulumi.Input<string>;
    /**
     * The specific version of the runtime type selected (`100`).
     */
    runtimeTypeVersion?: pulumi.Input<string>;
    /**
     * The programing language that should execute the script.
     */
    scriptLanguage?: pulumi.Input<string>;
    /**
     * The run state of the monitor. (`ENABLED` or `DISABLED`).
     */
    status?: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SIMPLE` monitor type supports the following additional arguments:
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.MonitorTag>[]>;
    /**
     * Categorize redirects during a monitor job as a failure.
     */
    treatRedirectAsFailure?: pulumi.Input<boolean>;
    /**
     * The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     */
    type?: pulumi.Input<string>;
    /**
     * The URI the monitor runs against.
     */
    uri?: pulumi.Input<string>;
    useUnsupportedLegacyRuntime?: pulumi.Input<boolean>;
    /**
     * Validation text for monitor to search for at given URI.
     */
    validationString?: pulumi.Input<string>;
    /**
     * Monitor should validate SSL certificate chain.
     */
    verifySsl?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Monitor resource.
 */
export interface MonitorArgs {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
     */
    browsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Monitor should skip default HEAD request and instead use GET verb in check.
     *
     * The `BROWSER` monitor type supports the following additional arguments:
     */
    bypassHeadRequest?: pulumi.Input<boolean>;
    /**
     * Custom headers to use in monitor job. See Nested customHeader blocks below for details.
     */
    customHeaders?: pulumi.Input<pulumi.Input<inputs.synthetics.MonitorCustomHeader>[]>;
    /**
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    deviceOrientation?: pulumi.Input<string>;
    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`. 
     * * We recommend you to use `devices` field instead of `deviceType`,`deviceOrientation` fields, as it allows you to select multiple combinations of device types and orientations.
     */
    deviceType?: pulumi.Input<string>;
    /**
     * The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
     */
    devices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Capture a screenshot during job execution.
     */
    enableScreenshotOnFailureAndScript?: pulumi.Input<boolean>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPrivates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The human-readable identifier for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     */
    period?: pulumi.Input<string>;
    /**
     * The runtime that the monitor will use to run jobs (`CHROME_BROWSER`).
     */
    runtimeType?: pulumi.Input<string>;
    /**
     * The specific version of the runtime type selected (`100`).
     */
    runtimeTypeVersion?: pulumi.Input<string>;
    /**
     * The programing language that should execute the script.
     */
    scriptLanguage?: pulumi.Input<string>;
    /**
     * The run state of the monitor. (`ENABLED` or `DISABLED`).
     */
    status: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     *
     * The `SIMPLE` monitor type supports the following additional arguments:
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.MonitorTag>[]>;
    /**
     * Categorize redirects during a monitor job as a failure.
     */
    treatRedirectAsFailure?: pulumi.Input<boolean>;
    /**
     * The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     */
    type: pulumi.Input<string>;
    /**
     * The URI the monitor runs against.
     */
    uri?: pulumi.Input<string>;
    useUnsupportedLegacyRuntime?: pulumi.Input<boolean>;
    /**
     * Validation text for monitor to search for at given URI.
     */
    validationString?: pulumi.Input<string>;
    /**
     * Monitor should validate SSL certificate chain.
     */
    verifySsl?: pulumi.Input<boolean>;
}
