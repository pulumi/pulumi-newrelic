// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create and manage New Relic sub accounts.
    /// 
    /// &gt; **WARNING:** The `newrelic.AccountManagement` resource will only create/update but won't delete a sub account. Please visit our documentation on  [`Account Management`](https://docs.newrelic.com/docs/apis/nerdgraph/examples/manage-accounts-nerdgraph/#delete) for more information .
    /// 
    /// ## Example Usage
    /// 
    /// ##### Create Account
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AccountManagement("foo", new()
    ///     {
    ///         Name = "Test Account Name",
    ///         Region = "us01",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Accounts can be imported using the `id`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/accountManagement:AccountManagement foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/accountManagement:AccountManagement")]
    public partial class AccountManagement : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The region code of the account.  One of: `us01`, `eu01`.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a AccountManagement resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountManagement(string name, AccountManagementArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/accountManagement:AccountManagement", name, args ?? new AccountManagementArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountManagement(string name, Input<string> id, AccountManagementState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/accountManagement:AccountManagement", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccountManagement resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountManagement Get(string name, Input<string> id, AccountManagementState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountManagement(name, id, state, options);
        }
    }

    public sealed class AccountManagementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region code of the account.  One of: `us01`, `eu01`.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public AccountManagementArgs()
        {
        }
        public static new AccountManagementArgs Empty => new AccountManagementArgs();
    }

    public sealed class AccountManagementState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region code of the account.  One of: `us01`, `eu01`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public AccountManagementState()
        {
        }
        public static new AccountManagementState Empty => new AccountManagementState();
    }
}
