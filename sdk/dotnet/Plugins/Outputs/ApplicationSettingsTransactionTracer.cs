// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Outputs
{

    [OutputType]
    public sealed class ApplicationSettingsTransactionTracer
    {
        /// <summary>
        /// Configuration block for query plans. Including this block enables the capture of query plans. The following arguments are supported:
        /// </summary>
        public readonly ImmutableArray<Outputs.ApplicationSettingsTransactionTracerExplainQueryPlan> ExplainQueryPlans;
        /// <summary>
        /// Configuration block for SQL logging.  Including this block enables SQL logging. The following arguments are supported:
        /// </summary>
        public readonly Outputs.ApplicationSettingsTransactionTracerSql? Sql;
        /// <summary>
        /// The response time threshold for collecting stack traces.
        /// </summary>
        public readonly double? StackTraceThresholdValue;
        /// <summary>
        /// The type of threshold for transactions. Valid values are `VALUE`,`APDEX_F`(4 times your apdex target)
        /// </summary>
        public readonly string? TransactionThresholdType;
        /// <summary>
        /// The threshold value for transactions(in seconds).
        /// </summary>
        public readonly double? TransactionThresholdValue;

        [OutputConstructor]
        private ApplicationSettingsTransactionTracer(
            ImmutableArray<Outputs.ApplicationSettingsTransactionTracerExplainQueryPlan> explainQueryPlans,

            Outputs.ApplicationSettingsTransactionTracerSql? sql,

            double? stackTraceThresholdValue,

            string? transactionThresholdType,

            double? transactionThresholdValue)
        {
            ExplainQueryPlans = explainQueryPlans;
            Sql = sql;
            StackTraceThresholdValue = stackTraceThresholdValue;
            TransactionThresholdType = transactionThresholdType;
            TransactionThresholdValue = transactionThresholdValue;
        }
    }
}
