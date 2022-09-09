// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.MonitorScriptLocationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorScriptState extends com.pulumi.resources.ResourceArgs {

    public static final MonitorScriptState Empty = new MonitorScriptState();

    /**
     * A nested block that describes a monitor script location. See Nested location blocks below for details
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<MonitorScriptLocationArgs>> locations;

    /**
     * @return A nested block that describes a monitor script location. See Nested location blocks below for details
     * 
     */
    public Optional<Output<List<MonitorScriptLocationArgs>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * The ID of the monitor to attach the script to.
     * 
     */
    @Import(name="monitorId")
    private @Nullable Output<String> monitorId;

    /**
     * @return The ID of the monitor to attach the script to.
     * 
     */
    public Optional<Output<String>> monitorId() {
        return Optional.ofNullable(this.monitorId);
    }

    /**
     * The plaintext representing the monitor script.
     * 
     */
    @Import(name="text")
    private @Nullable Output<String> text;

    /**
     * @return The plaintext representing the monitor script.
     * 
     */
    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    private MonitorScriptState() {}

    private MonitorScriptState(MonitorScriptState $) {
        this.locations = $.locations;
        this.monitorId = $.monitorId;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorScriptState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorScriptState $;

        public Builder() {
            $ = new MonitorScriptState();
        }

        public Builder(MonitorScriptState defaults) {
            $ = new MonitorScriptState(Objects.requireNonNull(defaults));
        }

        /**
         * @param locations A nested block that describes a monitor script location. See Nested location blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<MonitorScriptLocationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations A nested block that describes a monitor script location. See Nested location blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder locations(List<MonitorScriptLocationArgs> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations A nested block that describes a monitor script location. See Nested location blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder locations(MonitorScriptLocationArgs... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param monitorId The ID of the monitor to attach the script to.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(@Nullable Output<String> monitorId) {
            $.monitorId = monitorId;
            return this;
        }

        /**
         * @param monitorId The ID of the monitor to attach the script to.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(String monitorId) {
            return monitorId(Output.of(monitorId));
        }

        /**
         * @param text The plaintext representing the monitor script.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The plaintext representing the monitor script.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public MonitorScriptState build() {
            return $;
        }
    }

}