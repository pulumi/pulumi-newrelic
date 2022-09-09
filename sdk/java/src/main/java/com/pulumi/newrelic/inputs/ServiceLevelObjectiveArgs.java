// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLevelObjectiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelObjectiveArgs Empty = new ServiceLevelObjectiveArgs();

    /**
     * The description of the SLI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the SLI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A short name for the SLI that will help anyone understand what it is about.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The target of the objective, valid values between `0` and `100`. Up to 5 decimals accepted.
     * 
     */
    @Import(name="target", required=true)
    private Output<Double> target;

    /**
     * @return The target of the objective, valid values between `0` and `100`. Up to 5 decimals accepted.
     * 
     */
    public Output<Double> target() {
        return this.target;
    }

    /**
     * Time window is the period of the objective.
     * 
     */
    @Import(name="timeWindow", required=true)
    private Output<ServiceLevelObjectiveTimeWindowArgs> timeWindow;

    /**
     * @return Time window is the period of the objective.
     * 
     */
    public Output<ServiceLevelObjectiveTimeWindowArgs> timeWindow() {
        return this.timeWindow;
    }

    private ServiceLevelObjectiveArgs() {}

    private ServiceLevelObjectiveArgs(ServiceLevelObjectiveArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.target = $.target;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelObjectiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelObjectiveArgs $;

        public Builder() {
            $ = new ServiceLevelObjectiveArgs();
        }

        public Builder(ServiceLevelObjectiveArgs defaults) {
            $ = new ServiceLevelObjectiveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the SLI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the SLI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A short name for the SLI that will help anyone understand what it is about.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A short name for the SLI that will help anyone understand what it is about.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param target The target of the objective, valid values between `0` and `100`. Up to 5 decimals accepted.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<Double> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target of the objective, valid values between `0` and `100`. Up to 5 decimals accepted.
         * 
         * @return builder
         * 
         */
        public Builder target(Double target) {
            return target(Output.of(target));
        }

        /**
         * @param timeWindow Time window is the period of the objective.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(Output<ServiceLevelObjectiveTimeWindowArgs> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeWindow Time window is the period of the objective.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(ServiceLevelObjectiveTimeWindowArgs timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public ServiceLevelObjectiveArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.timeWindow = Objects.requireNonNull($.timeWindow, "expected parameter 'timeWindow' to be non-null");
            return $;
        }
    }

}