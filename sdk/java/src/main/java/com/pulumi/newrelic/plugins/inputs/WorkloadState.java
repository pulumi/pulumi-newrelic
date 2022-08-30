// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadState extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadState Empty = new WorkloadState();

    /**
     * The New Relic account ID where you want to create the workload.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID where you want to create the workload.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The composite query used to compose a dynamic workload.
     * 
     */
    @Import(name="compositeEntitySearchQuery")
    private @Nullable Output<String> compositeEntitySearchQuery;

    /**
     * @return The composite query used to compose a dynamic workload.
     * 
     */
    public Optional<Output<String>> compositeEntitySearchQuery() {
        return Optional.ofNullable(this.compositeEntitySearchQuery);
    }

    /**
     * A list of entity GUIDs manually assigned to this workload.
     * 
     */
    @Import(name="entityGuids")
    private @Nullable Output<List<String>> entityGuids;

    /**
     * @return A list of entity GUIDs manually assigned to this workload.
     * 
     */
    public Optional<Output<List<String>>> entityGuids() {
        return Optional.ofNullable(this.entityGuids);
    }

    /**
     * A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
     * 
     */
    @Import(name="entitySearchQueries")
    private @Nullable Output<List<WorkloadEntitySearchQueryArgs>> entitySearchQueries;

    /**
     * @return A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
     * 
     */
    public Optional<Output<List<WorkloadEntitySearchQueryArgs>>> entitySearchQueries() {
        return Optional.ofNullable(this.entitySearchQueries);
    }

    /**
     * The unique entity identifier of the workload in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the workload in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The workload&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The workload&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the workload.
     * 
     */
    @Import(name="permalink")
    private @Nullable Output<String> permalink;

    /**
     * @return The URL of the workload.
     * 
     */
    public Optional<Output<String>> permalink() {
        return Optional.ofNullable(this.permalink);
    }

    /**
     * A list of account IDs that will be used to get entities from.
     * 
     */
    @Import(name="scopeAccountIds")
    private @Nullable Output<List<Integer>> scopeAccountIds;

    /**
     * @return A list of account IDs that will be used to get entities from.
     * 
     */
    public Optional<Output<List<Integer>>> scopeAccountIds() {
        return Optional.ofNullable(this.scopeAccountIds);
    }

    /**
     * The unique entity identifier of the workload.
     * 
     */
    @Import(name="workloadId")
    private @Nullable Output<Integer> workloadId;

    /**
     * @return The unique entity identifier of the workload.
     * 
     */
    public Optional<Output<Integer>> workloadId() {
        return Optional.ofNullable(this.workloadId);
    }

    private WorkloadState() {}

    private WorkloadState(WorkloadState $) {
        this.accountId = $.accountId;
        this.compositeEntitySearchQuery = $.compositeEntitySearchQuery;
        this.entityGuids = $.entityGuids;
        this.entitySearchQueries = $.entitySearchQueries;
        this.guid = $.guid;
        this.name = $.name;
        this.permalink = $.permalink;
        this.scopeAccountIds = $.scopeAccountIds;
        this.workloadId = $.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadState $;

        public Builder() {
            $ = new WorkloadState();
        }

        public Builder(WorkloadState defaults) {
            $ = new WorkloadState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID where you want to create the workload.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID where you want to create the workload.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param compositeEntitySearchQuery The composite query used to compose a dynamic workload.
         * 
         * @return builder
         * 
         */
        public Builder compositeEntitySearchQuery(@Nullable Output<String> compositeEntitySearchQuery) {
            $.compositeEntitySearchQuery = compositeEntitySearchQuery;
            return this;
        }

        /**
         * @param compositeEntitySearchQuery The composite query used to compose a dynamic workload.
         * 
         * @return builder
         * 
         */
        public Builder compositeEntitySearchQuery(String compositeEntitySearchQuery) {
            return compositeEntitySearchQuery(Output.of(compositeEntitySearchQuery));
        }

        /**
         * @param entityGuids A list of entity GUIDs manually assigned to this workload.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(@Nullable Output<List<String>> entityGuids) {
            $.entityGuids = entityGuids;
            return this;
        }

        /**
         * @param entityGuids A list of entity GUIDs manually assigned to this workload.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(List<String> entityGuids) {
            return entityGuids(Output.of(entityGuids));
        }

        /**
         * @param entityGuids A list of entity GUIDs manually assigned to this workload.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(String... entityGuids) {
            return entityGuids(List.of(entityGuids));
        }

        /**
         * @param entitySearchQueries A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(@Nullable Output<List<WorkloadEntitySearchQueryArgs>> entitySearchQueries) {
            $.entitySearchQueries = entitySearchQueries;
            return this;
        }

        /**
         * @param entitySearchQueries A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(List<WorkloadEntitySearchQueryArgs> entitySearchQueries) {
            return entitySearchQueries(Output.of(entitySearchQueries));
        }

        /**
         * @param entitySearchQueries A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(WorkloadEntitySearchQueryArgs... entitySearchQueries) {
            return entitySearchQueries(List.of(entitySearchQueries));
        }

        /**
         * @param guid The unique entity identifier of the workload in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the workload in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param name The workload&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The workload&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param permalink The URL of the workload.
         * 
         * @return builder
         * 
         */
        public Builder permalink(@Nullable Output<String> permalink) {
            $.permalink = permalink;
            return this;
        }

        /**
         * @param permalink The URL of the workload.
         * 
         * @return builder
         * 
         */
        public Builder permalink(String permalink) {
            return permalink(Output.of(permalink));
        }

        /**
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(@Nullable Output<List<Integer>> scopeAccountIds) {
            $.scopeAccountIds = scopeAccountIds;
            return this;
        }

        /**
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(List<Integer> scopeAccountIds) {
            return scopeAccountIds(Output.of(scopeAccountIds));
        }

        /**
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(Integer... scopeAccountIds) {
            return scopeAccountIds(List.of(scopeAccountIds));
        }

        /**
         * @param workloadId The unique entity identifier of the workload.
         * 
         * @return builder
         * 
         */
        public Builder workloadId(@Nullable Output<Integer> workloadId) {
            $.workloadId = workloadId;
            return this;
        }

        /**
         * @param workloadId The unique entity identifier of the workload.
         * 
         * @return builder
         * 
         */
        public Builder workloadId(Integer workloadId) {
            return workloadId(Output.of(workloadId));
        }

        public WorkloadState build() {
            return $;
        }
    }

}
