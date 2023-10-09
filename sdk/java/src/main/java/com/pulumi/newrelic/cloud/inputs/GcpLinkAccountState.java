// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpLinkAccountState extends com.pulumi.resources.ResourceArgs {

    public static final GcpLinkAccountState Empty = new GcpLinkAccountState();

    /**
     * Account ID of the New Relic account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Account ID of the New Relic account.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * name of the linked account
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name of the linked account
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Project ID of the GCP account.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project ID of the GCP account.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GcpLinkAccountState() {}

    private GcpLinkAccountState(GcpLinkAccountState $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpLinkAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpLinkAccountState $;

        public Builder() {
            $ = new GcpLinkAccountState();
        }

        public Builder(GcpLinkAccountState defaults) {
            $ = new GcpLinkAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID of the New Relic account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID of the New Relic account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name name of the linked account
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name of the linked account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Project ID of the GCP account.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID of the GCP account.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GcpLinkAccountState build() {
            return $;
        }
    }

}
