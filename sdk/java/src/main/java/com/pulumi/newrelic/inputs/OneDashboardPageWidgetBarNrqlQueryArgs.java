// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageWidgetBarNrqlQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetBarNrqlQueryArgs Empty = new OneDashboardPageWidgetBarNrqlQueryArgs();

    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private OneDashboardPageWidgetBarNrqlQueryArgs() {}

    private OneDashboardPageWidgetBarNrqlQueryArgs(OneDashboardPageWidgetBarNrqlQueryArgs $) {
        this.accountId = $.accountId;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetBarNrqlQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetBarNrqlQueryArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetBarNrqlQueryArgs();
        }

        public Builder(OneDashboardPageWidgetBarNrqlQueryArgs defaults) {
            $ = new OneDashboardPageWidgetBarNrqlQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param query (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public OneDashboardPageWidgetBarNrqlQueryArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetBarNrqlQueryArgs", "query");
            }
            return $;
        }
    }

}
