// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.StepMonitorLocationPrivateArgs;
import com.pulumi.newrelic.synthetics.inputs.StepMonitorStepArgs;
import com.pulumi.newrelic.synthetics.inputs.StepMonitorTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StepMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final StepMonitorState Empty = new StepMonitorState();

    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Capture a screenshot during job execution.
     * 
     */
    @Import(name="enableScreenshotOnFailureAndScript")
    private @Nullable Output<Boolean> enableScreenshotOnFailureAndScript;

    /**
     * @return Capture a screenshot during job execution.
     * 
     */
    public Optional<Output<Boolean>> enableScreenshotOnFailureAndScript() {
        return Optional.ofNullable(this.enableScreenshotOnFailureAndScript);
    }

    /**
     * The unique entity identifier of the monitor in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the monitor in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    @Import(name="locationPrivates")
    private @Nullable Output<List<StepMonitorLocationPrivateArgs>> locationPrivates;

    /**
     * @return The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
     * 
     */
    public Optional<Output<List<StepMonitorLocationPrivateArgs>>> locationPrivates() {
        return Optional.ofNullable(this.locationPrivates);
    }

    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Import(name="locationsPublics")
    private @Nullable Output<List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Optional<Output<List<String>>> locationsPublics() {
        return Optional.ofNullable(this.locationsPublics);
    }

    /**
     * The name for the monitor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the monitor.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The interval in minutes at which Synthetic monitor should run.
     * 
     */
    @Import(name="periodInMinutes")
    private @Nullable Output<Integer> periodInMinutes;

    /**
     * @return The interval in minutes at which Synthetic monitor should run.
     * 
     */
    public Optional<Output<Integer>> periodInMinutes() {
        return Optional.ofNullable(this.periodInMinutes);
    }

    /**
     * The runtime that the monitor will use to run jobs.
     * 
     */
    @Import(name="runtimeType")
    private @Nullable Output<String> runtimeType;

    /**
     * @return The runtime that the monitor will use to run jobs.
     * 
     */
    public Optional<Output<String>> runtimeType() {
        return Optional.ofNullable(this.runtimeType);
    }

    /**
     * The specific semver version of the runtime type.
     * 
     */
    @Import(name="runtimeTypeVersion")
    private @Nullable Output<String> runtimeTypeVersion;

    /**
     * @return The specific semver version of the runtime type.
     * 
     */
    public Optional<Output<String>> runtimeTypeVersion() {
        return Optional.ofNullable(this.runtimeTypeVersion);
    }

    /**
     * The monitor status (ENABLED or DISABLED).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The monitor status (ENABLED or DISABLED).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     * 
     */
    @Import(name="steps")
    private @Nullable Output<List<StepMonitorStepArgs>> steps;

    /**
     * @return The steps that make up the script the monitor will run. See Nested steps blocks below for details.
     * 
     */
    public Optional<Output<List<StepMonitorStepArgs>>> steps() {
        return Optional.ofNullable(this.steps);
    }

    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StepMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    public Optional<Output<List<StepMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StepMonitorState() {}

    private StepMonitorState(StepMonitorState $) {
        this.accountId = $.accountId;
        this.enableScreenshotOnFailureAndScript = $.enableScreenshotOnFailureAndScript;
        this.guid = $.guid;
        this.locationPrivates = $.locationPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.periodInMinutes = $.periodInMinutes;
        this.runtimeType = $.runtimeType;
        this.runtimeTypeVersion = $.runtimeTypeVersion;
        this.status = $.status;
        this.steps = $.steps;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StepMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StepMonitorState $;

        public Builder() {
            $ = new StepMonitorState();
        }

        public Builder(StepMonitorState defaults) {
            $ = new StepMonitorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param enableScreenshotOnFailureAndScript Capture a screenshot during job execution.
         * 
         * @return builder
         * 
         */
        public Builder enableScreenshotOnFailureAndScript(@Nullable Output<Boolean> enableScreenshotOnFailureAndScript) {
            $.enableScreenshotOnFailureAndScript = enableScreenshotOnFailureAndScript;
            return this;
        }

        /**
         * @param enableScreenshotOnFailureAndScript Capture a screenshot during job execution.
         * 
         * @return builder
         * 
         */
        public Builder enableScreenshotOnFailureAndScript(Boolean enableScreenshotOnFailureAndScript) {
            return enableScreenshotOnFailureAndScript(Output.of(enableScreenshotOnFailureAndScript));
        }

        /**
         * @param guid The unique entity identifier of the monitor in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the monitor in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param locationPrivates The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(@Nullable Output<List<StepMonitorLocationPrivateArgs>> locationPrivates) {
            $.locationPrivates = locationPrivates;
            return this;
        }

        /**
         * @param locationPrivates The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(List<StepMonitorLocationPrivateArgs> locationPrivates) {
            return locationPrivates(Output.of(locationPrivates));
        }

        /**
         * @param locationPrivates The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(StepMonitorLocationPrivateArgs... locationPrivates) {
            return locationPrivates(List.of(locationPrivates));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(@Nullable Output<List<String>> locationsPublics) {
            $.locationsPublics = locationsPublics;
            return this;
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(List<String> locationsPublics) {
            return locationsPublics(Output.of(locationsPublics));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(String... locationsPublics) {
            return locationsPublics(List.of(locationsPublics));
        }

        /**
         * @param name The name for the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param periodInMinutes The interval in minutes at which Synthetic monitor should run.
         * 
         * @return builder
         * 
         */
        public Builder periodInMinutes(@Nullable Output<Integer> periodInMinutes) {
            $.periodInMinutes = periodInMinutes;
            return this;
        }

        /**
         * @param periodInMinutes The interval in minutes at which Synthetic monitor should run.
         * 
         * @return builder
         * 
         */
        public Builder periodInMinutes(Integer periodInMinutes) {
            return periodInMinutes(Output.of(periodInMinutes));
        }

        /**
         * @param runtimeType The runtime that the monitor will use to run jobs.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType The runtime that the monitor will use to run jobs.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(String runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param runtimeTypeVersion The specific semver version of the runtime type.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(@Nullable Output<String> runtimeTypeVersion) {
            $.runtimeTypeVersion = runtimeTypeVersion;
            return this;
        }

        /**
         * @param runtimeTypeVersion The specific semver version of the runtime type.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(String runtimeTypeVersion) {
            return runtimeTypeVersion(Output.of(runtimeTypeVersion));
        }

        /**
         * @param status The monitor status (ENABLED or DISABLED).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The monitor status (ENABLED or DISABLED).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param steps The steps that make up the script the monitor will run. See Nested steps blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder steps(@Nullable Output<List<StepMonitorStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps The steps that make up the script the monitor will run. See Nested steps blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<StepMonitorStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps The steps that make up the script the monitor will run. See Nested steps blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder steps(StepMonitorStepArgs... steps) {
            return steps(List.of(steps));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<StepMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<StepMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(StepMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public StepMonitorState build() {
            return $;
        }
    }

}
