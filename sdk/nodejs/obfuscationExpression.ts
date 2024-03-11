// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update and delete New Relic Obfuscation Expressions.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.ObfuscationExpression("foo", {
 *     accountId: 12345,
 *     description: "The description",
 *     regex: "(regex.*)",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * New Relic obfuscation expression can be imported using the expression ID, e.g.
 *
 * bash
 *
 * ```sh
 * $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
 * ```
 */
export class ObfuscationExpression extends pulumi.CustomResource {
    /**
     * Get an existing ObfuscationExpression resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObfuscationExpressionState, opts?: pulumi.CustomResourceOptions): ObfuscationExpression {
        return new ObfuscationExpression(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/obfuscationExpression:ObfuscationExpression';

    /**
     * Returns true if the given object is an instance of ObfuscationExpression.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObfuscationExpression {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObfuscationExpression.__pulumiType;
    }

    /**
     * The account id associated with the obfuscation expression.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Description of expression.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of expression.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     */
    public readonly regex!: pulumi.Output<string>;

    /**
     * Create a ObfuscationExpression resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObfuscationExpressionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObfuscationExpressionArgs | ObfuscationExpressionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObfuscationExpressionState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["regex"] = state ? state.regex : undefined;
        } else {
            const args = argsOrState as ObfuscationExpressionArgs | undefined;
            if ((!args || args.regex === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regex'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["regex"] = args ? args.regex : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObfuscationExpression.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObfuscationExpression resources.
 */
export interface ObfuscationExpressionState {
    /**
     * The account id associated with the obfuscation expression.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Description of expression.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of expression.
     */
    name?: pulumi.Input<string>;
    /**
     * Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     */
    regex?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObfuscationExpression resource.
 */
export interface ObfuscationExpressionArgs {
    /**
     * The account id associated with the obfuscation expression.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Description of expression.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of expression.
     */
    name?: pulumi.Input<string>;
    /**
     * Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
     */
    regex: pulumi.Input<string>;
}
