// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    public static class GetSecureCredential
    {
        /// <summary>
        /// Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.
        /// 
        /// Note that the secure credential's value is not returned as an attribute for security reasons.
        /// </summary>
        public static Task<GetSecureCredentialResult> InvokeAsync(GetSecureCredentialArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecureCredentialResult>("newrelic:synthetics/getSecureCredential:getSecureCredential", args ?? new GetSecureCredentialArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.
        /// 
        /// Note that the secure credential's value is not returned as an attribute for security reasons.
        /// </summary>
        public static Output<GetSecureCredentialResult> Invoke(GetSecureCredentialInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecureCredentialResult>("newrelic:synthetics/getSecureCredential:getSecureCredential", args ?? new GetSecureCredentialInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecureCredentialArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public int? AccountId { get; set; }

        /// <summary>
        /// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        public GetSecureCredentialArgs()
        {
        }
        public static new GetSecureCredentialArgs Empty => new GetSecureCredentialArgs();
    }

    public sealed class GetSecureCredentialInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public GetSecureCredentialInvokeArgs()
        {
        }
        public static new GetSecureCredentialInvokeArgs Empty => new GetSecureCredentialInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecureCredentialResult
    {
        public readonly int AccountId;
        /// <summary>
        /// The secure credential's description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Key;
        /// <summary>
        /// The time the secure credential was last updated.
        /// </summary>
        public readonly string LastUpdated;

        [OutputConstructor]
        private GetSecureCredentialResult(
            int accountId,

            string description,

            string id,

            string key,

            string lastUpdated)
        {
            AccountId = accountId;
            Description = description;
            Id = id;
            Key = key;
            LastUpdated = lastUpdated;
        }
    }
}
