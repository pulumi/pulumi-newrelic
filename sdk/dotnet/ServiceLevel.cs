// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create, update, and delete New Relic Service Level Indicators and Objectives.
    /// 
    /// A New Relic User API key is required to provision this resource.  Set the `api_key`
    /// attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
    /// variable with your User API key.
    /// 
    /// Important:
    /// - Only roles that provide [permissions](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/) to create events to metric rules can create SLI/SLOs.
    /// - Only [Full users](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/#user-type) can view SLI/SLOs.
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
    ///     var foo = new NewRelic.ServiceLevel("foo", new()
    ///     {
    ///         Guid = "MXxBUE18QVBQTElDQVRJT058MQ",
    ///         Name = "Latency",
    ///         Description = "Proportion of requests that are served faster than a threshold.",
    ///         Events = new NewRelic.Inputs.ServiceLevelEventsArgs
    ///         {
    ///             AccountId = 12345678,
    ///             ValidEvents = new NewRelic.Inputs.ServiceLevelEventsValidEventsArgs
    ///             {
    ///                 From = "Transaction",
    ///                 Where = "appName = 'Example application' AND (transactionType='Web')",
    ///             },
    ///             GoodEvents = new NewRelic.Inputs.ServiceLevelEventsGoodEventsArgs
    ///             {
    ///                 From = "Transaction",
    ///                 Where = "appName = 'Example application' AND (transactionType= 'Web') AND duration &lt; 0.1",
    ///             },
    ///         },
    ///         Objective = new NewRelic.Inputs.ServiceLevelObjectiveArgs
    ///         {
    ///             Target = 99,
    ///             TimeWindow = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowArgs
    ///             {
    ///                 Rolling = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowRollingArgs
    ///                 {
    ///                     Count = 7,
    ///                     Unit = "DAY",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Additional Example
    /// 
    /// Service level with tags:
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
    ///     var mySyntheticMonitorServiceLevel = new NewRelic.ServiceLevel("my_synthetic_monitor_service_level", new()
    ///     {
    ///         Guid = "MXxBUE18QVBQTElDQVRJT058MQ",
    ///         Name = "My synthethic monitor - Success",
    ///         Description = "Proportion of successful synthetic checks.",
    ///         Events = new NewRelic.Inputs.ServiceLevelEventsArgs
    ///         {
    ///             AccountId = 12345678,
    ///             ValidEvents = new NewRelic.Inputs.ServiceLevelEventsValidEventsArgs
    ///             {
    ///                 From = "SyntheticCheck",
    ///                 Where = "entityGuid = 'MXxBUE18QVBQTElDQVRJT058MQ'",
    ///             },
    ///             GoodEvents = new NewRelic.Inputs.ServiceLevelEventsGoodEventsArgs
    ///             {
    ///                 From = "SyntheticCheck",
    ///                 Where = "entityGuid = 'MXxBUE18QVBQTElDQVRJT058MQ' AND result='SUCCESS'",
    ///             },
    ///         },
    ///         Objective = new NewRelic.Inputs.ServiceLevelObjectiveArgs
    ///         {
    ///             Target = 99,
    ///             TimeWindow = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowArgs
    ///             {
    ///                 Rolling = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowRollingArgs
    ///                 {
    ///                     Count = 7,
    ///                     Unit = "DAY",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var mySyntheticMonitorServiceLevelTags = new NewRelic.EntityTags("my_synthetic_monitor_service_level_tags", new()
    ///     {
    ///         Guid = mySyntheticMonitorServiceLevel.SliGuid,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "user_journey",
    ///                 Values = new[]
    ///                 {
    ///                     "authentication",
    ///                     "sso",
    ///                 },
    ///             },
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "owner",
    ///                 Values = new[]
    ///                 {
    ///                     "identityTeam",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Using `select` for events
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
    ///     var mySyntheticMonitorDurationServiceLevel = new NewRelic.ServiceLevel("my_synthetic_monitor_duration_service_level", new()
    ///     {
    ///         Guid = "MXxBUE18QVBQTElDQVRJT058MQ",
    ///         Name = "Duration distribution is under 7",
    ///         Description = "Monitor created to test concurrent request from terraform",
    ///         Events = new NewRelic.Inputs.ServiceLevelEventsArgs
    ///         {
    ///             AccountId = 313870,
    ///             ValidEvents = new NewRelic.Inputs.ServiceLevelEventsValidEventsArgs
    ///             {
    ///                 From = "Metric",
    ///                 Select = new NewRelic.Inputs.ServiceLevelEventsValidEventsSelectArgs
    ///                 {
    ///                     Attribute = "`query.wallClockTime.negative.distribution`",
    ///                     Function = "GET_FIELD",
    ///                 },
    ///                 Where = "metricName = 'query.wallClockTime.negative.distribution'",
    ///             },
    ///             GoodEvents = new NewRelic.Inputs.ServiceLevelEventsGoodEventsArgs
    ///             {
    ///                 From = "Metric",
    ///                 Select = new NewRelic.Inputs.ServiceLevelEventsGoodEventsSelectArgs
    ///                 {
    ///                     Attribute = "`query.wallClockTime.negative.distribution`",
    ///                     Function = "GET_CDF_COUNT",
    ///                     Threshold = 7,
    ///                 },
    ///                 Where = "metricName = 'query.wallClockTime.negative.distribution'",
    ///             },
    ///         },
    ///         Objective = new NewRelic.Inputs.ServiceLevelObjectiveArgs
    ///         {
    ///             Target = 49,
    ///             TimeWindow = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowArgs
    ///             {
    ///                 Rolling = new NewRelic.Inputs.ServiceLevelObjectiveTimeWindowRollingArgs
    ///                 {
    ///                     Count = 7,
    ///                     Unit = "DAY",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
    /// 
    /// ## Import
    /// 
    /// New Relic Service Levels can be imported using a concatenated string of the format
    /// 
    ///  `&lt;account_id&gt;:&lt;sli_id&gt;:&lt;guid&gt;`, where the `guid` is the entity the SLI relates to.
    /// 
    /// Example:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/serviceLevel:ServiceLevel foo 12345678:4321:MXxBUE18QVBQTElDQVRJT058MQ
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/serviceLevel:ServiceLevel")]
    public partial class ServiceLevel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the SLI.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The events that define the NRDB data for the SLI/SLO calculations.
        /// See Events below for details.
        /// </summary>
        [Output("events")]
        public Output<Outputs.ServiceLevelEvents> Events { get; private set; } = null!;

        /// <summary>
        /// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// A short name for the SLI that will help anyone understand what it is about.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The objective of the SLI, only one can be defined.
        /// See Objective below for details.
        /// </summary>
        [Output("objective")]
        public Output<Outputs.ServiceLevelObjective> Objective { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the Service Level Indicator in New Relic.
        /// </summary>
        [Output("sliGuid")]
        public Output<string> SliGuid { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the Service Level Indicator.
        /// </summary>
        [Output("sliId")]
        public Output<string> SliId { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceLevel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceLevel(string name, ServiceLevelArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/serviceLevel:ServiceLevel", name, args ?? new ServiceLevelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceLevel(string name, Input<string> id, ServiceLevelState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/serviceLevel:ServiceLevel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceLevel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceLevel Get(string name, Input<string> id, ServiceLevelState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceLevel(name, id, state, options);
        }
    }

    public sealed class ServiceLevelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the SLI.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The events that define the NRDB data for the SLI/SLO calculations.
        /// See Events below for details.
        /// </summary>
        [Input("events", required: true)]
        public Input<Inputs.ServiceLevelEventsArgs> Events { get; set; } = null!;

        /// <summary>
        /// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
        /// </summary>
        [Input("guid", required: true)]
        public Input<string> Guid { get; set; } = null!;

        /// <summary>
        /// A short name for the SLI that will help anyone understand what it is about.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The objective of the SLI, only one can be defined.
        /// See Objective below for details.
        /// </summary>
        [Input("objective", required: true)]
        public Input<Inputs.ServiceLevelObjectiveArgs> Objective { get; set; } = null!;

        public ServiceLevelArgs()
        {
        }
        public static new ServiceLevelArgs Empty => new ServiceLevelArgs();
    }

    public sealed class ServiceLevelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the SLI.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The events that define the NRDB data for the SLI/SLO calculations.
        /// See Events below for details.
        /// </summary>
        [Input("events")]
        public Input<Inputs.ServiceLevelEventsGetArgs>? Events { get; set; }

        /// <summary>
        /// The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to. Note that changing the GUID will force a new resource.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// A short name for the SLI that will help anyone understand what it is about.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The objective of the SLI, only one can be defined.
        /// See Objective below for details.
        /// </summary>
        [Input("objective")]
        public Input<Inputs.ServiceLevelObjectiveGetArgs>? Objective { get; set; }

        /// <summary>
        /// The unique entity identifier of the Service Level Indicator in New Relic.
        /// </summary>
        [Input("sliGuid")]
        public Input<string>? SliGuid { get; set; }

        /// <summary>
        /// The unique entity identifier of the Service Level Indicator.
        /// </summary>
        [Input("sliId")]
        public Input<string>? SliId { get; set; }

        public ServiceLevelState()
        {
        }
        public static new ServiceLevelState Empty => new ServiceLevelState();
    }
}
