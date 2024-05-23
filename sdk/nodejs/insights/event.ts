// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create one or more Insights events.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.insights.Event("foo", {events: [{
 *     type: "MyEvent",
 *     timestamp: 1232471100,
 *     attributes: [
 *         {
 *             key: "a_string_attribute",
 *             value: "a string",
 *         },
 *         {
 *             key: "an_integer_attribute",
 *             value: "42",
 *             type: "int",
 *         },
 *         {
 *             key: "a_float_attribute",
 *             value: "101.1",
 *             type: "float",
 *         },
 *     ],
 * }]});
 * ```
 *
 * ## Events
 *
 * The `event` mapping supports the following arguments:
 *
 *   * `type` - (Required) The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
 *   * `timestamp` - (Optional) Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
 *   * `attribute` - (Required) An attribute to include in your event payload. Multiple attribute blocks can be defined for an event. See Attributes below for details.
 *
 * ### Attributes
 *
 * The `attribute` mapping supports the following arguments:
 *
 *   * `key` - (Required) The name of the attribute.
 *   * `value` - (Required) The value of the attribute.
 *   * `type` - (Optional) Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are `string`, `int`, or `float`. Defaults to `string`.
 */
export class Event extends pulumi.CustomResource {
    /**
     * Get an existing Event resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventState | undefined;
            resourceInputs["events"] = state ? state.events : undefined;
        } else {
            const args = argsOrState as EventArgs | undefined;
            if ((!args || args.events === undefined) && !opts.urn) {
                throw new Error("Missing required property 'events'");
            }
            resourceInputs["events"] = args ? args.events : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Event.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Event resources.
 */
export interface EventState {
    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     */
    events?: pulumi.Input<pulumi.Input<inputs.insights.EventEvent>[]>;
}

/**
 * The set of arguments for constructing a Event resource.
 */
export interface EventArgs {
    /**
     * An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
     */
    events: pulumi.Input<pulumi.Input<inputs.insights.EventEvent>[]>;
}
