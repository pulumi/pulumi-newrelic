// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OneDashboardPageWidgetStackedBarInitialSortingArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageWidgetStackedBarInitialSortingArgs Empty = new OneDashboardPageWidgetStackedBarInitialSortingArgs();

    /**
     * (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * The title of the dashboard.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private OneDashboardPageWidgetStackedBarInitialSortingArgs() {}

    private OneDashboardPageWidgetStackedBarInitialSortingArgs(OneDashboardPageWidgetStackedBarInitialSortingArgs $) {
        this.direction = $.direction;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageWidgetStackedBarInitialSortingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageWidgetStackedBarInitialSortingArgs $;

        public Builder() {
            $ = new OneDashboardPageWidgetStackedBarInitialSortingArgs();
        }

        public Builder(OneDashboardPageWidgetStackedBarInitialSortingArgs defaults) {
            $ = new OneDashboardPageWidgetStackedBarInitialSortingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OneDashboardPageWidgetStackedBarInitialSortingArgs build() {
            if ($.direction == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetStackedBarInitialSortingArgs", "direction");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("OneDashboardPageWidgetStackedBarInitialSortingArgs", "name");
            }
            return $;
        }
    }

}
