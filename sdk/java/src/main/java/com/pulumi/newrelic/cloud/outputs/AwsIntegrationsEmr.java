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
public final class AwsIntegrationsEmr {
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    private @Nullable List<String> awsRegions;
    private @Nullable Boolean fetchTags;
    /**
     * @return The data polling interval in seconds.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    private @Nullable Integer metricsPollingInterval;
    private @Nullable String tagKey;
    private @Nullable String tagValue;

    private AwsIntegrationsEmr() {}
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    public List<String> awsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }
    public Optional<Boolean> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }
    /**
     * @return The data polling interval in seconds.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }
    public Optional<String> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    public Optional<String> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsIntegrationsEmr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> awsRegions;
        private @Nullable Boolean fetchTags;
        private @Nullable Integer metricsPollingInterval;
        private @Nullable String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(AwsIntegrationsEmr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegions = defaults.awsRegions;
    	      this.fetchTags = defaults.fetchTags;
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
        public Builder fetchTags(@Nullable Boolean fetchTags) {
            this.fetchTags = fetchTags;
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
        public AwsIntegrationsEmr build() {
            final var o = new AwsIntegrationsEmr();
            o.awsRegions = awsRegions;
            o.fetchTags = fetchTags;
            o.metricsPollingInterval = metricsPollingInterval;
            o.tagKey = tagKey;
            o.tagValue = tagValue;
            return o;
        }
    }
}
