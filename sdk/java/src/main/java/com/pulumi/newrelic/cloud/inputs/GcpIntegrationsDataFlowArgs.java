// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpIntegrationsDataFlowArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpIntegrationsDataFlowArgs Empty = new GcpIntegrationsDataFlowArgs();

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

    private GcpIntegrationsDataFlowArgs() {}

    private GcpIntegrationsDataFlowArgs(GcpIntegrationsDataFlowArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpIntegrationsDataFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpIntegrationsDataFlowArgs $;

        public Builder() {
            $ = new GcpIntegrationsDataFlowArgs();
        }

        public Builder(GcpIntegrationsDataFlowArgs defaults) {
            $ = new GcpIntegrationsDataFlowArgs(Objects.requireNonNull(defaults));
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

        public GcpIntegrationsDataFlowArgs build() {
            return $;
        }
    }

}
