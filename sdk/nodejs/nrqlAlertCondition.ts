// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage NRQL alert conditions in New Relic.
 *
 * ## NRQL
 *
 * The `nrql` block supports the following arguments:
 *
 * - `query` - (Required) The NRQL query to execute for the condition.
 * - `evaluationOffset` - (Optional) Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It's recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluationOffset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.
 * - `sinceValue` - (Optional)  **DEPRECATED:** Use `evaluationOffset` instead. The value to be used in the `SINCE <X> minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive).
 *
 * ## Terms
 *
 * > **NOTE:** The direct use of the `term` has been deprecated, and users should use `critical` and `warning` instead.  What follows now applies to the named priority attributes for `critical` and `warning`, but for those attributes the priority is not allowed.
 *
 * NRQL alert conditions support up to two terms. At least one `term` must have `priority` set to `critical` and the second optional `term` must have `priority` set to `warning`.
 *
 * The `term` block the following arguments:
 *
 * - `operator` - (Optional) Valid values are `above`, `below`, or `equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `outlier`, the only valid option here is `above`.
 * - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
 * - `threshold` - (Required) The value which will trigger a violation. Must be `0` or greater.
 * - `thresholdDuration` - (Optional) The duration of time, in seconds, that the threshold must violate for in order to create a violation. Value must be a multiple of 60.
 * <br>For _baseline_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
 * <br>For _static_ NRQL alert conditions, the value must be within 120-7200 seconds (inclusive).
 *
 * - `thresholdOccurrences` - (Optional) The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `atLeastOnce` (case insensitive).
 * - `duration` - (Optional) **DEPRECATED:** Use `thresholdDuration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
 * - `timeFunction` - (Optional) **DEPRECATED:** Use `thresholdOccurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
 */
export class NrqlAlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing NrqlAlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NrqlAlertConditionState, opts?: pulumi.CustomResourceOptions): NrqlAlertCondition {
        return new NrqlAlertCondition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/nrqlAlertCondition:NrqlAlertCondition';

