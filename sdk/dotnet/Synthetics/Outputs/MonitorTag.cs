// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Outputs
{

    [OutputType]
    public sealed class MonitorTag
    {
        /// <summary>
        /// Name of the tag key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Values associated with the tag key.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private MonitorTag(
            string key,

            ImmutableArray<string> values)
        {
            Key = key;
            Values = values;
        }
    }
}
