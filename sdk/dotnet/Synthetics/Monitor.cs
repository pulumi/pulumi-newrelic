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
    /// Use this resource to create, update, and delete a Simple or Browser Synthetics Monitor in New Relic.
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
    ///     var monitor = new NewRelic.Synthetics.Monitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "monitor",
    ///         Period = "EVERY_MINUTE",
    ///         Uri = "https://www.one.newrelic.com",
    ///         Type = "SIMPLE",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///         },
    ///         CustomHeaders = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorCustomHeaderArgs
    ///             {
    ///                 Name = "some_name",
    ///                 Value = "some_value",
    ///             },
    ///         },
    ///         TreatRedirectAsFailure = true,
    ///         ValidationString = "success",
    ///         BypassHeadRequest = true,
    ///         VerifySsl = true,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorTagArgs
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
    /// ##### Type: `SIMPLE BROWSER`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var monitor = new NewRelic.Synthetics.Monitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "monitor",
    ///         Period = "EVERY_MINUTE",
    ///         Uri = "https://www.one.newrelic.com",
    ///         Type = "BROWSER",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///         },
    ///         CustomHeaders = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorCustomHeaderArgs
    ///             {
    ///                 Name = "some_name",
    ///                 Value = "some_value",
    ///             },
    ///         },
    ///         EnableScreenshotOnFailureAndScript = true,
    ///         ValidationString = "success",
    ///         VerifySsl = true,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorTagArgs
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
    /// ##### Type: `SIMPLE`
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
    ///         VerifiedScriptExecution = false,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.Monitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "monitor",
    ///         Period = "EVERY_MINUTE",
    ///         Uri = "https://www.one.newrelic.com",
    ///         Type = "SIMPLE",
    ///         LocationsPrivates = new[]
    ///         {
    ///             location.Id,
    ///         },
    ///         CustomHeaders = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorCustomHeaderArgs
    ///             {
    ///                 Name = "some_name",
    ///                 Value = "some_value",
    ///             },
    ///         },
    ///         TreatRedirectAsFailure = true,
    ///         ValidationString = "success",
    ///         BypassHeadRequest = true,
    ///         VerifySsl = true,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorTagArgs
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
    /// ##### Type: `BROWSER`
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
    ///         Name = "private-location",
    ///         VerifiedScriptExecution = false,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.Monitor("monitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Type = "BROWSER",
    ///         Uri = "https://www.one.newrelic.com",
    ///         Name = "monitor",
    ///         Period = "EVERY_MINUTE",
    ///         LocationsPrivates = new[]
    ///         {
    ///             location.Id,
    ///         },
    ///         CustomHeaders = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorCustomHeaderArgs
    ///             {
    ///                 Name = "some_name",
    ///                 Value = "some_value",
    ///             },
    ///         },
    ///         EnableScreenshotOnFailureAndScript = true,
    ///         ValidationString = "success",
    ///         VerifySsl = true,
    ///         RuntimeTypeVersion = "100",
    ///         RuntimeType = "CHROME_BROWSER",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.MonitorTagArgs
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
    /// Synthetics monitor can be imported using the `guid`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/monitor:Monitor monitor &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/monitor:Monitor")]
    public partial class Monitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Monitor should skip default HEAD request and instead use GET verb in check.
        /// 
        /// The `BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        [Output("bypassHeadRequest")]
        public Output<bool?> BypassHeadRequest { get; private set; } = null!;

        /// <summary>
        /// Custom headers to use in monitor job. See Nested custom_header blocks below for details.
        /// </summary>
        [Output("customHeaders")]
        public Output<ImmutableArray<Outputs.MonitorCustomHeader>> CustomHeaders { get; private set; } = null!;

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
        /// </summary>
        [Output("deviceOrientation")]
        public Output<string?> DeviceOrientation { get; private set; } = null!;

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
        /// </summary>
        [Output("deviceType")]
        public Output<string?> DeviceType { get; private set; } = null!;

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Output("enableScreenshotOnFailureAndScript")]
        public Output<bool?> EnableScreenshotOnFailureAndScript { get; private set; } = null!;

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
        /// The human-readable identifier for the monitor.
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
        /// The runtime type that the monitor will run.
        /// </summary>
        [Output("runtimeType")]
        public Output<string?> RuntimeType { get; private set; } = null!;

        /// <summary>
        /// The runtime type that the monitor will run.
        /// </summary>
        [Output("runtimeTypeVersion")]
        public Output<string?> RuntimeTypeVersion { get; private set; } = null!;

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Output("scriptLanguage")]
        public Output<string?> ScriptLanguage { get; private set; } = null!;

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SIMPLE` monitor type supports the following additional arguments:
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.MonitorTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Categorize redirects during a monitor job as a failure.
        /// </summary>
        [Output("treatRedirectAsFailure")]
        public Output<bool?> TreatRedirectAsFailure { get; private set; } = null!;

        /// <summary>
        /// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Output("uri")]
        public Output<string?> Uri { get; private set; } = null!;

        /// <summary>
        /// Validation text for monitor to search for at given URI.
        /// </summary>
        [Output("validationString")]
        public Output<string?> ValidationString { get; private set; } = null!;

        /// <summary>
        /// Monitor should validate SSL certificate chain.
        /// </summary>
        [Output("verifySsl")]
        public Output<bool?> VerifySsl { get; private set; } = null!;


        /// <summary>
        /// Create a Monitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Monitor(string name, MonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/monitor:Monitor", name, args ?? new MonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Monitor(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/monitor:Monitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Monitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Monitor Get(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new Monitor(name, id, state, options);
        }
    }

    public sealed class MonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Monitor should skip default HEAD request and instead use GET verb in check.
        /// 
        /// The `BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        [Input("bypassHeadRequest")]
        public Input<bool>? BypassHeadRequest { get; set; }

        [Input("customHeaders")]
        private InputList<Inputs.MonitorCustomHeaderArgs>? _customHeaders;

        /// <summary>
        /// Custom headers to use in monitor job. See Nested custom_header blocks below for details.
        /// </summary>
        public InputList<Inputs.MonitorCustomHeaderArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.MonitorCustomHeaderArgs>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
        /// </summary>
        [Input("deviceOrientation")]
        public Input<string>? DeviceOrientation { get; set; }

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

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
        /// The human-readable identifier for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The runtime type that the monitor will run.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The runtime type that the monitor will run.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.MonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SIMPLE` monitor type supports the following additional arguments:
        /// </summary>
        public InputList<Inputs.MonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MonitorTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Categorize redirects during a monitor job as a failure.
        /// </summary>
        [Input("treatRedirectAsFailure")]
        public Input<bool>? TreatRedirectAsFailure { get; set; }

        /// <summary>
        /// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// Validation text for monitor to search for at given URI.
        /// </summary>
        [Input("validationString")]
        public Input<string>? ValidationString { get; set; }

        /// <summary>
        /// Monitor should validate SSL certificate chain.
        /// </summary>
        [Input("verifySsl")]
        public Input<bool>? VerifySsl { get; set; }

        public MonitorArgs()
        {
        }
        public static new MonitorArgs Empty => new MonitorArgs();
    }

    public sealed class MonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Monitor should skip default HEAD request and instead use GET verb in check.
        /// 
        /// The `BROWSER` monitor type supports the following additional arguments:
        /// </summary>
        [Input("bypassHeadRequest")]
        public Input<bool>? BypassHeadRequest { get; set; }

        [Input("customHeaders")]
        private InputList<Inputs.MonitorCustomHeaderGetArgs>? _customHeaders;

        /// <summary>
        /// Custom headers to use in monitor job. See Nested custom_header blocks below for details.
        /// </summary>
        public InputList<Inputs.MonitorCustomHeaderGetArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.MonitorCustomHeaderGetArgs>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Device emulation orientation field. Valid values are `LANDSCAPE` and `PORTRAIT`.
        /// </summary>
        [Input("deviceOrientation")]
        public Input<string>? DeviceOrientation { get; set; }

        /// <summary>
        /// Device emulation type field. Valid values are `MOBILE` and `TABLET`.
        /// </summary>
        [Input("deviceType")]
        public Input<string>? DeviceType { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution.
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

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
        /// The human-readable identifier for the monitor.
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
        /// The runtime type that the monitor will run.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The runtime type that the monitor will run.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The monitor status (ENABLED or DISABLED).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.MonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// 
        /// The `SIMPLE` monitor type supports the following additional arguments:
        /// </summary>
        public InputList<Inputs.MonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MonitorTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Categorize redirects during a monitor job as a failure.
        /// </summary>
        [Input("treatRedirectAsFailure")]
        public Input<bool>? TreatRedirectAsFailure { get; set; }

        /// <summary>
        /// The monitor type. Valid values are `SIMPLE` and `BROWSER`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The URI the monitor runs against.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// Validation text for monitor to search for at given URI.
        /// </summary>
        [Input("validationString")]
        public Input<string>? ValidationString { get; set; }

        /// <summary>
        /// Monitor should validate SSL certificate chain.
        /// </summary>
        [Input("verifySsl")]
        public Input<bool>? VerifySsl { get; set; }

        public MonitorState()
        {
        }
        public static new MonitorState Empty => new MonitorState();
    }
}
