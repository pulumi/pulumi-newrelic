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
    /// Use this resource to create, update, and delete tags for a New Relic One entity.
    /// </summary>
    public partial class EntityTags : Pulumi.CustomResource
    {
        /// <summary>
        /// The guid of the entity to tag.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes an entity tag. See Nested tag blocks below for details.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.EntityTagsTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a EntityTags resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EntityTags(string name, EntityTagsArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/entityTags:EntityTags", name, args ?? new EntityTagsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EntityTags(string name, Input<string> id, EntityTagsState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/entityTags:EntityTags", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EntityTags resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EntityTags Get(string name, Input<string> id, EntityTagsState? state = null, CustomResourceOptions? options = null)
        {
            return new EntityTags(name, id, state, options);
        }
    }

    public sealed class EntityTagsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The guid of the entity to tag.
        /// </summary>
        [Input("guid", required: true)]
        public Input<string> Guid { get; set; } = null!;

        [Input("tags", required: true)]
        private InputList<Inputs.EntityTagsTagArgs>? _tags;

        /// <summary>
        /// A nested block that describes an entity tag. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.EntityTagsTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.EntityTagsTagArgs>());
            set => _tags = value;
        }

        public EntityTagsArgs()
        {
        }
    }

    public sealed class EntityTagsState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The guid of the entity to tag.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        [Input("tags")]
        private InputList<Inputs.EntityTagsTagGetArgs>? _tags;

        /// <summary>
        /// A nested block that describes an entity tag. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.EntityTagsTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.EntityTagsTagGetArgs>());
            set => _tags = value;
        }

        public EntityTagsState()
        {
        }
    }
}
