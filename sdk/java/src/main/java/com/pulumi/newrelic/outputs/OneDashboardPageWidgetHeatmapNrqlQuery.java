// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetHeatmapNrqlQuery {
    /**
     * @return The account id used for the NRQL query.
     * 
     */
    private @Nullable String accountId;
    /**
     * @return (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    private String query;

    private OneDashboardPageWidgetHeatmapNrqlQuery() {}
    /**
     * @return The account id used for the NRQL query.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetHeatmapNrqlQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private String query;
        public Builder() {}
        public Builder(OneDashboardPageWidgetHeatmapNrqlQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {

            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetHeatmapNrqlQuery", "query");
            }
            this.query = query;
            return this;
        }
        public OneDashboardPageWidgetHeatmapNrqlQuery build() {
            final var _resultValue = new OneDashboardPageWidgetHeatmapNrqlQuery();
            _resultValue.accountId = accountId;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
