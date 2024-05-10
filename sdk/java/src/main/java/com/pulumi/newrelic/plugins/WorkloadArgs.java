// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.plugins.inputs.WorkloadEntitySearchQueryArgs;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticArgs;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigStaticArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * The New Relic account ID where you want to create the workload.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The New Relic account ID where you want to create the workload.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Relevant information about the workload.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Relevant information about the workload.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * A list of search queries that define a dynamic workload.
     * 
     */
    @Import(name="entitySearchQueries")
    private @Nullable Output<List<WorkloadEntitySearchQueryArgs>> entitySearchQueries;

    /**
     * @return A list of search queries that define a dynamic workload.
     * 
     */
    public Optional<Output<List<WorkloadEntitySearchQueryArgs>>> entitySearchQueries() {
        return Optional.ofNullable(this.entitySearchQueries);
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
     * A list of account IDs that will be used to get entities from.
     * 
     */
    @Import(name="scopeAccountIds")
    private @Nullable Output<List<String>> scopeAccountIds;

    /**
     * @return A list of account IDs that will be used to get entities from.
     * 
     */
    public Optional<Output<List<String>>> scopeAccountIds() {
        return Optional.ofNullable(this.scopeAccountIds);
    }

    /**
     * An input object used to represent an automatic status configuration.
     * 
     */
    @Import(name="statusConfigAutomatic")
    private @Nullable Output<WorkloadStatusConfigAutomaticArgs> statusConfigAutomatic;

    /**
     * @return An input object used to represent an automatic status configuration.
     * 
     */
    public Optional<Output<WorkloadStatusConfigAutomaticArgs>> statusConfigAutomatic() {
        return Optional.ofNullable(this.statusConfigAutomatic);
    }

    /**
     * A list of static status configurations. You can only configure one static status for a workload.
     * 
     */
    @Import(name="statusConfigStatic")
    private @Nullable Output<WorkloadStatusConfigStaticArgs> statusConfigStatic;

    /**
     * @return A list of static status configurations. You can only configure one static status for a workload.
     * 
     */
    public Optional<Output<WorkloadStatusConfigStaticArgs>> statusConfigStatic() {
        return Optional.ofNullable(this.statusConfigStatic);
    }

    private WorkloadArgs() {}

    private WorkloadArgs(WorkloadArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.entityGuids = $.entityGuids;
        this.entitySearchQueries = $.entitySearchQueries;
        this.name = $.name;
        this.scopeAccountIds = $.scopeAccountIds;
        this.statusConfigAutomatic = $.statusConfigAutomatic;
        this.statusConfigStatic = $.statusConfigStatic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadArgs $;

        public Builder() {
            $ = new WorkloadArgs();
        }

        public Builder(WorkloadArgs defaults) {
            $ = new WorkloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID where you want to create the workload.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID where you want to create the workload.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description Relevant information about the workload.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Relevant information about the workload.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param entitySearchQueries A list of search queries that define a dynamic workload.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(@Nullable Output<List<WorkloadEntitySearchQueryArgs>> entitySearchQueries) {
            $.entitySearchQueries = entitySearchQueries;
            return this;
        }

        /**
         * @param entitySearchQueries A list of search queries that define a dynamic workload.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(List<WorkloadEntitySearchQueryArgs> entitySearchQueries) {
            return entitySearchQueries(Output.of(entitySearchQueries));
        }

        /**
         * @param entitySearchQueries A list of search queries that define a dynamic workload.
         * 
         * @return builder
         * 
         */
        public Builder entitySearchQueries(WorkloadEntitySearchQueryArgs... entitySearchQueries) {
            return entitySearchQueries(List.of(entitySearchQueries));
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
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(@Nullable Output<List<String>> scopeAccountIds) {
            $.scopeAccountIds = scopeAccountIds;
            return this;
        }

        /**
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(List<String> scopeAccountIds) {
            return scopeAccountIds(Output.of(scopeAccountIds));
        }

        /**
         * @param scopeAccountIds A list of account IDs that will be used to get entities from.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccountIds(String... scopeAccountIds) {
            return scopeAccountIds(List.of(scopeAccountIds));
        }

        /**
         * @param statusConfigAutomatic An input object used to represent an automatic status configuration.
         * 
         * @return builder
         * 
         */
        public Builder statusConfigAutomatic(@Nullable Output<WorkloadStatusConfigAutomaticArgs> statusConfigAutomatic) {
            $.statusConfigAutomatic = statusConfigAutomatic;
            return this;
        }

        /**
         * @param statusConfigAutomatic An input object used to represent an automatic status configuration.
         * 
         * @return builder
         * 
         */
        public Builder statusConfigAutomatic(WorkloadStatusConfigAutomaticArgs statusConfigAutomatic) {
            return statusConfigAutomatic(Output.of(statusConfigAutomatic));
        }

        /**
         * @param statusConfigStatic A list of static status configurations. You can only configure one static status for a workload.
         * 
         * @return builder
         * 
         */
        public Builder statusConfigStatic(@Nullable Output<WorkloadStatusConfigStaticArgs> statusConfigStatic) {
            $.statusConfigStatic = statusConfigStatic;
            return this;
        }

        /**
         * @param statusConfigStatic A list of static status configurations. You can only configure one static status for a workload.
         * 
         * @return builder
         * 
         */
        public Builder statusConfigStatic(WorkloadStatusConfigStaticArgs statusConfigStatic) {
            return statusConfigStatic(Output.of(statusConfigStatic));
        }

        public WorkloadArgs build() {
            return $;
        }
    }

}
