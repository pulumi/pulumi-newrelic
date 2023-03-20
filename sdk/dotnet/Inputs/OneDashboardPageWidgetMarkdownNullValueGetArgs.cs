// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetMarkdownNullValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
        /// </summary>
        [Input("nullValue")]
        public Input<string>? NullValue { get; set; }

        [Input("seriesOverrides")]
        private InputList<Inputs.OneDashboardPageWidgetMarkdownNullValueSeriesOverrideGetArgs>? _seriesOverrides;

        /// <summary>
        /// (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetMarkdownNullValueSeriesOverrideGetArgs> SeriesOverrides
        {
            get => _seriesOverrides ?? (_seriesOverrides = new InputList<Inputs.OneDashboardPageWidgetMarkdownNullValueSeriesOverrideGetArgs>());
            set => _seriesOverrides = value;
        }

        public OneDashboardPageWidgetMarkdownNullValueGetArgs()
        {
        }
        public static new OneDashboardPageWidgetMarkdownNullValueGetArgs Empty => new OneDashboardPageWidgetMarkdownNullValueGetArgs();
    }
}
