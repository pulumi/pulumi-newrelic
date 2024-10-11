// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetKeyTransaction
    {
        /// <summary>
        /// Use this data source to get information about a specific key transaction in New Relic that already exists.
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
        ///     var txn = NewRelic.GetKeyTransaction.Invoke(new()
        ///     {
        ///         Name = "txn",
        ///     });
        /// 
        ///     var foo = new NewRelic.AlertPolicy("foo", new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        ///     var fooAlertCondition = new NewRelic.AlertCondition("foo", new()
        ///     {
        ///         PolicyId = foo.Id,
        ///         Name = "foo",
        ///         Type = "apm_kt_metric",
        ///         Entities = new[]
        ///         {
        ///             txn.Apply(getKeyTransactionResult =&gt; getKeyTransactionResult.Id),
        ///         },
        ///         Metric = "error_percentage",
        ///         RunbookUrl = "https://www.example.com",
        ///         Terms = new[]
        ///         {
        ///             new NewRelic.Inputs.AlertConditionTermArgs
        ///             {
        ///                 Duration = 5,
        ///                 Operator = "below",
        ///                 Priority = "critical",
        ///                 Threshold = 0.75,
        ///                 TimeFunction = "all",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetKeyTransactionResult> InvokeAsync(GetKeyTransactionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKeyTransactionResult>("newrelic:index/getKeyTransaction:getKeyTransaction", args ?? new GetKeyTransactionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific key transaction in New Relic that already exists.
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
        ///     var txn = NewRelic.GetKeyTransaction.Invoke(new()
        ///     {
        ///         Name = "txn",
        ///     });
        /// 
        ///     var foo = new NewRelic.AlertPolicy("foo", new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        ///     var fooAlertCondition = new NewRelic.AlertCondition("foo", new()
        ///     {
        ///         PolicyId = foo.Id,
        ///         Name = "foo",
        ///         Type = "apm_kt_metric",
        ///         Entities = new[]
        ///         {
        ///             txn.Apply(getKeyTransactionResult =&gt; getKeyTransactionResult.Id),
        ///         },
        ///         Metric = "error_percentage",
        ///         RunbookUrl = "https://www.example.com",
        ///         Terms = new[]
        ///         {
        ///             new NewRelic.Inputs.AlertConditionTermArgs
        ///             {
        ///                 Duration = 5,
        ///                 Operator = "below",
        ///                 Priority = "critical",
        ///                 Threshold = 0.75,
        ///                 TimeFunction = "all",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKeyTransactionResult> Invoke(GetKeyTransactionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeyTransactionResult>("newrelic:index/getKeyTransaction:getKeyTransaction", args ?? new GetKeyTransactionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKeyTransactionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// GUID of the key transaction in New Relic.
        /// 
        /// &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
        /// </summary>
        [Input("guid")]
        public string? Guid { get; set; }

        /// <summary>
        /// The name of the key transaction in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetKeyTransactionArgs()
        {
        }
        public static new GetKeyTransactionArgs Empty => new GetKeyTransactionArgs();
    }

    public sealed class GetKeyTransactionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// GUID of the key transaction in New Relic.
        /// 
        /// &gt; **NOTE** If the `name` specified in the configuration matches the names of multiple key transactions in the account, the data source will return the first match from the list of all matching key transactions retrieved from the API. However, when using the `guid` argument as the search criterion, only the key transaction with that particular GUID is returned, as each key transaction has a unique GUID.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The name of the key transaction in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetKeyTransactionInvokeArgs()
        {
        }
        public static new GetKeyTransactionInvokeArgs Empty => new GetKeyTransactionInvokeArgs();
    }


    [OutputType]
    public sealed class GetKeyTransactionResult
    {
        /// <summary>
        /// Domain of the key transaction in New Relic.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// GUID of the key transaction in New Relic.
        /// </summary>
        public readonly string Guid;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the key Transation in New Relic.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Type of the key transaction in New Relic.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetKeyTransactionResult(
            string domain,

            string guid,

            string id,

            string name,

            string type)
        {
            Domain = domain;
            Guid = guid;
            Id = id;
            Name = name;
            Type = type;
        }
    }
}
