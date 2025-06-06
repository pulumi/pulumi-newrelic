// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage Infrastructure alert conditions in New Relic.
 *
 * > **WARNING:** The `newrelic.InfraAlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query. For more details and examples on moving away from infra alert conditions to the NRQL based alternative, please check out these examples.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo"});
 * const highDiskUsage = new newrelic.InfraAlertCondition("high_disk_usage", {
 *     policyId: foo.id,
 *     name: "High disk usage",
 *     description: "Warning if disk usage goes above 80% and critical alert if goes above 90%",
 *     type: "infra_metric",
 *     event: "StorageSample",
 *     select: "diskUsedPercent",
 *     comparison: "above",
 *     where: "(hostname LIKE '%frontend%')",
 *     critical: {
 *         duration: 25,
 *         value: 90,
 *         timeFunction: "all",
 *     },
 *     warning: {
 *         duration: 10,
 *         value: 80,
 *         timeFunction: "all",
 *     },
 * });
 * const highDbConnCount = new newrelic.InfraAlertCondition("high_db_conn_count", {
 *     policyId: foo.id,
 *     name: "High database connection count",
 *     description: "Critical alert when the number of database connections goes above 90",
 *     type: "infra_metric",
 *     event: "DatastoreSample",
 *     select: "provider.databaseConnections.Average",
 *     comparison: "above",
 *     where: "(hostname LIKE '%db%')",
 *     integrationProvider: "RdsDbInstance",
 *     critical: {
 *         duration: 25,
 *         value: 90,
 *         timeFunction: "all",
 *     },
 * });
 * const processNotRunning = new newrelic.InfraAlertCondition("process_not_running", {
 *     policyId: foo.id,
 *     name: "Process not running (/usr/bin/ruby)",
 *     description: "Critical alert when ruby isn't running",
 *     type: "infra_process_running",
 *     comparison: "equal",
 *     where: "hostname = 'web01'",
 *     processWhere: "commandName = '/usr/bin/ruby'",
 *     critical: {
 *         duration: 5,
 *         value: 0,
 *     },
 * });
 * const hostNotReporting = new newrelic.InfraAlertCondition("host_not_reporting", {
 *     policyId: foo.id,
 *     name: "Host not reporting",
 *     description: "Critical alert when the host is not reporting",
 *     type: "infra_host_not_reporting",
 *     where: "(hostname LIKE '%frontend%')",
 *     critical: {
 *         duration: 5,
 *     },
 * });
 * ```
 *
 * ## Thresholds
 *
 * The `critical` and `warning` threshold mapping supports the following arguments:
 *
 *   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
 *   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by `infraMetric` and `infraProcessRunning` alert condition types.
 *   * `timeFunction` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the `infraMetric` alert condition type.
 *
 * ## Tags
 *
 * Manage infra alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.AlertPolicy("foo", {name: "foo policy"});
 * const fooInfraAlertCondition = new newrelic.InfraAlertCondition("foo", {
 *     policyId: foo.id,
 *     name: "foo infra condition",
 *     description: "Warning if disk usage goes above 80% and critical alert if goes above 90%",
 *     type: "infra_metric",
 *     event: "StorageSample",
 *     select: "diskUsedPercent",
 *     comparison: "above",
 *     where: "(hostname LIKE '%frontend%')",
 *     critical: {
 *         duration: 25,
 *         value: 90,
 *         timeFunction: "all",
 *     },
 *     warning: {
 *         duration: 10,
 *         value: 80,
 *         timeFunction: "all",
 *     },
 * });
 * const myConditionEntityTags = new newrelic.EntityTags("my_condition_entity_tags", {
 *     guid: fooInfraAlertCondition.entityGuid,
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
 * Infrastructure alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.
 *
 * ```sh
 * $ pulumi import newrelic:index/infraAlertCondition:InfraAlertCondition main 12345:67890
 * ```
 */
export class InfraAlertCondition extends pulumi.CustomResource {
    /**
     * Get an existing InfraAlertCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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
     * Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     */
    public readonly critical!: pulumi.Output<outputs.InfraAlertConditionCritical | undefined>;
    /**
     * The description of the Infrastructure alert condition.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    public /*out*/ readonly entityGuid!: pulumi.Output<string>;
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
    public readonly policyId!: pulumi.Output<string>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
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
     * Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
     *
     * ```
     * Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     * ```
     */
    public readonly violationCloseTimer!: pulumi.Output<number | undefined>;
    /**
     * Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InfraAlertConditionState | undefined;
            resourceInputs["comparison"] = state ? state.comparison : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["critical"] = state ? state.critical : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entityGuid"] = state ? state.entityGuid : undefined;
            resourceInputs["event"] = state ? state.event : undefined;
            resourceInputs["integrationProvider"] = state ? state.integrationProvider : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["processWhere"] = state ? state.processWhere : undefined;
            resourceInputs["runbookUrl"] = state ? state.runbookUrl : undefined;
            resourceInputs["select"] = state ? state.select : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["violationCloseTimer"] = state ? state.violationCloseTimer : undefined;
            resourceInputs["warning"] = state ? state.warning : undefined;
            resourceInputs["where"] = state ? state.where : undefined;
        } else {
            const args = argsOrState as InfraAlertConditionArgs | undefined;
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["comparison"] = args ? args.comparison : undefined;
            resourceInputs["critical"] = args ? args.critical : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["event"] = args ? args.event : undefined;
            resourceInputs["integrationProvider"] = args ? args.integrationProvider : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["processWhere"] = args ? args.processWhere : undefined;
            resourceInputs["runbookUrl"] = args ? args.runbookUrl : undefined;
            resourceInputs["select"] = args ? args.select : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["violationCloseTimer"] = args ? args.violationCloseTimer : undefined;
            resourceInputs["warning"] = args ? args.warning : undefined;
            resourceInputs["where"] = args ? args.where : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["entityGuid"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InfraAlertCondition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InfraAlertCondition resources.
 */
export interface InfraAlertConditionState {
    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
     */
    comparison?: pulumi.Input<string>;
    /**
     * The timestamp the alert condition was created.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     */
    critical?: pulumi.Input<inputs.InfraAlertConditionCritical>;
    /**
     * The description of the Infrastructure alert condition.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The unique entity identifier of the condition in New Relic.
     */
    entityGuid?: pulumi.Input<string>;
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
     */
    event?: pulumi.Input<string>;
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
     */
    integrationProvider?: pulumi.Input<string>;
    /**
     * The Infrastructure alert condition's name.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the alert policy where this condition should be used.
     */
    policyId?: pulumi.Input<string>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
     */
    processWhere?: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
     */
    select?: pulumi.Input<string>;
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
     */
    type?: pulumi.Input<string>;
    /**
     * The timestamp the alert condition was last updated.
     */
    updatedAt?: pulumi.Input<number>;
    /**
     * Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
     *
     * ```
     * Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     * ```
     */
    violationCloseTimer?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     */
    warning?: pulumi.Input<inputs.InfraAlertConditionWarning>;
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
     */
    where?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InfraAlertCondition resource.
 */
export interface InfraAlertConditionArgs {
    /**
     * The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
     */
    comparison?: pulumi.Input<string>;
    /**
     * Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
     */
    critical?: pulumi.Input<inputs.InfraAlertConditionCritical>;
    /**
     * The description of the Infrastructure alert condition.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
     */
    event?: pulumi.Input<string>;
    /**
     * For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
     */
    integrationProvider?: pulumi.Input<string>;
    /**
     * The Infrastructure alert condition's name.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the alert policy where this condition should be used.
     */
    policyId: pulumi.Input<string>;
    /**
     * Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
     */
    processWhere?: pulumi.Input<string>;
    /**
     * Runbook URL to display in notifications.
     */
    runbookUrl?: pulumi.Input<string>;
    /**
     * The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
     */
    select?: pulumi.Input<string>;
    /**
     * The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
     */
    type: pulumi.Input<string>;
    /**
     * Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
     *
     * ```
     * Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
     * ```
     */
    violationCloseTimer?: pulumi.Input<number>;
    /**
     * Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
     */
    warning?: pulumi.Input<inputs.InfraAlertConditionWarning>;
    /**
     * If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
     */
    where?: pulumi.Input<string>;
}
