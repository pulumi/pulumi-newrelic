// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("newrelic");
    public Integer accountId() {
        return Codegen.integerProp("accountId").config(config).env("NEW_RELIC_ACCOUNT_ID").require();
    }
    public Optional<String> adminApiKey() {
        return Codegen.stringProp("adminApiKey").config(config).get();
    }
    public Optional<String> apiKey() {
        return Codegen.stringProp("apiKey").config(config).get();
    }
    public Optional<String> apiUrl() {
        return Codegen.stringProp("apiUrl").config(config).get();
    }
    public Optional<String> cacertFile() {
        return Codegen.stringProp("cacertFile").config(config).get();
    }
    public Optional<String> infrastructureApiUrl() {
        return Codegen.stringProp("infrastructureApiUrl").config(config).get();
    }
    public Optional<Boolean> insecureSkipVerify() {
        return Codegen.booleanProp("insecureSkipVerify").config(config).get();
    }
    public Optional<String> insightsInsertKey() {
        return Codegen.stringProp("insightsInsertKey").config(config).get();
    }
    public Optional<String> insightsInsertUrl() {
        return Codegen.stringProp("insightsInsertUrl").config(config).get();
    }
    public Optional<String> insightsQueryUrl() {
        return Codegen.stringProp("insightsQueryUrl").config(config).get();
    }
    public Optional<String> nerdgraphApiUrl() {
        return Codegen.stringProp("nerdgraphApiUrl").config(config).get();
    }
/**
 * The data center for which your New Relic account is configured. Only one region per provider block is permitted.
 * 
 */
    public String region() {
        return Codegen.stringProp("region").config(config).env("NEW_RELIC_REGION").def("US").require();
    }
    public Optional<String> syntheticsApiUrl() {
        return Codegen.stringProp("syntheticsApiUrl").config(config).get();
    }
}