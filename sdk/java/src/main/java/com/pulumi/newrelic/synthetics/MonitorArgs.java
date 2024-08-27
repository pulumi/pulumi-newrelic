// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.synthetics.inputs.MonitorCustomHeaderArgs;
import com.pulumi.newrelic.synthetics.inputs.MonitorTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorArgs Empty = new MonitorArgs();

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
     * Monitor should skip default HEAD request and instead use GET verb in check.
     * 
     * The `BROWSER` monitor type supports the following additional arguments:
     * 
     */
    @Import(name="bypassHeadRequest")
    private @Nullable Output<Boolean> bypassHeadRequest;

    /**
     * @return Monitor should skip default HEAD request and instead use GET verb in check.
     * 
     * The `BROWSER` monitor type supports the following additional arguments:
     * 
     */
    public Optional<Output<Boolean>> bypassHeadRequest() {
        return Optional.ofNullable(this.bypassHeadRequest);
    }

    /**
     * Custom headers to use in monitor job. See Nested custom_header blocks below for details.
     * 
     */
    @Import(name="customHeaders")
    private @Nullable Output<List<MonitorCustomHeaderArgs>> customHeaders;

    /**
     * @return Custom headers to use in monitor job. See Nested custom_header blocks below for details.
     * 
     */
    public Optional<Output<List<MonitorCustomHeaderArgs>>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
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
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    @Import(name="locationsPrivates")
    private @Nullable Output<List<String>> locationsPrivates;

    /**
     * @return The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    public Optional<Output<List<String>>> locationsPrivates() {
        return Optional.ofNullable(this.locationsPrivates);
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
     * The human-readable identifier for the monitor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The human-readable identifier for the monitor.
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
     * The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
     * 
     */
    @Import(name="runtimeType")
    private @Nullable Output<String> runtimeType;

    /**
     * @return The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
     * 
     */
    public Optional<Output<String>> runtimeType() {
        return Optional.ofNullable(this.runtimeType);
    }

    /**
     * The runtime type that the monitor will run. Valid value is `100`.
     * 
     */
    @Import(name="runtimeTypeVersion")
    private @Nullable Output<String> runtimeTypeVersion;

    /**
     * @return The runtime type that the monitor will run. Valid value is `100`.
     * 
     */
    public Optional<Output<String>> runtimeTypeVersion() {
        return Optional.ofNullable(this.runtimeTypeVersion);
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
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The monitor status (ENABLED or DISABLED).
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SIMPLE` monitor type supports the following additional arguments:
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<MonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     * The `SIMPLE` monitor type supports the following additional arguments:
     * 
     */
    public Optional<Output<List<MonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Categorize redirects during a monitor job as a failure.
     * 
     */
    @Import(name="treatRedirectAsFailure")
    private @Nullable Output<Boolean> treatRedirectAsFailure;

    /**
     * @return Categorize redirects during a monitor job as a failure.
     * 
     */
    public Optional<Output<Boolean>> treatRedirectAsFailure() {
        return Optional.ofNullable(this.treatRedirectAsFailure);
    }

    /**
     * The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The monitor type. Valid values are `SIMPLE` and `BROWSER`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The URI the monitor runs against.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The URI the monitor runs against.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    @Import(name="useUnsupportedLegacyRuntime")
    private @Nullable Output<Boolean> useUnsupportedLegacyRuntime;

    public Optional<Output<Boolean>> useUnsupportedLegacyRuntime() {
        return Optional.ofNullable(this.useUnsupportedLegacyRuntime);
    }

    /**
     * Validation text for monitor to search for at given URI.
     * 
     */
    @Import(name="validationString")
    private @Nullable Output<String> validationString;

    /**
     * @return Validation text for monitor to search for at given URI.
     * 
     */
    public Optional<Output<String>> validationString() {
        return Optional.ofNullable(this.validationString);
    }

    /**
     * Monitor should validate SSL certificate chain.
     * 
     */
    @Import(name="verifySsl")
    private @Nullable Output<Boolean> verifySsl;

    /**
     * @return Monitor should validate SSL certificate chain.
     * 
     */
    public Optional<Output<Boolean>> verifySsl() {
        return Optional.ofNullable(this.verifySsl);
    }

    private MonitorArgs() {}

    private MonitorArgs(MonitorArgs $) {
        this.accountId = $.accountId;
        this.bypassHeadRequest = $.bypassHeadRequest;
        this.customHeaders = $.customHeaders;
        this.deviceOrientation = $.deviceOrientation;
        this.deviceType = $.deviceType;
        this.enableScreenshotOnFailureAndScript = $.enableScreenshotOnFailureAndScript;
        this.locationsPrivates = $.locationsPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.runtimeType = $.runtimeType;
        this.runtimeTypeVersion = $.runtimeTypeVersion;
        this.scriptLanguage = $.scriptLanguage;
        this.status = $.status;
        this.tags = $.tags;
        this.treatRedirectAsFailure = $.treatRedirectAsFailure;
        this.type = $.type;
        this.uri = $.uri;
        this.useUnsupportedLegacyRuntime = $.useUnsupportedLegacyRuntime;
        this.validationString = $.validationString;
        this.verifySsl = $.verifySsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorArgs $;

        public Builder() {
            $ = new MonitorArgs();
        }

        public Builder(MonitorArgs defaults) {
            $ = new MonitorArgs(Objects.requireNonNull(defaults));
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
         * @param bypassHeadRequest Monitor should skip default HEAD request and instead use GET verb in check.
         * 
         * The `BROWSER` monitor type supports the following additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder bypassHeadRequest(@Nullable Output<Boolean> bypassHeadRequest) {
            $.bypassHeadRequest = bypassHeadRequest;
            return this;
        }

        /**
         * @param bypassHeadRequest Monitor should skip default HEAD request and instead use GET verb in check.
         * 
         * The `BROWSER` monitor type supports the following additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder bypassHeadRequest(Boolean bypassHeadRequest) {
            return bypassHeadRequest(Output.of(bypassHeadRequest));
        }

        /**
         * @param customHeaders Custom headers to use in monitor job. See Nested custom_header blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(@Nullable Output<List<MonitorCustomHeaderArgs>> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        /**
         * @param customHeaders Custom headers to use in monitor job. See Nested custom_header blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(List<MonitorCustomHeaderArgs> customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        /**
         * @param customHeaders Custom headers to use in monitor job. See Nested custom_header blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(MonitorCustomHeaderArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
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
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(@Nullable Output<List<String>> locationsPrivates) {
            $.locationsPrivates = locationsPrivates;
            return this;
        }

        /**
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(List<String> locationsPrivates) {
            return locationsPrivates(Output.of(locationsPrivates));
        }

        /**
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(String... locationsPrivates) {
            return locationsPrivates(List.of(locationsPrivates));
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
         * @param name The human-readable identifier for the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The human-readable identifier for the monitor.
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
         * @param runtimeType The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType The runtime type that the monitor will run. Valid value is `CHROME_BROWSER`
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(String runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param runtimeTypeVersion The runtime type that the monitor will run. Valid value is `100`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(@Nullable Output<String> runtimeTypeVersion) {
            $.runtimeTypeVersion = runtimeTypeVersion;
            return this;
        }

        /**
         * @param runtimeTypeVersion The runtime type that the monitor will run. Valid value is `100`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(String runtimeTypeVersion) {
            return runtimeTypeVersion(Output.of(runtimeTypeVersion));
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
        public Builder status(Output<String> status) {
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
         * The `SIMPLE` monitor type supports the following additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<MonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * The `SIMPLE` monitor type supports the following additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder tags(List<MonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * The `SIMPLE` monitor type supports the following additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder tags(MonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param treatRedirectAsFailure Categorize redirects during a monitor job as a failure.
         * 
         * @return builder
         * 
         */
        public Builder treatRedirectAsFailure(@Nullable Output<Boolean> treatRedirectAsFailure) {
            $.treatRedirectAsFailure = treatRedirectAsFailure;
            return this;
        }

        /**
         * @param treatRedirectAsFailure Categorize redirects during a monitor job as a failure.
         * 
         * @return builder
         * 
         */
        public Builder treatRedirectAsFailure(Boolean treatRedirectAsFailure) {
            return treatRedirectAsFailure(Output.of(treatRedirectAsFailure));
        }

        /**
         * @param type The monitor type. Valid values are `SIMPLE` and `BROWSER`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The monitor type. Valid values are `SIMPLE` and `BROWSER`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uri The URI the monitor runs against.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI the monitor runs against.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public Builder useUnsupportedLegacyRuntime(@Nullable Output<Boolean> useUnsupportedLegacyRuntime) {
            $.useUnsupportedLegacyRuntime = useUnsupportedLegacyRuntime;
            return this;
        }

        public Builder useUnsupportedLegacyRuntime(Boolean useUnsupportedLegacyRuntime) {
            return useUnsupportedLegacyRuntime(Output.of(useUnsupportedLegacyRuntime));
        }

        /**
         * @param validationString Validation text for monitor to search for at given URI.
         * 
         * @return builder
         * 
         */
        public Builder validationString(@Nullable Output<String> validationString) {
            $.validationString = validationString;
            return this;
        }

        /**
         * @param validationString Validation text for monitor to search for at given URI.
         * 
         * @return builder
         * 
         */
        public Builder validationString(String validationString) {
            return validationString(Output.of(validationString));
        }

        /**
         * @param verifySsl Monitor should validate SSL certificate chain.
         * 
         * @return builder
         * 
         */
        public Builder verifySsl(@Nullable Output<Boolean> verifySsl) {
            $.verifySsl = verifySsl;
            return this;
        }

        /**
         * @param verifySsl Monitor should validate SSL certificate chain.
         * 
         * @return builder
         * 
         */
        public Builder verifySsl(Boolean verifySsl) {
            return verifySsl(Output.of(verifySsl));
        }

        public MonitorArgs build() {
            if ($.status == null) {
                throw new MissingRequiredPropertyException("MonitorArgs", "status");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("MonitorArgs", "type");
            }
            return $;
        }
    }

}
