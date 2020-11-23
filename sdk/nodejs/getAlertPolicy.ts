// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific alert policy in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooAlertChannel = newrelic.getAlertChannel({
 *     name: "foo@example.com",
 * });
 * const fooAlertPolicy = newrelic.getAlertPolicy({
 *     name: "foo policy",
 * });
 * const fooAlertPolicyChannel = new newrelic.AlertPolicyChannel("fooAlertPolicyChannel", {
 *     policyId: fooAlertPolicy.then(fooAlertPolicy => fooAlertPolicy.id),
 *     channelId: fooAlertChannel.then(fooAlertChannel => fooAlertChannel.id),
 * });
 * ```
 */
export function getAlertPolicy(args: GetAlertPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertPolicyResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly accountId?: number;
    /**
     * The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
     */
    readonly incidentPreference?: string;
    /**
     * The name of the alert policy in New Relic.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getAlertPolicy.
 */
export interface GetAlertPolicyResult {
    readonly accountId: number;
    /**
     * The time the policy was created.
     */
    readonly createdAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
     */
    readonly incidentPreference?: string;
    readonly name: string;
    /**
     * The time the policy was last updated.
     */
    readonly updatedAt: string;
}
