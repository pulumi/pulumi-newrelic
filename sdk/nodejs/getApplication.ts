// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * #### DEPRECATED! Use at your own risk. Use the `newrelic.getEntity` data source instead. This feature may be removed in the next major release
 *
 * Use this data source to get information about a specific application in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getApplication({
 *     name: "my-app",
 * });
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo"});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     policyId: foo.id,
 *     name: "foo",
 *     type: "apm_app_metric",
 *     entities: [app.then(app => app.id)],
 *     metric: "apdex",
 *     runbookUrl: "https://www.example.com",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 * });
 * ```
 */
export function getApplication(args: GetApplicationArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    name: string;
}

/**
 * A collection of values returned by getApplication.
 */
export interface GetApplicationResult {
    /**
     * A list of host IDs associated with the application.
     */
    readonly hostIds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of instance IDs associated with the application.
     */
    readonly instanceIds: string[];
    readonly name: string;
}
/**
 * #### DEPRECATED! Use at your own risk. Use the `newrelic.getEntity` data source instead. This feature may be removed in the next major release
 *
 * Use this data source to get information about a specific application in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getApplication({
 *     name: "my-app",
 * });
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo"});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     policyId: foo.id,
 *     name: "foo",
 *     type: "apm_app_metric",
 *     entities: [app.then(app => app.id)],
 *     metric: "apdex",
 *     runbookUrl: "https://www.example.com",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 * });
 * ```
 */
export function getApplicationOutput(args: GetApplicationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplicationResult> {
    return pulumi.output(args).apply((a: any) => getApplication(a, opts))
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationOutputArgs {
    /**
     * The name of the application in New Relic.
     */
    name: pulumi.Input<string>;
}
