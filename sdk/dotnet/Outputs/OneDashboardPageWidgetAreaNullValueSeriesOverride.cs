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
    public sealed class OneDashboardPageWidgetAreaNullValueSeriesOverride
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        public readonly string? NullValue;
        public readonly string? SeriesName;

        [OutputConstructor]
        private OneDashboardPageWidgetAreaNullValueSeriesOverride(
            string? nullValue,

            string? seriesName)
        {
            NullValue = nullValue;
            SeriesName = seriesName;
        }
    }
}
