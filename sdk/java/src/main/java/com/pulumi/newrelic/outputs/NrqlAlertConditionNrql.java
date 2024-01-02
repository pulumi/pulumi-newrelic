// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NrqlAlertConditionNrql {
    /**
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    private @Nullable Integer evaluationOffset;
    private String query;
    /**
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    private @Nullable String sinceValue;

    private NrqlAlertConditionNrql() {}
    /**
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    public Optional<Integer> evaluationOffset() {
        return Optional.ofNullable(this.evaluationOffset);
    }
    public String query() {
        return this.query;
    }
    /**
     * @deprecated
     * use `aggregation_method` attribute instead
     * 
     */
    @Deprecated /* use `aggregation_method` attribute instead */
    public Optional<String> sinceValue() {
        return Optional.ofNullable(this.sinceValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NrqlAlertConditionNrql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer evaluationOffset;
        private String query;
        private @Nullable String sinceValue;
        public Builder() {}
        public Builder(NrqlAlertConditionNrql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationOffset = defaults.evaluationOffset;
    	      this.query = defaults.query;
    	      this.sinceValue = defaults.sinceValue;
        }

        @CustomType.Setter
        public Builder evaluationOffset(@Nullable Integer evaluationOffset) {

            this.evaluationOffset = evaluationOffset;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("NrqlAlertConditionNrql", "query");
            }
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder sinceValue(@Nullable String sinceValue) {

            this.sinceValue = sinceValue;
            return this;
        }
        public NrqlAlertConditionNrql build() {
            final var _resultValue = new NrqlAlertConditionNrql();
            _resultValue.evaluationOffset = evaluationOffset;
            _resultValue.query = query;
            _resultValue.sinceValue = sinceValue;
            return _resultValue;
        }
    }
}
