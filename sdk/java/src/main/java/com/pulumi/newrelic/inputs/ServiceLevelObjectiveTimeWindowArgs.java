// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.ServiceLevelObjectiveTimeWindowRollingArgs;
import java.util.Objects;


public final class ServiceLevelObjectiveTimeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelObjectiveTimeWindowArgs Empty = new ServiceLevelObjectiveTimeWindowArgs();

    /**
     * Rolling window.
     * 
     */
    @Import(name="rolling", required=true)
    private Output<ServiceLevelObjectiveTimeWindowRollingArgs> rolling;

    /**
     * @return Rolling window.
     * 
     */
    public Output<ServiceLevelObjectiveTimeWindowRollingArgs> rolling() {
        return this.rolling;
    }

    private ServiceLevelObjectiveTimeWindowArgs() {}

    private ServiceLevelObjectiveTimeWindowArgs(ServiceLevelObjectiveTimeWindowArgs $) {
        this.rolling = $.rolling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelObjectiveTimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelObjectiveTimeWindowArgs $;

        public Builder() {
            $ = new ServiceLevelObjectiveTimeWindowArgs();
        }

        public Builder(ServiceLevelObjectiveTimeWindowArgs defaults) {
            $ = new ServiceLevelObjectiveTimeWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rolling Rolling window.
         * 
         * @return builder
         * 
         */
        public Builder rolling(Output<ServiceLevelObjectiveTimeWindowRollingArgs> rolling) {
            $.rolling = rolling;
            return this;
        }

        /**
         * @param rolling Rolling window.
         * 
         * @return builder
         * 
         */
        public Builder rolling(ServiceLevelObjectiveTimeWindowRollingArgs rolling) {
            return rolling(Output.of(rolling));
        }

        public ServiceLevelObjectiveTimeWindowArgs build() {
            if ($.rolling == null) {
                throw new MissingRequiredPropertyException("ServiceLevelObjectiveTimeWindowArgs", "rolling");
            }
            return $;
        }
    }

}
