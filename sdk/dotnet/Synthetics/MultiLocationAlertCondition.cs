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
    /// Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.
    /// 
    /// &gt; **NOTE:** This is a legacy resource. The newrelic.NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.
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
    ///     var policy = new NewRelic.AlertPolicy("policy", new()
    ///     {
    ///         Name = "my-policy",
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.Monitor("monitor", new()
    ///     {
    ///         LocationsPublics = new[]
    ///         {
    ///             "US_WEST_1",
    ///         },
    ///         Name = "my-monitor",
    ///         Period = "EVERY_10_MINUTES",
    ///         Status = "DISABLED",
    ///         Type = "SIMPLE",
    ///         Uri = "https://www.one.newrelic.com",
    ///     });
    /// 
    ///     var example = new NewRelic.Synthetics.MultiLocationAlertCondition("example", new()
    ///     {
    ///         PolicyId = policy.Id,
    ///         Name = "Example condition",
    ///         RunbookUrl = "https://example.com",
    ///         Enabled = true,
    ///         ViolationTimeLimitSeconds = 3600,
    ///         Entities = new[]
    ///         {
    ///             monitor.Id,
    ///         },
    ///         Critical = new NewRelic.Synthetics.Inputs.MultiLocationAlertConditionCriticalArgs
    ///         {
    ///             Threshold = 2,
    ///         },
    ///         Warning = new NewRelic.Synthetics.Inputs.MultiLocationAlertConditionWarningArgs
    ///         {
    ///             Threshold = 1,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Tags
    /// 
    /// Manage synthetics multilocation alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         Name = "foo policy",
    ///     });
    /// 
    ///     var fooMonitor = new NewRelic.Synthetics.Monitor("foo", new()
    ///     {
    ///         Status = "ENABLED",
    ///         Name = "foo monitor",
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
    ///     var fooMultiLocationAlertCondition = new NewRelic.Synthetics.MultiLocationAlertCondition("foo", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "foo condition",
    ///         RunbookUrl = "https://example.com",
    ///         Enabled = true,
    ///         ViolationTimeLimitSeconds = 3600,
    ///         Entities = new[]
    ///         {
    ///             fooMonitor.Id,
    ///         },
    ///         Critical = new NewRelic.Synthetics.Inputs.MultiLocationAlertConditionCriticalArgs
    ///         {
    ///             Threshold = 2,
    ///         },
    ///         Warning = new NewRelic.Synthetics.Inputs.MultiLocationAlertConditionWarningArgs
    ///         {
    ///             Threshold = 1,
    ///         },
    ///     });
    /// 
    ///     var myConditionEntityTags = new NewRelic.EntityTags("my_condition_entity_tags", new()
    ///     {
    ///         Guid = fooMultiLocationAlertCondition.EntityGuid,
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
    /// 
    /// ## Import
    /// 
    /// New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format
    /// 
    ///  `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition")]
    public partial class MultiLocationAlertCondition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A condition term with priority set to critical.
        /// </summary>
        [Output("critical")]
        public Output<Outputs.MultiLocationAlertConditionCritical> Critical { get; private set; } = null!;

        /// <summary>
        /// Set whether to enable the alert condition. Defaults to true.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The GUIDs of the Synthetics monitors to alert on.
        /// </summary>
        [Output("entities")]
        public Output<ImmutableArray<string>> Entities { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Output("entityGuid")]
        public Output<string> EntityGuid { get; private set; } = null!;

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition will be used.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;

        /// <summary>
        /// Sets a time limit, in seconds, that will automatically force-close a long-lasting incident after the time limit you
        /// select. Must be in the range of 300 to 2592000 (inclusive)
        /// </summary>
        [Output("violationTimeLimitSeconds")]
        public Output<int?> ViolationTimeLimitSeconds { get; private set; } = null!;

        /// <summary>
        /// A condition term with priority set to warning.
        /// </summary>
        [Output("warning")]
        public Output<Outputs.MultiLocationAlertConditionWarning?> Warning { get; private set; } = null!;


        /// <summary>
        /// Create a MultiLocationAlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MultiLocationAlertCondition(string name, MultiLocationAlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, args ?? new MultiLocationAlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MultiLocationAlertCondition(string name, Input<string> id, MultiLocationAlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MultiLocationAlertCondition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MultiLocationAlertCondition Get(string name, Input<string> id, MultiLocationAlertConditionState? state = null, CustomResourceOptions? options = null)
        {
            return new MultiLocationAlertCondition(name, id, state, options);
        }
    }

    public sealed class MultiLocationAlertConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A condition term with priority set to critical.
        /// </summary>
        [Input("critical", required: true)]
        public Input<Inputs.MultiLocationAlertConditionCriticalArgs> Critical { get; set; } = null!;

        /// <summary>
        /// Set whether to enable the alert condition. Defaults to true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities", required: true)]
        private InputList<string>? _entities;

        /// <summary>
        /// The GUIDs of the Synthetics monitors to alert on.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition will be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        /// <summary>
        /// Sets a time limit, in seconds, that will automatically force-close a long-lasting incident after the time limit you
        /// select. Must be in the range of 300 to 2592000 (inclusive)
        /// </summary>
        [Input("violationTimeLimitSeconds")]
        public Input<int>? ViolationTimeLimitSeconds { get; set; }

        /// <summary>
        /// A condition term with priority set to warning.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.MultiLocationAlertConditionWarningArgs>? Warning { get; set; }

        public MultiLocationAlertConditionArgs()
        {
        }
        public static new MultiLocationAlertConditionArgs Empty => new MultiLocationAlertConditionArgs();
    }

    public sealed class MultiLocationAlertConditionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A condition term with priority set to critical.
        /// </summary>
        [Input("critical")]
        public Input<Inputs.MultiLocationAlertConditionCriticalGetArgs>? Critical { get; set; }

        /// <summary>
        /// Set whether to enable the alert condition. Defaults to true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities")]
        private InputList<string>? _entities;

        /// <summary>
        /// The GUIDs of the Synthetics monitors to alert on.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Input("entityGuid")]
        public Input<string>? EntityGuid { get; set; }

        /// <summary>
        /// The title of this condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the policy where this condition will be used.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        /// <summary>
        /// Sets a time limit, in seconds, that will automatically force-close a long-lasting incident after the time limit you
        /// select. Must be in the range of 300 to 2592000 (inclusive)
        /// </summary>
        [Input("violationTimeLimitSeconds")]
        public Input<int>? ViolationTimeLimitSeconds { get; set; }

        /// <summary>
        /// A condition term with priority set to warning.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.MultiLocationAlertConditionWarningGetArgs>? Warning { get; set; }

        public MultiLocationAlertConditionState()
        {
        }
        public static new MultiLocationAlertConditionState Empty => new MultiLocationAlertConditionState();
    }
}
