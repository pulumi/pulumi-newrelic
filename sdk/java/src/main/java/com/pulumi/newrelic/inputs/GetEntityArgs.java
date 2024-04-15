// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.inputs.GetEntityTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntityArgs Empty = new GetEntityArgs();

    /**
     * The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The entity&#39;s domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The entity&#39;s domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Ignore case of the `name` when searching for the entity. Defaults to false.
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    /**
     * @return Ignore case of the `name` when searching for the entity. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
     * 
     * &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an &#39;entity not found&#39; warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
     * 
     */
    @Import(name="ignoreNotFound")
    private @Nullable Output<Boolean> ignoreNotFound;

    /**
     * @return A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
     * 
     * &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an &#39;entity not found&#39; warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
     * 
     */
    public Optional<Output<Boolean>> ignoreNotFound() {
        return Optional.ofNullable(this.ignoreNotFound);
    }

    /**
     * The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A tag applied to the entity. See Nested tag blocks below for details.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<GetEntityTagArgs>> tags;

    /**
     * @return A tag applied to the entity. See Nested tag blocks below for details.
     * 
     */
    public Optional<Output<List<GetEntityTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The entity&#39;s type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The entity&#39;s type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetEntityArgs() {}

    private GetEntityArgs(GetEntityArgs $) {
        this.accountId = $.accountId;
        this.domain = $.domain;
        this.ignoreCase = $.ignoreCase;
        this.ignoreNotFound = $.ignoreNotFound;
        this.name = $.name;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntityArgs $;

        public Builder() {
            $ = new GetEntityArgs();
        }

        public Builder(GetEntityArgs defaults) {
            $ = new GetEntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param domain The entity&#39;s domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The entity&#39;s domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param ignoreCase Ignore case of the `name` when searching for the entity. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * @param ignoreCase Ignore case of the `name` when searching for the entity. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        /**
         * @param ignoreNotFound A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
         * 
         * &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an &#39;entity not found&#39; warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNotFound(@Nullable Output<Boolean> ignoreNotFound) {
            $.ignoreNotFound = ignoreNotFound;
            return this;
        }

        /**
         * @param ignoreNotFound A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
         * 
         * &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an &#39;entity not found&#39; warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNotFound(Boolean ignoreNotFound) {
            return ignoreNotFound(Output.of(ignoreNotFound));
        }

        /**
         * @param name The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A tag applied to the entity. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<GetEntityTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag applied to the entity. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<GetEntityTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag applied to the entity. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetEntityTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The entity&#39;s type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The entity&#39;s type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetEntityArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetEntityArgs", "name");
            }
            return $;
        }
    }

}
