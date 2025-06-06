// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelObjectiveTimeWindowRollingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Valid values are `1`, `7` and `28`.
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// The only supported value is `DAY`.
        /// </summary>
        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public ServiceLevelObjectiveTimeWindowRollingArgs()
        {
        }
        public static new ServiceLevelObjectiveTimeWindowRollingArgs Empty => new ServiceLevelObjectiveTimeWindowRollingArgs();
    }
}
