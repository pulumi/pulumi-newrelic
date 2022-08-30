// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardRawPageWidget;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardRawPage {
    /**
     * @return Brief text describing the dashboard.
     * 
     */
    private @Nullable String description;
    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    private @Nullable String guid;
    /**
     * @return The title of the dashboard.
     * 
     */
    private String name;
    /**
     * @return (Optional) A nested block that describes a widget. See Nested widget blocks below for details.
     * 
     */
    private @Nullable List<OneDashboardRawPageWidget> widgets;

    private OneDashboardRawPage() {}
    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Optional<String> guid() {
        return Optional.ofNullable(this.guid);
    }
    /**
     * @return The title of the dashboard.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) A nested block that describes a widget. See Nested widget blocks below for details.
     * 
     */
    public List<OneDashboardRawPageWidget> widgets() {
        return this.widgets == null ? List.of() : this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardRawPage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String guid;
        private String name;
        private @Nullable List<OneDashboardRawPageWidget> widgets;
        public Builder() {}
        public Builder(OneDashboardRawPage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.guid = defaults.guid;
    	      this.name = defaults.name;
    	      this.widgets = defaults.widgets;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder guid(@Nullable String guid) {
            this.guid = guid;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder widgets(@Nullable List<OneDashboardRawPageWidget> widgets) {
            this.widgets = widgets;
            return this;
        }
        public Builder widgets(OneDashboardRawPageWidget... widgets) {
            return widgets(List.of(widgets));
        }
        public OneDashboardRawPage build() {
            final var o = new OneDashboardRawPage();
            o.description = description;
            o.guid = guid;
            o.name = name;
            o.widgets = widgets;
            return o;
        }
    }
}
