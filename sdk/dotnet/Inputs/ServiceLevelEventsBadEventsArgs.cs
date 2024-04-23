// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelEventsBadEventsArgs : global::Pulumi.ResourceArgs
    {
        [Input("from", required: true)]
        public Input<string> From { get; set; } = null!;

        [Input("select")]
        public Input<Inputs.ServiceLevelEventsBadEventsSelectArgs>? Select { get; set; }

        [Input("where")]
        public Input<string>? Where { get; set; }

        public ServiceLevelEventsBadEventsArgs()
        {
        }
        public static new ServiceLevelEventsBadEventsArgs Empty => new ServiceLevelEventsBadEventsArgs();
    }
}
