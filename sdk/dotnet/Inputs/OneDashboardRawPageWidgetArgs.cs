// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardRawPageWidgetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        [Input("column", required: true)]
        public Input<int> Column { get; set; } = null!;

        /// <summary>
        /// (Required) The configuration of the widget.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<string> Configuration { get; set; } = null!;

        /// <summary>
        /// (Optional) Height of the widget. Valid values are `1` to `12` inclusive. Defaults to `3`.
        /// </summary>
        [Input("height")]
        public Input<int>? Height { get; set; }

        /// <summary>
        /// The ID of the widget.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("linkedEntityGuids")]
        private InputList<string>? _linkedEntityGuids;

        /// <summary>
        /// (Optional) Related entity GUIDs.
        /// </summary>
        public InputList<string> LinkedEntityGuids
        {
            get => _linkedEntityGuids ?? (_linkedEntityGuids = new InputList<string>());
            set => _linkedEntityGuids = value;
        }

        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        [Input("row", required: true)]
        public Input<int> Row { get; set; } = null!;

        /// <summary>
        /// (Required) A title for the widget.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// (Required) The visualization ID of the widget
        /// </summary>
        [Input("visualizationId", required: true)]
        public Input<string> VisualizationId { get; set; } = null!;

        /// <summary>
        /// (Optional) Width of the widget. Valid values are `1` to `12` inclusive. Defaults to `4`.
        /// </summary>
        [Input("width")]
        public Input<int>? Width { get; set; }

        public OneDashboardRawPageWidgetArgs()
        {
        }
        public static new OneDashboardRawPageWidgetArgs Empty => new OneDashboardRawPageWidgetArgs();
    }
}
