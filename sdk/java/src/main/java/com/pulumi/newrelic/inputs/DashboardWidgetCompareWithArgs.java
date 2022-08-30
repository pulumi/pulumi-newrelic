// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.DashboardWidgetCompareWithPresentationArgs;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetCompareWithArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetCompareWithArgs Empty = new DashboardWidgetCompareWithArgs();

    @Import(name="offsetDuration", required=true)
    private Output<String> offsetDuration;

    public Output<String> offsetDuration() {
        return this.offsetDuration;
    }

    @Import(name="presentation", required=true)
    private Output<DashboardWidgetCompareWithPresentationArgs> presentation;

    public Output<DashboardWidgetCompareWithPresentationArgs> presentation() {
        return this.presentation;
    }

    private DashboardWidgetCompareWithArgs() {}

    private DashboardWidgetCompareWithArgs(DashboardWidgetCompareWithArgs $) {
        this.offsetDuration = $.offsetDuration;
        this.presentation = $.presentation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetCompareWithArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetCompareWithArgs $;

        public Builder() {
            $ = new DashboardWidgetCompareWithArgs();
        }

        public Builder(DashboardWidgetCompareWithArgs defaults) {
            $ = new DashboardWidgetCompareWithArgs(Objects.requireNonNull(defaults));
        }

        public Builder offsetDuration(Output<String> offsetDuration) {
            $.offsetDuration = offsetDuration;
            return this;
        }

        public Builder offsetDuration(String offsetDuration) {
            return offsetDuration(Output.of(offsetDuration));
        }

        public Builder presentation(Output<DashboardWidgetCompareWithPresentationArgs> presentation) {
            $.presentation = presentation;
            return this;
        }

        public Builder presentation(DashboardWidgetCompareWithPresentationArgs presentation) {
            return presentation(Output.of(presentation));
        }

        public DashboardWidgetCompareWithArgs build() {
            $.offsetDuration = Objects.requireNonNull($.offsetDuration, "expected parameter 'offsetDuration' to be non-null");
            $.presentation = Objects.requireNonNull($.presentation, "expected parameter 'presentation' to be non-null");
            return $;
        }
    }

}
