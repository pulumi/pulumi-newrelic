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
    /// Use this resource to create and manage synthetics alert conditions in New Relic.
    /// 
    /// &gt; **WARNING:** The `newrelic.synthetics.AlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition would be a preferred alternative to configure alert conditions - in most cases, feature parity can be achieved with a NRQL query.
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
    ///     var foo = new NewRelic.Synthetics.AlertCondition("foo", new()
    ///     {
    ///         PolicyId = newrelic_alert_policy.Foo.Id,
    ///         MonitorId = newrelic_synthetics_monitor.Foo.Id,
    ///         RunbookUrl = "https://www.example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Tags
    /// 
    /// Manage synthetics alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
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
    ///     var fooAlertPolicy = new NewRelic.AlertPolicy("fooAlertPolicy");
    /// 
    ///     var fooMonitor = new NewRelic.Synthetics.Monitor("fooMonitor", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Period = "EVERY_MINUTE",
    ///         Uri = "https://www.one.newrelic.com",
    ///         Type = "SIMPLE",
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_EAST_1",
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
    ///     var fooAlertCondition = new NewRelic.Synthetics.AlertCondition("fooAlertCondition", new()
    ///     {
    ///         PolicyId = fooAlertPolicy.Id,
    ///         MonitorId = fooMonitor.Id,
    ///         RunbookUrl = "https://www.example.com",
    ///     });
    /// 
    ///     var myConditionEntityTags = new NewRelic.EntityTags("myConditionEntityTags", new()
    ///     {
    ///         Guid = fooAlertCondition.EntityGuid,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value",
    ///                     "my-other-value",
    ///                 },
    ///             },
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key-2",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value-2",
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
    /// Synthetics alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/alertCondition:AlertCondition")]
    public partial class AlertCondition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set whether to enable the alert condition. Defaults to `true`.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Output("entityGuid")]
        public Output<string> EntityGuid { get; private set; } = null!;

        /// <summary>
        /// The GUID of the Synthetics monitor to be referenced in the alert condition.
        /// </summary>
        [Output("monitorId")]
        public Output<string> MonitorId { get; private set; } = null!;

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Output("policyId")]
        public Output<int> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;


        /// <summary>
        /// Create a AlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertCondition(string name, AlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/alertCondition:AlertCondition", name, args ?? new AlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertCondition(string name, Input<string> id, AlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/alertCondition:AlertCondition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertCondition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertCondition Get(string name, Input<string> id, AlertConditionState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertCondition(name, id, state, options);
        }
    }

    public sealed class AlertConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set whether to enable the alert condition. Defaults to `true`.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The GUID of the Synthetics monitor to be referenced in the alert condition.
        /// </summary>
        [Input("monitorId", required: true)]
        public Input<string> MonitorId { get; set; } = null!;

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<int> PolicyId { get; set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        public AlertConditionArgs()
        {
        }
        public static new AlertConditionArgs Empty => new AlertConditionArgs();
    }

    public sealed class AlertConditionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set whether to enable the alert condition. Defaults to `true`.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Input("entityGuid")]
        public Input<string>? EntityGuid { get; set; }

        /// <summary>
        /// The GUID of the Synthetics monitor to be referenced in the alert condition.
        /// </summary>
        [Input("monitorId")]
        public Input<string>? MonitorId { get; set; }

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        public AlertConditionState()
        {
        }
        public static new AlertConditionState Empty => new AlertConditionState();
    }
}
