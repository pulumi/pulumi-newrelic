// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// ## Terms
// 
// The `term` mapping supports the following arguments:
// 
//   * `duration` - (Required) In minutes, must be: `1`, `2`, `3`, `4`, `5`, `10`, `15`, `30`, `60`, or `120`.
//   * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
//   * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`.
//   * `threshold` - (Required) Must be 0 or greater.
//   * `timeFunction` - (Required) `all` or `any`.
// 
// ## NRQL
// 
// The `nrql` attribute supports the following arguments:
// 
//   * `query` - (Required) The NRQL query to execute for the condition.
//   * `sinceValue` - (Required) The value to be used in the `SINCE <X> MINUTES AGO` clause for the NRQL query. Must be between `1` and `20`.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/nrql_alert_condition.html.markdown.
type NrqlAlertCondition struct {
	s *pulumi.ResourceState
}

// NewNrqlAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewNrqlAlertCondition(ctx *pulumi.Context,
	name string, args *NrqlAlertConditionArgs, opts ...pulumi.ResourceOpt) (*NrqlAlertCondition, error) {
	if args == nil || args.Nrql == nil {
		return nil, errors.New("missing required argument 'Nrql'")
	}
	if args == nil || args.PolicyId == nil {
		return nil, errors.New("missing required argument 'PolicyId'")
	}
	if args == nil || args.Terms == nil {
		return nil, errors.New("missing required argument 'Terms'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["enabled"] = nil
		inputs["name"] = nil
		inputs["nrql"] = nil
		inputs["policyId"] = nil
		inputs["runbookUrl"] = nil
		inputs["terms"] = nil
		inputs["valueFunction"] = nil
	} else {
		inputs["enabled"] = args.Enabled
		inputs["name"] = args.Name
		inputs["nrql"] = args.Nrql
		inputs["policyId"] = args.PolicyId
		inputs["runbookUrl"] = args.RunbookUrl
		inputs["terms"] = args.Terms
		inputs["valueFunction"] = args.ValueFunction
	}
	s, err := ctx.RegisterResource("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NrqlAlertCondition{s: s}, nil
}

// GetNrqlAlertCondition gets an existing NrqlAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNrqlAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.ID, state *NrqlAlertConditionState, opts ...pulumi.ResourceOpt) (*NrqlAlertCondition, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["enabled"] = state.Enabled
		inputs["name"] = state.Name
		inputs["nrql"] = state.Nrql
		inputs["policyId"] = state.PolicyId
		inputs["runbookUrl"] = state.RunbookUrl
		inputs["terms"] = state.Terms
		inputs["valueFunction"] = state.ValueFunction
	}
	s, err := ctx.ReadResource("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NrqlAlertCondition{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *NrqlAlertCondition) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *NrqlAlertCondition) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// Set whether to enable the alert condition. Defaults to `true`.
func (r *NrqlAlertCondition) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

// The title of the condition
func (r *NrqlAlertCondition) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A NRQL query. See NRQL below for details.
func (r *NrqlAlertCondition) Nrql() *pulumi.Output {
	return r.s.State["nrql"]
}

// The ID of the policy where this condition should be used.
func (r *NrqlAlertCondition) PolicyId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["policyId"])
}

// Runbook URL to display in notifications.
func (r *NrqlAlertCondition) RunbookUrl() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["runbookUrl"])
}

// A list of terms for this condition. See Terms below for details.
func (r *NrqlAlertCondition) Terms() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["terms"])
}

// Possible values are `singleValue`, `sum`.
func (r *NrqlAlertCondition) ValueFunction() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["valueFunction"])
}

// Input properties used for looking up and filtering NrqlAlertCondition resources.
type NrqlAlertConditionState struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The title of the condition
	Name interface{}
	// A NRQL query. See NRQL below for details.
	Nrql interface{}
	// The ID of the policy where this condition should be used.
	PolicyId interface{}
	// Runbook URL to display in notifications.
	RunbookUrl interface{}
	// A list of terms for this condition. See Terms below for details.
	Terms interface{}
	// Possible values are `singleValue`, `sum`.
	ValueFunction interface{}
}

// The set of arguments for constructing a NrqlAlertCondition resource.
type NrqlAlertConditionArgs struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled interface{}
	// The title of the condition
	Name interface{}
	// A NRQL query. See NRQL below for details.
	Nrql interface{}
	// The ID of the policy where this condition should be used.
	PolicyId interface{}
	// Runbook URL to display in notifications.
	RunbookUrl interface{}
	// A list of terms for this condition. See Terms below for details.
	Terms interface{}
	// Possible values are `singleValue`, `sum`.
	ValueFunction interface{}
}
