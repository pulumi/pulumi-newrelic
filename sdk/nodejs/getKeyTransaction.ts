// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific key transaction in New Relic.
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
 * const fooAlertPolicy = new newrelic.AlertPolicy("foo", {});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     entities: [txn.id],
 *     metric: "errorPercentage",
 *     policyId: fooAlertPolicy.id,
 *     runbookUrl: "https://www.example.com",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 *     type: "apmKtMetric",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/d/key_transaction.html.markdown.
 */
export function getKeyTransaction(args: GetKeyTransactionArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyTransactionResult> & GetKeyTransactionResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetKeyTransactionResult> = pulumi.runtime.invoke("newrelic:index/getKeyTransaction:getKeyTransaction", {
        "name": args.name,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getKeyTransaction.
 */
export interface GetKeyTransactionArgs {
    /**
     * The name of the application in New Relic.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getKeyTransaction.
 */
export interface GetKeyTransactionResult {
    readonly name: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
