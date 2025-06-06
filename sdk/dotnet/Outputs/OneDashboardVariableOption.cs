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
    public sealed class OneDashboardVariableOption
    {
        /// <summary>
        /// (Optional) An argument with a boolean value. With this turned on, the query condition defined with the variable will not be included in the query. Defaults to `false`.
        /// </summary>
        public readonly bool? Excluded;
        /// <summary>
        /// (Optional) An argument with a boolean value that is supported only by variables of `type` _nrql_ - when true, the time range specified in the query will override the time picker on dashboards and other pages.
        /// </summary>
        public readonly bool? IgnoreTimeRange;

        [OutputConstructor]
        private OneDashboardVariableOption(
            bool? excluded,

            bool? ignoreTimeRange)
        {
            Excluded = excluded;
            IgnoreTimeRange = ignoreTimeRange;
        }
    }
}
