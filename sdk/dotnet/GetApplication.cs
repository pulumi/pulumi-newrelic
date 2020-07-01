// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetApplication
    {
        /// <summary>
        /// #### DEPRECATED! Use at your own risk. Use the `newrelic.getEntity` data source instead. This feature may be removed in the next major release.
        /// 
        /// Use this data source to get information about a specific application in New Relic that already exists. 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var app = Output.Create(NewRelic.GetApplication.InvokeAsync(new NewRelic.GetApplicationArgs
        ///         {
        ///             Name = "my-app",
        ///         }));
        ///         var fooAlertPolicy = new NewRelic.AlertPolicy("fooAlertPolicy", new NewRelic.AlertPolicyArgs
        ///         {
        ///         });
        ///         var fooAlertCondition = new NewRelic.AlertCondition("fooAlertCondition", new NewRelic.AlertConditionArgs
        ///         {
        ///             PolicyId = fooAlertPolicy.Id,
        ///             Type = "apm_app_metric",
        ///             Entities = 
        ///             {
        ///                 app.Apply(app =&gt; app.Id),
        ///             },
        ///             Metric = "apdex",
        ///             RunbookUrl = "https://www.example.com",
        ///             Terms = 
        ///             {
        ///                 new NewRelic.Inputs.AlertConditionTermArgs
        ///                 {
        ///                     Duration = 5,
        ///                     Operator = "below",
        ///                     Priority = "critical",
        ///                     Threshold = 0.75,
        ///                     TimeFunction = "all",
        ///                 },
        ///             },
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetApplicationResult> InvokeAsync(GetApplicationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetApplicationResult>("newrelic:index/getApplication:getApplication", args ?? new GetApplicationArgs(), options.WithVersion());
    }


    public sealed class GetApplicationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the application in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetApplicationArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetApplicationResult
    {
        /// <summary>
        /// A list of host IDs associated with the application.
        /// </summary>
        public readonly ImmutableArray<int> HostIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of instance IDs associated with the application.
        /// </summary>
        public readonly ImmutableArray<int> InstanceIds;
        public readonly string Name;

        [OutputConstructor]
        private GetApplicationResult(
            ImmutableArray<int> hostIds,

            string id,

            ImmutableArray<int> instanceIds,

            string name)
        {
            HostIds = hostIds;
            Id = id;
            InstanceIds = instanceIds;
            Name = name;
        }
    }
}
