// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelAlertHelperPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelAlertHelperPlainArgs Empty = new GetServiceLevelAlertHelperPlainArgs();

    @Import(name="alertType", required=true)
    private String alertType;

    public String alertType() {
        return this.alertType;
    }

    @Import(name="customEvaluationPeriod")
    private @Nullable Integer customEvaluationPeriod;

    public Optional<Integer> customEvaluationPeriod() {
        return Optional.ofNullable(this.customEvaluationPeriod);
    }

    @Import(name="customToleratedBudgetConsumption")
    private @Nullable Double customToleratedBudgetConsumption;

    public Optional<Double> customToleratedBudgetConsumption() {
        return Optional.ofNullable(this.customToleratedBudgetConsumption);
    }

    @Import(name="isBadEvents")
    private @Nullable Boolean isBadEvents;

    public Optional<Boolean> isBadEvents() {
        return Optional.ofNullable(this.isBadEvents);
    }

    @Import(name="sliGuid", required=true)
    private String sliGuid;

    public String sliGuid() {
        return this.sliGuid;
    }

    @Import(name="sloPeriod", required=true)
    private Integer sloPeriod;

    public Integer sloPeriod() {
        return this.sloPeriod;
    }

    @Import(name="sloTarget", required=true)
    private Double sloTarget;

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

        public Builder alertType(String alertType) {
            $.alertType = alertType;
            return this;
        }

        public Builder customEvaluationPeriod(@Nullable Integer customEvaluationPeriod) {
            $.customEvaluationPeriod = customEvaluationPeriod;
            return this;
        }

        public Builder customToleratedBudgetConsumption(@Nullable Double customToleratedBudgetConsumption) {
            $.customToleratedBudgetConsumption = customToleratedBudgetConsumption;
            return this;
        }

        public Builder isBadEvents(@Nullable Boolean isBadEvents) {
            $.isBadEvents = isBadEvents;
            return this;
        }

        public Builder sliGuid(String sliGuid) {
            $.sliGuid = sliGuid;
            return this;
        }

        public Builder sloPeriod(Integer sloPeriod) {
            $.sloPeriod = sloPeriod;
            return this;
        }

        public Builder sloTarget(Double sloTarget) {
            $.sloTarget = sloTarget;
            return this;
        }

        public GetServiceLevelAlertHelperPlainArgs build() {
            if ($.alertType == null) {
                throw new MissingRequiredPropertyException("GetServiceLevelAlertHelperPlainArgs", "alertType");
            }
            if ($.sliGuid == null) {
                throw new MissingRequiredPropertyException("GetServiceLevelAlertHelperPlainArgs", "sliGuid");
            }
            if ($.sloPeriod == null) {
                throw new MissingRequiredPropertyException("GetServiceLevelAlertHelperPlainArgs", "sloPeriod");
            }
            if ($.sloTarget == null) {
                throw new MissingRequiredPropertyException("GetServiceLevelAlertHelperPlainArgs", "sloTarget");
            }
            return $;
        }
    }

}
