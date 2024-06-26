// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NotificationDestinationAuthCustomHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationDestinationAuthCustomHeaderArgs Empty = new NotificationDestinationAuthCustomHeaderArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private NotificationDestinationAuthCustomHeaderArgs() {}

    private NotificationDestinationAuthCustomHeaderArgs(NotificationDestinationAuthCustomHeaderArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationDestinationAuthCustomHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationDestinationAuthCustomHeaderArgs $;

        public Builder() {
            $ = new NotificationDestinationAuthCustomHeaderArgs();
        }

        public Builder(NotificationDestinationAuthCustomHeaderArgs defaults) {
            $ = new NotificationDestinationAuthCustomHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NotificationDestinationAuthCustomHeaderArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("NotificationDestinationAuthCustomHeaderArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("NotificationDestinationAuthCustomHeaderArgs", "value");
            }
            return $;
        }
    }

}
