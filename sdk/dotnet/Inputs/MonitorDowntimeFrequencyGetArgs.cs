// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class MonitorDowntimeFrequencyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("daysOfMonths")]
        private InputList<int>? _daysOfMonths;

        /// <summary>
        /// A list of integers, specifying the days of a month on which the monthly monitor downtime would function, e.g. [3, 6, 14, 23].
        /// </summary>
        public InputList<int> DaysOfMonths
        {
            get => _daysOfMonths ?? (_daysOfMonths = new InputList<int>());
            set => _daysOfMonths = value;
        }

        /// <summary>
        /// An argument that specifies a day of a week and its occurrence in a month, on which the monthly monitor downtime would function. This argument, further, comprises the following nested arguments -
        /// </summary>
        [Input("daysOfWeek")]
        public Input<Inputs.MonitorDowntimeFrequencyDaysOfWeekGetArgs>? DaysOfWeek { get; set; }

        public MonitorDowntimeFrequencyGetArgs()
        {
        }
        public static new MonitorDowntimeFrequencyGetArgs Empty => new MonitorDowntimeFrequencyGetArgs();
    }
}
