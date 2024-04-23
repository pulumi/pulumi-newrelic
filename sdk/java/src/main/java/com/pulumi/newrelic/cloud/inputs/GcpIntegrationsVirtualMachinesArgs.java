// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpIntegrationsVirtualMachinesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpIntegrationsVirtualMachinesArgs Empty = new GcpIntegrationsVirtualMachinesArgs();

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

    private GcpIntegrationsVirtualMachinesArgs() {}

    private GcpIntegrationsVirtualMachinesArgs(GcpIntegrationsVirtualMachinesArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpIntegrationsVirtualMachinesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpIntegrationsVirtualMachinesArgs $;

        public Builder() {
            $ = new GcpIntegrationsVirtualMachinesArgs();
        }

        public Builder(GcpIntegrationsVirtualMachinesArgs defaults) {
            $ = new GcpIntegrationsVirtualMachinesArgs(Objects.requireNonNull(defaults));
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

        public GcpIntegrationsVirtualMachinesArgs build() {
            return $;
        }
    }

}
