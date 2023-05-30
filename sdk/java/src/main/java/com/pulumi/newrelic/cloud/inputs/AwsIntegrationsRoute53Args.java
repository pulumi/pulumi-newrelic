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


public final class AwsIntegrationsRoute53Args extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsRoute53Args Empty = new AwsIntegrationsRoute53Args();

    /**
     * Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    @Import(name="fetchExtendedInventory")
    private @Nullable Output<Boolean> fetchExtendedInventory;

    /**
     * @return Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     * Furthermore, below integration types supports the following common arguments.
     * 
     */
    public Optional<Output<Boolean>> fetchExtendedInventory() {
        return Optional.ofNullable(this.fetchExtendedInventory);
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

    private AwsIntegrationsRoute53Args() {}

    private AwsIntegrationsRoute53Args(AwsIntegrationsRoute53Args $) {
        this.fetchExtendedInventory = $.fetchExtendedInventory;
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsRoute53Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsRoute53Args $;

        public Builder() {
            $ = new AwsIntegrationsRoute53Args();
        }

        public Builder(AwsIntegrationsRoute53Args defaults) {
            $ = new AwsIntegrationsRoute53Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchExtendedInventory Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * Furthermore, below integration types supports the following common arguments.
         * 
         * @return builder
         * 
         */
        public Builder fetchExtendedInventory(@Nullable Output<Boolean> fetchExtendedInventory) {
            $.fetchExtendedInventory = fetchExtendedInventory;
            return this;
        }

        /**
         * @param fetchExtendedInventory Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
         * 
         * Furthermore, below integration types supports the following common arguments.
         * 
         * @return builder
         * 
         */
        public Builder fetchExtendedInventory(Boolean fetchExtendedInventory) {
            return fetchExtendedInventory(Output.of(fetchExtendedInventory));
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

        public AwsIntegrationsRoute53Args build() {
            return $;
        }
    }

}
