// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create and manage synthetics alert conditions in New Relic.
 *
 * > **NOTE:** The newrelic.NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. Other condition types may be deprecated in the future and receive fewer product updates.
 *
 * ## Import
 *
 * Synthetics alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.
 *
 * ```sh
 *  $ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
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
    public static readonly __pulumiType = 'newrelic:synthetics/alertCondition:AlertCondition';

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
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the Synthetics monitor to be referenced in the alert condition.
     */
    public readonly monitorId!: pulumi.Output<string>;
    /**
     * The title of this condition.
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
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["monitorId"] = state ? state.monitorId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["runbookUrl"] = state ? state.runbookUrl : undefined;
        } else {
            const args = argsOrState as AlertConditionArgs | undefined;
            if ((!args || args.monitorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitorId'");
            }
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["monitorId"] = args ? args.monitorId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["runbookUrl"] = args ? args.runbookUrl : undefined;
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
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Synthetics monitor to be referenced in the alert condition.
     */
    monitorId?: pulumi.Input<string>;
    /**
     * The title of this condition.
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
}

/**
 * The set of arguments for constructing a AlertCondition resource.
 */
export interface AlertConditionArgs {
    /**
     * Set whether to enable the alert condition. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Synthetics monitor to be referenced in the alert condition.
     */
    monitorId: pulumi.Input<string>;
    /**
     * The title of this condition.
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
}
