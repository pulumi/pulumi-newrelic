// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureIntegrationsMonitor {
    /**
     * @return A flag that specifies if the integration is active
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Specify resource tags in &#39;key:value&#39; form to be excluded from monitoring
     * 
     */
    private @Nullable List<String> excludeTags;
    /**
     * @return Specify resource tags in &#39;key:value&#39; form to be monitored
     * 
     */
    private @Nullable List<String> includeTags;
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
    /**
     * @return Specify each Azure resource type that needs to be monitored
     * 
     */
    private @Nullable List<String> resourceTypes;

    private AzureIntegrationsMonitor() {}
    /**
     * @return A flag that specifies if the integration is active
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Specify resource tags in &#39;key:value&#39; form to be excluded from monitoring
     * 
     */
    public List<String> excludeTags() {
        return this.excludeTags == null ? List.of() : this.excludeTags;
    }
    /**
     * @return Specify resource tags in &#39;key:value&#39; form to be monitored
     * 
     */
    public List<String> includeTags() {
        return this.includeTags == null ? List.of() : this.includeTags;
    }
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
    /**
     * @return Specify each Azure resource type that needs to be monitored
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIntegrationsMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<String> excludeTags;
        private @Nullable List<String> includeTags;
        private @Nullable Integer metricsPollingInterval;
        private @Nullable List<String> resourceGroups;
        private @Nullable List<String> resourceTypes;
        public Builder() {}
        public Builder(AzureIntegrationsMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.excludeTags = defaults.excludeTags;
    	      this.includeTags = defaults.includeTags;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder excludeTags(@Nullable List<String> excludeTags) {

            this.excludeTags = excludeTags;
            return this;
        }
        public Builder excludeTags(String... excludeTags) {
            return excludeTags(List.of(excludeTags));
        }
        @CustomType.Setter
        public Builder includeTags(@Nullable List<String> includeTags) {

            this.includeTags = includeTags;
            return this;
        }
        public Builder includeTags(String... includeTags) {
            return includeTags(List.of(includeTags));
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
        @CustomType.Setter
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {

            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        public AzureIntegrationsMonitor build() {
            final var _resultValue = new AzureIntegrationsMonitor();
            _resultValue.enabled = enabled;
            _resultValue.excludeTags = excludeTags;
            _resultValue.includeTags = includeTags;
            _resultValue.metricsPollingInterval = metricsPollingInterval;
            _resultValue.resourceGroups = resourceGroups;
            _resultValue.resourceTypes = resourceTypes;
            return _resultValue;
        }
    }
}
