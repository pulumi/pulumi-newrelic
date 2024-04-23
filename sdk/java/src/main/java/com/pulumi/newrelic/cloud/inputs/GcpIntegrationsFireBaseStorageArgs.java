// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpIntegrationsFireBaseStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpIntegrationsFireBaseStorageArgs Empty = new GcpIntegrationsFireBaseStorageArgs();

    /**
     * the data polling interval in seconds
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return the data polling interval in seconds
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    private GcpIntegrationsFireBaseStorageArgs() {}

    private GcpIntegrationsFireBaseStorageArgs(GcpIntegrationsFireBaseStorageArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpIntegrationsFireBaseStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpIntegrationsFireBaseStorageArgs $;

        public Builder() {
            $ = new GcpIntegrationsFireBaseStorageArgs();
        }

        public Builder(GcpIntegrationsFireBaseStorageArgs defaults) {
            $ = new GcpIntegrationsFireBaseStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsPollingInterval the data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(@Nullable Output<Integer> metricsPollingInterval) {
            $.metricsPollingInterval = metricsPollingInterval;
            return this;
        }

        /**
         * @param metricsPollingInterval the data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        public GcpIntegrationsFireBaseStorageArgs build() {
            return $;
        }
    }

}
