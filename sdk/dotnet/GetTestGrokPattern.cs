// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetTestGrokPattern
    {
        /// <summary>
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
        ///     // Data source
        ///     var foo = NewRelic.GetTestGrokPattern.Invoke(new()
        ///     {
        ///         Grok = "%{IP:host_ip}",
        ///         LogLines = new[]
        ///         {
        ///             "host_ip: 43.3.120.2",
        ///             "bytes_received: 2048",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTestGrokPatternResult> InvokeAsync(GetTestGrokPatternArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTestGrokPatternResult>("newrelic:index/getTestGrokPattern:getTestGrokPattern", args ?? new GetTestGrokPatternArgs(), options.WithDefaults());

        /// <summary>
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
        ///     // Data source
        ///     var foo = NewRelic.GetTestGrokPattern.Invoke(new()
        ///     {
        ///         Grok = "%{IP:host_ip}",
        ///         LogLines = new[]
        ///         {
        ///             "host_ip: 43.3.120.2",
        ///             "bytes_received: 2048",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTestGrokPatternResult> Invoke(GetTestGrokPatternInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTestGrokPatternResult>("newrelic:index/getTestGrokPattern:getTestGrokPattern", args ?? new GetTestGrokPatternInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTestGrokPatternArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// The Grok pattern to test.
        /// </summary>
        [Input("grok", required: true)]
        public string Grok { get; set; } = null!;

        [Input("logLines", required: true)]
        private List<string>? _logLines;

        /// <summary>
        /// The log lines to test the Grok pattern against.
        /// </summary>
        public List<string> LogLines
        {
            get => _logLines ?? (_logLines = new List<string>());
            set => _logLines = value;
        }

        public GetTestGrokPatternArgs()
        {
        }
        public static new GetTestGrokPatternArgs Empty => new GetTestGrokPatternArgs();
    }

    public sealed class GetTestGrokPatternInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The Grok pattern to test.
        /// </summary>
        [Input("grok", required: true)]
        public Input<string> Grok { get; set; } = null!;

        [Input("logLines", required: true)]
        private InputList<string>? _logLines;

        /// <summary>
        /// The log lines to test the Grok pattern against.
        /// </summary>
        public InputList<string> LogLines
        {
            get => _logLines ?? (_logLines = new InputList<string>());
            set => _logLines = value;
        }

        public GetTestGrokPatternInvokeArgs()
        {
        }
        public static new GetTestGrokPatternInvokeArgs Empty => new GetTestGrokPatternInvokeArgs();
    }


    [OutputType]
    public sealed class GetTestGrokPatternResult
    {
        public readonly string? AccountId;
        public readonly string Grok;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> LogLines;
        /// <summary>
        /// Nested attribute containing information about the test of Grok pattern against a list of log lines.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTestGrokPatternTestGrokResult> TestGroks;

        [OutputConstructor]
        private GetTestGrokPatternResult(
            string? accountId,

            string grok,

            string id,

            ImmutableArray<string> logLines,

            ImmutableArray<Outputs.GetTestGrokPatternTestGrokResult> testGroks)
        {
            AccountId = accountId;
            Grok = grok;
            Id = id;
            LogLines = logLines;
            TestGroks = testGroks;
        }
    }
}
