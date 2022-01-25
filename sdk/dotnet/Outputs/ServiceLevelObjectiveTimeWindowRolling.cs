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
    public sealed class ServiceLevelObjectiveTimeWindowRolling
    {
        /// <summary>
        /// Valid values are `1`, `7`, `14`, `28` and `30`.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The only supported value is `DAY`.
        /// </summary>
        public readonly string Unit;

        [OutputConstructor]
        private ServiceLevelObjectiveTimeWindowRolling(
            int count,

            string unit)
        {
            Count = count;
            Unit = unit;
        }
    }
}