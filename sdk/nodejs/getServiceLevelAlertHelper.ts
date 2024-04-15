// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alertType in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fastBurn` or `slowBurn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).
 *
 * ## Example Usage
 *
 * Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooTarget = 99.9;
 * const fooPeriod = 28;
 * const foo = new newrelic.ServiceLevel("foo", {
 *     guid: "MXxBUE18QVBQTElDQVRJT058MQ",
 *     name: "Latency",
 *     description: "Proportion of requests that are served faster than a threshold.",
 *     events: {
 *         accountId: "12345678",
 *         validEvents: {
 *             from: "Transaction",
 *             where: "appName = 'Example application' AND (transactionType='Web')",
 *         },
 *         badEvents: {
 *             from: "Transaction",
 *             where: "appName = 'Example application' AND (transactionType= 'Web') AND duration > 0.1",
 *         },
 *     },
 *     objective: {
 *         target: fooTarget,
 *         timeWindow: {
 *             rolling: {
 *                 count: fooPeriod,
 *                 unit: "DAY",
 *             },
 *         },
 *     },
 * });
 * ```
 * Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
 * Note that the Service Level was set up using bad events, that's why `isBadEvents` is set to `true`.
 * If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.
 *
 * Here is an example of a `slowBurn` alert.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooSlowBurn = newrelic.getServiceLevelAlertHelper({
 *     alertType: "slow_burn",
 *     sliGuid: foo.sliGuid,
 *     sloTarget: fooTarget,
 *     sloPeriod: fooPeriod,
 *     isBadEvents: true,
 * });
 * const yourCondition = new newrelic.NrqlAlertCondition("your_condition", {
 *     accountId: "12345678",
 *     policyId: "67890",
 *     type: "static",
 *     name: "Slow burn alert",
 *     enabled: true,
 *     violationTimeLimitSeconds: 259200,
 *     nrql: {
 *         query: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.nrql),
 *     },
 *     critical: {
 *         operator: "above_or_equals",
 *         threshold: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.threshold),
 *         thresholdDuration: 900,
 *         thresholdOccurrences: "at_least_once",
 *     },
 *     fillOption: "none",
 *     aggregationWindow: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.evaluationPeriod),
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: "120",
 *     slideBy: 900,
 * });
 * ```
 *
 * Here is an example of a custom alert:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooCustom = newrelic.getServiceLevelAlertHelper({
 *     alertType: "custom",
 *     sliGuid: foo.sliGuid,
 *     sloTarget: fooTarget,
 *     sloPeriod: fooPeriod,
 *     customToleratedBudgetConsumption: 4,
 *     customEvaluationPeriod: 5400,
 *     isBadEvents: true,
 * });
 * const yourCondition = new newrelic.NrqlAlertCondition("your_condition", {
 *     accountId: "12345678",
 *     policyId: "67890",
 *     type: "static",
 *     name: "Custom burn alert",
 *     enabled: true,
 *     violationTimeLimitSeconds: 259200,
 *     nrql: {
 *         query: fooCustom.then(fooCustom => fooCustom.nrql),
 *     },
 *     critical: {
 *         operator: "above_or_equals",
 *         threshold: fooCustom.then(fooCustom => fooCustom.threshold),
 *         thresholdDuration: 900,
 *         thresholdOccurrences: "at_least_once",
 *     },
 *     fillOption: "none",
 *     aggregationWindow: fooCustom.then(fooCustom => fooCustom.evaluationPeriod),
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: "120",
 *     slideBy: 60,
 * });
 * ```
 */
export function getServiceLevelAlertHelper(args: GetServiceLevelAlertHelperArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceLevelAlertHelperResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getServiceLevelAlertHelper:getServiceLevelAlertHelper", {
        "alertType": args.alertType,
        "customEvaluationPeriod": args.customEvaluationPeriod,
        "customToleratedBudgetConsumption": args.customToleratedBudgetConsumption,
        "isBadEvents": args.isBadEvents,
        "sliGuid": args.sliGuid,
        "sloPeriod": args.sloPeriod,
        "sloTarget": args.sloTarget,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceLevelAlertHelper.
 */
export interface GetServiceLevelAlertHelperArgs {
    alertType: string;
    customEvaluationPeriod?: number;
    customToleratedBudgetConsumption?: number;
    isBadEvents?: boolean;
    sliGuid: string;
    sloPeriod: number;
    sloTarget: number;
}

/**
 * A collection of values returned by getServiceLevelAlertHelper.
 */
export interface GetServiceLevelAlertHelperResult {
    readonly alertType: string;
    readonly customEvaluationPeriod?: number;
    readonly customToleratedBudgetConsumption?: number;
    /**
     * (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customEvaluationPeriod`.
     */
    readonly evaluationPeriod: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly isBadEvents?: boolean;
    /**
     * (Computed) The nrql query for the selected type of alert.
     */
    readonly nrql: string;
    readonly sliGuid: string;
    readonly sloPeriod: number;
    readonly sloTarget: number;
    /**
     * (Computed) The computed threshold given the provided arguments.
     */
    readonly threshold: number;
    /**
     * (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alertType it has the same value as `customToleratedBudgetConsumption`.
     */
    readonly toleratedBudgetConsumption: number;
}
/**
 * Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alertType in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fastBurn` or `slowBurn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).
 *
 * ## Example Usage
 *
 * Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooTarget = 99.9;
 * const fooPeriod = 28;
 * const foo = new newrelic.ServiceLevel("foo", {
 *     guid: "MXxBUE18QVBQTElDQVRJT058MQ",
 *     name: "Latency",
 *     description: "Proportion of requests that are served faster than a threshold.",
 *     events: {
 *         accountId: "12345678",
 *         validEvents: {
 *             from: "Transaction",
 *             where: "appName = 'Example application' AND (transactionType='Web')",
 *         },
 *         badEvents: {
 *             from: "Transaction",
 *             where: "appName = 'Example application' AND (transactionType= 'Web') AND duration > 0.1",
 *         },
 *     },
 *     objective: {
 *         target: fooTarget,
 *         timeWindow: {
 *             rolling: {
 *                 count: fooPeriod,
 *                 unit: "DAY",
 *             },
 *         },
 *     },
 * });
 * ```
 * Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
 * Note that the Service Level was set up using bad events, that's why `isBadEvents` is set to `true`.
 * If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.
 *
 * Here is an example of a `slowBurn` alert.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooSlowBurn = newrelic.getServiceLevelAlertHelper({
 *     alertType: "slow_burn",
 *     sliGuid: foo.sliGuid,
 *     sloTarget: fooTarget,
 *     sloPeriod: fooPeriod,
 *     isBadEvents: true,
 * });
 * const yourCondition = new newrelic.NrqlAlertCondition("your_condition", {
 *     accountId: "12345678",
 *     policyId: "67890",
 *     type: "static",
 *     name: "Slow burn alert",
 *     enabled: true,
 *     violationTimeLimitSeconds: 259200,
 *     nrql: {
 *         query: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.nrql),
 *     },
 *     critical: {
 *         operator: "above_or_equals",
 *         threshold: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.threshold),
 *         thresholdDuration: 900,
 *         thresholdOccurrences: "at_least_once",
 *     },
 *     fillOption: "none",
 *     aggregationWindow: fooSlowBurn.then(fooSlowBurn => fooSlowBurn.evaluationPeriod),
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: "120",
 *     slideBy: 900,
 * });
 * ```
 *
 * Here is an example of a custom alert:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const fooCustom = newrelic.getServiceLevelAlertHelper({
 *     alertType: "custom",
 *     sliGuid: foo.sliGuid,
 *     sloTarget: fooTarget,
 *     sloPeriod: fooPeriod,
 *     customToleratedBudgetConsumption: 4,
 *     customEvaluationPeriod: 5400,
 *     isBadEvents: true,
 * });
 * const yourCondition = new newrelic.NrqlAlertCondition("your_condition", {
 *     accountId: "12345678",
 *     policyId: "67890",
 *     type: "static",
 *     name: "Custom burn alert",
 *     enabled: true,
 *     violationTimeLimitSeconds: 259200,
 *     nrql: {
 *         query: fooCustom.then(fooCustom => fooCustom.nrql),
 *     },
 *     critical: {
 *         operator: "above_or_equals",
 *         threshold: fooCustom.then(fooCustom => fooCustom.threshold),
 *         thresholdDuration: 900,
 *         thresholdOccurrences: "at_least_once",
 *     },
 *     fillOption: "none",
 *     aggregationWindow: fooCustom.then(fooCustom => fooCustom.evaluationPeriod),
 *     aggregationMethod: "event_flow",
 *     aggregationDelay: "120",
 *     slideBy: 60,
 * });
 * ```
 */
export function getServiceLevelAlertHelperOutput(args: GetServiceLevelAlertHelperOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceLevelAlertHelperResult> {
    return pulumi.output(args).apply((a: any) => getServiceLevelAlertHelper(a, opts))
}

/**
 * A collection of arguments for invoking getServiceLevelAlertHelper.
 */
export interface GetServiceLevelAlertHelperOutputArgs {
    alertType: pulumi.Input<string>;
    customEvaluationPeriod?: pulumi.Input<number>;
    customToleratedBudgetConsumption?: pulumi.Input<number>;
    isBadEvents?: pulumi.Input<boolean>;
    sliGuid: pulumi.Input<string>;
    sloPeriod: pulumi.Input<number>;
    sloTarget: pulumi.Input<number>;
}
