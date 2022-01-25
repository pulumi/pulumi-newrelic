// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class OneDashboardRawPage
    {
        /// <summary>
        /// Brief text describing the dashboard.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The unique entity identifier of the dashboard page in New Relic.
        /// </summary>
        public readonly string? Guid;
        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Optional) A nested block that describes a widget. See Nested widget blocks below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardRawPageWidget> Widgets;

        [OutputConstructor]
        private OneDashboardRawPage(
            string? description,

            string? guid,

            string name,

            ImmutableArray<Outputs.OneDashboardRawPageWidget> widgets)
        {
            Description = description;
            Guid = guid;
            Name = name;
            Widgets = widgets;
        }
    }
}