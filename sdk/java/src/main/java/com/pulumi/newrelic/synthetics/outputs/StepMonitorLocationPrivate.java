// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StepMonitorLocationPrivate {
    /**
     * @return The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    private String guid;
    /**
     * @return The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    private @Nullable String vsePassword;

    private StepMonitorLocationPrivate() {}
    /**
     * @return The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    public String guid() {
        return this.guid;
    }
    /**
     * @return The location&#39;s Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
     * 
     */
    public Optional<String> vsePassword() {
        return Optional.ofNullable(this.vsePassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepMonitorLocationPrivate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String guid;
        private @Nullable String vsePassword;
        public Builder() {}
        public Builder(StepMonitorLocationPrivate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guid = defaults.guid;
    	      this.vsePassword = defaults.vsePassword;
        }

        @CustomType.Setter
        public Builder guid(String guid) {
            if (guid == null) {
              throw new MissingRequiredPropertyException("StepMonitorLocationPrivate", "guid");
            }
            this.guid = guid;
            return this;
        }
        @CustomType.Setter
        public Builder vsePassword(@Nullable String vsePassword) {

            this.vsePassword = vsePassword;
            return this;
        }
        public StepMonitorLocationPrivate build() {
            final var _resultValue = new StepMonitorLocationPrivate();
            _resultValue.guid = guid;
            _resultValue.vsePassword = vsePassword;
            return _resultValue;
        }
    }
}
