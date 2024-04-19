// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `newrelic.Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.
 *
 * ## Example Usage
 *
 * The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGetGroup = foo.then(foo => newrelic.getGroup({
 *     authenticationDomainId: foo.id,
 *     name: "Test Group",
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Additional Examples
 *
 * The following example demonstrates utilizing attributes exported by this data source.
 *
 * In order to directly reference the attributes `id` and `userIds` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `userIds` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * import * as std from "@pulumi/std";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGetGroup = foo.then(foo => newrelic.getGroup({
 *     authenticationDomainId: foo.id,
 *     name: "Test Group",
 * }));
 * const id = fooGetGroup.then(fooGetGroup => fooGetGroup.id);
 * const userIds = Promise.all([fooGetGroup.then(fooGetGroup => fooGetGroup.userIds).length, fooGetGroup.then(fooGetGroup => std.join({
 *     separator: ", ",
 *     input: fooGetGroup.userIds,
 * }))]).then(([length, invoke]) => length > 0 ? invoke.result : "");
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGroup(args: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getGroup:getGroup", {
        "authenticationDomainId": args.authenticationDomainId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupArgs {
    /**
     * The ID of the authentication domain the group to be searched for belongs to.
     */
    authenticationDomainId: string;
    /**
     * The name of the group to search for.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     */
    name: string;
}

/**
 * A collection of values returned by getGroup.
 */
export interface GetGroupResult {
    readonly authenticationDomainId: string;
    /**
     * The ID of the fetched matching group.
     */
    readonly id: string;
    readonly name: string;
    /**
     * IDs of users who belong to the group. In the absence of any users in the group, the value of this attribute would be an empty list.
     */
    readonly userIds: string[];
}
/**
 * The `newrelic.Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.
 *
 * ## Example Usage
 *
 * The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGetGroup = foo.then(foo => newrelic.getGroup({
 *     authenticationDomainId: foo.id,
 *     name: "Test Group",
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Additional Examples
 *
 * The following example demonstrates utilizing attributes exported by this data source.
 *
 * In order to directly reference the attributes `id` and `userIds` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `userIds` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * import * as std from "@pulumi/std";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGetGroup = foo.then(foo => newrelic.getGroup({
 *     authenticationDomainId: foo.id,
 *     name: "Test Group",
 * }));
 * const id = fooGetGroup.then(fooGetGroup => fooGetGroup.id);
 * const userIds = Promise.all([fooGetGroup.then(fooGetGroup => fooGetGroup.userIds).length, fooGetGroup.then(fooGetGroup => std.join({
 *     separator: ", ",
 *     input: fooGetGroup.userIds,
 * }))]).then(([length, invoke]) => length > 0 ? invoke.result : "");
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGroupOutput(args: GetGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupResult> {
    return pulumi.output(args).apply((a: any) => getGroup(a, opts))
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupOutputArgs {
    /**
     * The ID of the authentication domain the group to be searched for belongs to.
     */
    authenticationDomainId: pulumi.Input<string>;
    /**
     * The name of the group to search for.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     */
    name: pulumi.Input<string>;
}
