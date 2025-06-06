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
    public sealed class ServiceLevelEventsGoodEventsSelect
    {
        /// <summary>
        /// The event attribute to use in the SELECT clause.
        /// </summary>
        public readonly string? Attribute;
        /// <summary>
        /// The function to use in the SELECT clause. Valid values are `COUNT`, `SUM`, `GET_FIELD`, and `GET_CDF_COUNT`.
        /// </summary>
        public readonly string Function;
        /// <summary>
        /// Limit for values to be counter by `GET_CDF_COUNT` function.
        /// </summary>
        public readonly double? Threshold;

        [OutputConstructor]
        private ServiceLevelEventsGoodEventsSelect(
            string? attribute,

            string function,

            double? threshold)
        {
            Attribute = attribute;
            Function = function;
            Threshold = threshold;
        }
    }
}
