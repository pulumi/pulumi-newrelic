// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a specific Synthetics monitor location in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const bar = newrelic.synthetics.getMonitorLocation({
 *     label: "My private location",
 * });
 * const foo = new newrelic.synthetics.Monitor("foo", {
 *     type: "SIMPLE",
 *     frequency: 5,
 *     status: "ENABLED",
 *     locations: [bar.then(bar => bar.name)],
 *     uri: "https://example.com",
 *     validationString: "add example validation check here",
 *     verifySsl: true,
 * });
 * // Optional for type "SIMPLE" and "BROWSER"
 * ```
 */
export function getMonitorLocation(args: GetMonitorLocationArgs, opts?: pulumi.InvokeOptions): Promise<GetMonitorLocationResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("newrelic:synthetics/getMonitorLocation:getMonitorLocation", {
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getMonitorLocation.
 */
export interface GetMonitorLocationArgs {
    /**
     * The label of the Synthetics monitor location.
     */
    label: string;
}

/**
 * A collection of values returned by getMonitorLocation.
 */
export interface GetMonitorLocationResult {
    /**
     * A description of the Synthetics monitor location.
     */
    readonly description: string;
    /**
     * Represents if high security mode is enabled for the location. A value of true means that high security mode is enabled, and a value of false means it is disabled.
     */
    readonly highSecurityMode: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly label: string;
    /**
     * The name of the Synthetics monitor location.
     */
    readonly name: string;
    /**
     * Represents if this location is a private location. A value of true means that the location is private, and a value of false means it is public.
     */
    readonly private: boolean;
}

export function getMonitorLocationOutput(args: GetMonitorLocationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMonitorLocationResult> {
    return pulumi.output(args).apply(a => getMonitorLocation(a, opts))
}

/**
 * A collection of arguments for invoking getMonitorLocation.
 */
export interface GetMonitorLocationOutputArgs {
    /**
     * The label of the Synthetics monitor location.
     */
    label: pulumi.Input<string>;
}
