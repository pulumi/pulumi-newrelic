// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.WorkflowEnrichmentsNrqlConfiguration;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowEnrichmentsNrql {
    /**
     * @return Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    private @Nullable String accountId;
    /**
     * @return A set of key-value pairs to represent a enrichment configuration.
     * 
     */
    private List<WorkflowEnrichmentsNrqlConfiguration> configurations;
    /**
     * @return Enrichment&#39;s id.
     * 
     */
    private @Nullable String enrichmentId;
    /**
     * @return The name of the workflow.
     * 
     */
    private String name;
    /**
     * @return The type of the enrichment. One of: (NRQL).
     * 
     */
    private @Nullable String type;

    private WorkflowEnrichmentsNrql() {}
    /**
     * @return Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return A set of key-value pairs to represent a enrichment configuration.
     * 
     */
    public List<WorkflowEnrichmentsNrqlConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return Enrichment&#39;s id.
     * 
     */
    public Optional<String> enrichmentId() {
        return Optional.ofNullable(this.enrichmentId);
    }
    /**
     * @return The name of the workflow.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of the enrichment. One of: (NRQL).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowEnrichmentsNrql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private List<WorkflowEnrichmentsNrqlConfiguration> configurations;
        private @Nullable String enrichmentId;
        private String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(WorkflowEnrichmentsNrql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.configurations = defaults.configurations;
    	      this.enrichmentId = defaults.enrichmentId;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {

            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder configurations(List<WorkflowEnrichmentsNrqlConfiguration> configurations) {
            if (configurations == null) {
              throw new MissingRequiredPropertyException("WorkflowEnrichmentsNrql", "configurations");
            }
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(WorkflowEnrichmentsNrqlConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder enrichmentId(@Nullable String enrichmentId) {

            this.enrichmentId = enrichmentId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkflowEnrichmentsNrql", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public WorkflowEnrichmentsNrql build() {
            final var _resultValue = new WorkflowEnrichmentsNrql();
            _resultValue.accountId = accountId;
            _resultValue.configurations = configurations;
            _resultValue.enrichmentId = enrichmentId;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
