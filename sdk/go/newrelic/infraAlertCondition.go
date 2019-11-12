// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// ## Thresholds
// 
// The `critical` and `warning` threshold mapping supports the following arguments:
// 
//   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
//   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by "infraMetric" and "infraProcessRunning" alert condition types.
//   * `timeFunction` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the "infraMetric" alert condition type.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/infra_alert_condition.html.markdown.
type InfraAlertCondition struct {
	s *pulumi.ResourceState
}

// NewInfraAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewInfraAlertCondition(ctx *pulumi.Context,
	name string, args *InfraAlertConditionArgs, opts ...pulumi.ResourceOpt) (*InfraAlertCondition, error) {
	if args == nil || args.PolicyId == nil {
		return nil, errors.New("missing required argument 'PolicyId'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["comparison"] = nil
		inputs["critical"] = nil
		inputs["enabled"] = nil
		inputs["event"] = nil
		inputs["integrationProvider"] = nil
		inputs["name"] = nil
		inputs["policyId"] = nil
		inputs["processWhere"] = nil
		inputs["runbookUrl"] = nil
		inputs["select"] = nil
		inputs["type"] = nil
		inputs["warning"] = nil
		inputs["where"] = nil
	} else {
		inputs["comparison"] = args.Comparison
		inputs["critical"] = args.Critical
		inputs["enabled"] = args.Enabled
		inputs["event"] = args.Event
		inputs["integrationProvider"] = args.IntegrationProvider
		inputs["name"] = args.Name
		inputs["policyId"] = args.PolicyId
		inputs["processWhere"] = args.ProcessWhere
		inputs["runbookUrl"] = args.RunbookUrl
		inputs["select"] = args.Select
		inputs["type"] = args.Type
		inputs["warning"] = args.Warning
		inputs["where"] = args.Where
	}
	inputs["createdAt"] = nil
	inputs["updatedAt"] = nil
	s, err := ctx.RegisterResource("newrelic:index/infraAlertCondition:InfraAlertCondition", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &InfraAlertCondition{s: s}, nil
}

// GetInfraAlertCondition gets an existing InfraAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInfraAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.ID, state *InfraAlertConditionState, opts ...pulumi.ResourceOpt) (*InfraAlertCondition, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["comparison"] = state.Comparison
		inputs["createdAt"] = state.CreatedAt
		inputs["critical"] = state.Critical
		inputs["enabled"] = state.Enabled
		inputs["event"] = state.Event
		inputs["integrationProvider"] = state.IntegrationProvider
		inputs["name"] = state.Name
		inputs["policyId"] = state.PolicyId
		inputs["processWhere"] = state.ProcessWhere
		inputs["runbookUrl"] = state.RunbookUrl
		inputs["select"] = state.Select
		inputs["type"] = state.Type
		inputs["updatedAt"] = state.UpdatedAt
		inputs["warning"] = state.Warning
		inputs["where"] = state.Where
	}
	s, err := ctx.ReadResource("newrelic:index/infraAlertCondition:InfraAlertCondition", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &InfraAlertCondition{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *InfraAlertCondition) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *InfraAlertCondition) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The operator used to evaluate the threshold value; "above", "below", "equal".
func (r *InfraAlertCondition) Comparison() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["comparison"])
}

func (r *InfraAlertCondition) CreatedAt() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["createdAt"])
}

// Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
func (r *InfraAlertCondition) Critical() *pulumi.Output {
	return r.s.State["critical"]
}

// Set whether to enable the alert condition. Defaults to `true`.
func (r *InfraAlertCondition) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

// The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
func (r *InfraAlertCondition) Event() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["event"])
}

// For alerts on integrations, use this instead of `event`. 
func (r *InfraAlertCondition) IntegrationProvider() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["integrationProvider"])
}

// The Infrastructure alert condition's name.
func (r *InfraAlertCondition) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The ID of the alert policy where this condition should be used.
func (r *InfraAlertCondition) PolicyId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["policyId"])
}

// Any filters applied to processes; for example: `"commandName = 'java'"`.
func (r *InfraAlertCondition) ProcessWhere() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["processWhere"])
}

func (r *InfraAlertCondition) RunbookUrl() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["runbookUrl"])
}

// The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
func (r *InfraAlertCondition) Select() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["select"])
}

// The type of Infrastructure alert condition: "infraProcessRunning", "infraMetric", or "infraHostNotReporting".
func (r *InfraAlertCondition) Type() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["type"])
}

func (r *InfraAlertCondition) UpdatedAt() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["updatedAt"])
}

// Identifies the warning threshold parameters. See Thresholds below for details.
func (r *InfraAlertCondition) Warning() *pulumi.Output {
	return r.s.State["warning"]
}

// Infrastructure host filter for the alert condition.
func (r *InfraAlertCondition) Where() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["where"])
}

// Input properties used for looking up and filtering InfraAlertCondition resources.
type InfraAlertConditionState struct {
	// The operator used to evaluate the threshold value; "above", "below", "equal".
	Comparison interface{}
	CreatedAt interface{}
	// Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
	Critical interface{}
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
	Event interface{}
	// For alerts on integrations, use this instead of `event`. 
	IntegrationProvider interface{}
	// The Infrastructure alert condition's name.
	Name interface{}
	// The ID of the alert policy where this condition should be used.
	PolicyId interface{}
	// Any filters applied to processes; for example: `"commandName = 'java'"`.
	ProcessWhere interface{}
	RunbookUrl interface{}
	// The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
	Select interface{}
	// The type of Infrastructure alert condition: "infraProcessRunning", "infraMetric", or "infraHostNotReporting".
	Type interface{}
	UpdatedAt interface{}
	// Identifies the warning threshold parameters. See Thresholds below for details.
	Warning interface{}
	// Infrastructure host filter for the alert condition.
	Where interface{}
}

// The set of arguments for constructing a InfraAlertCondition resource.
type InfraAlertConditionArgs struct {
	// The operator used to evaluate the threshold value; "above", "below", "equal".
	Comparison interface{}
	// Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
	Critical interface{}
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
	Event interface{}
	// For alerts on integrations, use this instead of `event`. 
	IntegrationProvider interface{}
	// The Infrastructure alert condition's name.
	Name interface{}
	// The ID of the alert policy where this condition should be used.
	PolicyId interface{}
	// Any filters applied to processes; for example: `"commandName = 'java'"`.
	ProcessWhere interface{}
	RunbookUrl interface{}
	// The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
	Select interface{}
	// The type of Infrastructure alert condition: "infraProcessRunning", "infraMetric", or "infraHostNotReporting".
	Type interface{}
	// Identifies the warning threshold parameters. See Thresholds below for details.
	Warning interface{}
	// Infrastructure host filter for the alert condition.
	Where interface{}
}
