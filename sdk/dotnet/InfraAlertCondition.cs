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
    /// Use this resource to create and manage Infrastructure alert conditions in New Relic.
    /// 
    /// &gt; **WARNING:** The `newrelic.InfraAlertCondition` resource is deprecated and will be removed in the next major release. The resource newrelic.NrqlAlertCondition examples.
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
    ///     var foo = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         Name = "foo",
    ///     });
    /// 
    ///     var highDiskUsage = new NewRelic.InfraAlertCondition("high_disk_usage", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "High disk usage",
    ///         Description = "Warning if disk usage goes above 80% and critical alert if goes above 90%",
    ///         Type = "infra_metric",
    ///         Event = "StorageSample",
    ///         Select = "diskUsedPercent",
    ///         Comparison = "above",
    ///         Where = "(hostname LIKE '%frontend%')",
    ///         Critical = new NewRelic.Inputs.InfraAlertConditionCriticalArgs
    ///         {
    ///             Duration = 25,
    ///             Value = 90,
    ///             TimeFunction = "all",
    ///         },
    ///         Warning = new NewRelic.Inputs.InfraAlertConditionWarningArgs
    ///         {
    ///             Duration = 10,
    ///             Value = 80,
    ///             TimeFunction = "all",
    ///         },
    ///     });
    /// 
    ///     var highDbConnCount = new NewRelic.InfraAlertCondition("high_db_conn_count", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "High database connection count",
    ///         Description = "Critical alert when the number of database connections goes above 90",
    ///         Type = "infra_metric",
    ///         Event = "DatastoreSample",
    ///         Select = "provider.databaseConnections.Average",
    ///         Comparison = "above",
    ///         Where = "(hostname LIKE '%db%')",
    ///         IntegrationProvider = "RdsDbInstance",
    ///         Critical = new NewRelic.Inputs.InfraAlertConditionCriticalArgs
    ///         {
    ///             Duration = 25,
    ///             Value = 90,
    ///             TimeFunction = "all",
    ///         },
    ///     });
    /// 
    ///     var processNotRunning = new NewRelic.InfraAlertCondition("process_not_running", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "Process not running (/usr/bin/ruby)",
    ///         Description = "Critical alert when ruby isn't running",
    ///         Type = "infra_process_running",
    ///         Comparison = "equal",
    ///         Where = "hostname = 'web01'",
    ///         ProcessWhere = "commandName = '/usr/bin/ruby'",
    ///         Critical = new NewRelic.Inputs.InfraAlertConditionCriticalArgs
    ///         {
    ///             Duration = 5,
    ///             Value = 0,
    ///         },
    ///     });
    /// 
    ///     var hostNotReporting = new NewRelic.InfraAlertCondition("host_not_reporting", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "Host not reporting",
    ///         Description = "Critical alert when the host is not reporting",
    ///         Type = "infra_host_not_reporting",
    ///         Where = "(hostname LIKE '%frontend%')",
    ///         Critical = new NewRelic.Inputs.InfraAlertConditionCriticalArgs
    ///         {
    ///             Duration = 5,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Thresholds
    /// 
    /// The `critical` and `warning` threshold mapping supports the following arguments:
    /// 
    ///   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
    ///   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by `infra_metric` and `infra_process_running` alert condition types.
    ///   * `time_function` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the `infra_metric` alert condition type.
    /// 
    /// ## Tags
    /// 
    /// Manage infra alert condition tags with `newrelic.EntityTags`. For up-to-date documentation about the tagging resource, please check newrelic.EntityTags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new NewRelic.AlertPolicy("foo", new()
    ///     {
    ///         Name = "foo policy",
    ///     });
    /// 
    ///     var fooInfraAlertCondition = new NewRelic.InfraAlertCondition("foo", new()
    ///     {
    ///         PolicyId = foo.Id,
    ///         Name = "foo infra condition",
    ///         Description = "Warning if disk usage goes above 80% and critical alert if goes above 90%",
    ///         Type = "infra_metric",
    ///         Event = "StorageSample",
    ///         Select = "diskUsedPercent",
    ///         Comparison = "above",
    ///         Where = "(hostname LIKE '%frontend%')",
    ///         Critical = new NewRelic.Inputs.InfraAlertConditionCriticalArgs
    ///         {
    ///             Duration = 25,
    ///             Value = 90,
    ///             TimeFunction = "all",
    ///         },
    ///         Warning = new NewRelic.Inputs.InfraAlertConditionWarningArgs
    ///         {
    ///             Duration = 10,
    ///             Value = 80,
    ///             TimeFunction = "all",
    ///         },
    ///     });
    /// 
    ///     var myConditionEntityTags = new NewRelic.EntityTags("my_condition_entity_tags", new()
    ///     {
    ///         Guid = fooInfraAlertCondition.EntityGuid,
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value",
    ///                     "my-other-value",
    ///                 },
    ///             },
    ///             new NewRelic.Inputs.EntityTagsTagArgs
    ///             {
    ///                 Key = "my-key-2",
    ///                 Values = new[]
    ///                 {
    ///                     "my-value-2",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Infrastructure alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import newrelic:index/infraAlertCondition:InfraAlertCondition main 12345:67890
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:index/infraAlertCondition:InfraAlertCondition")]
    public partial class InfraAlertCondition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
        /// </summary>
        [Output("comparison")]
        public Output<string?> Comparison { get; private set; } = null!;

        /// <summary>
        /// The timestamp the alert condition was created.
        /// </summary>
        [Output("createdAt")]
        public Output<int> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
        /// </summary>
        [Output("critical")]
        public Output<Outputs.InfraAlertConditionCritical?> Critical { get; private set; } = null!;

        /// <summary>
        /// The description of the Infrastructure alert condition.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Output("entityGuid")]
        public Output<string> EntityGuid { get; private set; } = null!;

        /// <summary>
        /// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Output("event")]
        public Output<string> Event { get; private set; } = null!;

        /// <summary>
        /// For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Output("integrationProvider")]
        public Output<string?> IntegrationProvider { get; private set; } = null!;

        /// <summary>
        /// The Infrastructure alert condition's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the alert policy where this condition should be used.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infra_process_running` condition type.
        /// </summary>
        [Output("processWhere")]
        public Output<string?> ProcessWhere { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;

        /// <summary>
        /// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Output("select")]
        public Output<string?> Select { get; private set; } = null!;

        /// <summary>
        /// The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The timestamp the alert condition was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<int> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
        /// 
        /// ```
        /// Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        /// ```
        /// </summary>
        [Output("violationCloseTimer")]
        public Output<int?> ViolationCloseTimer { get; private set; } = null!;

        /// <summary>
        /// Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
        /// </summary>
        [Output("warning")]
        public Output<Outputs.InfraAlertConditionWarning?> Warning { get; private set; } = null!;

        /// <summary>
        /// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
        /// </summary>
        [Output("where")]
        public Output<string?> Where { get; private set; } = null!;


        /// <summary>
        /// Create a InfraAlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InfraAlertCondition(string name, InfraAlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/infraAlertCondition:InfraAlertCondition", name, args ?? new InfraAlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InfraAlertCondition(string name, Input<string> id, InfraAlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/infraAlertCondition:InfraAlertCondition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InfraAlertCondition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InfraAlertCondition Get(string name, Input<string> id, InfraAlertConditionState? state = null, CustomResourceOptions? options = null)
        {
            return new InfraAlertCondition(name, id, state, options);
        }
    }

    public sealed class InfraAlertConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
        /// </summary>
        [Input("critical")]
        public Input<Inputs.InfraAlertConditionCriticalArgs>? Critical { get; set; }

        /// <summary>
        /// The description of the Infrastructure alert condition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("event")]
        public Input<string>? Event { get; set; }

        /// <summary>
        /// For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("integrationProvider")]
        public Input<string>? IntegrationProvider { get; set; }

        /// <summary>
        /// The Infrastructure alert condition's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the alert policy where this condition should be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        /// <summary>
        /// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infra_process_running` condition type.
        /// </summary>
        [Input("processWhere")]
        public Input<string>? ProcessWhere { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        /// <summary>
        /// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("select")]
        public Input<string>? Select { get; set; }

        /// <summary>
        /// The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
        /// 
        /// ```
        /// Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        /// ```
        /// </summary>
        [Input("violationCloseTimer")]
        public Input<int>? ViolationCloseTimer { get; set; }

        /// <summary>
        /// Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.InfraAlertConditionWarningArgs>? Warning { get; set; }

        /// <summary>
        /// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
        /// </summary>
        [Input("where")]
        public Input<string>? Where { get; set; }

        public InfraAlertConditionArgs()
        {
        }
        public static new InfraAlertConditionArgs Empty => new InfraAlertConditionArgs();
    }

    public sealed class InfraAlertConditionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infra_metric` and `infra_process_running` condition types.
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// The timestamp the alert condition was created.
        /// </summary>
        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        /// <summary>
        /// Identifies the threshold parameters for opening a critical alert incident. See Thresholds below for details.
        /// </summary>
        [Input("critical")]
        public Input<Inputs.InfraAlertConditionCriticalGetArgs>? Critical { get; set; }

        /// <summary>
        /// The description of the Infrastructure alert condition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The unique entity identifier of the condition in New Relic.
        /// </summary>
        [Input("entityGuid")]
        public Input<string>? EntityGuid { get; set; }

        /// <summary>
        /// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("event")]
        public Input<string>? Event { get; set; }

        /// <summary>
        /// For alerts on integrations, use this instead of `event`.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("integrationProvider")]
        public Input<string>? IntegrationProvider { get; set; }

        /// <summary>
        /// The Infrastructure alert condition's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the alert policy where this condition should be used.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infra_process_running` condition type.
        /// </summary>
        [Input("processWhere")]
        public Input<string>? ProcessWhere { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        /// <summary>
        /// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infra_metric` condition type.
        /// </summary>
        [Input("select")]
        public Input<string>? Select { get; set; }

        /// <summary>
        /// The type of Infrastructure alert condition.  Valid values are  `infra_process_running`, `infra_metric`, and `infra_host_not_reporting`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The timestamp the alert condition was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        /// <summary>
        /// Determines how much time will pass (in hours) before an incident is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
        /// 
        /// ```
        /// Warning: This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        /// ```
        /// </summary>
        [Input("violationCloseTimer")]
        public Input<int>? ViolationCloseTimer { get; set; }

        /// <summary>
        /// Identifies the threshold parameters for opening a warning alert incident. See Thresholds below for details.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.InfraAlertConditionWarningGetArgs>? Warning { get; set; }

        /// <summary>
        /// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
        /// </summary>
        [Input("where")]
        public Input<string>? Where { get; set; }

        public InfraAlertConditionState()
        {
        }
        public static new InfraAlertConditionState Empty => new InfraAlertConditionState();
    }
}
