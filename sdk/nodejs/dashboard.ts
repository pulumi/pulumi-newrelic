// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * New Relic legacy Dashboards reached end of life Wednesday July 28, 2021.
 *
 * **This resource has been removed.**
 *
 * For more information, [click here](https://discuss.newrelic.com/t/important-insights-dashboard-api-end-of-life/149357)
 */
export class Dashboard extends pulumi.CustomResource {
    /**
     * Get an existing Dashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DashboardState, opts?: pulumi.CustomResourceOptions): Dashboard {
        return new Dashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/dashboard:Dashboard';

    /**
     * Returns true if the given object is an instance of Dashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Dashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Dashboard.__pulumiType;
    }

    /**
     * The URL for viewing the dashboard.
     */
    public /*out*/ readonly dashboardUrl!: pulumi.Output<string>;
    /**
     * Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
     * read_only. Defaults to editable_by_all.
     */
    public readonly editable!: pulumi.Output<string | undefined>;
    /**
     * A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
     */
    public readonly filter!: pulumi.Output<outputs.DashboardFilter | undefined>;
    /**
     * New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    public readonly gridColumnCount!: pulumi.Output<number | undefined>;
    /**
     * The icon for the dashboard.
     */
    public readonly icon!: pulumi.Output<string | undefined>;
    /**
     * The title of the dashboard.
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
     */
    public readonly visibility!: pulumi.Output<string | undefined>;
    /**
     * A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
     */
    public readonly widgets!: pulumi.Output<outputs.DashboardWidget[] | undefined>;

    /**
     * Create a Dashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DashboardArgs | DashboardState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DashboardState | undefined;
            inputs["dashboardUrl"] = state ? state.dashboardUrl : undefined;
            inputs["editable"] = state ? state.editable : undefined;
            inputs["filter"] = state ? state.filter : undefined;
            inputs["gridColumnCount"] = state ? state.gridColumnCount : undefined;
            inputs["icon"] = state ? state.icon : undefined;
            inputs["title"] = state ? state.title : undefined;
            inputs["visibility"] = state ? state.visibility : undefined;
            inputs["widgets"] = state ? state.widgets : undefined;
        } else {
            const args = argsOrState as DashboardArgs | undefined;
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            inputs["editable"] = args ? args.editable : undefined;
            inputs["filter"] = args ? args.filter : undefined;
            inputs["gridColumnCount"] = args ? args.gridColumnCount : undefined;
            inputs["icon"] = args ? args.icon : undefined;
            inputs["title"] = args ? args.title : undefined;
            inputs["visibility"] = args ? args.visibility : undefined;
            inputs["widgets"] = args ? args.widgets : undefined;
            inputs["dashboardUrl"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Dashboard.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Dashboard resources.
 */
export interface DashboardState {
    /**
     * The URL for viewing the dashboard.
     */
    readonly dashboardUrl?: pulumi.Input<string>;
    /**
     * Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
     * read_only. Defaults to editable_by_all.
     */
    readonly editable?: pulumi.Input<string>;
    /**
     * A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
     */
    readonly filter?: pulumi.Input<inputs.DashboardFilter>;
    /**
     * New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    readonly gridColumnCount?: pulumi.Input<number>;
    /**
     * The icon for the dashboard.
     */
    readonly icon?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    readonly title?: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
     */
    readonly visibility?: pulumi.Input<string>;
    /**
     * A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
     */
    readonly widgets?: pulumi.Input<pulumi.Input<inputs.DashboardWidget>[]>;
}

/**
 * The set of arguments for constructing a Dashboard resource.
 */
export interface DashboardArgs {
    /**
     * Determines who can edit the dashboard in an account. Valid values are all, editable_by_all, editable_by_owner, or
     * read_only. Defaults to editable_by_all.
     */
    readonly editable?: pulumi.Input<string>;
    /**
     * A nested block that describes a dashboard filter. Exactly one nested filter block is allowed.
     */
    readonly filter?: pulumi.Input<inputs.DashboardFilter>;
    /**
     * New Relic One supports a 3 column grid or a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    readonly gridColumnCount?: pulumi.Input<number>;
    /**
     * The icon for the dashboard.
     */
    readonly icon?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    readonly title: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are all or owner. Defaults to all.
     */
    readonly visibility?: pulumi.Input<string>;
    /**
     * A nested block that describes a visualization. Up to 300 widget blocks are allowed in a dashboard definition.
     */
    readonly widgets?: pulumi.Input<pulumi.Input<inputs.DashboardWidget>[]>;
}
