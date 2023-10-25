// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud
{
    /// <summary>
    /// ## Import
    /// 
    /// Linked AWSGovCloud accounts can be imported using the `id`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount")]
    public partial class AwsGovcloudLinkAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The access key of the AwsGovCloud.
        /// </summary>
        [Output("accessKeyId")]
        public Output<string> AccessKeyId { get; private set; } = null!;

        /// <summary>
        /// The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The AwsGovCloud account ID.
        /// </summary>
        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Output("metricCollectionMode")]
        public Output<string?> MetricCollectionMode { get; private set; } = null!;

        /// <summary>
        /// The linked account name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The secret key of the AwsGovCloud.
        /// </summary>
        [Output("secretAccessKey")]
        public Output<string> SecretAccessKey { get; private set; } = null!;


        /// <summary>
        /// Create a AwsGovcloudLinkAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsGovcloudLinkAccount(string name, AwsGovcloudLinkAccountArgs args, CustomResourceOptions? options = null)
            : base("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, args ?? new AwsGovcloudLinkAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsGovcloudLinkAccount(string name, Input<string> id, AwsGovcloudLinkAccountState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accessKeyId",
                    "secretAccessKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AwsGovcloudLinkAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsGovcloudLinkAccount Get(string name, Input<string> id, AwsGovcloudLinkAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsGovcloudLinkAccount(name, id, state, options);
        }
    }

    public sealed class AwsGovcloudLinkAccountArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId", required: true)]
        private Input<string>? _accessKeyId;

        /// <summary>
        /// The access key of the AwsGovCloud.
        /// </summary>
        public Input<string>? AccessKeyId
        {
            get => _accessKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The AwsGovCloud account ID.
        /// </summary>
        [Input("awsAccountId", required: true)]
        public Input<string> AwsAccountId { get; set; } = null!;

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Input("metricCollectionMode")]
        public Input<string>? MetricCollectionMode { get; set; }

        /// <summary>
        /// The linked account name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("secretAccessKey", required: true)]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// The secret key of the AwsGovCloud.
        /// </summary>
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public AwsGovcloudLinkAccountArgs()
        {
        }
        public static new AwsGovcloudLinkAccountArgs Empty => new AwsGovcloudLinkAccountArgs();
    }

    public sealed class AwsGovcloudLinkAccountState : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId")]
        private Input<string>? _accessKeyId;

        /// <summary>
        /// The access key of the AwsGovCloud.
        /// </summary>
        public Input<string>? AccessKeyId
        {
            get => _accessKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The AwsGovCloud account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Input("metricCollectionMode")]
        public Input<string>? MetricCollectionMode { get; set; }

        /// <summary>
        /// The linked account name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// The secret key of the AwsGovCloud.
        /// </summary>
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public AwsGovcloudLinkAccountState()
        {
        }
        public static new AwsGovcloudLinkAccountState Empty => new AwsGovcloudLinkAccountState();
    }
}
