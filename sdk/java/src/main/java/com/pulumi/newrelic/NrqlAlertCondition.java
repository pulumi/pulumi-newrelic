// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NrqlAlertConditionArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NrqlAlertConditionState;
import com.pulumi.newrelic.outputs.NrqlAlertConditionCritical;
import com.pulumi.newrelic.outputs.NrqlAlertConditionNrql;
import com.pulumi.newrelic.outputs.NrqlAlertConditionTerm;
import com.pulumi.newrelic.outputs.NrqlAlertConditionWarning;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage NRQL alert conditions in New Relic.
 * 
 * ## Example Usage
 * ## NRQL
 * 
 * The `nrql` block supports the following arguments:
 * 
 * - `query` - (Required) The NRQL query to execute for the condition.
 * - `evaluation_offset` - (Optional) **DEPRECATED:** Use `aggregation_method` instead. Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated based on their `aggregation_window` size. The start time depends on this value. It&#39;s recommended to set this to 3 windows. An offset of less than 3 windows will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 windows and an `aggregation_window` of 60 seconds, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`. `evaluation_offset` cannot be set with `aggregation_method`, `aggregation_delay`, or `aggregation_timer`.&lt;br&gt;
 * - `since_value` - (Optional)  **DEPRECATED:** Use `aggregation_method` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
 * 
 * ## Terms
 * 
 * &gt; **NOTE:** The direct use of the `term` has been deprecated, and users should use `critical` and `warning` instead.  What follows now applies to the named priority attributes for `critical` and `warning`, but for those attributes the priority is not allowed.
 * 
 * NRQL alert conditions support up to two terms. At least one `term` must have `priority` set to `critical` and the second optional `term` must have `priority` set to `warning`.
 * 
 * The `term` block supports the following arguments:
 * 
 * - `operator` - (Optional) Valid values are `above`, `above_or_equals`, `below`, `below_or_equals`, `equals`, or `not_equals` (case insensitive). Defaults to `equals`. Note that when using a `type` of `baseline`, the only valid option here is `above`.
 * - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
 * - `threshold` - (Required) The value which will trigger a violation.
 * &lt;br&gt;For _baseline_ NRQL alert conditions, the value must be in the range [1, 1000]. The value is the number of standard deviations from the baseline that the metric must exceed in order to create a violation.
 * - `threshold_duration` - (Optional) The duration, in seconds, that the threshold must violate in order to create a violation. Value must be a multiple of the `aggregation_window` (which has a default of 60 seconds).
 * &lt;br&gt;For _baseline_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
 * &lt;br&gt;For _static_ NRQL alert conditions with the `sum` value function, the value must be within 120-7200 seconds (inclusive).
 * &lt;br&gt;For _static_ NRQL alert conditions with the `single_value` value function, the value must be within 60-7200 seconds (inclusive).
 * 
 * - `threshold_occurrences` - (Optional) The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `at_least_once` (case insensitive).
 * - `duration` - (Optional) **DEPRECATED:** Use `threshold_duration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
 * - `time_function` - (Optional) **DEPRECATED:** Use `threshold_occurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
 * 
 * ## Additional Examples
 * 
 * ##### Type: `baseline`
 * 
 * [Baseline NRQL alert conditions](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/create-baseline-alert-conditions) are dynamic in nature and adjust to the behavior of your data. The example below demonstrates a baseline NRQL alert condition for alerting when transaction durations are above a specified threshold and dynamically adjusts based on data trends.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.NrqlAlertCondition;
 * import com.pulumi.newrelic.NrqlAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionNrqlArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionWarningArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fooAlertPolicy = new AlertPolicy(&#34;fooAlertPolicy&#34;);
 * 
 *         var fooIndex_alertPolicyAlertPolicy = new AlertPolicy(&#34;fooIndex/alertPolicyAlertPolicy&#34;);
 * 
 *         var fooNrqlAlertCondition = new NrqlAlertCondition(&#34;fooNrqlAlertCondition&#34;, NrqlAlertConditionArgs.builder()        
 *             .accountId(&#34;your_account_id&#34;)
 *             .policyId(fooAlertPolicy.id())
 *             .type(&#34;static&#34;)
 *             .description(&#34;Alert when transactions are taking too long&#34;)
 *             .runbookUrl(&#34;https://www.example.com&#34;)
 *             .enabled(true)
 *             .violationTimeLimitSeconds(3600)
 *             .fillOption(&#34;static&#34;)
 *             .fillValue(1)
 *             .aggregationWindow(60)
 *             .aggregationMethod(&#34;event_flow&#34;)
 *             .aggregationDelay(120)
 *             .expirationDuration(120)
 *             .openViolationOnExpiration(true)
 *             .closeViolationsOnExpiration(true)
 *             .slideBy(30)
 *             .nrql(NrqlAlertConditionNrqlArgs.builder()
 *                 .query(&#34;SELECT average(duration) FROM Transaction where appName = &#39;Your App&#39;&#34;)
 *                 .build())
 *             .critical(NrqlAlertConditionCriticalArgs.builder()
 *                 .operator(&#34;above&#34;)
 *                 .threshold(5.5)
 *                 .thresholdDuration(300)
 *                 .thresholdOccurrences(&#34;ALL&#34;)
 *                 .build())
 *             .warning(NrqlAlertConditionWarningArgs.builder()
 *                 .operator(&#34;above&#34;)
 *                 .threshold(3.5)
 *                 .thresholdDuration(600)
 *                 .thresholdOccurrences(&#34;ALL&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &lt;&lt;&lt;&lt;&lt;&lt;&lt; HEAD
 * ### Type: `outlier`
 * 
 * In software development and operations, it is common to have a group consisting of members you expect to behave approximately the same. [Outlier detection](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/outlier-detection-nrql-alert) facilitates alerting when the behavior of one or more common members falls outside a specified range expectation.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.NrqlAlertCondition;
 * import com.pulumi.newrelic.NrqlAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionNrqlArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionWarningArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fooAlertPolicy = new AlertPolicy(&#34;fooAlertPolicy&#34;);
 * 
 *         var fooNrqlAlertCondition = new NrqlAlertCondition(&#34;fooNrqlAlertCondition&#34;, NrqlAlertConditionArgs.builder()        
 *             .type(&#34;outlier&#34;)
 *             .accountId(&#34;your_account_id&#34;)
 *             .policyId(fooAlertPolicy.id())
 *             .description(&#34;Alert when outlier conditions occur&#34;)
 *             .enabled(true)
 *             .runbookUrl(&#34;https://www.example.com&#34;)
 *             .violationTimeLimitSeconds(3600)
 *             .aggregationMethod(&#34;event_flow&#34;)
 *             .aggregationDelay(120)
 *             .expectedGroups(2)
 *             .openViolationOnGroupOverlap(true)
 *             .nrql(NrqlAlertConditionNrqlArgs.builder()
 *                 .query(&#34;SELECT percentile(duration, 95) FROM Transaction WHERE appName = &#39;ExampleAppName&#39; FACET host&#34;)
 *                 .build())
 *             .critical(NrqlAlertConditionCriticalArgs.builder()
 *                 .operator(&#34;above&#34;)
 *                 .threshold(0.002)
 *                 .thresholdDuration(600)
 *                 .thresholdOccurrences(&#34;all&#34;)
 *                 .build())
 *             .warning(NrqlAlertConditionWarningArgs.builder()
 *                 .operator(&#34;above&#34;)
 *                 .threshold(0.0015)
 *                 .thresholdDuration(600)
 *                 .thresholdOccurrences(&#34;all&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Upgrade from 1.x to 2.x
 * 
 * There have been several deprecations in the `newrelic.NrqlAlertCondition`
 * resource.  Users will need to make some updates in order to have a smooth
 * upgrade.
 * 
 * An example resource from 1.x might look like the following.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NrqlAlertCondition;
 * import com.pulumi.newrelic.NrqlAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionCriticalArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionNrqlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var nrqlAlertCondition = new NrqlAlertCondition(&#34;nrqlAlertCondition&#34;, NrqlAlertConditionArgs.builder()        
 *             .policyId(newrelic_alert_policy.z().id())
 *             .type(&#34;static&#34;)
 *             .runbookUrl(&#34;https://localhost&#34;)
 *             .enabled(true)
 *             .valueFunction(&#34;sum&#34;)
 *             .violationTimeLimit(&#34;TWENTY_FOUR_HOURS&#34;)
 *             .critical(NrqlAlertConditionCriticalArgs.builder()
 *                 .operator(&#34;above&#34;)
 *                 .thresholdDuration(120)
 *                 .threshold(3)
 *                 .thresholdOccurrences(&#34;AT_LEAST_ONCE&#34;)
 *                 .build())
 *             .nrql(NrqlAlertConditionNrqlArgs.builder()
 *                 .query(&#34;SELECT count(*) FROM TransactionError WHERE appName like &#39;%Dummy App%&#39; FACET appName&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * After making the appropriate adjustments mentioned in the deprecation warnings,
 * the resource now looks like the following.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NrqlAlertCondition;
 * import com.pulumi.newrelic.NrqlAlertConditionArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionTermArgs;
 * import com.pulumi.newrelic.inputs.NrqlAlertConditionNrqlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var nrqlAlertCondition = new NrqlAlertCondition(&#34;nrqlAlertCondition&#34;, NrqlAlertConditionArgs.builder()        
 *             .policyId(newrelic_alert_policy.z().id())
 *             .type(&#34;static&#34;)
 *             .runbookUrl(&#34;https://localhost&#34;)
 *             .enabled(true)
 *             .valueFunction(&#34;sum&#34;)
 *             .violationTimeLimitSeconds(86400)
 *             .terms(NrqlAlertConditionTermArgs.builder()
 *                 .priority(&#34;critical&#34;)
 *                 .operator(&#34;above&#34;)
 *                 .threshold(3)
 *                 .duration(5)
 *                 .timeFunction(&#34;any&#34;)
 *                 .build())
 *             .nrql(NrqlAlertConditionNrqlArgs.builder()
 *                 .query(&#34;SELECT count(*) FROM TransactionError WHERE appName like &#39;%Dummy App%&#39; FACET appName&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NRQL alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;:&lt;conditionType&gt;`, e.g. // For `baseline` conditions
 * 
 * ```sh
 *  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:baseline
 * ```
 * 
 *  // For `static` conditions
 * 
 * ```sh
 *  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:static
 * ```
 * 
 *  &lt;&lt;&lt;&lt;&lt;&lt;&lt; HEAD ======= &gt;&gt;&gt;&gt;&gt;&gt;&gt; v2.46.1 Users can find the actual values for `policy_id` and `condition_id` from the New Relic One UI under respective policy and condition.
 * 
 */
@ResourceType(type="newrelic:index/nrqlAlertCondition:NrqlAlertCondition")
public class NrqlAlertCondition extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * How long we wait for data that belongs in each aggregation window. Depending on your data, a longer delay may increase accuracy but delay notifications. Use `aggregation_delay` with the `event_flow` and `cadence` methods. The maximum delay is 1200 seconds (20 minutes) when using `event_flow` and 3600 seconds (60 minutes) when using `cadence`. In both cases, the minimum delay is 0 seconds and the default is 120 seconds. `aggregation_delay` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    @Export(name="aggregationDelay", type=String.class, parameters={})
    private Output</* @Nullable */ String> aggregationDelay;

    /**
     * @return How long we wait for data that belongs in each aggregation window. Depending on your data, a longer delay may increase accuracy but delay notifications. Use `aggregation_delay` with the `event_flow` and `cadence` methods. The maximum delay is 1200 seconds (20 minutes) when using `event_flow` and 3600 seconds (60 minutes) when using `cadence`. In both cases, the minimum delay is 0 seconds and the default is 120 seconds. `aggregation_delay` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    public Output<Optional<String>> aggregationDelay() {
        return Codegen.optional(this.aggregationDelay);
    }
    /**
     * Determines when we consider an aggregation window to be complete so that we can evaluate the signal for violations. Possible values are `cadence`, `event_flow` or `event_timer`. Default is `event_flow`. `aggregation_method` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    @Export(name="aggregationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> aggregationMethod;

    /**
     * @return Determines when we consider an aggregation window to be complete so that we can evaluate the signal for violations. Possible values are `cadence`, `event_flow` or `event_timer`. Default is `event_flow`. `aggregation_method` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    public Output<Optional<String>> aggregationMethod() {
        return Codegen.optional(this.aggregationMethod);
    }
    /**
     * How long we wait after each data point arrives to make sure we&#39;ve processed the whole batch. Use `aggregation_timer` with the `event_timer` method. The timer value can range from 0 seconds to 1200 seconds (20 minutes); the default is 60 seconds. `aggregation_timer` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    @Export(name="aggregationTimer", type=String.class, parameters={})
    private Output</* @Nullable */ String> aggregationTimer;

    /**
     * @return How long we wait after each data point arrives to make sure we&#39;ve processed the whole batch. Use `aggregation_timer` with the `event_timer` method. The timer value can range from 0 seconds to 1200 seconds (20 minutes); the default is 60 seconds. `aggregation_timer` cannot be set with `nrql.evaluation_offset`.
     * 
     */
    public Output<Optional<String>> aggregationTimer() {
        return Codegen.optional(this.aggregationTimer);
    }
    /**
     * The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
     * 
     */
    @Export(name="aggregationWindow", type=Integer.class, parameters={})
    private Output<Integer> aggregationWindow;

    /**
     * @return The duration of the time window used to evaluate the NRQL query, in seconds. The value must be at least 30 seconds, and no more than 15 minutes (900 seconds). Default is 60 seconds.
     * 
     */
    public Output<Integer> aggregationWindow() {
        return this.aggregationWindow;
    }
    /**
     * The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lower_only`, `upper_and_lower`, `upper_only` (case insensitive).
     * 
     */
    @Export(name="baselineDirection", type=String.class, parameters={})
    private Output</* @Nullable */ String> baselineDirection;

    /**
     * @return The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lower_only`, `upper_and_lower`, `upper_only` (case insensitive).
     * 
     */
    public Output<Optional<String>> baselineDirection() {
        return Codegen.optional(this.baselineDirection);
    }
    /**
     * Whether to close all open violations when the signal expires.
     * 
     */
    @Export(name="closeViolationsOnExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> closeViolationsOnExpiration;

    /**
     * @return Whether to close all open violations when the signal expires.
     * 
     */
    public Output<Optional<Boolean>> closeViolationsOnExpiration() {
        return Codegen.optional(this.closeViolationsOnExpiration);
    }
    /**
     * A list containing the `critical` threshold values. See Terms below for details.
     * 
     */
    @Export(name="critical", type=NrqlAlertConditionCritical.class, parameters={})
    private Output</* @Nullable */ NrqlAlertConditionCritical> critical;

    /**
     * @return A list containing the `critical` threshold values. See Terms below for details.
     * 
     */
    public Output<Optional<NrqlAlertConditionCritical>> critical() {
        return Codegen.optional(this.critical);
    }
    /**
     * The description of the NRQL alert condition.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the NRQL alert condition.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The unique entity identifier of the NRQL Condition in New Relic.
     * 
     */
    @Export(name="entityGuid", type=String.class, parameters={})
    private Output<String> entityGuid;

    /**
     * @return The unique entity identifier of the NRQL Condition in New Relic.
     * 
     */
    public Output<String> entityGuid() {
        return this.entityGuid;
    }
    /**
     * The amount of time (in seconds) to wait before considering the signal expired.
     * 
     */
    @Export(name="expirationDuration", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expirationDuration;

    /**
     * @return The amount of time (in seconds) to wait before considering the signal expired.
     * 
     */
    public Output<Optional<Integer>> expirationDuration() {
        return Codegen.optional(this.expirationDuration);
    }
    /**
     * Which strategy to use when filling gaps in the signal. Possible values are `none`, `last_value` or `static`. If `static`, the `fill_value` field will be used for filling gaps in the signal.
     * 
     */
    @Export(name="fillOption", type=String.class, parameters={})
    private Output</* @Nullable */ String> fillOption;

    /**
     * @return Which strategy to use when filling gaps in the signal. Possible values are `none`, `last_value` or `static`. If `static`, the `fill_value` field will be used for filling gaps in the signal.
     * 
     */
    public Output<Optional<String>> fillOption() {
        return Codegen.optional(this.fillOption);
    }
    /**
     * This value will be used for filling gaps in the signal.
     * 
     */
    @Export(name="fillValue", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> fillValue;

    /**
     * @return This value will be used for filling gaps in the signal.
     * 
     */
    public Output<Optional<Double>> fillValue() {
        return Codegen.optional(this.fillValue);
    }
    /**
     * The title of the condition.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The title of the condition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A NRQL query. See NRQL below for details.
     * 
     */
    @Export(name="nrql", type=NrqlAlertConditionNrql.class, parameters={})
    private Output<NrqlAlertConditionNrql> nrql;

    /**
     * @return A NRQL query. See NRQL below for details.
     * 
     */
    public Output<NrqlAlertConditionNrql> nrql() {
        return this.nrql;
    }
    /**
     * Whether to create a new violation to capture that the signal expired.
     * 
     */
    @Export(name="openViolationOnExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> openViolationOnExpiration;

    /**
     * @return Whether to create a new violation to capture that the signal expired.
     * 
     */
    public Output<Optional<Boolean>> openViolationOnExpiration() {
        return Codegen.optional(this.openViolationOnExpiration);
    }
    /**
     * The ID of the policy where this condition should be used.
     * 
     */
    @Export(name="policyId", type=Integer.class, parameters={})
    private Output<Integer> policyId;

    /**
     * @return The ID of the policy where this condition should be used.
     * 
     */
    public Output<Integer> policyId() {
        return this.policyId;
    }
    /**
     * Runbook URL to display in notifications.
     * 
     */
    @Export(name="runbookUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> runbookUrl;

    /**
     * @return Runbook URL to display in notifications.
     * 
     */
    public Output<Optional<String>> runbookUrl() {
        return Codegen.optional(this.runbookUrl);
    }
    /**
     * Gathers data in overlapping time windows to smooth the chart line, making it easier to spot trends. The `slide_by` value is specified in seconds and must be smaller than and a factor of the `aggregation_window`. `slide_by` cannot be used with `static` NRQL conditions using the `sum` `value_function`.
     * 
     */
    @Export(name="slideBy", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> slideBy;

    /**
     * @return Gathers data in overlapping time windows to smooth the chart line, making it easier to spot trends. The `slide_by` value is specified in seconds and must be smaller than and a factor of the `aggregation_window`. `slide_by` cannot be used with `static` NRQL conditions using the `sum` `value_function`.
     * 
     */
    public Output<Optional<Integer>> slideBy() {
        return Codegen.optional(this.slideBy);
    }
    /**
     * **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     * 
     * @deprecated
     * use `critical` and `warning` attributes instead
     * 
     */
    @Deprecated /* use `critical` and `warning` attributes instead */
    @Export(name="terms", type=List.class, parameters={NrqlAlertConditionTerm.class})
    private Output</* @Nullable */ List<NrqlAlertConditionTerm>> terms;

    /**
     * @return **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
     * 
     */
    public Output<Optional<List<NrqlAlertConditionTerm>>> terms() {
        return Codegen.optional(this.terms);
    }
    /**
     * The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Possible values are `single_value`, `sum` (case insensitive).
     * 
     * @deprecated
     * &#39;value_function&#39; is deprecated.  Remove this field and condition will evaluate as &#39;single_value&#39; by default.  To replicate &#39;sum&#39; behavior, use &#39;slide_by&#39;.
     * 
     */
    @Deprecated /* 'value_function' is deprecated.  Remove this field and condition will evaluate as 'single_value' by default.  To replicate 'sum' behavior, use 'slide_by'. */
    @Export(name="valueFunction", type=String.class, parameters={})
    private Output</* @Nullable */ String> valueFunction;

    /**
     * @return Possible values are `single_value`, `sum` (case insensitive).
     * 
     */
    public Output<Optional<String>> valueFunction() {
        return Codegen.optional(this.valueFunction);
    }
    /**
     * **DEPRECATED:** Use `violation_time_limit_seconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).&lt;br&gt;
     * &lt;small&gt;\***Note**: One of `violation_time_limit` _or_ `violation_time_limit_seconds` must be set, but not both.&lt;/small&gt;
     * 
     * @deprecated
     * use `violation_time_limit_seconds` attribute instead
     * 
     */
    @Deprecated /* use `violation_time_limit_seconds` attribute instead */
    @Export(name="violationTimeLimit", type=String.class, parameters={})
    private Output<String> violationTimeLimit;

    /**
     * @return **DEPRECATED:** Use `violation_time_limit_seconds` instead. Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS`, `THIRTY_DAYS` (case insensitive).&lt;br&gt;
     * &lt;small&gt;\***Note**: One of `violation_time_limit` _or_ `violation_time_limit_seconds` must be set, but not both.&lt;/small&gt;
     * 
     */
    public Output<String> violationTimeLimit() {
        return this.violationTimeLimit;
    }
    /**
     * Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). &lt;br&gt;
     * &lt;small&gt;\***Note**: One of `violation_time_limit` _or_ `violation_time_limit_seconds` must be set, but not both.&lt;/small&gt;
     * 
     */
    @Export(name="violationTimeLimitSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> violationTimeLimitSeconds;

    /**
     * @return Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days) (inclusive). &lt;br&gt;
     * &lt;small&gt;\***Note**: One of `violation_time_limit` _or_ `violation_time_limit_seconds` must be set, but not both.&lt;/small&gt;
     * 
     */
    public Output<Optional<Integer>> violationTimeLimitSeconds() {
        return Codegen.optional(this.violationTimeLimitSeconds);
    }
    /**
     * A list containing the `warning` threshold values. See Terms below for details.
     * 
     */
    @Export(name="warning", type=NrqlAlertConditionWarning.class, parameters={})
    private Output</* @Nullable */ NrqlAlertConditionWarning> warning;

    /**
     * @return A list containing the `warning` threshold values. See Terms below for details.
     * 
     */
    public Output<Optional<NrqlAlertConditionWarning>> warning() {
        return Codegen.optional(this.warning);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NrqlAlertCondition(String name) {
        this(name, NrqlAlertConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NrqlAlertCondition(String name, NrqlAlertConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NrqlAlertCondition(String name, NrqlAlertConditionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, args == null ? NrqlAlertConditionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NrqlAlertCondition(String name, Output<String> id, @Nullable NrqlAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NrqlAlertCondition get(String name, Output<String> id, @Nullable NrqlAlertConditionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NrqlAlertCondition(name, id, state, options);
    }
}