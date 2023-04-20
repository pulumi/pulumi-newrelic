// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    /// <summary>
    /// Use this resource to create, update, and delete a Synthetics Broken Links monitor in New Relic.
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
    ///     var monitor = new NewRelic.Synthetics.BrokenLinksMonitor("monitor", new()
    ///     {
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.BrokenLinksMonitorTagArgs
    ///             {
    ///                 Key = "some_key",
    ///                 Values = new[]
    ///                 {
    ///                     "some_value",
    ///                 },
    ///             },
    ///         },
    ///         Uri = "https://www.one.example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// See additional examples.
    /// ## Additional Examples
    /// 
    /// ### Create a monitor with a private location
    /// 
    /// The below example shows how you can define a private location and attach it to a monitor.
    /// 
    /// &gt; **NOTE:** It can take up to 10 minutes for a private location to become available.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var location = new NewRelic.Synthetics.PrivateLocation("location", new()
    ///     {
    ///         Description = "Test Description",
    ///         VerifiedScriptExecution = false,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.BrokenLinksMonitor("monitor", new()
    ///     {
    ///         Uri = "https://www.one.example.com",
    ///         LocationsPrivates = new[]
    ///         {
    ///             location.Id,
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.BrokenLinksMonitorTagArgs
    ///             {
    ///                 Key = "some_key",
    ///                 Values = new[]
    ///                 {
    ///                     "some_value",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Synthetics broken links monitor scripts can be imported using the `guid`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor monitor &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor")]
    public partial class BrokenLinksMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the monitor in New Relic.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        /// </summary>
        [Output("locationsPrivates")]
        public Output<ImmutableArray<string>> LocationsPrivates { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        [Output("locationsPublics")]
        public Output<ImmutableArray<string>> LocationsPublics { get; private set; } = null!;

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Output("period")]
        public Output<string> Period { get; private set; } = null!;

        /// <summary>
        /// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.BrokenLinksMonitorTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;


        /// <summary>
        /// Create a BrokenLinksMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BrokenLinksMonitor(string name, BrokenLinksMonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, args ?? new BrokenLinksMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BrokenLinksMonitor(string name, Input<string> id, BrokenLinksMonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/brokenLinksMonitor:BrokenLinksMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BrokenLinksMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BrokenLinksMonitor Get(string name, Input<string> id, BrokenLinksMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new BrokenLinksMonitor(name, id, state, options);
        }
    }

    public sealed class BrokenLinksMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("locationsPrivates")]
        private InputList<string>? _locationsPrivates;

        /// <summary>
        /// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        /// </summary>
        public InputList<string> LocationsPrivates
        {
            get => _locationsPrivates ?? (_locationsPrivates = new InputList<string>());
            set => _locationsPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<string> LocationsPublics
        {
            get => _locationsPublics ?? (_locationsPublics = new InputList<string>());
            set => _locationsPublics = value;
        }

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Input("period", required: true)]
        public Input<string> Period { get; set; } = null!;

        /// <summary>
        /// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.BrokenLinksMonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        public InputList<Inputs.BrokenLinksMonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BrokenLinksMonitorTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public BrokenLinksMonitorArgs()
        {
        }
        public static new BrokenLinksMonitorArgs Empty => new BrokenLinksMonitorArgs();
    }

    public sealed class BrokenLinksMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The unique entity identifier of the monitor in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        [Input("locationsPrivates")]
        private InputList<string>? _locationsPrivates;

        /// <summary>
        /// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        /// </summary>
        public InputList<string> LocationsPrivates
        {
            get => _locationsPrivates ?? (_locationsPrivates = new InputList<string>());
            set => _locationsPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<string> LocationsPublics
        {
            get => _locationsPublics ?? (_locationsPublics = new InputList<string>());
            set => _locationsPublics = value;
        }

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.BrokenLinksMonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        public InputList<Inputs.BrokenLinksMonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BrokenLinksMonitorTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public BrokenLinksMonitorState()
        {
        }
        public static new BrokenLinksMonitorState Empty => new BrokenLinksMonitorState();
    }
}
