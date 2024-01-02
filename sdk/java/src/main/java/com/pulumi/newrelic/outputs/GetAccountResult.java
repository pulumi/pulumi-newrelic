// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    private @Nullable Integer accountId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String name;
    private @Nullable String scope;

    private GetAccountResult() {}
    public Optional<Integer> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer accountId;
        private String id;
        private @Nullable String name;
        private @Nullable String scope;
        public Builder() {}
        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable Integer accountId) {

            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        public GetAccountResult build() {
            final var _resultValue = new GetAccountResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
