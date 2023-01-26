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
        /// Id of a notification_channel to use for notifications. Please note that you have to use a 
        /// **notification** channel, not an `alert_channel`.
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
        /// Issue events to notify on. The value is a list of possible issue events. See Notification Triggers below for details.
        /// </summary>
        public InputList<string> NotificationTriggers
        {
            get => _notificationTriggers ?? (_notificationTriggers = new InputList<string>());
            set => _notificationTriggers = value;
        }

        /// <summary>
        /// Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WorkflowDestinationGetArgs()
        {
        }
        public static new WorkflowDestinationGetArgs Empty => new WorkflowDestinationGetArgs();
    }
}
