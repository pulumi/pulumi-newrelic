// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create and manage New Relic Synthetic secure credentials.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.synthetics.SecureCredential("foo", {
 *     description: "My description",
 *     key: "MY_KEY",
 *     value: "My value",
 * });
 * ```
 *
 * ## Import
 *
 * A Synthetics secure credential can be imported using its `key`:
 *
 * ```sh
 * $ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
 * ```
 */
export class SecureCredential extends pulumi.CustomResource {
    /**
     * Get an existing SecureCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecureCredentialState, opts?: pulumi.CustomResourceOptions): SecureCredential {
        return new SecureCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/secureCredential:SecureCredential';

    /**
     * Returns true if the given object is an instance of SecureCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecureCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecureCredential.__pulumiType;
    }

    /**
     * Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The secure credential's description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * The time the secure credential was last updated.
     */
    public readonly lastUpdated!: pulumi.Output<string>;
    /**
     * The secure credential's value.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a SecureCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecureCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecureCredentialArgs | SecureCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecureCredentialState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["lastUpdated"] = state ? state.lastUpdated : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as SecureCredentialArgs | undefined;
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["lastUpdated"] = args ? args.lastUpdated : undefined;
            resourceInputs["value"] = args?.value ? pulumi.secret(args.value) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecureCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecureCredential resources.
 */
export interface SecureCredentialState {
    /**
     * Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The secure credential's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    key?: pulumi.Input<string>;
    /**
     * The time the secure credential was last updated.
     */
    lastUpdated?: pulumi.Input<string>;
    /**
     * The secure credential's value.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecureCredential resource.
 */
export interface SecureCredentialArgs {
    /**
     * Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The secure credential's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    key: pulumi.Input<string>;
    /**
     * The time the secure credential was last updated.
     */
    lastUpdated?: pulumi.Input<string>;
    /**
     * The secure credential's value.
     */
    value: pulumi.Input<string>;
}
