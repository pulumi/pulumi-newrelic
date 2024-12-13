// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetGroup
    {
        /// <summary>
        /// The `newrelic.Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.
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
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Additional Examples
        /// 
        /// The following example demonstrates utilizing attributes exported by this data source.
        /// 
        /// In order to directly reference the attributes `id` and `user_ids` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `user_ids` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
        ///     {
        ///         Name = "Test Authentication Domain",
        ///     });
        /// 
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        ///     var id = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.Id);
        /// 
        ///     var userIds = Output.Tuple(fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds).Length, Std.Join.Invoke(new()
        ///     {
        ///         Separator = ", ",
        ///         Input = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds),
        ///     })).Apply(values =&gt;
        ///     {
        ///         var length = values.Item1;
        ///         var invoke = values.Item2;
        ///         return length &gt; 0 ? invoke.Result : "";
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGroupResult> InvokeAsync(GetGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupResult>("newrelic:index/getGroup:getGroup", args ?? new GetGroupArgs(), options.WithDefaults());

        /// <summary>
        /// The `newrelic.Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.
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
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Additional Examples
        /// 
        /// The following example demonstrates utilizing attributes exported by this data source.
        /// 
        /// In order to directly reference the attributes `id` and `user_ids` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `user_ids` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
        ///     {
        ///         Name = "Test Authentication Domain",
        ///     });
        /// 
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        ///     var id = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.Id);
        /// 
        ///     var userIds = Output.Tuple(fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds).Length, Std.Join.Invoke(new()
        ///     {
        ///         Separator = ", ",
        ///         Input = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds),
        ///     })).Apply(values =&gt;
        ///     {
        ///         var length = values.Item1;
        ///         var invoke = values.Item2;
        ///         return length &gt; 0 ? invoke.Result : "";
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGroupResult> Invoke(GetGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupResult>("newrelic:index/getGroup:getGroup", args ?? new GetGroupInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// The `newrelic.Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.
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
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Additional Examples
        /// 
        /// The following example demonstrates utilizing attributes exported by this data source.
        /// 
        /// In order to directly reference the attributes `id` and `user_ids` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `user_ids` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = NewRelic.GetAuthenticationDomain.Invoke(new()
        ///     {
        ///         Name = "Test Authentication Domain",
        ///     });
        /// 
        ///     var fooGetGroup = NewRelic.GetGroup.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test Group",
        ///     });
        /// 
        ///     var id = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.Id);
        /// 
        ///     var userIds = Output.Tuple(fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds).Length, Std.Join.Invoke(new()
        ///     {
        ///         Separator = ", ",
        ///         Input = fooGetGroup.Apply(getGroupResult =&gt; getGroupResult.UserIds),
        ///     })).Apply(values =&gt;
        ///     {
        ///         var length = values.Item1;
        ///         var invoke = values.Item2;
        ///         return length &gt; 0 ? invoke.Result : "";
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGroupResult> Invoke(GetGroupInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupResult>("newrelic:index/getGroup:getGroup", args ?? new GetGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the authentication domain the group to be searched for belongs to.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public string AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The name of the group to search for.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetGroupArgs()
        {
        }
        public static new GetGroupArgs Empty => new GetGroupArgs();
    }

    public sealed class GetGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the authentication domain the group to be searched for belongs to.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public Input<string> AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The name of the group to search for.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGroupInvokeArgs()
        {
        }
        public static new GetGroupInvokeArgs Empty => new GetGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupResult
    {
        public readonly string AuthenticationDomainId;
        /// <summary>
        /// The ID of the fetched matching group.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// IDs of users who belong to the group. In the absence of any users in the group, the value of this attribute would be an empty list.
        /// </summary>
        public readonly ImmutableArray<string> UserIds;

        [OutputConstructor]
        private GetGroupResult(
            string authenticationDomainId,

            string id,

            string name,

            ImmutableArray<string> userIds)
        {
            AuthenticationDomainId = authenticationDomainId;
            Id = id;
            Name = name;
            UserIds = userIds;
        }
    }
}
