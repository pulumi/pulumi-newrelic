// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific account in New Relic.
 * Accounts can be located by ID or name.  At most one of the two attributes can
 * be provided. If neither are provided, the provider's `accountId` will be used.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const acc = newrelic.getAccount({
 *     scope: "global",
 * });
 * ```
 */
export function getAccount(args?: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    accountId?: string;
    /**
     * The account name in New Relic.
     */
    name?: string;
    /**
     * The scope of the account in New Relic.  Valid values are "global" and "inRegion".  Defaults to "inRegion".
     */
    scope?: string;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    readonly accountId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly scope?: string;
}
/**
 * Use this data source to get information about a specific account in New Relic.
 * Accounts can be located by ID or name.  At most one of the two attributes can
 * be provided. If neither are provided, the provider's `accountId` will be used.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const acc = newrelic.getAccount({
 *     scope: "global",
 * });
 * ```
 */
export function getAccountOutput(args?: GetAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("newrelic:index/getAccount:getAccount", {
        "accountId": args.accountId,
        "name": args.name,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountOutputArgs {
    /**
     * The account ID in New Relic.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The account name in New Relic.
     */
    name?: pulumi.Input<string>;
    /**
     * The scope of the account in New Relic.  Valid values are "global" and "inRegion".  Defaults to "inRegion".
     */
    scope?: pulumi.Input<string>;
}
