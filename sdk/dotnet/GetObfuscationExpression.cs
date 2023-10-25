// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetObfuscationExpression
    {
        /// <summary>
        /// Use this data source to get information about a specific Obfuscation Expression in New Relic that already exists.
        /// </summary>
        public static Task<GetObfuscationExpressionResult> InvokeAsync(GetObfuscationExpressionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetObfuscationExpressionResult>("newrelic:index/getObfuscationExpression:getObfuscationExpression", args ?? new GetObfuscationExpressionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific Obfuscation Expression in New Relic that already exists.
        /// </summary>
        public static Output<GetObfuscationExpressionResult> Invoke(GetObfuscationExpressionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetObfuscationExpressionResult>("newrelic:index/getObfuscationExpression:getObfuscationExpression", args ?? new GetObfuscationExpressionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetObfuscationExpressionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
        /// </summary>
        [Input("accountId")]
        public int? AccountId { get; set; }

        /// <summary>
        /// Name of expression.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetObfuscationExpressionArgs()
        {
        }
        public static new GetObfuscationExpressionArgs Empty => new GetObfuscationExpressionArgs();
    }

    public sealed class GetObfuscationExpressionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Name of expression.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetObfuscationExpressionInvokeArgs()
        {
        }
        public static new GetObfuscationExpressionInvokeArgs Empty => new GetObfuscationExpressionInvokeArgs();
    }


    [OutputType]
    public sealed class GetObfuscationExpressionResult
    {
        public readonly int? AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetObfuscationExpressionResult(
            int? accountId,

            string id,

            string name)
        {
            AccountId = accountId;
            Id = id;
            Name = name;
        }
    }
}
