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
    /// Use this resource to update a synthetics monitor script in New Relic.
    /// 
    /// 
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_monitor_script.html.markdown.
    /// </summary>
    public partial class MonitorScript : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the monitor to attach the script to.
        /// </summary>
        [Output("monitorId")]
        public Output<string> MonitorId { get; private set; } = null!;

        /// <summary>
        /// The plaintext representing the monitor script.
        /// </summary>
        [Output("text")]
        public Output<string> Text { get; private set; } = null!;


        /// <summary>
        /// Create a MonitorScript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitorScript(string name, MonitorScriptArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/monitorScript:MonitorScript", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private MonitorScript(string name, Input<string> id, MonitorScriptState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/monitorScript:MonitorScript", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MonitorScript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitorScript Get(string name, Input<string> id, MonitorScriptState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitorScript(name, id, state, options);
        }
    }

    public sealed class MonitorScriptArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the monitor to attach the script to.
        /// </summary>
        [Input("monitorId", required: true)]
        public Input<string> MonitorId { get; set; } = null!;

        /// <summary>
        /// The plaintext representing the monitor script.
        /// </summary>
        [Input("text", required: true)]
        public Input<string> Text { get; set; } = null!;

        public MonitorScriptArgs()
        {
        }
    }

    public sealed class MonitorScriptState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the monitor to attach the script to.
        /// </summary>
        [Input("monitorId")]
        public Input<string>? MonitorId { get; set; }

        /// <summary>
        /// The plaintext representing the monitor script.
        /// </summary>
        [Input("text")]
        public Input<string>? Text { get; set; }

        public MonitorScriptState()
        {
        }
    }
}
