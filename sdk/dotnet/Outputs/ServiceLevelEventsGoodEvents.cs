// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class ServiceLevelEventsGoodEvents
    {
        public readonly string From;
        public readonly Outputs.ServiceLevelEventsGoodEventsSelect? Select;
        public readonly string? Where;

        [OutputConstructor]
        private ServiceLevelEventsGoodEvents(
            string from,

            Outputs.ServiceLevelEventsGoodEventsSelect? select,

            string? where)
        {
            From = from;
            Select = select;
            Where = where;
        }
    }
}
