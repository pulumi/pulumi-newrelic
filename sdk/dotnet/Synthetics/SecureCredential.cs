// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    /// <summary>
    /// Use this resource to create and manage New Relic Synthetic secure credentials.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.Synthetics.SecureCredential("foo", new()
    ///     {
    ///         Key = "MY_KEY",
    ///         Value = "My value",
    ///         Description = "My description",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A Synthetics secure credential can be imported using its `key`:
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/secureCredential:SecureCredential")]
    public partial class SecureCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The secure credential's description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// The time the secure credential was last updated.
        /// </summary>
        [Output("lastUpdated")]
        public Output<string> LastUpdated { get; private set; } = null!;

        /// <summary>
        /// The secure credential's value.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a SecureCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecureCredential(string name, SecureCredentialArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/secureCredential:SecureCredential", name, args ?? new SecureCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecureCredential(string name, Input<string> id, SecureCredentialState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/secureCredential:SecureCredential", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecureCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecureCredential Get(string name, Input<string> id, SecureCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new SecureCredential(name, id, state, options);
        }
    }

    public sealed class SecureCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The secure credential's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The time the secure credential was last updated.
        /// </summary>
        [Input("lastUpdated")]
        public Input<string>? LastUpdated { get; set; }

        [Input("value", required: true)]
        private Input<string>? _value;

        /// <summary>
        /// The secure credential's value.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecureCredentialArgs()
        {
        }
        public static new SecureCredentialArgs Empty => new SecureCredentialArgs();
    }

    public sealed class SecureCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The secure credential's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The time the secure credential was last updated.
        /// </summary>
        [Input("lastUpdated")]
        public Input<string>? LastUpdated { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// The secure credential's value.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecureCredentialState()
        {
        }
        public static new SecureCredentialState Empty => new SecureCredentialState();
    }
}
