// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPartitionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataPartitionRuleArgs Empty = new DataPartitionRuleArgs();

    /**
     * The account id associated with the data partition rule.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account id associated with the data partition rule.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
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
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether or not this data partition rule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    @Import(name="nrql", required=true)
    private Output<String> nrql;

    /**
     * @return The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
     * 
     */
    public Output<String> nrql() {
        return this.nrql;
    }

    /**
     * The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    @Import(name="retentionPolicy", required=true)
    private Output<String> retentionPolicy;

    /**
     * @return The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
     * 
     */
    public Output<String> retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    @Import(name="targetDataPartition", required=true)
    private Output<String> targetDataPartition;

    /**
     * @return The name of the data partition where logs will be allocated once the rule is enabled.
     * 
     */
    public Output<String> targetDataPartition() {
        return this.targetDataPartition;
    }

    private DataPartitionRuleArgs() {}

    private DataPartitionRuleArgs(DataPartitionRuleArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.nrql = $.nrql;
        this.retentionPolicy = $.retentionPolicy;
        this.targetDataPartition = $.targetDataPartition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPartitionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPartitionRuleArgs $;

        public Builder() {
            $ = new DataPartitionRuleArgs();
        }

        public Builder(DataPartitionRuleArgs defaults) {
            $ = new DataPartitionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id associated with the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id associated with the data partition rule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
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
        public Builder enabled(Output<Boolean> enabled) {
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
        public Builder nrql(Output<String> nrql) {
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
        public Builder retentionPolicy(Output<String> retentionPolicy) {
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
        public Builder targetDataPartition(Output<String> targetDataPartition) {
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

        public DataPartitionRuleArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("DataPartitionRuleArgs", "enabled");
            }
            if ($.nrql == null) {
                throw new MissingRequiredPropertyException("DataPartitionRuleArgs", "nrql");
            }
            if ($.retentionPolicy == null) {
                throw new MissingRequiredPropertyException("DataPartitionRuleArgs", "retentionPolicy");
            }
            if ($.targetDataPartition == null) {
                throw new MissingRequiredPropertyException("DataPartitionRuleArgs", "targetDataPartition");
            }
            return $;
        }
    }

}
