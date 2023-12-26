// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class MonitorDowntimeFrequencyDaysOfWeekGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The occurrence of `week_day` in a month (one of `"FIRST"`, `"SECOND"`, `"THIRD"`, `"FOURTH"`, `"LAST"`).
        /// 
        /// &gt; **NOTE:** `frequency` **can only be used with the mode** `MONTHLY`, and **is a required argument** with monthly monitor downtimes (if the `mode` is `MONTHLY`). Additionally, **either** `days_of_month` or `days_of_week` **are required to be specified with** `frequency`, but not both, as `days_of_month` and `days_of_week` are mutually exclusive. If `days_of_week` is specified, values of **both** of its nested arguments, `week_day` and `ordinal_day_of_month` **would need to be specified** too.
        /// </summary>
        [Input("ordinalDayOfMonth", required: true)]
        public Input<string> OrdinalDayOfMonth { get; set; } = null!;

        /// <summary>
        /// A day of the week (one of `"SUNDAY"`, `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"` or `"SATURDAY"`).
        /// </summary>
        [Input("weekDay", required: true)]
        public Input<string> WeekDay { get; set; } = null!;

        public MonitorDowntimeFrequencyDaysOfWeekGetArgs()
        {
        }
        public static new MonitorDowntimeFrequencyDaysOfWeekGetArgs Empty => new MonitorDowntimeFrequencyDaysOfWeekGetArgs();
    }
}
