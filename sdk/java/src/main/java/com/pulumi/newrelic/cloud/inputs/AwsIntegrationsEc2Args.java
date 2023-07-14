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


public final class AwsIntegrationsEc2Args extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsEc2Args Empty = new AwsIntegrationsEc2Args();

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
     * Specify if the old legacy metadata and tag names have to be kept, it will consume more ingest data size.
     * 
     */
    @Import(name="duplicateEc2Tags")
    private @Nullable Output<Boolean> duplicateEc2Tags;

    /**
     * @return Specify if the old legacy metadata and tag names have to be kept, it will consume more ingest data size.
     * 
     */
    public Optional<Output<Boolean>> duplicateEc2Tags() {
        return Optional.ofNullable(this.duplicateEc2Tags);
    }

    /**
     * Specify if IP addresses of ec2 instance should be collected.
     * 
     */
    @Import(name="fetchIpAddresses")
    private @Nullable Output<Boolean> fetchIpAddresses;

    /**
     * @return Specify if IP addresses of ec2 instance should be collected.
     * 
     */
    public Optional<Output<Boolean>> fetchIpAddresses() {
        return Optional.ofNullable(this.fetchIpAddresses);
    }

    /**
     * The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     * &lt;details&gt;
     * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
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

    private AwsIntegrationsEc2Args() {}

    private AwsIntegrationsEc2Args(AwsIntegrationsEc2Args $) {
        this.awsRegions = $.awsRegions;
        this.duplicateEc2Tags = $.duplicateEc2Tags;
        this.fetchIpAddresses = $.fetchIpAddresses;
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsEc2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsEc2Args $;

        public Builder() {
            $ = new AwsIntegrationsEc2Args();
        }

        public Builder(AwsIntegrationsEc2Args defaults) {
            $ = new AwsIntegrationsEc2Args(Objects.requireNonNull(defaults));
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
         * @param duplicateEc2Tags Specify if the old legacy metadata and tag names have to be kept, it will consume more ingest data size.
         * 
         * @return builder
         * 
         */
        public Builder duplicateEc2Tags(@Nullable Output<Boolean> duplicateEc2Tags) {
            $.duplicateEc2Tags = duplicateEc2Tags;
            return this;
        }

        /**
         * @param duplicateEc2Tags Specify if the old legacy metadata and tag names have to be kept, it will consume more ingest data size.
         * 
         * @return builder
         * 
         */
        public Builder duplicateEc2Tags(Boolean duplicateEc2Tags) {
            return duplicateEc2Tags(Output.of(duplicateEc2Tags));
        }

        /**
         * @param fetchIpAddresses Specify if IP addresses of ec2 instance should be collected.
         * 
         * @return builder
         * 
         */
        public Builder fetchIpAddresses(@Nullable Output<Boolean> fetchIpAddresses) {
            $.fetchIpAddresses = fetchIpAddresses;
            return this;
        }

        /**
         * @param fetchIpAddresses Specify if IP addresses of ec2 instance should be collected.
         * 
         * @return builder
         * 
         */
        public Builder fetchIpAddresses(Boolean fetchIpAddresses) {
            return fetchIpAddresses(Output.of(fetchIpAddresses));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * &lt;details&gt;
         * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
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
         * &lt;summary&gt; Some integration types support an additional set of arguments. Expand this section to take a look at these supported arguments. &lt;/summary&gt;
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

        public AwsIntegrationsEc2Args build() {
            return $;
        }
    }

}