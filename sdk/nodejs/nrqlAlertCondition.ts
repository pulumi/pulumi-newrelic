// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage NRQL alert conditions in New Relic.
 *
 * ## Example Usage
 * ## NRQL
 *
 * The `nrql` block supports the following arguments:
 *
 * - `query` - (Required) The NRQL query to execute for the condition.
 * - `evaluationOffset` - (Optional) **DEPRECATED:** Use `aggregationMethod` instead. Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated based on their `aggregationWindow` size. The start time depends on this value. It's recommended to set this to 3 windows. An offset of less than 3 windows will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluationOffset` set to 3 windows and an `aggregationWindow` of 60 seconds, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`. `evaluationOffset` cannot be set with `aggregationMethod`, `aggregationDelay`, or `aggregationTimer`.<br>
 * - `sinceValue` - (Optional)  **DEPRECATED:** Use `aggregationMethod` instead. The value to be used in the `SINCE <X> minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). <br>
 *
 * ## Terms
 *
 * > **NOTE:** The direct use of the `term` has been deprecated, and users should use `critical` and `warning` instead.  What follows now applies to the named priority attributes for `critical` and `warning`, but for those attributes the priority is not allowed.
 *
 * NRQL alert conditions support up to two terms. At least one `term` must have `priority` set to `critical` and the second optional `term` must have `priority` set to `warning`.
 *
 * The `term` block supports the following arguments:
 *
 * - `operator` - (Optional) Valid values are `above`, `below`, or `equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `outlier` or `baseline`, the only valid option here is `above`.
 * - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
 * - `threshold` - (Required) The value which will trigger a violation. Must be `0` or greater.
 * <br>For _baseline_ NRQL alert conditions, the value must be in the range [1, 1000]. The value is the number of standard deviations from the baseline that the metric must exceed in order to create a violation.
 * - `thresholdDuration` - (Optional) The duration, in seconds, that the threshold must violate in order to create a violation. Value must be a multiple of the `aggregationWindow` (which has a default of 60 seconds).
 * <br>For _baseline_ and _outlier_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
 * <br>For _static_ NRQL alert conditions with the `sum` value function, the value must be within 120-7200 seconds (inclusive).
 * <br>For _static_ NRQL alert conditions with the `singleValue` value function, the value must be within 60-7200 seconds (inclusive).
 *
 * - `thresholdOccurrences` - (Optional) The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `atLeastOnce` (case insensitive).
 * - `duration` - (Optional) **DEPRECATED:** Use `thresholdDuration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
 * - `timeFunction` - (Optional) **DEPRECATED:** Use `thresholdOccurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
 *
 * ## Additional Examples
 *
 * ##### Type: `baseline`
 *
 * [Baseline NRQL alert conditions](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/create-baseline-alert-conditions) are dynamic in nature and adjust to the behavior of your data. The example below demonstrates a baseline NRQL alert condition for alerting when transaction durations are above a specified threshold and dynamically adjusts based on data trends.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooIndex_alertPolicyAlertPolicy = new newrelic.AlertPolicy("fooIndex/alertPolicyAlertPolicy", {});
 * const fooNrqlAlertCondition = new newrelic.NrqlAlertCondition("fooNrqlAlertCondition", {
 *     accountId: "your_account_id",
 *     policyId: fooAlertPolicy.id,
 *     type: "static",
 *     description: "Alert when transactions are taking too long",
 *     runbookUrl: "https://www.example.com",
 *     enabled: true,
 *     violationTimeLimitSeconds: 3600,
 *     fillOption: "static",
 *     fillValue: 1,
 *     aggregationWindow: 60,
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: 120,
 *     expirationDuration: 120,
 *     openViolationOnExpiration: true,
 *     closeViolationsOnExpiration: true,
 *     slideBy: 30,
 *     nrql: {
 *         query: "SELECT average(duration) FROM Transaction where appName = 'Your App'",
 *     },
 *     critical: {
 *         operator: "above",
 *         threshold: 5.5,
 *         thresholdDuration: 300,
 *         thresholdOccurrences: "ALL",
 *     },
 *     warning: {
 *         operator: "above",
 *         threshold: 3.5,
 *         thresholdDuration: 600,
 *         thresholdOccurrences: "ALL",
 *     },
 * });
 * ```
 *
 * ### Type: `outlier`
 *
 * In software development and operations, it is common to have a group consisting of members you expect to behave approximately the same. [Outlier detection](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/outlier-detection-nrql-alert) facilitates alerting when the behavior of one or more common members falls outside a specified range expectation.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooAlertPolicy = new newrelic.AlertPolicy("fooAlertPolicy", {});
 * const fooNrqlAlertCondition = new newrelic.NrqlAlertCondition("fooNrqlAlertCondition", {
 *     type: "outlier",
 *     accountId: "your_account_id",
 *     policyId: fooAlertPolicy.id,
 *     description: "Alert when outlier conditions occur",
 *     enabled: true,
 *     runbookUrl: "https://www.example.com",
 *     violationTimeLimitSeconds: 3600,
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: 120,
 *     expectedGroups: 2,
 *     openViolationOnGroupOverlap: true,
 *     nrql: {
 *         query: "SELECT percentile(duration, 95) FROM Transaction WHERE appName = 'ExampleAppName' FACET host",
 *     },
 *     critical: {
 *         operator: "above",
 *         threshold: 0.002,
 *         thresholdDuration: 600,
 *         thresholdOccurrences: "all",
 *     },
 *     warning: {
 *         operator: "above",
 *         threshold: 0.0015,
 *         thresholdDuration: 600,
 *         thresholdOccurrences: "all",
 *     },
 * });
 * ```
 *
 * ## Upgrade from 1.x to 2.x
 *
 * There have been several deprecations in the `newrelic.NrqlAlertCondition`
 * resource.  Users will need to make some updates in order to have a smooth
 * upgrade.
 *
 * An example resource from 1.x might look like the following.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const nrqlAlertCondition = new newrelic.NrqlAlertCondition("nrqlAlertCondition", {
 *     policyId: newrelic_alert_policy.z.id,
 *     type: "static",
 *     runbookUrl: "https://localhost",
 *     enabled: true,
 *     valueFunction: "sum",
 *     violationTimeLimit: "TWENTY_FOUR_HOURS",
 *     critical: {
 *         operator: "above",
 *         thresholdDuration: 120,
 *         threshold: 3,
 *         thresholdOccurrences: "AT_LEAST_ONCE",
 *     },
 *     nrql: {
 *         query: `SELECT count(*) FROM TransactionError WHERE appName like '%Dummy App%' FACET appName`,
 *     },
 * });
 * ```
 *
 * After making the appropriate adjustments mentioned in the deprecation warnings,
 * the resource now looks like the following.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const nrqlAlertCondition = new newrelic.NrqlAlertCondition("nrqlAlertCondition", {
 *     policyId: newrelic_alert_policy.z.id,
 *     type: "static",
 *     runbookUrl: "https://localhost",
 *     enabled: true,
 *     valueFunction: "sum",
 *     violationTimeLimitSeconds: 86400,
 *     terms: [{
 *         priority: "critical",
 *         operator: "above",
 *         threshold: 3,
 *         duration: 5,
 *         timeFunction: "any",
 *     }],
 *     nrql: {
 *         query: `SELECT count(*) FROM TransactionError WHERE appName like '%Dummy App%' FACET appName`,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>:<conditionType>`, e.g. // For `baseline` conditions
 *
 * ```sh
 *  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:baseline
 * ```
 *
 *  // For `static` conditions
 *
 * ```sh
 *  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:static
 * ```
 *
 *  // For `outlier` conditions
 *
 * ```sh
 *  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:outlier
 * ```
 *
 *  Users can find the actual values for `policy_id` and `condition_id` from the New Relic One UI under respective policy and condition. <small>alerts.newrelic.com/accounts/**\<account_id\>**&#47;policies/**\<policy_id\>**&#47;conditions/**\<condition_id\>**&#47;edit</small>
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
    public readonly accountId!: pulumi.Output<number>;
    /**
     * How long we wait for data that belongs in each aggregation window. Depending on your data, a longer delay may increase accuracy but delay notifications. Use `aggregationDelay` with the `eventFlow` and `cadence` methods. The maximum delay is 1200 seconds (20 minutes) when using `eventFlow` and 3600 seconds (60 minutes) when using `cadence`. In both cases, the minimum delay is 0 seconds and the default is 120 seconds. `aggregationDelay` cannot be set with `nrql.evaluation_offset`.
     */
    public readonly aggregationDelay!: pulumi.Output<string | undefined>;
    /**
     * Determines when we consider an aggregation window to be complete so that we can evaluate the signal for violations. Possible values are `cadence`, `eventFlow` or `eventTimer`. Default is `eventFlow`. `aggregationMethod` cannot be set with `nrql.evaluation_offset`.
     */
    public readonly aggregationMethod!: pulumi.Output<string | undefined>;
    /**
     * How long we wait after each data point arrives to make sure we've processed the whole batch. Use `aggregationTimer` with the `eventTimer` method. The timer value can range from 0 seconds to 1200 seconds (20 minutes); the default is 60 seconds. `aggregationTimer` cannot be set with `nrql.evaluation_offset`.
     */
    public readonly aggregationTimer!: pulumi.Output<string | undefined>;
    /**
     * The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
     */
    public readonly aggregationWindow!: pulumi.Output<number>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    public readonly baselineDirection!: pulumi.Output<string | undefined>;
    /**
     * Whether to close all open violations when the signal expires.
     */
    public readonly closeViolationsOnExpiration!: pulumi.Output<boolean | undefined>;
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
     * The amount of time (in seconds) to wait before considering the signal expired.
     */
    public readonly expirationDuration!: pulumi.Output<number | undefined>;
    /**
     * Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
     */
    public readonly fillOption!: pulumi.Output<string | undefined>;
    /**
     * This value will be used for filling gaps in the signal.
     */
    public readonly fillValue!: pulumi.Output<number | undefined>;
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
     * Whether to create a new violation to capture that the signal expired.
     */
    public readonly openViolationOnExpiration!: pulumi.Output<boolean | undefined>;
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
     * Gathers data in overlapping time windows to smooth the chart line, making it easier to spot trends. The `slideBy` value is specified in seconds and must be smaller than and a factor of the `aggregationWindow`. `slideBy` cannot be used with `outlier` NRQL conditions or `static` NRQL conditions using the `sum` `valueFunction`.
     */
    public readonly slideBy!: pulumi.Output<number | undefined>;
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
     * Possible values are `singleValue`, `sum` (case insensitive).
     *
     * @deprecated 'value_function' is deprecated.  Remove this field and condition will evaluate as 'single_value' by default.  To replicate 'sum' behavior, use 'slide_by'.
     */
    public readonly valueFunction!: pulumi.Output<string | undefined>;
    /**
     * **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
     *
     * @deprecated use `violation_time_limit_seconds` attribute instead
     */
    public readonly violationTimeLimit!: pulumi.Output<string>;
    /**
     * Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NrqlAlertConditionState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["aggregationDelay"] = state ? state.aggregationDelay : undefined;
            resourceInputs["aggregationMethod"] = state ? state.aggregationMethod : undefined;
            resourceInputs["aggregationTimer"] = state ? state.aggregationTimer : undefined;
            resourceInputs["aggregationWindow"] = state ? state.aggregationWindow : undefined;
            resourceInputs["baselineDirection"] = state ? state.baselineDirection : undefined;
            resourceInputs["closeViolationsOnExpiration"] = state ? state.closeViolationsOnExpiration : undefined;
            resourceInputs["critical"] = state ? state.critical : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["expectedGroups"] = state ? state.expectedGroups : undefined;
            resourceInputs["expirationDuration"] = state ? state.expirationDuration : undefined;
            resourceInputs["fillOption"] = state ? state.fillOption : undefined;
            resourceInputs["fillValue"] = state ? state.fillValue : undefined;
            resourceInputs["ignoreOverlap"] = state ? state.ignoreOverlap : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nrql"] = state ? state.nrql : undefined;
            resourceInputs["openViolationOnExpiration"] = state ? state.openViolationOnExpiration : undefined;
            resourceInputs["openViolationOnGroupOverlap"] = state ? state.openViolationOnGroupOverlap : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            resourceInputs["slideBy"] = state ? state.slideBy : undefined;
            resourceInputs["terms"] = state ? state.terms : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["valueFunction"] = state ? state.valueFunction : undefined;
            resourceInputs["violationTimeLimit"] = state ? state.violationTimeLimit : undefined;
            resourceInputs["violationTimeLimitSeconds"] = state ? state.violationTimeLimitSeconds : undefined;
            resourceInputs["warning"] = state ? state.warning : undefined;
        } else {
            const args = argsOrState as NrqlAlertConditionArgs | undefined;
            if ((!args || args.nrql === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nrql'");
            }
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["aggregationDelay"] = args ? args.aggregationDelay : undefined;
            resourceInputs["aggregationMethod"] = args ? args.aggregationMethod : undefined;
            resourceInputs["aggregationTimer"] = args ? args.aggregationTimer : undefined;
            resourceInputs["aggregationWindow"] = args ? args.aggregationWindow : undefined;
            resourceInputs["baselineDirection"] = args ? args.baselineDirection : undefined;
            resourceInputs["closeViolationsOnExpiration"] = args ? args.closeViolationsOnExpiration : undefined;
            resourceInputs["critical"] = args ? args.critical : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["expectedGroups"] = args ? args.expectedGroups : undefined;
            resourceInputs["expirationDuration"] = args ? args.expirationDuration : undefined;
            resourceInputs["fillOption"] = args ? args.fillOption : undefined;
            resourceInputs["fillValue"] = args ? args.fillValue : undefined;
            resourceInputs["ignoreOverlap"] = args ? args.ignoreOverlap : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nrql"] = args ? args.nrql : undefined;
            resourceInputs["openViolationOnExpiration"] = args ? args.openViolationOnExpiration : undefined;
            resourceInputs["openViolationOnGroupOverlap"] = args ? args.openViolationOnGroupOverlap : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            resourceInputs["slideBy"] = args ? args.slideBy : undefined;
            resourceInputs["terms"] = args ? args.terms : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["valueFunction"] = args ? args.valueFunction : undefined;
            resourceInputs["violationTimeLimit"] = args ? args.violationTimeLimit : undefined;
            resourceInputs["violationTimeLimitSeconds"] = args ? args.violationTimeLimitSeconds : undefined;
            resourceInputs["warning"] = args ? args.warning : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NrqlAlertCondition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NrqlAlertCondition resources.
 */
