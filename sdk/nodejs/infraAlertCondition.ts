// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage Infrastructure alert conditions in New Relic.
 * 
 * 
 * ## Thresholds
 * 
 * The `critical` and `warning` threshold mapping supports the following arguments:
 * 
 *   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
 *   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by `infraMetric` and `infraProcessRunning` alert condition types.
 *   * `timeFunction` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the `infraMetric` alert condition type.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/infra_alert_condition.html.markdown.
 */
export class InfraAlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing InfraAlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InfraAlertConditionState, opts?: pulumi.CustomResourceOptions): InfraAlertCondition {
        return new InfraAlertCondition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/infraAlertCondition:InfraAlertCondition';

    /**
     * Returns true if the given object is an instance of InfraAlertCondition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InfraAlertCondition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InfraAlertCondition.__pulumiType;
    }

    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
     */
    public readonly comparison!: pulumi.Output<string | undefined>;
    /**
     * The timestamp the alert condition was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<number>;
    /**
     * Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
     */
    public readonly critical!: pulumi.Output<outputs.InfraAlertConditionCritical | undefined>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
     */
    public readonly event!: pulumi.Output<string>;
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
     */
    public readonly integrationProvider!: pulumi.Output<string | undefined>;
    /**
     * The Infrastructure alert condition's name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the alert policy where this condition should be used.
     */
    public readonly policyId!: pulumi.Output<number>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Supported by the `infraProcessRunning` condition type.
     */
    public readonly processWhere!: pulumi.Output<string | undefined>;
    /**
     * Runbook URL to display in notifications.
     */
    public readonly runbookUrl!: pulumi.Output<string | undefined>;
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
     */
    public readonly select!: pulumi.Output<string | undefined>;
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The timestamp the alert condition was last updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<number>;
    /**
     * Determines how much time will pass before a violation is automatically closed. Setting the time limit to 0 prevents a violation from being force-closed.
     */
    public readonly violationCloseTimer!: pulumi.Output<number | undefined>;
    /**
     * Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
     */
    public readonly warning!: pulumi.Output<outputs.InfraAlertConditionWarning | undefined>;
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
     */
    public readonly where!: pulumi.Output<string | undefined>;

    /**
     * Create a InfraAlertCondition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InfraAlertConditionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InfraAlertConditionArgs | InfraAlertConditionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InfraAlertConditionState | undefined;
            inputs["comparison"] = state ? state.comparison : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["critical"] = state ? state.critical : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["event"] = state ? state.event : undefined;
            inputs["integrationProvider"] = state ? state.integrationProvider : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["policyId"] = state ? state.policyId : undefined;
            inputs["processWhere"] = state ? state.processWhere : undefined;
            inputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            inputs["select"] = state ? state.select : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["updatedAt"] = state ? state.updatedAt : undefined;
            inputs["violationCloseTimer"] = state ? state.violationCloseTimer : undefined;
            inputs["warning"] = state ? state.warning : undefined;
            inputs["where"] = state ? state.where : undefined;
        } else {
            const args = argsOrState as InfraAlertConditionArgs | undefined;
            if (!args || args.policyId === undefined) {
                throw new Error("Missing required property 'policyId'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["comparison"] = args ? args.comparison : undefined;
            inputs["critical"] = args ? args.critical : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["event"] = args ? args.event : undefined;
            inputs["integrationProvider"] = args ? args.integrationProvider : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["policyId"] = args ? args.policyId : undefined;
            inputs["processWhere"] = args ? args.processWhere : undefined;
            inputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            inputs["select"] = args ? args.select : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["violationCloseTimer"] = args ? args.violationCloseTimer : undefined;
            inputs["warning"] = args ? args.warning : undefined;
            inputs["where"] = args ? args.where : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["updatedAt"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(InfraAlertCondition.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InfraAlertCondition resources.
 */
export interface InfraAlertConditionState {
    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
     */
    readonly comparison?: pulumi.Input<string>;
    /**
     * The timestamp the alert condition was created.
     */
    readonly createdAt?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
     */
    readonly critical?: pulumi.Input<inputs.InfraAlertConditionCritical>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
     */
    readonly event?: pulumi.Input<string>;
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
     */
    readonly integrationProvider?: pulumi.Input<string>;
    /**
     * The Infrastructure alert condition's name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the alert policy where this condition should be used.
     */
    readonly policyId?: pulumi.Input<number>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Supported by the `infraProcessRunning` condition type.
     */
    readonly processWhere?: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
     */
    readonly select?: pulumi.Input<string>;
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The timestamp the alert condition was last updated.
     */
    readonly updatedAt?: pulumi.Input<number>;
    /**
     * Determines how much time will pass before a violation is automatically closed. Setting the time limit to 0 prevents a violation from being force-closed.
     */
    readonly violationCloseTimer?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
     */
    readonly warning?: pulumi.Input<inputs.InfraAlertConditionWarning>;
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
     */
    readonly where?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InfraAlertCondition resource.
 */
export interface InfraAlertConditionArgs {
    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
     */
    readonly comparison?: pulumi.Input<string>;
    /**
     * Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
     */
    readonly critical?: pulumi.Input<inputs.InfraAlertConditionCritical>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
     */
    readonly event?: pulumi.Input<string>;
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
     */
    readonly integrationProvider?: pulumi.Input<string>;
    /**
     * The Infrastructure alert condition's name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the alert policy where this condition should be used.
     */
    readonly policyId: pulumi.Input<number>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Supported by the `infraProcessRunning` condition type.
     */
    readonly processWhere?: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    readonly runbookUrl?: pulumi.Input<string>;
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
     */
    readonly select?: pulumi.Input<string>;
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * Determines how much time will pass before a violation is automatically closed. Setting the time limit to 0 prevents a violation from being force-closed.
     */
    readonly violationCloseTimer?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
     */
    readonly warning?: pulumi.Input<inputs.InfraAlertConditionWarning>;
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
     */
    readonly where?: pulumi.Input<string>;
}
