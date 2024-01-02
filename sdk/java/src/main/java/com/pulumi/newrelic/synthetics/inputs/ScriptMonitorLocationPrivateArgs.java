// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScriptMonitorLocationPrivateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptMonitorLocationPrivateArgs Empty = new ScriptMonitorLocationPrivateArgs();

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
     * The location&#39;s Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    @Import(name="vsePassword")
    private @Nullable Output<String> vsePassword;

    /**
     * @return The location&#39;s Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    public Optional<Output<String>> vsePassword() {
        return Optional.ofNullable(this.vsePassword);
    }

    private ScriptMonitorLocationPrivateArgs() {}

    private ScriptMonitorLocationPrivateArgs(ScriptMonitorLocationPrivateArgs $) {
        this.guid = $.guid;
        this.vsePassword = $.vsePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptMonitorLocationPrivateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptMonitorLocationPrivateArgs $;

        public Builder() {
            $ = new ScriptMonitorLocationPrivateArgs();
        }

        public Builder(ScriptMonitorLocationPrivateArgs defaults) {
            $ = new ScriptMonitorLocationPrivateArgs(Objects.requireNonNull(defaults));
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
         * @param vsePassword The location&#39;s Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
         * 
         * @return builder
         * 
         */
        public Builder vsePassword(@Nullable Output<String> vsePassword) {
            $.vsePassword = vsePassword;
            return this;
        }

        /**
         * @param vsePassword The location&#39;s Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
         * 
         * @return builder
         * 
         */
        public Builder vsePassword(String vsePassword) {
            return vsePassword(Output.of(vsePassword));
        }

        public ScriptMonitorLocationPrivateArgs build() {
            if ($.guid == null) {
                throw new MissingRequiredPropertyException("ScriptMonitorLocationPrivateArgs", "guid");
            }
            return $;
        }
    }

}
