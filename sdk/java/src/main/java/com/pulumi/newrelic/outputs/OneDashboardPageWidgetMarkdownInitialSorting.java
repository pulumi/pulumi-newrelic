// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OneDashboardPageWidgetMarkdownInitialSorting {
    /**
     * @return (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
     * 
     */
    private String direction;
    /**
     * @return The title of the dashboard.
     * 
     */
    private String name;

    private OneDashboardPageWidgetMarkdownInitialSorting() {}
    /**
     * @return (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The title of the dashboard.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetMarkdownInitialSorting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String direction;
        private String name;
        public Builder() {}
        public Builder(OneDashboardPageWidgetMarkdownInitialSorting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetMarkdownInitialSorting", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetMarkdownInitialSorting", "name");
            }
            this.name = name;
            return this;
        }
        public OneDashboardPageWidgetMarkdownInitialSorting build() {
            final var _resultValue = new OneDashboardPageWidgetMarkdownInitialSorting();
            _resultValue.direction = direction;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
