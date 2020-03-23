// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static partial class Invokes
    {
        public static Task<GetKeyTransactionResult> GetKeyTransaction(GetKeyTransactionArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKeyTransactionResult>("newrelic:index/getKeyTransaction:getKeyTransaction", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetKeyTransactionArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the key transaction in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetKeyTransactionArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetKeyTransactionResult
    {
        public readonly string Name;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetKeyTransactionResult(
            string name,
            string id)
        {
            Name = name;
            Id = id;
        }
    }
}
