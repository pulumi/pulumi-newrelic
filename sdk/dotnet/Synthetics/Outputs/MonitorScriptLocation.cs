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
    public sealed class MonitorScriptLocation
    {
        /// <summary>
        /// The monitor script authentication code for the location.
        /// </summary>
        public readonly string? Hmac;
        /// <summary>
        /// The monitor script location name.
        /// </summary>
        public readonly string Name;
        public readonly string? VsePassword;

        [OutputConstructor]
        private MonitorScriptLocation(
            string? hmac,

            string name,

            string? vsePassword)
        {
            Hmac = hmac;
            Name = name;
            VsePassword = vsePassword;
        }
    }
}
