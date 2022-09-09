// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.OneDashboardPageArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardState extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardState Empty = new OneDashboardState();

    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Brief text describing the dashboard.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The title of the dashboard.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    @Import(name="pages")
    private @Nullable Output<List<OneDashboardPageArgs>> pages;

    /**
     * @return A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    public Optional<Output<List<OneDashboardPageArgs>>> pages() {
        return Optional.ofNullable(this.pages);
    }

    /**
     * The URL for viewing the dashboard.
     * 
     */
    @Import(name="permalink")
    private @Nullable Output<String> permalink;

    /**
     * @return The URL for viewing the dashboard.
     * 
     */
    public Optional<Output<String>> permalink() {
        return Optional.ofNullable(this.permalink);
    }

    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private OneDashboardState() {}

    private OneDashboardState(OneDashboardState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.guid = $.guid;
        this.name = $.name;
        this.pages = $.pages;
        this.permalink = $.permalink;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardState $;

        public Builder() {
            $ = new OneDashboardState();
        }

        public Builder(OneDashboardState defaults) {
            $ = new OneDashboardState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description Brief text describing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief text describing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(@Nullable Output<List<OneDashboardPageArgs>> pages) {
            $.pages = pages;
            return this;
        }

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(List<OneDashboardPageArgs> pages) {
            return pages(Output.of(pages));
        }

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(OneDashboardPageArgs... pages) {
            return pages(List.of(pages));
        }

        /**
         * @param permalink The URL for viewing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder permalink(@Nullable Output<String> permalink) {
            $.permalink = permalink;
            return this;
        }

        /**
         * @param permalink The URL for viewing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder permalink(String permalink) {
            return permalink(Output.of(permalink));
        }

        /**
         * @param permissions Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public OneDashboardState build() {
            return $;
        }
    }

}