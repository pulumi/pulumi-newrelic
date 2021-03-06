// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific entity in New Relic One that already exists.
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
        "ignoreCase": args.ignoreCase,
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
     * The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
     */
    readonly domain?: string;
    /**
     * Ignore case of the `name` when searching for the entity. Defaults to false.
     */
    readonly ignoreCase?: boolean;
    /**
     * The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     */
    readonly name: string;
    readonly tag?: inputs.GetEntityTag;
    /**
     * The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
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
    readonly ignoreCase?: boolean;
    readonly name: string;
    readonly servingApmApplicationId: number;
    readonly tag?: outputs.GetEntityTag;
    readonly type: string;
}
