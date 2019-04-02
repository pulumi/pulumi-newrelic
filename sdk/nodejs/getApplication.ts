// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific application in New Relic.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const app = pulumi.output(newrelic.getApplication({
 *     name: "my-app",
 * }));
 * const fooAlertPolicy = new newrelic.AlertPolicy("foo", {});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     entities: [app.apply(app => app.id)],
 *     metric: "apdex",
 *     policyId: fooAlertPolicy.id,
 *     runbookUrl: "https://www.example.com",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 *     type: "apm_app_metric",
 * });
 * ```
 */
export function getApplication(args: GetApplicationArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationResult> {
    return pulumi.runtime.invoke("newrelic:index/getApplication:getApplication", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationArgs {
    /**
     * The name of the application in New Relic.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getApplication.
 */
export interface GetApplicationResult {
    /**
     * A list of host IDs associated with the application.
     */
    readonly hostIds: number[];
    /**
     * A list of instance IDs associated with the application.
     */
    readonly instanceIds: number[];
    readonly name: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
