// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardVariableNrqlQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardVariableNrqlQueryArgs Empty = new OneDashboardVariableNrqlQueryArgs();

    /**
     * New Relic account ID(s) to issue the query against.
     * 
     */
    @Import(name="accountIds")
    private @Nullable Output<List<String>> accountIds;

    /**
     * @return New Relic account ID(s) to issue the query against.
     * 
     */
    public Optional<Output<List<String>>> accountIds() {
        return Optional.ofNullable(this.accountIds);
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

    private OneDashboardVariableNrqlQueryArgs() {}

    private OneDashboardVariableNrqlQueryArgs(OneDashboardVariableNrqlQueryArgs $) {
        this.accountIds = $.accountIds;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardVariableNrqlQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardVariableNrqlQueryArgs $;

        public Builder() {
            $ = new OneDashboardVariableNrqlQueryArgs();
        }

        public Builder(OneDashboardVariableNrqlQueryArgs defaults) {
            $ = new OneDashboardVariableNrqlQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountIds New Relic account ID(s) to issue the query against.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(@Nullable Output<List<String>> accountIds) {
            $.accountIds = accountIds;
            return this;
        }

        /**
         * @param accountIds New Relic account ID(s) to issue the query against.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(List<String> accountIds) {
            return accountIds(Output.of(accountIds));
        }

        /**
         * @param accountIds New Relic account ID(s) to issue the query against.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
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

        public OneDashboardVariableNrqlQueryArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("OneDashboardVariableNrqlQueryArgs", "query");
            }
            return $;
        }
    }

}
