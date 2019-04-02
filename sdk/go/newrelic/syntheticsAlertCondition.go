// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type SyntheticsAlertCondition struct {
	s *pulumi.ResourceState
}

// NewSyntheticsAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewSyntheticsAlertCondition(ctx *pulumi.Context,
	name string, args *SyntheticsAlertConditionArgs, opts ...pulumi.ResourceOpt) (*SyntheticsAlertCondition, error) {
	if args == nil || args.MonitorId == nil {
		return nil, errors.New("missing required argument 'MonitorId'")
	}
	if args == nil || args.PolicyId == nil {
		return nil, errors.New("missing required argument 'PolicyId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["enabled"] = nil
		inputs["monitorId"] = nil
		inputs["name"] = nil
		inputs["policyId"] = nil
		inputs["runbookUrl"] = nil
	} else {
		inputs["enabled"] = args.Enabled
		inputs["monitorId"] = args.MonitorId
		inputs["name"] = args.Name
		inputs["policyId"] = args.PolicyId
		inputs["runbookUrl"] = args.RunbookUrl
	}
	s, err := ctx.RegisterResource("newrelic:index/syntheticsAlertCondition:SyntheticsAlertCondition", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SyntheticsAlertCondition{s: s}, nil
}

// GetSyntheticsAlertCondition gets an existing SyntheticsAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSyntheticsAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.ID, state *SyntheticsAlertConditionState, opts ...pulumi.ResourceOpt) (*SyntheticsAlertCondition, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["enabled"] = state.Enabled
		inputs["monitorId"] = state.MonitorId
		inputs["name"] = state.Name
		inputs["policyId"] = state.PolicyId
		inputs["runbookUrl"] = state.RunbookUrl
	}
	s, err := ctx.ReadResource("newrelic:index/syntheticsAlertCondition:SyntheticsAlertCondition", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SyntheticsAlertCondition{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *SyntheticsAlertCondition) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *SyntheticsAlertCondition) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// Set whether to enable the alert condition. Defaults to `true`.
func (r *SyntheticsAlertCondition) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

// The ID of the Synthetics monitor to be referenced in the alert condition. 
func (r *SyntheticsAlertCondition) MonitorId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["monitorId"])
}

// The title of this condition.
func (r *SyntheticsAlertCondition) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The ID of the policy where this condition should be used.
func (r *SyntheticsAlertCondition) PolicyId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["policyId"])
}

// Runbook URL to display in notifications.
func (r *SyntheticsAlertCondition) RunbookUrl() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["runbookUrl"])
}

// Input properties used for looking up and filtering SyntheticsAlertCondition resources.
type SyntheticsAlertConditionState struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The ID of the Synthetics monitor to be referenced in the alert condition. 
	MonitorId interface{}
	// The title of this condition.
	Name interface{}
	// The ID of the policy where this condition should be used.
	PolicyId interface{}
	// Runbook URL to display in notifications.
	RunbookUrl interface{}
}

// The set of arguments for constructing a SyntheticsAlertCondition resource.
type SyntheticsAlertConditionArgs struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The ID of the Synthetics monitor to be referenced in the alert condition. 
	MonitorId interface{}
	// The title of this condition.
	Name interface{}
	// The ID of the policy where this condition should be used.
	PolicyId interface{}
	// Runbook URL to display in notifications.
	RunbookUrl interface{}
}
