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
    public sealed class OneDashboardVariableItem
    {
        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        public readonly string? Title;
        /// <summary>
        /// (Required) A possible variable value
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private OneDashboardVariableItem(
            string? title,

            string value)
        {
            Title = title;
            Value = value;
        }
    }
}