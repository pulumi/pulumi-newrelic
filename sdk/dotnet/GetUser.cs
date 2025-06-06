// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetUser
    {
        /// <summary>
        /// The `newrelic.User` data source helps search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching a the ID of a user (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
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
        ///     var userOne = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test User",
        ///     });
        /// 
        ///     var userTwo = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         EmailId = "test_user@random.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("newrelic:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// The `newrelic.User` data source helps search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching a the ID of a user (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
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
        ///     var userOne = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test User",
        ///     });
        /// 
        ///     var userTwo = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         EmailId = "test_user@random.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("newrelic:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// The `newrelic.User` data source helps search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.
        /// 
        /// ## Example Usage
        /// 
        /// The below example illustrates fetching a the ID of a user (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
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
        ///     var userOne = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         Name = "Test User",
        ///     });
        /// 
        ///     var userTwo = NewRelic.GetUser.Invoke(new()
        ///     {
        ///         AuthenticationDomainId = foo.Apply(getAuthenticationDomainResult =&gt; getAuthenticationDomainResult.Id),
        ///         EmailId = "test_user@random.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("newrelic:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the authentication domain the user to be searched for belongs to.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public string AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The email ID of the user to search for.
        /// 
        /// It should be noted that either `name` or `email_id` must be specified in order to retrieve a matching user.
        /// 
        /// &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `email_id` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// </summary>
        [Input("emailId")]
        public string? EmailId { get; set; }

        /// <summary>
        /// The name of the user to search for.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the authentication domain the user to be searched for belongs to.
        /// </summary>
        [Input("authenticationDomainId", required: true)]
        public Input<string> AuthenticationDomainId { get; set; } = null!;

        /// <summary>
        /// The email ID of the user to search for.
        /// 
        /// It should be noted that either `name` or `email_id` must be specified in order to retrieve a matching user.
        /// 
        /// &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `email_id` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
        /// 
        /// &gt; **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `newrelic.getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
        /// </summary>
        [Input("emailId")]
        public Input<string>? EmailId { get; set; }

        /// <summary>
        /// The name of the user to search for.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        public readonly string AuthenticationDomainId;
        public readonly string EmailId;
        /// <summary>
        /// The ID of the matching user fetched.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetUserResult(
            string authenticationDomainId,

            string emailId,

            string id,

            string name)
        {
            AuthenticationDomainId = authenticationDomainId;
            EmailId = emailId;
            Id = id;
            Name = name;
        }
    }
}
