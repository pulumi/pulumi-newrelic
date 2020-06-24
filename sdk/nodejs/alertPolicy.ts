// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage New Relic alert policies.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertPolicy("foo", {
 *     incidentPreference: "PER_POLICY", // PER_POLICY is default
 * });
 * ```
 *
 * ### Provision multiple notification channels and add those channels to a policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * // Provision a Slack notification channel.
 * const slackChannel = new newrelic.AlertChannel("slackChannel", {
 *     type: "slack",
 *     config: {
 *         url: "https://hooks.slack.com/services/<*****>/<*****>",
 *         channel: "example-alerts-channel",
 *     },
 * });
 * // Provision an email notification channel.
 * const emailChannel = new newrelic.AlertChannel("emailChannel", {
 *     type: "email",
 *     config: {
 *         recipients: "example@testing.com",
 *         includeJsonAttachment: "1",
 *     },
 * });
 * // Provision the alert policy.
 * const policyWithChannels = new newrelic.AlertPolicy("policyWithChannels", {
 *     incidentPreference: "PER_CONDITION",
 *     channelIds: [
 *         slackChannel.id,
 *         emailChannel.id,
 *     ],
 * });
 * ```
 *
 * ### Reference existing notification channels and add those channel to a policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const slackChannel = newrelic.getAlertChannel({
 *     name: "slack-channel-notification",
 * });
 * const emailChannel = newrelic.getAlertChannel({
 *     name: "test@example.com",
 * });
 * // Provision the alert policy.
 * const policyWithChannels = new newrelic.AlertPolicy("policyWithChannels", {
 *     incidentPreference: "PER_CONDITION",
 *     channelIds: [
 *         slackChannel.then(slackChannel => slackChannel.id),
 *         emailChannel.then(emailChannel => emailChannel.id),
 *     ],
 * });
 * ```
 */
export class AlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertPolicyState, opts?: pulumi.CustomResourceOptions): AlertPolicy {
        return new AlertPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/alertPolicy:AlertPolicy';

    /**
     * Returns true if the given object is an instance of AlertPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertPolicy.__pulumiType;
    }

    /**
     * The New Relic account ID to operate on.
     */
    public readonly accountId!: pulumi.Output<number | undefined>;
    /**
     * An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed.
     */
    public readonly channelIds!: pulumi.Output<number[] | undefined>;
    /**
     * The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
     */
    public readonly incidentPreference!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AlertPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertPolicyArgs | AlertPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AlertPolicyState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["channelIds"] = state ? state.channelIds : undefined;
            inputs["incidentPreference"] = state ? state.incidentPreference : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AlertPolicyArgs | undefined;
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["channelIds"] = args ? args.channelIds : undefined;
            inputs["incidentPreference"] = args ? args.incidentPreference : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AlertPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertPolicy resources.
 */
export interface AlertPolicyState {
    /**
     * The New Relic account ID to operate on.
     */
    readonly accountId?: pulumi.Input<number>;
    /**
     * An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed.
     */
    readonly channelIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
     */
    readonly incidentPreference?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    readonly name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertPolicy resource.
 */
export interface AlertPolicyArgs {
    /**
     * The New Relic account ID to operate on.
     */
    readonly accountId?: pulumi.Input<number>;
    /**
     * An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result in a new alert policy resource being created and the old one being destroyed.
     */
    readonly channelIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
     */
    readonly incidentPreference?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    readonly name?: pulumi.Input<string>;
}
