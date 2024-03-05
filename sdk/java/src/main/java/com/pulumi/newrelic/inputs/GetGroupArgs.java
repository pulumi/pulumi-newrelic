// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    /**
     * The ID of the authentication domain the group to be searched for belongs to.
     * 
     */
    @Import(name="authenticationDomainId", required=true)
    private Output<String> authenticationDomainId;

    /**
     * @return The ID of the authentication domain the group to be searched for belongs to.
     * 
     */
    public Output<String> authenticationDomainId() {
        return this.authenticationDomainId;
    }

    /**
     * The name of the group to search for.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the group to search for.
     * 
     * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetGroupArgs() {}

    private GetGroupArgs(GetGroupArgs $) {
        this.authenticationDomainId = $.authenticationDomainId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupArgs $;

        public Builder() {
            $ = new GetGroupArgs();
        }

        public Builder(GetGroupArgs defaults) {
            $ = new GetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationDomainId The ID of the authentication domain the group to be searched for belongs to.
         * 
         * @return builder
         * 
         */
        public Builder authenticationDomainId(Output<String> authenticationDomainId) {
            $.authenticationDomainId = authenticationDomainId;
            return this;
        }

        /**
         * @param authenticationDomainId The ID of the authentication domain the group to be searched for belongs to.
         * 
         * @return builder
         * 
         */
        public Builder authenticationDomainId(String authenticationDomainId) {
            return authenticationDomainId(Output.of(authenticationDomainId));
        }

        /**
         * @param name The name of the group to search for.
         * 
         * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the group to search for.
         * 
         * &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetGroupArgs build() {
            if ($.authenticationDomainId == null) {
                throw new MissingRequiredPropertyException("GetGroupArgs", "authenticationDomainId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGroupArgs", "name");
            }
            return $;
        }
    }

}
