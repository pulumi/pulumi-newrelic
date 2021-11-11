// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update, and delete New Relic Events to Metrics rules.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.EventsToMetricsRule("foo", {
 *     accountId: 12345,
 *     description: "Example description",
 *     nrql: "SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name",
 * });
 * ```
 *
 * ## Import
 *
 * New Relic Events to Metrics rules can be imported using a concatenated string of the format
 *
 * `<account_id>:<rule_id>`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
 * ```
 */
export class EventsToMetricsRule extends pulumi.CustomResource {
    /**
     * Get an existing EventsToMetricsRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventsToMetricsRuleState, opts?: pulumi.CustomResourceOptions): EventsToMetricsRule {
        return new EventsToMetricsRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/eventsToMetricsRule:EventsToMetricsRule';

    /**
     * Returns true if the given object is an instance of EventsToMetricsRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventsToMetricsRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventsToMetricsRule.__pulumiType;
    }

    /**
     * Account with the event and where the metrics will be put.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Provides additional information about the rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * True means this rule is enabled. False means the rule is currently not creating metrics.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the rule. This must be unique within an account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Explains how to create metrics from events.
     */
    public readonly nrql!: pulumi.Output<string>;
    /**
     * The id, uniquely identifying the rule.
     */
    public /*out*/ readonly ruleId!: pulumi.Output<string>;

    /**
     * Create a EventsToMetricsRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventsToMetricsRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventsToMetricsRuleArgs | EventsToMetricsRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventsToMetricsRuleState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nrql"] = state ? state.nrql : undefined;
            inputs["ruleId"] = state ? state.ruleId : undefined;
        } else {
            const args = argsOrState as EventsToMetricsRuleArgs | undefined;
            if ((!args || args.nrql === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nrql'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nrql"] = args ? args.nrql : undefined;
            inputs["ruleId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EventsToMetricsRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventsToMetricsRule resources.
 */
export interface EventsToMetricsRuleState {
    /**
     * Account with the event and where the metrics will be put.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Provides additional information about the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * True means this rule is enabled. False means the rule is currently not creating metrics.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the rule. This must be unique within an account.
     */
    name?: pulumi.Input<string>;
    /**
     * Explains how to create metrics from events.
     */
    nrql?: pulumi.Input<string>;
    /**
     * The id, uniquely identifying the rule.
     */
    ruleId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventsToMetricsRule resource.
 */
export interface EventsToMetricsRuleArgs {
    /**
     * Account with the event and where the metrics will be put.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Provides additional information about the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * True means this rule is enabled. False means the rule is currently not creating metrics.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the rule. This must be unique within an account.
     */
    name?: pulumi.Input<string>;
    /**
     * Explains how to create metrics from events.
     */
    nrql: pulumi.Input<string>;
}
