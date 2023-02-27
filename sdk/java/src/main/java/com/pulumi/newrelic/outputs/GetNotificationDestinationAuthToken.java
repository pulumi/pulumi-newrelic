// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationDestinationAuthToken {
    private @Nullable String prefix;

    private GetNotificationDestinationAuthToken() {}
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationDestinationAuthToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String prefix;
        public Builder() {}
        public Builder(GetNotificationDestinationAuthToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public GetNotificationDestinationAuthToken build() {
            final var o = new GetNotificationDestinationAuthToken();
            o.prefix = prefix;
            return o;
        }
    }
}
