// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsIntegrationsHealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsIntegrationsHealthArgs Empty = new AwsIntegrationsHealthArgs();

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

    private AwsIntegrationsHealthArgs() {}

    private AwsIntegrationsHealthArgs(AwsIntegrationsHealthArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsIntegrationsHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsIntegrationsHealthArgs $;

        public Builder() {
            $ = new AwsIntegrationsHealthArgs();
        }

        public Builder(AwsIntegrationsHealthArgs defaults) {
            $ = new AwsIntegrationsHealthArgs(Objects.requireNonNull(defaults));
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

        public AwsIntegrationsHealthArgs build() {
            return $;
        }
    }

}
