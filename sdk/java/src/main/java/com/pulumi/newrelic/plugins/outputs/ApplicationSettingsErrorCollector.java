// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationSettingsErrorCollector {
    /**
     * @return A list of expected error classes.
     * 
     */
    private @Nullable List<String> expectedErrorClasses;
    /**
     * @return A list of expected error codes(any status code between 100-900).
     * 
     */
    private @Nullable List<String> expectedErrorCodes;
    /**
     * @return A list of ignored error classes.
     * 
     */
    private @Nullable List<String> ignoredErrorClasses;
    /**
     * @return A list of ignored error codes(any status code between 100-900).
     * 
     */
    private @Nullable List<String> ignoredErrorCodes;

    private ApplicationSettingsErrorCollector() {}
    /**
     * @return A list of expected error classes.
     * 
     */
    public List<String> expectedErrorClasses() {
        return this.expectedErrorClasses == null ? List.of() : this.expectedErrorClasses;
    }
    /**
     * @return A list of expected error codes(any status code between 100-900).
     * 
     */
    public List<String> expectedErrorCodes() {
        return this.expectedErrorCodes == null ? List.of() : this.expectedErrorCodes;
    }
    /**
     * @return A list of ignored error classes.
     * 
     */
    public List<String> ignoredErrorClasses() {
        return this.ignoredErrorClasses == null ? List.of() : this.ignoredErrorClasses;
    }
    /**
     * @return A list of ignored error codes(any status code between 100-900).
     * 
     */
    public List<String> ignoredErrorCodes() {
        return this.ignoredErrorCodes == null ? List.of() : this.ignoredErrorCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSettingsErrorCollector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> expectedErrorClasses;
        private @Nullable List<String> expectedErrorCodes;
        private @Nullable List<String> ignoredErrorClasses;
        private @Nullable List<String> ignoredErrorCodes;
        public Builder() {}
        public Builder(ApplicationSettingsErrorCollector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedErrorClasses = defaults.expectedErrorClasses;
    	      this.expectedErrorCodes = defaults.expectedErrorCodes;
    	      this.ignoredErrorClasses = defaults.ignoredErrorClasses;
    	      this.ignoredErrorCodes = defaults.ignoredErrorCodes;
        }

        @CustomType.Setter
        public Builder expectedErrorClasses(@Nullable List<String> expectedErrorClasses) {

            this.expectedErrorClasses = expectedErrorClasses;
            return this;
        }
        public Builder expectedErrorClasses(String... expectedErrorClasses) {
            return expectedErrorClasses(List.of(expectedErrorClasses));
        }
        @CustomType.Setter
        public Builder expectedErrorCodes(@Nullable List<String> expectedErrorCodes) {

            this.expectedErrorCodes = expectedErrorCodes;
            return this;
        }
        public Builder expectedErrorCodes(String... expectedErrorCodes) {
            return expectedErrorCodes(List.of(expectedErrorCodes));
        }
        @CustomType.Setter
        public Builder ignoredErrorClasses(@Nullable List<String> ignoredErrorClasses) {

            this.ignoredErrorClasses = ignoredErrorClasses;
            return this;
        }
        public Builder ignoredErrorClasses(String... ignoredErrorClasses) {
            return ignoredErrorClasses(List.of(ignoredErrorClasses));
        }
        @CustomType.Setter
        public Builder ignoredErrorCodes(@Nullable List<String> ignoredErrorCodes) {

            this.ignoredErrorCodes = ignoredErrorCodes;
            return this;
        }
        public Builder ignoredErrorCodes(String... ignoredErrorCodes) {
            return ignoredErrorCodes(List.of(ignoredErrorCodes));
        }
        public ApplicationSettingsErrorCollector build() {
            final var _resultValue = new ApplicationSettingsErrorCollector();
            _resultValue.expectedErrorClasses = expectedErrorClasses;
            _resultValue.expectedErrorCodes = expectedErrorCodes;
            _resultValue.ignoredErrorClasses = ignoredErrorClasses;
            _resultValue.ignoredErrorCodes = ignoredErrorCodes;
            return _resultValue;
        }
    }
}
