// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpIntegrationsVpcAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpIntegrationsVpcAccessArgs Empty = new GcpIntegrationsVpcAccessArgs();

    /**
     * The data polling interval in seconds.
     * 
     * Other integration supports an additional argument:
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds.
     * 
     * Other integration supports an additional argument:
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    private GcpIntegrationsVpcAccessArgs() {}

    private GcpIntegrationsVpcAccessArgs(GcpIntegrationsVpcAccessArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpIntegrationsVpcAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpIntegrationsVpcAccessArgs $;

        public Builder() {
            $ = new GcpIntegrationsVpcAccessArgs();
        }

        public Builder(GcpIntegrationsVpcAccessArgs defaults) {
            $ = new GcpIntegrationsVpcAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds.
         * 
         * Other integration supports an additional argument:
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
         * Other integration supports an additional argument:
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        public GcpIntegrationsVpcAccessArgs build() {
            return $;
        }
    }

}
