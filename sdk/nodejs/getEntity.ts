// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Additional Examples
 *
 * > If the entities are not found please try again without providing the `types` field.
 * ### An example of querying OTEL entities
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     domain: "EXT",
 *     name: "my-otel-app",
 *     tags: [{
 *         key: "accountID",
 *         value: "12345",
 *     }],
 * });
 * ```
 *
 * ### An example of querying AWS lambda entities
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     domain: "INFRA",
 *     name: "my_lambda_trace",
 *     tags: [{
 *         key: "accountID",
 *         value: "12345",
 *     }],
 * });
 * ```
 */
export function getEntity(args: GetEntityArgs, opts?: pulumi.InvokeOptions): Promise<GetEntityResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getEntity:getEntity", {
        "domain": args.domain,
        "ignoreCase": args.ignoreCase,
        "name": args.name,
        "tags": args.tags,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getEntity.
 */
export interface GetEntityArgs {
    /**
     * The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
     */
    domain?: string;
    /**
     * Ignore case of the `name` when searching for the entity. Defaults to false.
     */
    ignoreCase?: boolean;
    /**
     * The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     */
    name: string;
    /**
     * A tag applied to the entity. See Nested tag blocks below for details.
     */
    tags?: inputs.GetEntityTag[];
    /**
     * The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, SERVICE and WORKLOAD.
     */
    type?: string;
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
    /**
     * The browser-specific ID of the backing APM entity. Only returned for Browser applications.
     */
    readonly servingApmApplicationId: number;
    readonly tags?: outputs.GetEntityTag[];
    readonly type: string;
}
/**
 * ## Additional Examples
 *
 * > If the entities are not found please try again without providing the `types` field.
 * ### An example of querying OTEL entities
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     domain: "EXT",
 *     name: "my-otel-app",
 *     tags: [{
 *         key: "accountID",
 *         value: "12345",
 *     }],
 * });
 * ```
 *
 * ### An example of querying AWS lambda entities
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     domain: "INFRA",
 *     name: "my_lambda_trace",
 *     tags: [{
 *         key: "accountID",
 *         value: "12345",
 *     }],
 * });
 * ```
 */
export function getEntityOutput(args: GetEntityOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEntityResult> {
    return pulumi.output(args).apply((a: any) => getEntity(a, opts))
}

/**
 * A collection of arguments for invoking getEntity.
 */
export interface GetEntityOutputArgs {
    /**
     * The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
     */
    domain?: pulumi.Input<string>;
    /**
     * Ignore case of the `name` when searching for the entity. Defaults to false.
     */
    ignoreCase?: pulumi.Input<boolean>;
    /**
     * The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     */
    name: pulumi.Input<string>;
    /**
     * A tag applied to the entity. See Nested tag blocks below for details.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.GetEntityTagArgs>[]>;
    /**
     * The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, SERVICE and WORKLOAD.
     */
    type?: pulumi.Input<string>;
}
