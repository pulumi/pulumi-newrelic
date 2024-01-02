// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.synthetics.inputs.BrokenLinksMonitorTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrokenLinksMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrokenLinksMonitorArgs Empty = new BrokenLinksMonitorArgs();

    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
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
    @Import(name="period", required=true)
    private Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    public Output<String> period() {
        return this.period;
    }

    /**
     * The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The &#39;MUTED&#39; status is now deprecated, and support for this
     * value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
     * refrain from using this value and shift to alternatives.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The &#39;MUTED&#39; status is now deprecated, and support for this
     * value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
     * refrain from using this value and shift to alternatives.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<BrokenLinksMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    public Optional<Output<List<BrokenLinksMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The URI the monitor runs against.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI the monitor runs against.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private BrokenLinksMonitorArgs() {}

    private BrokenLinksMonitorArgs(BrokenLinksMonitorArgs $) {
        this.accountId = $.accountId;
        this.locationsPrivates = $.locationsPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.status = $.status;
        this.tags = $.tags;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrokenLinksMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrokenLinksMonitorArgs $;

        public Builder() {
            $ = new BrokenLinksMonitorArgs();
        }

        public Builder(BrokenLinksMonitorArgs defaults) {
            $ = new BrokenLinksMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
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
        public Builder period(Output<String> period) {
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
         * @param status The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The &#39;MUTED&#39; status is now deprecated, and support for this
         * value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
         * refrain from using this value and shift to alternatives.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The &#39;MUTED&#39; status is now deprecated, and support for this
         * value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
         * refrain from using this value and shift to alternatives.
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
        public Builder tags(@Nullable Output<List<BrokenLinksMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(List<BrokenLinksMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(BrokenLinksMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param uri The URI the monitor runs against.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
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

        public BrokenLinksMonitorArgs build() {
            if ($.period == null) {
                throw new MissingRequiredPropertyException("BrokenLinksMonitorArgs", "period");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("BrokenLinksMonitorArgs", "status");
            }
            if ($.uri == null) {
                throw new MissingRequiredPropertyException("BrokenLinksMonitorArgs", "uri");
            }
            return $;
        }
    }

}
