// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelAlertHelperPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelAlertHelperPlainArgs Empty = new GetServiceLevelAlertHelperPlainArgs();

    /**
     * The type of alert we want to set. Valid values are:
     * 
     */
    @Import(name="alertType", required=true)
    private String alertType;

    /**
     * @return The type of alert we want to set. Valid values are:
     * 
     */
    public String alertType() {
        return this.alertType;
    }

    /**
     * Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
     * 
     */
    @Import(name="customEvaluationPeriod")
    private @Nullable Integer customEvaluationPeriod;

    /**
     * @return Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
     * 
     */
    public Optional<Integer> customEvaluationPeriod() {
        return Optional.ofNullable(this.customEvaluationPeriod);
    }

    /**
     * How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
     * 
     */
    @Import(name="customToleratedBudgetConsumption")
    private @Nullable Double customToleratedBudgetConsumption;

    /**
     * @return How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
     * 
     */
    public Optional<Double> customToleratedBudgetConsumption() {
        return Optional.ofNullable(this.customToleratedBudgetConsumption);
    }

    /**
     * If the SLI is defined using bad events. Defaults to `false`
     * 
     */
    @Import(name="isBadEvents")
    private @Nullable Boolean isBadEvents;

    /**
     * @return If the SLI is defined using bad events. Defaults to `false`
     * 
     */
    public Optional<Boolean> isBadEvents() {
        return Optional.ofNullable(this.isBadEvents);
    }

    /**
     * The guid of the sli we want to set the alert on.
     * 
     */
    @Import(name="sliGuid", required=true)
    private String sliGuid;

    /**
     * @return The guid of the sli we want to set the alert on.
     * 
     */
    public String sliGuid() {
        return this.sliGuid;
    }

    /**
     * The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
     * 
     */
    @Import(name="sloPeriod", required=true)
    private Integer sloPeriod;

    /**
     * @return The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
     * 
     */
    public Integer sloPeriod() {
        return this.sloPeriod;
    }

    /**
     * The target of the Service Level Objective, valid values between `0` and `100`.
     * 
     */
    @Import(name="sloTarget", required=true)
    private Double sloTarget;

    /**
     * @return The target of the Service Level Objective, valid values between `0` and `100`.
     * 
     */
    public Double sloTarget() {
        return this.sloTarget;
    }

    private GetServiceLevelAlertHelperPlainArgs() {}

    private GetServiceLevelAlertHelperPlainArgs(GetServiceLevelAlertHelperPlainArgs $) {
        this.alertType = $.alertType;
        this.customEvaluationPeriod = $.customEvaluationPeriod;
        this.customToleratedBudgetConsumption = $.customToleratedBudgetConsumption;
        this.isBadEvents = $.isBadEvents;
        this.sliGuid = $.sliGuid;
        this.sloPeriod = $.sloPeriod;
        this.sloTarget = $.sloTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLevelAlertHelperPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLevelAlertHelperPlainArgs $;

        public Builder() {
            $ = new GetServiceLevelAlertHelperPlainArgs();
        }

        public Builder(GetServiceLevelAlertHelperPlainArgs defaults) {
            $ = new GetServiceLevelAlertHelperPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertType The type of alert we want to set. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder alertType(String alertType) {
            $.alertType = alertType;
            return this;
        }

        /**
         * @param customEvaluationPeriod Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customEvaluationPeriod(@Nullable Integer customEvaluationPeriod) {
            $.customEvaluationPeriod = customEvaluationPeriod;
            return this;
        }

        /**
         * @param customToleratedBudgetConsumption How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customToleratedBudgetConsumption(@Nullable Double customToleratedBudgetConsumption) {
            $.customToleratedBudgetConsumption = customToleratedBudgetConsumption;
            return this;
        }

        /**
         * @param isBadEvents If the SLI is defined using bad events. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder isBadEvents(@Nullable Boolean isBadEvents) {
            $.isBadEvents = isBadEvents;
            return this;
        }

        /**
         * @param sliGuid The guid of the sli we want to set the alert on.
         * 
         * @return builder
         * 
         */
        public Builder sliGuid(String sliGuid) {
            $.sliGuid = sliGuid;
            return this;
        }

        /**
         * @param sloPeriod The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder sloPeriod(Integer sloPeriod) {
            $.sloPeriod = sloPeriod;
            return this;
        }

        /**
         * @param sloTarget The target of the Service Level Objective, valid values between `0` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder sloTarget(Double sloTarget) {
            $.sloTarget = sloTarget;
            return this;
        }

        public GetServiceLevelAlertHelperPlainArgs build() {
            $.alertType = Objects.requireNonNull($.alertType, "expected parameter 'alertType' to be non-null");
            $.sliGuid = Objects.requireNonNull($.sliGuid, "expected parameter 'sliGuid' to be non-null");
            $.sloPeriod = Objects.requireNonNull($.sloPeriod, "expected parameter 'sloPeriod' to be non-null");
            $.sloTarget = Objects.requireNonNull($.sloTarget, "expected parameter 'sloTarget' to be non-null");
            return $;
        }
    }

}
