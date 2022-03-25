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
    /// Use this resource to link an AWS account to New Relic.
    /// 
    /// ## Prerequisite
    /// 
    /// Setup is required in AWS for this resource to work properly. The New Relic AWS integration can be set up to pull metrics from AWS services or AWS can push metrics to New Relic using CloudWatch Metric Streams.
    /// 
    /// Using a metric stream to New Relic is the preferred way to integrate with AWS. Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/aws-integrations-list/aws-metric-stream/#set-up-metric-stream) to set up a metric stream.
    /// 
    /// To pull data from AWS instead, complete the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/amazon-integrations/get-started/connect-aws-new-relic-infrastructure-monitoring#connect).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new NewRelic.Cloud.AwsLinkAccount("foo", new NewRelic.Cloud.AwsLinkAccountArgs
    ///         {
    ///             Arn = "arn:aws:service:region:account-id:resource-id",
    ///             MetricCollectionMode = "PUSH",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linked AWS accounts can be imported using the `id`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:cloud/awsLinkAccount:AwsLinkAccount foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:cloud/awsLinkAccount:AwsLinkAccount")]
    public partial class AwsLinkAccount : Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Output("metricCollectionMode")]
        public Output<string?> MetricCollectionMode { get; private set; } = null!;

        /// <summary>
        /// - The linked account name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AwsLinkAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsLinkAccount(string name, AwsLinkAccountArgs args, CustomResourceOptions? options = null)
            : base("newrelic:cloud/awsLinkAccount:AwsLinkAccount", name, args ?? new AwsLinkAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsLinkAccount(string name, Input<string> id, AwsLinkAccountState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:cloud/awsLinkAccount:AwsLinkAccount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AwsLinkAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsLinkAccount Get(string name, Input<string> id, AwsLinkAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsLinkAccount(name, id, state, options);
        }
    }

    public sealed class AwsLinkAccountArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Input("metricCollectionMode")]
        public Input<string>? MetricCollectionMode { get; set; }

        /// <summary>
        /// - The linked account name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AwsLinkAccountArgs()
        {
        }
    }

    public sealed class AwsLinkAccountState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        /// </summary>
        [Input("metricCollectionMode")]
        public Input<string>? MetricCollectionMode { get; set; }

        /// <summary>
        /// - The linked account name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AwsLinkAccountState()
        {
        }
    }
}