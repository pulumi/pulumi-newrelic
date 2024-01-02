// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventEventAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventEventAttributeArgs Empty = new EventEventAttributeArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private EventEventAttributeArgs() {}

    private EventEventAttributeArgs(EventEventAttributeArgs $) {
        this.key = $.key;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventEventAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventEventAttributeArgs $;

        public Builder() {
            $ = new EventEventAttributeArgs();
        }

        public Builder(EventEventAttributeArgs defaults) {
            $ = new EventEventAttributeArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventEventAttributeArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("EventEventAttributeArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("EventEventAttributeArgs", "value");
            }
            return $;
        }
    }

}
