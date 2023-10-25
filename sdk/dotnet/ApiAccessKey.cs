// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to programmatically create and manage the following types of keys:
    /// - [User API keys](https://docs.newrelic.com/docs/apis/get-started/intro-apis/types-new-relic-api-keys#user-api-key)
    /// - License (or ingest) keys, including:
    ///     - General [license key](https://docs.newrelic.com/docs/accounts/install-new-relic/account-setup/license-key) used for APM
    ///     - [Browser license key](https://docs.newrelic.com/docs/browser/new-relic-browser/configuration/copy-browser-monitoring-license-key-app-id)
    /// 
    /// Please visit the New Relic article ['Use NerdGraph to manage license keys and User API keys'](https://docs.newrelic.com/docs/apis/nerdgraph/examples/use-nerdgraph-manage-license-keys-user-keys)
    /// for more information.
    /// 
    /// &gt; **IMPORTANT!**
    /// Please be very careful when updating existing `newrelic.ApiAccessKey` resources as only `newrelic_api_access_key.name`
    /// and `newrelic_api_access_key.notes` are updatable. All other resource attributes will force a resource recreation which will
    /// invalidate the previous API key(s).
    /// 
    /// ## Import
    /// 
    /// Existing API access keys can be imported using a composite ID of `&lt;api_access_key_id&gt;:&lt;key_type&gt;`. `&lt;key_type&gt;` will be either `INGEST` or `USER`.
    /// 
    /// For example:
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/apiAccessKey:ApiAccessKey foobar "1234567:INGEST"
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/apiAccessKey:ApiAccessKey")]
    public partial class ApiAccessKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the API access key.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        /// </summary>
        [Output("ingestType")]
        public Output<string> IngestType { get; private set; } = null!;

        /// <summary>
        /// The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        /// </summary>
        [Output("keyType")]
        public Output<string> KeyType { get; private set; } = null!;

        /// <summary>
        /// The name of the key.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Any notes about this ingest key.
        /// </summary>
        [Output("notes")]
        public Output<string> Notes { get; private set; } = null!;

        /// <summary>
        /// Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        /// </summary>
        [Output("userId")]
        public Output<int> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a ApiAccessKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiAccessKey(string name, ApiAccessKeyArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/apiAccessKey:ApiAccessKey", name, args ?? new ApiAccessKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiAccessKey(string name, Input<string> id, ApiAccessKeyState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/apiAccessKey:ApiAccessKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "key",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApiAccessKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiAccessKey Get(string name, Input<string> id, ApiAccessKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiAccessKey(name, id, state, options);
        }
    }

    public sealed class ApiAccessKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the API access key.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<int> AccountId { get; set; } = null!;

        /// <summary>
        /// Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        /// </summary>
        [Input("ingestType")]
        public Input<string>? IngestType { get; set; }

        /// <summary>
        /// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        /// </summary>
        [Input("keyType", required: true)]
        public Input<string> KeyType { get; set; } = null!;

        /// <summary>
        /// The name of the key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about this ingest key.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        /// </summary>
        [Input("userId")]
        public Input<int>? UserId { get; set; }

        public ApiAccessKeyArgs()
        {
        }
        public static new ApiAccessKeyArgs Empty => new ApiAccessKeyArgs();
    }

    public sealed class ApiAccessKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the API access key.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Required if `key_type = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
        /// </summary>
        [Input("ingestType")]
        public Input<string>? IngestType { get; set; }

        [Input("key")]
        private Input<string>? _key;

        /// <summary>
        /// The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// The name of the key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about this ingest key.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// Required if `key_type = USER`. The New Relic user ID yous wish to create the API access key for in an account.
        /// </summary>
        [Input("userId")]
        public Input<int>? UserId { get; set; }

        public ApiAccessKeyState()
        {
        }
        public static new ApiAccessKeyState Empty => new ApiAccessKeyState();
    }
}
