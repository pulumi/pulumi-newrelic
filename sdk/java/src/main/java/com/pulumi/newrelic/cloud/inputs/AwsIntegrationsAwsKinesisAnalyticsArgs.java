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


public final class AwsIntegrationsAwsKinesisAnalyticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsAwsKinesisAnalyticsArgs Empty = new AwsIntegrationsAwsKinesisAnalyticsArgs();

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

    private AwsIntegrationsAwsKinesisAnalyticsArgs() {}

    private AwsIntegrationsAwsKinesisAnalyticsArgs(AwsIntegrationsAwsKinesisAnalyticsArgs $) {
        this.awsRegions = $.awsRegions;
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsAwsKinesisAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsAwsKinesisAnalyticsArgs $;

        public Builder() {
            $ = new AwsIntegrationsAwsKinesisAnalyticsArgs();
        }

        public Builder(AwsIntegrationsAwsKinesisAnalyticsArgs defaults) {
            $ = new AwsIntegrationsAwsKinesisAnalyticsArgs(Objects.requireNonNull(defaults));
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

        public AwsIntegrationsAwsKinesisAnalyticsArgs build() {
            return $;
        }
    }

}
