// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetLogTableInitialSortingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Defines the sort order. Accepted values are `asc` for ascending or `desc` for descending.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public OneDashboardPageWidgetLogTableInitialSortingGetArgs()
        {
        }
        public static new OneDashboardPageWidgetLogTableInitialSortingGetArgs Empty => new OneDashboardPageWidgetLogTableInitialSortingGetArgs();
    }
}
