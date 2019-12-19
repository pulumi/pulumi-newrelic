// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a synthetics monitor in New Relic.
 * 
 * ## Example Usage
 * 
 * ##### Type: `SIMPLE`
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.synthetics.Monitor("foo", {
 *     frequency: 5,
 *     locations: [
 *         "AWS_US_EAST_1",
 *         "AWS_US_EAST_2",
 *     ],
 *     status: "ENABLED",
 *     type: "SIMPLE",
 *     uri: "https://example.com", // Required for type "SIMPLE" and "BROWSER"
 *     validationString: "add example validation check here", // Optional for type "SIMPLE" and "BROWSER"
 *     verifySsl: true, // Optional for type "SIMPLE" and "BROWSER"
 * });
 * ```
 * See additional examples.
 * 
 * ## Additional Examples
 * 
 * Type: `BROWSER`
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.synthetics.Monitor("foo", {
 *     bypassHeadRequest: true, // Note: optional for type "BROWSER" only
 *     frequency: 5,
 *     locations: ["AWS_US_EAST_1"],
 *     status: "ENABLED",
 *     treatRedirectAsFailure: true, // Note: optional for type "BROWSER" only
 *     type: "BROWSER",
 *     uri: "https://example.com", // required for type "SIMPLE" and "BROWSER"
 *     validationString: "add example validation check here", // optional for type "SIMPLE" and "BROWSER"
 *     verifySsl: true, // optional for type "SIMPLE" and "BROWSER"
 * });
 * ```
 * 
 * Type: `SCRIPT_BROWSER`
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.synthetics.Monitor("foo", {
 *     frequency: 5,
 *     locations: ["AWS_US_EAST_1"],
 *     status: "ENABLED",
 *     type: "SCRIPT_BROWSER",
 * });
 * ```
 * 
 * Type: `SCRIPT_API`
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.synthetics.Monitor("foo", {
 *     frequency: 5,
 *     locations: ["AWS_US_EAST_1"],
 *     status: "ENABLED",
 *     type: "SCRIPT_API",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_monitor.html.markdown.
 */
export class Monitor extends pulumi.CustomResource {
    /**
     * Get an existing Monitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
     * Bypass HEAD request.
     */
    public readonly bypassHeadRequest!: pulumi.Output<boolean | undefined>;
    /**
     * The interval (in minutes) at which this monitor should run.
     */
    public readonly frequency!: pulumi.Output<number>;
    /**
     * The locations in which this monitor should be run.
     */
    public readonly locations!: pulumi.Output<string[]>;
    /**
     * The title of this monitor.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The base threshold for the SLA report.
     */
    public readonly slaThreshold!: pulumi.Output<number | undefined>;
    /**
     * The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`)
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * Fail the monitor check if redirected.
     */
    public readonly treatRedirectAsFailure!: pulumi.Output<boolean | undefined>;
    /**
     * The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The URI for the monitor to hit.
     */
    public readonly uri!: pulumi.Output<string | undefined>;
    /**
     * The string to validate against in the response.
     */
    public readonly validationString!: pulumi.Output<string | undefined>;
    /**
     * Verify SSL.
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as MonitorState | undefined;
            inputs["bypassHeadRequest"] = state ? state.bypassHeadRequest : undefined;
            inputs["frequency"] = state ? state.frequency : undefined;
            inputs["locations"] = state ? state.locations : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["slaThreshold"] = state ? state.slaThreshold : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["treatRedirectAsFailure"] = state ? state.treatRedirectAsFailure : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["uri"] = state ? state.uri : undefined;
            inputs["validationString"] = state ? state.validationString : undefined;
            inputs["verifySsl"] = state ? state.verifySsl : undefined;
        } else {
            const args = argsOrState as MonitorArgs | undefined;
            if (!args || args.frequency === undefined) {
                throw new Error("Missing required property 'frequency'");
            }
            if (!args || args.locations === undefined) {
                throw new Error("Missing required property 'locations'");
            }
            if (!args || args.status === undefined) {
                throw new Error("Missing required property 'status'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["bypassHeadRequest"] = args ? args.bypassHeadRequest : undefined;
            inputs["frequency"] = args ? args.frequency : undefined;
            inputs["locations"] = args ? args.locations : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["slaThreshold"] = args ? args.slaThreshold : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["treatRedirectAsFailure"] = args ? args.treatRedirectAsFailure : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["uri"] = args ? args.uri : undefined;
            inputs["validationString"] = args ? args.validationString : undefined;
            inputs["verifySsl"] = args ? args.verifySsl : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Monitor.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Monitor resources.
 */
export interface MonitorState {
    /**
     * Bypass HEAD request.
     */
    readonly bypassHeadRequest?: pulumi.Input<boolean>;
    /**
     * The interval (in minutes) at which this monitor should run.
     */
    readonly frequency?: pulumi.Input<number>;
    /**
     * The locations in which this monitor should be run.
     */
    readonly locations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The title of this monitor.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The base threshold for the SLA report.
     */
    readonly slaThreshold?: pulumi.Input<number>;
    /**
     * The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`)
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Fail the monitor check if redirected.
     */
    readonly treatRedirectAsFailure?: pulumi.Input<boolean>;
    /**
     * The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The URI for the monitor to hit.
     */
    readonly uri?: pulumi.Input<string>;
    /**
     * The string to validate against in the response.
     */
    readonly validationString?: pulumi.Input<string>;
    /**
     * Verify SSL.
     */
    readonly verifySsl?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Monitor resource.
 */
export interface MonitorArgs {
    /**
     * Bypass HEAD request.
     */
    readonly bypassHeadRequest?: pulumi.Input<boolean>;
    /**
     * The interval (in minutes) at which this monitor should run.
     */
    readonly frequency: pulumi.Input<number>;
    /**
     * The locations in which this monitor should be run.
     */
    readonly locations: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The title of this monitor.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The base threshold for the SLA report.
     */
    readonly slaThreshold?: pulumi.Input<number>;
    /**
     * The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`)
     */
    readonly status: pulumi.Input<string>;
    /**
     * Fail the monitor check if redirected.
     */
    readonly treatRedirectAsFailure?: pulumi.Input<boolean>;
    /**
     * The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * The URI for the monitor to hit.
     */
    readonly uri?: pulumi.Input<string>;
    /**
     * The string to validate against in the response.
     */
    readonly validationString?: pulumi.Input<string>;
    /**
     * Verify SSL.
     */
    readonly verifySsl?: pulumi.Input<boolean>;
}
