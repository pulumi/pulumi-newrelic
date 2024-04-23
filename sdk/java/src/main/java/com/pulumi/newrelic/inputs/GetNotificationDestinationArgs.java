// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.GetNotificationDestinationSecureUrlArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotificationDestinationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationDestinationArgs Empty = new GetNotificationDestinationArgs();

    /**
     * The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The id of the notification destination in New Relic.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the notification destination in New Relic.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the notification destination.
     * 
     * Optional:
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the notification destination.
     * 
     * Optional:
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
     * 
     */
    @Import(name="secureUrls")
    private @Nullable Output<List<GetNotificationDestinationSecureUrlArgs>> secureUrls;

    /**
     * @return The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
     * 
     */
    public Optional<Output<List<GetNotificationDestinationSecureUrlArgs>>> secureUrls() {
        return Optional.ofNullable(this.secureUrls);
    }

    private GetNotificationDestinationArgs() {}

    private GetNotificationDestinationArgs(GetNotificationDestinationArgs $) {
        this.accountId = $.accountId;
        this.id = $.id;
        this.name = $.name;
        this.secureUrls = $.secureUrls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationDestinationArgs $;

        public Builder() {
            $ = new GetNotificationDestinationArgs();
        }

        public Builder(GetNotificationDestinationArgs defaults) {
            $ = new GetNotificationDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param id The id of the notification destination in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the notification destination in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the notification destination.
         * 
         * Optional:
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notification destination.
         * 
         * Optional:
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secureUrls The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
         * 
         * @return builder
         * 
         */
        public Builder secureUrls(@Nullable Output<List<GetNotificationDestinationSecureUrlArgs>> secureUrls) {
            $.secureUrls = secureUrls;
            return this;
        }

        /**
         * @param secureUrls The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
         * 
         * @return builder
         * 
         */
        public Builder secureUrls(List<GetNotificationDestinationSecureUrlArgs> secureUrls) {
            return secureUrls(Output.of(secureUrls));
        }

        /**
         * @param secureUrls The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
         * 
         * @return builder
         * 
         */
        public Builder secureUrls(GetNotificationDestinationSecureUrlArgs... secureUrls) {
            return secureUrls(List.of(secureUrls));
        }

        public GetNotificationDestinationArgs build() {
            return $;
        }
    }

}
