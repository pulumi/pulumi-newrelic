// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTestGrokPatternTestGrokAttribute {
    /**
     * @return The attribute name.
     * 
     */
    private String name;
    /**
     * @return A string representation of the extracted value (which might not be a String).
     * 
     */
    private String value;

    private GetTestGrokPatternTestGrokAttribute() {}
    /**
     * @return The attribute name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A string representation of the extracted value (which might not be a String).
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestGrokPatternTestGrokAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetTestGrokPatternTestGrokAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTestGrokPatternTestGrokAttribute", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetTestGrokPatternTestGrokAttribute", "value");
            }
            this.value = value;
            return this;
        }
        public GetTestGrokPatternTestGrokAttribute build() {
            final var _resultValue = new GetTestGrokPatternTestGrokAttribute();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
