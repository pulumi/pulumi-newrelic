// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetEntity
    {
        public static Task<GetEntityResult> InvokeAsync(GetEntityArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEntityResult>("newrelic:index/getEntity:getEntity", args ?? new GetEntityArgs(), options.WithDefaults());

        public static Output<GetEntityResult> Invoke(GetEntityInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEntityResult>("newrelic:index/getEntity:getEntity", args ?? new GetEntityInvokeArgs(), options.WithDefaults());

        public static Output<GetEntityResult> Invoke(GetEntityInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEntityResult>("newrelic:index/getEntity:getEntity", args ?? new GetEntityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEntityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// A JSON-encoded string, comprising tags associated with the entity fetched.
        /// * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
        /// </summary>
        [Input("entityTags")]
        public string? EntityTags { get; set; }

        /// <summary>
        /// Ignore case of the `name` when searching for the entity. Defaults to false.
        /// </summary>
        [Input("ignoreCase")]
        public bool? IgnoreCase { get; set; }

        /// <summary>
        /// A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
        /// 
        /// &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
        /// </summary>
        [Input("ignoreNotFound")]
        public bool? IgnoreNotFound { get; set; }

        /// <summary>
        /// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<Inputs.GetEntityTagArgs>? _tags;

        /// <summary>
        /// A tag applied to the entity. See Nested tag blocks below for details.
        /// </summary>
        public List<Inputs.GetEntityTagArgs> Tags
        {
            get => _tags ?? (_tags = new List<Inputs.GetEntityTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetEntityArgs()
        {
        }
        public static new GetEntityArgs Empty => new GetEntityArgs();
    }

    public sealed class GetEntityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID the entity to be returned would be associated with, i.e. if specified, the data source would filter matching entities received by `account_id` and return the first match. If not, matching entities are filtered by the account ID specified in the configuration of the provider. See the **Example: Filter By Account ID** section above for more details.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and EXT. If not specified, all domains are searched.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// A JSON-encoded string, comprising tags associated with the entity fetched.
        /// * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
        /// </summary>
        [Input("entityTags")]
        public Input<string>? EntityTags { get; set; }

        /// <summary>
        /// Ignore case of the `name` when searching for the entity. Defaults to false.
        /// </summary>
        [Input("ignoreCase")]
        public Input<bool>? IgnoreCase { get; set; }

        /// <summary>
        /// A boolean argument that, when set to true, prevents an error from being thrown when the queried entity is not found. Instead, a warning is displayed. Defaults to `false`.
        /// 
        /// &gt; **WARNING:** Setting the `ignore_not_found` argument to `true` will display an 'entity not found' warning instead of throwing an error. This can lead to downstream errors if the values of attributes exported by this data source are used elsewhere, as all of these values would be null. Please use this argument at your own risk.
        /// </summary>
        [Input("ignoreNotFound")]
        public Input<bool>? IgnoreNotFound { get; set; }

        /// <summary>
        /// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.GetEntityTagInputArgs>? _tags;

        /// <summary>
        /// A tag applied to the entity. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.GetEntityTagInputArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.GetEntityTagInputArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, WORKLOAD, AWSLAMBDAFUNCTION, SERVICE_LEVEL, and KEY_TRANSACTION. Note: Other entity types may also be queryable as the list of entity types may fluctuate over time.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetEntityInvokeArgs()
        {
        }
        public static new GetEntityInvokeArgs Empty => new GetEntityInvokeArgs();
    }


    [OutputType]
    public sealed class GetEntityResult
    {
        public readonly string AccountId;
        /// <summary>
        /// The domain-specific application ID of the entity. Only returned for APM and Browser applications.
        /// </summary>
        public readonly string ApplicationId;
        public readonly string Domain;
        /// <summary>
        /// A JSON-encoded string, comprising tags associated with the entity fetched.
        /// * See the **Additional Examples** section below, for an illustration depicting the usage of `jsondecode` with the attribute `entity_tags`, to get the tags associated with the entity fetched.
        /// </summary>
        public readonly string EntityTags;
        /// <summary>
        /// The unique GUID of the entity.
        /// </summary>
        public readonly string Guid;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IgnoreCase;
        public readonly bool? IgnoreNotFound;
        public readonly string Name;
        /// <summary>
        /// The browser-specific ID of the backing APM entity. Only returned for Browser applications.
        /// </summary>
        public readonly string ServingApmApplicationId;
        public readonly ImmutableArray<Outputs.GetEntityTagResult> Tags;
        public readonly string Type;

        [OutputConstructor]
        private GetEntityResult(
            string accountId,

            string applicationId,

            string domain,

            string entityTags,

            string guid,

            string id,

            bool? ignoreCase,

            bool? ignoreNotFound,

            string name,

            string servingApmApplicationId,

            ImmutableArray<Outputs.GetEntityTagResult> tags,

            string type)
        {
            AccountId = accountId;
            ApplicationId = applicationId;
            Domain = domain;
            EntityTags = entityTags;
            Guid = guid;
            Id = id;
            IgnoreCase = ignoreCase;
            IgnoreNotFound = ignoreNotFound;
            Name = name;
            ServingApmApplicationId = servingApmApplicationId;
            Tags = tags;
            Type = type;
        }
    }
}
