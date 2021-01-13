// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins
{
    /// <summary>
    /// Use this resource to create, update, and delete a New Relic One workload.
    /// 
    /// A New Relic User API key is required to provision this resource.  Set the `api_key`
    /// attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
    /// variable with your User API key.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new NewRelic.Plugins.Workload("foo", new NewRelic.Plugins.WorkloadArgs
    ///         {
    ///             AccountId = 12345678,
    ///             EntityGuids = 
    ///             {
    ///                 "MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1",
    ///             },
    ///             EntitySearchQueries = 
    ///             {
    ///                 new NewRelic.Plugins.Inputs.WorkloadEntitySearchQueryArgs
    ///                 {
    ///                     Query = "name like 'Example application'",
    ///                 },
    ///             },
    ///             ScopeAccountIds = 
    ///             {
    ///                 12345678,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// New Relic One workloads can be imported using a concatenated string of the format
    /// 
    /// `&lt;account_id&gt;:&lt;workload_id&gt;:&lt;guid&gt;`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:plugins/workload:Workload foo 12345678:1456:MjUyMDUyOHxBUE18QVBRTElDQVRJT058MjE1MDM3Nzk1
    /// ```
    /// </summary>
    public partial class Workload : Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID where you want to create the workload.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The composite query used to compose a dynamic workload.
        /// </summary>
        [Output("compositeEntitySearchQuery")]
        public Output<string> CompositeEntitySearchQuery { get; private set; } = null!;

        /// <summary>
        /// A list of entity GUIDs manually assigned to this workload.
        /// </summary>
        [Output("entityGuids")]
        public Output<ImmutableArray<string>> EntityGuids { get; private set; } = null!;

        /// <summary>
        /// A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
        /// </summary>
        [Output("entitySearchQueries")]
        public Output<ImmutableArray<Outputs.WorkloadEntitySearchQuery>> EntitySearchQueries { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the workload in New Relic.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The workload's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The URL of the workload.
        /// </summary>
        [Output("permalink")]
        public Output<string> Permalink { get; private set; } = null!;

        /// <summary>
        /// A list of account IDs that will be used to get entities from.
        /// </summary>
        [Output("scopeAccountIds")]
        public Output<ImmutableArray<int>> ScopeAccountIds { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the workload.
        /// </summary>
        [Output("workloadId")]
        public Output<int> WorkloadId { get; private set; } = null!;


        /// <summary>
        /// Create a Workload resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Workload(string name, WorkloadArgs? args = null, CustomResourceOptions? options = null)
            : base("newrelic:plugins/workload:Workload", name, args ?? new WorkloadArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Workload(string name, Input<string> id, WorkloadState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:plugins/workload:Workload", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Workload resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Workload Get(string name, Input<string> id, WorkloadState? state = null, CustomResourceOptions? options = null)
        {
            return new Workload(name, id, state, options);
        }
    }

    public sealed class WorkloadArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID where you want to create the workload.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("entityGuids")]
        private InputList<string>? _entityGuids;

        /// <summary>
        /// A list of entity GUIDs manually assigned to this workload.
        /// </summary>
        public InputList<string> EntityGuids
        {
            get => _entityGuids ?? (_entityGuids = new InputList<string>());
            set => _entityGuids = value;
        }

        [Input("entitySearchQueries")]
        private InputList<Inputs.WorkloadEntitySearchQueryArgs>? _entitySearchQueries;

        /// <summary>
        /// A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
        /// </summary>
        public InputList<Inputs.WorkloadEntitySearchQueryArgs> EntitySearchQueries
        {
            get => _entitySearchQueries ?? (_entitySearchQueries = new InputList<Inputs.WorkloadEntitySearchQueryArgs>());
            set => _entitySearchQueries = value;
        }

        /// <summary>
        /// The workload's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scopeAccountIds")]
        private InputList<int>? _scopeAccountIds;

        /// <summary>
        /// A list of account IDs that will be used to get entities from.
        /// </summary>
        public InputList<int> ScopeAccountIds
        {
            get => _scopeAccountIds ?? (_scopeAccountIds = new InputList<int>());
            set => _scopeAccountIds = value;
        }

        public WorkloadArgs()
        {
        }
    }

    public sealed class WorkloadState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID where you want to create the workload.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The composite query used to compose a dynamic workload.
        /// </summary>
        [Input("compositeEntitySearchQuery")]
        public Input<string>? CompositeEntitySearchQuery { get; set; }

        [Input("entityGuids")]
        private InputList<string>? _entityGuids;

        /// <summary>
        /// A list of entity GUIDs manually assigned to this workload.
        /// </summary>
        public InputList<string> EntityGuids
        {
            get => _entityGuids ?? (_entityGuids = new InputList<string>());
            set => _entityGuids = value;
        }

        [Input("entitySearchQueries")]
        private InputList<Inputs.WorkloadEntitySearchQueryGetArgs>? _entitySearchQueries;

        /// <summary>
        /// A list of search queries that define a dynamic workload.  See Nested entity_search_query blocks below for details.
        /// </summary>
        public InputList<Inputs.WorkloadEntitySearchQueryGetArgs> EntitySearchQueries
        {
            get => _entitySearchQueries ?? (_entitySearchQueries = new InputList<Inputs.WorkloadEntitySearchQueryGetArgs>());
            set => _entitySearchQueries = value;
        }

        /// <summary>
        /// The unique entity identifier of the workload in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The workload's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL of the workload.
        /// </summary>
        [Input("permalink")]
        public Input<string>? Permalink { get; set; }

        [Input("scopeAccountIds")]
        private InputList<int>? _scopeAccountIds;

        /// <summary>
        /// A list of account IDs that will be used to get entities from.
        /// </summary>
        public InputList<int> ScopeAccountIds
        {
            get => _scopeAccountIds ?? (_scopeAccountIds = new InputList<int>());
            set => _scopeAccountIds = value;
        }

        /// <summary>
        /// The unique entity identifier of the workload.
        /// </summary>
        [Input("workloadId")]
        public Input<int>? WorkloadId { get; set; }

        public WorkloadState()
        {
        }
    }
}
