// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationChannelState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelState Empty = new NotificationChannelState();

    /**
     * The id of the destination.
     * 
     */
    @Import(name="destinationId")
    private @Nullable Output<String> destinationId;

    /**
     * @return The id of the destination.
     * 
     */
    public Optional<Output<String>> destinationId() {
        return Optional.ofNullable(this.destinationId);
    }

    /**
     * The name of the channel.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<List<NotificationChannelPropertyArgs>> properties;

    /**
     * @return A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
     * 
     */
    public Optional<Output<List<NotificationChannelPropertyArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NotificationChannelState() {}

    private NotificationChannelState(NotificationChannelState $) {
        this.destinationId = $.destinationId;
        this.name = $.name;
        this.product = $.product;
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelState $;

        public Builder() {
            $ = new NotificationChannelState();
        }

        public Builder(NotificationChannelState defaults) {
            $ = new NotificationChannelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationId The id of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(@Nullable Output<String> destinationId) {
            $.destinationId = destinationId;
            return this;
        }

        /**
         * @param destinationId The id of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(String destinationId) {
            return destinationId(Output.of(destinationId));
        }

        /**
         * @param name The name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param product The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param properties A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<List<NotificationChannelPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(List<NotificationChannelPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(NotificationChannelPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        /**
         * @param type The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationChannelState build() {
            return $;
        }
    }

}
