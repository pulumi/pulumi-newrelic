// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiAccessKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiAccessKeyArgs Empty = new ApiAccessKeyArgs();

    /**
     * The New Relic account ID of the account you wish to create the API access key.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID of the account you wish to create the API access key.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }

    /**
     * Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     * 
     */
    @Import(name="ingestType")
    private @Nullable Output<String> ingestType;

    /**
     * @return Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     * 
     */
    public Optional<Output<String>> ingestType() {
        return Optional.ofNullable(this.ingestType);
    }

    /**
     * What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     * 
     */
    @Import(name="keyType", required=true)
    private Output<String> keyType;

    /**
     * @return What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     * 
     */
    public Output<String> keyType() {
        return this.keyType;
    }

    /**
     * The name of the key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Any notes about this ingest key.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return Any notes about this ingest key.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<Integer> userId;

    /**
     * @return Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     * 
     */
    public Optional<Output<Integer>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private ApiAccessKeyArgs() {}

    private ApiAccessKeyArgs(ApiAccessKeyArgs $) {
        this.accountId = $.accountId;
        this.ingestType = $.ingestType;
        this.keyType = $.keyType;
        this.name = $.name;
        this.notes = $.notes;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiAccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiAccessKeyArgs $;

        public Builder() {
            $ = new ApiAccessKeyArgs();
        }

        public Builder(ApiAccessKeyArgs defaults) {
            $ = new ApiAccessKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID of the account you wish to create the API access key.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID of the account you wish to create the API access key.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param ingestType Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ingestType(@Nullable Output<String> ingestType) {
            $.ingestType = ingestType;
            return this;
        }

        /**
         * @param ingestType Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ingestType(String ingestType) {
            return ingestType(Output.of(ingestType));
        }

        /**
         * @param keyType What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder keyType(Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param name The name of the key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notes Any notes about this ingest key.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes Any notes about this ingest key.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param userId Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<Integer> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
         * 
         * @return builder
         * 
         */
        public Builder userId(Integer userId) {
            return userId(Output.of(userId));
        }

        public ApiAccessKeyArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ApiAccessKeyArgs", "accountId");
            }
            if ($.keyType == null) {
                throw new MissingRequiredPropertyException("ApiAccessKeyArgs", "keyType");
            }
            return $;
        }
    }

}
