// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpIntegrationsPubSubArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpIntegrationsPubSubArgs Empty = new GcpIntegrationsPubSubArgs();

    /**
     * Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    @Import(name="fetchTags")
    private @Nullable Output<Boolean> fetchTags;

    /**
     * @return Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Output<Boolean>> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }

    /**
     * The data polling interval in seconds.
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    private GcpIntegrationsPubSubArgs() {}

    private GcpIntegrationsPubSubArgs(GcpIntegrationsPubSubArgs $) {
        this.fetchTags = $.fetchTags;
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpIntegrationsPubSubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpIntegrationsPubSubArgs $;

        public Builder() {
            $ = new GcpIntegrationsPubSubArgs();
        }

        public Builder(GcpIntegrationsPubSubArgs defaults) {
            $ = new GcpIntegrationsPubSubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchTags Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchTags(@Nullable Output<Boolean> fetchTags) {
            $.fetchTags = fetchTags;
            return this;
        }

        /**
         * @param fetchTags Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchTags(Boolean fetchTags) {
            return fetchTags(Output.of(fetchTags));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(@Nullable Output<Integer> metricsPollingInterval) {
            $.metricsPollingInterval = metricsPollingInterval;
            return this;
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        public GcpIntegrationsPubSubArgs build() {
            return $;
        }
    }

}
