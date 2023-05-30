// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsIntegrationsCloudfrontArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsCloudfrontArgs Empty = new AwsIntegrationsCloudfrontArgs();

    /**
     * Specify if Lambdas@Edge should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    @Import(name="fetchLambdasAtEdge")
    private @Nullable Output<Boolean> fetchLambdasAtEdge;

    /**
     * @return Specify if Lambdas@Edge should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Output<Boolean>> fetchLambdasAtEdge() {
        return Optional.ofNullable(this.fetchLambdasAtEdge);
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

    private AwsIntegrationsCloudfrontArgs() {}

    private AwsIntegrationsCloudfrontArgs(AwsIntegrationsCloudfrontArgs $) {
        this.fetchLambdasAtEdge = $.fetchLambdasAtEdge;
        this.fetchTags = $.fetchTags;
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsCloudfrontArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsCloudfrontArgs $;

        public Builder() {
            $ = new AwsIntegrationsCloudfrontArgs();
        }

        public Builder(AwsIntegrationsCloudfrontArgs defaults) {
            $ = new AwsIntegrationsCloudfrontArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchLambdasAtEdge Specify if Lambdas@Edge should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchLambdasAtEdge(@Nullable Output<Boolean> fetchLambdasAtEdge) {
            $.fetchLambdasAtEdge = fetchLambdasAtEdge;
            return this;
        }

        /**
         * @param fetchLambdasAtEdge Specify if Lambdas@Edge should be monitored. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * @return builder
         * 
         */
        public Builder fetchLambdasAtEdge(Boolean fetchLambdasAtEdge) {
            return fetchLambdasAtEdge(Output.of(fetchLambdasAtEdge));
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

        public AwsIntegrationsCloudfrontArgs build() {
            return $;
        }
    }

}
