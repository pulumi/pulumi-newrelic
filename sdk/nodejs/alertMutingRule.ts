// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertMutingRule("foo", {
 *     name: "Example Muting Rule",
 *     enabled: true,
 *     description: "muting rule test.",
 *     condition: {
 *         conditions: [
 *             {
 *                 attribute: "product",
 *                 operator: "EQUALS",
 *                 values: ["APM"],
 *             },
 *             {
 *                 attribute: "targetId",
 *                 operator: "EQUALS",
 *                 values: ["Muted"],
 *             },
 *         ],
 *         operator: "AND",
 *     },
 *     schedule: {
 *         startTime: "2021-01-28T15:30:00",
 *         endTime: "2021-01-28T16:30:00",
 *         timeZone: "America/Los_Angeles",
 *         repeat: "WEEKLY",
 *         weeklyRepeatDays: [
 *             "MONDAY",
 *             "WEDNESDAY",
 *             "FRIDAY",
 *         ],
 *         repeatCount: 42,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.
 *
 * ```sh
 * $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
 * ```
 */
export class AlertMutingRule extends pulumi.CustomResource {
    /**
     * Get an existing AlertMutingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertMutingRuleState, opts?: pulumi.CustomResourceOptions): AlertMutingRule {
        return new AlertMutingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/alertMutingRule:AlertMutingRule';

    /**
     * Returns true if the given object is an instance of AlertMutingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertMutingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertMutingRule.__pulumiType;
    }

    /**
     * The account id of the MutingRule.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The condition that defines which incidents to target. See Nested condition blocks below for details.
     */
    public readonly condition!: pulumi.Output<outputs.AlertMutingRuleCondition>;
    /**
     * The description of the MutingRule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the MutingRule is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The name of the MutingRule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specify a schedule for enabling the MutingRule. See Schedule below for details
     */
    public readonly schedule!: pulumi.Output<outputs.AlertMutingRuleSchedule | undefined>;

    /**
     * Create a AlertMutingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertMutingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertMutingRuleArgs | AlertMutingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertMutingRuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
        } else {
            const args = argsOrState as AlertMutingRuleArgs | undefined;
            if ((!args || args.condition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'condition'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertMutingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertMutingRule resources.
 */
export interface AlertMutingRuleState {
    /**
     * The account id of the MutingRule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The condition that defines which incidents to target. See Nested condition blocks below for details.
     */
    condition?: pulumi.Input<inputs.AlertMutingRuleCondition>;
    /**
     * The description of the MutingRule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the MutingRule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the MutingRule.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify a schedule for enabling the MutingRule. See Schedule below for details
     */
    schedule?: pulumi.Input<inputs.AlertMutingRuleSchedule>;
}

/**
 * The set of arguments for constructing a AlertMutingRule resource.
 */
export interface AlertMutingRuleArgs {
    /**
     * The account id of the MutingRule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The condition that defines which incidents to target. See Nested condition blocks below for details.
     */
    condition: pulumi.Input<inputs.AlertMutingRuleCondition>;
    /**
     * The description of the MutingRule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the MutingRule is enabled.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The name of the MutingRule.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify a schedule for enabling the MutingRule. See Schedule below for details
     */
    schedule?: pulumi.Input<inputs.AlertMutingRuleSchedule>;
}
