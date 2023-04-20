// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelEventsValidEventsSelectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The event attribute to use in the SELECT clause.
        /// </summary>
        [Input("attribute")]
        public Input<string>? Attribute { get; set; }

        /// <summary>
        /// The function to use in the SELECT clause. Valid values are `COUNT`and `SUM`.
        /// </summary>
        [Input("function", required: true)]
        public Input<string> Function { get; set; } = null!;

        public ServiceLevelEventsValidEventsSelectGetArgs()
        {
        }
        public static new ServiceLevelEventsValidEventsSelectGetArgs Empty => new ServiceLevelEventsValidEventsSelectGetArgs();
    }
}
