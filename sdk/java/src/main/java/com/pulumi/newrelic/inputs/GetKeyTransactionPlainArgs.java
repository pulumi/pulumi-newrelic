// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyTransactionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyTransactionPlainArgs Empty = new GetKeyTransactionPlainArgs();

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
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}