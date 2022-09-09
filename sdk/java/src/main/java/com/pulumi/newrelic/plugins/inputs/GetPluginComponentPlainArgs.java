// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetPluginComponentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPluginComponentPlainArgs Empty = new GetPluginComponentPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="pluginId", required=true)
    private Integer pluginId;

    public Integer pluginId() {
        return this.pluginId;
    }

    private GetPluginComponentPlainArgs() {}

    private GetPluginComponentPlainArgs(GetPluginComponentPlainArgs $) {
        this.name = $.name;
        this.pluginId = $.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPluginComponentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPluginComponentPlainArgs $;

        public Builder() {
            $ = new GetPluginComponentPlainArgs();
        }

        public Builder(GetPluginComponentPlainArgs defaults) {
            $ = new GetPluginComponentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder pluginId(Integer pluginId) {
            $.pluginId = pluginId;
            return this;
        }

        public GetPluginComponentPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.pluginId = Objects.requireNonNull($.pluginId, "expected parameter 'pluginId' to be non-null");
            return $;
        }
    }

}