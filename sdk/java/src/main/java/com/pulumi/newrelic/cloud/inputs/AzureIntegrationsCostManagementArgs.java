// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureIntegrationsCostManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureIntegrationsCostManagementArgs Empty = new AzureIntegrationsCostManagementArgs();

    /**
     * The data polling interval in seconds
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    /**
     * Specify if additional cost data per tag should be collected. This field is case sensitive.
     * 
     */
    @Import(name="tagKeys")
    private @Nullable Output<List<String>> tagKeys;

    /**
     * @return Specify if additional cost data per tag should be collected. This field is case sensitive.
     * 
     */
    public Optional<Output<List<String>>> tagKeys() {
        return Optional.ofNullable(this.tagKeys);
    }

    private AzureIntegrationsCostManagementArgs() {}

    private AzureIntegrationsCostManagementArgs(AzureIntegrationsCostManagementArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.tagKeys = $.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureIntegrationsCostManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureIntegrationsCostManagementArgs $;

        public Builder() {
            $ = new AzureIntegrationsCostManagementArgs();
        }

        public Builder(AzureIntegrationsCostManagementArgs defaults) {
            $ = new AzureIntegrationsCostManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(@Nullable Output<Integer> metricsPollingInterval) {
            $.metricsPollingInterval = metricsPollingInterval;
            return this;
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        /**
         * @param tagKeys Specify if additional cost data per tag should be collected. This field is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagKeys(@Nullable Output<List<String>> tagKeys) {
            $.tagKeys = tagKeys;
            return this;
        }

        /**
         * @param tagKeys Specify if additional cost data per tag should be collected. This field is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagKeys(List<String> tagKeys) {
            return tagKeys(Output.of(tagKeys));
        }

        /**
         * @param tagKeys Specify if additional cost data per tag should be collected. This field is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagKeys(String... tagKeys) {
            return tagKeys(List.of(tagKeys));
        }

        public AzureIntegrationsCostManagementArgs build() {
            return $;
        }
    }

}
