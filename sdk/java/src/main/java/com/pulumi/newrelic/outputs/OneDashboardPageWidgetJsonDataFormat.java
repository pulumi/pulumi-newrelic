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
public final class OneDashboardPageWidgetJsonDataFormat {
    /**
     * @return (Optional) This attribute is provided when the `name` is that of a column comprising date/time values and the `type` attribute is set to `custom` defining the specific date format to be applied to your data.
     * 
     */
    private @Nullable String format;
    /**
     * @return The title of the dashboard.
     * 
     */
    private String name;
    /**
     * @return (Optional) This attribute is utilized when the `type` attribute is set to `decimal`, stipulating the precise number of digits after the decimal point for your data.
     * 
     */
    private @Nullable Integer precision;
    /**
     * @return (Required) Specifies the data type of the variable and where its possible values may come from. One of `enum`, `nrql` or `string`
     * 
     */
    private String type;

    private OneDashboardPageWidgetJsonDataFormat() {}
    /**
     * @return (Optional) This attribute is provided when the `name` is that of a column comprising date/time values and the `type` attribute is set to `custom` defining the specific date format to be applied to your data.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return The title of the dashboard.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) This attribute is utilized when the `type` attribute is set to `decimal`, stipulating the precise number of digits after the decimal point for your data.
     * 
     */
    public Optional<Integer> precision() {
        return Optional.ofNullable(this.precision);
    }
    /**
     * @return (Required) Specifies the data type of the variable and where its possible values may come from. One of `enum`, `nrql` or `string`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetJsonDataFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String format;
        private String name;
        private @Nullable Integer precision;
        private String type;
        public Builder() {}
        public Builder(OneDashboardPageWidgetJsonDataFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.precision = defaults.precision;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder format(@Nullable String format) {

            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJsonDataFormat", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder precision(@Nullable Integer precision) {

            this.precision = precision;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("OneDashboardPageWidgetJsonDataFormat", "type");
            }
            this.type = type;
            return this;
        }
        public OneDashboardPageWidgetJsonDataFormat build() {
            final var _resultValue = new OneDashboardPageWidgetJsonDataFormat();
            _resultValue.format = format;
            _resultValue.name = name;
            _resultValue.precision = precision;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
