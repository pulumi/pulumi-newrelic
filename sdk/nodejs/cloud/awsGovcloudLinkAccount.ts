// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.cloud.AwsGovcloudLinkAccount("foo", {
 *     accessKeyId: "access-key-id of aws govcloud account",
 *     accountId: Number.parseFloat("The New Relic account ID where you want to link the AWS GovCloud account"),
 *     awsAccountId: "aws govcloud account id",
 *     metricCollectionMode: "PULL",
 *     secretAccessKey: "secret access key of the aws govcloud account",
 * });
 * ```
 *
 * ## Import
 *
 * Linked AWSGovCloud accounts can be imported using the `id`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo <id>
 * ```
 */
export class AwsGovcloudLinkAccount extends pulumi.CustomResource {
    /**
     * Get an existing AwsGovcloudLinkAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsGovcloudLinkAccountState, opts?: pulumi.CustomResourceOptions): AwsGovcloudLinkAccount {
        return new AwsGovcloudLinkAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount';

    /**
     * Returns true if the given object is an instance of AwsGovcloudLinkAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AwsGovcloudLinkAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AwsGovcloudLinkAccount.__pulumiType;
    }

    /**
     * The access key of the AwsGovCloud.
     */
    public readonly accessKeyId!: pulumi.Output<string>;
    /**
     * The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The AwsGovCloud account ID.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    public readonly metricCollectionMode!: pulumi.Output<string | undefined>;
    /**
     * - The linked account name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The secret key of the AwsGovCloud.
     */
    public readonly secretAccessKey!: pulumi.Output<string>;

    /**
     * Create a AwsGovcloudLinkAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsGovcloudLinkAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsGovcloudLinkAccountArgs | AwsGovcloudLinkAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsGovcloudLinkAccountState | undefined;
            resourceInputs["accessKeyId"] = state ? state.accessKeyId : undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["metricCollectionMode"] = state ? state.metricCollectionMode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["secretAccessKey"] = state ? state.secretAccessKey : undefined;
        } else {
            const args = argsOrState as AwsGovcloudLinkAccountArgs | undefined;
            if ((!args || args.accessKeyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessKeyId'");
            }
            if ((!args || args.awsAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsAccountId'");
            }
            if ((!args || args.secretAccessKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretAccessKey'");
            }
            resourceInputs["accessKeyId"] = args ? args.accessKeyId : undefined;
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["metricCollectionMode"] = args ? args.metricCollectionMode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["secretAccessKey"] = args ? args.secretAccessKey : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AwsGovcloudLinkAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AwsGovcloudLinkAccount resources.
 */
export interface AwsGovcloudLinkAccountState {
    /**
     * The access key of the AwsGovCloud.
     */
    accessKeyId?: pulumi.Input<string>;
    /**
     * The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The AwsGovCloud account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    metricCollectionMode?: pulumi.Input<string>;
    /**
     * - The linked account name
     */
    name?: pulumi.Input<string>;
    /**
     * The secret key of the AwsGovCloud.
     */
    secretAccessKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AwsGovcloudLinkAccount resource.
 */
export interface AwsGovcloudLinkAccountArgs {
    /**
     * The access key of the AwsGovCloud.
     */
    accessKeyId: pulumi.Input<string>;
    /**
     * The New Relic account ID to operate on. This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The AwsGovCloud account ID.
     */
    awsAccountId: pulumi.Input<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    metricCollectionMode?: pulumi.Input<string>;
    /**
     * - The linked account name
     */
    name?: pulumi.Input<string>;
    /**
     * The secret key of the AwsGovCloud.
     */
    secretAccessKey: pulumi.Input<string>;
}
