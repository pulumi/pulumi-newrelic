// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsLinkAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsLinkAccountArgs Empty = new AwsLinkAccountArgs();

    /**
     * The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    @Import(name="metricCollectionMode")
    private @Nullable Output<String> metricCollectionMode;

    /**
     * @return How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
     * 
     */
    public Optional<Output<String>> metricCollectionMode() {
        return Optional.ofNullable(this.metricCollectionMode);
    }

    /**
     * - The linked account name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return - The linked account name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AwsLinkAccountArgs() {}

    private AwsLinkAccountArgs(AwsLinkAccountArgs $) {
        this.accountId = $.accountId;
        this.arn = $.arn;
        this.metricCollectionMode = $.metricCollectionMode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsLinkAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsLinkAccountArgs $;

        public Builder() {
            $ = new AwsLinkAccountArgs();
        }

        public Builder(AwsLinkAccountArgs defaults) {
            $ = new AwsLinkAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param metricCollectionMode How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
         * 
         * @return builder
         * 
         */
        public Builder metricCollectionMode(@Nullable Output<String> metricCollectionMode) {
            $.metricCollectionMode = metricCollectionMode;
            return this;
        }

        /**
         * @param metricCollectionMode How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
         * 
         * @return builder
         * 
         */
        public Builder metricCollectionMode(String metricCollectionMode) {
            return metricCollectionMode(Output.of(metricCollectionMode));
        }

        /**
         * @param name - The linked account name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name - The linked account name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AwsLinkAccountArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
