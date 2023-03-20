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
    public sealed class OneDashboardPageWidgetAreaNullValue
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        public readonly string? NullValue;
        /// <summary>
        /// (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetAreaNullValueSeriesOverride> SeriesOverrides;

        [OutputConstructor]
        private OneDashboardPageWidgetAreaNullValue(
            string? nullValue,

            ImmutableArray<Outputs.OneDashboardPageWidgetAreaNullValueSeriesOverride> seriesOverrides)
        {
            NullValue = nullValue;
            SeriesOverrides = seriesOverrides;
        }
    }
}
