// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
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
