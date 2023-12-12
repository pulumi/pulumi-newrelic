// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardVariableNrqlQuery {
    private @Nullable List<Integer> accountIds;
    /**
     * @return (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * 
     */
    private String query;

    private OneDashboardVariableNrqlQuery() {}
    public List<Integer> accountIds() {
        return this.accountIds == null ? List.of() : this.accountIds;
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

    public static Builder builder(OneDashboardVariableNrqlQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> accountIds;
        private String query;
        public Builder() {}
        public Builder(OneDashboardVariableNrqlQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder accountIds(@Nullable List<Integer> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public Builder accountIds(Integer... accountIds) {
            return accountIds(List.of(accountIds));
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public OneDashboardVariableNrqlQuery build() {
            final var _resultValue = new OneDashboardVariableNrqlQuery();
            _resultValue.accountIds = accountIds;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
