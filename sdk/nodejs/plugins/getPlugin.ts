// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/d/plugin.html.markdown.
 */
export function getPlugin(args: GetPluginArgs, opts?: pulumi.InvokeOptions): Promise<GetPluginResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("newrelic:plugins/getPlugin:getPlugin", {
        "guid": args.guid,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlugin.
 */
export interface GetPluginArgs {
    /**
     * The GUID of the plugin in New Relic.
     */
    readonly guid: string;
}

/**
 * A collection of values returned by getPlugin.
 */
export interface GetPluginResult {
    readonly guid: string;
    /**
     * The ID of the installed plugin instance.
     */
    readonly id: string;
}
