// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="adminApiKey")
    private @Nullable Output<String> adminApiKey;

    public Optional<Output<String>> adminApiKey() {
        return Optional.ofNullable(this.adminApiKey);
    }

    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    @Import(name="apiUrl")
    private @Nullable Output<String> apiUrl;

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    public Optional<Output<String>> apiUrl() {
        return Optional.ofNullable(this.apiUrl);
    }

    @Import(name="cacertFile")
    private @Nullable Output<String> cacertFile;

    public Optional<Output<String>> cacertFile() {
        return Optional.ofNullable(this.cacertFile);
    }

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    @Import(name="infrastructureApiUrl")
    private @Nullable Output<String> infrastructureApiUrl;

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    public Optional<Output<String>> infrastructureApiUrl() {
        return Optional.ofNullable(this.infrastructureApiUrl);
    }

    @Import(name="insecureSkipVerify", json=true)
    private @Nullable Output<Boolean> insecureSkipVerify;

    public Optional<Output<Boolean>> insecureSkipVerify() {
        return Optional.ofNullable(this.insecureSkipVerify);
    }

    @Import(name="insightsInsertKey")
    private @Nullable Output<String> insightsInsertKey;

    public Optional<Output<String>> insightsInsertKey() {
        return Optional.ofNullable(this.insightsInsertKey);
    }

    @Import(name="insightsInsertUrl")
    private @Nullable Output<String> insightsInsertUrl;

    public Optional<Output<String>> insightsInsertUrl() {
        return Optional.ofNullable(this.insightsInsertUrl);
    }

    @Import(name="insightsQueryUrl")
    private @Nullable Output<String> insightsQueryUrl;

    public Optional<Output<String>> insightsQueryUrl() {
        return Optional.ofNullable(this.insightsQueryUrl);
    }

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    @Import(name="nerdgraphApiUrl")
    private @Nullable Output<String> nerdgraphApiUrl;

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    public Optional<Output<String>> nerdgraphApiUrl() {
        return Optional.ofNullable(this.nerdgraphApiUrl);
    }

    /**
     * The data center for which your New Relic account is configured. Only one region per provider block is permitted.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The data center for which your New Relic account is configured. Only one region per provider block is permitted.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    @Import(name="syntheticsApiUrl")
    private @Nullable Output<String> syntheticsApiUrl;

    /**
     * @deprecated
     * New Relic internal use only. API URLs are now configured based on the configured region.
     * 
     */
    @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
    public Optional<Output<String>> syntheticsApiUrl() {
        return Optional.ofNullable(this.syntheticsApiUrl);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accountId = $.accountId;
        this.adminApiKey = $.adminApiKey;
        this.apiKey = $.apiKey;
        this.apiUrl = $.apiUrl;
        this.cacertFile = $.cacertFile;
        this.infrastructureApiUrl = $.infrastructureApiUrl;
        this.insecureSkipVerify = $.insecureSkipVerify;
        this.insightsInsertKey = $.insightsInsertKey;
        this.insightsInsertUrl = $.insightsInsertUrl;
        this.insightsQueryUrl = $.insightsQueryUrl;
        this.nerdgraphApiUrl = $.nerdgraphApiUrl;
        this.region = $.region;
        this.syntheticsApiUrl = $.syntheticsApiUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder adminApiKey(@Nullable Output<String> adminApiKey) {
            $.adminApiKey = adminApiKey;
            return this;
        }

        public Builder adminApiKey(String adminApiKey) {
            return adminApiKey(Output.of(adminApiKey));
        }

        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder apiUrl(@Nullable Output<String> apiUrl) {
            $.apiUrl = apiUrl;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder apiUrl(String apiUrl) {
            return apiUrl(Output.of(apiUrl));
        }

        public Builder cacertFile(@Nullable Output<String> cacertFile) {
            $.cacertFile = cacertFile;
            return this;
        }

        public Builder cacertFile(String cacertFile) {
            return cacertFile(Output.of(cacertFile));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder infrastructureApiUrl(@Nullable Output<String> infrastructureApiUrl) {
            $.infrastructureApiUrl = infrastructureApiUrl;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder infrastructureApiUrl(String infrastructureApiUrl) {
            return infrastructureApiUrl(Output.of(infrastructureApiUrl));
        }

        public Builder insecureSkipVerify(@Nullable Output<Boolean> insecureSkipVerify) {
            $.insecureSkipVerify = insecureSkipVerify;
            return this;
        }

        public Builder insecureSkipVerify(Boolean insecureSkipVerify) {
            return insecureSkipVerify(Output.of(insecureSkipVerify));
        }

        public Builder insightsInsertKey(@Nullable Output<String> insightsInsertKey) {
            $.insightsInsertKey = insightsInsertKey;
            return this;
        }

        public Builder insightsInsertKey(String insightsInsertKey) {
            return insightsInsertKey(Output.of(insightsInsertKey));
        }

        public Builder insightsInsertUrl(@Nullable Output<String> insightsInsertUrl) {
            $.insightsInsertUrl = insightsInsertUrl;
            return this;
        }

        public Builder insightsInsertUrl(String insightsInsertUrl) {
            return insightsInsertUrl(Output.of(insightsInsertUrl));
        }

        public Builder insightsQueryUrl(@Nullable Output<String> insightsQueryUrl) {
            $.insightsQueryUrl = insightsQueryUrl;
            return this;
        }

        public Builder insightsQueryUrl(String insightsQueryUrl) {
            return insightsQueryUrl(Output.of(insightsQueryUrl));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder nerdgraphApiUrl(@Nullable Output<String> nerdgraphApiUrl) {
            $.nerdgraphApiUrl = nerdgraphApiUrl;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder nerdgraphApiUrl(String nerdgraphApiUrl) {
            return nerdgraphApiUrl(Output.of(nerdgraphApiUrl));
        }

        /**
         * @param region The data center for which your New Relic account is configured. Only one region per provider block is permitted.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The data center for which your New Relic account is configured. Only one region per provider block is permitted.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder syntheticsApiUrl(@Nullable Output<String> syntheticsApiUrl) {
            $.syntheticsApiUrl = syntheticsApiUrl;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * New Relic internal use only. API URLs are now configured based on the configured region.
         * 
         */
        @Deprecated /* New Relic internal use only. API URLs are now configured based on the configured region. */
        public Builder syntheticsApiUrl(String syntheticsApiUrl) {
            return syntheticsApiUrl(Output.of(syntheticsApiUrl));
        }

        public ProviderArgs build() {
            $.accountId = Codegen.stringProp("accountId").secret().arg($.accountId).env("NEW_RELIC_ACCOUNT_ID").getNullable();
            $.region = Codegen.stringProp("region").output().arg($.region).env("NEW_RELIC_REGION").def("US").getNullable();
            return $;
        }
    }

}
