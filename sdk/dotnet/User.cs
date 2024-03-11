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
    /// The `newrelic.User` resource may be used to create, update and delete users in New Relic.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooAuthenticationDomain = NewRelic.GetAuthenticationDomain.Invoke(new()
    ///     {
    ///         Name = "Test Authentication Domain",
    ///     });
    /// 
    ///     var fooUser = new NewRelic.User("fooUser", new()
    ///     {
    ///         EmailId = "test_user@test.com",
    ///         AuthenticationDomainId = fooAuthenticationDomain.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserType = "CORE_USER_TIER",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// A user can be imported using its ID. Example:
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/user:User foo 1999999999
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the authentication domain to which the user to be created would belong.
        /// </summary>
        [Output("authenticationDomainId")]
        public Output<string> AuthenticationDomainId { get; private set; } = null!;

        /// <summary>
        /// The email ID of the user to be created.
        /// </summary>
        [Output("emailId")]
        public Output<string> EmailId { get; private set; } = null!;

        /// <summary>
        /// The name of the user to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        /// </summary>
        [Output("userType")]
        public Output<string?> UserType { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the authentication domain to which the user to be created would belong.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public Input<string> AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The email ID of the user to be created.
        /// </summary>
        [Input("emailId", required: true)]
        public Input<string> EmailId { get; set; } = null!;

        /// <summary>
        /// The name of the user to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the authentication domain to which the user to be created would belong.
        /// </summary>
        [Input("authenticationDomainId")]
        public Input<string>? AuthenticationDomainId { get; set; }

        /// <summary>
        /// The email ID of the user to be created.
        /// </summary>
        [Input("emailId")]
        public Input<string>? EmailId { get; set; }

        /// <summary>
        /// The name of the user to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
