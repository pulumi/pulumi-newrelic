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

// Use this resource to create and manage New Relic notification channels. Details regarding supported products and permissions can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/notifications/destinations).
//
// A channel is an entity that is used to configure notifications. It is also called a message template. It is a separate entity from workflows, but a channel is required in order to create a workflow.
//
// ## Example Usage
//
// ##### [Webhook](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#webhook)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("payload"),
//						Label: pulumi.String("Payload Template"),
//						Value: pulumi.String("name: {{ foo }}"),
//					},
//				},
//				Type: pulumi.String("WEBHOOK"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
// See additional examples.
//
// ## Additional Examples
//
// > **NOTE:** We support all properties. The mentioned properties are just an example.
//
// ##### [ServiceNow](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenow)
// To see the properties’ keys for your account, check ServiceNow incidents table.
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("description"),
//						Value: pulumi.String("General description"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("short_description"),
//						Value: pulumi.String("Short description"),
//					},
//				},
//				Type: pulumi.String("SERVICENOW_INCIDENTS"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ##### [Email](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#email)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("subject"),
//						Value: pulumi.String("New Subject Title"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("customDetailsEmail"),
//						Value: pulumi.String("issue id - {{issueId}}"),
//					},
//				},
//				Type: pulumi.String("EMAIL"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ##### [Jira Classic](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#jira)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("ERROR_TRACKING"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("project"),
//						Value: pulumi.String("10000"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("issuetype"),
//						Value: pulumi.String("10004"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("description"),
//						Value: pulumi.String("Issue ID: {{ issueId }}"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("summary"),
//						Value: pulumi.String("{{ annotations.title.[0] }}"),
//					},
//				},
//				Type: pulumi.String("JIRA_CLASSIC"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ##### [PagerDuty with account integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("summary"),
//						Value: pulumi.String("General summary"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("service"),
//						Label: pulumi.String("Service Name"),
//						Value: pulumi.String("PTQK3FM"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("email"),
//						Value: pulumi.String("example@email.com"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key: pulumi.String("customDetails"),
//						Value: pulumi.String(`    {
//	    "id":{{json issueId}},
//	    "IssueURL":{{json issuePageUrl}},
//	    "NewRelic priority":{{json priority}},
//	    "Total Incidents":{{json totalIncidents}},
//	    "Impacted Entities":"{{#each entitiesData.names}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Runbook":"{{#each accumulations.runbookUrl}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Description":"{{#each annotations.description}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "isCorrelated":{{json isCorrelated}},
//	    "Alert Policy Names":"{{#each accumulations.policyName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Alert Condition Names":"{{#each accumulations.conditionName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Workflow Name":{{json workflowName}}
//	    }
//
// `),
//
//					},
//				},
//				Type: pulumi.String("PAGERDUTY_ACCOUNT_INTEGRATION"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ##### [PagerDuty with service integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("summary"),
//						Value: pulumi.String("General summary"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key: pulumi.String("customDetails"),
//						Value: pulumi.String(`    {
//	    "id":{{json issueId}},
//	    "IssueURL":{{json issuePageUrl}},
//	    "NewRelic priority":{{json priority}},
//	    "Total Incidents":{{json totalIncidents}},
//	    "Impacted Entities":"{{#each entitiesData.names}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Runbook":"{{#each accumulations.runbookUrl}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Description":"{{#each annotations.description}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "isCorrelated":{{json isCorrelated}},
//	    "Alert Policy Names":"{{#each accumulations.policyName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Alert Condition Names":"{{#each accumulations.conditionName}}{{this}}{{#unless @last}}, {{/unless}}{{/each}}",
//	    "Workflow Name":{{json workflowName}}
//	    }
//
// `),
//
//					},
//				},
//				Type: pulumi.String("PAGERDUTY_SERVICE_INTEGRATION"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// #### Mobile Push
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Type:          pulumi.String("MOBILE_PUSH"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// #### [AWS Event Bridge](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#eventBridge)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("eventSource"),
//						Value: pulumi.String("aws.partner/mydomain/myaccountid/name"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("eventContent"),
//						Value: pulumi.String("{ id: {{ json issueId }} }"),
//					},
//				},
//				Type: pulumi.String("EVENT_BRIDGE"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// #### [SLACK](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#slack)
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "foo", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				DestinationId: pulumi.String("00b6bd1d-ac06-4d3d-bd72-49551e70f7a8"),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("channelId"),
//						Value: pulumi.String("123456"),
//					},
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("customDetailsSlack"),
//						Value: pulumi.String("issue id - {{issueId}}"),
//					},
//				},
//				Type: pulumi.String("SLACK"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// > **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
//
// ## Full Scenario Example
//
// Create a destination resource and reference that destination to the channel resource:
//
// ### Create a destination
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationDestination(ctx, "webhook-destination", &newrelic.NotificationDestinationArgs{
//				AccountId: pulumi.String("12345678"),
//				AuthBasic: &newrelic.NotificationDestinationAuthBasicArgs{
//					Password: pulumi.String("password"),
//					User:     pulumi.String("username"),
//				},
//				Properties: newrelic.NotificationDestinationPropertyArray{
//					&newrelic.NotificationDestinationPropertyArgs{
//						Key:   pulumi.String("url"),
//						Value: pulumi.String("https://webhook.mywebhook.com"),
//					},
//				},
//				Type: pulumi.String("WEBHOOK"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Create a channel
// <!--Start PulumiCodeChooser -->
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
//			_, err := newrelic.NewNotificationChannel(ctx, "webhook-channel", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.String("12345678"),
//				Type:          pulumi.String("WEBHOOK"),
//				DestinationId: pulumi.Any(newrelic_notification_destination.WebhookDestination.Id),
//				Product:       pulumi.String("IINT"),
//				Properties: newrelic.NotificationChannelPropertyArray{
//					&newrelic.NotificationChannelPropertyArgs{
//						Key:   pulumi.String("payload"),
//						Value: pulumi.String("{name: foo}"),
//						Label: pulumi.String("Payload Template"),
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
// <!--End PulumiCodeChooser -->
//
// ## Additional Information
//
// More details about the channels API can be found [here](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels).
//
// > **NOTE:** `AlertChannel` are legacy resources.
//
// ## Import
//
// Channels can only be used by a single workflow, therefore importing them is not particularly useful, because in the UI channels are created upon workflow creation.
//
// Additionally, the channel id isn't available via the UI, and you'd need to look it up with the `channels` query in the NerdGraph API.
//
// That being said, importing is possible using -
//
// ```sh
// $ pulumi import newrelic:index/notificationChannel:NotificationChannel foo <destination_id>
// ```
type NotificationChannel struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Indicates whether the channel is active.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// The id of the destination.
	DestinationId pulumi.StringOutput `pulumi:"destinationId"`
	// The name of the channel.
	Name pulumi.StringOutput `pulumi:"name"`
	// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
	Product pulumi.StringOutput `pulumi:"product"`
	// A nested block that describes a notification channel property. See Nested property blocks below for details.
	Properties NotificationChannelPropertyArrayOutput `pulumi:"properties"`
	// The status of the channel.
	Status pulumi.StringOutput `pulumi:"status"`
	// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewNotificationChannel registers a new resource with the given unique name, arguments, and options.
func NewNotificationChannel(ctx *pulumi.Context,
	name string, args *NotificationChannelArgs, opts ...pulumi.ResourceOption) (*NotificationChannel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationId'")
	}
	if args.Product == nil {
		return nil, errors.New("invalid value for required argument 'Product'")
	}
	if args.Properties == nil {
		return nil, errors.New("invalid value for required argument 'Properties'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationChannel
	err := ctx.RegisterResource("newrelic:index/notificationChannel:NotificationChannel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationChannel gets an existing NotificationChannel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationChannel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationChannelState, opts ...pulumi.ResourceOption) (*NotificationChannel, error) {
	var resource NotificationChannel
	err := ctx.ReadResource("newrelic:index/notificationChannel:NotificationChannel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationChannel resources.
type notificationChannelState struct {
	// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
	AccountId *string `pulumi:"accountId"`
	// Indicates whether the channel is active.
	Active *bool `pulumi:"active"`
	// The id of the destination.
	DestinationId *string `pulumi:"destinationId"`
	// The name of the channel.
	Name *string `pulumi:"name"`
	// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
	Product *string `pulumi:"product"`
	// A nested block that describes a notification channel property. See Nested property blocks below for details.
	Properties []NotificationChannelProperty `pulumi:"properties"`
	// The status of the channel.
	Status *string `pulumi:"status"`
	// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
	Type *string `pulumi:"type"`
}

type NotificationChannelState struct {
	// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringPtrInput
	// Indicates whether the channel is active.
	Active pulumi.BoolPtrInput
	// The id of the destination.
	DestinationId pulumi.StringPtrInput
	// The name of the channel.
	Name pulumi.StringPtrInput
	// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
	Product pulumi.StringPtrInput
	// A nested block that describes a notification channel property. See Nested property blocks below for details.
	Properties NotificationChannelPropertyArrayInput
	// The status of the channel.
	Status pulumi.StringPtrInput
	// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
	Type pulumi.StringPtrInput
}

func (NotificationChannelState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationChannelState)(nil)).Elem()
}

type notificationChannelArgs struct {
	// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
	AccountId *string `pulumi:"accountId"`
	// Indicates whether the channel is active.
	Active *bool `pulumi:"active"`
	// The id of the destination.
	DestinationId string `pulumi:"destinationId"`
	// The name of the channel.
	Name *string `pulumi:"name"`
	// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
	Product string `pulumi:"product"`
	// A nested block that describes a notification channel property. See Nested property blocks below for details.
	Properties []NotificationChannelProperty `pulumi:"properties"`
	// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a NotificationChannel resource.
type NotificationChannelArgs struct {
	// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.StringPtrInput
	// Indicates whether the channel is active.
	Active pulumi.BoolPtrInput
	// The id of the destination.
	DestinationId pulumi.StringInput
	// The name of the channel.
	Name pulumi.StringPtrInput
	// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
	Product pulumi.StringInput
	// A nested block that describes a notification channel property. See Nested property blocks below for details.
	Properties NotificationChannelPropertyArrayInput
	// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
	Type pulumi.StringInput
}

func (NotificationChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationChannelArgs)(nil)).Elem()
}

type NotificationChannelInput interface {
	pulumi.Input

	ToNotificationChannelOutput() NotificationChannelOutput
	ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput
}

func (*NotificationChannel) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationChannel)(nil)).Elem()
}

func (i *NotificationChannel) ToNotificationChannelOutput() NotificationChannelOutput {
	return i.ToNotificationChannelOutputWithContext(context.Background())
}

func (i *NotificationChannel) ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelOutput)
}

