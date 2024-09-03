// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardVariableOptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) An argument with a boolean value that is supported only by variables of `type` *nrql* - when true, the time range specified in the query will override the time picker on dashboards and other pages.
        /// </summary>
        [Input("ignoreTimeRange")]
        public Input<bool>? IgnoreTimeRange { get; set; }

        public OneDashboardVariableOptionArgs()
        {
        }
        public static new OneDashboardVariableOptionArgs Empty => new OneDashboardVariableOptionArgs();
    }
}
