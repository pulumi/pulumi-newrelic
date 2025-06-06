// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// ## Import
    /// 
    /// A browser application can be imported using its GUID, i.e.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/browserApplication:BrowserApplication foo &lt;GUID&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/browserApplication:BrowserApplication")]
    public partial class BrowserApplication : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account ID of the New Relic account you wish to create the browser application in. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` if not specified.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The application ID of the browser application (not to be confused with GUID).
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// Configures cookies. Defaults to `true`, if not specified.
        /// </summary>
        [Output("cookiesEnabled")]
        public Output<bool?> CookiesEnabled { get; private set; } = null!;

        /// <summary>
        /// Configures distributed tracing in browser apps. Defaults to `true`, if not specified.
        /// </summary>
        [Output("distributedTracingEnabled")]
        public Output<bool?> DistributedTracingEnabled { get; private set; } = null!;

        /// <summary>
        /// The GUID of the browser application.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The JavaScript configuration of the browser application, encoded into a string.
        /// </summary>
        [Output("jsConfig")]
        public Output<string> JsConfig { get; private set; } = null!;

        /// <summary>
        /// Determines the browser loader configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. Refer to the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for more information on valid loader types.
        /// </summary>
        [Output("loaderType")]
        public Output<string?> LoaderType { get; private set; } = null!;

        /// <summary>
        /// The name of the browser application.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a BrowserApplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BrowserApplication(string name, BrowserApplicationArgs? args = null, CustomResourceOptions? options = null)
            : base("newrelic:index/browserApplication:BrowserApplication", name, args ?? new BrowserApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BrowserApplication(string name, Input<string> id, BrowserApplicationState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/browserApplication:BrowserApplication", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BrowserApplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BrowserApplication Get(string name, Input<string> id, BrowserApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new BrowserApplication(name, id, state, options);
        }
    }

    public sealed class BrowserApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the New Relic account you wish to create the browser application in. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` if not specified.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Configures cookies. Defaults to `true`, if not specified.
        /// </summary>
        [Input("cookiesEnabled")]
        public Input<bool>? CookiesEnabled { get; set; }

        /// <summary>
        /// Configures distributed tracing in browser apps. Defaults to `true`, if not specified.
        /// </summary>
        [Input("distributedTracingEnabled")]
        public Input<bool>? DistributedTracingEnabled { get; set; }

        /// <summary>
        /// Determines the browser loader configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. Refer to the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for more information on valid loader types.
        /// </summary>
        [Input("loaderType")]
        public Input<string>? LoaderType { get; set; }

        /// <summary>
        /// The name of the browser application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public BrowserApplicationArgs()
        {
        }
        public static new BrowserApplicationArgs Empty => new BrowserApplicationArgs();
    }

    public sealed class BrowserApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the New Relic account you wish to create the browser application in. Defaults to the value of the environment variable `NEW_RELIC_ACCOUNT_ID` if not specified.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The application ID of the browser application (not to be confused with GUID).
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Configures cookies. Defaults to `true`, if not specified.
        /// </summary>
        [Input("cookiesEnabled")]
        public Input<bool>? CookiesEnabled { get; set; }

        /// <summary>
        /// Configures distributed tracing in browser apps. Defaults to `true`, if not specified.
        /// </summary>
        [Input("distributedTracingEnabled")]
        public Input<bool>? DistributedTracingEnabled { get; set; }

        /// <summary>
        /// The GUID of the browser application.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The JavaScript configuration of the browser application, encoded into a string.
        /// </summary>
        [Input("jsConfig")]
        public Input<string>? JsConfig { get; set; }

        /// <summary>
        /// Determines the browser loader configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. Refer to the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for more information on valid loader types.
        /// </summary>
        [Input("loaderType")]
        public Input<string>? LoaderType { get; set; }

        /// <summary>
        /// The name of the browser application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public BrowserApplicationState()
        {
        }
        public static new BrowserApplicationState Empty => new BrowserApplicationState();
    }
}
