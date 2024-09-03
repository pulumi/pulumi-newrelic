// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.
 *
 * > **NOTE:** This is a legacy resource. The newrelic.NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const policy = new newrelic.AlertPolicy("policy", {name: "my-policy"});
 * const monitor = new newrelic.synthetics.Monitor("monitor", {
 *     locationsPublics: ["US_WEST_1"],
 *     name: "my-monitor",
 *     period: "EVERY_10_MINUTES",
 *     status: "DISABLED",
 *     type: "SIMPLE",
 *     uri: "https://www.one.newrelic.com",
 * });
 * const example = new newrelic.synthetics.MultiLocationAlertCondition("example", {
 *     policyId: policy.id,
 *     name: "Example condition",
 *     runbookUrl: "https://example.com",
 *     enabled: true,
 *     violationTimeLimitSeconds: 3600,
 *     entities: [monitor.id],
 *     critical: {
 *         threshold: 2,
 *     },
 *     warning: {
 *         threshold: 1,
 *     },
 * });
 * ```
 *
 * ## Tags
 *
 * Manage synthetics multilocation alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo policy"});
 * const fooMonitor = new newrelic.synthetics.Monitor("foo", {
 *     status: "ENABLED",
 *     name: "foo monitor",
 *     period: "EVERY_MINUTE",
 *     uri: "https://www.one.newrelic.com",
 *     type: "SIMPLE",
 *     locationsPublics: ["AP_EAST_1"],
 *     customHeaders: [{
 *         name: "some_name",
 *         value: "some_value",
 *     }],
 *     treatRedirectAsFailure: true,
 *     validationString: "success",
 *     bypassHeadRequest: true,
 *     verifySsl: true,
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * const fooMultiLocationAlertCondition = new newrelic.synthetics.MultiLocationAlertCondition("foo", {
 *     policyId: foo.id,
 *     name: "foo condition",
 *     runbookUrl: "https://example.com",
 *     enabled: true,
 *     violationTimeLimitSeconds: 3600,
 *     entities: [fooMonitor.id],
 *     critical: {
 *         threshold: 2,
 *     },
 *     warning: {
 *         threshold: 1,
 *     },
 * });
 * const myConditionEntityTags = new newrelic.EntityTags("my_condition_entity_tags", {
 *     guid: fooMultiLocationAlertCondition.entityGuid,
 *     tags: [
 *         {
 *             key: "my-key",
 *             values: [
 *                 "my-value",
 *                 "my-other-value",
 *             ],
 *         },
 *         {
 *             key: "my-key-2",
 *             values: ["my-value-2"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format
 *
 * `<policy_id>:<condition_id>`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
 * ```
 */
export class MultiLocationAlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing MultiLocationAlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MultiLocationAlertConditionState, opts?: pulumi.CustomResourceOptions): MultiLocationAlertCondition {
        return new MultiLocationAlertCondition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition';

    /**
     * Returns true if the given object is an instance of MultiLocationAlertCondition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MultiLocationAlertCondition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MultiLocationAlertCondition.__pulumiType;
    }

    /**
     * A condition term with the priority set to critical.
     */
    public readonly critical!: pulumi.Output<outputs.synthetics.MultiLocationAlertConditionCritical>;
    /**
     * Set whether to enable the alert condition.  Defaults to true.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Monitor GUID's of the Synthetics monitors to alert on.
     */
    public readonly entities!: pulumi.Output<string[]>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    public /*out*/ readonly entityGuid!: pulumi.Output<string>;
    /**
     * The title of the condition.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the policy where this condition will be used.
     */
    public readonly policyId!: pulumi.Output<string>;
    /**
     * Runbook URL to display in notifications.
     */
    public readonly runbookUrl!: pulumi.Output<string | undefined>;
    /**
     * The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
     */
    public readonly violationTimeLimitSeconds!: pulumi.Output<number | undefined>;
    /**
     * A condition term with the priority set to warning.
     *
     * > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     */
    public readonly warning!: pulumi.Output<outputs.synthetics.MultiLocationAlertConditionWarning | undefined>;

    /**
     * Create a MultiLocationAlertCondition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MultiLocationAlertConditionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MultiLocationAlertConditionArgs | MultiLocationAlertConditionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MultiLocationAlertConditionState | undefined;
            resourceInputs["critical"] = state ? state.critical : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entities"] = state ? state.entities : undefined;
            resourceInputs["entityGuid"] = state ? state.entityGuid : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            resourceInputs["violationTimeLimitSeconds"] = state ? state.violationTimeLimitSeconds : undefined;
            resourceInputs["warning"] = state ? state.warning : undefined;
        } else {
            const args = argsOrState as MultiLocationAlertConditionArgs | undefined;
            if ((!args || args.critical === undefined) && !opts.urn) {
                throw new Error("Missing required property 'critical'");
            }
            if ((!args || args.entities === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entities'");
            }
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["critical"] = args ? args.critical : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["entities"] = args ? args.entities : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            resourceInputs["violationTimeLimitSeconds"] = args ? args.violationTimeLimitSeconds : undefined;
            resourceInputs["warning"] = args ? args.warning : undefined;
            resourceInputs["entityGuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MultiLocationAlertCondition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MultiLocationAlertCondition resources.
 */
export interface MultiLocationAlertConditionState {
    /**
     * A condition term with the priority set to critical.
     */
    critical?: pulumi.Input<inputs.synthetics.MultiLocationAlertConditionCritical>;
    /**
     * Set whether to enable the alert condition.  Defaults to true.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Monitor GUID's of the Synthetics monitors to alert on.
     */
    entities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    entityGuid?: pulumi.Input<string>;
    /**
     * The title of the condition.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the policy where this condition will be used.
     */
    policyId?: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
     */
    violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A condition term with the priority set to warning.
     *
     * > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     */
    warning?: pulumi.Input<inputs.synthetics.MultiLocationAlertConditionWarning>;
}

/**
 * The set of arguments for constructing a MultiLocationAlertCondition resource.
 */
export interface MultiLocationAlertConditionArgs {
    /**
     * A condition term with the priority set to critical.
     */
    critical: pulumi.Input<inputs.synthetics.MultiLocationAlertConditionCritical>;
    /**
     * Set whether to enable the alert condition.  Defaults to true.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Monitor GUID's of the Synthetics monitors to alert on.
     */
    entities: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The title of the condition.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the policy where this condition will be used.
     */
    policyId: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
     */
    violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A condition term with the priority set to warning.
     *
     * > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     */
    warning?: pulumi.Input<inputs.synthetics.MultiLocationAlertConditionWarning>;
}
