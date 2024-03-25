// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardVariableOption {
    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    private @Nullable Boolean ignoreTimeRange;

    private OneDashboardVariableOption() {}
    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    public Optional<Boolean> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardVariableOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ignoreTimeRange;
        public Builder() {}
        public Builder(OneDashboardVariableOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
        }

        @CustomType.Setter
        public Builder ignoreTimeRange(@Nullable Boolean ignoreTimeRange) {

            this.ignoreTimeRange = ignoreTimeRange;
            return this;
        }
        public OneDashboardVariableOption build() {
            final var _resultValue = new OneDashboardVariableOption();
            _resultValue.ignoreTimeRange = ignoreTimeRange;
            return _resultValue;
        }
    }
}
