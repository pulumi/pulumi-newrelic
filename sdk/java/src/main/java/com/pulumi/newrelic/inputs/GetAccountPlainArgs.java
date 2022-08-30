// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * The account ID in New Relic.
     * 
     */
    @Import(name="accountId")
    private @Nullable Integer accountId;

    /**
     * @return The account ID in New Relic.
     * 
     */
    public Optional<Integer> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The account name in New Relic.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The account name in New Relic.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The scope of the account in New Relic.  Valid values are &#34;global&#34; and &#34;in_region&#34;.  Defaults to &#34;in_region&#34;.
     * 
     */
    @Import(name="scope")
    private @Nullable String scope;

    /**
     * @return The scope of the account in New Relic.  Valid values are &#34;global&#34; and &#34;in_region&#34;.  Defaults to &#34;in_region&#34;.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Integer accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name The account name in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param scope The scope of the account in New Relic.  Valid values are &#34;global&#34; and &#34;in_region&#34;.  Defaults to &#34;in_region&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        public GetAccountPlainArgs build() {
            return $;
        }
    }

}
