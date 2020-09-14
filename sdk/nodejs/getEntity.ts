// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific entity in New Relic One that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     name: "my-app",
 *     domain: "APM",
 *     type: "APPLICATION",
 *     tag: {
 *         key: "my-tag",
 *         value: "my-tag-value",
 *     },
 * });
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooNrqlAlertCondition = new newrelic.NrqlAlertCondition("fooNrqlAlertCondition", {
 *     policyId: fooAlertPolicy.id,
 *     type: "static",
 *     description: "Alert when transactions are taking too long",
 *     runbookUrl: "https://www.example.com",
 *     enabled: true,
 *     valueFunction: "single_value",
 *     violationTimeLimit: "one_hour",
 *     nrql: {
 *         query: app.then(app => `SELECT average(duration) FROM Transaction where appName = '${app.name}'`),
 *         evaluationOffset: 3,
 *     },
 *     critical: {
 *         operator: "above",
 *         threshold: 5.5,
 *         thresholdDuration: 300,
 *         thresholdOccurrences: "ALL",
 *     },
 * });
 * ```
 */
export function getEntity(args: GetEntityArgs, opts?: pulumi.InvokeOptions): Promise<GetEntityResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("newrelic:index/getEntity:getEntity", {
        "domain": args.domain,
        "name": args.name,
        "tag": args.tag,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getEntity.
 */
export interface GetEntityArgs {
    /**
     * The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, and SYNTH.
     */
    readonly domain?: string;
    /**
     * The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     */
    readonly name: string;
    readonly tag?: inputs.GetEntityTag;
    /**
     * The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORRKLOAD.
     */
    readonly type?: string;
}

/**
 * A collection of values returned by getEntity.
 */
export interface GetEntityResult {
    /**
     * The New Relic account ID associated with this entity.
     */
    readonly accountId: number;
    /**
     * The domain-specific application ID of the entity. Only returned for APM and Browser applications.
     */
    readonly applicationId: number;
    readonly domain: string;
    /**
     * The unique GUID of the entity.
     */
    readonly guid: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly tag?: outputs.GetEntityTag;
    readonly type: string;
}
