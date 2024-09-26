// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create a new Key Transaction in New Relic.
    /// 
    /// &gt; **NOTE:** For more information on Key Transactions, head over to [this page](https://docs.newrelic.com/docs/apm/transactions/key-transactions/introduction-key-transactions/) in New Relic's docs.
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
    ///     var foo = new NewRelic.KeyTransaction("foo", new()
    ///     {
    ///         ApplicationGuid = "MzgfNjUyNnxBUE19QVBQTElDQVHJT068NTUfNDT4MjUy",
    ///         ApdexIndex = 0.5,
    ///         BrowserApdexTarget = 0.5,
    ///         MetricName = "WebTransaction/Function/__main__:foo_bar",
    ///         Name = "Sample Key Transaction",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A Key Transaction in New Relic may be imported into Terraform using its GUID specified in the `&lt;id&gt;` field, in the following command.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/keyTransaction:KeyTransaction foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/keyTransaction:KeyTransaction")]
    public partial class KeyTransaction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
        /// </summary>
        [Output("apdexIndex")]
        public Output<double> ApdexIndex { get; private set; } = null!;

        /// <summary>
        /// The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
        /// </summary>
        [Output("applicationGuid")]
        public Output<string> ApplicationGuid { get; private set; } = null!;

        /// <summary>
        /// A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
        /// 
        /// &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
        /// </summary>
        [Output("browserApdexTarget")]
        public Output<double> BrowserApdexTarget { get; private set; } = null!;

        /// <summary>
        /// The domain of the entity monitored by the key transaction.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The name of the underlying metric monitored by the key transaction to be created.
        /// </summary>
        [Output("metricName")]
        public Output<string> MetricName { get; private set; } = null!;

        /// <summary>
        /// The name of the key transaction.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of the entity monitored by the key transaction.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a KeyTransaction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KeyTransaction(string name, KeyTransactionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/keyTransaction:KeyTransaction", name, args ?? new KeyTransactionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KeyTransaction(string name, Input<string> id, KeyTransactionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/keyTransaction:KeyTransaction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KeyTransaction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KeyTransaction Get(string name, Input<string> id, KeyTransactionState? state = null, CustomResourceOptions? options = null)
        {
            return new KeyTransaction(name, id, state, options);
        }
    }

    public sealed class KeyTransactionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
        /// </summary>
        [Input("apdexIndex", required: true)]
        public Input<double> ApdexIndex { get; set; } = null!;

        /// <summary>
        /// The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
        /// </summary>
        [Input("applicationGuid", required: true)]
        public Input<string> ApplicationGuid { get; set; } = null!;

        /// <summary>
        /// A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
        /// 
        /// &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
        /// </summary>
        [Input("browserApdexTarget", required: true)]
        public Input<double> BrowserApdexTarget { get; set; } = null!;

        /// <summary>
        /// The name of the underlying metric monitored by the key transaction to be created.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The name of the key transaction.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public KeyTransactionArgs()
        {
        }
        public static new KeyTransactionArgs Empty => new KeyTransactionArgs();
    }

    public sealed class KeyTransactionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A decimal value, measuring user satisfaction with response times, ranging from 0 (frustrated) to 1 (satisfied).
        /// </summary>
        [Input("apdexIndex")]
        public Input<double>? ApdexIndex { get; set; }

        /// <summary>
        /// The GUID of the APM Application comprising transactions, of which one would be made a key transaction.
        /// </summary>
        [Input("applicationGuid")]
        public Input<string>? ApplicationGuid { get; set; }

        /// <summary>
        /// A decimal value representing the response time threshold for satisfactory experience (e.g., 0.5 seconds).
        /// 
        /// &gt; **NOTE:** It may be noted that the `metric_name` and `application_guid` of a Key Transaction _cannot_ be updated in a key transaction that has already been created; since this is not supported. As a consequence, altering the values of `application_guid` and/or `metric_name` of a `newrelic.KeyTransaction` resource created (to try updating these values) would result in `pulumi preview` prompting a forced destruction and re-creation of the resource.
        /// </summary>
        [Input("browserApdexTarget")]
        public Input<double>? BrowserApdexTarget { get; set; }

        /// <summary>
        /// The domain of the entity monitored by the key transaction.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The name of the underlying metric monitored by the key transaction to be created.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// The name of the key transaction.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of the entity monitored by the key transaction.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public KeyTransactionState()
        {
        }
        public static new KeyTransactionState Empty => new KeyTransactionState();
    }
}
