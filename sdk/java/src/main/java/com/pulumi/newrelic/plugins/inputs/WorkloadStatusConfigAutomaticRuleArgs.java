// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRuleNrqlQueryArgs;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRuleRollupArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadStatusConfigAutomaticRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadStatusConfigAutomaticRuleArgs Empty = new WorkloadStatusConfigAutomaticRuleArgs();

    /**
     * A list of entity GUIDs composing the rule.
     * 
     */
    @Import(name="entityGuids")
    private @Nullable Output<List<String>> entityGuids;

    /**
     * @return A list of entity GUIDs composing the rule.
     * 
     */
    public Optional<Output<List<String>>> entityGuids() {
        return Optional.ofNullable(this.entityGuids);
    }

    /**
     * A list of entity search queries used to retrieve the entities that compose the rule.
     * 
     */
    @Import(name="nrqlQueries")
    private @Nullable Output<List<WorkloadStatusConfigAutomaticRuleNrqlQueryArgs>> nrqlQueries;

    /**
     * @return A list of entity search queries used to retrieve the entities that compose the rule.
     * 
     */
    public Optional<Output<List<WorkloadStatusConfigAutomaticRuleNrqlQueryArgs>>> nrqlQueries() {
        return Optional.ofNullable(this.nrqlQueries);
    }

    /**
     * The input object used to represent a rollup strategy.
     * 
     */
    @Import(name="rollup", required=true)
    private Output<WorkloadStatusConfigAutomaticRuleRollupArgs> rollup;

    /**
     * @return The input object used to represent a rollup strategy.
     * 
     */
    public Output<WorkloadStatusConfigAutomaticRuleRollupArgs> rollup() {
        return this.rollup;
    }

    private WorkloadStatusConfigAutomaticRuleArgs() {}

    private WorkloadStatusConfigAutomaticRuleArgs(WorkloadStatusConfigAutomaticRuleArgs $) {
        this.entityGuids = $.entityGuids;
        this.nrqlQueries = $.nrqlQueries;
        this.rollup = $.rollup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadStatusConfigAutomaticRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadStatusConfigAutomaticRuleArgs $;

        public Builder() {
            $ = new WorkloadStatusConfigAutomaticRuleArgs();
        }

        public Builder(WorkloadStatusConfigAutomaticRuleArgs defaults) {
            $ = new WorkloadStatusConfigAutomaticRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityGuids A list of entity GUIDs composing the rule.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(@Nullable Output<List<String>> entityGuids) {
            $.entityGuids = entityGuids;
            return this;
        }

        /**
         * @param entityGuids A list of entity GUIDs composing the rule.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(List<String> entityGuids) {
            return entityGuids(Output.of(entityGuids));
        }

        /**
         * @param entityGuids A list of entity GUIDs composing the rule.
         * 
         * @return builder
         * 
         */
        public Builder entityGuids(String... entityGuids) {
            return entityGuids(List.of(entityGuids));
        }

        /**
         * @param nrqlQueries A list of entity search queries used to retrieve the entities that compose the rule.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(@Nullable Output<List<WorkloadStatusConfigAutomaticRuleNrqlQueryArgs>> nrqlQueries) {
            $.nrqlQueries = nrqlQueries;
            return this;
        }

        /**
         * @param nrqlQueries A list of entity search queries used to retrieve the entities that compose the rule.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(List<WorkloadStatusConfigAutomaticRuleNrqlQueryArgs> nrqlQueries) {
            return nrqlQueries(Output.of(nrqlQueries));
        }

        /**
         * @param nrqlQueries A list of entity search queries used to retrieve the entities that compose the rule.
         * 
         * @return builder
         * 
         */
        public Builder nrqlQueries(WorkloadStatusConfigAutomaticRuleNrqlQueryArgs... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }

        /**
         * @param rollup The input object used to represent a rollup strategy.
         * 
         * @return builder
         * 
         */
        public Builder rollup(Output<WorkloadStatusConfigAutomaticRuleRollupArgs> rollup) {
            $.rollup = rollup;
            return this;
        }

        /**
         * @param rollup The input object used to represent a rollup strategy.
         * 
         * @return builder
         * 
         */
        public Builder rollup(WorkloadStatusConfigAutomaticRuleRollupArgs rollup) {
            return rollup(Output.of(rollup));
        }

        public WorkloadStatusConfigAutomaticRuleArgs build() {
            if ($.rollup == null) {
                throw new MissingRequiredPropertyException("WorkloadStatusConfigAutomaticRuleArgs", "rollup");
            }
            return $;
        }
    }

}
