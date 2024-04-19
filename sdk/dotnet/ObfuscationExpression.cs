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
    /// Use this resource to create, update and delete New Relic Obfuscation Expressions.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.ObfuscationExpression("foo", new()
    ///     {
    ///         AccountId = 12345,
    ///         Name = "OExp",
    ///         Description = "The description",
    ///         Regex = "(regex.*)",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// New Relic obfuscation expression can be imported using the expression ID, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/obfuscationExpression:ObfuscationExpression")]
    public partial class ObfuscationExpression : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account id associated with the obfuscation expression.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Description of expression.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of expression.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        /// </summary>
        [Output("regex")]
        public Output<string> Regex { get; private set; } = null!;


        /// <summary>
        /// Create a ObfuscationExpression resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObfuscationExpression(string name, ObfuscationExpressionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/obfuscationExpression:ObfuscationExpression", name, args ?? new ObfuscationExpressionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObfuscationExpression(string name, Input<string> id, ObfuscationExpressionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/obfuscationExpression:ObfuscationExpression", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ObfuscationExpression resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObfuscationExpression Get(string name, Input<string> id, ObfuscationExpressionState? state = null, CustomResourceOptions? options = null)
        {
            return new ObfuscationExpression(name, id, state, options);
        }
    }

    public sealed class ObfuscationExpressionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id associated with the obfuscation expression.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Description of expression.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of expression.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        /// </summary>
        [Input("regex", required: true)]
        public Input<string> Regex { get; set; } = null!;

        public ObfuscationExpressionArgs()
        {
        }
        public static new ObfuscationExpressionArgs Empty => new ObfuscationExpressionArgs();
    }

    public sealed class ObfuscationExpressionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account id associated with the obfuscation expression.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Description of expression.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of expression.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        /// </summary>
        [Input("regex")]
        public Input<string>? Regex { get; set; }

        public ObfuscationExpressionState()
        {
        }
        public static new ObfuscationExpressionState Empty => new ObfuscationExpressionState();
    }
}
