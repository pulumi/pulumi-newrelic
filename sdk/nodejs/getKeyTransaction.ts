// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific key transaction in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const txn = newrelic.getKeyTransaction({
 *     name: "txn",
 * });
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooAlertCondition = new newrelic.AlertCondition("fooAlertCondition", {
 *     policyId: fooAlertPolicy.id,
 *     type: "apm_kt_metric",
 *     entities: [txn.then(txn => txn.id)],
 *     metric: "error_percentage",
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
export function getKeyTransaction(args: GetKeyTransactionArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyTransactionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getKeyTransaction:getKeyTransaction", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeyTransaction.
 */
export interface GetKeyTransactionArgs {
    /**
     * The name of the key transaction in New Relic.
     */
    name: string;
}

/**
 * A collection of values returned by getKeyTransaction.
 */
export interface GetKeyTransactionResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Use this data source to get information about a specific key transaction in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const txn = newrelic.getKeyTransaction({
 *     name: "txn",
 * });
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooAlertCondition = new newrelic.AlertCondition("fooAlertCondition", {
 *     policyId: fooAlertPolicy.id,
 *     type: "apm_kt_metric",
 *     entities: [txn.then(txn => txn.id)],
 *     metric: "error_percentage",
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
export function getKeyTransactionOutput(args: GetKeyTransactionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKeyTransactionResult> {
    return pulumi.output(args).apply((a: any) => getKeyTransaction(a, opts))
}

/**
 * A collection of arguments for invoking getKeyTransaction.
 */
export interface GetKeyTransactionOutputArgs {
    /**
     * The name of the key transaction in New Relic.
     */
    name: pulumi.Input<string>;
}
