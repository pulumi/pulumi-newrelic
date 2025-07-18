// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getNotificationDestination(args?: GetNotificationDestinationArgs, opts?: pulumi.InvokeOptions): Promise<GetNotificationDestinationResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getNotificationDestination:getNotificationDestination", {
        "accountId": args.accountId,
        "id": args.id,
        "name": args.name,
        "secureUrls": args.secureUrls,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotificationDestination.
 */
export interface GetNotificationDestinationArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: string;
    /**
     * The id of the notification destination in New Relic.
     */
    id?: string;
    /**
     * The name of the notification destination.
     *
     * Optional:
     */
    name?: string;
    /**
     * The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
     */
    secureUrls?: inputs.GetNotificationDestinationSecureUrl[];
}

/**
 * A collection of values returned by getNotificationDestination.
 */
export interface GetNotificationDestinationResult {
    readonly accountId: string;
    /**
     * An indication whether the notification destination is active or not.
     */
    readonly active: boolean;
    /**
     * The unique entity identifier of the destination in New Relic.
     */
    readonly guid: string;
    readonly id?: string;
    /**
     * The name of the notification destination.
     */
    readonly name?: string;
    /**
     * A nested block that describes a notification destination property.
     */
    readonly properties: outputs.GetNotificationDestinationProperty[];
    /**
     * The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
     */
    readonly secureUrls: outputs.GetNotificationDestinationSecureUrl[];
    /**
     * The status of the notification destination.
     */
    readonly status: string;
    /**
     * The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK`, `SLACK_COLLABORATION`, `MICROSOFT_TEAMS` and `WORKFLOW_AUTOMATION`.
     */
    readonly type: string;
}
export function getNotificationDestinationOutput(args?: GetNotificationDestinationOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNotificationDestinationResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("newrelic:index/getNotificationDestination:getNotificationDestination", {
        "accountId": args.accountId,
        "id": args.id,
        "name": args.name,
        "secureUrls": args.secureUrls,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotificationDestination.
 */
export interface GetNotificationDestinationOutputArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The id of the notification destination in New Relic.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the notification destination.
     *
     * Optional:
     */
    name?: pulumi.Input<string>;
    /**
     * The URL in secure format, showing only the `prefix`, as the `secureSuffix` is a secret.
     */
    secureUrls?: pulumi.Input<pulumi.Input<inputs.GetNotificationDestinationSecureUrlArgs>[]>;
}
