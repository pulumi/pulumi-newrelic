// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsIntegrationsSqsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsSqsArgs Empty = new AwsIntegrationsSqsArgs();

    /**
     * Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    @Import(name="awsRegions")
    private @Nullable Output<List<String>> awsRegions;

    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * 
     */
    public Optional<Output<List<String>>> awsRegions() {
        return Optional.ofNullable(this.awsRegions);
    }

    @Import(name="fetchExtendedInventory")
    private @Nullable Output<Boolean> fetchExtendedInventory;

    public Optional<Output<Boolean>> fetchExtendedInventory() {
        return Optional.ofNullable(this.fetchExtendedInventory);
    }

    @Import(name="fetchTags")
    private @Nullable Output<Boolean> fetchTags;

    public Optional<Output<Boolean>> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }

    /**
     * The data polling interval in seconds.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    @Import(name="queuePrefixes")
    private @Nullable Output<List<String>> queuePrefixes;

    public Optional<Output<List<String>>> queuePrefixes() {
        return Optional.ofNullable(this.queuePrefixes);
    }

    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private AwsIntegrationsSqsArgs() {}

    private AwsIntegrationsSqsArgs(AwsIntegrationsSqsArgs $) {
        this.awsRegions = $.awsRegions;
        this.fetchExtendedInventory = $.fetchExtendedInventory;
        this.fetchTags = $.fetchTags;
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.queuePrefixes = $.queuePrefixes;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsSqsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsSqsArgs $;

        public Builder() {
            $ = new AwsIntegrationsSqsArgs();
        }

        public Builder(AwsIntegrationsSqsArgs defaults) {
            $ = new AwsIntegrationsSqsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRegions Specify each AWS region that includes the resources that you want to monitor.
         * 
         * @return builder
         * 
         */
        public Builder awsRegions(@Nullable Output<List<String>> awsRegions) {
            $.awsRegions = awsRegions;
            return this;
        }

        /**
         * @param awsRegions Specify each AWS region that includes the resources that you want to monitor.
         * 
         * @return builder
         * 
         */
        public Builder awsRegions(List<String> awsRegions) {
            return awsRegions(Output.of(awsRegions));
        }

        /**
         * @param awsRegions Specify each AWS region that includes the resources that you want to monitor.
         * 
         * @return builder
         * 
         */
        public Builder awsRegions(String... awsRegions) {
            return awsRegions(List.of(awsRegions));
        }

        public Builder fetchExtendedInventory(@Nullable Output<Boolean> fetchExtendedInventory) {
            $.fetchExtendedInventory = fetchExtendedInventory;
            return this;
        }

        public Builder fetchExtendedInventory(Boolean fetchExtendedInventory) {
            return fetchExtendedInventory(Output.of(fetchExtendedInventory));
        }

        public Builder fetchTags(@Nullable Output<Boolean> fetchTags) {
            $.fetchTags = fetchTags;
            return this;
        }

        public Builder fetchTags(Boolean fetchTags) {
            return fetchTags(Output.of(fetchTags));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * Furthermore, below integration types supports the following common arguments.
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
         * Furthermore, below integration types supports the following common arguments.
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        public Builder queuePrefixes(@Nullable Output<List<String>> queuePrefixes) {
            $.queuePrefixes = queuePrefixes;
            return this;
        }

        public Builder queuePrefixes(List<String> queuePrefixes) {
            return queuePrefixes(Output.of(queuePrefixes));
        }

        public Builder queuePrefixes(String... queuePrefixes) {
            return queuePrefixes(List.of(queuePrefixes));
        }

        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public AwsIntegrationsSqsArgs build() {
            return $;
        }
    }

}
