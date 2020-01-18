// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage New Relic alert policies.
 * 
 * ## Example Usage
 * 
 * ##### Email
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.AlertChannel("foo", {
 *     config: {
 *         includeJsonAttachment: "1",
 *         recipients: "foo@example.com",
 *     },
 *     type: "email",
 * });
 * ```
 * See additional examples.
 * 
 * ## Additional Examples
 * 
 * ##### Slack
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.AlertChannel("foo", {
 *     configuration: {
 *         channel: "example-alerts-channel",
 *         url: "https://<YourOrganization>.slack.com",
 *     },
 *     type: "slack",
 * });
 * ```
 * 
 * ##### OpsGenie
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
 * ##### PagerDuty
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
 * ##### VictorOps
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
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/alert_channel.html.markdown.
 */
export class AlertChannel extends pulumi.CustomResource {
    /**
     * Get an existing AlertChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    public readonly config!: pulumi.Output<outputs.AlertChannelConfig | undefined>;
    /**
     * **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
     */
    public readonly configuration!: pulumi.Output<{[key: string]: any} | undefined>;
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AlertChannelState | undefined;
            inputs["config"] = state ? state.config : undefined;
            inputs["configuration"] = state ? state.configuration : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AlertChannelArgs | undefined;
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["config"] = args ? args.config : undefined;
            inputs["configuration"] = args ? args.configuration : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["type"] = args ? args.type : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AlertChannel.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertChannel resources.
 */
export interface AlertChannelState {
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    readonly config?: pulumi.Input<inputs.AlertChannelConfig>;
    /**
     * **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
     */
    readonly configuration?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the channel.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertChannel resource.
 */
export interface AlertChannelArgs {
    /**
     * A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
     */
    readonly config?: pulumi.Input<inputs.AlertChannelConfig>;
    /**
     * **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
     */
    readonly configuration?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the channel.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
     */
    readonly type: pulumi.Input<string>;
}
