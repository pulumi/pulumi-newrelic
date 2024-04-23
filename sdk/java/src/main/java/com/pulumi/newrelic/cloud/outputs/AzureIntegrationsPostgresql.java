// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureIntegrationsPostgresql {
    /**
     * @return The data polling interval in seconds
     * 
     */
    private @Nullable Integer metricsPollingInterval;
    /**
     * @return Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
     * 
     */
    private @Nullable List<String> resourceGroups;

    private AzureIntegrationsPostgresql() {}
    /**
     * @return The data polling interval in seconds
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }
    /**
     * @return Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
     * 
     */
    public List<String> resourceGroups() {
        return this.resourceGroups == null ? List.of() : this.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIntegrationsPostgresql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer metricsPollingInterval;
        private @Nullable List<String> resourceGroups;
        public Builder() {}
        public Builder(AzureIntegrationsPostgresql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        @CustomType.Setter
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {

            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroups(@Nullable List<String> resourceGroups) {

            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(String... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }
        public AzureIntegrationsPostgresql build() {
            final var _resultValue = new AzureIntegrationsPostgresql();
            _resultValue.metricsPollingInterval = metricsPollingInterval;
            _resultValue.resourceGroups = resourceGroups;
            return _resultValue;
        }
    }
}
