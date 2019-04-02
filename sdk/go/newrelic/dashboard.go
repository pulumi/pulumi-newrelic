// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// ## Widgets
// 
// The `widget` mapping supports the following arguments:
// 
//   * `title` - (Required) A title for the widget.
//   * `visualization` - (Required) How the widget visualizes data.
//   * `row` - (Required) Row position of widget from top left, starting at `1`.
//   * `column` - (Required) Column position of widget from top left, starting at `1`.
//   * `width` - (Optional) Width of the widget. Defaults to `1`.
//   * `height` - (Optional) Height of the widget. Defaults to `1`.
//   * `notes` - (Optional) Description of the widget.
//   * `nrql` - (Optional) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
type Dashboard struct {
	s *pulumi.ResourceState
}

// NewDashboard registers a new resource with the given unique name, arguments, and options.
func NewDashboard(ctx *pulumi.Context,
	name string, args *DashboardArgs, opts ...pulumi.ResourceOpt) (*Dashboard, error) {
	if args == nil || args.Title == nil {
		return nil, errors.New("missing required argument 'Title'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["editable"] = nil
		inputs["filter"] = nil
		inputs["icon"] = nil
		inputs["title"] = nil
		inputs["visibility"] = nil
		inputs["widgets"] = nil
	} else {
		inputs["editable"] = args.Editable
		inputs["filter"] = args.Filter
		inputs["icon"] = args.Icon
		inputs["title"] = args.Title
		inputs["visibility"] = args.Visibility
		inputs["widgets"] = args.Widgets
	}
	inputs["dashboardUrl"] = nil
	s, err := ctx.RegisterResource("newrelic:index/dashboard:Dashboard", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Dashboard{s: s}, nil
}

// GetDashboard gets an existing Dashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDashboard(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DashboardState, opts ...pulumi.ResourceOpt) (*Dashboard, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["dashboardUrl"] = state.DashboardUrl
		inputs["editable"] = state.Editable
		inputs["filter"] = state.Filter
		inputs["icon"] = state.Icon
		inputs["title"] = state.Title
		inputs["visibility"] = state.Visibility
		inputs["widgets"] = state.Widgets
	}
	s, err := ctx.ReadResource("newrelic:index/dashboard:Dashboard", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Dashboard{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Dashboard) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Dashboard) ID() *pulumi.IDOutput {
	return r.s.ID()
}

func (r *Dashboard) DashboardUrl() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["dashboardUrl"])
}

// Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
func (r *Dashboard) Editable() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["editable"])
}

func (r *Dashboard) Filter() *pulumi.Output {
	return r.s.State["filter"]
}

// The icon for the dashboard.  Defaults to `bar-chart`.
func (r *Dashboard) Icon() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["icon"])
}

// The title of the dashboard.
func (r *Dashboard) Title() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["title"])
}

// Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
func (r *Dashboard) Visibility() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["visibility"])
}

// A widget that describes a visualization. See Widgets below for details.
func (r *Dashboard) Widgets() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["widgets"])
}

// Input properties used for looking up and filtering Dashboard resources.
type DashboardState struct {
	DashboardUrl interface{}
	// Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
	Editable interface{}
	Filter interface{}
	// The icon for the dashboard.  Defaults to `bar-chart`.
	Icon interface{}
	// The title of the dashboard.
	Title interface{}
	// Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
	Visibility interface{}
	// A widget that describes a visualization. See Widgets below for details.
	Widgets interface{}
}

// The set of arguments for constructing a Dashboard resource.
type DashboardArgs struct {
	// Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
	Editable interface{}
	Filter interface{}
	// The icon for the dashboard.  Defaults to `bar-chart`.
	Icon interface{}
	// The title of the dashboard.
	Title interface{}
	// Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
	Visibility interface{}
	// A widget that describes a visualization. See Widgets below for details.
	Widgets interface{}
}
