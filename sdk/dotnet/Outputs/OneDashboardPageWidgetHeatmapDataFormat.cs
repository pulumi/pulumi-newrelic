// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class OneDashboardPageWidgetHeatmapDataFormat
    {
        /// <summary>
        /// (Optional) This attribute is provided when the `name` is that of a column comprising date/time values and the `type` attribute is set to `custom` defining the specific date format to be applied to your data.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Optional) This attribute is utilized when the `type` attribute is set to `decimal`, stipulating the precise number of digits after the decimal point for your data.
        /// </summary>
        public readonly int? Precision;
        /// <summary>
        /// (Required) Specifies the data type of the variable and where its possible values may come from. One of `enum`, `nrql` or `string`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private OneDashboardPageWidgetHeatmapDataFormat(
            string? format,

            string name,

            int? precision,

            string type)
        {
            Format = format;
            Name = name;
            Precision = precision;
            Type = type;
        }
    }
}
