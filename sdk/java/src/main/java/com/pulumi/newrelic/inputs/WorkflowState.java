// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.WorkflowDestinationConfigurationArgs;
import com.pulumi.newrelic.inputs.WorkflowEnrichmentsArgs;
import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A nested block that contains a channel id.
     * 
     */
    @Import(name="destinationConfigurations")
    private @Nullable Output<List<WorkflowDestinationConfigurationArgs>> destinationConfigurations;

    /**
     * @return A nested block that contains a channel id.
     * 
     */
    public Optional<Output<List<WorkflowDestinationConfigurationArgs>>> destinationConfigurations() {
        return Optional.ofNullable(this.destinationConfigurations);
    }

    /**
     * Whether destinations are enabled..
     * 
     */
    @Import(name="destinationsEnabled")
    private @Nullable Output<Boolean> destinationsEnabled;

    /**
     * @return Whether destinations are enabled..
     * 
     */
    public Optional<Output<Boolean>> destinationsEnabled() {
        return Optional.ofNullable(this.destinationsEnabled);
    }

    /**
     * A nested block that describes a workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    @Import(name="enrichments")
    private @Nullable Output<WorkflowEnrichmentsArgs> enrichments;

    /**
     * @return A nested block that describes a workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    public Optional<Output<WorkflowEnrichmentsArgs>> enrichments() {
        return Optional.ofNullable(this.enrichments);
    }

    /**
     * Whether enrichments are enabled..
     * 
     */
    @Import(name="enrichmentsEnabled")
    private @Nullable Output<Boolean> enrichmentsEnabled;

    /**
     * @return Whether enrichments are enabled..
     * 
     */
    public Optional<Output<Boolean>> enrichmentsEnabled() {
        return Optional.ofNullable(this.enrichmentsEnabled);
    }

    /**
     * The issues filter.  See Nested issues_filter blocks below for details.
     * 
     */
    @Import(name="issuesFilter")
    private @Nullable Output<WorkflowIssuesFilterArgs> issuesFilter;

    /**
     * @return The issues filter.  See Nested issues_filter blocks below for details.
     * 
     */
    public Optional<Output<WorkflowIssuesFilterArgs>> issuesFilter() {
        return Optional.ofNullable(this.issuesFilter);
    }

    /**
     * The last time notification was sent for this workflow.
     * 
     */
    @Import(name="lastRun")
    private @Nullable Output<String> lastRun;

    /**
     * @return The last time notification was sent for this workflow.
     * 
     */
    public Optional<Output<String>> lastRun() {
        return Optional.ofNullable(this.lastRun);
    }

    /**
     * Which muting rule handling this workflow has.
     * 
     */
    @Import(name="mutingRulesHandling")
    private @Nullable Output<String> mutingRulesHandling;

    /**
     * @return Which muting rule handling this workflow has.
     * 
     */
    public Optional<Output<String>> mutingRulesHandling() {
        return Optional.ofNullable(this.mutingRulesHandling);
    }

    /**
     * A nrql enrichment name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A nrql enrichment name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether workflow is enabled.
     * 
     */
    @Import(name="workflowEnabled")
    private @Nullable Output<Boolean> workflowEnabled;

    /**
     * @return Whether workflow is enabled.
     * 
     */
    public Optional<Output<Boolean>> workflowEnabled() {
        return Optional.ofNullable(this.workflowEnabled);
    }

    /**
     * The id of the workflow.
     * 
     */
    @Import(name="workflowId")
    private @Nullable Output<String> workflowId;

    /**
     * @return The id of the workflow.
     * 
     */
    public Optional<Output<String>> workflowId() {
        return Optional.ofNullable(this.workflowId);
    }

    private WorkflowState() {}

    private WorkflowState(WorkflowState $) {
        this.accountId = $.accountId;
        this.destinationConfigurations = $.destinationConfigurations;
        this.destinationsEnabled = $.destinationsEnabled;
        this.enrichments = $.enrichments;
        this.enrichmentsEnabled = $.enrichmentsEnabled;
        this.issuesFilter = $.issuesFilter;
        this.lastRun = $.lastRun;
        this.mutingRulesHandling = $.mutingRulesHandling;
        this.name = $.name;
        this.workflowEnabled = $.workflowEnabled;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowState $;

        public Builder() {
            $ = new WorkflowState();
        }

        public Builder(WorkflowState defaults) {
            $ = new WorkflowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param destinationConfigurations A nested block that contains a channel id.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfigurations(@Nullable Output<List<WorkflowDestinationConfigurationArgs>> destinationConfigurations) {
            $.destinationConfigurations = destinationConfigurations;
            return this;
        }

        /**
         * @param destinationConfigurations A nested block that contains a channel id.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfigurations(List<WorkflowDestinationConfigurationArgs> destinationConfigurations) {
            return destinationConfigurations(Output.of(destinationConfigurations));
        }

        /**
         * @param destinationConfigurations A nested block that contains a channel id.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfigurations(WorkflowDestinationConfigurationArgs... destinationConfigurations) {
            return destinationConfigurations(List.of(destinationConfigurations));
        }

        /**
         * @param destinationsEnabled Whether destinations are enabled..
         * 
         * @return builder
         * 
         */
        public Builder destinationsEnabled(@Nullable Output<Boolean> destinationsEnabled) {
            $.destinationsEnabled = destinationsEnabled;
            return this;
        }

        /**
         * @param destinationsEnabled Whether destinations are enabled..
         * 
         * @return builder
         * 
         */
        public Builder destinationsEnabled(Boolean destinationsEnabled) {
            return destinationsEnabled(Output.of(destinationsEnabled));
        }

        /**
         * @param enrichments A nested block that describes a workflow&#39;s enrichments. See Nested enrichments blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder enrichments(@Nullable Output<WorkflowEnrichmentsArgs> enrichments) {
            $.enrichments = enrichments;
            return this;
        }

        /**
         * @param enrichments A nested block that describes a workflow&#39;s enrichments. See Nested enrichments blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder enrichments(WorkflowEnrichmentsArgs enrichments) {
            return enrichments(Output.of(enrichments));
        }

        /**
         * @param enrichmentsEnabled Whether enrichments are enabled..
         * 
         * @return builder
         * 
         */
        public Builder enrichmentsEnabled(@Nullable Output<Boolean> enrichmentsEnabled) {
            $.enrichmentsEnabled = enrichmentsEnabled;
            return this;
        }

        /**
         * @param enrichmentsEnabled Whether enrichments are enabled..
         * 
         * @return builder
         * 
         */
        public Builder enrichmentsEnabled(Boolean enrichmentsEnabled) {
            return enrichmentsEnabled(Output.of(enrichmentsEnabled));
        }

        /**
         * @param issuesFilter The issues filter.  See Nested issues_filter blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder issuesFilter(@Nullable Output<WorkflowIssuesFilterArgs> issuesFilter) {
            $.issuesFilter = issuesFilter;
            return this;
        }

        /**
         * @param issuesFilter The issues filter.  See Nested issues_filter blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder issuesFilter(WorkflowIssuesFilterArgs issuesFilter) {
            return issuesFilter(Output.of(issuesFilter));
        }

        /**
         * @param lastRun The last time notification was sent for this workflow.
         * 
         * @return builder
         * 
         */
        public Builder lastRun(@Nullable Output<String> lastRun) {
            $.lastRun = lastRun;
            return this;
        }

        /**
         * @param lastRun The last time notification was sent for this workflow.
         * 
         * @return builder
         * 
         */
        public Builder lastRun(String lastRun) {
            return lastRun(Output.of(lastRun));
        }

        /**
         * @param mutingRulesHandling Which muting rule handling this workflow has.
         * 
         * @return builder
         * 
         */
        public Builder mutingRulesHandling(@Nullable Output<String> mutingRulesHandling) {
            $.mutingRulesHandling = mutingRulesHandling;
            return this;
        }

        /**
         * @param mutingRulesHandling Which muting rule handling this workflow has.
         * 
         * @return builder
         * 
         */
        public Builder mutingRulesHandling(String mutingRulesHandling) {
            return mutingRulesHandling(Output.of(mutingRulesHandling));
        }

        /**
         * @param name A nrql enrichment name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A nrql enrichment name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param workflowEnabled Whether workflow is enabled.
         * 
         * @return builder
         * 
         */
        public Builder workflowEnabled(@Nullable Output<Boolean> workflowEnabled) {
            $.workflowEnabled = workflowEnabled;
            return this;
        }

        /**
         * @param workflowEnabled Whether workflow is enabled.
         * 
         * @return builder
         * 
         */
        public Builder workflowEnabled(Boolean workflowEnabled) {
            return workflowEnabled(Output.of(workflowEnabled));
        }

        /**
         * @param workflowId The id of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowId(@Nullable Output<String> workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        /**
         * @param workflowId The id of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowId(String workflowId) {
            return workflowId(Output.of(workflowId));
        }

        public WorkflowState build() {
            return $;
        }
    }

}