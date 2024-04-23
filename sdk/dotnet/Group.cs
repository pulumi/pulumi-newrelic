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
    /// The `newrelic.Group` resource facilitates creating, updating, and deleting groups in New Relic, while also enabling the addition and removal of users from these groups.
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
    ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
    ///     {
    ///         Name = "Test Authentication Domain",
    ///     });
    /// 
    ///     var fooGroup = new NewRelic.Group("foo", new()
    ///     {
    ///         Name = "Test Group",
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserIds = new[]
    ///         {
    ///             "0001112222",
    ///             "2221110000",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Additional Examples
    /// 
    /// ### Addition of New Users to a New Group
    /// 
    /// The following example illustrates the creation of a group using the `newrelic.Group` resource, to which users created using the `newrelic.User` resource are added.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
    ///     {
    ///         Name = "Test Authentication Domain",
    ///     });
    /// 
    ///     var fooUser = new NewRelic.User("foo", new()
    ///     {
    ///         Name = "Test User One",
    ///         EmailId = "test_user_one@test.com",
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserType = "CORE_USER_TIER",
    ///     });
    /// 
    ///     var bar = new NewRelic.User("bar", new()
    ///     {
    ///         Name = "Test User Two",
    ///         EmailId = "test_user_two@test.com",
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserType = "BASIC_USER_TIER",
    ///     });
    /// 
    ///     var fooGroup = new NewRelic.Group("foo", new()
    ///     {
    ///         Name = "Test Group",
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserIds = new[]
    ///         {
    ///             fooUser.Id,
    ///             bar.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Addition of Existing Users to a New Group
    /// 
    /// The following example demonstrates the usage of the `newrelic.Group` resource to create a group, wherein the `newrelic.User` data source is employed to associate existing users with the newly formed group.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
    ///     {
    ///         Name = "Test Authentication Domain",
    ///     });
    /// 
    ///     var fooGetUser = NewRelic.GetUser.Invoke(new()
    ///     {
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         EmailId = "test_user_one@test.com",
    ///     });
    /// 
    ///     var bar = NewRelic.GetUser.Invoke(new()
    ///     {
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         Name = "Test User Two",
    ///     });
    /// 
    ///     var fooGroup = new NewRelic.Group("foo", new()
    ///     {
    ///         Name = "Test Group",
    ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
    ///         UserIds = new[]
    ///         {
    ///             fooGetUser.Apply(getUserResult =&gt; getUserResult.Id),
    ///             bar.Apply(getUserResult =&gt; getUserResult.Id),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **NOTE** Please note that the addition of users to groups is only possible when both the group and the users to be added to it belong to the _same authentication domain_. If the group being created and the users being added to it belong to different authentication domains, an error indicating `user not found` or an equivalent error will be thrown.
    /// 
    /// ## Import
    /// 
    /// A group can be imported using its ID. Example:
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/group:Group foo &lt;group_id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/group:Group")]
    public partial class Group : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the authentication domain to which the group to be created would belong.
        /// </summary>
        [Output("authenticationDomainId")]
        public Output<string> AuthenticationDomainId { get; private set; } = null!;

        /// <summary>
        /// The name of the group to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of IDs of users to be included in the group to be created.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing group is not supported.
        /// </summary>
        [Output("userIds")]
        public Output<ImmutableArray<string>> UserIds { get; private set; } = null!;


        /// <summary>
        /// Create a Group resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Group(string name, GroupArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/group:Group", name, args ?? new GroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Group(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/group:Group", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Group resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Group Get(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Group(name, id, state, options);
        }
    }

    public sealed class GroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the authentication domain to which the group to be created would belong.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public Input<string> AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The name of the group to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("userIds")]
        private InputList<string>? _userIds;

        /// <summary>
        /// A list of IDs of users to be included in the group to be created.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing group is not supported.
        /// </summary>
        public InputList<string> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<string>());
            set => _userIds = value;
        }

        public GroupArgs()
        {
        }
        public static new GroupArgs Empty => new GroupArgs();
    }

    public sealed class GroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the authentication domain to which the group to be created would belong.
        /// </summary>
        [Input("authenticationDomainId")]
        public Input<string>? AuthenticationDomainId { get; set; }

        /// <summary>
        /// The name of the group to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("userIds")]
        private InputList<string>? _userIds;

        /// <summary>
        /// A list of IDs of users to be included in the group to be created.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// 
        /// &gt; **WARNING:** Changing the `authentication_domain_id` of a `newrelic.Group` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing group is not supported.
        /// </summary>
        public InputList<string> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<string>());
            set => _userIds = value;
        }

        public GroupState()
        {
        }
        public static new GroupState Empty => new GroupState();
    }
}
