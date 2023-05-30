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


public final class AwsIntegrationsKinesisArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsKinesisArgs Empty = new AwsIntegrationsKinesisArgs();

    /**
     * Specify each AWS region that includes the resources that you want to monitor.
     * &lt;/details&gt;
     * 
     */
    @Import(name="awsRegions")
    private @Nullable Output<List<String>> awsRegions;

    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * &lt;/details&gt;
     * 
     */
    public Optional<Output<List<String>>> awsRegions() {
        return Optional.ofNullable(this.awsRegions);
    }

    /**
     * Specify if Shards should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    @Import(name="fetchShards")
    private @Nullable Output<Boolean> fetchShards;

    /**
     * @return Specify if Shards should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Output<Boolean>> fetchShards() {
        return Optional.ofNullable(this.fetchShards);
    }

    /**
     * Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    @Import(name="fetchTags")
    private @Nullable Output<Boolean> fetchTags;

    /**
     * @return Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Output<Boolean>> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }

    /**
     * The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. To delve deeper into the list of arguments, click here. &lt;/summary&gt;
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. To delve deeper into the list of arguments, click here. &lt;/summary&gt;
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    /**
     * Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    /**
     * @return Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    /**
     * Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private AwsIntegrationsKinesisArgs() {}

    private AwsIntegrationsKinesisArgs(AwsIntegrationsKinesisArgs $) {
        this.awsRegions = $.awsRegions;
        this.fetchShards = $.fetchShards;
        this.fetchTags = $.fetchTags;
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsKinesisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsKinesisArgs $;

        public Builder() {
            $ = new AwsIntegrationsKinesisArgs();
        }

        public Builder(AwsIntegrationsKinesisArgs defaults) {
            $ = new AwsIntegrationsKinesisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRegions Specify each AWS region that includes the resources that you want to monitor.
         * &lt;/details&gt;
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
         * &lt;/details&gt;
         * 
         * @return builder
         * 
         */
        public Builder awsRegions(List<String> awsRegions) {
            return awsRegions(Output.of(awsRegions));
        }

        /**
         * @param awsRegions Specify each AWS region that includes the resources that you want to monitor.
         * &lt;/details&gt;
         * 
         * @return builder
         * 
         */
        public Builder awsRegions(String... awsRegions) {
            return awsRegions(List.of(awsRegions));
        }

        /**
         * @param fetchShards Specify if Shards should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchShards(@Nullable Output<Boolean> fetchShards) {
            $.fetchShards = fetchShards;
            return this;
        }

        /**
         * @param fetchShards Specify if Shards should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchShards(Boolean fetchShards) {
            return fetchShards(Output.of(fetchShards));
        }

        /**
         * @param fetchTags Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchTags(@Nullable Output<Boolean> fetchTags) {
            $.fetchTags = fetchTags;
            return this;
        }

        /**
         * @param fetchTags Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
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
         * &lt;details&gt;
         * &lt;summary&gt; Some integration types support an additional set of arguments. To delve deeper into the list of arguments, click here. &lt;/summary&gt;
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
         * &lt;details&gt;
         * &lt;summary&gt; Some integration types support an additional set of arguments. To delve deeper into the list of arguments, click here. &lt;/summary&gt;
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        /**
         * @param tagKey Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param tagValue Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public AwsIntegrationsKinesisArgs build() {
            return $;
        }
    }

}
