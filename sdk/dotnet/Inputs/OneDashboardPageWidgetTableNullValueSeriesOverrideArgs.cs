// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetTableNullValueSeriesOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        [Input("nullValue")]
        public Input<string>? NullValue { get; set; }

        [Input("seriesName")]
        public Input<string>? SeriesName { get; set; }

        public OneDashboardPageWidgetTableNullValueSeriesOverrideArgs()
        {
        }
        public static new OneDashboardPageWidgetTableNullValueSeriesOverrideArgs Empty => new OneDashboardPageWidgetTableNullValueSeriesOverrideArgs();
    }
}
