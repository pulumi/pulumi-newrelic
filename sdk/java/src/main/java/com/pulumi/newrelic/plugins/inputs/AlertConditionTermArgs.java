// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConditionTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConditionTermArgs Empty = new AlertConditionTermArgs();

    @Import(name="duration", required=true)
    private Output<Integer> duration;

    public Output<Integer> duration() {
        return this.duration;
    }

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="priority")
    private @Nullable Output<String> priority;

    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold;
    }

    @Import(name="timeFunction", required=true)
    private Output<String> timeFunction;

    public Output<String> timeFunction() {
        return this.timeFunction;
    }

    private AlertConditionTermArgs() {}

    private AlertConditionTermArgs(AlertConditionTermArgs $) {
        this.duration = $.duration;
        this.operator = $.operator;
        this.priority = $.priority;
        this.threshold = $.threshold;
        this.timeFunction = $.timeFunction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConditionTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConditionTermArgs $;

        public Builder() {
            $ = new AlertConditionTermArgs();
        }

        public Builder(AlertConditionTermArgs defaults) {
            $ = new AlertConditionTermArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder timeFunction(Output<String> timeFunction) {
            $.timeFunction = timeFunction;
            return this;
        }

        public Builder timeFunction(String timeFunction) {
            return timeFunction(Output.of(timeFunction));
        }

        public AlertConditionTermArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.timeFunction = Objects.requireNonNull($.timeFunction, "expected parameter 'timeFunction' to be non-null");
            return $;
        }
    }

}