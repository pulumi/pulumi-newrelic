// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsGovcloudLinkAccountState extends com.pulumi.resources.ResourceArgs {

    public static final AwsGovcloudLinkAccountState Empty = new AwsGovcloudLinkAccountState();

    /**
     * The Access Key used to programmatically access the AWS GovCloud account.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return The Access Key used to programmatically access the AWS GovCloud account.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The ID of the AWS GovCloud account.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return The ID of the AWS GovCloud account.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * The mode by which metric data is to be collected from the linked AWS GovCloud account. Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
     * - Note: Altering the `metric_collection_mode` of an already applied `newrelic.cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
     * 
     */
    @Import(name="metricCollectionMode")
    private @Nullable Output<String> metricCollectionMode;

    /**
     * @return The mode by which metric data is to be collected from the linked AWS GovCloud account. Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
     * - Note: Altering the `metric_collection_mode` of an already applied `newrelic.cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
     * 
     */
    public Optional<Output<String>> metricCollectionMode() {
        return Optional.ofNullable(this.metricCollectionMode);
    }

    /**
     * The name/identifier of the AWS GovCloud - New Relic &#39;linked&#39; account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name/identifier of the AWS GovCloud - New Relic &#39;linked&#39; account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Secret Access Key used to programmatically access the AWS GovCloud account.
     * 
     */
    @Import(name="secretAccessKey")
    private @Nullable Output<String> secretAccessKey;

    /**
     * @return The Secret Access Key used to programmatically access the AWS GovCloud account.
     * 
     */
    public Optional<Output<String>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    private AwsGovcloudLinkAccountState() {}

    private AwsGovcloudLinkAccountState(AwsGovcloudLinkAccountState $) {
        this.accessKeyId = $.accessKeyId;
        this.accountId = $.accountId;
        this.awsAccountId = $.awsAccountId;
        this.metricCollectionMode = $.metricCollectionMode;
        this.name = $.name;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsGovcloudLinkAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsGovcloudLinkAccountState $;

        public Builder() {
            $ = new AwsGovcloudLinkAccountState();
        }

        public Builder(AwsGovcloudLinkAccountState defaults) {
            $ = new AwsGovcloudLinkAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId The Access Key used to programmatically access the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId The Access Key used to programmatically access the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param accountId The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param awsAccountId The ID of the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId The ID of the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param metricCollectionMode The mode by which metric data is to be collected from the linked AWS GovCloud account. Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
         * - Note: Altering the `metric_collection_mode` of an already applied `newrelic.cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
         * 
         * @return builder
         * 
         */
        public Builder metricCollectionMode(@Nullable Output<String> metricCollectionMode) {
            $.metricCollectionMode = metricCollectionMode;
            return this;
        }

        /**
         * @param metricCollectionMode The mode by which metric data is to be collected from the linked AWS GovCloud account. Use `PUSH` for Metric Streams and `PULL` for API Polling based metric collection respectively.
         * - Note: Altering the `metric_collection_mode` of an already applied `newrelic.cloud.AwsGovcloudLinkAccount` resource shall trigger a recreation of the resource, instead of an update.
         * 
         * @return builder
         * 
         */
        public Builder metricCollectionMode(String metricCollectionMode) {
            return metricCollectionMode(Output.of(metricCollectionMode));
        }

        /**
         * @param name The name/identifier of the AWS GovCloud - New Relic &#39;linked&#39; account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name/identifier of the AWS GovCloud - New Relic &#39;linked&#39; account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secretAccessKey The Secret Access Key used to programmatically access the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(@Nullable Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey The Secret Access Key used to programmatically access the AWS GovCloud account.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public AwsGovcloudLinkAccountState build() {
            return $;
        }
    }

}
