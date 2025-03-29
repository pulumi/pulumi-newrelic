// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Destination's channel id.
        /// </summary>
        [Input("channelId", required: true)]
        public Input<string> ChannelId { get; set; } = null!;

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationTriggers")]
        private InputList<string>? _notificationTriggers;

        /// <summary>
        /// List of triggers to notify about in this destination configuration.
        /// </summary>
        public InputList<string> NotificationTriggers
        {
            get => _notificationTriggers ?? (_notificationTriggers = new InputList<string>());
            set => _notificationTriggers = value;
        }

        /// <summary>
        /// (Required) The type of the destination. One of: (EMAIL, EVENT_BRIDGE, PAGERDUTY_ACCOUNT_INTEGRATION, PAGERDUTY_SERVICE_INTEGRATION, SERVICE_NOW, SERVICE_NOW_APP, WEBHOOK, MOBILE_PUSH, SLACK, JIRA, MICROSOFT_TEAMS).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Update original notification message (Slack channels only)
        /// </summary>
        [Input("updateOriginalMessage")]
        public Input<bool>? UpdateOriginalMessage { get; set; }

        public WorkflowDestinationGetArgs()
        {
        }
        public static new WorkflowDestinationGetArgs Empty => new WorkflowDestinationGetArgs();
    }
}
