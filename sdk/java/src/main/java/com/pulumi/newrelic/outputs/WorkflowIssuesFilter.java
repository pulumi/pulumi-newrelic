// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.WorkflowIssuesFilterPredicate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowIssuesFilter {
    private @Nullable String filterId;
    /**
     * @return A nrql enrichment name.
     * 
     */
    private String name;
    private @Nullable List<WorkflowIssuesFilterPredicate> predicates;
    /**
     * @return the filter&#39;s type.   One of: `FILTER` or `VIEW`.
     * * `predicates`
     * 
     */
    private String type;

    private WorkflowIssuesFilter() {}
    public Optional<String> filterId() {
        return Optional.ofNullable(this.filterId);
    }
    /**
     * @return A nrql enrichment name.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<WorkflowIssuesFilterPredicate> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return the filter&#39;s type.   One of: `FILTER` or `VIEW`.
     * * `predicates`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowIssuesFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String filterId;
        private String name;
        private @Nullable List<WorkflowIssuesFilterPredicate> predicates;
        private String type;
        public Builder() {}
        public Builder(WorkflowIssuesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterId = defaults.filterId;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder filterId(@Nullable String filterId) {
            this.filterId = filterId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder predicates(@Nullable List<WorkflowIssuesFilterPredicate> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(WorkflowIssuesFilterPredicate... predicates) {
            return predicates(List.of(predicates));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WorkflowIssuesFilter build() {
            final var o = new WorkflowIssuesFilter();
            o.filterId = filterId;
            o.name = name;
            o.predicates = predicates;
            o.type = type;
            return o;
        }
    }
}