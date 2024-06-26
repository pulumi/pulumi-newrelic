// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLocationState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLocationState Empty = new PrivateLocationState();

    /**
     * The account in which the private location will be created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account in which the private location will be created.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The private location description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The private location description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The private location globally unique identifier.
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    /**
     * @return The private location globally unique identifier.
     * 
     */
    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * The unique client identifier for the private location in New Relic. Same as `id`.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique client identifier for the private location in New Relic. Same as `id`.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The private locations key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The private locations key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * An alternate identifier based on name.
     * 
     */
    @Import(name="locationId")
    private @Nullable Output<String> locationId;

    /**
     * @return An alternate identifier based on name.
     * 
     */
    public Optional<Output<String>> locationId() {
        return Optional.ofNullable(this.locationId);
    }

    /**
     * The name of the private location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the private location.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    @Import(name="verifiedScriptExecution")
    private @Nullable Output<Boolean> verifiedScriptExecution;

    /**
     * @return The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> verifiedScriptExecution() {
        return Optional.ofNullable(this.verifiedScriptExecution);
    }

    private PrivateLocationState() {}

    private PrivateLocationState(PrivateLocationState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.domainId = $.domainId;
        this.guid = $.guid;
        this.key = $.key;
        this.locationId = $.locationId;
        this.name = $.name;
        this.verifiedScriptExecution = $.verifiedScriptExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLocationState $;

        public Builder() {
            $ = new PrivateLocationState();
        }

        public Builder(PrivateLocationState defaults) {
            $ = new PrivateLocationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account in which the private location will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account in which the private location will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The private location description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The private location description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domainId The private location globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId The private location globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param guid The unique client identifier for the private location in New Relic. Same as `id`.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique client identifier for the private location in New Relic. Same as `id`.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param key The private locations key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The private locations key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param locationId An alternate identifier based on name.
         * 
         * @return builder
         * 
         */
        public Builder locationId(@Nullable Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        /**
         * @param locationId An alternate identifier based on name.
         * 
         * @return builder
         * 
         */
        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
        }

        /**
         * @param name The name of the private location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the private location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param verifiedScriptExecution The private location requires a password to edit if value is true. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder verifiedScriptExecution(@Nullable Output<Boolean> verifiedScriptExecution) {
            $.verifiedScriptExecution = verifiedScriptExecution;
            return this;
        }

        /**
         * @param verifiedScriptExecution The private location requires a password to edit if value is true. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder verifiedScriptExecution(Boolean verifiedScriptExecution) {
            return verifiedScriptExecution(Output.of(verifiedScriptExecution));
        }

        public PrivateLocationState build() {
            return $;
        }
    }

}
