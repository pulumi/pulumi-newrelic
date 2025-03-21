// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.plugins.inputs.ApplicationSettingsTransactionTracerExplainQueryPlanArgs;
import com.pulumi.newrelic.plugins.inputs.ApplicationSettingsTransactionTracerSqlArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationSettingsTransactionTracerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationSettingsTransactionTracerArgs Empty = new ApplicationSettingsTransactionTracerArgs();

    /**
     * Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
     * 
     */
    @Import(name="explainQueryPlans")
    private @Nullable Output<List<ApplicationSettingsTransactionTracerExplainQueryPlanArgs>> explainQueryPlans;

    /**
     * @return Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
     * 
     */
    public Optional<Output<List<ApplicationSettingsTransactionTracerExplainQueryPlanArgs>>> explainQueryPlans() {
        return Optional.ofNullable(this.explainQueryPlans);
    }

    /**
     * Configuration block for SQL logging.  Including this block enables SQL logging. The following arguments are supported:
     * 
     */
    @Import(name="sql")
    private @Nullable Output<ApplicationSettingsTransactionTracerSqlArgs> sql;

    /**
     * @return Configuration block for SQL logging.  Including this block enables SQL logging. The following arguments are supported:
     * 
     */
    public Optional<Output<ApplicationSettingsTransactionTracerSqlArgs>> sql() {
        return Optional.ofNullable(this.sql);
    }

    /**
     * The response time threshold for collecting stack traces.
     * 
     */
    @Import(name="stackTraceThresholdValue")
    private @Nullable Output<Double> stackTraceThresholdValue;

    /**
     * @return The response time threshold for collecting stack traces.
     * 
     */
    public Optional<Output<Double>> stackTraceThresholdValue() {
        return Optional.ofNullable(this.stackTraceThresholdValue);
    }

    /**
     * The type of threshold for transactions. Valid values are `VALUE`,`APDEX_F`(4 times your apdex target)
     * 
     */
    @Import(name="transactionThresholdType")
    private @Nullable Output<String> transactionThresholdType;

    /**
     * @return The type of threshold for transactions. Valid values are `VALUE`,`APDEX_F`(4 times your apdex target)
     * 
     */
    public Optional<Output<String>> transactionThresholdType() {
        return Optional.ofNullable(this.transactionThresholdType);
    }

    /**
     * The threshold value for transactions(in seconds).
     * 
     */
    @Import(name="transactionThresholdValue")
    private @Nullable Output<Double> transactionThresholdValue;

    /**
     * @return The threshold value for transactions(in seconds).
     * 
     */
    public Optional<Output<Double>> transactionThresholdValue() {
        return Optional.ofNullable(this.transactionThresholdValue);
    }

    private ApplicationSettingsTransactionTracerArgs() {}

    private ApplicationSettingsTransactionTracerArgs(ApplicationSettingsTransactionTracerArgs $) {
        this.explainQueryPlans = $.explainQueryPlans;
        this.sql = $.sql;
        this.stackTraceThresholdValue = $.stackTraceThresholdValue;
        this.transactionThresholdType = $.transactionThresholdType;
        this.transactionThresholdValue = $.transactionThresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationSettingsTransactionTracerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSettingsTransactionTracerArgs $;

        public Builder() {
            $ = new ApplicationSettingsTransactionTracerArgs();
        }

        public Builder(ApplicationSettingsTransactionTracerArgs defaults) {
            $ = new ApplicationSettingsTransactionTracerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param explainQueryPlans Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
         * 
         * @return builder
         * 
         */
        public Builder explainQueryPlans(@Nullable Output<List<ApplicationSettingsTransactionTracerExplainQueryPlanArgs>> explainQueryPlans) {
            $.explainQueryPlans = explainQueryPlans;
            return this;
        }

        /**
         * @param explainQueryPlans Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
         * 
         * @return builder
         * 
         */
        public Builder explainQueryPlans(List<ApplicationSettingsTransactionTracerExplainQueryPlanArgs> explainQueryPlans) {
            return explainQueryPlans(Output.of(explainQueryPlans));
        }

        /**
         * @param explainQueryPlans Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
         * 
         * @return builder
         * 
         */
        public Builder explainQueryPlans(ApplicationSettingsTransactionTracerExplainQueryPlanArgs... explainQueryPlans) {
            return explainQueryPlans(List.of(explainQueryPlans));
        }

        /**
         * @param sql Configuration block for SQL logging.  Including this block enables SQL logging. The following arguments are supported:
         * 
         * @return builder
         * 
         */
        public Builder sql(@Nullable Output<ApplicationSettingsTransactionTracerSqlArgs> sql) {
            $.sql = sql;
            return this;
        }

        /**
         * @param sql Configuration block for SQL logging.  Including this block enables SQL logging. The following arguments are supported:
         * 
         * @return builder
         * 
         */
        public Builder sql(ApplicationSettingsTransactionTracerSqlArgs sql) {
            return sql(Output.of(sql));
        }

        /**
         * @param stackTraceThresholdValue The response time threshold for collecting stack traces.
         * 
         * @return builder
         * 
         */
        public Builder stackTraceThresholdValue(@Nullable Output<Double> stackTraceThresholdValue) {
            $.stackTraceThresholdValue = stackTraceThresholdValue;
            return this;
        }

        /**
         * @param stackTraceThresholdValue The response time threshold for collecting stack traces.
         * 
         * @return builder
         * 
         */
        public Builder stackTraceThresholdValue(Double stackTraceThresholdValue) {
            return stackTraceThresholdValue(Output.of(stackTraceThresholdValue));
        }

        /**
         * @param transactionThresholdType The type of threshold for transactions. Valid values are `VALUE`,`APDEX_F`(4 times your apdex target)
         * 
         * @return builder
         * 
         */
        public Builder transactionThresholdType(@Nullable Output<String> transactionThresholdType) {
            $.transactionThresholdType = transactionThresholdType;
            return this;
        }

        /**
         * @param transactionThresholdType The type of threshold for transactions. Valid values are `VALUE`,`APDEX_F`(4 times your apdex target)
         * 
         * @return builder
         * 
         */
        public Builder transactionThresholdType(String transactionThresholdType) {
            return transactionThresholdType(Output.of(transactionThresholdType));
        }

        /**
         * @param transactionThresholdValue The threshold value for transactions(in seconds).
         * 
         * @return builder
         * 
         */
        public Builder transactionThresholdValue(@Nullable Output<Double> transactionThresholdValue) {
            $.transactionThresholdValue = transactionThresholdValue;
            return this;
        }

        /**
         * @param transactionThresholdValue The threshold value for transactions(in seconds).
         * 
         * @return builder
         * 
         */
        public Builder transactionThresholdValue(Double transactionThresholdValue) {
            return transactionThresholdValue(Output.of(transactionThresholdValue));
        }

        public ApplicationSettingsTransactionTracerArgs build() {
            return $;
        }
    }

}
