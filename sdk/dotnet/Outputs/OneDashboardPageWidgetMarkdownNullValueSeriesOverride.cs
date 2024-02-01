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
    public sealed class OneDashboardPageWidgetMarkdownNullValueSeriesOverride
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        public readonly string? NullValue;
        /// <summary>
        /// Series name
        /// </summary>
        public readonly string? SeriesName;

        [OutputConstructor]
        private OneDashboardPageWidgetMarkdownNullValueSeriesOverride(
            string? nullValue,

            string? seriesName)
        {
            NullValue = nullValue;
            SeriesName = seriesName;
        }
    }
}
