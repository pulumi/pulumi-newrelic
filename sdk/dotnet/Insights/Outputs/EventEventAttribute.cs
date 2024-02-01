// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Insights.Outputs
{

    [OutputType]
    public sealed class EventEventAttribute
    {
        /// <summary>
        /// The name of the attribute.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are string, int, or float. Defaults to string.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The value of the attribute.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private EventEventAttribute(
            string key,

            string? type,

            string value)
        {
            Key = key;
            Type = type;
            Value = value;
        }
    }
}
