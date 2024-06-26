// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NotificationDestinationSecureUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationDestinationSecureUrlArgs Empty = new NotificationDestinationSecureUrlArgs();

    @Import(name="prefix", required=true)
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    @Import(name="secureSuffix", required=true)
    private Output<String> secureSuffix;

    public Output<String> secureSuffix() {
        return this.secureSuffix;
    }

    private NotificationDestinationSecureUrlArgs() {}

    private NotificationDestinationSecureUrlArgs(NotificationDestinationSecureUrlArgs $) {
        this.prefix = $.prefix;
        this.secureSuffix = $.secureSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationDestinationSecureUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationDestinationSecureUrlArgs $;

        public Builder() {
            $ = new NotificationDestinationSecureUrlArgs();
        }

        public Builder(NotificationDestinationSecureUrlArgs defaults) {
            $ = new NotificationDestinationSecureUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder secureSuffix(Output<String> secureSuffix) {
            $.secureSuffix = secureSuffix;
            return this;
        }

        public Builder secureSuffix(String secureSuffix) {
            return secureSuffix(Output.of(secureSuffix));
        }

        public NotificationDestinationSecureUrlArgs build() {
            if ($.prefix == null) {
                throw new MissingRequiredPropertyException("NotificationDestinationSecureUrlArgs", "prefix");
            }
            if ($.secureSuffix == null) {
                throw new MissingRequiredPropertyException("NotificationDestinationSecureUrlArgs", "secureSuffix");
            }
            return $;
        }
    }

}
