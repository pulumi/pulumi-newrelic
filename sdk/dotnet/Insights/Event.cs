// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Insights
{
    /// <summary>
    /// Use this resource to create one or more Insights events.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.Insights.Event("foo", new()
    ///     {
    ///         Events = new[]
    ///         {
    ///             new NewRelic.Insights.Inputs.EventEventArgs
    ///             {
    ///                 Type = "MyEvent",
    ///                 Timestamp = 1232471100,
    ///                 Attributes = new[]
    ///                 {
    ///                     new NewRelic.Insights.Inputs.EventEventAttributeArgs
    ///                     {
    ///                         Key = "a_string_attribute",
    ///                         Value = "a string",
    ///                     },
    ///                     new NewRelic.Insights.Inputs.EventEventAttributeArgs
    ///                     {
    ///                         Key = "an_integer_attribute",
    ///                         Value = "42",
    ///                         Type = "int",
    ///                     },
    ///                     new NewRelic.Insights.Inputs.EventEventAttributeArgs
    ///                     {
    ///                         Key = "a_float_attribute",
    ///                         Value = "101.1",
    ///                         Type = "float",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Events
    /// 
    /// The `event` mapping supports the following arguments:
    /// 
    ///   * `type` - (Required) The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
    ///   * `timestamp` - (Optional) Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
    ///   * `attribute` - (Required) An attribute to include in your event payload. Multiple attribute blocks can be defined for an event. See Attributes below for details.
    /// 
    /// ### Attributes
    /// 
    /// The `attribute` mapping supports the following arguments:
    /// 
    ///   * `key` - (Required) The name of the attribute.
    ///   * `value` - (Required) The value of the attribute.
    ///   * `type` - (Optional) Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are `string`, `int`, or `float`. Defaults to `string`.
    /// </summary>
    [NewRelicResourceType("newrelic:insights/event:Event")]
    public partial class Event : global::Pulumi.CustomResource
    {
        [Output("events")]
        public Output<ImmutableArray<Outputs.EventEvent>> Events { get; private set; } = null!;


        /// <summary>
        /// Create a Event resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Event(string name, EventArgs args, CustomResourceOptions? options = null)
            : base("newrelic:insights/event:Event", name, args ?? new EventArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Event(string name, Input<string> id, EventState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:insights/event:Event", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Event resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Event Get(string name, Input<string> id, EventState? state = null, CustomResourceOptions? options = null)
        {
            return new Event(name, id, state, options);
        }
    }

    public sealed class EventArgs : global::Pulumi.ResourceArgs
    {
        [Input("events", required: true)]
        private InputList<Inputs.EventEventArgs>? _events;
        public InputList<Inputs.EventEventArgs> Events
        {
            get => _events ?? (_events = new InputList<Inputs.EventEventArgs>());
            set => _events = value;
        }

        public EventArgs()
        {
        }
        public static new EventArgs Empty => new EventArgs();
    }

    public sealed class EventState : global::Pulumi.ResourceArgs
    {
        [Input("events")]
        private InputList<Inputs.EventEventGetArgs>? _events;
        public InputList<Inputs.EventEventGetArgs> Events
        {
            get => _events ?? (_events = new InputList<Inputs.EventEventGetArgs>());
            set => _events = value;
        }

        public EventState()
        {
        }
        public static new EventState Empty => new EventState();
    }
}
