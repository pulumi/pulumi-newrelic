// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class ServiceLevelObjectiveTimeWindowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rolling window.
        /// </summary>
        [Input("rolling", required: true)]
        public Input<Inputs.ServiceLevelObjectiveTimeWindowRollingArgs> Rolling { get; set; } = null!;

        public ServiceLevelObjectiveTimeWindowArgs()
        {
        }
        public static new ServiceLevelObjectiveTimeWindowArgs Empty => new ServiceLevelObjectiveTimeWindowArgs();
    }
}
