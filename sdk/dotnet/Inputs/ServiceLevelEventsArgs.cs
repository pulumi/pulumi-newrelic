// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelEventsArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("badEvents")]
        public Input<Inputs.ServiceLevelEventsBadEventsArgs>? BadEvents { get; set; }

        [Input("goodEvents")]
        public Input<Inputs.ServiceLevelEventsGoodEventsArgs>? GoodEvents { get; set; }

        [Input("validEvents", required: true)]
        public Input<Inputs.ServiceLevelEventsValidEventsArgs> ValidEvents { get; set; } = null!;

        public ServiceLevelEventsArgs()
        {
        }
        public static new ServiceLevelEventsArgs Empty => new ServiceLevelEventsArgs();
    }
}
