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
    /// ## Import
    /// 
    /// New Relic dashboards can be imported using their GUID, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/oneDashboard:OneDashboard my_dashboard &lt;dashboard GUID&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/oneDashboard:OneDashboard")]
    public partial class OneDashboard : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Brief text describing the dashboard.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the dashboard page in New Relic.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a page. See Nested page blocks below for details.
        /// </summary>
        [Output("pages")]
        public Output<ImmutableArray<Outputs.OneDashboardPage>> Pages { get; private set; } = null!;

        /// <summary>
        /// The URL for viewing the dashboard.
        /// </summary>
        [Output("permalink")]
        public Output<string> Permalink { get; private set; } = null!;

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
        /// </summary>
        [Output("permissions")]
        public Output<string?> Permissions { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
        /// </summary>
        [Output("variables")]
        public Output<ImmutableArray<Outputs.OneDashboardVariable>> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a OneDashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OneDashboard(string name, OneDashboardArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/oneDashboard:OneDashboard", name, args ?? new OneDashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OneDashboard(string name, Input<string> id, OneDashboardState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/oneDashboard:OneDashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OneDashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OneDashboard Get(string name, Input<string> id, OneDashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new OneDashboard(name, id, state, options);
        }
    }

    public sealed class OneDashboardArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Brief text describing the dashboard.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("pages", required: true)]
        private InputList<Inputs.OneDashboardPageArgs>? _pages;

        /// <summary>
        /// A nested block that describes a page. See Nested page blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageArgs> Pages
        {
            get => _pages ?? (_pages = new InputList<Inputs.OneDashboardPageArgs>());
            set => _pages = value;
        }

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        [Input("variables")]
        private InputList<Inputs.OneDashboardVariableArgs>? _variables;

        /// <summary>
        /// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.OneDashboardVariableArgs>());
            set => _variables = value;
        }

        public OneDashboardArgs()
        {
        }
        public static new OneDashboardArgs Empty => new OneDashboardArgs();
    }

    public sealed class OneDashboardState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Brief text describing the dashboard.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique entity identifier of the dashboard page in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("pages")]
        private InputList<Inputs.OneDashboardPageGetArgs>? _pages;

        /// <summary>
        /// A nested block that describes a page. See Nested page blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageGetArgs> Pages
        {
            get => _pages ?? (_pages = new InputList<Inputs.OneDashboardPageGetArgs>());
            set => _pages = value;
        }

        /// <summary>
        /// The URL for viewing the dashboard.
        /// </summary>
        [Input("permalink")]
        public Input<string>? Permalink { get; set; }

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        [Input("variables")]
        private InputList<Inputs.OneDashboardVariableGetArgs>? _variables;

        /// <summary>
        /// A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.OneDashboardVariableGetArgs>());
            set => _variables = value;
        }

        public OneDashboardState()
        {
        }
        public static new OneDashboardState Empty => new OneDashboardState();
    }
}
