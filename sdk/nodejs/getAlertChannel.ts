// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific alert channel in New Relic that already exists.
 */
export function getAlertChannel(args: GetAlertChannelArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertChannelResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("newrelic:index/getAlertChannel:getAlertChannel", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertChannel.
 */
export interface GetAlertChannelArgs {
    /**
     * The name of the alert channel in New Relic.
     */
    name: string;
}

/**
 * A collection of values returned by getAlertChannel.
 */
export interface GetAlertChannelResult {
    /**
     * Alert channel configuration.
     */
    readonly config: outputs.GetAlertChannelConfig;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * A list of policy IDs associated with the alert channel.
     */
    readonly policyIds: number[];
    /**
     * Alert channel type, either: `email`, `opsgenie`, `pagerduty`, `slack`, `victorops`, or `webhook`.
     */
    readonly type: string;
}

export function getAlertChannelOutput(args: GetAlertChannelOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertChannelResult> {
    return pulumi.output(args).apply(a => getAlertChannel(a, opts))
}

/**
 * A collection of arguments for invoking getAlertChannel.
 */
export interface GetAlertChannelOutputArgs {
    /**
     * The name of the alert channel in New Relic.
     */
    name: pulumi.Input<string>;
}
