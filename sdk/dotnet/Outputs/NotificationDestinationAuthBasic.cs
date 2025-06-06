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
    public sealed class NotificationDestinationAuthBasic
    {
        /// <summary>
        /// Specifies an authentication password for use with a destination.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The username of the basic auth.
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private NotificationDestinationAuthBasic(
            string password,

            string user)
        {
            Password = password;
            User = user;
        }
    }
}
