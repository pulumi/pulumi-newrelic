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


public final class AwsGovcloudIntegrationsElasticSearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsGovcloudIntegrationsElasticSearchArgs Empty = new AwsGovcloudIntegrationsElasticSearchArgs();

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

    /**
     * Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
     * 
     */
    @Import(name="fetchNodes")
    private @Nullable Output<Boolean> fetchNodes;

    /**
     * @return Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
     * 
     */
    public Optional<Output<Boolean>> fetchNodes() {
        return Optional.ofNullable(this.fetchNodes);
    }

    /**
     * The data polling interval in seconds.
     * 
     * Some integration types support an additional set of arguments:
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     * Some integration types support an additional set of arguments:
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

    private AwsGovcloudIntegrationsElasticSearchArgs() {}

    private AwsGovcloudIntegrationsElasticSearchArgs(AwsGovcloudIntegrationsElasticSearchArgs $) {
        this.awsRegions = $.awsRegions;
        this.fetchNodes = $.fetchNodes;
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsGovcloudIntegrationsElasticSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsGovcloudIntegrationsElasticSearchArgs $;

        public Builder() {
            $ = new AwsGovcloudIntegrationsElasticSearchArgs();
        }

        public Builder(AwsGovcloudIntegrationsElasticSearchArgs defaults) {
            $ = new AwsGovcloudIntegrationsElasticSearchArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param fetchNodes Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
         * 
         * @return builder
         * 
         */
        public Builder fetchNodes(@Nullable Output<Boolean> fetchNodes) {
            $.fetchNodes = fetchNodes;
            return this;
        }

        /**
         * @param fetchNodes Specify if metrics should be collected for nodes. Turning it on will increase the number of API calls made to CloudWatch.
         * 
         * @return builder
         * 
         */
        public Builder fetchNodes(Boolean fetchNodes) {
            return fetchNodes(Output.of(fetchNodes));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * Some integration types support an additional set of arguments:
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
         * Some integration types support an additional set of arguments:
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

        public AwsGovcloudIntegrationsElasticSearchArgs build() {
            return $;
        }
    }

}
