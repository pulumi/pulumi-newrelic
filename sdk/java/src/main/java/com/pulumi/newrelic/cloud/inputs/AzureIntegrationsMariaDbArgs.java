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


public final class AzureIntegrationsMariaDbArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureIntegrationsMariaDbArgs Empty = new AzureIntegrationsMariaDbArgs();

    /**
     * The data polling interval in seconds
     * 
     */
    @Import(name="metricsPollingInterval")
    private @Nullable Output<Integer> metricsPollingInterval;

    /**
     * @return The data polling interval in seconds
     * 
     */
    public Optional<Output<Integer>> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    /**
     * Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
     * 
     */
    @Import(name="resourceGroups")
    private @Nullable Output<List<String>> resourceGroups;

    /**
     * @return Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
     * 
     */
    public Optional<Output<List<String>>> resourceGroups() {
        return Optional.ofNullable(this.resourceGroups);
    }

    private AzureIntegrationsMariaDbArgs() {}

    private AzureIntegrationsMariaDbArgs(AzureIntegrationsMariaDbArgs $) {
        this.metricsPollingInterval = $.metricsPollingInterval;
        this.resourceGroups = $.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureIntegrationsMariaDbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureIntegrationsMariaDbArgs $;

        public Builder() {
            $ = new AzureIntegrationsMariaDbArgs();
        }

        public Builder(AzureIntegrationsMariaDbArgs defaults) {
            $ = new AzureIntegrationsMariaDbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(@Nullable Output<Integer> metricsPollingInterval) {
            $.metricsPollingInterval = metricsPollingInterval;
            return this;
        }

        /**
         * @param metricsPollingInterval The data polling interval in seconds
         * 
         * @return builder
         * 
         */
        public Builder metricsPollingInterval(Integer metricsPollingInterval) {
            return metricsPollingInterval(Output.of(metricsPollingInterval));
        }

        /**
         * @param resourceGroups Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(@Nullable Output<List<String>> resourceGroups) {
            $.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * @param resourceGroups Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(List<String> resourceGroups) {
            return resourceGroups(Output.of(resourceGroups));
        }

        /**
         * @param resourceGroups Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(String... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }

        public AzureIntegrationsMariaDbArgs build() {
            return $;
        }
    }

}
