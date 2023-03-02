// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StepMonitorLocationPrivateArgs extends com.pulumi.resources.ResourceArgs {

    public static final StepMonitorLocationPrivateArgs Empty = new StepMonitorLocationPrivateArgs();

    /**
     * The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    @Import(name="guid", required=true)
    private Output<String> guid;

    /**
     * @return The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }

    /**
     * The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    @Import(name="vsePassword")
    private @Nullable Output<String> vsePassword;

    /**
     * @return The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    public Optional<Output<String>> vsePassword() {
        return Optional.ofNullable(this.vsePassword);
    }

    private StepMonitorLocationPrivateArgs() {}

    private StepMonitorLocationPrivateArgs(StepMonitorLocationPrivateArgs $) {
        this.guid = $.guid;
        this.vsePassword = $.vsePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StepMonitorLocationPrivateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StepMonitorLocationPrivateArgs $;

        public Builder() {
            $ = new StepMonitorLocationPrivateArgs();
        }

        public Builder(StepMonitorLocationPrivateArgs defaults) {
            $ = new StepMonitorLocationPrivateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param guid The unique identifier for the Synthetics private location in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique identifier for the Synthetics private location in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param vsePassword The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
         * 
         * @return builder
         * 
         */
        public Builder vsePassword(@Nullable Output<String> vsePassword) {
            $.vsePassword = vsePassword;
            return this;
        }

        /**
         * @param vsePassword The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
         * 
         * @return builder
         * 
         */
        public Builder vsePassword(String vsePassword) {
            return vsePassword(Output.of(vsePassword));
        }

        public StepMonitorLocationPrivateArgs build() {
            $.guid = Objects.requireNonNull($.guid, "expected parameter 'guid' to be non-null");
            return $;
        }
    }

}
