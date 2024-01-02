// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.outputs.GetNotificationDestinationProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationDestinationResult {
    private Integer accountId;
    /**
     * @return An indication whether the notification destination is active or not.
     * 
     */
    private Boolean active;
    private @Nullable String id;
    /**
     * @return The name of the notification destination.
     * 
     */
    private @Nullable String name;
    /**
     * @return A nested block that describes a notification destination property.
     * 
     */
    private List<GetNotificationDestinationProperty> properties;
    /**
     * @return The status of the notification destination.
     * 
     */
    private String status;
    /**
     * @return The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK` and `SLACK_COLLABORATION`.
     * 
     */
    private String type;

    private GetNotificationDestinationResult() {}
    public Integer accountId() {
        return this.accountId;
    }
    /**
     * @return An indication whether the notification destination is active or not.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the notification destination.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A nested block that describes a notification destination property.
     * 
     */
    public List<GetNotificationDestinationProperty> properties() {
        return this.properties;
    }
    /**
     * @return The status of the notification destination.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK` and `SLACK_COLLABORATION`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationDestinationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accountId;
        private Boolean active;
        private @Nullable String id;
        private @Nullable String name;
        private List<GetNotificationDestinationProperty> properties;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetNotificationDestinationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.active = defaults.active;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountId(Integer accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetNotificationDestinationResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetNotificationDestinationResult", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder properties(List<GetNotificationDestinationProperty> properties) {
            if (properties == null) {
              throw new MissingRequiredPropertyException("GetNotificationDestinationResult", "properties");
            }
            this.properties = properties;
            return this;
        }
        public Builder properties(GetNotificationDestinationProperty... properties) {
            return properties(List.of(properties));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetNotificationDestinationResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNotificationDestinationResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetNotificationDestinationResult build() {
            final var _resultValue = new GetNotificationDestinationResult();
            _resultValue.accountId = accountId;
            _resultValue.active = active;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.properties = properties;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
