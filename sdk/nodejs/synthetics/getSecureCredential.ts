// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.
 *
 * Note that the secure credential's value is not returned as an attribute for security reasons.
 */
export function getSecureCredential(args: GetSecureCredentialArgs, opts?: pulumi.InvokeOptions): Promise<GetSecureCredentialResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:synthetics/getSecureCredential:getSecureCredential", {
        "accountId": args.accountId,
        "key": args.key,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecureCredential.
 */
export interface GetSecureCredentialArgs {
    /**
     * The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
     */
    accountId?: number;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    key: string;
}

/**
 * A collection of values returned by getSecureCredential.
 */
export interface GetSecureCredentialResult {
    readonly accountId: number;
    /**
     * The secure credential's description.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly key: string;
    /**
     * The time the secure credential was last updated.
     */
    readonly lastUpdated: string;
}
/**
 * Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.
 *
 * Note that the secure credential's value is not returned as an attribute for security reasons.
 */
export function getSecureCredentialOutput(args: GetSecureCredentialOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecureCredentialResult> {
    return pulumi.output(args).apply((a: any) => getSecureCredential(a, opts))
}

/**
 * A collection of arguments for invoking getSecureCredential.
 */
export interface GetSecureCredentialOutputArgs {
    /**
     * The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    key: pulumi.Input<string>;
}
