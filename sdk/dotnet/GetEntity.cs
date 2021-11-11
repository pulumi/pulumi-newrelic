// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.NewRelic
{
    public static class GetEntity
    {
        /// <summary>
        /// Use this data source to get information about a specific entity in New Relic One that already exists. 
        /// </summary>
        public static Task<GetEntityResult> InvokeAsync(GetEntityArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEntityResult>("newrelic:index/getEntity:getEntity", args ?? new GetEntityArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to get information about a specific entity in New Relic One that already exists. 
        /// </summary>
        public static Output<GetEntityResult> Invoke(GetEntityInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetEntityResult>("newrelic:index/getEntity:getEntity", args ?? new GetEntityInvokeArgs(), options.WithVersion());
    }


    public sealed class GetEntityArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// Ignore case of the `name` when searching for the entity. Defaults to false.
        /// </summary>
        [Input("ignoreCase")]
        public bool? IgnoreCase { get; set; }

        /// <summary>
        /// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tag")]
        public Inputs.GetEntityTagArgs? Tag { get; set; }

        /// <summary>
        /// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetEntityArgs()
        {
        }
    }

    public sealed class GetEntityInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Ignore case of the `name` when searching for the entity. Defaults to false.
        /// </summary>
        [Input("ignoreCase")]
        public Input<bool>? IgnoreCase { get; set; }

        /// <summary>
        /// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tag")]
        public Input<Inputs.GetEntityTagInputArgs>? Tag { get; set; }

        /// <summary>
        /// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetEntityInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEntityResult
    {
        /// <summary>
        /// The New Relic account ID associated with this entity.
        /// </summary>
        public readonly int AccountId;
        /// <summary>
        /// The domain-specific application ID of the entity. Only returned for APM and Browser applications.
        /// </summary>
        public readonly int ApplicationId;
        public readonly string Domain;
        /// <summary>
        /// The unique GUID of the entity.
        /// </summary>
        public readonly string Guid;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IgnoreCase;
        public readonly string Name;
        public readonly int ServingApmApplicationId;
        public readonly Outputs.GetEntityTagResult? Tag;
        public readonly string Type;

        [OutputConstructor]
        private GetEntityResult(
            int accountId,

            int applicationId,

            string domain,

            string guid,

            string id,

            bool? ignoreCase,

            string name,

            int servingApmApplicationId,

            Outputs.GetEntityTagResult? tag,

            string type)
        {
            AccountId = accountId;
            ApplicationId = applicationId;
            Domain = domain;
            Guid = guid;
            Id = id;
            IgnoreCase = ignoreCase;
            Name = name;
            ServingApmApplicationId = servingApmApplicationId;
            Tag = tag;
            Type = type;
        }
    }
}
