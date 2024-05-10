// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage New Relic alert channels.
//
// > **WARNING:** The `AlertChannel` resource is deprecated and will be removed in the next major release. For managing channel resources in Workflows, use `NotificationChannel`.
//
// ## Example Usage
//
// ### Email
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("foo"),
//				Type: pulumi.String("email"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					Recipients:            pulumi.String("foo@example.com"),
//					IncludeJsonAttachment: pulumi.String("true"),
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
// ## Additional Examples
//
// ##### Slack
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("slack-example"),
//				Type: pulumi.String("slack"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					Url:     pulumi.String("https://hooks.slack.com/services/XXXXXXX/XXXXXXX/XXXXXXXXXX"),
//					Channel: pulumi.String("example-alerts-channel"),
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
// > **NOTE:** For instructions on setting up Webhooks with Slack, please visit the article linked under the argument `slack` in the aforementioned configuration, or [this article](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/alert-notifications/notification-channels-control-where-send-alerts/#slack) in New Relic's docs for additional details on setting up the `New Relic Alerts` Slack application, and subsequently using the generated Webhook URL.
//
// ### OpsGenie
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("opsgenie-example"),
//				Type: pulumi.String("opsgenie"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					ApiKey:     pulumi.String("abc123"),
//					Teams:      pulumi.String("team1, team2"),
//					Tags:       pulumi.String("tag1, tag2"),
//					Recipients: pulumi.String("user1@domain.com, user2@domain.com"),
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
// ### PagerDuty
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("pagerduty-example"),
//				Type: pulumi.String("pagerduty"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					ServiceKey: pulumi.String("abc123"),
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
// ### VictorOps
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("victorops-example"),
//				Type: pulumi.String("victorops"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					Key:      pulumi.String("abc123"),
//					RouteKey: pulumi.String("/example"),
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
// ### Webhook
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("webhook-example"),
//				Type: pulumi.String("webhook"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					BaseUrl:     pulumi.String("http://www.test.com"),
//					PayloadType: pulumi.String("application/json"),
//					Payload: pulumi.StringMap{
//						"condition_name": pulumi.String("$CONDITION_NAME"),
//						"policy_name":    pulumi.String("$POLICY_NAME"),
//					},
//					Headers: pulumi.StringMap{
//						"header1": pulumi.Any(value1),
//						"header2": pulumi.Any(value2),
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
// ### Webhook with complex payload
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
//			_, err := newrelic.NewAlertChannel(ctx, "foo", &newrelic.AlertChannelArgs{
//				Name: pulumi.String("webhook-example"),
//				Type: pulumi.String("webhook"),
//				Config: &newrelic.AlertChannelConfigArgs{
//					BaseUrl:     pulumi.String("http://www.test.com"),
//					PayloadType: pulumi.String("application/json"),
//					PayloadString: pulumi.String(`{
//	  "my_custom_values": {
//	    "condition_name": "$CONDITION_NAME",
//	    "policy_name": "$POLICY_NAME"
//	  }
//	}
//
// `),
//
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
// ## Import
//
// Alert channels can be imported using the `id`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/alertChannel:AlertChannel main <id>
// ```
type AlertChannel struct {
	pulumi.CustomResourceState

	// The New Relic account ID where you want to create alert channels.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The configuration block for the alert channel.
	Config AlertChannelConfigPtrOutput `pulumi:"config"`
	// (Required) The name of the channel.
	Name pulumi.StringOutput `pulumi:"name"`
	// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAlertChannel registers a new resource with the given unique name, arguments, and options.
func NewAlertChannel(ctx *pulumi.Context,
	name string, args *AlertChannelArgs, opts ...pulumi.ResourceOption) (*AlertChannel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AlertChannel
	err := ctx.RegisterResource("newrelic:index/alertChannel:AlertChannel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertChannel gets an existing AlertChannel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertChannel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertChannelState, opts ...pulumi.ResourceOption) (*AlertChannel, error) {
	var resource AlertChannel
	err := ctx.ReadResource("newrelic:index/alertChannel:AlertChannel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertChannel resources.
type alertChannelState struct {
	// The New Relic account ID where you want to create alert channels.
	AccountId *string `pulumi:"accountId"`
	// The configuration block for the alert channel.
	Config *AlertChannelConfig `pulumi:"config"`
	// (Required) The name of the channel.
	Name *string `pulumi:"name"`
	// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
	Type *string `pulumi:"type"`
}

type AlertChannelState struct {
	// The New Relic account ID where you want to create alert channels.
	AccountId pulumi.StringPtrInput
	// The configuration block for the alert channel.
	Config AlertChannelConfigPtrInput
	// (Required) The name of the channel.
	Name pulumi.StringPtrInput
	// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
	Type pulumi.StringPtrInput
}

func (AlertChannelState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertChannelState)(nil)).Elem()
}

type alertChannelArgs struct {
	// The New Relic account ID where you want to create alert channels.
	AccountId *string `pulumi:"accountId"`
	// The configuration block for the alert channel.
	Config *AlertChannelConfig `pulumi:"config"`
	// (Required) The name of the channel.
	Name *string `pulumi:"name"`
	// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a AlertChannel resource.
type AlertChannelArgs struct {
	// The New Relic account ID where you want to create alert channels.
	AccountId pulumi.StringPtrInput
	// The configuration block for the alert channel.
	Config AlertChannelConfigPtrInput
	// (Required) The name of the channel.
	Name pulumi.StringPtrInput
	// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
	Type pulumi.StringInput
}

func (AlertChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertChannelArgs)(nil)).Elem()
}

type AlertChannelInput interface {
	pulumi.Input

	ToAlertChannelOutput() AlertChannelOutput
	ToAlertChannelOutputWithContext(ctx context.Context) AlertChannelOutput
}

func (*AlertChannel) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertChannel)(nil)).Elem()
}

