// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create and manage New Relic Synthetic private location.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const bar = new newrelic.synthetics.PrivateLocation("bar", {
 *     accountId: "NewRelic account ID",
 *     description: "The private location description",
 * });
 * ```
 *
 * ## Import
 *
 * A Synthetics private location can be imported using the `guid`
 *
 * ```sh
 *  $ pulumi import newrelic:synthetics/privateLocation:PrivateLocation bar GUID
 * ```
 */
export class PrivateLocation extends pulumi.CustomResource {
    /**
     * Get an existing PrivateLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateLocationState, opts?: pulumi.CustomResourceOptions): PrivateLocation {
        return new PrivateLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/privateLocation:PrivateLocation';

    /**
     * Returns true if the given object is an instance of PrivateLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateLocation.__pulumiType;
    }

    /**
     * Account ID of the New Relic.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The private location description.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The private location globally unique identifier.
     */
    public /*out*/ readonly domainId!: pulumi.Output<string>;
    /**
     * The unique client identifier for the Synthetics private location in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The private locations key.
     */
    public /*out*/ readonly key!: pulumi.Output<string>;
    /**
     * An alternate identifier based on name.
     */
    public /*out*/ readonly locationId!: pulumi.Output<string>;
    /**
     * The name of the private location.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     */
    public readonly verifiedScriptExecution!: pulumi.Output<boolean | undefined>;

    /**
     * Create a PrivateLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateLocationArgs | PrivateLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLocationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["locationId"] = state ? state.locationId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["verifiedScriptExecution"] = state ? state.verifiedScriptExecution : undefined;
        } else {
            const args = argsOrState as PrivateLocationArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["verifiedScriptExecution"] = args ? args.verifiedScriptExecution : undefined;
            resourceInputs["domainId"] = undefined /*out*/;
            resourceInputs["guid"] = undefined /*out*/;
            resourceInputs["key"] = undefined /*out*/;
            resourceInputs["locationId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLocation resources.
 */
export interface PrivateLocationState {
    /**
     * Account ID of the New Relic.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The private location description.
     */
    description?: pulumi.Input<string>;
    /**
     * The private location globally unique identifier.
     */
    domainId?: pulumi.Input<string>;
    /**
     * The unique client identifier for the Synthetics private location in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The private locations key.
     */
    key?: pulumi.Input<string>;
    /**
     * An alternate identifier based on name.
     */
    locationId?: pulumi.Input<string>;
    /**
     * The name of the private location.
     */
    name?: pulumi.Input<string>;
    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     */
    verifiedScriptExecution?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a PrivateLocation resource.
 */
export interface PrivateLocationArgs {
    /**
     * Account ID of the New Relic.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The private location description.
     */
    description: pulumi.Input<string>;
    /**
     * The name of the private location.
     */
    name?: pulumi.Input<string>;
    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     */
    verifiedScriptExecution?: pulumi.Input<boolean>;
}