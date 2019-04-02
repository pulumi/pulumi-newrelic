// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific synthetics monitor in New Relic. This can then be used to set up a synthetics alert condition.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const bar = pulumi.output(newrelic.getSyntheticsMonitor({
 *     name: "bar",
 * }));
 * const baz = new newrelic.SyntheticsAlertCondition("baz", {
 *     monitorId: bar.apply(bar => bar.id),
 *     policyId: newrelic_alert_policy_foo.id,
 *     runbookUrl: "https://www.example.com",
 * });
 * ```
 */
export function getSyntheticsMonitor(args: GetSyntheticsMonitorArgs, opts?: pulumi.InvokeOptions): Promise<GetSyntheticsMonitorResult> {
    return pulumi.runtime.invoke("newrelic:index/getSyntheticsMonitor:getSyntheticsMonitor", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyntheticsMonitor.
 */
export interface GetSyntheticsMonitorArgs {
    /**
     * The name of the synthetics monitor in New Relic.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getSyntheticsMonitor.
 */
export interface GetSyntheticsMonitorResult {
    readonly monitorId: string;
    readonly name: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
