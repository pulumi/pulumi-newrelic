// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.WorkflowIssuesFilterPredicate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowIssuesFilter {
    private @Nullable String filterId;
    private String name;
    /**
     * @return A condition an issue event should satisfy to be processed by the workflow
     * 
     */
    private @Nullable List<WorkflowIssuesFilterPredicate> predicates;
    /**
     * @return Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
     * 
     */
    private String type;

    private WorkflowIssuesFilter() {}
    public Optional<String> filterId() {
        return Optional.ofNullable(this.filterId);
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A condition an issue event should satisfy to be processed by the workflow
     * 
     */
    public List<WorkflowIssuesFilterPredicate> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
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
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkflowIssuesFilter", "name");
            }
            this.name = name;
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
            if (type == null) {
              throw new MissingRequiredPropertyException("WorkflowIssuesFilter", "type");
            }
            this.type = type;
            return this;
        }
        public WorkflowIssuesFilter build() {
            final var _resultValue = new WorkflowIssuesFilter();
            _resultValue.filterId = filterId;
            _resultValue.name = name;
            _resultValue.predicates = predicates;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
