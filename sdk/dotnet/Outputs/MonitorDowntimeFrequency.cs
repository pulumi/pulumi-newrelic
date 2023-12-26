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
    public sealed class MonitorDowntimeFrequency
    {
        /// <summary>
        /// A list of integers, specifying the days of a month on which the monthly monitor downtime would function, e.g. [3, 6, 14, 23].
        /// </summary>
        public readonly ImmutableArray<int> DaysOfMonths;
        /// <summary>
        /// An argument that specifies a day of a week and its occurrence in a month, on which the monthly monitor downtime would function. This argument, further, comprises the following nested arguments -
        /// </summary>
        public readonly Outputs.MonitorDowntimeFrequencyDaysOfWeek? DaysOfWeek;

        [OutputConstructor]
        private MonitorDowntimeFrequency(
            ImmutableArray<int> daysOfMonths,

            Outputs.MonitorDowntimeFrequencyDaysOfWeek? daysOfWeek)
        {
            DaysOfMonths = daysOfMonths;
            DaysOfWeek = daysOfWeek;
        }
    }
}
