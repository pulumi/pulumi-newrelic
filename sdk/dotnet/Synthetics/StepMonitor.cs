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
    /// &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
    /// 
    /// Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.
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
    ///     var foo = new NewRelic.Synthetics.StepMonitor("foo", new()
    ///     {
    ///         Name = "Sample Step Monitor",
    ///         EnableScreenshotOnFailureAndScript = true,
    ///         LocationsPublics = new[]
    ///         {
    ///             "US_EAST_1",
    ///             "US_EAST_2",
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         RuntimeType = "CHROME_BROWSER",
    ///         RuntimeTypeVersion = "100",
    ///         Steps = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.StepMonitorStepArgs
    ///             {
    ///                 Ordinal = 0,
    ///                 Type = "NAVIGATE",
    ///                 Values = new[]
    ///                 {
    ///                     "https://www.newrelic.com",
    ///                 },
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.StepMonitorTagArgs
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
    /// See additional examples.
    /// 
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
    ///     var foo = new NewRelic.Synthetics.PrivateLocation("foo", new()
    ///     {
    ///         Name = "Sample Private Location",
    ///         Description = "Sample Private Location Description",
    ///         VerifiedScriptExecution = true,
    ///     });
    /// 
    ///     var fooStepMonitor = new NewRelic.Synthetics.StepMonitor("foo", new()
    ///     {
    ///         Name = "Sample Step Monitor",
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         LocationPrivates = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.StepMonitorLocationPrivateArgs
    ///             {
    ///                 Guid = foo.Id,
    ///                 VsePassword = "secret",
    ///             },
    ///         },
    ///         Steps = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.StepMonitorStepArgs
    ///             {
    ///                 Ordinal = 0,
    ///                 Type = "NAVIGATE",
    ///                 Values = new[]
    ///                 {
    ///                     "https://google.com",
    ///                 },
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.StepMonitorTagArgs
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
    /// A step monitor can be imported using its GUID, using the following command.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/stepMonitor:StepMonitor")]
    public partial class StepMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Output("enableScreenshotOnFailureAndScript")]
        public Output<bool?> EnableScreenshotOnFailureAndScript { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the monitor in New Relic.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        /// </summary>
        [Output("locationPrivates")]
        public Output<ImmutableArray<Outputs.StepMonitorLocationPrivate>> LocationPrivates { get; private set; } = null!;

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
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Output("periodInMinutes")]
        public Output<int> PeriodInMinutes { get; private set; } = null!;

        /// <summary>
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Output("runtimeType")]
        public Output<string?> RuntimeType { get; private set; } = null!;

        /// <summary>
        /// The specific version of the runtime type selected.
        /// 
        /// &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `CHROME_BROWSER` and `100` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
        /// 
        /// &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
        /// </summary>
        [Output("runtimeTypeVersion")]
        public Output<string?> RuntimeTypeVersion { get; private set; } = null!;

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        /// </summary>
        [Output("steps")]
        public Output<ImmutableArray<Outputs.StepMonitorStep>> Steps { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.StepMonitorTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a StepMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StepMonitor(string name, StepMonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/stepMonitor:StepMonitor", name, args ?? new StepMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StepMonitor(string name, Input<string> id, StepMonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/stepMonitor:StepMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StepMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StepMonitor Get(string name, Input<string> id, StepMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new StepMonitor(name, id, state, options);
        }
    }

    public sealed class StepMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

        [Input("locationPrivates")]
        private InputList<Inputs.StepMonitorLocationPrivateArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorLocationPrivateArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.StepMonitorLocationPrivateArgs>());
            set => _locationPrivates = value;
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
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected.
        /// 
        /// &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `CHROME_BROWSER` and `100` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
        /// 
        /// &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("steps", required: true)]
        private InputList<Inputs.StepMonitorStepArgs>? _steps;

        /// <summary>
        /// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorStepArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.StepMonitorStepArgs>());
            set => _steps = value;
        }

        [Input("tags")]
        private InputList<Inputs.StepMonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.StepMonitorTagArgs>());
            set => _tags = value;
        }

        public StepMonitorArgs()
        {
        }
        public static new StepMonitorArgs Empty => new StepMonitorArgs();
    }

    public sealed class StepMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

        /// <summary>
        /// The unique entity identifier of the monitor in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        [Input("locationPrivates")]
        private InputList<Inputs.StepMonitorLocationPrivateGetArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorLocationPrivateGetArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.StepMonitorLocationPrivateGetArgs>());
            set => _locationPrivates = value;
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
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Input("periodInMinutes")]
        public Input<int>? PeriodInMinutes { get; set; }

        /// <summary>
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected.
        /// 
        /// &gt; **NOTE:** Currently, the values of `runtime_type` and `runtime_type_version` supported by this resource are `CHROME_BROWSER` and `100` respectively. In order to run the monitor in the new runtime, both `runtime_type` and `runtime_type_version` need to be specified; however, specifying neither of these attributes would set this monitor to use the legacy runtime. It may also be noted that the runtime opted for would only be effective with private locations. For public locations, all traffic has been shifted to the new runtime, irrespective of the selection made.
        /// 
        /// &gt; **WARNING** Support for legacy Synthetics runtimes **will reach its end-of-life (EOL) on October 22, 2024**. In addition, creating **_new_** monitors using the legacy runtime **will no longer be supported after August 26, 2024**. In light of the above, kindly **upgrade your Synthetic Monitors to the new runtime** at the earliest, if they are still using the legacy runtime. Please check out [this page](https://forum.newrelic.com/s/hubtopic/aAXPh0000001brxOAA/upcoming-endoflife-legacy-synthetics-runtimes-and-cpm) for more details on the EOL, action needed (specific to monitors using public and private locations), relevant resources, and more.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("steps")]
        private InputList<Inputs.StepMonitorStepGetArgs>? _steps;

        /// <summary>
        /// The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.StepMonitorStepGetArgs>());
            set => _steps = value;
        }

        [Input("tags")]
        private InputList<Inputs.StepMonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.StepMonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.StepMonitorTagGetArgs>());
            set => _tags = value;
        }

        public StepMonitorState()
        {
        }
        public static new StepMonitorState Empty => new StepMonitorState();
    }
}
