// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to link an AWS account to New Relic.
 *
 * ## Prerequisite
 *
 * Setup is required in AWS for this resource to work properly. The New Relic AWS integration can be set up to pull metrics from AWS services or AWS can push metrics to New Relic using CloudWatch Metric Streams.
 *
 * Using a metric stream to New Relic is the preferred way to integrate with AWS. Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/aws-integrations-list/aws-metric-stream/#set-up-metric-stream) to set up a metric stream.
 *
 * To pull data from AWS instead, complete the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/get-started/connect-aws-new-relic-infrastructure-monitoring#connect).
 *
 * ## Example Usage
 *
 * You can also use the full example, including the AWS set up, found in our guides.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.cloud.AwsLinkAccount("foo", {
 *     arn: "arn:aws:service:region:account-id:resource-id",
 *     metricCollectionMode: "PUSH",
 *     name: "account name",
 * });
 * ```
 *
 * ## Import
 *
 * Linked AWS accounts can be imported using the `id`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:cloud/awsLinkAccount:AwsLinkAccount foo <id>
 * ```
 */
export class AwsLinkAccount extends pulumi.CustomResource {
    /**
     * Get an existing AwsLinkAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsLinkAccountState, opts?: pulumi.CustomResourceOptions): AwsLinkAccount {
        return new AwsLinkAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/awsLinkAccount:AwsLinkAccount';

    /**
     * Returns true if the given object is an instance of AwsLinkAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AwsLinkAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AwsLinkAccount.__pulumiType;
    }

    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     */
    public readonly arn!: pulumi.Output<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    public readonly metricCollectionMode!: pulumi.Output<string | undefined>;
    /**
     * The name of the linked account.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AwsLinkAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsLinkAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsLinkAccountArgs | AwsLinkAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsLinkAccountState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["metricCollectionMode"] = state ? state.metricCollectionMode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AwsLinkAccountArgs | undefined;
            if ((!args || args.arn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'arn'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["arn"] = args ? args.arn : undefined;
            resourceInputs["metricCollectionMode"] = args ? args.metricCollectionMode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AwsLinkAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AwsLinkAccount resources.
 */
export interface AwsLinkAccountState {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     */
    arn?: pulumi.Input<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    metricCollectionMode?: pulumi.Input<string>;
    /**
     * The name of the linked account.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AwsLinkAccount resource.
 */
export interface AwsLinkAccountArgs {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     */
    arn: pulumi.Input<string>;
    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     */
    metricCollectionMode?: pulumi.Input<string>;
    /**
     * The name of the linked account.
     */
    name?: pulumi.Input<string>;
}
