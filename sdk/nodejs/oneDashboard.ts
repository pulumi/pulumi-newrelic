// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ## Additional Examples
 *
 * ## Import
 *
 * New Relic dashboards can be imported using their GUID, e.g.
 *
 * ```sh
 *  $ pulumi import newrelic:index/oneDashboard:OneDashboard my_dashboard <Dashboard GUID>
 * ```
 */
export class OneDashboard extends pulumi.CustomResource {
    /**
     * Get an existing OneDashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OneDashboardState, opts?: pulumi.CustomResourceOptions): OneDashboard {
        return new OneDashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/oneDashboard:OneDashboard';

    /**
     * Returns true if the given object is an instance of OneDashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OneDashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OneDashboard.__pulumiType;
    }

    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Brief text describing the dashboard.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The title of the dashboard.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    public readonly pages!: pulumi.Output<outputs.OneDashboardPage[]>;
    /**
     * The URL for viewing the dashboard.
     */
    public /*out*/ readonly permalink!: pulumi.Output<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
     */
    public readonly permissions!: pulumi.Output<string | undefined>;

    /**
     * Create a OneDashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OneDashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OneDashboardArgs | OneDashboardState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OneDashboardState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["guid"] = state ? state.guid : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["pages"] = state ? state.pages : undefined;
            inputs["permalink"] = state ? state.permalink : undefined;
            inputs["permissions"] = state ? state.permissions : undefined;
        } else {
            const args = argsOrState as OneDashboardArgs | undefined;
            if ((!args || args.pages === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pages'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["pages"] = args ? args.pages : undefined;
            inputs["permissions"] = args ? args.permissions : undefined;
            inputs["guid"] = undefined /*out*/;
            inputs["permalink"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(OneDashboard.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OneDashboard resources.
 */
export interface OneDashboardState {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Brief text describing the dashboard.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    pages?: pulumi.Input<pulumi.Input<inputs.OneDashboardPage>[]>;
    /**
     * The URL for viewing the dashboard.
     */
    permalink?: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
     */
    permissions?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OneDashboard resource.
 */
export interface OneDashboardArgs {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Brief text describing the dashboard.
     */
    description?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    pages: pulumi.Input<pulumi.Input<inputs.OneDashboardPage>[]>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`.  Defaults to `publicReadOnly`.
     */
    permissions?: pulumi.Input<string>;
}