    /**
     * Returns true if the given object is an instance of NrqlAlertCondition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NrqlAlertCondition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NrqlAlertCondition.__pulumiType;
    }

    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<number | undefined>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    public readonly baselineDirection!: pulumi.Output<string | undefined>;
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     */
    public readonly critical!: pulumi.Output<outputs.NrqlAlertConditionCritical | undefined>;
    /**
     * The description of the NRQL alert condition.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Number of expected groups when using `outlier` detection.
     */
    public readonly expectedGroups!: pulumi.Output<number | undefined>;
    /**
     * **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
     *
     * @deprecated use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
     */
    public readonly ignoreOverlap!: pulumi.Output<boolean | undefined>;
    /**
     * The title of the condition.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    public readonly nrql!: pulumi.Output<outputs.NrqlAlertConditionNrql>;
    /**
     * Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
     */
    public readonly openViolationOnGroupOverlap!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the policy where this condition should be used.
     */
    public readonly policyId!: pulumi.Output<number>;
    /**
     * Runbook URL to display in notifications.
     */
    public readonly runbookUrl!: pulumi.Output<string | undefined>;
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     *
     * @deprecated use `critical` and `warning` attributes instead
     */
    public readonly terms!: pulumi.Output<outputs.NrqlAlertConditionTerm[] | undefined>;
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * Possible values are `singleValue`, `sum` (case insensitive). Defaults to `singleValue`.
     */
    public readonly valueFunction!: pulumi.Output<string | undefined>;
    /**
     * Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
     */
    public readonly violationTimeLimit!: pulumi.Output<string | undefined>;
    /**
     * **DEPRECATED:** Use `violationTimeLimit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
     *
     * @deprecated use `violation_time_limit` attribute instead
     */
    public readonly violationTimeLimitSeconds!: pulumi.Output<number | undefined>;
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     */
    public readonly warning!: pulumi.Output<outputs.NrqlAlertConditionWarning | undefined>;

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
            const state = argsOrState as NrqlAlertConditionState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["baselineDirection"] = state ? state.baselineDirection : undefined;
            inputs["critical"] = state ? state.critical : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["expectedGroups"] = state ? state.expectedGroups : undefined;
            inputs["ignoreOverlap"] = state ? state.ignoreOverlap : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nrql"] = state ? state.nrql : undefined;
            inputs["openViolationOnGroupOverlap"] = state ? state.openViolationOnGroupOverlap : undefined;
            inputs["policyId"] = state ? state.policyId : undefined;
            inputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            inputs["terms"] = state ? state.terms : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["valueFunction"] = state ? state.valueFunction : undefined;
            inputs["violationTimeLimit"] = state ? state.violationTimeLimit : undefined;
            inputs["violationTimeLimitSeconds"] = state ? state.violationTimeLimitSeconds : undefined;
            inputs["warning"] = state ? state.warning : undefined;
        } else {
            const args = argsOrState as NrqlAlertConditionArgs | undefined;
            if (!args || args.nrql === undefined) {
                throw new Error("Missing required property 'nrql'");
            }
            if (!args || args.policyId === undefined) {
                throw new Error("Missing required property 'policyId'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["baselineDirection"] = args ? args.baselineDirection : undefined;
            inputs["critical"] = args ? args.critical : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["expectedGroups"] = args ? args.expectedGroups : undefined;
            inputs["ignoreOverlap"] = args ? args.ignoreOverlap : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nrql"] = args ? args.nrql : undefined;
            inputs["openViolationOnGroupOverlap"] = args ? args.openViolationOnGroupOverlap : undefined;
            inputs["policyId"] = args ? args.policyId : undefined;
            inputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            inputs["terms"] = args ? args.terms : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["valueFunction"] = args ? args.valueFunction : undefined;
            inputs["violationTimeLimit"] = args ? args.violationTimeLimit : undefined;
            inputs["violationTimeLimitSeconds"] = args ? args.violationTimeLimitSeconds : undefined;
            inputs["warning"] = args ? args.warning : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NrqlAlertCondition.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NrqlAlertCondition resources.
 */
export interface NrqlAlertConditionState {
    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    readonly accountId?: pulumi.Input<number>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    readonly baselineDirection?: pulumi.Input<string>;
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     */
    readonly critical?: pulumi.Input<inputs.NrqlAlertConditionCritical>;
    /**
     * The description of the NRQL alert condition.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Number of expected groups when using `outlier` detection.
     */
    readonly expectedGroups?: pulumi.Input<number>;
    /**
     * **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
     *
     * @deprecated use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
     */
    readonly ignoreOverlap?: pulumi.Input<boolean>;
    /**
     * The title of the condition.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    readonly nrql?: pulumi.Input<inputs.NrqlAlertConditionNrql>;
    /**
     * Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
     */
    readonly openViolationOnGroupOverlap?: pulumi.Input<boolean>;
    /**
     * The ID of the policy where this condition should be used.
     */
    readonly policyId?: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     *
     * @deprecated use `critical` and `warning` attributes instead
     */
    readonly terms?: pulumi.Input<pulumi.Input<inputs.NrqlAlertConditionTerm>[]>;
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * Possible values are `singleValue`, `sum` (case insensitive). Defaults to `singleValue`.
     */
    readonly valueFunction?: pulumi.Input<string>;
    /**
     * Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
     */
    readonly violationTimeLimit?: pulumi.Input<string>;
    /**
     * **DEPRECATED:** Use `violationTimeLimit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
     *
     * @deprecated use `violation_time_limit` attribute instead
     */
    readonly violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     */
    readonly warning?: pulumi.Input<inputs.NrqlAlertConditionWarning>;
}

/**
 * The set of arguments for constructing a NrqlAlertCondition resource.
 */
export interface NrqlAlertConditionArgs {
    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    readonly accountId?: pulumi.Input<number>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    readonly baselineDirection?: pulumi.Input<string>;
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     */
    readonly critical?: pulumi.Input<inputs.NrqlAlertConditionCritical>;
    /**
     * The description of the NRQL alert condition.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Number of expected groups when using `outlier` detection.
     */
    readonly expectedGroups?: pulumi.Input<number>;
    /**
     * **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
     *
     * @deprecated use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
     */
    readonly ignoreOverlap?: pulumi.Input<boolean>;
    /**
     * The title of the condition.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    readonly nrql: pulumi.Input<inputs.NrqlAlertConditionNrql>;
    /**
     * Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
     */
    readonly openViolationOnGroupOverlap?: pulumi.Input<boolean>;
    /**
     * The ID of the policy where this condition should be used.
     */
    readonly policyId: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     *
     * @deprecated use `critical` and `warning` attributes instead
     */
    readonly terms?: pulumi.Input<pulumi.Input<inputs.NrqlAlertConditionTerm>[]>;
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * Possible values are `singleValue`, `sum` (case insensitive). Defaults to `singleValue`.
     */
    readonly valueFunction?: pulumi.Input<string>;
    /**
     * Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
     */
    readonly violationTimeLimit?: pulumi.Input<string>;
    /**
     * **DEPRECATED:** Use `violationTimeLimit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
     *
     * @deprecated use `violation_time_limit` attribute instead
     */
    readonly violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     */
    readonly warning?: pulumi.Input<inputs.NrqlAlertConditionWarning>;
}
