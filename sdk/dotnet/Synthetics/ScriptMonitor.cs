// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ##### Type: `SCRIPT_API`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "script_monitor",
    ///         Type = "SCRIPT_API",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///             "AP_EAST_1",
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Script = "console.log('it works!')",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         RuntimeType = "NODE_API",
    ///         RuntimeTypeVersion = "16.10",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
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
    /// ##### Type: `SCRIPT_BROWSER`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "script_monitor",
    ///         Type = "SCRIPT_BROWSER",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///             "AP_EAST_1",
    ///         },
    ///         Period = "EVERY_HOUR",
    ///         Script = "$browser.get('https://one.newrelic.com')",
    ///         RuntimeTypeVersion = "100",
    ///         RuntimeType = "CHROME_BROWSER",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         Devices = new[]
    ///         {
    ///             "DESKTOP",
    ///             "MOBILE_PORTRAIT",
    ///             "TABLET_LANDSCAPE",
    ///         },
    ///         Browsers = new[]
    ///         {
    ///             "CHROME",
    ///         },
    ///         EnableScreenshotOnFailureAndScript = false,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
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
    /// ##### Type: `SCRIPT_API`
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
    ///         Description = "Example private location",
    ///         Name = "private_location",
    ///         VerifiedScriptExecution = true,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "script_monitor",
    ///         Type = "SCRIPT_API",
    ///         LocationPrivates = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorLocationPrivateArgs
    ///             {
    ///                 Guid = location.Id,
    ///                 VsePassword = "secret",
    ///             },
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Script = "console.log('terraform integration test updated')",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         RuntimeType = "NODE_API",
    ///         RuntimeTypeVersion = "16.10",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
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
    /// ##### Type: `SCRIPT_BROWSER`
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
    ///         Name = "private_location",
    ///         VerifiedScriptExecution = true,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "script_monitor",
    ///         Type = "SCRIPT_BROWSER",
    ///         Period = "EVERY_HOUR",
    ///         Script = "$browser.get('https://one.newrelic.com')",
    ///         RuntimeTypeVersion = "100",
    ///         RuntimeType = "CHROME_BROWSER",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         Devices = new[]
    ///         {
    ///             "DESKTOP",
    ///             "MOBILE_PORTRAIT",
    ///             "TABLET_LANDSCAPE",
    ///         },
    ///         Browsers = new[]
    ///         {
    ///             "CHROME",
    ///         },
    ///         EnableScreenshotOnFailureAndScript = false,
    ///         LocationPrivates = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorLocationPrivateArgs
    ///             {
    ///                 Guid = location.Id,
    ///                 VsePassword = "secret",
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
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
    /// Synthetics monitor scripts can be imported using the `guid`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/scriptMonitor:ScriptMonitor monitor &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/scriptMonitor:ScriptMonitor")]
    public partial class ScriptMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
        /// </summary>
        [Output("browsers")]
        public Output<ImmutableArray<string>> Browsers { get; private set; } = null!;

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Output("deviceOrientation")]
        public Output<string?> DeviceOrientation { get; private set; } = null!;

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Output("deviceType")]
        public Output<string?> DeviceType { get; private set; } = null!;

        /// <summary>
        /// The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
        /// </summary>
        [Output("devices")]
        public Output<ImmutableArray<string>> Devices { get; private set; } = null!;

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
        /// The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
        /// </summary>
        [Output("locationPrivates")]
        public Output<ImmutableArray<Outputs.ScriptMonitorLocationPrivate>> LocationPrivates { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
        /// </summary>
        [Output("locationsPublics")]
        public Output<ImmutableArray<string>> LocationsPublics { get; private set; } = null!;

        /// <summary>
        /// The monitor id of the Synthetics script monitor (not to be confused with the GUID of the monitor).
        /// </summary>
        [Output("monitorId")]
        public Output<string> MonitorId { get; private set; } = null!;

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
        /// </summary>
        [Output("period")]
        public Output<string> Period { get; private set; } = null!;

        /// <summary>
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Output("periodInMinutes")]
        public Output<int> PeriodInMinutes { get; private set; } = null!;

        /// <summary>
        /// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
        /// </summary>
        [Output("runtimeType")]
        public Output<string?> RuntimeType { get; private set; } = null!;

        /// <summary>
        /// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
        /// </summary>
        [Output("runtimeTypeVersion")]
        public Output<string?> RuntimeTypeVersion { get; private set; } = null!;

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Output("script")]
        public Output<string?> Script { get; private set; } = null!;

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Output("scriptLanguage")]
        public Output<string?> ScriptLanguage { get; private set; } = null!;

        /// <summary>
        /// The run state of the monitor. (`ENABLED` or `DISABLED`).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SCRIPTED_BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ScriptMonitorTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("useUnsupportedLegacyRuntime")]
        public Output<bool?> UseUnsupportedLegacyRuntime { get; private set; } = null!;


        /// <summary>
        /// Create a ScriptMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScriptMonitor(string name, ScriptMonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, args ?? new ScriptMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScriptMonitor(string name, Input<string> id, ScriptMonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScriptMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScriptMonitor Get(string name, Input<string> id, ScriptMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new ScriptMonitor(name, id, state, options);
        }
    }

    public sealed class ScriptMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("browsers")]
        private InputList<string>? _browsers;

        /// <summary>
        /// The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
        /// </summary>
        public InputList<string> Browsers
        {
            get => _browsers ?? (_browsers = new InputList<string>());
            set => _browsers = value;
        }

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Input("deviceOrientation")]
        public Input<string>? DeviceOrientation { get; set; }

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        [Input("devices")]
        private InputList<string>? _devices;

        /// <summary>
        /// The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
        /// </summary>
        public InputList<string> Devices
        {
            get => _devices ?? (_devices = new InputList<string>());
            set => _devices = value;
        }

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

        [Input("locationPrivates")]
        private InputList<Inputs.ScriptMonitorLocationPrivateArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
        /// </summary>
        public InputList<Inputs.ScriptMonitorLocationPrivateArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.ScriptMonitorLocationPrivateArgs>());
            set => _locationPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
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
        /// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
        /// </summary>
        [Input("period", required: true)]
        public Input<string> Period { get; set; } = null!;

        /// <summary>
        /// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The run state of the monitor. (`ENABLED` or `DISABLED`).
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ScriptMonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SCRIPTED_BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        public InputList<Inputs.ScriptMonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ScriptMonitorTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("useUnsupportedLegacyRuntime")]
        public Input<bool>? UseUnsupportedLegacyRuntime { get; set; }

        public ScriptMonitorArgs()
        {
        }
        public static new ScriptMonitorArgs Empty => new ScriptMonitorArgs();
    }

    public sealed class ScriptMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("browsers")]
        private InputList<string>? _browsers;

        /// <summary>
        /// The multiple browsers list on which synthetic monitors will run. Valid values are `CHROME` and `FIREFOX`.
        /// </summary>
        public InputList<string> Browsers
        {
            get => _browsers ?? (_browsers = new InputList<string>());
            set => _browsers = value;
        }

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Input("deviceOrientation")]
        public Input<string>? DeviceOrientation { get; set; }

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`. We recommend you to use `devices` field instead of `device_type`,`device_orientation` fields, as it allows you to select multiple combinations of device types and orientations.
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        [Input("devices")]
        private InputList<string>? _devices;

        /// <summary>
        /// The multiple devices list on which synthetic monitors will run. Valid values are `DESKTOP`, `MOBILE_LANDSCAPE`, `MOBILE_PORTRAIT`, `TABLET_LANDSCAPE` and `TABLET_PORTRAIT`.
        /// </summary>
        public InputList<string> Devices
        {
            get => _devices ?? (_devices = new InputList<string>());
            set => _devices = value;
        }

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
        private InputList<Inputs.ScriptMonitorLocationPrivateGetArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. See Nested location_private blocks below for details. **At least one of either** `locations_public` **or** `location_private` **is required**.
        /// </summary>
        public InputList<Inputs.ScriptMonitorLocationPrivateGetArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.ScriptMonitorLocationPrivateGetArgs>());
            set => _locationPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Check out [this page](https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/) for a list of valid public locations. The `AWS_` prefix is not needed, as the provider uses NerdGraph. **At least one of either** `locations_public` **or** `location_private` **is required**.
        /// </summary>
        public InputList<string> LocationsPublics
        {
            get => _locationsPublics ?? (_locationsPublics = new InputList<string>());
            set => _locationsPublics = value;
        }

        /// <summary>
        /// The monitor id of the Synthetics script monitor (not to be confused with the GUID of the monitor).
        /// </summary>
        [Input("monitorId")]
        public Input<string>? MonitorId { get; set; }

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are `EVERY_MINUTE`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `EVERY_HOUR`, `EVERY_6_HOURS`, `EVERY_12_HOURS`, or `EVERY_DAY`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Input("periodInMinutes")]
        public Input<int>? PeriodInMinutes { get; set; }

        /// <summary>
        /// The runtime that the monitor will use to run jobs. For the `SCRIPT_API` monitor type, a valid value is `NODE_API`. For the `SCRIPT_BROWSER` monitor type, a valid value is `CHROME_BROWSER`.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected. For the `SCRIPT_API` monitor type, a valid value is `16.10`, which corresponds to the version of Node.js. For the `SCRIPT_BROWSER` monitor type, a valid value is `100`, which corresponds to the version of the Chrome browser.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The run state of the monitor. (`ENABLED` or `DISABLED`).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.ScriptMonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SCRIPTED_BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        public InputList<Inputs.ScriptMonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ScriptMonitorTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("useUnsupportedLegacyRuntime")]
        public Input<bool>? UseUnsupportedLegacyRuntime { get; set; }

        public ScriptMonitorState()
        {
        }
        public static new ScriptMonitorState Empty => new ScriptMonitorState();
    }
}
