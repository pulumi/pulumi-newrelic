// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.NrqlDropRule("foo", {
 *     accountId: "12345",
 *     description: "Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it.",
 *     action: "drop_data",
 *     nrql: "SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'",
 * });
 * const bar = new newrelic.NrqlDropRule("bar", {
 *     accountId: "12345",
 *     description: "Removes the user name and email fields from MyCustomEvent",
 *     action: "drop_attributes",
 *     nrql: "SELECT userEmail, userName FROM MyCustomEvent",
 * });
 * const baz = new newrelic.NrqlDropRule("baz", {
 *     accountId: "12345",
 *     description: "Removes containerId from metric aggregates to reduce metric cardinality.",
 *     action: "drop_attributes_from_metric_aggregates",
 *     nrql: "SELECT containerId FROM Metric",
 * });
 * ```
 *
 * ## Using `newrelic-cli` to List Out Drop Rules
 *
 * All NRQL Drop Rules associated with a New Relic account may be listed out using the following newrelic-cli command:
 *
 * This would print all drop rules associated with your New Relic account to the terminal.
 * The number of rules to be printed can be customized using the `limit` argument of this command.
 * For instance, the following command limits the number of drop rules printed to two.
 *
 * More details on the command and its arguments (for instance, the format in which the droprules are to be listed in the terminal, which is JSON by default) can be found in the output of the `newrelic nrql droprules --help` command.
 * If you do not have **newrelic-cli** installed on your device already, head over to [this page](https://github.com/newrelic/newrelic-cli#installation--upgrades) for instructions.
 *
 * ## Import
 *
 * New Relic NRQL drop rules can be imported using a concatenated string of the format
 *
 *  `<account_id>:<rule_id>`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
 * ```
 */
export class NrqlDropRule extends pulumi.CustomResource {
    /**
     * Get an existing NrqlDropRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NrqlDropRuleState, opts?: pulumi.CustomResourceOptions): NrqlDropRule {
        return new NrqlDropRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/nrqlDropRule:NrqlDropRule';

    /**
     * Returns true if the given object is an instance of NrqlDropRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NrqlDropRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NrqlDropRule.__pulumiType;
    }

    /**
     * Account where the drop rule will be put. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or ` dropAttributesFromMetricAggregates`).
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The description of the drop rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A NRQL string that specifies what data types to drop.
     */
    public readonly nrql!: pulumi.Output<string>;
    /**
     * The id, uniquely identifying the rule.
     */
    public /*out*/ readonly ruleId!: pulumi.Output<string>;

    /**
     * Create a NrqlDropRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NrqlDropRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NrqlDropRuleArgs | NrqlDropRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NrqlDropRuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["nrql"] = state ? state.nrql : undefined;
            resourceInputs["ruleId"] = state ? state.ruleId : undefined;
        } else {
            const args = argsOrState as NrqlDropRuleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.nrql === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nrql'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["nrql"] = args ? args.nrql : undefined;
            resourceInputs["ruleId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NrqlDropRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NrqlDropRule resources.
 */
export interface NrqlDropRuleState {
    /**
     * Account where the drop rule will be put. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or ` dropAttributesFromMetricAggregates`).
     */
    action?: pulumi.Input<string>;
    /**
     * The description of the drop rule.
     */
    description?: pulumi.Input<string>;
    /**
     * A NRQL string that specifies what data types to drop.
     */
    nrql?: pulumi.Input<string>;
    /**
     * The id, uniquely identifying the rule.
     */
    ruleId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NrqlDropRule resource.
 */
export interface NrqlDropRuleArgs {
    /**
     * Account where the drop rule will be put. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or ` dropAttributesFromMetricAggregates`).
     */
    action: pulumi.Input<string>;
    /**
     * The description of the drop rule.
     */
    description?: pulumi.Input<string>;
    /**
     * A NRQL string that specifies what data types to drop.
     */
    nrql: pulumi.Input<string>;
}
