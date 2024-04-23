// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update and delete New Relic Obfuscation Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const bar = new newrelic.ObfuscationExpression("bar", {
 *     name: "expressionName",
 *     description: "description of the expression",
 *     regex: "(^http)",
 * });
 * const foo = new newrelic.ObfuscationRule("foo", {
 *     name: "ruleName",
 *     description: "description of the rule",
 *     filter: "hostStatus=running",
 *     enabled: true,
 *     actions: [{
 *         attributes: ["message"],
 *         expressionId: bar.id,
 *         method: "MASK",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * New Relic obfuscation rule can be imported using the rule ID, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:index/obfuscationRule:ObfuscationRule foo 34567
 * ```
 */
export class ObfuscationRule extends pulumi.CustomResource {
    /**
     * Get an existing ObfuscationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObfuscationRuleState, opts?: pulumi.CustomResourceOptions): ObfuscationRule {
        return new ObfuscationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/obfuscationRule:ObfuscationRule';

    /**
     * Returns true if the given object is an instance of ObfuscationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObfuscationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObfuscationRule.__pulumiType;
    }

    /**
     * The account id associated with the obfuscation rule.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Actions for the rule. The actions will be applied in the order specified by this list.
     */
    public readonly actions!: pulumi.Output<outputs.ObfuscationRuleAction[]>;
    /**
     * Description of rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * NRQL for determining whether a given log record should have obfuscation actions applied.
     */
    public readonly filter!: pulumi.Output<string>;
    /**
     * Name of rule.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ObfuscationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObfuscationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObfuscationRuleArgs | ObfuscationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObfuscationRuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ObfuscationRuleArgs | undefined;
            if ((!args || args.actions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actions'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.filter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filter'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObfuscationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObfuscationRule resources.
 */
export interface ObfuscationRuleState {
    /**
     * The account id associated with the obfuscation rule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Actions for the rule. The actions will be applied in the order specified by this list.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.ObfuscationRuleAction>[]>;
    /**
     * Description of rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * NRQL for determining whether a given log record should have obfuscation actions applied.
     */
    filter?: pulumi.Input<string>;
    /**
     * Name of rule.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObfuscationRule resource.
 */
export interface ObfuscationRuleArgs {
    /**
     * The account id associated with the obfuscation rule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Actions for the rule. The actions will be applied in the order specified by this list.
     */
    actions: pulumi.Input<pulumi.Input<inputs.ObfuscationRuleAction>[]>;
    /**
     * Description of rule.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * NRQL for determining whether a given log record should have obfuscation actions applied.
     */
    filter: pulumi.Input<string>;
    /**
     * Name of rule.
     */
    name?: pulumi.Input<string>;
}
