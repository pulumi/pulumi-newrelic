// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationChannelProperty {
    private @Nullable String displayValue;
    private String key;
    private @Nullable String label;
    private String value;

    private NotificationChannelProperty() {}
    public Optional<String> displayValue() {
        return Optional.ofNullable(this.displayValue);
    }
    public String key() {
        return this.key;
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayValue;
        private String key;
        private @Nullable String label;
        private String value;
        public Builder() {}
        public Builder(NotificationChannelProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayValue = defaults.displayValue;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder displayValue(@Nullable String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public NotificationChannelProperty build() {
            final var o = new NotificationChannelProperty();
            o.displayValue = displayValue;
            o.key = key;
            o.label = label;
            o.value = value;
            return o;
        }
    }
}
