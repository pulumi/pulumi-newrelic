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
 * const fooAlertPolicy = new newrelic.AlertPolicy("foo", {});
 * const fooNrqlAlertCondition = new newrelic.NrqlAlertCondition("foo", {
 *     enabled: true,
 *     nrql: {
 *         query: "SELECT count(*) FROM SyntheticCheck WHERE monitorId = '<monitorId>'",
 *         sinceValue: "3",
 *     },
 *     policyId: fooAlertPolicy.id,
 *     runbookUrl: "https://www.example.com",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 1,
 *         timeFunction: "all",
 *     }],
 *     valueFunction: "single_value",
 * });
 * ```
 * 
 * ## Terms
 * 
 * The `term` mapping supports the following arguments:
 * 
 *   * `duration` - (Required) In minutes, must be: `1`, `2`, `3`, `4`, `5`, `10`, `15`, `30`, `60`, or `120`.
 *   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
 *   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`.
 *   * `threshold` - (Required) Must be 0 or greater.
 *   * `time_function` - (Required) `all` or `any`.
 * 
 * ## NRQL
 * 
 * The `nrql` attribute supports the following arguments:
 * 
 *   * `query` - (Required) The NRQL query to execute for the condition.
 *   * `since_value` - (Required) The value to be used in the `SINCE <X> MINUTES AGO` clause for the NRQL query. Must be: `1`, `2`, `3`, `4`, or `5`.
 */
export class NrqlAlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing NrqlAlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NrqlAlertConditionState, opts?: pulumi.CustomResourceOptions): NrqlAlertCondition {
        return new NrqlAlertCondition(name, <any>state, { ...opts, id: id });
    }

    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    public readonly enabled: pulumi.Output<boolean | undefined>;
    /**
     * The title of the condition
     */
    public readonly name: pulumi.Output<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    public readonly nrql: pulumi.Output<{ query: string, sinceValue: string }>;
    /**
     * The ID of the policy where this condition should be used.
     */
    public readonly policyId: pulumi.Output<number>;
    /**
     * Runbook URL to display in notifications.
     */
    public readonly runbookUrl: pulumi.Output<string | undefined>;
    /**
     * A list of terms for this condition. See Terms below for details.
     */
    public readonly terms: pulumi.Output<{ duration: number, operator?: string, priority?: string, threshold: number, timeFunction: string }[]>;
    /**
     * Possible values are `single_value`, `sum`.
     */
    public readonly valueFunction: pulumi.Output<string | undefined>;

    /**
     * Create a NrqlAlertCondition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NrqlAlertConditionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NrqlAlertConditionArgs | NrqlAlertConditionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: NrqlAlertConditionState = argsOrState as NrqlAlertConditionState | undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nrql"] = state ? state.nrql : undefined;
            inputs["policyId"] = state ? state.policyId : undefined;
            inputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            inputs["terms"] = state ? state.terms : undefined;
            inputs["valueFunction"] = state ? state.valueFunction : undefined;
        } else {
            const args = argsOrState as NrqlAlertConditionArgs | undefined;
            if (!args || args.nrql === undefined) {
                throw new Error("Missing required property 'nrql'");
            }
            if (!args || args.policyId === undefined) {
                throw new Error("Missing required property 'policyId'");
            }
            if (!args || args.terms === undefined) {
                throw new Error("Missing required property 'terms'");
            }
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nrql"] = args ? args.nrql : undefined;
            inputs["policyId"] = args ? args.policyId : undefined;
            inputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            inputs["terms"] = args ? args.terms : undefined;
            inputs["valueFunction"] = args ? args.valueFunction : undefined;
        }
        super("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NrqlAlertCondition resources.
 */
export interface NrqlAlertConditionState {
    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The title of the condition
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    readonly nrql?: pulumi.Input<{ query: pulumi.Input<string>, sinceValue: pulumi.Input<string> }>;
    /**
     * The ID of the policy where this condition should be used.
     */
    readonly policyId?: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * A list of terms for this condition. See Terms below for details.
     */
    readonly terms?: pulumi.Input<pulumi.Input<{ duration: pulumi.Input<number>, operator?: pulumi.Input<string>, priority?: pulumi.Input<string>, threshold: pulumi.Input<number>, timeFunction: pulumi.Input<string> }>[]>;
    /**
     * Possible values are `single_value`, `sum`.
     */
    readonly valueFunction?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NrqlAlertCondition resource.
 */
export interface NrqlAlertConditionArgs {
    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The title of the condition
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    readonly nrql: pulumi.Input<{ query: pulumi.Input<string>, sinceValue: pulumi.Input<string> }>;
    /**
     * The ID of the policy where this condition should be used.
     */
    readonly policyId: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * A list of terms for this condition. See Terms below for details.
     */
    readonly terms: pulumi.Input<pulumi.Input<{ duration: pulumi.Input<number>, operator?: pulumi.Input<string>, priority?: pulumi.Input<string>, threshold: pulumi.Input<number>, timeFunction: pulumi.Input<string> }>[]>;
    /**
     * Possible values are `single_value`, `sum`.
     */
    readonly valueFunction?: pulumi.Input<string>;
}
