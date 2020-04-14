// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create and manage New Relic alert policies.
    /// </summary>
    public partial class AlertChannel : Pulumi.CustomResource
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AlertChannelConfig?> Config { get; private set; } = null!;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        [Output("configuration")]
        public Output<ImmutableDictionary<string, object>?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AlertChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertChannel(string name, AlertChannelArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/alertChannel:AlertChannel", name, args ?? new AlertChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertChannel(string name, Input<string> id, AlertChannelState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/alertChannel:AlertChannel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AlertChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertChannel Get(string name, Input<string> id, AlertChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertChannel(name, id, state, options);
        }
    }

    public sealed class AlertChannelArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigArgs>? Config { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        [Obsolete(@"use `config` block instead")]
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AlertChannelArgs()
        {
        }
    }

    public sealed class AlertChannelState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A nested block that describes an alert channel configuration.  Only one config block is permitted per alert channel definition.  See Nested config blocks below for details.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertChannelConfigGetArgs>? Config { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// **Deprecated** (Optional) A map of key/value pairs with channel type specific values. This argument is deprecated.  Use the `config` argument instead.
        /// </summary>
        [Obsolete(@"use `config` block instead")]
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// The name of the channel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of channel.  One of: `email`, `slack`, `opsgenie`, `pagerduty`, `victorops`, or `webhook`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertChannelState()
        {
        }
    }
}
