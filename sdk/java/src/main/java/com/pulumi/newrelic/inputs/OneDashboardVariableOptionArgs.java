// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardVariableOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardVariableOptionArgs Empty = new OneDashboardVariableOptionArgs();

    /**
     * (Optional) An argument with a boolean value. With this turned on, the query condition defined with the variable will not be included in the query. Defaults to `false`.
     * 
     */
    @Import(name="excluded")
    private @Nullable Output<Boolean> excluded;

    /**
     * @return (Optional) An argument with a boolean value. With this turned on, the query condition defined with the variable will not be included in the query. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> excluded() {
        return Optional.ofNullable(this.excluded);
    }

    /**
     * (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    @Import(name="ignoreTimeRange")
    private @Nullable Output<Boolean> ignoreTimeRange;

    /**
     * @return (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
     * 
     */
    public Optional<Output<Boolean>> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }

    private OneDashboardVariableOptionArgs() {}

    private OneDashboardVariableOptionArgs(OneDashboardVariableOptionArgs $) {
        this.excluded = $.excluded;
        this.ignoreTimeRange = $.ignoreTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardVariableOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardVariableOptionArgs $;

        public Builder() {
            $ = new OneDashboardVariableOptionArgs();
        }

        public Builder(OneDashboardVariableOptionArgs defaults) {
            $ = new OneDashboardVariableOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excluded (Optional) An argument with a boolean value. With this turned on, the query condition defined with the variable will not be included in the query. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excluded(@Nullable Output<Boolean> excluded) {
            $.excluded = excluded;
            return this;
        }

        /**
         * @param excluded (Optional) An argument with a boolean value. With this turned on, the query condition defined with the variable will not be included in the query. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excluded(Boolean excluded) {
            return excluded(Output.of(excluded));
        }

        /**
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(@Nullable Output<Boolean> ignoreTimeRange) {
            $.ignoreTimeRange = ignoreTimeRange;
            return this;
        }

        /**
         * @param ignoreTimeRange (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
         * 
         * @return builder
         * 
         */
        public Builder ignoreTimeRange(Boolean ignoreTimeRange) {
            return ignoreTimeRange(Output.of(ignoreTimeRange));
        }

        public OneDashboardVariableOptionArgs build() {
            return $;
        }
    }

}
