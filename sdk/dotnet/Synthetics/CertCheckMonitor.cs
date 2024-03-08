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
    /// Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var cert_check_monitor = new NewRelic.Synthetics.CertCheckMonitor("cert-check-monitor", new()
    ///     {
    ///         CertificateExpiration = 10,
    ///         Domain = "www.example.com",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.CertCheckMonitorTagArgs
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
    /// &lt;!--End PulumiCodeChooser --&gt;
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
    /// &lt;!--Start PulumiCodeChooser --&gt;
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
    ///     var monitor = new NewRelic.Synthetics.CertCheckMonitor("monitor", new()
    ///     {
    ///         Domain = "https://www.one.example.com",
    ///         LocationsPrivates = new[]
    ///         {
    ///             location.Id,
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.CertCheckMonitorTagArgs
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
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Synthetics certificate check monitor scripts can be imported using the `guid`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/certCheckMonitor:CertCheckMonitor")]
    public partial class CertCheckMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The desired number of remaining days until the certificate expires to trigger a monitor failure.
        /// </summary>
        [Output("certificateExpiration")]
        public Output<int> CertificateExpiration { get; private set; } = null!;

        /// <summary>
        /// The domain of the host that will have its certificate checked.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

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
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Output("periodInMinutes")]
        public Output<int> PeriodInMinutes { get; private set; } = null!;

        /// <summary>
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        /// value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        /// refrain from using this value and shift to alternatives.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.CertCheckMonitorTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a CertCheckMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertCheckMonitor(string name, CertCheckMonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, args ?? new CertCheckMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertCheckMonitor(string name, Input<string> id, CertCheckMonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CertCheckMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertCheckMonitor Get(string name, Input<string> id, CertCheckMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new CertCheckMonitor(name, id, state, options);
        }
    }

    public sealed class CertCheckMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The desired number of remaining days until the certificate expires to trigger a monitor failure.
        /// </summary>
        [Input("certificateExpiration", required: true)]
        public Input<int> CertificateExpiration { get; set; } = null!;

        /// <summary>
        /// The domain of the host that will have its certificate checked.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

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
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        /// value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        /// refrain from using this value and shift to alternatives.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.CertCheckMonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        public InputList<Inputs.CertCheckMonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.CertCheckMonitorTagArgs>());
            set => _tags = value;
        }

        public CertCheckMonitorArgs()
        {
        }
        public static new CertCheckMonitorArgs Empty => new CertCheckMonitorArgs();
    }

    public sealed class CertCheckMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The desired number of remaining days until the certificate expires to trigger a monitor failure.
        /// </summary>
        [Input("certificateExpiration")]
        public Input<int>? CertificateExpiration { get; set; }

        /// <summary>
        /// The domain of the host that will have its certificate checked.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

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
        /// The interval in minutes at which Synthetic monitor should run.
        /// </summary>
        [Input("periodInMinutes")]
        public Input<int>? PeriodInMinutes { get; set; }

        /// <summary>
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        /// value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        /// refrain from using this value and shift to alternatives.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.CertCheckMonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details
        /// </summary>
        public InputList<Inputs.CertCheckMonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.CertCheckMonitorTagGetArgs>());
            set => _tags = value;
        }

        public CertCheckMonitorState()
        {
        }
        public static new CertCheckMonitorState Empty => new CertCheckMonitorState();
    }
}
