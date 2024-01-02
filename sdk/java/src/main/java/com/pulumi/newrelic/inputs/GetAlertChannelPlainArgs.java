// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertChannelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertChannelPlainArgs Empty = new GetAlertChannelPlainArgs();

    /**
     * The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Integer accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Integer> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The name of the alert channel in New Relic.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the alert channel in New Relic.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAlertChannelPlainArgs() {}

    private GetAlertChannelPlainArgs(GetAlertChannelPlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertChannelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertChannelPlainArgs $;

        public Builder() {
            $ = new GetAlertChannelPlainArgs();
        }

        public Builder(GetAlertChannelPlainArgs defaults) {
            $ = new GetAlertChannelPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Integer accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name The name of the alert channel in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAlertChannelPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAlertChannelPlainArgs", "name");
            }
            return $;
        }
    }

}
