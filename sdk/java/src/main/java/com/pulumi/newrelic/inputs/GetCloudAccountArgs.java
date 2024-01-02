// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudAccountArgs Empty = new GetCloudAccountArgs();

    /**
     * The account ID in New Relic.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account ID in New Relic.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The cloud provider of the account (aws, gcp, azure, etc)
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return The cloud provider of the account (aws, gcp, azure, etc)
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * The cloud account name in New Relic.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The cloud account name in New Relic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetCloudAccountArgs() {}

    private GetCloudAccountArgs(GetCloudAccountArgs $) {
        this.accountId = $.accountId;
        this.cloudProvider = $.cloudProvider;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudAccountArgs $;

        public Builder() {
            $ = new GetCloudAccountArgs();
        }

        public Builder(GetCloudAccountArgs defaults) {
            $ = new GetCloudAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param cloudProvider The cloud provider of the account (aws, gcp, azure, etc)
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider The cloud provider of the account (aws, gcp, azure, etc)
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param name The cloud account name in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The cloud account name in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetCloudAccountArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("GetCloudAccountArgs", "cloudProvider");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetCloudAccountArgs", "name");
            }
            return $;
        }
    }

}
