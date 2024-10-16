// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyTransactionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyTransactionPlainArgs Empty = new GetKeyTransactionPlainArgs();

    /**
     * GUID of the key transaction in New Relic.
     * 
     * &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
     * 
     */
    @Import(name="guid")
    private @Nullable String guid;

    /**
     * @return GUID of the key transaction in New Relic.
     * 
     * &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
     * 
     */
    public Optional<String> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The name of the key transaction in New Relic.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the key transaction in New Relic.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetKeyTransactionPlainArgs() {}

    private GetKeyTransactionPlainArgs(GetKeyTransactionPlainArgs $) {
        this.guid = $.guid;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyTransactionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyTransactionPlainArgs $;

        public Builder() {
            $ = new GetKeyTransactionPlainArgs();
        }

        public Builder(GetKeyTransactionPlainArgs defaults) {
            $ = new GetKeyTransactionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param guid GUID of the key transaction in New Relic.
         * 
         * &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable String guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param name The name of the key transaction in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetKeyTransactionPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetKeyTransactionPlainArgs", "name");
            }
            return $;
        }
    }

}
