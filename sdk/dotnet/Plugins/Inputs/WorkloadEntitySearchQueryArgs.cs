// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Inputs
{

    public sealed class WorkloadEntitySearchQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid entity search query; empty, and null values are considered invalid.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public WorkloadEntitySearchQueryArgs()
        {
        }
        public static new WorkloadEntitySearchQueryArgs Empty => new WorkloadEntitySearchQueryArgs();
    }
}
