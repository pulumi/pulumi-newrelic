// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Email
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         includeJsonAttachment: "true",
 *         recipients: "foo@example.com",
 *     },
 *     type: "email",
 * });
 * ```
 * ## Additional Examples
 *
 * ##### Slack
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         channel: "example-alerts-channel",
 *         url: "https://hooks.slack.com/services/XXXXXXX/XXXXXXX/XXXXXXXXXX",
 *     },
 *     type: "slack",
 * });
 * ```
 *
 * ### OpsGenie
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         apiKey: "abc123",
 *         recipients: "user1@domain.com, user2@domain.com",
 *         tags: "tag1, tag2",
 *         teams: "team1, team2",
 *     },
 *     type: "opsgenie",
 * });
 * ```
 *
 * ### PagerDuty
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         serviceKey: "abc123",
 *     },
 *     type: "pagerduty",
 * });
 * ```
 *
 * ### VictorOps
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         key: "abc123",
 *         routeKey: "/example",
 *     },
 *     type: "victorops",
 * });
 * ```
 *
 * ### Webhook
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     type: "webhook",
 *     config: {
 *         baseUrl: "http://www.test.com",
 *         payloadType: "application/json",
 *         payload: {
 *             condition_name: "$CONDITION_NAME",
 *             policy_name: "$POLICY_NAME",
 *         },
 *         headers: {
 *             header1: value1,
 *             header2: value2,
 *         },
 *     },
 * });
 * ```
 *
 * ### Webhook with complex payload
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         baseUrl: "http://www.test.com",
 *         payloadString: `{
 *   "my_custom_values": {
 *     "condition_name": "$CONDITION_NAME",
 *     "policy_name": "$POLICY_NAME"
 *   }
 * }
 *
 * `,
 *         payloadType: "application/json",
 *     },
 *     type: "webhook",
 * });
 * ```
 *
 * ## Import
 *
 * Alert channels can be imported using the `id`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:index/alertChannel:AlertChannel main <id>
 * ```
 */
export class AlertChannel extends pulumi.CustomResource {
    /**
     * Get an existing AlertChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertChannelState, opts?: pulumi.CustomResourceOptions): AlertChannel {
        return new AlertChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/alertChannel:AlertChannel';

    /**
     * Returns true if the given object is an instance of AlertChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertChannel.__pulumiType;
    }

    /**
     * Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    public readonly config!: pulumi.Output<outputs.AlertChannelConfig | undefined>;
    /**
     * The name of the channel.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AlertChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertChannelArgs | AlertChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertChannelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AlertChannelArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertChannel resources.
 */
export interface AlertChannelState {
    /**
     * Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    config?: pulumi.Input<inputs.AlertChannelConfig>;
    /**
     * The name of the channel.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertChannel resource.
 */
export interface AlertChannelArgs {
    /**
     * Determines the New Relic account where the alert channel will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    config?: pulumi.Input<inputs.AlertChannelConfig>;
    /**
     * The name of the channel.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     */
    type: pulumi.Input<string>;
}
