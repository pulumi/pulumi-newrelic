// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update and delete New Relic Log Parsing Rule.
 *
 * ## Example Usage
 *
 * Use this example to create the log parse rule.
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.LogParsingRule("foo", {
 *     attribute: "message",
 *     enabled: true,
 *     grok: `sampleattribute='%%{NUMBER:test:int}'`,
 *     lucene: "logtype:linux_messages",
 *     nrql: "SELECT * FROM Log WHERE logtype = 'linux_messages'",
 * });
 * ```
 * ## Additional Example
 *
 * Use this example to validate a grok pattern and create the log parse rule.  More
 * information on grok pattern can be found [here](https://docs.newrelic.com/docs/logs/ui-data/parsing/#grok)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const grok = newrelic.getTestGrokPattern({
 *     grok: `%{IP:host_ip}`,
 *     logLines: ["host_ip: 43.3.120.2"],
 * });
 * const foo = new newrelic.LogParsingRule("foo", {
 *     attribute: "message",
 *     enabled: true,
 *     grok: grok.then(grok => grok.grok),
 *     lucene: "logtype:linux_messages",
 *     nrql: "SELECT * FROM Log WHERE logtype = 'linux_messages'",
 *     matched: grok.then(grok => grok.testGroks?.[0]?.matched),
 * });
 * ```
 *
 * ## Import
 *
 * New Relic log parsing rule can be imported using the rule ID, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:index/logParsingRule:LogParsingRule foo 3456789
 * ```
 */
export class LogParsingRule extends pulumi.CustomResource {
    /**
     * Get an existing LogParsingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogParsingRuleState, opts?: pulumi.CustomResourceOptions): LogParsingRule {
        return new LogParsingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/logParsingRule:LogParsingRule';

    /**
     * Returns true if the given object is an instance of LogParsingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogParsingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogParsingRule.__pulumiType;
    }

    /**
     * The account id associated with the obfuscation rule.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
     */
    public readonly attribute!: pulumi.Output<string | undefined>;
    /**
     * Whether or not this rule is deleted.
     */
    public /*out*/ readonly deleted!: pulumi.Output<boolean>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The Grok of what to parse.
     */
    public readonly grok!: pulumi.Output<string>;
    /**
     * The Lucene to match events to the parsing rule.
     */
    public readonly lucene!: pulumi.Output<string>;
    /**
     * Whether the Grok pattern matched.
     */
    public readonly matched!: pulumi.Output<boolean>;
    /**
     * Name of rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The NRQL to match events to the parsing rule.
     */
    public readonly nrql!: pulumi.Output<string>;

    /**
     * Create a LogParsingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogParsingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogParsingRuleArgs | LogParsingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogParsingRuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["attribute"] = state ? state.attribute : undefined;
            resourceInputs["deleted"] = state ? state.deleted : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["grok"] = state ? state.grok : undefined;
            resourceInputs["lucene"] = state ? state.lucene : undefined;
            resourceInputs["matched"] = state ? state.matched : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nrql"] = state ? state.nrql : undefined;
        } else {
            const args = argsOrState as LogParsingRuleArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.grok === undefined) && !opts.urn) {
                throw new Error("Missing required property 'grok'");
            }
            if ((!args || args.lucene === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lucene'");
            }
            if ((!args || args.nrql === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nrql'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["attribute"] = args ? args.attribute : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["grok"] = args ? args.grok : undefined;
            resourceInputs["lucene"] = args ? args.lucene : undefined;
            resourceInputs["matched"] = args ? args.matched : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nrql"] = args ? args.nrql : undefined;
            resourceInputs["deleted"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogParsingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogParsingRule resources.
 */
export interface LogParsingRuleState {
    /**
     * The account id associated with the obfuscation rule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
     */
    attribute?: pulumi.Input<string>;
    /**
     * Whether or not this rule is deleted.
     */
    deleted?: pulumi.Input<boolean>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Grok of what to parse.
     */
    grok?: pulumi.Input<string>;
    /**
     * The Lucene to match events to the parsing rule.
     */
    lucene?: pulumi.Input<string>;
    /**
     * Whether the Grok pattern matched.
     */
    matched?: pulumi.Input<boolean>;
    /**
     * Name of rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The NRQL to match events to the parsing rule.
     */
    nrql?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogParsingRule resource.
 */
export interface LogParsingRuleArgs {
    /**
     * The account id associated with the obfuscation rule.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
     */
    attribute?: pulumi.Input<string>;
    /**
     * Whether the rule should be applied or not to incoming data.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The Grok of what to parse.
     */
    grok: pulumi.Input<string>;
    /**
     * The Lucene to match events to the parsing rule.
     */
    lucene: pulumi.Input<string>;
    /**
     * Whether the Grok pattern matched.
     */
    matched?: pulumi.Input<boolean>;
    /**
     * Name of rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The NRQL to match events to the parsing rule.
     */
    nrql: pulumi.Input<string>;
}