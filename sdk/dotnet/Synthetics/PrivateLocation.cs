// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    /// <summary>
    /// Use this resource to create and manage New Relic Synthetic private location.
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
    ///     var location = new NewRelic.Synthetics.PrivateLocation("location", new()
    ///     {
    ///         Description = "The private location description",
    ///         Name = "The name of the private location",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A Synthetics private location can be imported using the `guid`
    /// 
    /// ```sh
    /// $ pulumi import newrelic:synthetics/privateLocation:PrivateLocation location GUID
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/privateLocation:PrivateLocation")]
    public partial class PrivateLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the private location will be created.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The private location description.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The private location globally unique identifier.
        /// </summary>
        [Output("domainId")]
        public Output<string> DomainId { get; private set; } = null!;

        /// <summary>
        /// The unique client identifier for the private location in New Relic. Same as `id`.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The private locations key.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// An alternate identifier based on name.
        /// </summary>
        [Output("locationId")]
        public Output<string> LocationId { get; private set; } = null!;

        /// <summary>
        /// The name of the private location.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The private location requires a password to edit if value is true. Defaults to `false`
        /// </summary>
        [Output("verifiedScriptExecution")]
        public Output<bool?> VerifiedScriptExecution { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateLocation(string name, PrivateLocationArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/privateLocation:PrivateLocation", name, args ?? new PrivateLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateLocation(string name, Input<string> id, PrivateLocationState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/privateLocation:PrivateLocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateLocation Get(string name, Input<string> id, PrivateLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateLocation(name, id, state, options);
        }
    }

    public sealed class PrivateLocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the private location will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The private location description.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The name of the private location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The private location requires a password to edit if value is true. Defaults to `false`
        /// </summary>
        [Input("verifiedScriptExecution")]
        public Input<bool>? VerifiedScriptExecution { get; set; }

        public PrivateLocationArgs()
        {
        }
        public static new PrivateLocationArgs Empty => new PrivateLocationArgs();
    }

    public sealed class PrivateLocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the private location will be created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The private location description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The private location globally unique identifier.
        /// </summary>
        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        /// <summary>
        /// The unique client identifier for the private location in New Relic. Same as `id`.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The private locations key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// An alternate identifier based on name.
        /// </summary>
        [Input("locationId")]
        public Input<string>? LocationId { get; set; }

        /// <summary>
        /// The name of the private location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The private location requires a password to edit if value is true. Defaults to `false`
        /// </summary>
        [Input("verifiedScriptExecution")]
        public Input<bool>? VerifiedScriptExecution { get; set; }

        public PrivateLocationState()
        {
        }
        public static new PrivateLocationState Empty => new PrivateLocationState();
    }
}
