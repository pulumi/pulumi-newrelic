// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPartitionRuleState extends com.pulumi.resources.ResourceArgs {

    public static final DataPartitionRuleState Empty = new DataPartitionRuleState();

    /**
     * The account id associated with the data partition rule.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account id associated with the data partition rule.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
     * 
     */
    @Import(name="deleted")
    private @Nullable Output<Boolean> deleted;

    /**
     * @return Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
     * 
     */
    public Optional<Output<Boolean>> deleted() {
        return Optional.ofNullable(this.deleted);
    }

    /**
     * The description of the data partition rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the data partition rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether or not this data partition rule is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not this data partition rule is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    @Import(name="nrql")
    private @Nullable Output<String> nrql;

    /**
     * @return The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    public Optional<Output<String>> nrql() {
        return Optional.ofNullable(this.nrql);
    }

    /**
     * The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<String> retentionPolicy;

    /**
     * @return The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    public Optional<Output<String>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    @Import(name="targetDataPartition")
    private @Nullable Output<String> targetDataPartition;

    /**
     * @return The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    public Optional<Output<String>> targetDataPartition() {
        return Optional.ofNullable(this.targetDataPartition);
    }

    private DataPartitionRuleState() {}

    private DataPartitionRuleState(DataPartitionRuleState $) {
        this.accountId = $.accountId;
        this.deleted = $.deleted;
        this.description = $.description;
        this.enabled = $.enabled;
        this.nrql = $.nrql;
        this.retentionPolicy = $.retentionPolicy;
        this.targetDataPartition = $.targetDataPartition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPartitionRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPartitionRuleState $;

        public Builder() {
            $ = new DataPartitionRuleState();
        }

        public Builder(DataPartitionRuleState defaults) {
            $ = new DataPartitionRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id associated with the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id associated with the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param deleted Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
         * 
         * @return builder
         * 
         */
        public Builder deleted(@Nullable Output<Boolean> deleted) {
            $.deleted = deleted;
            return this;
        }

        /**
         * @param deleted Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
         * 
         * @return builder
         * 
         */
        public Builder deleted(Boolean deleted) {
            return deleted(Output.of(deleted));
        }

        /**
         * @param description The description of the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether or not this data partition rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not this data partition rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param nrql The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
         * 
         * @return builder
         * 
         */
        public Builder nrql(@Nullable Output<String> nrql) {
            $.nrql = nrql;
            return this;
        }

        /**
         * @param nrql The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
         * 
         * @return builder
         * 
         */
        public Builder nrql(String nrql) {
            return nrql(Output.of(nrql));
        }

        /**
         * @param retentionPolicy The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<String> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(String retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param targetDataPartition The name of the data partition where logs will be allocated once the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder targetDataPartition(@Nullable Output<String> targetDataPartition) {
            $.targetDataPartition = targetDataPartition;
            return this;
        }

        /**
         * @param targetDataPartition The name of the data partition where logs will be allocated once the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder targetDataPartition(String targetDataPartition) {
            return targetDataPartition(Output.of(targetDataPartition));
        }

        public DataPartitionRuleState build() {
            return $;
        }
    }

}
