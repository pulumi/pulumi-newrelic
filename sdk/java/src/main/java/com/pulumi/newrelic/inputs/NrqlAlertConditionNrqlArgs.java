// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NrqlAlertConditionNrqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final NrqlAlertConditionNrqlArgs Empty = new NrqlAlertConditionNrqlArgs();

    /**
     * Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It&#39;s recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.&lt;br&gt;
     * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
     * 
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    @Import(name="evaluationOffset")
    private @Nullable Output<Integer> evaluationOffset;

    /**
     * @return Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It&#39;s recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.&lt;br&gt;
     * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
     * 
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    public Optional<Output<Integer>> evaluationOffset() {
        return Optional.ofNullable(this.evaluationOffset);
    }

    /**
     * The NRQL query to execute for the condition.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The NRQL query to execute for the condition.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
     * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
     * 
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    @Import(name="sinceValue")
    private @Nullable Output<String> sinceValue;

    /**
     * @return **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
     * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
     * 
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    public Optional<Output<String>> sinceValue() {
        return Optional.ofNullable(this.sinceValue);
    }

    private NrqlAlertConditionNrqlArgs() {}

    private NrqlAlertConditionNrqlArgs(NrqlAlertConditionNrqlArgs $) {
        this.evaluationOffset = $.evaluationOffset;
        this.query = $.query;
        this.sinceValue = $.sinceValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NrqlAlertConditionNrqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NrqlAlertConditionNrqlArgs $;

        public Builder() {
            $ = new NrqlAlertConditionNrqlArgs();
        }

        public Builder(NrqlAlertConditionNrqlArgs defaults) {
            $ = new NrqlAlertConditionNrqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param evaluationOffset Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It&#39;s recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.&lt;br&gt;
         * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
         * 
         * @return builder
         * 
         * @deprecated
         * use `aggregation_method` attribute instead
         * 
         */
        @Deprecated /* use `aggregation_method` attribute instead */
        public Builder evaluationOffset(@Nullable Output<Integer> evaluationOffset) {
            $.evaluationOffset = evaluationOffset;
            return this;
        }

        /**
         * @param evaluationOffset Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It&#39;s recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.&lt;br&gt;
         * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
         * 
         * @return builder
         * 
         * @deprecated
         * use `aggregation_method` attribute instead
         * 
         */
        @Deprecated /* use `aggregation_method` attribute instead */
        public Builder evaluationOffset(Integer evaluationOffset) {
            return evaluationOffset(Output.of(evaluationOffset));
        }

        /**
         * @param query The NRQL query to execute for the condition.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The NRQL query to execute for the condition.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param sinceValue **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
         * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
         * 
         * @return builder
         * 
         * @deprecated
         * use `aggregation_method` attribute instead
         * 
         */
        @Deprecated /* use `aggregation_method` attribute instead */
        public Builder sinceValue(@Nullable Output<String> sinceValue) {
            $.sinceValue = sinceValue;
            return this;
        }

        /**
         * @param sinceValue **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
         * &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
         * 
         * @return builder
         * 
         * @deprecated
         * use `aggregation_method` attribute instead
         * 
         */
        @Deprecated /* use `aggregation_method` attribute instead */
        public Builder sinceValue(String sinceValue) {
            return sinceValue(Output.of(sinceValue));
        }

        public NrqlAlertConditionNrqlArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}