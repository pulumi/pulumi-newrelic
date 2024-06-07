// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.CertCheckMonitorTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertCheckMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final CertCheckMonitorState Empty = new CertCheckMonitorState();

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
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    @Import(name="certificateExpiration")
    private @Nullable Output<Integer> certificateExpiration;

    /**
     * @return The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    public Optional<Output<Integer>> certificateExpiration() {
        return Optional.ofNullable(this.certificateExpiration);
    }

    /**
     * The domain of the host that will have its certificate checked.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain of the host that will have its certificate checked.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
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
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Import(name="locationsPublics")
    private @Nullable Output<List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
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
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
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
     * The specific version of the runtime type selected.
     * 
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after June 30, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
     * 
     */
    @Import(name="runtimeTypeVersion")
    private @Nullable Output<String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected.
     * 
     * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
     * 
     * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after June 30, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
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
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<CertCheckMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    public Optional<Output<List<CertCheckMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CertCheckMonitorState() {}

    private CertCheckMonitorState(CertCheckMonitorState $) {
        this.accountId = $.accountId;
        this.certificateExpiration = $.certificateExpiration;
        this.domain = $.domain;
        this.locationsPrivates = $.locationsPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.periodInMinutes = $.periodInMinutes;
        this.runtimeType = $.runtimeType;
        this.runtimeTypeVersion = $.runtimeTypeVersion;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertCheckMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertCheckMonitorState $;

        public Builder() {
            $ = new CertCheckMonitorState();
        }

        public Builder(CertCheckMonitorState defaults) {
            $ = new CertCheckMonitorState(Objects.requireNonNull(defaults));
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
         * @param certificateExpiration The desired number of remaining days until the certificate expires to trigger a monitor failure.
         * 
         * @return builder
         * 
         */
        public Builder certificateExpiration(@Nullable Output<Integer> certificateExpiration) {
            $.certificateExpiration = certificateExpiration;
            return this;
        }

        /**
         * @param certificateExpiration The desired number of remaining days until the certificate expires to trigger a monitor failure.
         * 
         * @return builder
         * 
         */
        public Builder certificateExpiration(Integer certificateExpiration) {
            return certificateExpiration(Output.of(certificateExpiration));
        }

        /**
         * @param domain The domain of the host that will have its certificate checked.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain of the host that will have its certificate checked.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
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
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(@Nullable Output<List<String>> locationsPublics) {
            $.locationsPublics = locationsPublics;
            return this;
        }

        /**
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(List<String> locationsPublics) {
            return locationsPublics(Output.of(locationsPublics));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
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
         * @param period The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
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
         * @param runtimeTypeVersion The specific version of the runtime type selected.
         * 
         * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
         * 
         * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after June 30, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(@Nullable Output<String> runtimeTypeVersion) {
            $.runtimeTypeVersion = runtimeTypeVersion;
            return this;
        }

        /**
         * @param runtimeTypeVersion The specific version of the runtime type selected.
         * 
         * &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `NODE_API` and `16.10` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
         * 
         * &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after June 30, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
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
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<CertCheckMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(List<CertCheckMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(CertCheckMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public CertCheckMonitorState build() {
            return $;
        }
    }

}
