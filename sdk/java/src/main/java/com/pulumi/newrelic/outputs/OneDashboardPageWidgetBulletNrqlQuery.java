// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetBulletNrqlQuery {
    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    private @Nullable Integer accountId;
    /**
     * @return (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    private String query;

    private OneDashboardPageWidgetBulletNrqlQuery() {}
    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Integer> accountId() {
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

    public static Builder builder(OneDashboardPageWidgetBulletNrqlQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer accountId;
        private String query;
        public Builder() {}
        public Builder(OneDashboardPageWidgetBulletNrqlQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable Integer accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public OneDashboardPageWidgetBulletNrqlQuery build() {
            final var _resultValue = new OneDashboardPageWidgetBulletNrqlQuery();
            _resultValue.accountId = accountId;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
