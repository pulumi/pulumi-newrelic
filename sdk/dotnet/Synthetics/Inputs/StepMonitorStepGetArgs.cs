// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Inputs
{

    public sealed class StepMonitorStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The position of the step within the script ranging from 0-100.
        /// </summary>
        [Input("ordinal", required: true)]
        public Input<int> Ordinal { get; set; } = null!;

        /// <summary>
        /// Name of the tag key.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// The metadata values related to the step. valid values are ASSERT_ELEMENT, ASSERT_MODAL, ASSERT_TEXT, ASSERT_TITLE, CLICK_ELEMENT, DISMISS_MODAL, DOUBLE_CLICK_ELEMENT, HOVER_ELEMENT, NAVIGATE, SECURE_TEXT_ENTRY, SELECT_ELEMENT, TEXT_ENTRY.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public StepMonitorStepGetArgs()
        {
        }
        public static new StepMonitorStepGetArgs Empty => new StepMonitorStepGetArgs();
    }
}