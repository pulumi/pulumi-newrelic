// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelEventsValidEventsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The event type where NRDB data will be fetched from.
        /// </summary>
        [Input("from", required: true)]
        public Input<string> From { get; set; } = null!;

        /// <summary>
        /// A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
        /// a particular entity and were successful).
        /// a particular entity and returned an error).
        /// </summary>
        [Input("where")]
        public Input<string>? Where { get; set; }

        public ServiceLevelEventsValidEventsGetArgs()
        {
        }
        public static new ServiceLevelEventsValidEventsGetArgs Empty => new ServiceLevelEventsValidEventsGetArgs();
    }
}
