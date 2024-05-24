// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountManagementArgs Empty = new AccountManagementArgs();

    /**
     * The name of the Account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The region code of the account.  One of: `us01`, `eu01`.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region code of the account.  One of: `us01`, `eu01`.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private AccountManagementArgs() {}

    private AccountManagementArgs(AccountManagementArgs $) {
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountManagementArgs $;

        public Builder() {
            $ = new AccountManagementArgs();
        }

        public Builder(AccountManagementArgs defaults) {
            $ = new AccountManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region code of the account.  One of: `us01`, `eu01`.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region code of the account.  One of: `us01`, `eu01`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public AccountManagementArgs build() {
            if ($.region == null) {
                throw new MissingRequiredPropertyException("AccountManagementArgs", "region");
            }
            return $;
        }
    }

}
