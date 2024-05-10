// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.OneDashboardPageArgs;
import com.pulumi.newrelic.inputs.OneDashboardVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardArgs Empty = new OneDashboardArgs();

    /**
     * The New Relic account ID where you want to create the dashboard.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The New Relic account ID where you want to create the dashboard.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * (Optional) Brief text describing the page.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Optional) Brief text describing the page.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Required) The variable identifier.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Required) The variable identifier.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="pages", required=true)
    private Output<List<OneDashboardPageArgs>> pages;

    public Output<List<OneDashboardPageArgs>> pages() {
        return this.pages;
    }

    /**
     * Determines who can see or edit the dashboard. Valid values are private, public_read_only, public_read_write. Defaults to
     * public_read_only.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return Determines who can see or edit the dashboard. Valid values are private, public_read_only, public_read_write. Defaults to
     * public_read_only.
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Dashboard-local variable definitions.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<OneDashboardVariableArgs>> variables;

    /**
     * @return Dashboard-local variable definitions.
     * 
     */
    public Optional<Output<List<OneDashboardVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private OneDashboardArgs() {}

    private OneDashboardArgs(OneDashboardArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.name = $.name;
        this.pages = $.pages;
        this.permissions = $.permissions;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardArgs $;

        public Builder() {
            $ = new OneDashboardArgs();
        }

        public Builder(OneDashboardArgs defaults) {
            $ = new OneDashboardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID where you want to create the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID where you want to create the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description (Optional) Brief text describing the page.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Optional) Brief text describing the page.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name (Required) The variable identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Required) The variable identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pages(Output<List<OneDashboardPageArgs>> pages) {
            $.pages = pages;
            return this;
        }

        public Builder pages(List<OneDashboardPageArgs> pages) {
            return pages(Output.of(pages));
        }

        public Builder pages(OneDashboardPageArgs... pages) {
            return pages(List.of(pages));
        }

        /**
         * @param permissions Determines who can see or edit the dashboard. Valid values are private, public_read_only, public_read_write. Defaults to
         * public_read_only.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Determines who can see or edit the dashboard. Valid values are private, public_read_only, public_read_write. Defaults to
         * public_read_only.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param variables Dashboard-local variable definitions.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<OneDashboardVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Dashboard-local variable definitions.
         * 
         * @return builder
         * 
         */
        public Builder variables(List<OneDashboardVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Dashboard-local variable definitions.
         * 
         * @return builder
         * 
         */
        public Builder variables(OneDashboardVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public OneDashboardArgs build() {
            if ($.pages == null) {
                throw new MissingRequiredPropertyException("OneDashboardArgs", "pages");
            }
            return $;
        }
    }

}
