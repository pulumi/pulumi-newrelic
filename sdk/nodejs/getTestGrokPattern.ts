// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getTestGrokPattern({
 *     grok: "%%{IP:host_ip}",
 *     logLines: [
 *         "host_ip: 43.3.120.2",
 *         "bytes_received: 2048",
 *     ],
 * });
 * ```
 */
export function getTestGrokPattern(args: GetTestGrokPatternArgs, opts?: pulumi.InvokeOptions): Promise<GetTestGrokPatternResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("newrelic:index/getTestGrokPattern:getTestGrokPattern", {
        "accountId": args.accountId,
        "grok": args.grok,
        "logLines": args.logLines,
    }, opts);
}

/**
 * A collection of arguments for invoking getTestGrokPattern.
 */
export interface GetTestGrokPatternArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: number;
    /**
     * The Grok pattern to test.
     */
    grok: string;
    /**
     * The log lines to test the Grok pattern against.
     */
    logLines: string[];
}

/**
 * A collection of values returned by getTestGrokPattern.
 */
export interface GetTestGrokPatternResult {
    readonly accountId?: number;
    readonly grok: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly logLines: string[];
    /**
     * Nested attribute containing information about the test of Grok pattern against a list of log lines.
     */
    readonly testGroks: outputs.GetTestGrokPatternTestGrok[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = newrelic.getTestGrokPattern({
 *     grok: "%%{IP:host_ip}",
 *     logLines: [
 *         "host_ip: 43.3.120.2",
 *         "bytes_received: 2048",
 *     ],
 * });
 * ```
 */
export function getTestGrokPatternOutput(args: GetTestGrokPatternOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTestGrokPatternResult> {
    return pulumi.output(args).apply((a: any) => getTestGrokPattern(a, opts))
}

/**
 * A collection of arguments for invoking getTestGrokPattern.
 */
export interface GetTestGrokPatternOutputArgs {
    /**
     * The New Relic account ID to operate on.  This allows you to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The Grok pattern to test.
     */
    grok: pulumi.Input<string>;
    /**
     * The log lines to test the Grok pattern against.
     */
    logLines: pulumi.Input<pulumi.Input<string>[]>;
}