// NotificationChannelArrayInput is an input type that accepts NotificationChannelArray and NotificationChannelArrayOutput values.
// You can construct a concrete instance of `NotificationChannelArrayInput` via:
//
//	NotificationChannelArray{ NotificationChannelArgs{...} }
type NotificationChannelArrayInput interface {
	pulumi.Input

	ToNotificationChannelArrayOutput() NotificationChannelArrayOutput
	ToNotificationChannelArrayOutputWithContext(context.Context) NotificationChannelArrayOutput
}

type NotificationChannelArray []NotificationChannelInput

func (NotificationChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationChannel)(nil)).Elem()
}

func (i NotificationChannelArray) ToNotificationChannelArrayOutput() NotificationChannelArrayOutput {
	return i.ToNotificationChannelArrayOutputWithContext(context.Background())
}

func (i NotificationChannelArray) ToNotificationChannelArrayOutputWithContext(ctx context.Context) NotificationChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelArrayOutput)
}

// NotificationChannelMapInput is an input type that accepts NotificationChannelMap and NotificationChannelMapOutput values.
// You can construct a concrete instance of `NotificationChannelMapInput` via:
//
//	NotificationChannelMap{ "key": NotificationChannelArgs{...} }
type NotificationChannelMapInput interface {
	pulumi.Input

	ToNotificationChannelMapOutput() NotificationChannelMapOutput
	ToNotificationChannelMapOutputWithContext(context.Context) NotificationChannelMapOutput
}

