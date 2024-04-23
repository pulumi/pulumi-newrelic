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
public final class AwsIntegrationsKinesisFirehose {
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    private @Nullable List<String> awsRegions;
    /**
     * @return The data polling interval in seconds.
     * 
     */
    private @Nullable Integer metricsPollingInterval;

    private AwsIntegrationsKinesisFirehose() {}
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    public List<String> awsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
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

    public static Builder builder(AwsIntegrationsKinesisFirehose defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> awsRegions;
        private @Nullable Integer metricsPollingInterval;
        public Builder() {}
        public Builder(AwsIntegrationsKinesisFirehose defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegions = defaults.awsRegions;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
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
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {

            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        public AwsIntegrationsKinesisFirehose build() {
            final var _resultValue = new AwsIntegrationsKinesisFirehose();
            _resultValue.awsRegions = awsRegions;
            _resultValue.metricsPollingInterval = metricsPollingInterval;
            return _resultValue;
        }
    }
}
