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
    /// Use this resource to create and manage New Relic dashboards.
    /// 
    /// ## Example Usage
    /// ### Create A New Relic Dashboard
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myApplication = Output.Create(NewRelic.GetEntity.InvokeAsync(new NewRelic.GetEntityArgs
    ///         {
    ///             Name = "My Application",
    ///             Type = "APPLICATION",
    ///             Domain = "APM",
    ///         }));
    ///         var exampledash = new NewRelic.Dashboard("exampledash", new NewRelic.DashboardArgs
    ///         {
    ///             Title = "New Relic Terraform Example",
    ///             Filter = new NewRelic.Inputs.DashboardFilterArgs
    ///             {
    ///                 EventTypes = 
    ///                 {
    ///                     "Transaction",
    ///                 },
    ///                 Attributes = 
    ///                 {
    ///                     "appName",
    ///                     "name",
    ///                 },
    ///             },
    ///             Widgets = 
    ///             {
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Requests per minute",
    ///                     Visualization = "billboard",
    ///                     Nrql = "SELECT rate(count(*), 1 minute) FROM Transaction",
    ///                     Row = 1,
    ///                     Column = 1,
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Error rate",
    ///                     Visualization = "gauge",
    ///                     Nrql = "SELECT percentage(count(*), WHERE error IS True) FROM Transaction",
    ///                     ThresholdRed = 2.5,
    ///                     Row = 1,
    ///                     Column = 2,
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Average transaction duration, by application",
    ///                     Visualization = "facet_bar_chart",
    ///                     Nrql = "SELECT average(duration) FROM Transaction FACET appName",
    ///                     Row = 1,
    ///                     Column = 3,
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Apdex, top 5 by host",
    ///                     Duration = 1800000,
    ///                     Visualization = "metric_line_chart",
    ///                     EntityIds = 
    ///                     {
    ///                         myApplication.Apply(myApplication =&gt; myApplication.ApplicationId),
    ///                     },
    ///                     Metrics = 
    ///                     {
    ///                         new NewRelic.Inputs.DashboardWidgetMetricArgs
    ///                         {
    ///                             Name = "Apdex",
    ///                             Values = 
    ///                             {
    ///                                 "score",
    ///                             },
    ///                         },
    ///                     },
    ///                     Facet = "host",
    ///                     Limit = 5,
    ///                     OrderBy = "score",
    ///                     Row = 2,
    ///                     Column = 1,
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Requests per minute, by transaction",
    ///                     Visualization = "facet_table",
    ///                     Nrql = "SELECT rate(count(*), 1 minute) FROM Transaction FACET name",
    ///                     Row = 2,
    ///                     Column = 2,
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Dashboard Note",
    ///                     Visualization = "markdown",
    ///                     Source = @"### Helpful Links
    /// 
    /// * [New Relic One](https://one.newrelic.com)
    /// * [Developer Portal](https://developer.newrelic.com)",
    ///                     Row = 2,
    ///                     Column = 3,
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// See additional examples.
    /// ## Additional Examples
    /// 
    /// ### Create cross-account widgets in your dashboard.
    /// 
    /// The example below shows how you can display data for an application from a primary account and an application from a subaccount. In order to create cross-account widgets, you must use an API key from a user with admin permissions in the primary account. Please see the `widget` attribute documentation for more details.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var primaryAccountApplication = Output.Create(NewRelic.GetEntity.InvokeAsync(new NewRelic.GetEntityArgs
    ///         {
    ///             Name = "Main Account Application Name",
    ///             Type = "APPLICATION",
    ///             Domain = "APM",
    ///         }));
    ///         var subaccountApplication = Output.Create(NewRelic.GetEntity.InvokeAsync(new NewRelic.GetEntityArgs
    ///         {
    ///             Name = "Subaccount Application Name",
    ///             Type = "APPLICATION",
    ///             Domain = "APM",
    ///         }));
    ///         var crossAccountWidgetExample = new NewRelic.Dashboard("crossAccountWidgetExample", new NewRelic.DashboardArgs
    ///         {
    ///             Title = "tf-test-cross-account-widget-dashboard",
    ///             Filter = new NewRelic.Inputs.DashboardFilterArgs
    ///             {
    ///                 EventTypes = 
    ///                 {
    ///                     "Transaction",
    ///                 },
    ///                 Attributes = 
    ///                 {
    ///                     "appName",
    ///                     "envName",
    ///                 },
    ///             },
    ///             GridColumnCount = 12,
    ///             Widgets = 
    ///             {
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     Title = "Apdex (primary account)",
    ///                     Row = 1,
    ///                     Column = 1,
    ///                     Width = 6,
    ///                     Height = 3,
    ///                     Visualization = "metric_line_chart",
    ///                     Duration = 1800000,
    ///                     Metrics = 
    ///                     {
    ///                         new NewRelic.Inputs.DashboardWidgetMetricArgs
    ///                         {
    ///                             Name = "Apdex",
    ///                             Values = 
    ///                             {
    ///                                 "score",
    ///                             },
    ///                         },
    ///                     },
    ///                     EntityIds = 
    ///                     {
    ///                         primaryAccountApplication.Apply(primaryAccountApplication =&gt; primaryAccountApplication.ApplicationId),
    ///                     },
    ///                 },
    ///                 new NewRelic.Inputs.DashboardWidgetArgs
    ///                 {
    ///                     AccountId = @var.Subaccount_id,
    ///                     Title = "Apdex (subaccount)",
    ///                     Row = 1,
    ///                     Column = 7,
    ///                     Width = 6,
    ///                     Height = 3,
    ///                     Visualization = "metric_line_chart",
    ///                     Duration = 1800000,
    ///                     Metrics = 
    ///                     {
    ///                         new NewRelic.Inputs.DashboardWidgetMetricArgs
    ///                         {
    ///                             Name = "Apdex",
    ///                             Values = 
    ///                             {
    ///                                 "score",
    ///                             },
    ///                         },
    ///                     },
    ///                     EntityIds = 
    ///                     {
    ///                         subaccountApplication.Apply(subaccountApplication =&gt; subaccountApplication.ApplicationId),
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// New Relic dashboards can be imported using their ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/dashboard:Dashboard my_dashboard 8675309
    /// ```
    /// 
    ///  ~&gt; **NOTE** Due to API restrictions, importing a dashboard resource will set the `grid_column_count` attribute to `3`. If your dashboard is a New Relic One dashboard _and_ uses a 12 column grid, you will need to make sure `grid_column_count` is set to `12` in your configuration, then run `terraform apply` after importing to sync remote state with Terraform state. Also note, cross-account widgets cannot be imported due to API restrictions.
    /// </summary>
    [NewRelicResourceType("newrelic:index/dashboard:Dashboard")]
    public partial class Dashboard : Pulumi.CustomResource
    {
        /// <summary>
        /// The URL for viewing the dashboard.
        /// </summary>
        [Output("dashboardUrl")]
        public Output<string> DashboardUrl { get; private set; } = null!;

        /// <summary>
        /// Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        /// </summary>
        [Output("editable")]
        public Output<string?> Editable { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        /// </summary>
        [Output("filter")]
        public Output<Outputs.DashboardFilter?> Filter { get; private set; } = null!;

        /// <summary>
        /// The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        /// </summary>
        [Output("gridColumnCount")]
        public Output<int?> GridColumnCount { get; private set; } = null!;

        /// <summary>
        /// The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        /// </summary>
        [Output("icon")]
        public Output<string?> Icon { get; private set; } = null!;

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        /// </summary>
        [Output("visibility")]
        public Output<string?> Visibility { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        /// </summary>
        [Output("widgets")]
        public Output<ImmutableArray<Outputs.DashboardWidget>> Widgets { get; private set; } = null!;


        /// <summary>
        /// Create a Dashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dashboard(string name, DashboardArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/dashboard:Dashboard", name, args ?? new DashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dashboard(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/dashboard:Dashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dashboard Get(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new Dashboard(name, id, state, options);
        }
    }

    public sealed class DashboardArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        /// </summary>
        [Input("editable")]
        public Input<string>? Editable { get; set; }

        /// <summary>
        /// A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.DashboardFilterArgs>? Filter { get; set; }

        /// <summary>
        /// The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        /// </summary>
        [Input("gridColumnCount")]
        public Input<int>? GridColumnCount { get; set; }

        /// <summary>
        /// The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        /// </summary>
        [Input("icon")]
        public Input<string>? Icon { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        /// </summary>
        [Input("visibility")]
        public Input<string>? Visibility { get; set; }

        [Input("widgets")]
        private InputList<Inputs.DashboardWidgetArgs>? _widgets;

        /// <summary>
        /// A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.DashboardWidgetArgs> Widgets
        {
            get => _widgets ?? (_widgets = new InputList<Inputs.DashboardWidgetArgs>());
            set => _widgets = value;
        }

        public DashboardArgs()
        {
        }
    }

    public sealed class DashboardState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL for viewing the dashboard.
        /// </summary>
        [Input("dashboardUrl")]
        public Input<string>? DashboardUrl { get; set; }

        /// <summary>
        /// Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        /// </summary>
        [Input("editable")]
        public Input<string>? Editable { get; set; }

        /// <summary>
        /// A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.DashboardFilterGetArgs>? Filter { get; set; }

        /// <summary>
        /// The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        /// </summary>
        [Input("gridColumnCount")]
        public Input<int>? GridColumnCount { get; set; }

        /// <summary>
        /// The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        /// </summary>
        [Input("icon")]
        public Input<string>? Icon { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        /// </summary>
        [Input("visibility")]
        public Input<string>? Visibility { get; set; }

        [Input("widgets")]
        private InputList<Inputs.DashboardWidgetGetArgs>? _widgets;

        /// <summary>
        /// A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.DashboardWidgetGetArgs> Widgets
        {
            get => _widgets ?? (_widgets = new InputList<Inputs.DashboardWidgetGetArgs>());
            set => _widgets = value;
        }

        public DashboardState()
        {
        }
    }
}