export interface NrqlAlertConditionState {
    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * How long we wait for data that belongs in each aggregation window. Depending on your data, a longer delay may increase accuracy but delay notifications. Use `aggregationDelay` with the `eventFlow` and `cadence` methods. The maximum delay is 1200 seconds (20 minutes) when using `eventFlow` and 3600 seconds (60 minutes) when using `cadence`. In both cases, the minimum delay is 0 seconds and the default is 120 seconds. `aggregationDelay` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationDelay?: pulumi.Input<string>;
    /**
     * Determines when we consider an aggregation window to be complete so that we can evaluate the signal for violations. Possible values are `cadence`, `eventFlow` or `eventTimer`. Default is `eventFlow`. `aggregationMethod` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationMethod?: pulumi.Input<string>;
    /**
     * How long we wait after each data point arrives to make sure we've processed the whole batch. Use `aggregationTimer` with the `eventTimer` method. The timer value can range from 0 seconds to 1200 seconds (20 minutes); the default is 60 seconds. `aggregationTimer` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationTimer?: pulumi.Input<string>;
    /**
     * The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
     */
    aggregationWindow?: pulumi.Input<number>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    baselineDirection?: pulumi.Input<string>;
    /**
     * Whether to close all open violations when the signal expires.
     */
    closeViolationsOnExpiration?: pulumi.Input<boolean>;
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     */
    critical?: pulumi.Input<inputs.NrqlAlertConditionCritical>;
    /**
     * The description of the NRQL alert condition.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Number of expected groups when using `outlier` detection.
     */
    expectedGroups?: pulumi.Input<number>;
    /**
     * The amount of time (in seconds) to wait before considering the signal expired.
     */
    expirationDuration?: pulumi.Input<number>;
    /**
     * Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
     */
    fillOption?: pulumi.Input<string>;
    /**
     * This value will be used for filling gaps in the signal.
     */
    fillValue?: pulumi.Input<number>;
    /**
     * **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
     *
     * @deprecated use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
     */
    ignoreOverlap?: pulumi.Input<boolean>;
    /**
     * The title of the condition.
     */
    name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    nrql?: pulumi.Input<inputs.NrqlAlertConditionNrql>;
    /**
     * Whether to create a new violation to capture that the signal expired.
     */
    openViolationOnExpiration?: pulumi.Input<boolean>;
    /**
     * Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
     */
    openViolationOnGroupOverlap?: pulumi.Input<boolean>;
    /**
     * The ID of the policy where this condition should be used.
     */
    policyId?: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * Gathers data in overlapping time windows to smooth the chart line, making it easier to spot trends. The `slideBy` value is specified in seconds and must be smaller than and a factor of the `aggregationWindow`. `slideBy` cannot be used with `outlier` NRQL conditions or `static` NRQL conditions using the `sum` `valueFunction`.
     */
    slideBy?: pulumi.Input<number>;
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     *
     * @deprecated use `critical` and `warning` attributes instead
     */
    terms?: pulumi.Input<pulumi.Input<inputs.NrqlAlertConditionTerm>[]>;
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     */
    type?: pulumi.Input<string>;
    /**
     * Possible values are `singleValue`, `sum` (case insensitive).
     *
     * @deprecated 'value_function' is deprecated.  Remove this field and condition will evaluate as 'single_value' by default.  To replicate 'sum' behavior, use 'slide_by'.
     */
    valueFunction?: pulumi.Input<string>;
    /**
     * **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
     *
     * @deprecated use `violation_time_limit_seconds` attribute instead
     */
    violationTimeLimit?: pulumi.Input<string>;
    /**
     * Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
     */
    violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     */
    warning?: pulumi.Input<inputs.NrqlAlertConditionWarning>;
}

