// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLevelEventsGoodEventsSelect {
    /**
     * @return The event attribute to use in the SELECT clause.
     * 
     */
    private @Nullable String attribute;
    /**
     * @return The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
     * 
     */
    private String function;
    private @Nullable Double threshold;

    private ServiceLevelEventsGoodEventsSelect() {}
    /**
     * @return The event attribute to use in the SELECT clause.
     * 
     */
    public Optional<String> attribute() {
        return Optional.ofNullable(this.attribute);
    }
    /**
     * @return The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
     * 
     */
    public String function() {
        return this.function;
    }
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelEventsGoodEventsSelect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attribute;
        private String function;
        private @Nullable Double threshold;
        public Builder() {}
        public Builder(ServiceLevelEventsGoodEventsSelect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.function = defaults.function;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder attribute(@Nullable String attribute) {
            this.attribute = attribute;
            return this;
        }
        @CustomType.Setter
        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public ServiceLevelEventsGoodEventsSelect build() {
            final var o = new ServiceLevelEventsGoodEventsSelect();
            o.attribute = attribute;
            o.function = function;
            o.threshold = threshold;
            return o;
        }
    }
}
