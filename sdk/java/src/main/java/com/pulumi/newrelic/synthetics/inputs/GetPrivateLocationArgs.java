// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateLocationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLocationArgs Empty = new GetPrivateLocationArgs();

    /**
     * The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The key of the private location.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<String>> keys;

    /**
     * @return The key of the private location.
     * 
     */
    public Optional<Output<List<String>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The name of the Synthetics monitor private location.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Synthetics monitor private location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetPrivateLocationArgs() {}

    private GetPrivateLocationArgs(GetPrivateLocationArgs $) {
        this.accountId = $.accountId;
        this.keys = $.keys;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLocationArgs $;

        public Builder() {
            $ = new GetPrivateLocationArgs();
        }

        public Builder(GetPrivateLocationArgs defaults) {
            $ = new GetPrivateLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param keys The key of the private location.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<String>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys The key of the private location.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<String> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys The key of the private location.
         * 
         * @return builder
         * 
         */
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param name The name of the Synthetics monitor private location.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Synthetics monitor private location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetPrivateLocationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPrivateLocationArgs", "name");
            }
            return $;
        }
    }

}
