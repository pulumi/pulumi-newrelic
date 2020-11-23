// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific account in New Relic.
 * Accounts can be located by ID or name.  Exactly one of the two attributes is
 * required.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const acc = pulumi.output(newrelic.getAccount({
 *     scope: "global",
 * }, { async: true }));
 * ```
 */
export function getAccount(args?: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("newrelic:index/getAccount:getAccount", {
        "accountId": args.accountId,
        "name": args.name,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    /**
     * The account ID in New Relic.
     */
    readonly accountId?: number;
    /**
     * The account name in New Relic.
     */
    readonly name?: string;
    /**
     * The scope of the account in New Relic.  Valid values are "global" and "inRegion".  Defaults to "inRegion".
     */
    readonly scope?: string;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    readonly accountId?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly scope?: string;
}
