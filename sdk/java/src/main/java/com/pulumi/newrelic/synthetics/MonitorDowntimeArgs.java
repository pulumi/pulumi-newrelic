// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeEndRepeatArgs;
import com.pulumi.newrelic.synthetics.inputs.MonitorDowntimeFrequencyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorDowntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorDowntimeArgs Empty = new MonitorDowntimeArgs();

    /**
     * The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
     * provider{} configuration if not specified.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
     * provider{} configuration if not specified.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
     * 
     */
    @Import(name="endRepeat")
    private @Nullable Output<MonitorDowntimeEndRepeatArgs> endRepeat;

    /**
     * @return A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
     * 
     */
    public Optional<Output<MonitorDowntimeEndRepeatArgs>> endRepeat() {
        return Optional.ofNullable(this.endRepeat);
    }

    /**
     * A datetime stamp signifying the end of the Monitor Downtime.
     * 
     */
    @Import(name="endTime", required=true)
    private Output<String> endTime;

    /**
     * @return A datetime stamp signifying the end of the Monitor Downtime.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }

    /**
     * Configuration options for which days of the month a monitor downtime will occur
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<MonitorDowntimeFrequencyArgs> frequency;

    /**
     * @return Configuration options for which days of the month a monitor downtime will occur
     * 
     */
    public Optional<Output<MonitorDowntimeFrequencyArgs>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * A list of maintenance days to be included with the created weekly Monitor Downtime.
     * 
     */
    @Import(name="maintenanceDays")
    private @Nullable Output<List<String>> maintenanceDays;

    /**
     * @return A list of maintenance days to be included with the created weekly Monitor Downtime.
     * 
     */
    public Optional<Output<List<String>>> maintenanceDays() {
        return Optional.ofNullable(this.maintenanceDays);
    }

    /**
     * An identifier of the type of Monitor Downtime to be created.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return An identifier of the type of Monitor Downtime to be created.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
     * 
     */
    @Import(name="monitorGuids")
    private @Nullable Output<List<String>> monitorGuids;

    /**
     * @return A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
     * 
     */
    public Optional<Output<List<String>>> monitorGuids() {
        return Optional.ofNullable(this.monitorGuids);
    }

    /**
     * A name to identify the Monitor Downtime to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name to identify the Monitor Downtime to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A datetime stamp signifying the start of the Monitor Downtime.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    /**
     * @return A datetime stamp signifying the start of the Monitor Downtime.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    /**
     * The timezone that applies to the Monitor Downtime schedule.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return The timezone that applies to the Monitor Downtime schedule.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private MonitorDowntimeArgs() {}

    private MonitorDowntimeArgs(MonitorDowntimeArgs $) {
        this.accountId = $.accountId;
        this.endRepeat = $.endRepeat;
        this.endTime = $.endTime;
        this.frequency = $.frequency;
        this.maintenanceDays = $.maintenanceDays;
        this.mode = $.mode;
        this.monitorGuids = $.monitorGuids;
        this.name = $.name;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorDowntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorDowntimeArgs $;

        public Builder() {
            $ = new MonitorDowntimeArgs();
        }

        public Builder(MonitorDowntimeArgs defaults) {
            $ = new MonitorDowntimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
         * provider{} configuration if not specified.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the New Relic account in which the Monitor Downtime shall be created. Defaults to the `account_id` in the
         * provider{} configuration if not specified.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param endRepeat A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
         * 
         * @return builder
         * 
         */
        public Builder endRepeat(@Nullable Output<MonitorDowntimeEndRepeatArgs> endRepeat) {
            $.endRepeat = endRepeat;
            return this;
        }

        /**
         * @param endRepeat A specification of when the Monitor Downtime should end its repeat cycle, by number of occurrences or date.
         * 
         * @return builder
         * 
         */
        public Builder endRepeat(MonitorDowntimeEndRepeatArgs endRepeat) {
            return endRepeat(Output.of(endRepeat));
        }

        /**
         * @param endTime A datetime stamp signifying the end of the Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder endTime(Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime A datetime stamp signifying the end of the Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param frequency Configuration options for which days of the month a monitor downtime will occur
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<MonitorDowntimeFrequencyArgs> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Configuration options for which days of the month a monitor downtime will occur
         * 
         * @return builder
         * 
         */
        public Builder frequency(MonitorDowntimeFrequencyArgs frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param maintenanceDays A list of maintenance days to be included with the created weekly Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceDays(@Nullable Output<List<String>> maintenanceDays) {
            $.maintenanceDays = maintenanceDays;
            return this;
        }

        /**
         * @param maintenanceDays A list of maintenance days to be included with the created weekly Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceDays(List<String> maintenanceDays) {
            return maintenanceDays(Output.of(maintenanceDays));
        }

        /**
         * @param maintenanceDays A list of maintenance days to be included with the created weekly Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceDays(String... maintenanceDays) {
            return maintenanceDays(List.of(maintenanceDays));
        }

        /**
         * @param mode An identifier of the type of Monitor Downtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode An identifier of the type of Monitor Downtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param monitorGuids A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
         * 
         * @return builder
         * 
         */
        public Builder monitorGuids(@Nullable Output<List<String>> monitorGuids) {
            $.monitorGuids = monitorGuids;
            return this;
        }

        /**
         * @param monitorGuids A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
         * 
         * @return builder
         * 
         */
        public Builder monitorGuids(List<String> monitorGuids) {
            return monitorGuids(Output.of(monitorGuids));
        }

        /**
         * @param monitorGuids A list of GUIDs of monitors, to which the created Monitor Downtime shall be applied.
         * 
         * @return builder
         * 
         */
        public Builder monitorGuids(String... monitorGuids) {
            return monitorGuids(List.of(monitorGuids));
        }

        /**
         * @param name A name to identify the Monitor Downtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name to identify the Monitor Downtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param startTime A datetime stamp signifying the start of the Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime A datetime stamp signifying the start of the Monitor Downtime.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone The timezone that applies to the Monitor Downtime schedule.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The timezone that applies to the Monitor Downtime schedule.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public MonitorDowntimeArgs build() {
            if ($.endTime == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeArgs", "endTime");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeArgs", "mode");
            }
            if ($.startTime == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeArgs", "startTime");
            }
            if ($.timeZone == null) {
                throw new MissingRequiredPropertyException("MonitorDowntimeArgs", "timeZone");
            }
            return $;
        }
    }

}
