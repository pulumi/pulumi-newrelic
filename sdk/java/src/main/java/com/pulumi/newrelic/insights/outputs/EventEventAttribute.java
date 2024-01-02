// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventEventAttribute {
    private String key;
    private @Nullable String type;
    private String value;

    private EventEventAttribute() {}
    public String key() {
        return this.key;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventEventAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private @Nullable String type;
        private String value;
        public Builder() {}
        public Builder(EventEventAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("EventEventAttribute", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("EventEventAttribute", "value");
            }
            this.value = value;
            return this;
        }
        public EventEventAttribute build() {
            final var _resultValue = new EventEventAttribute();
            _resultValue.key = key;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
