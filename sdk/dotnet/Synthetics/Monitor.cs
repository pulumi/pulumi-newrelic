// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Newrelic.Synthetics
{
    /// <summary>
    /// Use this resource to create, update, and delete a synthetics monitor in New Relic.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_monitor.html.markdown.
    /// </summary>
    public partial class Monitor : Pulumi.CustomResource
    {
        /// <summary>
        /// Bypass HEAD request.
        /// </summary>
        [Output("bypassHeadRequest")]
        public Output<bool?> BypassHeadRequest { get; private set; } = null!;

        /// <summary>
        /// The interval (in minutes) at which this monitor should run.
        /// </summary>
        [Output("frequency")]
        public Output<int> Frequency { get; private set; } = null!;

        /// <summary>
        /// The locations in which this monitor should be run.
        /// </summary>
        [Output("locations")]
        public Output<ImmutableArray<string>> Locations { get; private set; } = null!;

        /// <summary>
        /// The title of this monitor.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The base threshold for the SLA report.
        /// </summary>
        [Output("slaThreshold")]
        public Output<double?> SlaThreshold { get; private set; } = null!;

        /// <summary>
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED)
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Fail the monitor check if redirected.
        /// </summary>
        [Output("treatRedirectAsFailure")]
        public Output<bool?> TreatRedirectAsFailure { get; private set; } = null!;

        /// <summary>
        /// The monitor type (i.e. SIMPLE, BROWSER, SCRIPT_API, SCRIPT_BROWSER).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The URI for the monitor to hit.
        /// </summary>
        [Output("uri")]
        public Output<string?> Uri { get; private set; } = null!;

        /// <summary>
        /// The string to validate against in the response.
        /// </summary>
        [Output("validationString")]
        public Output<string?> ValidationString { get; private set; } = null!;

        /// <summary>
        /// Verify SSL.
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
            : base("newrelic:synthetics/monitor:Monitor", name, args, MakeResourceOptions(options, ""))
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

    public sealed class MonitorArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bypass HEAD request.
        /// </summary>
        [Input("bypassHeadRequest")]
        public Input<bool>? BypassHeadRequest { get; set; }

        /// <summary>
        /// The interval (in minutes) at which this monitor should run.
        /// </summary>
        [Input("frequency", required: true)]
        public Input<int> Frequency { get; set; } = null!;

        [Input("locations", required: true)]
        private InputList<string>? _locations;

        /// <summary>
        /// The locations in which this monitor should be run.
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        /// <summary>
        /// The title of this monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The base threshold for the SLA report.
        /// </summary>
        [Input("slaThreshold")]
        public Input<double>? SlaThreshold { get; set; }

        /// <summary>
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED)
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// Fail the monitor check if redirected.
        /// </summary>
        [Input("treatRedirectAsFailure")]
        public Input<bool>? TreatRedirectAsFailure { get; set; }

        /// <summary>
        /// The monitor type (i.e. SIMPLE, BROWSER, SCRIPT_API, SCRIPT_BROWSER).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The URI for the monitor to hit.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// The string to validate against in the response.
        /// </summary>
        [Input("validationString")]
        public Input<string>? ValidationString { get; set; }

        /// <summary>
        /// Verify SSL.
        /// </summary>
        [Input("verifySsl")]
        public Input<bool>? VerifySsl { get; set; }

        public MonitorArgs()
        {
        }
    }

    public sealed class MonitorState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bypass HEAD request.
        /// </summary>
        [Input("bypassHeadRequest")]
        public Input<bool>? BypassHeadRequest { get; set; }

        /// <summary>
        /// The interval (in minutes) at which this monitor should run.
        /// </summary>
        [Input("frequency")]
        public Input<int>? Frequency { get; set; }

        [Input("locations")]
        private InputList<string>? _locations;

        /// <summary>
        /// The locations in which this monitor should be run.
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        /// <summary>
        /// The title of this monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The base threshold for the SLA report.
        /// </summary>
        [Input("slaThreshold")]
        public Input<double>? SlaThreshold { get; set; }

        /// <summary>
        /// The monitor status (i.e. ENABLED, MUTED, DISABLED)
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Fail the monitor check if redirected.
        /// </summary>
        [Input("treatRedirectAsFailure")]
        public Input<bool>? TreatRedirectAsFailure { get; set; }

        /// <summary>
        /// The monitor type (i.e. SIMPLE, BROWSER, SCRIPT_API, SCRIPT_BROWSER).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The URI for the monitor to hit.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// The string to validate against in the response.
        /// </summary>
        [Input("validationString")]
        public Input<string>? ValidationString { get; set; }

        /// <summary>
        /// Verify SSL.
        /// </summary>
        [Input("verifySsl")]
        public Input<bool>? VerifySsl { get; set; }

        public MonitorState()
        {
        }
    }
}
