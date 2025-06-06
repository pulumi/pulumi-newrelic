// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetLineYAxisRightArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Minimum value of the range to be specified with the Y-Axis on the right of the line widget.
        /// </summary>
        [Input("yAxisRightMax")]
        public Input<double>? YAxisRightMax { get; set; }

        /// <summary>
        /// , `y_axis_right_max` - (Optional) Attributes which help specify a range of minimum and maximum values, which adjust the right Y axis to display the data within the specified minimum and maximum value for the axis.
        /// </summary>
        [Input("yAxisRightMin")]
        public Input<double>? YAxisRightMin { get; set; }

        [Input("yAxisRightSeries")]
        private InputList<string>? _yAxisRightSeries;

        /// <summary>
        /// (Optional) An attribute which takes a list of strings, specifying a selection of series' displayed in the line chart to be adjusted against the values of the right Y-axis.
        /// </summary>
        public InputList<string> YAxisRightSeries
        {
            get => _yAxisRightSeries ?? (_yAxisRightSeries = new InputList<string>());
            set => _yAxisRightSeries = value;
        }

        /// <summary>
        /// (Optional) An attribute that specifies if the values on the graph to be rendered need to be fit to scale, or printed within the specified range from `y_axis_right_min` (or 0 if it is not defined) to `y_axis_right_max`. Use `y_axis_right_zero = true` with a combination of `y_axis_right_min` and `y_axis_right_max` to render values from 0 or the specified minimum to the maximum, and `y_axis_right_zero = false` to fit the graph to scale.
        /// </summary>
        [Input("yAxisRightZero")]
        public Input<bool>? YAxisRightZero { get; set; }

        public OneDashboardPageWidgetLineYAxisRightArgs()
        {
        }
        public static new OneDashboardPageWidgetLineYAxisRightArgs Empty => new OneDashboardPageWidgetLineYAxisRightArgs();
    }
}
