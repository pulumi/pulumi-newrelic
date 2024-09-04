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
    public sealed class OneDashboardPageWidgetBulletInitialSorting
    {
        /// <summary>
        /// (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private OneDashboardPageWidgetBulletInitialSorting(
            string direction,

            string name)
        {
            Direction = direction;
            Name = name;
        }
    }
}
