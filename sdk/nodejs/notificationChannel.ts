// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage New Relic notification channels. Details regarding supported products and permissions can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/notifications/destinations).
 *
 * ## Example Usage
 *
 * ##### [Webhook](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#webhook)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "IINT",
 *     properties: [{
 *         key: "payload",
 *         label: "Payload Template",
 *         value: "name: {{ foo }}",
 *     }],
 *     type: "WEBHOOK",
 * });
 * ```
 * See additional examples.
 * ## Additional Examples
 *
 * ##### [ServiceNow](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenow)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "IINT",
 *     properties: [
 *         {
 *             key: "description",
 *             value: "General description",
 *         },
 *         {
 *             key: "short_description",
 *             value: "Short description",
 *         },
 *     ],
 *     type: "SERVICENOW_INCIDENTS",
 * });
 * ```
 *
 * ##### [Email](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#email)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "ERROR_TRACKING",
 *     properties: [{
 *         key: "subject",
 *         value: "New Subject Title",
 *     }],
 *     type: "EMAIL",
 * });
 * ```
 *
 * ##### [Jira Classic](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#jira)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "ERROR_TRACKING",
 *     properties: [
 *         {
 *             key: "project",
 *             value: "10000",
 *         },
 *         {
 *             key: "issuetype",
 *             value: "10004",
 *         },
 *         {
 *             key: "description",
 *             value: "Issue ID: {{ issueId }}",
 *         },
 *         {
 *             key: "summary",
 *             value: "{{ annotations.title.[0] }}",
 *         },
 *     ],
 *     type: "JIRA_CLASSIC",
 * });
 * ```
 *
 * ##### [PagerDuty with account integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "IINT",
 *     properties: [
 *         {
 *             key: "summary",
 *             value: "General summary",
 *         },
 *         {
 *             key: "service",
 *             value: "PTQK3FM",
 *         },
 *         {
 *             key: "email",
 *             value: "example@email.com",
 *         },
 *     ],
 *     type: "PAGERDUTY_ACCOUNT_INTEGRATION",
 * });
 * ```
 *
 * ##### [PagerDuty with service integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NotificationChannel("foo", {
 *     accountId: 12345678,
 *     destinationId: "00b6bd1d-ac06-4d3d-bd72-49551e70f7a8",
 *     product: "IINT",
 *     properties: [{
 *         key: "summary",
 *         value: "General summary",
 *     }],
 *     type: "PAGERDUTY_SERVICE_INTEGRATION",
 * });
 * ```
 *
 * > **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
 *
 * ## Full Scenario Example
 *
 * Create a destination resource and reference that destination to the channel resource:
 *
 * ### Create a destination
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const webhook_destination = new newrelic.NotificationDestination("webhook-destination", {
 *     accountId: 12345678,
 *     authBasic: {
 *         password: "password",
 *         user: "username",
 *     },
 *     properties: [{
 *         key: "url",
 *         value: "https://webhook.site/94193c01-4a81-4782-8f1b-554d5230395b",
 *     }],
 *     type: "WEBHOOK",
 * });
 * ```
 *
 * ### Create a channel
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const webhook_channel = new newrelic.NotificationChannel("webhook-channel", {
 *     accountId: 12345678,
 *     type: "WEBHOOK",
 *     destinationId: newrelic_notification_destination["webhook-destination"].id,
 *     product: "IINT",
 *     properties: [{
 *         key: "payload",
 *         value: "{name: foo}",
 *         label: "Payload Template",
 *     }],
 * });
 * ```
 *
 * ## Additional Information
 *
 * More details about the channels API can be found [here](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels).
 */
export class NotificationChannel extends pulumi.CustomResource {
    /**
     * Get an existing NotificationChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationChannelState, opts?: pulumi.CustomResourceOptions): NotificationChannel {
        return new NotificationChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/notificationChannel:NotificationChannel';

    /**
     * Returns true if the given object is an instance of NotificationChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationChannel.__pulumiType;
    }

    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Indicates whether the channel is active.
     */
    public readonly active!: pulumi.Output<boolean | undefined>;
    /**
     * The id of the destination.
     */
    public readonly destinationId!: pulumi.Output<string>;
    /**
     * The name of the channel.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     */
    public readonly product!: pulumi.Output<string>;
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     */
    public readonly properties!: pulumi.Output<outputs.NotificationChannelProperty[]>;
    /**
     * The status of the channel.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `JIRA_NEXTGEN`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a NotificationChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationChannelArgs | NotificationChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationChannelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["destinationId"] = state ? state.destinationId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["product"] = state ? state.product : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as NotificationChannelArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.destinationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationId'");
            }
            if ((!args || args.product === undefined) && !opts.urn) {
                throw new Error("Missing required property 'product'");
            }
            if ((!args || args.properties === undefined) && !opts.urn) {
                throw new Error("Missing required property 'properties'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["destinationId"] = args ? args.destinationId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["product"] = args ? args.product : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationChannel resources.
 */
export interface NotificationChannelState {
    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Indicates whether the channel is active.
     */
    active?: pulumi.Input<boolean>;
    /**
     * The id of the destination.
     */
    destinationId?: pulumi.Input<string>;
    /**
     * The name of the channel.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     */
    product?: pulumi.Input<string>;
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     */
    properties?: pulumi.Input<pulumi.Input<inputs.NotificationChannelProperty>[]>;
    /**
     * The status of the channel.
     */
    status?: pulumi.Input<string>;
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `JIRA_NEXTGEN`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NotificationChannel resource.
 */
export interface NotificationChannelArgs {
    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * Indicates whether the channel is active.
     */
    active?: pulumi.Input<boolean>;
    /**
     * The id of the destination.
     */
    destinationId: pulumi.Input<string>;
    /**
     * The name of the channel.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     */
    product: pulumi.Input<string>;
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     */
    properties: pulumi.Input<pulumi.Input<inputs.NotificationChannelProperty>[]>;
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `JIRA_NEXTGEN`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     */
    type: pulumi.Input<string>;
}
