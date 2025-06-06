// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific cloud account linked to New Relic.
 * Accounts can be located by a combination of New Relic Account ID, name and cloud provider (aws, gcp, azure, etc). Name and cloud provider are required attributes. If no accountId is specified on the resource the provider level accountId will be used.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const account = newrelic.getCloudAccount({
 *     accountId: "12345",
 *     cloudProvider: "aws",
 *     name: "my aws account",
 * });
 * ```
 */
export function getCloudAccount(args: GetCloudAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getCloudAccount:getCloudAccount", {
        "accountId": args.accountId,
        "cloudProvider": args.cloudProvider,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudAccount.
 */
export interface GetCloudAccountArgs {
    /**
     * The account ID in New Relic.
     */
    accountId?: string;
    /**
     * The cloud provider of the account (aws, gcp, azure, etc)
     */
    cloudProvider: string;
    /**
     * The cloud account name in New Relic.
     */
    name: string;
}

/**
 * A collection of values returned by getCloudAccount.
 */
export interface GetCloudAccountResult {
    readonly accountId?: string;
    readonly cloudProvider: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Use this data source to get information about a specific cloud account linked to New Relic.
 * Accounts can be located by a combination of New Relic Account ID, name and cloud provider (aws, gcp, azure, etc). Name and cloud provider are required attributes. If no accountId is specified on the resource the provider level accountId will be used.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const account = newrelic.getCloudAccount({
 *     accountId: "12345",
 *     cloudProvider: "aws",
 *     name: "my aws account",
 * });
 * ```
 */
export function getCloudAccountOutput(args: GetCloudAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("newrelic:index/getCloudAccount:getCloudAccount", {
        "accountId": args.accountId,
        "cloudProvider": args.cloudProvider,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudAccount.
 */
export interface GetCloudAccountOutputArgs {
    /**
     * The account ID in New Relic.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The cloud provider of the account (aws, gcp, azure, etc)
     */
    cloudProvider: pulumi.Input<string>;
    /**
     * The cloud account name in New Relic.
     */
    name: pulumi.Input<string>;
}
