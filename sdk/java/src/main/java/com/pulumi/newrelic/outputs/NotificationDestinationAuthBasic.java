// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationDestinationAuthBasic {
    private String password;
    private String user;

    private NotificationDestinationAuthBasic() {}
    public String password() {
        return this.password;
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationDestinationAuthBasic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String user;
        public Builder() {}
        public Builder(NotificationDestinationAuthBasic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("NotificationDestinationAuthBasic", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("NotificationDestinationAuthBasic", "user");
            }
            this.user = user;
            return this;
        }
        public NotificationDestinationAuthBasic build() {
            final var _resultValue = new NotificationDestinationAuthBasic();
            _resultValue.password = password;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
