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
    public sealed class ServiceLevelEvents
    {
        /// <summary>
        /// The ID of the account where the entity (e.g, APM Service, Browser application, Workload, etc.) belongs to,
        /// and that contains the NRDB data for the SLI/SLO calculations. Note that changing the account ID will force a new resource.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The definition of the bad responses. If you define an SLI from valid and bad events, you must leave the good events argument empty.
        /// </summary>
        public readonly Outputs.ServiceLevelEventsBadEvents? BadEvents;
        /// <summary>
        /// The definition of good responses. If you define an SLI from valid and good events, you must leave the bad events argument empty.
        /// </summary>
        public readonly Outputs.ServiceLevelEventsGoodEvents? GoodEvents;
        /// <summary>
        /// The definition of valid requests.
        /// </summary>
        public readonly Outputs.ServiceLevelEventsValidEvents ValidEvents;

        [OutputConstructor]
        private ServiceLevelEvents(
            string accountId,

            Outputs.ServiceLevelEventsBadEvents? badEvents,

            Outputs.ServiceLevelEventsGoodEvents? goodEvents,

            Outputs.ServiceLevelEventsValidEvents validEvents)
        {
            AccountId = accountId;
            BadEvents = badEvents;
            GoodEvents = goodEvents;
            ValidEvents = validEvents;
        }
    }
}
