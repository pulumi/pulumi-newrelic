// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to integrate GCP services with New Relic.
 *
 * ## Prerequisite
 *
 * Setup is required for this resource to work properly. This resource assumes you have linked a GCP account to New Relic and configured it to pull metrics from GCP.
 *
 * New Relic doesn't automatically receive metrics from GCP services, so this resource can be used to configure integrations to those services.
 *
 * ## Example Usage
 *
 * Leave an integration block empty to use its default configuration. You can also use the full example, including the GCP set up, found in our guides.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.cloud.GcpLinkAccount("foo", {projectId: "<Your GCP project ID>"});
 * const foo1 = new newrelic.cloud.GcpIntegrations("foo1", {
 *     linkedAccountId: foo.id,
 *     appEngine: {
 *         metricsPollingInterval: 400,
 *     },
 *     bigQuery: {
 *         metricsPollingInterval: 400,
 *         fetchTags: true,
 *     },
 *     bigTable: {
 *         metricsPollingInterval: 400,
 *     },
 *     composer: {
 *         metricsPollingInterval: 400,
 *     },
 *     dataFlow: {
 *         metricsPollingInterval: 400,
 *     },
 *     dataProc: {
 *         metricsPollingInterval: 400,
 *     },
 *     dataStore: {
 *         metricsPollingInterval: 400,
 *     },
 *     fireBaseDatabase: {
 *         metricsPollingInterval: 400,
 *     },
 *     fireBaseHosting: {
 *         metricsPollingInterval: 400,
 *     },
 *     fireBaseStorage: {
 *         metricsPollingInterval: 400,
 *     },
 *     fireStore: {
 *         metricsPollingInterval: 400,
 *     },
 *     functions: {
 *         metricsPollingInterval: 400,
 *     },
 *     interconnect: {
 *         metricsPollingInterval: 400,
 *     },
 *     kubernetes: {
 *         metricsPollingInterval: 400,
 *     },
 *     loadBalancing: {
 *         metricsPollingInterval: 400,
 *     },
 *     memCache: {
 *         metricsPollingInterval: 400,
 *     },
 *     pubSub: {
 *         metricsPollingInterval: 400,
 *         fetchTags: true,
 *     },
 *     redis: {
 *         metricsPollingInterval: 400,
 *     },
 *     router: {
 *         metricsPollingInterval: 400,
 *     },
 *     run: {
 *         metricsPollingInterval: 400,
 *     },
 *     spanner: {
 *         metricsPollingInterval: 400,
 *         fetchTags: true,
 *     },
 *     sql: {
 *         metricsPollingInterval: 400,
 *     },
 *     storage: {
 *         metricsPollingInterval: 400,
 *         fetchTags: true,
 *     },
 *     virtualMachines: {
 *         metricsPollingInterval: 400,
 *     },
 *     vpcAccess: {
 *         metricsPollingInterval: 400,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Linked GCP account integrations can be imported using the `id`, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:cloud/gcpIntegrations:GcpIntegrations foo <id>
 * ```
 */
export class GcpIntegrations extends pulumi.CustomResource {
    /**
     * Get an existing GcpIntegrations resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GcpIntegrationsState, opts?: pulumi.CustomResourceOptions): GcpIntegrations {
        return new GcpIntegrations(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/gcpIntegrations:GcpIntegrations';

    /**
     * Returns true if the given object is an instance of GcpIntegrations.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GcpIntegrations {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GcpIntegrations.__pulumiType;
    }

    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Alloy DB integration. See Integration blocks below for details.
     */
    public readonly alloyDb!: pulumi.Output<outputs.cloud.GcpIntegrationsAlloyDb | undefined>;
    /**
     * App Engine integration. See Integration blocks below for details.
     */
    public readonly appEngine!: pulumi.Output<outputs.cloud.GcpIntegrationsAppEngine | undefined>;
    /**
     * Biq Query integration. See Integration blocks below for details.
     */
    public readonly bigQuery!: pulumi.Output<outputs.cloud.GcpIntegrationsBigQuery | undefined>;
    /**
     * Big Table. See Integration blocks below for details.
     */
    public readonly bigTable!: pulumi.Output<outputs.cloud.GcpIntegrationsBigTable | undefined>;
    /**
     * Composer integration. See Integration blocks below for details.
     */
    public readonly composer!: pulumi.Output<outputs.cloud.GcpIntegrationsComposer | undefined>;
    /**
     * Data Flow integration. See Integration blocks below for details.
     */
    public readonly dataFlow!: pulumi.Output<outputs.cloud.GcpIntegrationsDataFlow | undefined>;
    /**
     * Data Proc integration. See Integration blocks below for details.
     */
    public readonly dataProc!: pulumi.Output<outputs.cloud.GcpIntegrationsDataProc | undefined>;
    /**
     * Data Store integration. See Integration blocks below for details.
     */
    public readonly dataStore!: pulumi.Output<outputs.cloud.GcpIntegrationsDataStore | undefined>;
    /**
     * Fire Base Database integration. See Integration blocks below for details.
     */
    public readonly fireBaseDatabase!: pulumi.Output<outputs.cloud.GcpIntegrationsFireBaseDatabase | undefined>;
    /**
     * Fire Base Hosting integration. See Integration blocks below for details.
     */
    public readonly fireBaseHosting!: pulumi.Output<outputs.cloud.GcpIntegrationsFireBaseHosting | undefined>;
    /**
     * Fire Base Storage integration. See Integration blocks below for details.
     */
    public readonly fireBaseStorage!: pulumi.Output<outputs.cloud.GcpIntegrationsFireBaseStorage | undefined>;
    /**
     * Fire Store integration. See Integration blocks below for details.
     */
    public readonly fireStore!: pulumi.Output<outputs.cloud.GcpIntegrationsFireStore | undefined>;
    /**
     * Functions integration. See Integration blocks below for details.
     */
    public readonly functions!: pulumi.Output<outputs.cloud.GcpIntegrationsFunctions | undefined>;
    /**
     * Interconnect integration. See Integration blocks below for details.
     */
    public readonly interconnect!: pulumi.Output<outputs.cloud.GcpIntegrationsInterconnect | undefined>;
    /**
     * Kubernetes integration. See Integration blocks below for details.
     */
    public readonly kubernetes!: pulumi.Output<outputs.cloud.GcpIntegrationsKubernetes | undefined>;
    /**
     * The ID of the linked GCP account in New Relic.
     */
    public readonly linkedAccountId!: pulumi.Output<number>;
    /**
     * Load Balancing integration. See Integration blocks below for details.
     */
    public readonly loadBalancing!: pulumi.Output<outputs.cloud.GcpIntegrationsLoadBalancing | undefined>;
    /**
     * Mem cache integration. See Integration blocks below for details.
     */
    public readonly memCache!: pulumi.Output<outputs.cloud.GcpIntegrationsMemCache | undefined>;
    /**
     * Pub/Sub integration. See Integration blocks below for details.
     */
    public readonly pubSub!: pulumi.Output<outputs.cloud.GcpIntegrationsPubSub | undefined>;
    /**
     * Redis integration. See Integration blocks below for details.
     */
    public readonly redis!: pulumi.Output<outputs.cloud.GcpIntegrationsRedis | undefined>;
    /**
     * Router integration. See Integration blocks below for details.
     */
    public readonly router!: pulumi.Output<outputs.cloud.GcpIntegrationsRouter | undefined>;
    /**
     * Run integration. See Integration blocks below for details.
     */
    public readonly run!: pulumi.Output<outputs.cloud.GcpIntegrationsRun | undefined>;
    /**
     * Spanner integration. See Integration blocks below for details.
     */
    public readonly spanner!: pulumi.Output<outputs.cloud.GcpIntegrationsSpanner | undefined>;
    /**
     * SQL integration. See Integration blocks below for details.
     */
    public readonly sql!: pulumi.Output<outputs.cloud.GcpIntegrationsSql | undefined>;
    /**
     * Storage integration. See Integration blocks below for details.
     */
    public readonly storage!: pulumi.Output<outputs.cloud.GcpIntegrationsStorage | undefined>;
    /**
     * Virtual machines integration. See Integration blocks below for details.
     */
    public readonly virtualMachines!: pulumi.Output<outputs.cloud.GcpIntegrationsVirtualMachines | undefined>;
    /**
     * VPC Access integration. See Integration blocks below for details.
     */
    public readonly vpcAccess!: pulumi.Output<outputs.cloud.GcpIntegrationsVpcAccess | undefined>;

    /**
     * Create a GcpIntegrations resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GcpIntegrationsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GcpIntegrationsArgs | GcpIntegrationsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GcpIntegrationsState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["alloyDb"] = state ? state.alloyDb : undefined;
            resourceInputs["appEngine"] = state ? state.appEngine : undefined;
            resourceInputs["bigQuery"] = state ? state.bigQuery : undefined;
            resourceInputs["bigTable"] = state ? state.bigTable : undefined;
            resourceInputs["composer"] = state ? state.composer : undefined;
            resourceInputs["dataFlow"] = state ? state.dataFlow : undefined;
            resourceInputs["dataProc"] = state ? state.dataProc : undefined;
            resourceInputs["dataStore"] = state ? state.dataStore : undefined;
            resourceInputs["fireBaseDatabase"] = state ? state.fireBaseDatabase : undefined;
            resourceInputs["fireBaseHosting"] = state ? state.fireBaseHosting : undefined;
            resourceInputs["fireBaseStorage"] = state ? state.fireBaseStorage : undefined;
            resourceInputs["fireStore"] = state ? state.fireStore : undefined;
            resourceInputs["functions"] = state ? state.functions : undefined;
            resourceInputs["interconnect"] = state ? state.interconnect : undefined;
            resourceInputs["kubernetes"] = state ? state.kubernetes : undefined;
            resourceInputs["linkedAccountId"] = state ? state.linkedAccountId : undefined;
            resourceInputs["loadBalancing"] = state ? state.loadBalancing : undefined;
            resourceInputs["memCache"] = state ? state.memCache : undefined;
            resourceInputs["pubSub"] = state ? state.pubSub : undefined;
            resourceInputs["redis"] = state ? state.redis : undefined;
            resourceInputs["router"] = state ? state.router : undefined;
            resourceInputs["run"] = state ? state.run : undefined;
            resourceInputs["spanner"] = state ? state.spanner : undefined;
            resourceInputs["sql"] = state ? state.sql : undefined;
            resourceInputs["storage"] = state ? state.storage : undefined;
            resourceInputs["virtualMachines"] = state ? state.virtualMachines : undefined;
            resourceInputs["vpcAccess"] = state ? state.vpcAccess : undefined;
        } else {
            const args = argsOrState as GcpIntegrationsArgs | undefined;
            if ((!args || args.linkedAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linkedAccountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["alloyDb"] = args ? args.alloyDb : undefined;
            resourceInputs["appEngine"] = args ? args.appEngine : undefined;
            resourceInputs["bigQuery"] = args ? args.bigQuery : undefined;
            resourceInputs["bigTable"] = args ? args.bigTable : undefined;
            resourceInputs["composer"] = args ? args.composer : undefined;
            resourceInputs["dataFlow"] = args ? args.dataFlow : undefined;
            resourceInputs["dataProc"] = args ? args.dataProc : undefined;
            resourceInputs["dataStore"] = args ? args.dataStore : undefined;
            resourceInputs["fireBaseDatabase"] = args ? args.fireBaseDatabase : undefined;
            resourceInputs["fireBaseHosting"] = args ? args.fireBaseHosting : undefined;
            resourceInputs["fireBaseStorage"] = args ? args.fireBaseStorage : undefined;
            resourceInputs["fireStore"] = args ? args.fireStore : undefined;
            resourceInputs["functions"] = args ? args.functions : undefined;
            resourceInputs["interconnect"] = args ? args.interconnect : undefined;
            resourceInputs["kubernetes"] = args ? args.kubernetes : undefined;
            resourceInputs["linkedAccountId"] = args ? args.linkedAccountId : undefined;
            resourceInputs["loadBalancing"] = args ? args.loadBalancing : undefined;
            resourceInputs["memCache"] = args ? args.memCache : undefined;
            resourceInputs["pubSub"] = args ? args.pubSub : undefined;
            resourceInputs["redis"] = args ? args.redis : undefined;
            resourceInputs["router"] = args ? args.router : undefined;
            resourceInputs["run"] = args ? args.run : undefined;
            resourceInputs["spanner"] = args ? args.spanner : undefined;
            resourceInputs["sql"] = args ? args.sql : undefined;
            resourceInputs["storage"] = args ? args.storage : undefined;
            resourceInputs["virtualMachines"] = args ? args.virtualMachines : undefined;
            resourceInputs["vpcAccess"] = args ? args.vpcAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GcpIntegrations.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GcpIntegrations resources.
 */
export interface GcpIntegrationsState {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Alloy DB integration. See Integration blocks below for details.
     */
    alloyDb?: pulumi.Input<inputs.cloud.GcpIntegrationsAlloyDb>;
    /**
     * App Engine integration. See Integration blocks below for details.
     */
    appEngine?: pulumi.Input<inputs.cloud.GcpIntegrationsAppEngine>;
    /**
     * Biq Query integration. See Integration blocks below for details.
     */
    bigQuery?: pulumi.Input<inputs.cloud.GcpIntegrationsBigQuery>;
    /**
     * Big Table. See Integration blocks below for details.
     */
    bigTable?: pulumi.Input<inputs.cloud.GcpIntegrationsBigTable>;
    /**
     * Composer integration. See Integration blocks below for details.
     */
    composer?: pulumi.Input<inputs.cloud.GcpIntegrationsComposer>;
    /**
     * Data Flow integration. See Integration blocks below for details.
     */
    dataFlow?: pulumi.Input<inputs.cloud.GcpIntegrationsDataFlow>;
    /**
     * Data Proc integration. See Integration blocks below for details.
     */
    dataProc?: pulumi.Input<inputs.cloud.GcpIntegrationsDataProc>;
    /**
     * Data Store integration. See Integration blocks below for details.
     */
    dataStore?: pulumi.Input<inputs.cloud.GcpIntegrationsDataStore>;
    /**
     * Fire Base Database integration. See Integration blocks below for details.
     */
    fireBaseDatabase?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseDatabase>;
    /**
     * Fire Base Hosting integration. See Integration blocks below for details.
     */
    fireBaseHosting?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseHosting>;
    /**
     * Fire Base Storage integration. See Integration blocks below for details.
     */
    fireBaseStorage?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseStorage>;
    /**
     * Fire Store integration. See Integration blocks below for details.
     */
    fireStore?: pulumi.Input<inputs.cloud.GcpIntegrationsFireStore>;
    /**
     * Functions integration. See Integration blocks below for details.
     */
    functions?: pulumi.Input<inputs.cloud.GcpIntegrationsFunctions>;
    /**
     * Interconnect integration. See Integration blocks below for details.
     */
    interconnect?: pulumi.Input<inputs.cloud.GcpIntegrationsInterconnect>;
    /**
     * Kubernetes integration. See Integration blocks below for details.
     */
    kubernetes?: pulumi.Input<inputs.cloud.GcpIntegrationsKubernetes>;
    /**
     * The ID of the linked GCP account in New Relic.
     */
    linkedAccountId?: pulumi.Input<number>;
    /**
     * Load Balancing integration. See Integration blocks below for details.
     */
    loadBalancing?: pulumi.Input<inputs.cloud.GcpIntegrationsLoadBalancing>;
    /**
     * Mem cache integration. See Integration blocks below for details.
     */
    memCache?: pulumi.Input<inputs.cloud.GcpIntegrationsMemCache>;
    /**
     * Pub/Sub integration. See Integration blocks below for details.
     */
    pubSub?: pulumi.Input<inputs.cloud.GcpIntegrationsPubSub>;
    /**
     * Redis integration. See Integration blocks below for details.
     */
    redis?: pulumi.Input<inputs.cloud.GcpIntegrationsRedis>;
    /**
     * Router integration. See Integration blocks below for details.
     */
    router?: pulumi.Input<inputs.cloud.GcpIntegrationsRouter>;
    /**
     * Run integration. See Integration blocks below for details.
     */
    run?: pulumi.Input<inputs.cloud.GcpIntegrationsRun>;
    /**
     * Spanner integration. See Integration blocks below for details.
     */
    spanner?: pulumi.Input<inputs.cloud.GcpIntegrationsSpanner>;
    /**
     * SQL integration. See Integration blocks below for details.
     */
    sql?: pulumi.Input<inputs.cloud.GcpIntegrationsSql>;
    /**
     * Storage integration. See Integration blocks below for details.
     */
    storage?: pulumi.Input<inputs.cloud.GcpIntegrationsStorage>;
    /**
     * Virtual machines integration. See Integration blocks below for details.
     */
    virtualMachines?: pulumi.Input<inputs.cloud.GcpIntegrationsVirtualMachines>;
    /**
     * VPC Access integration. See Integration blocks below for details.
     */
    vpcAccess?: pulumi.Input<inputs.cloud.GcpIntegrationsVpcAccess>;
}

/**
 * The set of arguments for constructing a GcpIntegrations resource.
 */
export interface GcpIntegrationsArgs {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Alloy DB integration. See Integration blocks below for details.
     */
    alloyDb?: pulumi.Input<inputs.cloud.GcpIntegrationsAlloyDb>;
    /**
     * App Engine integration. See Integration blocks below for details.
     */
    appEngine?: pulumi.Input<inputs.cloud.GcpIntegrationsAppEngine>;
    /**
     * Biq Query integration. See Integration blocks below for details.
     */
    bigQuery?: pulumi.Input<inputs.cloud.GcpIntegrationsBigQuery>;
    /**
     * Big Table. See Integration blocks below for details.
     */
    bigTable?: pulumi.Input<inputs.cloud.GcpIntegrationsBigTable>;
    /**
     * Composer integration. See Integration blocks below for details.
     */
    composer?: pulumi.Input<inputs.cloud.GcpIntegrationsComposer>;
    /**
     * Data Flow integration. See Integration blocks below for details.
     */
    dataFlow?: pulumi.Input<inputs.cloud.GcpIntegrationsDataFlow>;
    /**
     * Data Proc integration. See Integration blocks below for details.
     */
    dataProc?: pulumi.Input<inputs.cloud.GcpIntegrationsDataProc>;
    /**
     * Data Store integration. See Integration blocks below for details.
     */
    dataStore?: pulumi.Input<inputs.cloud.GcpIntegrationsDataStore>;
    /**
     * Fire Base Database integration. See Integration blocks below for details.
     */
    fireBaseDatabase?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseDatabase>;
    /**
     * Fire Base Hosting integration. See Integration blocks below for details.
     */
    fireBaseHosting?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseHosting>;
    /**
     * Fire Base Storage integration. See Integration blocks below for details.
     */
    fireBaseStorage?: pulumi.Input<inputs.cloud.GcpIntegrationsFireBaseStorage>;
    /**
     * Fire Store integration. See Integration blocks below for details.
     */
    fireStore?: pulumi.Input<inputs.cloud.GcpIntegrationsFireStore>;
    /**
     * Functions integration. See Integration blocks below for details.
     */
    functions?: pulumi.Input<inputs.cloud.GcpIntegrationsFunctions>;
    /**
     * Interconnect integration. See Integration blocks below for details.
     */
    interconnect?: pulumi.Input<inputs.cloud.GcpIntegrationsInterconnect>;
    /**
     * Kubernetes integration. See Integration blocks below for details.
     */
    kubernetes?: pulumi.Input<inputs.cloud.GcpIntegrationsKubernetes>;
    /**
     * The ID of the linked GCP account in New Relic.
     */
    linkedAccountId: pulumi.Input<number>;
    /**
     * Load Balancing integration. See Integration blocks below for details.
     */
    loadBalancing?: pulumi.Input<inputs.cloud.GcpIntegrationsLoadBalancing>;
    /**
     * Mem cache integration. See Integration blocks below for details.
     */
    memCache?: pulumi.Input<inputs.cloud.GcpIntegrationsMemCache>;
    /**
     * Pub/Sub integration. See Integration blocks below for details.
     */
    pubSub?: pulumi.Input<inputs.cloud.GcpIntegrationsPubSub>;
    /**
     * Redis integration. See Integration blocks below for details.
     */
    redis?: pulumi.Input<inputs.cloud.GcpIntegrationsRedis>;
    /**
     * Router integration. See Integration blocks below for details.
     */
    router?: pulumi.Input<inputs.cloud.GcpIntegrationsRouter>;
    /**
     * Run integration. See Integration blocks below for details.
     */
    run?: pulumi.Input<inputs.cloud.GcpIntegrationsRun>;
    /**
     * Spanner integration. See Integration blocks below for details.
     */
    spanner?: pulumi.Input<inputs.cloud.GcpIntegrationsSpanner>;
    /**
     * SQL integration. See Integration blocks below for details.
     */
    sql?: pulumi.Input<inputs.cloud.GcpIntegrationsSql>;
    /**
     * Storage integration. See Integration blocks below for details.
     */
    storage?: pulumi.Input<inputs.cloud.GcpIntegrationsStorage>;
    /**
     * Virtual machines integration. See Integration blocks below for details.
     */
    virtualMachines?: pulumi.Input<inputs.cloud.GcpIntegrationsVirtualMachines>;
    /**
     * VPC Access integration. See Integration blocks below for details.
     */
    vpcAccess?: pulumi.Input<inputs.cloud.GcpIntegrationsVpcAccess>;
}
