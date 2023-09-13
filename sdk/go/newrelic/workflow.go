// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this resource to create and manage New Relic workflows.
//
// ## Example Usage
//
// ##### Workflow
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewWorkflow(ctx, "foo", &newrelic.WorkflowArgs{
//				MutingRulesHandling: pulumi.String("NOTIFY_ALL_ISSUES"),
//				IssuesFilter: &newrelic.WorkflowIssuesFilterArgs{
//					Name: pulumi.String("filter-name"),
//					Type: pulumi.String("FILTER"),
//					Predicates: newrelic.WorkflowIssuesFilterPredicateArray{
//						&newrelic.WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("accumulations.tag.team"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								pulumi.String("growth"),
//							},
//						},
//					},
//				},
//				Destinations: newrelic.WorkflowDestinationArray{
//					&newrelic.WorkflowDestinationArgs{
//						ChannelId: pulumi.Any(newrelic_notification_channel.Some_channel.Id),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Policy-Based Workflow Example
//
// # This scenario describes one of most common ways of using workflows by defining a set of policies the workflow handles
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewAlertPolicy(ctx, "my-policy", nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewNotificationDestination(ctx, "webhook-destination", &newrelic.NotificationDestinationArgs{
//				Type: pulumi.String("WEBHOOK"),
//				Properties: newrelic.NotificationDestinationPropertyArray{
//					&newrelic.NotificationDestinationPropertyArgs{
//						Key:   pulumi.String("url"),
//						Value: pulumi.String("https://example.com"),
//					},
//				},
//				AuthBasic: &newrelic.NotificationDestinationAuthBasicArgs{
//					User:     pulumi.String("username"),
//					Password: pulumi.String("password"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewNotificationChannel(ctx, "webhook-channel", &newrelic.NotificationChannelArgs{
//				Type:          pulumi.String("WEBHOOK"),
//				DestinationId: webhook_destination.ID(),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("payload"),
//						Value: pulumi.String("{}"),
//						Label: pulumi.String("Payload Template"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewWorkflow(ctx, "workflow-example", &newrelic.WorkflowArgs{
//				MutingRulesHandling: pulumi.String("NOTIFY_ALL_ISSUES"),
//				IssuesFilter: &newrelic.WorkflowIssuesFilterArgs{
//					Name: pulumi.String("Filter-name"),
//					Type: pulumi.String("FILTER"),
//					Predicates: newrelic.WorkflowIssuesFilterPredicateArray{
//						&newrelic.WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("labels.policyIds"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								my_policy.ID(),
//							},
//						},
//					},
//				},
//				Destinations: newrelic.WorkflowDestinationArray{
//					&newrelic.WorkflowDestinationArgs{
//						ChannelId: webhook_channel.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### An example of a workflow with enrichments
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewWorkflow(ctx, "workflow-example", &newrelic.WorkflowArgs{
//				MutingRulesHandling: pulumi.String("NOTIFY_ALL_ISSUES"),
//				IssuesFilter: &newrelic.WorkflowIssuesFilterArgs{
//					Name: pulumi.String("Filter-name"),
//					Type: pulumi.String("FILTER"),
//					Predicates: newrelic.WorkflowIssuesFilterPredicateArray{
//						&newrelic.WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("accumulations.tag.team"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								pulumi.String("my_team"),
//							},
//						},
//					},
//				},
//				Enrichments: &newrelic.WorkflowEnrichmentsArgs{
//					Nrqls: newrelic.WorkflowEnrichmentsNrqlArray{
//						&newrelic.WorkflowEnrichmentsNrqlArgs{
//							Name: pulumi.String("Log Count"),
//							Configurations: newrelic.WorkflowEnrichmentsNrqlConfigurationArray{
//								&newrelic.WorkflowEnrichmentsNrqlConfigurationArgs{
//									Query: pulumi.String("SELECT count(*) FROM Log WHERE message like '%error%' since 10 minutes ago"),
//								},
//							},
//						},
//					},
//				},
//				Destinations: newrelic.WorkflowDestinationArray{
//					&newrelic.WorkflowDestinationArgs{
//						ChannelId: pulumi.Any(newrelic_notification_channel.WebhookChannel.Id),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### An example of a workflow with notification triggers
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewWorkflow(ctx, "workflow-example", &newrelic.WorkflowArgs{
//				MutingRulesHandling: pulumi.String("NOTIFY_ALL_ISSUES"),
//				IssuesFilter: &newrelic.WorkflowIssuesFilterArgs{
//					Name: pulumi.String("Filter-name"),
//					Type: pulumi.String("FILTER"),
//					Predicates: newrelic.WorkflowIssuesFilterPredicateArray{
//						&newrelic.WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("accumulations.tag.team"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								pulumi.String("my_team"),
//							},
//						},
//					},
//				},
//				Destinations: newrelic.WorkflowDestinationArray{
//					&newrelic.WorkflowDestinationArgs{
//						ChannelId: pulumi.Any(newrelic_notification_channel.WebhookChannel.Id),
//						NotificationTriggers: pulumi.StringArray{
//							pulumi.String("ACTIVATED"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Additional Information
//
// More details about the workflows can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/applied-intelligence/incident-workflows/incident-workflows/).
//
// ## v3.3 changes
//
// In version v3.3 we renamed the following arguments:
//
// - `workflowEnabled` changed to `enabled`.
// - `destinationConfiguration` changed to `destination`.
// - `predicates` changed to `predicate`.
// - Enrichment's `configurations` changed to `configuration`.
//
// ## Import
//
// Workflows can be imported using the `id`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:index/workflow:Workflow foo <id>
//
// ```
//
//	You can find the workflow ID from the workflow table by clicking on ... at the end of the row and choosing `Copy workflow id to clipboard`.
type Workflow struct {
	pulumi.CustomResourceState

	// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Notification configuration. See Nested destination blocks below for details.
	Destinations WorkflowDestinationArrayOutput `pulumi:"destinations"`
	// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
	// these two are different flags, but they are functionally identical. Defaults to true.
	//
	// Deprecated: Please use 'enabled' instead
	DestinationsEnabled pulumi.BoolPtrOutput `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled. Defaults to true.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrOutput `pulumi:"enrichments"`
	// Whether enrichments are enabled. Defaults to true.
	EnrichmentsEnabled pulumi.BoolPtrOutput `pulumi:"enrichmentsEnabled"`
	// Workflow entity GUID
	Guid pulumi.StringOutput `pulumi:"guid"`
	// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterOutput `pulumi:"issuesFilter"`
	// The last time notification was sent for this workflow.
	LastRun pulumi.StringOutput `pulumi:"lastRun"`
	// How to handle muted issues. See Muting Rules below for details.
	MutingRulesHandling pulumi.StringOutput `pulumi:"mutingRulesHandling"`
	// The name of the workflow.
	Name pulumi.StringOutput `pulumi:"name"`
	// The id of the workflow.
	WorkflowId pulumi.StringOutput `pulumi:"workflowId"`
}

// NewWorkflow registers a new resource with the given unique name, arguments, and options.
func NewWorkflow(ctx *pulumi.Context,
	name string, args *WorkflowArgs, opts ...pulumi.ResourceOption) (*Workflow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destinations == nil {
		return nil, errors.New("invalid value for required argument 'Destinations'")
	}
	if args.IssuesFilter == nil {
		return nil, errors.New("invalid value for required argument 'IssuesFilter'")
	}
	if args.MutingRulesHandling == nil {
		return nil, errors.New("invalid value for required argument 'MutingRulesHandling'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Workflow
	err := ctx.RegisterResource("newrelic:index/workflow:Workflow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkflow gets an existing Workflow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkflow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkflowState, opts ...pulumi.ResourceOption) (*Workflow, error) {
	var resource Workflow
	err := ctx.ReadResource("newrelic:index/workflow:Workflow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workflow resources.
type workflowState struct {
	// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
	AccountId *int `pulumi:"accountId"`
	// Notification configuration. See Nested destination blocks below for details.
	Destinations []WorkflowDestination `pulumi:"destinations"`
	// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
	// these two are different flags, but they are functionally identical. Defaults to true.
	//
	// Deprecated: Please use 'enabled' instead
	DestinationsEnabled *bool `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// Workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments *WorkflowEnrichments `pulumi:"enrichments"`
	// Whether enrichments are enabled. Defaults to true.
	EnrichmentsEnabled *bool `pulumi:"enrichmentsEnabled"`
	// Workflow entity GUID
	Guid *string `pulumi:"guid"`
	// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
	IssuesFilter *WorkflowIssuesFilter `pulumi:"issuesFilter"`
	// The last time notification was sent for this workflow.
	LastRun *string `pulumi:"lastRun"`
	// How to handle muted issues. See Muting Rules below for details.
	MutingRulesHandling *string `pulumi:"mutingRulesHandling"`
	// The name of the workflow.
	Name *string `pulumi:"name"`
	// The id of the workflow.
	WorkflowId *string `pulumi:"workflowId"`
}

type WorkflowState struct {
	// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
	AccountId pulumi.IntPtrInput
	// Notification configuration. See Nested destination blocks below for details.
	Destinations WorkflowDestinationArrayInput
	// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
	// these two are different flags, but they are functionally identical. Defaults to true.
	//
	// Deprecated: Please use 'enabled' instead
	DestinationsEnabled pulumi.BoolPtrInput
	// Whether workflow is enabled. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// Workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrInput
	// Whether enrichments are enabled. Defaults to true.
	EnrichmentsEnabled pulumi.BoolPtrInput
	// Workflow entity GUID
	Guid pulumi.StringPtrInput
	// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterPtrInput
	// The last time notification was sent for this workflow.
	LastRun pulumi.StringPtrInput
	// How to handle muted issues. See Muting Rules below for details.
	MutingRulesHandling pulumi.StringPtrInput
	// The name of the workflow.
	Name pulumi.StringPtrInput
	// The id of the workflow.
	WorkflowId pulumi.StringPtrInput
}

func (WorkflowState) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowState)(nil)).Elem()
}

type workflowArgs struct {
	// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
	AccountId *int `pulumi:"accountId"`
	// Notification configuration. See Nested destination blocks below for details.
	Destinations []WorkflowDestination `pulumi:"destinations"`
	// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
	// these two are different flags, but they are functionally identical. Defaults to true.
	//
	// Deprecated: Please use 'enabled' instead
	DestinationsEnabled *bool `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// Workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments *WorkflowEnrichments `pulumi:"enrichments"`
	// Whether enrichments are enabled. Defaults to true.
	EnrichmentsEnabled *bool `pulumi:"enrichmentsEnabled"`
	// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilter `pulumi:"issuesFilter"`
	// How to handle muted issues. See Muting Rules below for details.
	MutingRulesHandling string `pulumi:"mutingRulesHandling"`
	// The name of the workflow.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Workflow resource.
type WorkflowArgs struct {
	// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
	AccountId pulumi.IntPtrInput
	// Notification configuration. See Nested destination blocks below for details.
	Destinations WorkflowDestinationArrayInput
	// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
	// these two are different flags, but they are functionally identical. Defaults to true.
	//
	// Deprecated: Please use 'enabled' instead
	DestinationsEnabled pulumi.BoolPtrInput
	// Whether workflow is enabled. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// Workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrInput
	// Whether enrichments are enabled. Defaults to true.
	EnrichmentsEnabled pulumi.BoolPtrInput
	// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterInput
	// How to handle muted issues. See Muting Rules below for details.
	MutingRulesHandling pulumi.StringInput
	// The name of the workflow.
	Name pulumi.StringPtrInput
}

func (WorkflowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowArgs)(nil)).Elem()
}

type WorkflowInput interface {
	pulumi.Input

	ToWorkflowOutput() WorkflowOutput
	ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput
}

func (*Workflow) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (i *Workflow) ToWorkflowOutput() WorkflowOutput {
	return i.ToWorkflowOutputWithContext(context.Background())
}

func (i *Workflow) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowOutput)
}

func (i *Workflow) ToOutput(ctx context.Context) pulumix.Output[*Workflow] {
	return pulumix.Output[*Workflow]{
		OutputState: i.ToWorkflowOutputWithContext(ctx).OutputState,
	}
}

// WorkflowArrayInput is an input type that accepts WorkflowArray and WorkflowArrayOutput values.
// You can construct a concrete instance of `WorkflowArrayInput` via:
//
//	WorkflowArray{ WorkflowArgs{...} }
type WorkflowArrayInput interface {
	pulumi.Input

	ToWorkflowArrayOutput() WorkflowArrayOutput
	ToWorkflowArrayOutputWithContext(context.Context) WorkflowArrayOutput
}

type WorkflowArray []WorkflowInput

func (WorkflowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
}

func (i WorkflowArray) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return i.ToWorkflowArrayOutputWithContext(context.Background())
}

func (i WorkflowArray) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowArrayOutput)
}

func (i WorkflowArray) ToOutput(ctx context.Context) pulumix.Output[[]*Workflow] {
	return pulumix.Output[[]*Workflow]{
		OutputState: i.ToWorkflowArrayOutputWithContext(ctx).OutputState,
	}
}

// WorkflowMapInput is an input type that accepts WorkflowMap and WorkflowMapOutput values.
// You can construct a concrete instance of `WorkflowMapInput` via:
//
//	WorkflowMap{ "key": WorkflowArgs{...} }
type WorkflowMapInput interface {
	pulumi.Input

	ToWorkflowMapOutput() WorkflowMapOutput
	ToWorkflowMapOutputWithContext(context.Context) WorkflowMapOutput
}

type WorkflowMap map[string]WorkflowInput

func (WorkflowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (i WorkflowMap) ToWorkflowMapOutput() WorkflowMapOutput {
	return i.ToWorkflowMapOutputWithContext(context.Background())
}

func (i WorkflowMap) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowMapOutput)
}

func (i WorkflowMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Workflow] {
	return pulumix.Output[map[string]*Workflow]{
		OutputState: i.ToWorkflowMapOutputWithContext(ctx).OutputState,
	}
}

type WorkflowOutput struct{ *pulumi.OutputState }

func (WorkflowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (o WorkflowOutput) ToWorkflowOutput() WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToOutput(ctx context.Context) pulumix.Output[*Workflow] {
	return pulumix.Output[*Workflow]{
		OutputState: o.OutputState,
	}
}

// Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
func (o WorkflowOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *Workflow) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Notification configuration. See Nested destination blocks below for details.
func (o WorkflowOutput) Destinations() WorkflowDestinationArrayOutput {
	return o.ApplyT(func(v *Workflow) WorkflowDestinationArrayOutput { return v.Destinations }).(WorkflowDestinationArrayOutput)
}

// **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
// these two are different flags, but they are functionally identical. Defaults to true.
//
// Deprecated: Please use 'enabled' instead
func (o WorkflowOutput) DestinationsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.DestinationsEnabled }).(pulumi.BoolPtrOutput)
}

// Whether workflow is enabled. Defaults to true.
func (o WorkflowOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Workflow's enrichments. See Nested enrichments blocks below for details.
func (o WorkflowOutput) Enrichments() WorkflowEnrichmentsPtrOutput {
	return o.ApplyT(func(v *Workflow) WorkflowEnrichmentsPtrOutput { return v.Enrichments }).(WorkflowEnrichmentsPtrOutput)
}

// Whether enrichments are enabled. Defaults to true.
func (o WorkflowOutput) EnrichmentsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.EnrichmentsEnabled }).(pulumi.BoolPtrOutput)
}

// Workflow entity GUID
func (o WorkflowOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// A filter used to identify issues handled by this workflow. See Nested issuesFilter blocks below for details.
func (o WorkflowOutput) IssuesFilter() WorkflowIssuesFilterOutput {
	return o.ApplyT(func(v *Workflow) WorkflowIssuesFilterOutput { return v.IssuesFilter }).(WorkflowIssuesFilterOutput)
}

// The last time notification was sent for this workflow.
func (o WorkflowOutput) LastRun() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.LastRun }).(pulumi.StringOutput)
}

// How to handle muted issues. See Muting Rules below for details.
func (o WorkflowOutput) MutingRulesHandling() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.MutingRulesHandling }).(pulumi.StringOutput)
}

// The name of the workflow.
func (o WorkflowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The id of the workflow.
func (o WorkflowOutput) WorkflowId() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.WorkflowId }).(pulumi.StringOutput)
}

type WorkflowArrayOutput struct{ *pulumi.OutputState }

func (WorkflowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Workflow] {
	return pulumix.Output[[]*Workflow]{
		OutputState: o.OutputState,
	}
}

func (o WorkflowArrayOutput) Index(i pulumi.IntInput) WorkflowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].([]*Workflow)[vs[1].(int)]
	}).(WorkflowOutput)
}

type WorkflowMapOutput struct{ *pulumi.OutputState }

func (WorkflowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (o WorkflowMapOutput) ToWorkflowMapOutput() WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Workflow] {
	return pulumix.Output[map[string]*Workflow]{
		OutputState: o.OutputState,
	}
}

func (o WorkflowMapOutput) MapIndex(k pulumi.StringInput) WorkflowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].(map[string]*Workflow)[vs[1].(string)]
	}).(WorkflowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowInput)(nil)).Elem(), &Workflow{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowArrayInput)(nil)).Elem(), WorkflowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowMapInput)(nil)).Elem(), WorkflowMap{})
	pulumi.RegisterOutputType(WorkflowOutput{})
	pulumi.RegisterOutputType(WorkflowArrayOutput{})
	pulumi.RegisterOutputType(WorkflowMapOutput{})
}
