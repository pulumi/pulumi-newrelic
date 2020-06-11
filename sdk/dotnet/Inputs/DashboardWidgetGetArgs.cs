// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class DashboardWidgetGetArgs : Pulumi.ResourceArgs
    {
        [Input("column", required: true)]
        public Input<int> Column { get; set; } = null!;

        [Input("compareWiths")]
        private InputList<Inputs.DashboardWidgetCompareWithGetArgs>? _compareWiths;
        public InputList<Inputs.DashboardWidgetCompareWithGetArgs> CompareWiths
        {
            get => _compareWiths ?? (_compareWiths = new InputList<Inputs.DashboardWidgetCompareWithGetArgs>());
            set => _compareWiths = value;
        }

        [Input("drilldownDashboardId")]
        public Input<int>? DrilldownDashboardId { get; set; }

        [Input("duration")]
        public Input<int>? Duration { get; set; }

        [Input("endTime")]
        public Input<int>? EndTime { get; set; }

        [Input("entityIds")]
        private InputList<int>? _entityIds;
        public InputList<int> EntityIds
        {
            get => _entityIds ?? (_entityIds = new InputList<int>());
            set => _entityIds = value;
        }

        [Input("facet")]
        public Input<string>? Facet { get; set; }

        [Input("height")]
        public Input<int>? Height { get; set; }

        [Input("limit")]
        public Input<int>? Limit { get; set; }

        [Input("metrics")]
        private InputList<Inputs.DashboardWidgetMetricGetArgs>? _metrics;
        public InputList<Inputs.DashboardWidgetMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.DashboardWidgetMetricGetArgs>());
            set => _metrics = value;
        }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("nrql")]
        public Input<string>? Nrql { get; set; }

        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        [Input("rawMetricName")]
        public Input<string>? RawMetricName { get; set; }

        [Input("row", required: true)]
        public Input<int> Row { get; set; } = null!;

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("thresholdRed")]
        public Input<double>? ThresholdRed { get; set; }

        [Input("thresholdYellow")]
        public Input<double>? ThresholdYellow { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("visualization", required: true)]
        public Input<string> Visualization { get; set; } = null!;

        [Input("widgetId")]
        public Input<int>? WidgetId { get; set; }

        [Input("width")]
        public Input<int>? Width { get; set; }

        public DashboardWidgetGetArgs()
        {
        }
    }
}