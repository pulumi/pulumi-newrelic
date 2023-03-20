// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetBulletUnitSeriesOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("seriesName")]
        public Input<string>? SeriesName { get; set; }

        /// <summary>
        /// (Optional) Choose a unit to customize the unit on your Y axis and in each of your series.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public OneDashboardPageWidgetBulletUnitSeriesOverrideGetArgs()
        {
        }
        public static new OneDashboardPageWidgetBulletUnitSeriesOverrideGetArgs Empty => new OneDashboardPageWidgetBulletUnitSeriesOverrideGetArgs();
    }
}
