// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.GetTestGrokPatternTestGrokAttribute;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTestGrokPatternTestGrok {
    /**
     * @return Nested list containing information about any attributes that were extracted.
     * 
     */
    private List<GetTestGrokPatternTestGrokAttribute> attributes;
    /**
     * @return The log line that was tested against.
     * 
     */
    private String logLine;
    /**
     * @return Whether the Grok pattern matched.
     * 
     */
    private Boolean matched;

    private GetTestGrokPatternTestGrok() {}
    /**
     * @return Nested list containing information about any attributes that were extracted.
     * 
     */
    public List<GetTestGrokPatternTestGrokAttribute> attributes() {
        return this.attributes;
    }
    /**
     * @return The log line that was tested against.
     * 
     */
    public String logLine() {
        return this.logLine;
    }
    /**
     * @return Whether the Grok pattern matched.
     * 
     */
    public Boolean matched() {
        return this.matched;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestGrokPatternTestGrok defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTestGrokPatternTestGrokAttribute> attributes;
        private String logLine;
        private Boolean matched;
        public Builder() {}
        public Builder(GetTestGrokPatternTestGrok defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.logLine = defaults.logLine;
    	      this.matched = defaults.matched;
        }

        @CustomType.Setter
        public Builder attributes(List<GetTestGrokPatternTestGrokAttribute> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GetTestGrokPatternTestGrokAttribute... attributes) {
            return attributes(List.of(attributes));
        }
        @CustomType.Setter
        public Builder logLine(String logLine) {
            this.logLine = Objects.requireNonNull(logLine);
            return this;
        }
        @CustomType.Setter
        public Builder matched(Boolean matched) {
            this.matched = Objects.requireNonNull(matched);
            return this;
        }
        public GetTestGrokPatternTestGrok build() {
            final var _resultValue = new GetTestGrokPatternTestGrok();
            _resultValue.attributes = attributes;
            _resultValue.logLine = logLine;
            _resultValue.matched = matched;
            return _resultValue;
        }
    }
}
