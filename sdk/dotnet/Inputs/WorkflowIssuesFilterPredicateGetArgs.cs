// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowIssuesFilterPredicateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Issue event attribute to check
        /// </summary>
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        /// <summary>
        /// An operator to use to compare the attribute with the provided `values`, see supported operators below
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// The `attribute` must match **any** of the values in this list
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public WorkflowIssuesFilterPredicateGetArgs()
        {
        }
        public static new WorkflowIssuesFilterPredicateGetArgs Empty => new WorkflowIssuesFilterPredicateGetArgs();
    }
}
