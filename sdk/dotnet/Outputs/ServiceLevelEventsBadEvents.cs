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
    public sealed class ServiceLevelEventsBadEvents
    {
        /// <summary>
        /// The event type where NRDB data will be fetched from.
        /// </summary>
        public readonly string From;
        /// <summary>
        /// The NRQL SELECT clause to aggregate events.
        /// </summary>
        public readonly Outputs.ServiceLevelEventsBadEventsSelect? Select;
        /// <summary>
        /// A filter that narrows down the NRDB events just to those that are considered bad responses (e.g, those that refer to
        /// a particular entity and returned an error).
        /// </summary>
        public readonly string? Where;

        [OutputConstructor]
        private ServiceLevelEventsBadEvents(
            string from,

            Outputs.ServiceLevelEventsBadEventsSelect? select,

            string? where)
        {
            From = from;
            Select = select;
            Where = where;
        }
    }
}
