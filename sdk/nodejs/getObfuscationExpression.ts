// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific Obfuscation Expression in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const expression = newrelic.getObfuscationExpression({
 *     accountId: "123456",
 *     name: "The expression",
 * });
 * const rule = new newrelic.ObfuscationRule("rule", {
 *     name: "ruleName",
 *     description: "description of the rule",
 *     filter: "hostStatus=running",
 *     enabled: true,
 *     actions: [{
 *         attributes: ["message"],
 *         expressionId: expression.then(expression => expression.id),
 *         method: "MASK",
 *     }],
 * });
 * ```
 */
export function getObfuscationExpression(args: GetObfuscationExpressionArgs, opts?: pulumi.InvokeOptions): Promise<GetObfuscationExpressionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getObfuscationExpression:getObfuscationExpression", {
        "accountId": args.accountId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getObfuscationExpression.
 */
export interface GetObfuscationExpressionArgs {
    /**
     * The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
     */
    accountId?: string;
    /**
     * Name of expression.
     */
    name: string;
}

/**
 * A collection of values returned by getObfuscationExpression.
 */
export interface GetObfuscationExpressionResult {
    readonly accountId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Use this data source to get information about a specific Obfuscation Expression in New Relic that already exists.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const expression = newrelic.getObfuscationExpression({
 *     accountId: "123456",
 *     name: "The expression",
 * });
 * const rule = new newrelic.ObfuscationRule("rule", {
 *     name: "ruleName",
 *     description: "description of the rule",
 *     filter: "hostStatus=running",
 *     enabled: true,
 *     actions: [{
 *         attributes: ["message"],
 *         expressionId: expression.then(expression => expression.id),
 *         method: "MASK",
 *     }],
 * });
 * ```
 */
export function getObfuscationExpressionOutput(args: GetObfuscationExpressionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetObfuscationExpressionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("newrelic:index/getObfuscationExpression:getObfuscationExpression", {
        "accountId": args.accountId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getObfuscationExpression.
 */
export interface GetObfuscationExpressionOutputArgs {
    /**
     * The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of expression.
     */
    name: pulumi.Input<string>;
}
