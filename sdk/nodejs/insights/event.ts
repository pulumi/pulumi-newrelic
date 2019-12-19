// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/insights_event.html.markdown.
 */
export class Event extends pulumi.CustomResource {
    /**
     * Get an existing Event resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventState, opts?: pulumi.CustomResourceOptions): Event {
        return new Event(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:insights/event:Event';

    /**
     * Returns true if the given object is an instance of Event.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Event {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Event.__pulumiType;
    }

    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     */
    public readonly events!: pulumi.Output<outputs.insights.EventEvent[]>;

    /**
     * Create a Event resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventArgs | EventState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as EventState | undefined;
            inputs["events"] = state ? state.events : undefined;
        } else {
            const args = argsOrState as EventArgs | undefined;
            if (!args || args.events === undefined) {
                throw new Error("Missing required property 'events'");
            }
            inputs["events"] = args ? args.events : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Event.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Event resources.
 */
export interface EventState {
    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     */
    readonly events?: pulumi.Input<pulumi.Input<inputs.insights.EventEvent>[]>;
}

/**
 * The set of arguments for constructing a Event resource.
 */
export interface EventArgs {
    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     */
    readonly events: pulumi.Input<pulumi.Input<inputs.insights.EventEvent>[]>;
}
