// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKeyTransactionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyTransactionArgs Empty = new GetKeyTransactionArgs();

    /**
     * The name of the key transaction in New Relic.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the key transaction in New Relic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetKeyTransactionArgs() {}

    private GetKeyTransactionArgs(GetKeyTransactionArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyTransactionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyTransactionArgs $;

        public Builder() {
            $ = new GetKeyTransactionArgs();
        }

        public Builder(GetKeyTransactionArgs defaults) {
            $ = new GetKeyTransactionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the key transaction in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key transaction in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetKeyTransactionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetKeyTransactionArgs", "name");
            }
            return $;
        }
    }

}
