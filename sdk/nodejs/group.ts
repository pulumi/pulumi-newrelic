// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `newrelic.Group` resource facilitates creating, updating, and deleting groups in New Relic, while also enabling the addition and removal of users from these groups.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGroup = new newrelic.Group("foo", {
 *     name: "Test Group",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userIds: [
 *         "0001112222",
 *         "2221110000",
 *     ],
 * });
 * ```
 *
 * ## Additional Examples
 *
 * ### Addition of New Users to a New Group
 *
 * The following example illustrates the creation of a group using the `newrelic.Group` resource, to which users created using the `newrelic.User` resource are added.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooUser = new newrelic.User("foo", {
 *     name: "Test User One",
 *     emailId: "test_user_one@test.com",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userType: "CORE_USER_TIER",
 * });
 * const bar = new newrelic.User("bar", {
 *     name: "Test User Two",
 *     emailId: "test_user_two@test.com",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userType: "BASIC_USER_TIER",
 * });
 * const fooGroup = new newrelic.Group("foo", {
 *     name: "Test Group",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userIds: [
 *         fooUser.id,
 *         bar.id,
 *     ],
 * });
 * ```
 *
 * ### Addition of Existing Users to a New Group
 *
 * The following example demonstrates the usage of the `newrelic.Group` resource to create a group, wherein the `newrelic.User` data source is employed to associate existing users with the newly formed group.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getAuthenticationDomain({
 *     name: "Test Authentication Domain",
 * });
 * const fooGetUser = foo.then(foo => newrelic.getUser({
 *     authenticationDomainId: foo.id,
 *     emailId: "test_user_one@test.com",
 * }));
 * const bar = foo.then(foo => newrelic.getUser({
 *     authenticationDomainId: foo.id,
 *     name: "Test User Two",
 * }));
 * const fooGroup = new newrelic.Group("foo", {
 *     name: "Test Group",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userIds: [
 *         fooGetUser.then(fooGetUser => fooGetUser.id),
 *         bar.then(bar => bar.id),
 *     ],
 * });
 * ```
 *
 * > **NOTE** Please note that the addition of users to groups is only possible when both the group and the users to be added to it belong to the *same authentication domain*. If the group being created and the users being added to it belong to different authentication domains, an error indicating `user not found` or an equivalent error will be thrown.
 *
 * ## Import
 *
 * A group can be imported using its ID. Example:
 *
 * ```sh
 * $ pulumi import newrelic:index/group:Group foo <group_id>
 * ```
 */
export class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group {
        return new Group(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/group:Group';

    /**
     * Returns true if the given object is an instance of Group.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Group {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Group.__pulumiType;
    }

    /**
     * The ID of the authentication domain to which the group to be created would belong.
     */
    public readonly authenticationDomainId!: pulumi.Output<string>;
    /**
     * The name of the group to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of IDs of users to be included in the group to be created.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
     */
    public readonly userIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupArgs | GroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupState | undefined;
            resourceInputs["authenticationDomainId"] = state ? state.authenticationDomainId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["userIds"] = state ? state.userIds : undefined;
        } else {
            const args = argsOrState as GroupArgs | undefined;
            if ((!args || args.authenticationDomainId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationDomainId'");
            }
            resourceInputs["authenticationDomainId"] = args ? args.authenticationDomainId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["userIds"] = args ? args.userIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Group.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * The ID of the authentication domain to which the group to be created would belong.
     */
    authenticationDomainId?: pulumi.Input<string>;
    /**
     * The name of the group to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of IDs of users to be included in the group to be created.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
     */
    userIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * The ID of the authentication domain to which the group to be created would belong.
     */
    authenticationDomainId: pulumi.Input<string>;
    /**
     * The name of the group to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of IDs of users to be included in the group to be created.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing group is not supported.
     */
    userIds?: pulumi.Input<pulumi.Input<string>[]>;
}
