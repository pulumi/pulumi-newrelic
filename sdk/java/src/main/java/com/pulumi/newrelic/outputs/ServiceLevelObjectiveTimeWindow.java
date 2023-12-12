// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.ServiceLevelObjectiveTimeWindowRolling;
import java.util.Objects;

@CustomType
public final class ServiceLevelObjectiveTimeWindow {
    /**
     * @return Rolling window.
     * 
     */
    private ServiceLevelObjectiveTimeWindowRolling rolling;

    private ServiceLevelObjectiveTimeWindow() {}
    /**
     * @return Rolling window.
     * 
     */
    public ServiceLevelObjectiveTimeWindowRolling rolling() {
        return this.rolling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelObjectiveTimeWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ServiceLevelObjectiveTimeWindowRolling rolling;
        public Builder() {}
        public Builder(ServiceLevelObjectiveTimeWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rolling = defaults.rolling;
        }

        @CustomType.Setter
        public Builder rolling(ServiceLevelObjectiveTimeWindowRolling rolling) {
            this.rolling = Objects.requireNonNull(rolling);
            return this;
        }
        public ServiceLevelObjectiveTimeWindow build() {
            final var _resultValue = new ServiceLevelObjectiveTimeWindow();
            _resultValue.rolling = rolling;
            return _resultValue;
        }
    }
}
