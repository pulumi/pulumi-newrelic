// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class NotificationDestinationAuthBasicGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// Specifies an authentication password for use with a destination.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username of the basic auth.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public NotificationDestinationAuthBasicGetArgs()
        {
        }
        public static new NotificationDestinationAuthBasicGetArgs Empty => new NotificationDestinationAuthBasicGetArgs();
    }
}
