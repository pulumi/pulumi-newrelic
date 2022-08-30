// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPluginResult {
    private String guid;
    private String id;

    private GetPluginResult() {}
    public String guid() {
        return this.guid;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPluginResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String guid;
        private String id;
        public Builder() {}
        public Builder(GetPluginResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guid = defaults.guid;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder guid(String guid) {
            this.guid = Objects.requireNonNull(guid);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetPluginResult build() {
            final var o = new GetPluginResult();
            o.guid = guid;
            o.id = id;
            return o;
        }
    }
}
