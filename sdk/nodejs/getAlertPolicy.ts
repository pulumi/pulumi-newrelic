// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific alert policy in New Relic that already exists.
 */
export function getAlertPolicy(args: GetAlertPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getAlertPolicy:getAlertPolicy", {
        "accountId": args.accountId,
        "incidentPreference": args.incidentPreference,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertPolicy.
 */
export interface GetAlertPolicyArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: string;
    /**
     * The rollup strategy for the policy, which can have one of the following values:
     */
    incidentPreference?: string;
    /**
     * The name of the alert policy in New Relic.
     */
    name: string;
}

/**
 * A collection of values returned by getAlertPolicy.
 */
export interface GetAlertPolicyResult {
    readonly accountId: string;
    /**
     * The time the policy was created.
     */
    readonly createdAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The rollup strategy for the policy, which can have one of the following values:
     */
    readonly incidentPreference?: string;
    readonly name: string;
    /**
     * The time the policy was last updated.
     */
    readonly updatedAt: string;
}
/**
 * Use this data source to get information about a specific alert policy in New Relic that already exists.
 */
export function getAlertPolicyOutput(args: GetAlertPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertPolicyResult> {
    return pulumi.output(args).apply((a: any) => getAlertPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAlertPolicy.
 */
export interface GetAlertPolicyOutputArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The rollup strategy for the policy, which can have one of the following values:
     */
    incidentPreference?: pulumi.Input<string>;
    /**
     * The name of the alert policy in New Relic.
     */
    name: pulumi.Input<string>;
}
