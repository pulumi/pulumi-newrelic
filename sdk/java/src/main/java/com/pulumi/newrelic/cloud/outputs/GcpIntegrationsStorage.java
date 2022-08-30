// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GcpIntegrationsStorage {
    /**
     * @return Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    private @Nullable Boolean fetchTags;
    /**
     * @return The data polling interval in seconds.
     * 
     */
    private @Nullable Integer metricsPollingInterval;

    private GcpIntegrationsStorage() {}
    /**
     * @return Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Boolean> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }
    /**
     * @return The data polling interval in seconds.
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpIntegrationsStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fetchTags;
        private @Nullable Integer metricsPollingInterval;
        public Builder() {}
        public Builder(GcpIntegrationsStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fetchTags = defaults.fetchTags;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
        }

        @CustomType.Setter
        public Builder fetchTags(@Nullable Boolean fetchTags) {
            this.fetchTags = fetchTags;
            return this;
        }
        @CustomType.Setter
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {
            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        public GcpIntegrationsStorage build() {
            final var o = new GcpIntegrationsStorage();
            o.fetchTags = fetchTags;
            o.metricsPollingInterval = metricsPollingInterval;
            return o;
        }
    }
}
