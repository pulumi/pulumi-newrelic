// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetAreaNrqlQueryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id used for the NRQL query.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public OneDashboardPageWidgetAreaNrqlQueryGetArgs()
        {
        }
        public static new OneDashboardPageWidgetAreaNrqlQueryGetArgs Empty => new OneDashboardPageWidgetAreaNrqlQueryGetArgs();
    }
}
