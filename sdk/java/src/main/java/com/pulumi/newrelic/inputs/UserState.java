// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The ID of the authentication domain to which the user to be created would belong.
     * 
     */
    @Import(name="authenticationDomainId")
    private @Nullable Output<String> authenticationDomainId;

    /**
     * @return The ID of the authentication domain to which the user to be created would belong.
     * 
     */
    public Optional<Output<String>> authenticationDomainId() {
        return Optional.ofNullable(this.authenticationDomainId);
    }

    /**
     * The email ID of the user to be created.
     * 
     */
    @Import(name="emailId")
    private @Nullable Output<String> emailId;

    /**
     * @return The email ID of the user to be created.
     * 
     */
    public Optional<Output<String>> emailId() {
        return Optional.ofNullable(this.emailId);
    }

    /**
     * The name of the user to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
     * 
     */
    @Import(name="userType")
    private @Nullable Output<String> userType;

    /**
     * @return The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
     * 
     */
    public Optional<Output<String>> userType() {
        return Optional.ofNullable(this.userType);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.authenticationDomainId = $.authenticationDomainId;
        this.emailId = $.emailId;
        this.name = $.name;
        this.userType = $.userType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationDomainId The ID of the authentication domain to which the user to be created would belong.
         * 
         * @return builder
         * 
         */
        public Builder authenticationDomainId(@Nullable Output<String> authenticationDomainId) {
            $.authenticationDomainId = authenticationDomainId;
            return this;
        }

        /**
         * @param authenticationDomainId The ID of the authentication domain to which the user to be created would belong.
         * 
         * @return builder
         * 
         */
        public Builder authenticationDomainId(String authenticationDomainId) {
            return authenticationDomainId(Output.of(authenticationDomainId));
        }

        /**
         * @param emailId The email ID of the user to be created.
         * 
         * @return builder
         * 
         */
        public Builder emailId(@Nullable Output<String> emailId) {
            $.emailId = emailId;
            return this;
        }

        /**
         * @param emailId The email ID of the user to be created.
         * 
         * @return builder
         * 
         */
        public Builder emailId(String emailId) {
            return emailId(Output.of(emailId));
        }

        /**
         * @param name The name of the user to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param userType The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
         * 
         * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
         * 
         * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
         * 
         * @return builder
         * 
         */
        public Builder userType(@Nullable Output<String> userType) {
            $.userType = userType;
            return this;
        }

        /**
         * @param userType The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
         * 
         * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
         * 
         * &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
         * 
         * @return builder
         * 
         */
        public Builder userType(String userType) {
            return userType(Output.of(userType));
        }

        public UserState build() {
            return $;
        }
    }

}