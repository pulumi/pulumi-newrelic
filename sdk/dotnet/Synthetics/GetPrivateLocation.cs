// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    public static class GetPrivateLocation
    {
        /// <summary>
        /// Use this data source to get information about a specific Synthetics monitor private location in New Relic that already exists.
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
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.Monitor("foo", new()
        ///     {
        ///         LocationsPrivates = new[]
        ///         {
        ///             example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.StepMonitor("foo", new()
        ///     {
        ///         LocationPrivates = new[]
        ///         {
        ///             new NewRelic.Synthetics.Inputs.StepMonitorLocationPrivateArgs
        ///             {
        ///                 Guid = example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPrivateLocationResult> InvokeAsync(GetPrivateLocationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLocationResult>("newrelic:synthetics/getPrivateLocation:getPrivateLocation", args ?? new GetPrivateLocationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific Synthetics monitor private location in New Relic that already exists.
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
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.Monitor("foo", new()
        ///     {
        ///         LocationsPrivates = new[]
        ///         {
        ///             example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.StepMonitor("foo", new()
        ///     {
        ///         LocationPrivates = new[]
        ///         {
        ///             new NewRelic.Synthetics.Inputs.StepMonitorLocationPrivateArgs
        ///             {
        ///                 Guid = example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrivateLocationResult> Invoke(GetPrivateLocationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLocationResult>("newrelic:synthetics/getPrivateLocation:getPrivateLocation", args ?? new GetPrivateLocationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific Synthetics monitor private location in New Relic that already exists.
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
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.Monitor("foo", new()
        ///     {
        ///         LocationsPrivates = new[]
        ///         {
        ///             example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = NewRelic.Synthetics.GetPrivateLocation.Invoke(new()
        ///     {
        ///         AccountId = "123456",
        ///         Name = "My private location",
        ///     });
        /// 
        ///     var foo = new NewRelic.Synthetics.StepMonitor("foo", new()
        ///     {
        ///         LocationPrivates = new[]
        ///         {
        ///             new NewRelic.Synthetics.Inputs.StepMonitorLocationPrivateArgs
        ///             {
        ///                 Guid = example.Apply(getPrivateLocationResult =&gt; getPrivateLocationResult.Id),
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrivateLocationResult> Invoke(GetPrivateLocationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLocationResult>("newrelic:synthetics/getPrivateLocation:getPrivateLocation", args ?? new GetPrivateLocationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLocationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        [Input("keys")]
        private List<string>? _keys;

        /// <summary>
        /// The key of the private location.
        /// </summary>
        public List<string> Keys
        {
            get => _keys ?? (_keys = new List<string>());
            set => _keys = value;
        }

        /// <summary>
        /// The name of the Synthetics monitor private location.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetPrivateLocationArgs()
        {
        }
        public static new GetPrivateLocationArgs Empty => new GetPrivateLocationArgs();
    }

    public sealed class GetPrivateLocationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("keys")]
        private InputList<string>? _keys;

        /// <summary>
        /// The key of the private location.
        /// </summary>
        public InputList<string> Keys
        {
            get => _keys ?? (_keys = new InputList<string>());
            set => _keys = value;
        }

        /// <summary>
        /// The name of the Synthetics monitor private location.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetPrivateLocationInvokeArgs()
        {
        }
        public static new GetPrivateLocationInvokeArgs Empty => new GetPrivateLocationInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivateLocationResult
    {
        public readonly string? AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The key of the private location.
        /// </summary>
        public readonly ImmutableArray<string> Keys;
        public readonly string Name;

        [OutputConstructor]
        private GetPrivateLocationResult(
            string? accountId,

            string id,

            ImmutableArray<string> keys,

            string name)
        {
            AccountId = accountId;
            Id = id;
            Keys = keys;
            Name = name;
        }
    }
}