type NotificationChannelMap map[string]NotificationChannelInput

func (NotificationChannelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationChannel)(nil)).Elem()
}

func (i NotificationChannelMap) ToNotificationChannelMapOutput() NotificationChannelMapOutput {
	return i.ToNotificationChannelMapOutputWithContext(context.Background())
}

func (i NotificationChannelMap) ToNotificationChannelMapOutputWithContext(ctx context.Context) NotificationChannelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationChannelMapOutput)
}

type NotificationChannelOutput struct{ *pulumi.OutputState }

func (NotificationChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelOutput) ToNotificationChannelOutput() NotificationChannelOutput {
	return o
}

func (o NotificationChannelOutput) ToNotificationChannelOutputWithContext(ctx context.Context) NotificationChannelOutput {
	return o
}

// Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
func (o NotificationChannelOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Indicates whether the channel is active.
func (o NotificationChannelOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// The id of the destination.
func (o NotificationChannelOutput) DestinationId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.DestinationId }).(pulumi.StringOutput)
}

// The name of the channel.
func (o NotificationChannelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
func (o NotificationChannelOutput) Product() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Product }).(pulumi.StringOutput)
}

// A nested block that describes a notification channel property. See Nested property blocks below for details.
func (o NotificationChannelOutput) Properties() NotificationChannelPropertyArrayOutput {
	return o.ApplyT(func(v *NotificationChannel) NotificationChannelPropertyArrayOutput { return v.Properties }).(NotificationChannelPropertyArrayOutput)
}