func (i *AlertChannel) ToAlertChannelOutput() AlertChannelOutput {
	return i.ToAlertChannelOutputWithContext(context.Background())
}

func (i *AlertChannel) ToAlertChannelOutputWithContext(ctx context.Context) AlertChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertChannelOutput)
}

// AlertChannelArrayInput is an input type that accepts AlertChannelArray and AlertChannelArrayOutput values.
// You can construct a concrete instance of `AlertChannelArrayInput` via:
//
//	AlertChannelArray{ AlertChannelArgs{...} }
type AlertChannelArrayInput interface {
	pulumi.Input

	ToAlertChannelArrayOutput() AlertChannelArrayOutput
	ToAlertChannelArrayOutputWithContext(context.Context) AlertChannelArrayOutput
}

type AlertChannelArray []AlertChannelInput

func (AlertChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertChannel)(nil)).Elem()
}

func (i AlertChannelArray) ToAlertChannelArrayOutput() AlertChannelArrayOutput {
	return i.ToAlertChannelArrayOutputWithContext(context.Background())
}

func (i AlertChannelArray) ToAlertChannelArrayOutputWithContext(ctx context.Context) AlertChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertChannelArrayOutput)
}

// AlertChannelMapInput is an input type that accepts AlertChannelMap and AlertChannelMapOutput values.
// You can construct a concrete instance of `AlertChannelMapInput` via:
//
//	AlertChannelMap{ "key": AlertChannelArgs{...} }
type AlertChannelMapInput interface {
	pulumi.Input

	ToAlertChannelMapOutput() AlertChannelMapOutput
	ToAlertChannelMapOutputWithContext(context.Context) AlertChannelMapOutput
}

type AlertChannelMap map[string]AlertChannelInput

func (AlertChannelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertChannel)(nil)).Elem()
}

func (i AlertChannelMap) ToAlertChannelMapOutput() AlertChannelMapOutput {
	return i.ToAlertChannelMapOutputWithContext(context.Background())
}

func (i AlertChannelMap) ToAlertChannelMapOutputWithContext(ctx context.Context) AlertChannelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertChannelMapOutput)
}

type AlertChannelOutput struct{ *pulumi.OutputState }

func (AlertChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertChannel)(nil)).Elem()
}

func (o AlertChannelOutput) ToAlertChannelOutput() AlertChannelOutput {
	return o
}

func (o AlertChannelOutput) ToAlertChannelOutputWithContext(ctx context.Context) AlertChannelOutput {
	return o
}

// The New Relic account ID where you want to create alert channels.
func (o AlertChannelOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertChannel) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The configuration block for the alert channel.
func (o AlertChannelOutput) Config() AlertChannelConfigPtrOutput {
	return o.ApplyT(func(v *AlertChannel) AlertChannelConfigPtrOutput { return v.Config }).(AlertChannelConfigPtrOutput)
}

// (Required) The name of the channel.
func (o AlertChannelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertChannel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Required) The type of channel. One of: (email, opsgenie, pagerduty, slack, user, victorops, webhook).
func (o AlertChannelOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertChannel) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AlertChannelArrayOutput struct{ *pulumi.OutputState }

func (AlertChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertChannel)(nil)).Elem()
}

func (o AlertChannelArrayOutput) ToAlertChannelArrayOutput() AlertChannelArrayOutput {
	return o
}

func (o AlertChannelArrayOutput) ToAlertChannelArrayOutputWithContext(ctx context.Context) AlertChannelArrayOutput {
	return o
}

func (o AlertChannelArrayOutput) Index(i pulumi.IntInput) AlertChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertChannel {
		return vs[0].([]*AlertChannel)[vs[1].(int)]
	}).(AlertChannelOutput)
}

type AlertChannelMapOutput struct{ *pulumi.OutputState }

func (AlertChannelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertChannel)(nil)).Elem()
}

func (o AlertChannelMapOutput) ToAlertChannelMapOutput() AlertChannelMapOutput {
	return o
}

func (o AlertChannelMapOutput) ToAlertChannelMapOutputWithContext(ctx context.Context) AlertChannelMapOutput {
	return o
}

func (o AlertChannelMapOutput) MapIndex(k pulumi.StringInput) AlertChannelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertChannel {
		return vs[0].(map[string]*AlertChannel)[vs[1].(string)]
	}).(AlertChannelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertChannelInput)(nil)).Elem(), &AlertChannel{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertChannelArrayInput)(nil)).Elem(), AlertChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertChannelMapInput)(nil)).Elem(), AlertChannelMap{})
	pulumi.RegisterOutputType(AlertChannelOutput{})
	pulumi.RegisterOutputType(AlertChannelArrayOutput{})
	pulumi.RegisterOutputType(AlertChannelMapOutput{})
}
