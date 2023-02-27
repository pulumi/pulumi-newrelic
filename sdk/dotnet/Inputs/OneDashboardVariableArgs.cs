// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardVariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultValues")]
        private InputList<string>? _defaultValues;

        /// <summary>
        /// (Optional) A list of default values for this variable.
        /// </summary>
        public InputList<string> DefaultValues
        {
            get => _defaultValues ?? (_defaultValues = new InputList<string>());
            set => _defaultValues = value;
        }

        /// <summary>
        /// (Optional) Indicates whether this variable supports multiple selection or not. Only applies to variables of type `nrql` or `enum`.
        /// </summary>
        [Input("isMultiSelection")]
        public Input<bool>? IsMultiSelection { get; set; }

        [Input("items")]
        private InputList<Inputs.OneDashboardVariableItemArgs>? _items;

        /// <summary>
        /// (Optional) List of possible values for variables of type `enum`. See Nested item blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardVariableItemArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.OneDashboardVariableItemArgs>());
            set => _items = value;
        }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        [Input("nrqlQuery")]
        public Input<Inputs.OneDashboardVariableNrqlQueryArgs>? NrqlQuery { get; set; }

        /// <summary>
        /// (Optional) Indicates the strategy to apply when replacing a variable in a NRQL query. One of `default`, `identifier`, `number` or `string`.
        /// </summary>
        [Input("replacementStrategy", required: true)]
        public Input<string> ReplacementStrategy { get; set; } = null!;

        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// (Required) Specifies the data type of the variable and where its possible values may come from. One of `enum`, `nrql` or `string`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public OneDashboardVariableArgs()
        {
        }
        public static new OneDashboardVariableArgs Empty => new OneDashboardVariableArgs();
    }
}