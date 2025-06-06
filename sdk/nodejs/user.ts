// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `newrelic.User` resource may be used to create, update and delete users in New Relic.
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
 * const fooUser = new newrelic.User("foo", {
 *     name: "Test New User",
 *     emailId: "test_user@test.com",
 *     authenticationDomainId: foo.then(foo => foo.id),
 *     userType: "CORE_USER_TIER",
 * });
 * ```
 *
 * ## Import
 *
 * A user can be imported using its ID. Example:
 *
 * ```sh
 * $ pulumi import newrelic:index/user:User foo 1999999999
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * The ID of the authentication domain to which the user to be created would belong.
     */
    public readonly authenticationDomainId!: pulumi.Output<string>;
    /**
     * The email ID of the user to be created.
     */
    public readonly emailId!: pulumi.Output<string>;
    /**
     * The name of the user to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing user is not supported.
     */
    public readonly userType!: pulumi.Output<string | undefined>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["authenticationDomainId"] = state ? state.authenticationDomainId : undefined;
            resourceInputs["emailId"] = state ? state.emailId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["userType"] = state ? state.userType : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.authenticationDomainId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationDomainId'");
            }
            if ((!args || args.emailId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'emailId'");
            }
            resourceInputs["authenticationDomainId"] = args ? args.authenticationDomainId : undefined;
            resourceInputs["emailId"] = args ? args.emailId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["userType"] = args ? args.userType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The ID of the authentication domain to which the user to be created would belong.
     */
    authenticationDomainId?: pulumi.Input<string>;
    /**
     * The email ID of the user to be created.
     */
    emailId?: pulumi.Input<string>;
    /**
     * The name of the user to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing user is not supported.
     */
    userType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The ID of the authentication domain to which the user to be created would belong.
     */
    authenticationDomainId: pulumi.Input<string>;
    /**
     * The email ID of the user to be created.
     */
    emailId: pulumi.Input<string>;
    /**
     * The name of the user to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
     *
     * > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     *
     * > **WARNING:** Changing the `authenticationDomainId` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authenticationDomainId` of an existing user is not supported.
     */
    userType?: pulumi.Input<string>;
}
