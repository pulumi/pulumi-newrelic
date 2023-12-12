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
public final class AwsGovcloudIntegrationsElasticSearch {
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    private @Nullable List<String> awsRegions;
    /**
     * @return Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
     * 
     */
    private @Nullable Boolean fetchNodes;
    /**
     * @return The data polling interval in seconds.
     * 
     * Some integration types support an additional set of arguments:
     * 
     */
    private @Nullable Integer metricsPollingInterval;
    /**
     * @return Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    private @Nullable String tagKey;
    /**
     * @return Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    private @Nullable String tagValue;

    private AwsGovcloudIntegrationsElasticSearch() {}
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    public List<String> awsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }
    /**
     * @return Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
     * 
     */
    public Optional<Boolean> fetchNodes() {
        return Optional.ofNullable(this.fetchNodes);
    }
    /**
     * @return The data polling interval in seconds.
     * 
     * Some integration types support an additional set of arguments:
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }
    /**
     * @return Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    public Optional<String> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * @return Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    public Optional<String> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsGovcloudIntegrationsElasticSearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> awsRegions;
        private @Nullable Boolean fetchNodes;
        private @Nullable Integer metricsPollingInterval;
        private @Nullable String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(AwsGovcloudIntegrationsElasticSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegions = defaults.awsRegions;
    	      this.fetchNodes = defaults.fetchNodes;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        @CustomType.Setter
        public Builder awsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }
        public Builder awsRegions(String... awsRegions) {
            return awsRegions(List.of(awsRegions));
        }
        @CustomType.Setter
        public Builder fetchNodes(@Nullable Boolean fetchNodes) {
            this.fetchNodes = fetchNodes;
            return this;
        }
        @CustomType.Setter
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {
            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        @CustomType.Setter
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        @CustomType.Setter
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public AwsGovcloudIntegrationsElasticSearch build() {
            final var _resultValue = new AwsGovcloudIntegrationsElasticSearch();
            _resultValue.awsRegions = awsRegions;
            _resultValue.fetchNodes = fetchNodes;
            _resultValue.metricsPollingInterval = metricsPollingInterval;
            _resultValue.tagKey = tagKey;
            _resultValue.tagValue = tagValue;
            return _resultValue;
        }
    }
}
