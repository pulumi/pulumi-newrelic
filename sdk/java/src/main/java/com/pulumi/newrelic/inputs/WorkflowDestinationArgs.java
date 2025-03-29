// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowDestinationArgs Empty = new WorkflowDestinationArgs();

    /**
     * (Required) Destination&#39;s channel id.
     * 
     */
    @Import(name="channelId", required=true)
    private Output<String> channelId;

    /**
     * @return (Required) Destination&#39;s channel id.
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }

    /**
     * The name of the workflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of triggers to notify about in this destination configuration.
     * 
     */
    @Import(name="notificationTriggers")
    private @Nullable Output<List<String>> notificationTriggers;

    /**
     * @return List of triggers to notify about in this destination configuration.
     * 
     */
    public Optional<Output<List<String>>> notificationTriggers() {
        return Optional.ofNullable(this.notificationTriggers);
    }

    /**
     * (Required) The type of the destination. One of: (EMAIL, EVENT_BRIDGE, PAGERDUTY_ACCOUNT_INTEGRATION, PAGERDUTY_SERVICE_INTEGRATION, SERVICE_NOW, SERVICE_NOW_APP, WEBHOOK, MOBILE_PUSH, SLACK, JIRA, MICROSOFT_TEAMS).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Required) The type of the destination. One of: (EMAIL, EVENT_BRIDGE, PAGERDUTY_ACCOUNT_INTEGRATION, PAGERDUTY_SERVICE_INTEGRATION, SERVICE_NOW, SERVICE_NOW_APP, WEBHOOK, MOBILE_PUSH, SLACK, JIRA, MICROSOFT_TEAMS).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Update original notification message (Slack channels only)
     * 
     */
    @Import(name="updateOriginalMessage")
    private @Nullable Output<Boolean> updateOriginalMessage;

    /**
     * @return Update original notification message (Slack channels only)
     * 
     */
    public Optional<Output<Boolean>> updateOriginalMessage() {
        return Optional.ofNullable(this.updateOriginalMessage);
    }

    private WorkflowDestinationArgs() {}

    private WorkflowDestinationArgs(WorkflowDestinationArgs $) {
        this.channelId = $.channelId;
        this.name = $.name;
        this.notificationTriggers = $.notificationTriggers;
        this.type = $.type;
        this.updateOriginalMessage = $.updateOriginalMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowDestinationArgs $;

        public Builder() {
            $ = new WorkflowDestinationArgs();
        }

        public Builder(WorkflowDestinationArgs defaults) {
            $ = new WorkflowDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId (Required) Destination&#39;s channel id.
         * 
         * @return builder
         * 
         */
        public Builder channelId(Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId (Required) Destination&#39;s channel id.
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationTriggers List of triggers to notify about in this destination configuration.
         * 
         * @return builder
         * 
         */
        public Builder notificationTriggers(@Nullable Output<List<String>> notificationTriggers) {
            $.notificationTriggers = notificationTriggers;
            return this;
        }

        /**
         * @param notificationTriggers List of triggers to notify about in this destination configuration.
         * 
         * @return builder
         * 
         */
        public Builder notificationTriggers(List<String> notificationTriggers) {
            return notificationTriggers(Output.of(notificationTriggers));
        }

        /**
         * @param notificationTriggers List of triggers to notify about in this destination configuration.
         * 
         * @return builder
         * 
         */
        public Builder notificationTriggers(String... notificationTriggers) {
            return notificationTriggers(List.of(notificationTriggers));
        }

        /**
         * @param type (Required) The type of the destination. One of: (EMAIL, EVENT_BRIDGE, PAGERDUTY_ACCOUNT_INTEGRATION, PAGERDUTY_SERVICE_INTEGRATION, SERVICE_NOW, SERVICE_NOW_APP, WEBHOOK, MOBILE_PUSH, SLACK, JIRA, MICROSOFT_TEAMS).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Required) The type of the destination. One of: (EMAIL, EVENT_BRIDGE, PAGERDUTY_ACCOUNT_INTEGRATION, PAGERDUTY_SERVICE_INTEGRATION, SERVICE_NOW, SERVICE_NOW_APP, WEBHOOK, MOBILE_PUSH, SLACK, JIRA, MICROSOFT_TEAMS).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updateOriginalMessage Update original notification message (Slack channels only)
         * 
         * @return builder
         * 
         */
        public Builder updateOriginalMessage(@Nullable Output<Boolean> updateOriginalMessage) {
            $.updateOriginalMessage = updateOriginalMessage;
            return this;
        }

        /**
         * @param updateOriginalMessage Update original notification message (Slack channels only)
         * 
         * @return builder
         * 
         */
        public Builder updateOriginalMessage(Boolean updateOriginalMessage) {
            return updateOriginalMessage(Output.of(updateOriginalMessage));
        }

        public WorkflowDestinationArgs build() {
            if ($.channelId == null) {
                throw new MissingRequiredPropertyException("WorkflowDestinationArgs", "channelId");
            }
            return $;
        }
    }

}
