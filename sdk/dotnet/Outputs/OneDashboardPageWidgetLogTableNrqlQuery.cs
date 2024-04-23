// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class OneDashboardPageWidgetLogTableNrqlQuery
    {
        /// <summary>
        /// The account id used for the NRQL query.
        /// </summary>
        public readonly int? AccountId;
        /// <summary>
        /// (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
        /// </summary>
        public readonly string Query;

        [OutputConstructor]
        private OneDashboardPageWidgetLogTableNrqlQuery(
            int? accountId,

            string query)
        {
            AccountId = accountId;
            Query = query;
        }
    }
}
