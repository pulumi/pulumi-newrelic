// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MonitorTag {
    /**
     * @return Name of the tag key.
     * 
     */
    private String key;
    /**
     * @return Values associated with the tag key.
     * 
     */
    private List<String> values;

    private MonitorTag() {}
    /**
     * @return Name of the tag key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Values associated with the tag key.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private List<String> values;
        public Builder() {}
        public Builder(MonitorTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("MonitorTag", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("MonitorTag", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public MonitorTag build() {
            final var _resultValue = new MonitorTag();
            _resultValue.key = key;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
