// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.GetTestGrokPatternTestGrok;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTestGrokPatternResult {
    private @Nullable Integer accountId;
    private String grok;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> logLines;
    /**
     * @return Nested attribute containing information about the test of Grok pattern against a list of log lines.
     * 
     */
    private List<GetTestGrokPatternTestGrok> testGroks;

    private GetTestGrokPatternResult() {}
    public Optional<Integer> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    public String grok() {
        return this.grok;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> logLines() {
        return this.logLines;
    }
    /**
     * @return Nested attribute containing information about the test of Grok pattern against a list of log lines.
     * 
     */
    public List<GetTestGrokPatternTestGrok> testGroks() {
        return this.testGroks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestGrokPatternResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer accountId;
        private String grok;
        private String id;
        private List<String> logLines;
        private List<GetTestGrokPatternTestGrok> testGroks;
        public Builder() {}
        public Builder(GetTestGrokPatternResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.grok = defaults.grok;
    	      this.id = defaults.id;
    	      this.logLines = defaults.logLines;
    	      this.testGroks = defaults.testGroks;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable Integer accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder grok(String grok) {
            this.grok = Objects.requireNonNull(grok);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logLines(List<String> logLines) {
            this.logLines = Objects.requireNonNull(logLines);
            return this;
        }
        public Builder logLines(String... logLines) {
            return logLines(List.of(logLines));
        }
        @CustomType.Setter
        public Builder testGroks(List<GetTestGrokPatternTestGrok> testGroks) {
            this.testGroks = Objects.requireNonNull(testGroks);
            return this;
        }
        public Builder testGroks(GetTestGrokPatternTestGrok... testGroks) {
            return testGroks(List.of(testGroks));
        }
        public GetTestGrokPatternResult build() {
            final var o = new GetTestGrokPatternResult();
            o.accountId = accountId;
            o.grok = grok;
            o.id = id;
            o.logLines = logLines;
            o.testGroks = testGroks;
            return o;
        }
    }
}
