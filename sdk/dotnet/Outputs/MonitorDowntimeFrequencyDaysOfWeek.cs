// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class MonitorDowntimeFrequencyDaysOfWeek
    {
        /// <summary>
        /// An occurrence of the day selected within the month.
        /// </summary>
        public readonly string OrdinalDayOfMonth;
        /// <summary>
        /// The day of the week on which the Monitor Downtime would run.
        /// </summary>
        public readonly string WeekDay;

        [OutputConstructor]
        private MonitorDowntimeFrequencyDaysOfWeek(
            string ordinalDayOfMonth,

            string weekDay)
        {
            OrdinalDayOfMonth = ordinalDayOfMonth;
            WeekDay = weekDay;
        }
    }
}
