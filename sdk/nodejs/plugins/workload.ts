// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a New Relic One workload.
 *
 * A New Relic User API key is required to provision this resource.  Set the `apiKey`
 * attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
 * variable with your User API key.
 *
 * ## Example Usage
 *
 * Include entities with a certain string on the name.
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.plugins.Workload("foo", {
 *     accountId: 12345678,
 *     entityGuids: ["MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1"],
 *     entitySearchQueries: [{
 *         query: "name like '%Example application%'",
 *     }],
 *     scopeAccountIds: [12345678],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Include entities with a set of tags.
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.plugins.Workload("foo", {
 *     accountId: 12345678,
 *     entityGuids: ["MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1"],
 *     entitySearchQueries: [{
 *         query: "tags.accountId = '12345678' AND tags.environment='production' AND tags.language='java'",
 *     }],
 *     scopeAccountIds: [12345678],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Include entities with a set of tags.
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.plugins.Workload("foo", {
 *     accountId: 12345678,
 *     entityGuids: ["MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1"],
 *     entitySearchQueries: [{
 *         query: "tags.accountId = '12345678' AND tags.environment='production' AND tags.language='java'",
 *     }],
 *     scopeAccountIds: [12345678],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Include automatic status
 *
 * > The global status of your workload is a quick indicator of the workload health. You can configure it to be calculated automatically, and you can also set an alert and get a notification whenever the workload stops being operational. Alternatively, you can communicate a certain status of the workload by setting up a static value and a description. [See our docs](https://docs.newrelic.com/docs/workloads/use-workloads/workloads/workload-status)
 *
 * ## Import
 *
 * New Relic workloads can be imported using a concatenated string of the format
 *
 *  `<account_id>:<workload_id>:<guid>`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:plugins/workload:Workload foo 12345678:1456:MjUyMDUyOHxBUE18QVBRTElDQVRJT058MjE1MDM3Nzk1
 * ```
 */
export class Workload extends pulumi.CustomResource {
    /**
     * Get an existing Workload resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkloadState, opts?: pulumi.CustomResourceOptions): Workload {
        return new Workload(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:plugins/workload:Workload';

    /**
     * Returns true if the given object is an instance of Workload.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Workload {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Workload.__pulumiType;
    }

    /**
     * The New Relic account ID where you want to create the workload.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The composite query used to compose a dynamic workload.
     */
    public /*out*/ readonly compositeEntitySearchQuery!: pulumi.Output<string>;
    /**
     * Relevant information about the workload.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A list of entity GUIDs manually assigned to this workload. At least one of either `entityGuids` or `entitySearchQuery` is required.
     */
    public readonly entityGuids!: pulumi.Output<string[]>;
    /**
     * A list of search queries that define a dynamic workload. At least one of either `entityGuids` or `entitySearchQuery` is required. See Nested entitySearchQuery blocks below for details.
     */
    public readonly entitySearchQueries!: pulumi.Output<outputs.plugins.WorkloadEntitySearchQuery[] | undefined>;
    /**
     * The unique entity identifier of the workload in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The workload's name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The URL of the workload.
     */
    public /*out*/ readonly permalink!: pulumi.Output<string>;
    /**
     * A list of account IDs that will be used to get entities from.
     */
    public readonly scopeAccountIds!: pulumi.Output<number[]>;
    /**
     * An input object used to represent an automatic status configuration.See Nested statusConfigAutomatic blocks below for details.
     */
    public readonly statusConfigAutomatic!: pulumi.Output<outputs.plugins.WorkloadStatusConfigAutomatic | undefined>;
    /**
     * A list of static status configurations. You can only configure one static status for a workload.See Nested statusConfigStatic blocks below for details.
     */
    public readonly statusConfigStatic!: pulumi.Output<outputs.plugins.WorkloadStatusConfigStatic | undefined>;
    /**
     * The unique entity identifier of the workload.
     */
    public /*out*/ readonly workloadId!: pulumi.Output<number>;

    /**
     * Create a Workload resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: WorkloadArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkloadArgs | WorkloadState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkloadState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["compositeEntitySearchQuery"] = state ? state.compositeEntitySearchQuery : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["entityGuids"] = state ? state.entityGuids : undefined;
            resourceInputs["entitySearchQueries"] = state ? state.entitySearchQueries : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["permalink"] = state ? state.permalink : undefined;
            resourceInputs["scopeAccountIds"] = state ? state.scopeAccountIds : undefined;
            resourceInputs["statusConfigAutomatic"] = state ? state.statusConfigAutomatic : undefined;
            resourceInputs["statusConfigStatic"] = state ? state.statusConfigStatic : undefined;
            resourceInputs["workloadId"] = state ? state.workloadId : undefined;
        } else {
            const args = argsOrState as WorkloadArgs | undefined;
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["entityGuids"] = args ? args.entityGuids : undefined;
            resourceInputs["entitySearchQueries"] = args ? args.entitySearchQueries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scopeAccountIds"] = args ? args.scopeAccountIds : undefined;
            resourceInputs["statusConfigAutomatic"] = args ? args.statusConfigAutomatic : undefined;
            resourceInputs["statusConfigStatic"] = args ? args.statusConfigStatic : undefined;
            resourceInputs["compositeEntitySearchQuery"] = undefined /*out*/;
            resourceInputs["guid"] = undefined /*out*/;
            resourceInputs["permalink"] = undefined /*out*/;
            resourceInputs["workloadId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Workload.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Workload resources.
 */
export interface WorkloadState {
    /**
     * The New Relic account ID where you want to create the workload.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The composite query used to compose a dynamic workload.
     */
    compositeEntitySearchQuery?: pulumi.Input<string>;
    /**
     * Relevant information about the workload.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of entity GUIDs manually assigned to this workload. At least one of either `entityGuids` or `entitySearchQuery` is required.
     */
    entityGuids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of search queries that define a dynamic workload. At least one of either `entityGuids` or `entitySearchQuery` is required. See Nested entitySearchQuery blocks below for details.
     */
    entitySearchQueries?: pulumi.Input<pulumi.Input<inputs.plugins.WorkloadEntitySearchQuery>[]>;
    /**
     * The unique entity identifier of the workload in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The workload's name.
     */
    name?: pulumi.Input<string>;
    /**
     * The URL of the workload.
     */
    permalink?: pulumi.Input<string>;
    /**
     * A list of account IDs that will be used to get entities from.
     */
    scopeAccountIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * An input object used to represent an automatic status configuration.See Nested statusConfigAutomatic blocks below for details.
     */
    statusConfigAutomatic?: pulumi.Input<inputs.plugins.WorkloadStatusConfigAutomatic>;
    /**
     * A list of static status configurations. You can only configure one static status for a workload.See Nested statusConfigStatic blocks below for details.
     */
    statusConfigStatic?: pulumi.Input<inputs.plugins.WorkloadStatusConfigStatic>;
    /**
     * The unique entity identifier of the workload.
     */
    workloadId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Workload resource.
 */
export interface WorkloadArgs {
    /**
     * The New Relic account ID where you want to create the workload.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Relevant information about the workload.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of entity GUIDs manually assigned to this workload. At least one of either `entityGuids` or `entitySearchQuery` is required.
     */
    entityGuids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of search queries that define a dynamic workload. At least one of either `entityGuids` or `entitySearchQuery` is required. See Nested entitySearchQuery blocks below for details.
     */
    entitySearchQueries?: pulumi.Input<pulumi.Input<inputs.plugins.WorkloadEntitySearchQuery>[]>;
    /**
     * The workload's name.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of account IDs that will be used to get entities from.
     */
    scopeAccountIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * An input object used to represent an automatic status configuration.See Nested statusConfigAutomatic blocks below for details.
     */
    statusConfigAutomatic?: pulumi.Input<inputs.plugins.WorkloadStatusConfigAutomatic>;
    /**
     * A list of static status configurations. You can only configure one static status for a workload.See Nested statusConfigStatic blocks below for details.
     */
    statusConfigStatic?: pulumi.Input<inputs.plugins.WorkloadStatusConfigStatic>;
}
