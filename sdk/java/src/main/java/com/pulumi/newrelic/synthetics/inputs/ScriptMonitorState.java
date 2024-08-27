// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorLocationPrivateArgs;
import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScriptMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final ScriptMonitorState Empty = new ScriptMonitorState();

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
     * Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     * 
     */
    @Import(name="deviceOrientation")
    private @Nullable Output<String> deviceOrientation;

    /**
     * @return Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
     * 
     */
    public Optional<Output<String>> deviceOrientation() {
        return Optional.ofNullable(this.deviceOrientation);
    }

    /**
     * Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     * 
     */
    @Import(name="deviceType")
    private @Nullable Output<String> deviceType;

    /**
     * @return Device emulation type field. Valid values are `MOBILE` and `TABLET`.
     * 
     */
    public Optional<Output<String>> deviceType() {
        return Optional.ofNullable(this.deviceType);
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
     * The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
     * 
     */
    @Import(name="locationPrivates")
    private @Nullable Output<List<ScriptMonitorLocationPrivateArgs>> locationPrivates;

    /**
     * @return The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
     * 
     */
    public Optional<Output<List<ScriptMonitorLocationPrivateArgs>>> locationPrivates() {
        return Optional.ofNullable(this.locationPrivates);
    }

    /**
     * The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
     * 
     */
    @Import(name="locationsPublics")
    private @Nullable Output<List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
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
     * The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
     * 
     */
    @Import(name="runtimeType")
    private @Nullable Output<String> runtimeType;

    /**
     * @return The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
     * 
     */
    public Optional<Output<String>> runtimeType() {
        return Optional.ofNullable(this.runtimeType);
    }

    /**
     * The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
     * 
     */
    @Import(name="runtimeTypeVersion")
    private @Nullable Output<String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
     * 
     */
    public Optional<Output<String>> runtimeTypeVersion() {
        return Optional.ofNullable(this.runtimeTypeVersion);
    }

    /**
     * The script that the monitor runs.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The script that the monitor runs.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * The programing language that should execute the script.
     * 
     */
    @Import(name="scriptLanguage")
    private @Nullable Output<String> scriptLanguage;

    /**
     * @return The programing language that should execute the script.
     * 
     */
    public Optional<Output<String>> scriptLanguage() {
        return Optional.ofNullable(this.scriptLanguage);
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
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ScriptMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
     * 
     */
    public Optional<Output<List<ScriptMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="useUnsupportedLegacyRuntime")
    private @Nullable Output<Boolean> useUnsupportedLegacyRuntime;

    public Optional<Output<Boolean>> useUnsupportedLegacyRuntime() {
        return Optional.ofNullable(this.useUnsupportedLegacyRuntime);
    }

    private ScriptMonitorState() {}

    private ScriptMonitorState(ScriptMonitorState $) {
        this.accountId = $.accountId;
        this.deviceOrientation = $.deviceOrientation;
        this.deviceType = $.deviceType;
        this.enableScreenshotOnFailureAndScript = $.enableScreenshotOnFailureAndScript;
        this.guid = $.guid;
        this.locationPrivates = $.locationPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.periodInMinutes = $.periodInMinutes;
        this.runtimeType = $.runtimeType;
        this.runtimeTypeVersion = $.runtimeTypeVersion;
        this.script = $.script;
        this.scriptLanguage = $.scriptLanguage;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
        this.useUnsupportedLegacyRuntime = $.useUnsupportedLegacyRuntime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptMonitorState $;

        public Builder() {
            $ = new ScriptMonitorState();
        }

        public Builder(ScriptMonitorState defaults) {
            $ = new ScriptMonitorState(Objects.requireNonNull(defaults));
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
         * @param deviceOrientation Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
         * 
         * @return builder
         * 
         */
        public Builder deviceOrientation(@Nullable Output<String> deviceOrientation) {
            $.deviceOrientation = deviceOrientation;
            return this;
        }

        /**
         * @param deviceOrientation Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
         * 
         * @return builder
         * 
         */
        public Builder deviceOrientation(String deviceOrientation) {
            return deviceOrientation(Output.of(deviceOrientation));
        }

        /**
         * @param deviceType Device emulation type field. Valid values are `MOBILE` and `TABLET`.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(@Nullable Output<String> deviceType) {
            $.deviceType = deviceType;
            return this;
        }

        /**
         * @param deviceType Device emulation type field. Valid values are `MOBILE` and `TABLET`.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(String deviceType) {
            return deviceType(Output.of(deviceType));
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
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(@Nullable Output<List<ScriptMonitorLocationPrivateArgs>> locationPrivates) {
            $.locationPrivates = locationPrivates;
            return this;
        }

        /**
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(List<ScriptMonitorLocationPrivateArgs> locationPrivates) {
            return locationPrivates(Output.of(locationPrivates));
        }

        /**
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(ScriptMonitorLocationPrivateArgs... locationPrivates) {
            return locationPrivates(List.of(locationPrivates));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(@Nullable Output<List<String>> locationsPublics) {
            $.locationsPublics = locationsPublics;
            return this;
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(List<String> locationsPublics) {
            return locationsPublics(Output.of(locationsPublics));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
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
         * @param runtimeType The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(String runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param runtimeTypeVersion The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(@Nullable Output<String> runtimeTypeVersion) {
            $.runtimeTypeVersion = runtimeTypeVersion;
            return this;
        }

        /**
         * @param runtimeTypeVersion The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(String runtimeTypeVersion) {
            return runtimeTypeVersion(Output.of(runtimeTypeVersion));
        }

        /**
         * @param script The script that the monitor runs.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The script that the monitor runs.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param scriptLanguage The programing language that should execute the script.
         * 
         * @return builder
         * 
         */
        public Builder scriptLanguage(@Nullable Output<String> scriptLanguage) {
            $.scriptLanguage = scriptLanguage;
            return this;
        }

        /**
         * @param scriptLanguage The programing language that should execute the script.
         * 
         * @return builder
         * 
         */
        public Builder scriptLanguage(String scriptLanguage) {
            return scriptLanguage(Output.of(scriptLanguage));
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
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ScriptMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ScriptMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * The `SCRIPTED_BROWSER` monitor type supports the following additional argument:
         * 
         * @return builder
         * 
         */
        public Builder tags(ScriptMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useUnsupportedLegacyRuntime(@Nullable Output<Boolean> useUnsupportedLegacyRuntime) {
            $.useUnsupportedLegacyRuntime = useUnsupportedLegacyRuntime;
            return this;
        }

        public Builder useUnsupportedLegacyRuntime(Boolean useUnsupportedLegacyRuntime) {
            return useUnsupportedLegacyRuntime(Output.of(useUnsupportedLegacyRuntime));
        }

        public ScriptMonitorState build() {
            return $;
        }
    }

}
