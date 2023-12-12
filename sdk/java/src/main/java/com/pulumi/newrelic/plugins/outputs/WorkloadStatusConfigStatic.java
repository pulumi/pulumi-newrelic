// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadStatusConfigStatic {
    /**
     * @return Relevant information about the workload.
     * 
     */
    private @Nullable String description;
    /**
     * @return Whether the static status configuration is enabled or not.
     * 
     */
    private Boolean enabled;
    /**
     * @return The status of the workload.
     * 
     */
    private String status;
    /**
     * @return A short description of the status of the workload.
     * 
     */
    private @Nullable String summary;

    private WorkloadStatusConfigStatic() {}
    /**
     * @return Relevant information about the workload.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Whether the static status configuration is enabled or not.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The status of the workload.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A short description of the status of the workload.
     * 
     */
    public Optional<String> summary() {
        return Optional.ofNullable(this.summary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadStatusConfigStatic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private Boolean enabled;
        private String status;
        private @Nullable String summary;
        public Builder() {}
        public Builder(WorkloadStatusConfigStatic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.status = defaults.status;
    	      this.summary = defaults.summary;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder summary(@Nullable String summary) {
            this.summary = summary;
            return this;
        }
        public WorkloadStatusConfigStatic build() {
            final var _resultValue = new WorkloadStatusConfigStatic();
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.status = status;
            _resultValue.summary = summary;
            return _resultValue;
        }
    }
}
