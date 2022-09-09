// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecureCredentialPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecureCredentialPlainArgs Empty = new GetSecureCredentialPlainArgs();

    /**
     * The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     * 
     */
    public String key() {
        return this.key;
    }

    private GetSecureCredentialPlainArgs() {}

    private GetSecureCredentialPlainArgs(GetSecureCredentialPlainArgs $) {
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecureCredentialPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecureCredentialPlainArgs $;

        public Builder() {
            $ = new GetSecureCredentialPlainArgs();
        }

        public Builder(GetSecureCredentialPlainArgs defaults) {
            $ = new GetSecureCredentialPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public GetSecureCredentialPlainArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}