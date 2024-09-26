// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetLogTableDataFormatGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) This attribute is provided when the `name` is that of a column comprising date/time values and the `type` attribute is set to `custom` defining the specific date format to be applied to your data.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Optional) This attribute is utilized when the `type` attribute is set to `decimal`, stipulating the precise number of digits after the decimal point for your data.
        /// </summary>
        [Input("precision")]
        public Input<int>? Precision { get; set; }

        /// <summary>
        /// (Required) Specifies the data type of the variable and where its possible values may come from. One of `enum`, `nrql` or `string`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public OneDashboardPageWidgetLogTableDataFormatGetArgs()
        {
        }
        public static new OneDashboardPageWidgetLogTableDataFormatGetArgs Empty => new OneDashboardPageWidgetLogTableDataFormatGetArgs();
    }
}
