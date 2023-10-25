// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **NOTE:** Applications are not created by this resource, but are created by
 * a reporting agent.
 *
 * Use this resource to manage configuration for an application that already
 * exists in New Relic.
 *
 * ## Notes
 *
 * > **NOTE:** Applications that have reported data in the last twelve hours
 * cannot be deleted.
 *
 * ## Import
 *
 * Applications can be imported using notation `application_id`, e.g.
 *
 * ```sh
 *  $ pulumi import newrelic:plugins/applicationSettings:ApplicationSettings main 6789012345
 * ```
 */
export class ApplicationSettings extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationSettingsState, opts?: pulumi.CustomResourceOptions): ApplicationSettings {
        return new ApplicationSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:plugins/applicationSettings:ApplicationSettings';

    /**
     * Returns true if the given object is an instance of ApplicationSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationSettings.__pulumiType;
    }

    /**
     * The apdex threshold for the New Relic application.
     */
    public readonly appApdexThreshold!: pulumi.Output<number>;
    /**
     * Enable or disable real user monitoring for the New Relic application.
     */
    public readonly enableRealUserMonitoring!: pulumi.Output<boolean>;
    /**
     * The user's apdex threshold for the New Relic application.
     */
    public readonly endUserApdexThreshold!: pulumi.Output<number>;
    /**
     * The name of the application in New Relic APM.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ApplicationSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationSettingsArgs | ApplicationSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationSettingsState | undefined;
            resourceInputs["appApdexThreshold"] = state ? state.appApdexThreshold : undefined;
            resourceInputs["enableRealUserMonitoring"] = state ? state.enableRealUserMonitoring : undefined;
            resourceInputs["endUserApdexThreshold"] = state ? state.endUserApdexThreshold : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ApplicationSettingsArgs | undefined;
            if ((!args || args.appApdexThreshold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appApdexThreshold'");
            }
            if ((!args || args.enableRealUserMonitoring === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enableRealUserMonitoring'");
            }
            if ((!args || args.endUserApdexThreshold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endUserApdexThreshold'");
            }
            resourceInputs["appApdexThreshold"] = args ? args.appApdexThreshold : undefined;
            resourceInputs["enableRealUserMonitoring"] = args ? args.enableRealUserMonitoring : undefined;
            resourceInputs["endUserApdexThreshold"] = args ? args.endUserApdexThreshold : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplicationSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationSettings resources.
 */
export interface ApplicationSettingsState {
    /**
     * The apdex threshold for the New Relic application.
     */
    appApdexThreshold?: pulumi.Input<number>;
    /**
     * Enable or disable real user monitoring for the New Relic application.
     */
    enableRealUserMonitoring?: pulumi.Input<boolean>;
    /**
     * The user's apdex threshold for the New Relic application.
     */
    endUserApdexThreshold?: pulumi.Input<number>;
    /**
     * The name of the application in New Relic APM.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplicationSettings resource.
 */
export interface ApplicationSettingsArgs {
    /**
     * The apdex threshold for the New Relic application.
     */
    appApdexThreshold: pulumi.Input<number>;
    /**
     * Enable or disable real user monitoring for the New Relic application.
     */
    enableRealUserMonitoring: pulumi.Input<boolean>;
    /**
     * The user's apdex threshold for the New Relic application.
     */
    endUserApdexThreshold: pulumi.Input<number>;
    /**
     * The name of the application in New Relic APM.
     */
    name?: pulumi.Input<string>;
}
