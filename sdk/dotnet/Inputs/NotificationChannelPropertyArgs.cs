// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class NotificationChannelPropertyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The notification property display value.
        /// 
        /// Each notification channel type supports a specific set of arguments for the `property` block:
        /// </summary>
        [Input("displayValue")]
        public Input<string>? DisplayValue { get; set; }

        /// <summary>
        /// The notification property key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The notification property label.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The notification property value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public NotificationChannelPropertyArgs()
        {
        }
        public static new NotificationChannelPropertyArgs Empty => new NotificationChannelPropertyArgs();
    }
}
