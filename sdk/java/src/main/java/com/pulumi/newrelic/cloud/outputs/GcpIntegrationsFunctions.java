// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GcpIntegrationsFunctions {
    /**
     * @return The data polling interval in seconds.
     * 
     * Other integration supports an additional argument:
     * 
     */
    private @Nullable Integer metricsPollingInterval;

    private GcpIntegrationsFunctions() {}
    /**
     * @return The data polling interval in seconds.
     * 
     * Other integration supports an additional argument:
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpIntegrationsFunctions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer metricsPollingInterval;
        public Builder() {}
        public Builder(GcpIntegrationsFunctions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
        }

        @CustomType.Setter
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {
            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        public GcpIntegrationsFunctions build() {
            final var o = new GcpIntegrationsFunctions();
            o.metricsPollingInterval = metricsPollingInterval;
            return o;
        }
    }
}
