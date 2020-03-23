// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getPluginComponent(args: GetPluginComponentArgs, opts?: pulumi.InvokeOptions): Promise<GetPluginComponentResult> & GetPluginComponentResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetPluginComponentResult> = pulumi.runtime.invoke("newrelic:plugins/getPluginComponent:getPluginComponent", {
        "name": args.name,
        "pluginId": args.pluginId,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getPluginComponent.
 */
export interface GetPluginComponentArgs {
    /**
     * The name of the plugin component.
     */
    readonly name: string;
    /**
     * The ID of the plugin instance this component belongs to.
     */
    readonly pluginId: number;
}

/**
 * A collection of values returned by getPluginComponent.
 */
export interface GetPluginComponentResult {
    /**
     * The health status of the plugin component.
     */
    readonly healthStatus: string;
    /**
     * The ID of the plugin component.
     */
    readonly id: string;
    readonly name: string;
    readonly pluginId: number;
}
