// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.
 *
 * > **WARNING:** The `newrelic.AlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const app = newrelic.getEntity({
 *     name: "my-app",
 *     type: "APPLICATION",
 *     domain: "APM",
 * });
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo"});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     policyId: foo.id,
 *     name: "foo",
 *     type: "apm_app_metric",
 *     entities: [app.then(app => app.applicationId)],
 *     metric: "apdex",
 *     runbookUrl: "https://www.example.com",
 *     conditionScope: "application",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 * });
 * ```
 *
 * ## Terms
 *
 * The `term` mapping supports the following arguments:
 *
 *   * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
 *   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
 *   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
 *   * `threshold` - (Required) Must be 0 or greater.
 *   * `timeFunction` - (Required) `all` or `any`.
 *
 * ## Tags
 *
 * Manage alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getEntity({
 *     name: "foo entitiy",
 * });
 * const fooAlertPolicy = new newrelic.AlertPolicy("foo", {name: "foo policy"});
 * const fooAlertCondition = new newrelic.AlertCondition("foo", {
 *     policyId: fooAlertPolicy.id,
 *     name: "foo condition",
 *     type: "apm_app_metric",
 *     entities: [foo.then(foo => foo.applicationId)],
 *     metric: "apdex",
 *     runbookUrl: "https://www.example.com",
 *     conditionScope: "application",
 *     terms: [{
 *         duration: 5,
 *         operator: "below",
 *         priority: "critical",
 *         threshold: 0.75,
 *         timeFunction: "all",
 *     }],
 * });
 * const myConditionEntityTags = new newrelic.EntityTags("my_condition_entity_tags", {
 *     guid: fooAlertCondition.entityGuid,
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
 * Alert conditions can be imported using notation `alert_policy_id:alert_condition_id`, e.g.
 *
 * ```sh
 * $ pulumi import newrelic:index/alertCondition:AlertCondition main 123456:6789012345
 * ```
 */
export class AlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing AlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertConditionState, opts?: pulumi.CustomResourceOptions): AlertCondition {
        return new AlertCondition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/alertCondition:AlertCondition';

    /**
     * Returns true if the given object is an instance of AlertCondition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertCondition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertCondition.__pulumiType;
    }

    /**
     * One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
     * instance setting allows your condition to trigger for specific app instances.
     */
    public readonly conditionScope!: pulumi.Output<string | undefined>;
    /**
     * Whether the condition is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The instance IDs associated with this condition.
     */
    public readonly entities!: pulumi.Output<number[]>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    public /*out*/ readonly entityGuid!: pulumi.Output<string>;
    /**
     * A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
     * gc_cpu_time condition type.
     */
    public readonly gcMetric!: pulumi.Output<string | undefined>;
    /**
     * The metric field accepts parameters based on the type set.
     */
    public readonly metric!: pulumi.Output<string>;
    /**
     * The title of the condition. Must be between 1 and 128 characters, inclusive.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the policy where this condition should be used.
     */
    public readonly policyId!: pulumi.Output<number>;
    /**
     * Runbook URL to display in notifications.
     */
    public readonly runbookUrl!: pulumi.Output<string | undefined>;
    public readonly terms!: pulumi.Output<outputs.AlertConditionTerm[]>;
    /**
     * The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
     * servers_metric).
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * A custom metric to be evaluated.
     */
    public readonly userDefinedMetric!: pulumi.Output<string | undefined>;
    /**
     * One of: (average, min, max, total, sample_size, percent, rate).
     */
    public readonly userDefinedValueFunction!: pulumi.Output<string | undefined>;
    /**
     * Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
     * specified. Must be between 1 and 720 hours.
     */
    public readonly violationCloseTimer!: pulumi.Output<number | undefined>;

    /**
     * Create a AlertCondition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertConditionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertConditionArgs | AlertConditionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertConditionState | undefined;
            resourceInputs["conditionScope"] = state ? state.conditionScope : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entities"] = state ? state.entities : undefined;
            resourceInputs["entityGuid"] = state ? state.entityGuid : undefined;
            resourceInputs["gcMetric"] = state ? state.gcMetric : undefined;
            resourceInputs["metric"] = state ? state.metric : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            resourceInputs["terms"] = state ? state.terms : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["userDefinedMetric"] = state ? state.userDefinedMetric : undefined;
            resourceInputs["userDefinedValueFunction"] = state ? state.userDefinedValueFunction : undefined;
            resourceInputs["violationCloseTimer"] = state ? state.violationCloseTimer : undefined;
        } else {
            const args = argsOrState as AlertConditionArgs | undefined;
            if ((!args || args.entities === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entities'");
            }
            if ((!args || args.metric === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metric'");
            }
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            if ((!args || args.terms === undefined) && !opts.urn) {
                throw new Error("Missing required property 'terms'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["conditionScope"] = args ? args.conditionScope : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["entities"] = args ? args.entities : undefined;
            resourceInputs["gcMetric"] = args ? args.gcMetric : undefined;
            resourceInputs["metric"] = args ? args.metric : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            resourceInputs["terms"] = args ? args.terms : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["userDefinedMetric"] = args ? args.userDefinedMetric : undefined;
            resourceInputs["userDefinedValueFunction"] = args ? args.userDefinedValueFunction : undefined;
            resourceInputs["violationCloseTimer"] = args ? args.violationCloseTimer : undefined;
            resourceInputs["entityGuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertCondition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertCondition resources.
 */
export interface AlertConditionState {
    /**
     * One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
     * instance setting allows your condition to trigger for specific app instances.
     */
    conditionScope?: pulumi.Input<string>;
    /**
     * Whether the condition is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The instance IDs associated with this condition.
     */
    entities?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    entityGuid?: pulumi.Input<string>;
    /**
     * A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
     * gc_cpu_time condition type.
     */
    gcMetric?: pulumi.Input<string>;
    /**
     * The metric field accepts parameters based on the type set.
     */
    metric?: pulumi.Input<string>;
    /**
     * The title of the condition. Must be between 1 and 128 characters, inclusive.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the policy where this condition should be used.
     */
    policyId?: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    terms?: pulumi.Input<pulumi.Input<inputs.AlertConditionTerm>[]>;
    /**
     * The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
     * servers_metric).
     */
    type?: pulumi.Input<string>;
    /**
     * A custom metric to be evaluated.
     */
    userDefinedMetric?: pulumi.Input<string>;
    /**
     * One of: (average, min, max, total, sample_size, percent, rate).
     */
    userDefinedValueFunction?: pulumi.Input<string>;
    /**
     * Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
     * specified. Must be between 1 and 720 hours.
     */
    violationCloseTimer?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AlertCondition resource.
 */
export interface AlertConditionArgs {
    /**
     * One of (application, instance). Choose application for most scenarios. If you are using the JVM plugin in New Relic, the
     * instance setting allows your condition to trigger for specific app instances.
     */
    conditionScope?: pulumi.Input<string>;
    /**
     * Whether the condition is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The instance IDs associated with this condition.
     */
    entities: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * A valid Garbage Collection metric e.g. GC/G1 Young Generation. This is required if you are using apm_jvm_metric with
     * gc_cpu_time condition type.
     */
    gcMetric?: pulumi.Input<string>;
    /**
     * The metric field accepts parameters based on the type set.
     */
    metric: pulumi.Input<string>;
    /**
     * The title of the condition. Must be between 1 and 128 characters, inclusive.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the policy where this condition should be used.
     */
    policyId: pulumi.Input<number>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    terms: pulumi.Input<pulumi.Input<inputs.AlertConditionTerm>[]>;
    /**
     * The type of condition. One of: (apm_app_metric, apm_jvm_metric, apm_kt_metric, browser_metric, mobile_metric,
     * servers_metric).
     */
    type: pulumi.Input<string>;
    /**
     * A custom metric to be evaluated.
     */
    userDefinedMetric?: pulumi.Input<string>;
    /**
     * One of: (average, min, max, total, sample_size, percent, rate).
     */
    userDefinedValueFunction?: pulumi.Input<string>;
    /**
     * Automatically close instance-based incidents, including JVM health metric incidents, after the number of hours
     * specified. Must be between 1 and 720 hours.
     */
    violationCloseTimer?: pulumi.Input<number>;
}
