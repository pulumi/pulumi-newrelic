// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED** This data source is deprecated and will stop being supported as of June 16, 2021. For more information, check out [https://discuss.newrelic.com/t/new-relic-plugin-eol-wednesday-june-16th-2021/127267](https://discuss.newrelic.com/t/new-relic-plugin-eol-wednesday-june-16th-2021/127267)
 *
 * Use this data source to get information about a specific installed plugin in New Relic.
 *
 * Each plugin published to New Relic's Plugin Central is assigned a [GUID](https://docs.newrelic.com/docs/plugins/plugin-developer-resources/planning-your-plugin/parts-plugin#guid). Once you have installed a plugin into your account it is assigned an ID. This account-specific ID is required when creating Plugins alert conditions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooPlugin = newrelic.plugins.getPlugin({
 *     guid: "com.example.my-plugin",
 * });
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooAlertCondition = new newrelic.plugins.AlertCondition("fooAlertCondition", {
 *     policyId: fooAlertPolicy.id,
 *     metric: "Component/Summary/Consumers[consumers]",
 *     pluginId: fooPlugin.then(fooPlugin => fooPlugin.id),
 *     pluginGuid: fooPlugin.then(fooPlugin => fooPlugin.guid),
 *     valueFunction: "average",
 *     metricDescription: "Queue consumers",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: "0.75",
 *         timeFunction: "all",
 *     }],
 * });
 * ```
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