// The status of the channel.
func (o NotificationChannelOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
func (o NotificationChannelOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationChannel) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type NotificationChannelArrayOutput struct{ *pulumi.OutputState }

func (NotificationChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelArrayOutput) ToNotificationChannelArrayOutput() NotificationChannelArrayOutput {
	return o
}

func (o NotificationChannelArrayOutput) ToNotificationChannelArrayOutputWithContext(ctx context.Context) NotificationChannelArrayOutput {
	return o
}

func (o NotificationChannelArrayOutput) Index(i pulumi.IntInput) NotificationChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationChannel {
		return vs[0].([]*NotificationChannel)[vs[1].(int)]
	}).(NotificationChannelOutput)
}

type NotificationChannelMapOutput struct{ *pulumi.OutputState }

func (NotificationChannelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationChannel)(nil)).Elem()
}

func (o NotificationChannelMapOutput) ToNotificationChannelMapOutput() NotificationChannelMapOutput {
	return o
}

func (o NotificationChannelMapOutput) ToNotificationChannelMapOutputWithContext(ctx context.Context) NotificationChannelMapOutput {
	return o
}

func (o NotificationChannelMapOutput) MapIndex(k pulumi.StringInput) NotificationChannelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationChannel {
		return vs[0].(map[string]*NotificationChannel)[vs[1].(string)]
	}).(NotificationChannelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelInput)(nil)).Elem(), &NotificationChannel{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelArrayInput)(nil)).Elem(), NotificationChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationChannelMapInput)(nil)).Elem(), NotificationChannelMap{})
	pulumi.RegisterOutputType(NotificationChannelOutput{})
	pulumi.RegisterOutputType(NotificationChannelArrayOutput{})
	pulumi.RegisterOutputType(NotificationChannelMapOutput{})
}
