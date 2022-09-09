// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetMetricArgs Empty = new DashboardWidgetMetricArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="units")
    private @Nullable Output<String> units;

    public Optional<Output<String>> units() {
        return Optional.ofNullable(this.units);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private DashboardWidgetMetricArgs() {}

    private DashboardWidgetMetricArgs(DashboardWidgetMetricArgs $) {
        this.name = $.name;
        this.scope = $.scope;
        this.units = $.units;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetMetricArgs $;

        public Builder() {
            $ = new DashboardWidgetMetricArgs();
        }

        public Builder(DashboardWidgetMetricArgs defaults) {
            $ = new DashboardWidgetMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder units(@Nullable Output<String> units) {
            $.units = units;
            return this;
        }

        public Builder units(String units) {
            return units(Output.of(units));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public DashboardWidgetMetricArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}