/**
 * The set of arguments for constructing a NrqlAlertCondition resource.
 */
export interface NrqlAlertConditionArgs {
    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * How long we wait for data that belongs in each aggregation window. Depending on your data, a longer delay may increase accuracy but delay notifications. Use `aggregationDelay` with the `eventFlow` and `cadence` methods. The maximum delay is 1200 seconds (20 minutes) when using `eventFlow` and 3600 seconds (60 minutes) when using `cadence`. In both cases, the minimum delay is 0 seconds and the default is 120 seconds. `aggregationDelay` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationDelay?: pulumi.Input<string>;
    /**
     * Determines when we consider an aggregation window to be complete so that we can evaluate the signal for violations. Possible values are `cadence`, `eventFlow` or `eventTimer`. Default is `eventFlow`. `aggregationMethod` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationMethod?: pulumi.Input<string>;
    /**
     * How long we wait after each data point arrives to make sure we've processed the whole batch. Use `aggregationTimer` with the `eventTimer` method. The timer value can range from 0 seconds to 1200 seconds (20 minutes); the default is 60 seconds. `aggregationTimer` cannot be set with `nrql.evaluation_offset`.
     */
    aggregationTimer?: pulumi.Input<string>;
    /**
     * The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
     */
    aggregationWindow?: pulumi.Input<number>;
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lowerOnly`, `upperAndLower`, `upperOnly` (case insensitive).
     */
    baselineDirection?: pulumi.Input<string>;
    /**
     * Whether to close all open violations when the signal expires.
     */
    closeViolationsOnExpiration?: pulumi.Input<boolean>;
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     */
    critical?: pulumi.Input<inputs.NrqlAlertConditionCritical>;
    /**
     * The description of the NRQL alert condition.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Number of expected groups when using `outlier` detection.
     */
    expectedGroups?: pulumi.Input<number>;
    /**
     * The amount of time (in seconds) to wait before considering the signal expired.
     */
    expirationDuration?: pulumi.Input<number>;
    /**
     * Which strategy to use when filling gaps in the signal. Possible values are `none`, `lastValue` or `static`. If `static`, the `fillValue` field will be used for filling gaps in the signal.
     */
    fillOption?: pulumi.Input<string>;
    /**
     * This value will be used for filling gaps in the signal.
     */
    fillValue?: pulumi.Input<number>;
    /**
     * **DEPRECATED:** Use `openViolationOnGroupOverlap` instead, but use the inverse value of your boolean - e.g. if `ignoreOverlap = false`, use `openViolationOnGroupOverlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
     *
     * @deprecated use `open_violation_on_group_overlap` attribute instead, but use the inverse of your boolean - e.g. if ignore_overlap = false, use open_violation_on_group_overlap = true
     */
    ignoreOverlap?: pulumi.Input<boolean>;
    /**
     * The title of the condition.
     */
    name?: pulumi.Input<string>;
    /**
     * A NRQL query. See NRQL below for details.
     */
    nrql: pulumi.Input<inputs.NrqlAlertConditionNrql>;
    /**
     * Whether to create a new violation to capture that the signal expired.
     */
    openViolationOnExpiration?: pulumi.Input<boolean>;
    /**
     * Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
     */
    openViolationOnGroupOverlap?: pulumi.Input<boolean>;
    /**
     * The ID of the policy where this condition should be used.
     */
    policyId: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * Gathers data in overlapping time windows to smooth the chart line, making it easier to spot trends. The `slideBy` value is specified in seconds and must be smaller than and a factor of the `aggregationWindow`. `slideBy` cannot be used with `outlier` NRQL conditions or `static` NRQL conditions using the `sum` `valueFunction`.
     */
    slideBy?: pulumi.Input<number>;
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     *
     * @deprecated use `critical` and `warning` attributes instead
     */
    terms?: pulumi.Input<pulumi.Input<inputs.NrqlAlertConditionTerm>[]>;
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     */
    type?: pulumi.Input<string>;
    /**
     * Possible values are `singleValue`, `sum` (case insensitive).
     *
     * @deprecated 'value_function' is deprecated.  Remove this field and condition will evaluate as 'single_value' by default.  To replicate 'sum' behavior, use 'slide_by'.
     */
    valueFunction?: pulumi.Input<string>;
    /**
     * **DEPRECATED:** Use `violationTimeLimitSeconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).<br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
     *
     * @deprecated use `violation_time_limit_seconds` attribute instead
     */
    violationTimeLimit?: pulumi.Input<string>;
    /**
     * Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). <br>
     * <small>\***Note**: One of `violationTimeLimit` _or_ `violationTimeLimitSeconds` must be set, but not both.</small>
     */
    violationTimeLimitSeconds?: pulumi.Input<number>;
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     */
    warning?: pulumi.Input<inputs.NrqlAlertConditionWarning>;
}
