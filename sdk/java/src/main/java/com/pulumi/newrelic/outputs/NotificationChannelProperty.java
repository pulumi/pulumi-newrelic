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
    /**
     * @return The notification property display value.
     * 
     * Each notification channel type supports a specific set of arguments for the `property` block:
     * 
     */
    private @Nullable String displayValue;
    /**
     * @return The notification property key.
     * 
     */
    private String key;
    /**
     * @return The notification property label.
     * 
     */
    private @Nullable String label;
    /**
     * @return The notification property value.
     * 
     */
    private String value;

    private NotificationChannelProperty() {}
    /**
     * @return The notification property display value.
     * 
     * Each notification channel type supports a specific set of arguments for the `property` block:
     * 
     */
    public Optional<String> displayValue() {
        return Optional.ofNullable(this.displayValue);
    }
    /**
     * @return The notification property key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The notification property label.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The notification property value.
     * 
     */
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
            final var _resultValue = new NotificationChannelProperty();
            _resultValue.displayValue = displayValue;
            _resultValue.key = key;
            _resultValue.label = label;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
