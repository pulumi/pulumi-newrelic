// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Inputs
{

    public sealed class BrokenLinksMonitorTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the tag key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// Values associated with the tag key.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public BrokenLinksMonitorTagArgs()
        {
        }
        public static new BrokenLinksMonitorTagArgs Empty => new BrokenLinksMonitorTagArgs();
    }
}
