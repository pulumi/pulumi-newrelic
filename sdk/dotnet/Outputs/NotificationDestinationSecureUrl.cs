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
    public sealed class NotificationDestinationSecureUrl
    {
        public readonly string Prefix;
        public readonly string SecureSuffix;

        [OutputConstructor]
        private NotificationDestinationSecureUrl(
            string prefix,

            string secureSuffix)
        {
            Prefix = prefix;
            SecureSuffix = secureSuffix;
        }
    }
}
