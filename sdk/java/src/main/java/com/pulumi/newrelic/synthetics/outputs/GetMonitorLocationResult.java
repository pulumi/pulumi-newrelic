// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMonitorLocationResult {
    /**
     * @return A description of the Synthetics monitor location.
     * 
     */
    private String description;
    /**
     * @return Represents if high security mode is enabled for the location. A value of true means that high security mode is enabled, and a value of false means it is disabled.
     * 
     */
    private Boolean highSecurityMode;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String label;
    /**
     * @return The name of the Synthetics monitor location.
     * 
     */
    private String name;
    /**
     * @return Represents if this location is a private location. A value of true means that the location is private, and a value of false means it is public.
     * 
     */
    private Boolean private_;

    private GetMonitorLocationResult() {}
    /**
     * @return A description of the Synthetics monitor location.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Represents if high security mode is enabled for the location. A value of true means that high security mode is enabled, and a value of false means it is disabled.
     * 
     */
    public Boolean highSecurityMode() {
        return this.highSecurityMode;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String label() {
        return this.label;
    }
    /**
     * @return The name of the Synthetics monitor location.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Represents if this location is a private location. A value of true means that the location is private, and a value of false means it is public.
     * 
     */
    public Boolean private_() {
        return this.private_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorLocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Boolean highSecurityMode;
        private String id;
        private String label;
        private String name;
        private Boolean private_;
        public Builder() {}
        public Builder(GetMonitorLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.highSecurityMode = defaults.highSecurityMode;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.private_ = defaults.private_;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder highSecurityMode(Boolean highSecurityMode) {
            this.highSecurityMode = Objects.requireNonNull(highSecurityMode);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter("private")
        public Builder private_(Boolean private_) {
            this.private_ = Objects.requireNonNull(private_);
            return this;
        }
        public GetMonitorLocationResult build() {
            final var o = new GetMonitorLocationResult();
            o.description = description;
            o.highSecurityMode = highSecurityMode;
            o.id = id;
            o.label = label;
            o.name = name;
            o.private_ = private_;
            return o;
        }
    }
}
