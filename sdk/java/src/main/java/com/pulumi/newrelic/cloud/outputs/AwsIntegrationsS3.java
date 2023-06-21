// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsIntegrationsS3 {
    /**
     * @return Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    private @Nullable Boolean fetchExtendedInventory;
    /**
     * @return Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    private @Nullable Boolean fetchTags;
    /**
     * @return The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
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

    private AwsIntegrationsS3() {}
    /**
     * @return Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    public Optional<Boolean> fetchExtendedInventory() {
        return Optional.ofNullable(this.fetchExtendedInventory);
    }
    /**
     * @return Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Boolean> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }
    /**
     * @return The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
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

    public static Builder builder(AwsIntegrationsS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fetchExtendedInventory;
        private @Nullable Boolean fetchTags;
        private @Nullable Integer metricsPollingInterval;
        private @Nullable String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(AwsIntegrationsS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fetchExtendedInventory = defaults.fetchExtendedInventory;
    	      this.fetchTags = defaults.fetchTags;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        @CustomType.Setter
        public Builder fetchExtendedInventory(@Nullable Boolean fetchExtendedInventory) {
            this.fetchExtendedInventory = fetchExtendedInventory;
            return this;
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
        public AwsIntegrationsS3 build() {
            final var o = new AwsIntegrationsS3();
            o.fetchExtendedInventory = fetchExtendedInventory;
            o.fetchTags = fetchTags;
            o.metricsPollingInterval = metricsPollingInterval;
            o.tagKey = tagKey;
            o.tagValue = tagValue;
            return o;
        }
    }
}
