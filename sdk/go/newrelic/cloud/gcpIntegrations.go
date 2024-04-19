// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to integrate GCP services with New Relic.
//
// ## Prerequisite
//
// Setup is required for this resource to work properly. This resource assumes you have linked a GCP account to New Relic and configured it to pull metrics from GCP.
//
// New Relic doesn't automatically receive metrics from GCP services, so this resource can be used to configure integrations to those services.
//
// ## Example Usage
//
// Leave an integration block empty to use its default configuration. You can also use the full example, including the GCP set up, found in our guides.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/cloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo, err := cloud.NewGcpLinkAccount(ctx, "foo", &cloud.GcpLinkAccountArgs{
//				Name:      pulumi.String("example"),
//				ProjectId: pulumi.String("<Your GCP project ID>"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloud.NewGcpIntegrations(ctx, "foo1", &cloud.GcpIntegrationsArgs{
//				LinkedAccountId: foo.ID(),
//				AppEngine: &cloud.GcpIntegrationsAppEngineArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				BigQuery: &cloud.GcpIntegrationsBigQueryArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//					FetchTags:              pulumi.Bool(true),
//				},
//				BigTable: &cloud.GcpIntegrationsBigTableArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Composer: &cloud.GcpIntegrationsComposerArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				DataFlow: &cloud.GcpIntegrationsDataFlowArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				DataProc: &cloud.GcpIntegrationsDataProcArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				DataStore: &cloud.GcpIntegrationsDataStoreArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				FireBaseDatabase: &cloud.GcpIntegrationsFireBaseDatabaseArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				FireBaseHosting: &cloud.GcpIntegrationsFireBaseHostingArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				FireBaseStorage: &cloud.GcpIntegrationsFireBaseStorageArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				FireStore: &cloud.GcpIntegrationsFireStoreArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Functions: &cloud.GcpIntegrationsFunctionsArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Interconnect: &cloud.GcpIntegrationsInterconnectArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Kubernetes: &cloud.GcpIntegrationsKubernetesArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				LoadBalancing: &cloud.GcpIntegrationsLoadBalancingArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				MemCache: &cloud.GcpIntegrationsMemCacheArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				PubSub: &cloud.GcpIntegrationsPubSubArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//					FetchTags:              pulumi.Bool(true),
//				},
//				Redis: &cloud.GcpIntegrationsRedisArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Router: &cloud.GcpIntegrationsRouterArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Run: &cloud.GcpIntegrationsRunArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Spanner: &cloud.GcpIntegrationsSpannerArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//					FetchTags:              pulumi.Bool(true),
//				},
//				Sql: &cloud.GcpIntegrationsSqlArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				Storage: &cloud.GcpIntegrationsStorageArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//					FetchTags:              pulumi.Bool(true),
//				},
//				VirtualMachines: &cloud.GcpIntegrationsVirtualMachinesArgs{
//					MetricsPollingInterval: pulumi.Int(400),
//				},
//				VpcAccess: &cloud.GcpIntegrationsVpcAccessArgs{
//					MetricsPollingInterval: pulumi.Int(400),
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
// ## Import
//
// Linked GCP account integrations can be imported using the `id`, e.g.
//
// bash
//
// ```sh
// $ pulumi import newrelic:cloud/gcpIntegrations:GcpIntegrations foo <id>
// ```
type GcpIntegrations struct {
	pulumi.CustomResourceState

	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Alloy DB integration. See Integration blocks below for details.
	AlloyDb GcpIntegrationsAlloyDbPtrOutput `pulumi:"alloyDb"`
	// App Engine integration. See Integration blocks below for details.
	AppEngine GcpIntegrationsAppEnginePtrOutput `pulumi:"appEngine"`
	// Biq Query integration. See Integration blocks below for details.
	BigQuery GcpIntegrationsBigQueryPtrOutput `pulumi:"bigQuery"`
	// Big Table. See Integration blocks below for details.
	BigTable GcpIntegrationsBigTablePtrOutput `pulumi:"bigTable"`
	// Composer integration. See Integration blocks below for details.
	Composer GcpIntegrationsComposerPtrOutput `pulumi:"composer"`
	// Data Flow integration. See Integration blocks below for details.
	DataFlow GcpIntegrationsDataFlowPtrOutput `pulumi:"dataFlow"`
	// Data Proc integration. See Integration blocks below for details.
	DataProc GcpIntegrationsDataProcPtrOutput `pulumi:"dataProc"`
	// Data Store integration. See Integration blocks below for details.
	DataStore GcpIntegrationsDataStorePtrOutput `pulumi:"dataStore"`
	// Fire Base Database integration. See Integration blocks below for details.
	FireBaseDatabase GcpIntegrationsFireBaseDatabasePtrOutput `pulumi:"fireBaseDatabase"`
	// Fire Base Hosting integration. See Integration blocks below for details.
	FireBaseHosting GcpIntegrationsFireBaseHostingPtrOutput `pulumi:"fireBaseHosting"`
	// Fire Base Storage integration. See Integration blocks below for details.
	FireBaseStorage GcpIntegrationsFireBaseStoragePtrOutput `pulumi:"fireBaseStorage"`
	// Fire Store integration. See Integration blocks below for details.
	FireStore GcpIntegrationsFireStorePtrOutput `pulumi:"fireStore"`
	// Functions integration. See Integration blocks below for details.
	Functions GcpIntegrationsFunctionsPtrOutput `pulumi:"functions"`
	// Interconnect integration. See Integration blocks below for details.
	Interconnect GcpIntegrationsInterconnectPtrOutput `pulumi:"interconnect"`
	// Kubernetes integration. See Integration blocks below for details.
	Kubernetes GcpIntegrationsKubernetesPtrOutput `pulumi:"kubernetes"`
	// The ID of the linked GCP account in New Relic.
	LinkedAccountId pulumi.IntOutput `pulumi:"linkedAccountId"`
	// Load Balancing integration. See Integration blocks below for details.
	LoadBalancing GcpIntegrationsLoadBalancingPtrOutput `pulumi:"loadBalancing"`
	// Mem cache integration. See Integration blocks below for details.
	MemCache GcpIntegrationsMemCachePtrOutput `pulumi:"memCache"`
	// Pub/Sub integration. See Integration blocks below for details.
	PubSub GcpIntegrationsPubSubPtrOutput `pulumi:"pubSub"`
	// Redis integration. See Integration blocks below for details.
	Redis GcpIntegrationsRedisPtrOutput `pulumi:"redis"`
	// Router integration. See Integration blocks below for details.
	Router GcpIntegrationsRouterPtrOutput `pulumi:"router"`
	// Run integration. See Integration blocks below for details.
	Run GcpIntegrationsRunPtrOutput `pulumi:"run"`
	// Spanner integration. See Integration blocks below for details.
	Spanner GcpIntegrationsSpannerPtrOutput `pulumi:"spanner"`
	// SQL integration. See Integration blocks below for details.
	Sql GcpIntegrationsSqlPtrOutput `pulumi:"sql"`
	// Storage integration. See Integration blocks below for details.
	Storage GcpIntegrationsStoragePtrOutput `pulumi:"storage"`
	// Virtual machines integration. See Integration blocks below for details.
	VirtualMachines GcpIntegrationsVirtualMachinesPtrOutput `pulumi:"virtualMachines"`
	// VPC Access integration. See Integration blocks below for details.
	VpcAccess GcpIntegrationsVpcAccessPtrOutput `pulumi:"vpcAccess"`
}

// NewGcpIntegrations registers a new resource with the given unique name, arguments, and options.
func NewGcpIntegrations(ctx *pulumi.Context,
	name string, args *GcpIntegrationsArgs, opts ...pulumi.ResourceOption) (*GcpIntegrations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LinkedAccountId == nil {
		return nil, errors.New("invalid value for required argument 'LinkedAccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GcpIntegrations
	err := ctx.RegisterResource("newrelic:cloud/gcpIntegrations:GcpIntegrations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGcpIntegrations gets an existing GcpIntegrations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGcpIntegrations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GcpIntegrationsState, opts ...pulumi.ResourceOption) (*GcpIntegrations, error) {
	var resource GcpIntegrations
	err := ctx.ReadResource("newrelic:cloud/gcpIntegrations:GcpIntegrations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GcpIntegrations resources.
type gcpIntegrationsState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Alloy DB integration. See Integration blocks below for details.
	AlloyDb *GcpIntegrationsAlloyDb `pulumi:"alloyDb"`
	// App Engine integration. See Integration blocks below for details.
	AppEngine *GcpIntegrationsAppEngine `pulumi:"appEngine"`
	// Biq Query integration. See Integration blocks below for details.
	BigQuery *GcpIntegrationsBigQuery `pulumi:"bigQuery"`
	// Big Table. See Integration blocks below for details.
	BigTable *GcpIntegrationsBigTable `pulumi:"bigTable"`
	// Composer integration. See Integration blocks below for details.
	Composer *GcpIntegrationsComposer `pulumi:"composer"`
	// Data Flow integration. See Integration blocks below for details.
	DataFlow *GcpIntegrationsDataFlow `pulumi:"dataFlow"`
	// Data Proc integration. See Integration blocks below for details.
	DataProc *GcpIntegrationsDataProc `pulumi:"dataProc"`
	// Data Store integration. See Integration blocks below for details.
	DataStore *GcpIntegrationsDataStore `pulumi:"dataStore"`
	// Fire Base Database integration. See Integration blocks below for details.
	FireBaseDatabase *GcpIntegrationsFireBaseDatabase `pulumi:"fireBaseDatabase"`
	// Fire Base Hosting integration. See Integration blocks below for details.
	FireBaseHosting *GcpIntegrationsFireBaseHosting `pulumi:"fireBaseHosting"`
	// Fire Base Storage integration. See Integration blocks below for details.
	FireBaseStorage *GcpIntegrationsFireBaseStorage `pulumi:"fireBaseStorage"`
	// Fire Store integration. See Integration blocks below for details.
	FireStore *GcpIntegrationsFireStore `pulumi:"fireStore"`
	// Functions integration. See Integration blocks below for details.
	Functions *GcpIntegrationsFunctions `pulumi:"functions"`
	// Interconnect integration. See Integration blocks below for details.
	Interconnect *GcpIntegrationsInterconnect `pulumi:"interconnect"`
	// Kubernetes integration. See Integration blocks below for details.
	Kubernetes *GcpIntegrationsKubernetes `pulumi:"kubernetes"`
	// The ID of the linked GCP account in New Relic.
	LinkedAccountId *int `pulumi:"linkedAccountId"`
	// Load Balancing integration. See Integration blocks below for details.
	LoadBalancing *GcpIntegrationsLoadBalancing `pulumi:"loadBalancing"`
	// Mem cache integration. See Integration blocks below for details.
	MemCache *GcpIntegrationsMemCache `pulumi:"memCache"`
	// Pub/Sub integration. See Integration blocks below for details.
	PubSub *GcpIntegrationsPubSub `pulumi:"pubSub"`
	// Redis integration. See Integration blocks below for details.
	Redis *GcpIntegrationsRedis `pulumi:"redis"`
	// Router integration. See Integration blocks below for details.
	Router *GcpIntegrationsRouter `pulumi:"router"`
	// Run integration. See Integration blocks below for details.
	Run *GcpIntegrationsRun `pulumi:"run"`
	// Spanner integration. See Integration blocks below for details.
	Spanner *GcpIntegrationsSpanner `pulumi:"spanner"`
	// SQL integration. See Integration blocks below for details.
	Sql *GcpIntegrationsSql `pulumi:"sql"`
	// Storage integration. See Integration blocks below for details.
	Storage *GcpIntegrationsStorage `pulumi:"storage"`
	// Virtual machines integration. See Integration blocks below for details.
	VirtualMachines *GcpIntegrationsVirtualMachines `pulumi:"virtualMachines"`
	// VPC Access integration. See Integration blocks below for details.
	VpcAccess *GcpIntegrationsVpcAccess `pulumi:"vpcAccess"`
}

type GcpIntegrationsState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Alloy DB integration. See Integration blocks below for details.
	AlloyDb GcpIntegrationsAlloyDbPtrInput
	// App Engine integration. See Integration blocks below for details.
	AppEngine GcpIntegrationsAppEnginePtrInput
	// Biq Query integration. See Integration blocks below for details.
	BigQuery GcpIntegrationsBigQueryPtrInput
	// Big Table. See Integration blocks below for details.
	BigTable GcpIntegrationsBigTablePtrInput
	// Composer integration. See Integration blocks below for details.
	Composer GcpIntegrationsComposerPtrInput
	// Data Flow integration. See Integration blocks below for details.
	DataFlow GcpIntegrationsDataFlowPtrInput
	// Data Proc integration. See Integration blocks below for details.
	DataProc GcpIntegrationsDataProcPtrInput
	// Data Store integration. See Integration blocks below for details.
	DataStore GcpIntegrationsDataStorePtrInput
	// Fire Base Database integration. See Integration blocks below for details.
	FireBaseDatabase GcpIntegrationsFireBaseDatabasePtrInput
	// Fire Base Hosting integration. See Integration blocks below for details.
	FireBaseHosting GcpIntegrationsFireBaseHostingPtrInput
	// Fire Base Storage integration. See Integration blocks below for details.
	FireBaseStorage GcpIntegrationsFireBaseStoragePtrInput
	// Fire Store integration. See Integration blocks below for details.
	FireStore GcpIntegrationsFireStorePtrInput
	// Functions integration. See Integration blocks below for details.
	Functions GcpIntegrationsFunctionsPtrInput
	// Interconnect integration. See Integration blocks below for details.
	Interconnect GcpIntegrationsInterconnectPtrInput
	// Kubernetes integration. See Integration blocks below for details.
	Kubernetes GcpIntegrationsKubernetesPtrInput
	// The ID of the linked GCP account in New Relic.
	LinkedAccountId pulumi.IntPtrInput
	// Load Balancing integration. See Integration blocks below for details.
	LoadBalancing GcpIntegrationsLoadBalancingPtrInput
	// Mem cache integration. See Integration blocks below for details.
	MemCache GcpIntegrationsMemCachePtrInput
	// Pub/Sub integration. See Integration blocks below for details.
	PubSub GcpIntegrationsPubSubPtrInput
	// Redis integration. See Integration blocks below for details.
	Redis GcpIntegrationsRedisPtrInput
	// Router integration. See Integration blocks below for details.
	Router GcpIntegrationsRouterPtrInput
	// Run integration. See Integration blocks below for details.
	Run GcpIntegrationsRunPtrInput
	// Spanner integration. See Integration blocks below for details.
	Spanner GcpIntegrationsSpannerPtrInput
	// SQL integration. See Integration blocks below for details.
	Sql GcpIntegrationsSqlPtrInput
	// Storage integration. See Integration blocks below for details.
	Storage GcpIntegrationsStoragePtrInput
	// Virtual machines integration. See Integration blocks below for details.
	VirtualMachines GcpIntegrationsVirtualMachinesPtrInput
	// VPC Access integration. See Integration blocks below for details.
	VpcAccess GcpIntegrationsVpcAccessPtrInput
}

func (GcpIntegrationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpIntegrationsState)(nil)).Elem()
}

type gcpIntegrationsArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Alloy DB integration. See Integration blocks below for details.
	AlloyDb *GcpIntegrationsAlloyDb `pulumi:"alloyDb"`
	// App Engine integration. See Integration blocks below for details.
	AppEngine *GcpIntegrationsAppEngine `pulumi:"appEngine"`
	// Biq Query integration. See Integration blocks below for details.
	BigQuery *GcpIntegrationsBigQuery `pulumi:"bigQuery"`
	// Big Table. See Integration blocks below for details.
	BigTable *GcpIntegrationsBigTable `pulumi:"bigTable"`
	// Composer integration. See Integration blocks below for details.
	Composer *GcpIntegrationsComposer `pulumi:"composer"`
	// Data Flow integration. See Integration blocks below for details.
	DataFlow *GcpIntegrationsDataFlow `pulumi:"dataFlow"`
	// Data Proc integration. See Integration blocks below for details.
	DataProc *GcpIntegrationsDataProc `pulumi:"dataProc"`
	// Data Store integration. See Integration blocks below for details.
	DataStore *GcpIntegrationsDataStore `pulumi:"dataStore"`
	// Fire Base Database integration. See Integration blocks below for details.
	FireBaseDatabase *GcpIntegrationsFireBaseDatabase `pulumi:"fireBaseDatabase"`
	// Fire Base Hosting integration. See Integration blocks below for details.
	FireBaseHosting *GcpIntegrationsFireBaseHosting `pulumi:"fireBaseHosting"`
	// Fire Base Storage integration. See Integration blocks below for details.
	FireBaseStorage *GcpIntegrationsFireBaseStorage `pulumi:"fireBaseStorage"`
	// Fire Store integration. See Integration blocks below for details.
	FireStore *GcpIntegrationsFireStore `pulumi:"fireStore"`
	// Functions integration. See Integration blocks below for details.
	Functions *GcpIntegrationsFunctions `pulumi:"functions"`
	// Interconnect integration. See Integration blocks below for details.
	Interconnect *GcpIntegrationsInterconnect `pulumi:"interconnect"`
	// Kubernetes integration. See Integration blocks below for details.
	Kubernetes *GcpIntegrationsKubernetes `pulumi:"kubernetes"`
	// The ID of the linked GCP account in New Relic.
	LinkedAccountId int `pulumi:"linkedAccountId"`
	// Load Balancing integration. See Integration blocks below for details.
	LoadBalancing *GcpIntegrationsLoadBalancing `pulumi:"loadBalancing"`
	// Mem cache integration. See Integration blocks below for details.
	MemCache *GcpIntegrationsMemCache `pulumi:"memCache"`
	// Pub/Sub integration. See Integration blocks below for details.
	PubSub *GcpIntegrationsPubSub `pulumi:"pubSub"`
	// Redis integration. See Integration blocks below for details.
	Redis *GcpIntegrationsRedis `pulumi:"redis"`
	// Router integration. See Integration blocks below for details.
	Router *GcpIntegrationsRouter `pulumi:"router"`
	// Run integration. See Integration blocks below for details.
	Run *GcpIntegrationsRun `pulumi:"run"`
	// Spanner integration. See Integration blocks below for details.
	Spanner *GcpIntegrationsSpanner `pulumi:"spanner"`
	// SQL integration. See Integration blocks below for details.
	Sql *GcpIntegrationsSql `pulumi:"sql"`
	// Storage integration. See Integration blocks below for details.
	Storage *GcpIntegrationsStorage `pulumi:"storage"`
	// Virtual machines integration. See Integration blocks below for details.
	VirtualMachines *GcpIntegrationsVirtualMachines `pulumi:"virtualMachines"`
	// VPC Access integration. See Integration blocks below for details.
	VpcAccess *GcpIntegrationsVpcAccess `pulumi:"vpcAccess"`
}

// The set of arguments for constructing a GcpIntegrations resource.
type GcpIntegrationsArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Alloy DB integration. See Integration blocks below for details.
	AlloyDb GcpIntegrationsAlloyDbPtrInput
	// App Engine integration. See Integration blocks below for details.
	AppEngine GcpIntegrationsAppEnginePtrInput
	// Biq Query integration. See Integration blocks below for details.
	BigQuery GcpIntegrationsBigQueryPtrInput
	// Big Table. See Integration blocks below for details.
	BigTable GcpIntegrationsBigTablePtrInput
	// Composer integration. See Integration blocks below for details.
	Composer GcpIntegrationsComposerPtrInput
	// Data Flow integration. See Integration blocks below for details.
	DataFlow GcpIntegrationsDataFlowPtrInput
	// Data Proc integration. See Integration blocks below for details.
	DataProc GcpIntegrationsDataProcPtrInput
	// Data Store integration. See Integration blocks below for details.
	DataStore GcpIntegrationsDataStorePtrInput
	// Fire Base Database integration. See Integration blocks below for details.
	FireBaseDatabase GcpIntegrationsFireBaseDatabasePtrInput
	// Fire Base Hosting integration. See Integration blocks below for details.
	FireBaseHosting GcpIntegrationsFireBaseHostingPtrInput
	// Fire Base Storage integration. See Integration blocks below for details.
	FireBaseStorage GcpIntegrationsFireBaseStoragePtrInput
	// Fire Store integration. See Integration blocks below for details.
	FireStore GcpIntegrationsFireStorePtrInput
	// Functions integration. See Integration blocks below for details.
	Functions GcpIntegrationsFunctionsPtrInput
	// Interconnect integration. See Integration blocks below for details.
	Interconnect GcpIntegrationsInterconnectPtrInput
	// Kubernetes integration. See Integration blocks below for details.
	Kubernetes GcpIntegrationsKubernetesPtrInput
	// The ID of the linked GCP account in New Relic.
	LinkedAccountId pulumi.IntInput
	// Load Balancing integration. See Integration blocks below for details.
	LoadBalancing GcpIntegrationsLoadBalancingPtrInput
	// Mem cache integration. See Integration blocks below for details.
	MemCache GcpIntegrationsMemCachePtrInput
	// Pub/Sub integration. See Integration blocks below for details.
	PubSub GcpIntegrationsPubSubPtrInput
	// Redis integration. See Integration blocks below for details.
	Redis GcpIntegrationsRedisPtrInput
	// Router integration. See Integration blocks below for details.
	Router GcpIntegrationsRouterPtrInput
	// Run integration. See Integration blocks below for details.
	Run GcpIntegrationsRunPtrInput
	// Spanner integration. See Integration blocks below for details.
	Spanner GcpIntegrationsSpannerPtrInput
	// SQL integration. See Integration blocks below for details.
	Sql GcpIntegrationsSqlPtrInput
	// Storage integration. See Integration blocks below for details.
	Storage GcpIntegrationsStoragePtrInput
	// Virtual machines integration. See Integration blocks below for details.
	VirtualMachines GcpIntegrationsVirtualMachinesPtrInput
	// VPC Access integration. See Integration blocks below for details.
	VpcAccess GcpIntegrationsVpcAccessPtrInput
}

func (GcpIntegrationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpIntegrationsArgs)(nil)).Elem()
}

type GcpIntegrationsInput interface {
	pulumi.Input

	ToGcpIntegrationsOutput() GcpIntegrationsOutput
	ToGcpIntegrationsOutputWithContext(ctx context.Context) GcpIntegrationsOutput
}

func (*GcpIntegrations) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpIntegrations)(nil)).Elem()
}

func (i *GcpIntegrations) ToGcpIntegrationsOutput() GcpIntegrationsOutput {
	return i.ToGcpIntegrationsOutputWithContext(context.Background())
}

func (i *GcpIntegrations) ToGcpIntegrationsOutputWithContext(ctx context.Context) GcpIntegrationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpIntegrationsOutput)
}

// GcpIntegrationsArrayInput is an input type that accepts GcpIntegrationsArray and GcpIntegrationsArrayOutput values.
// You can construct a concrete instance of `GcpIntegrationsArrayInput` via:
//
//	GcpIntegrationsArray{ GcpIntegrationsArgs{...} }
type GcpIntegrationsArrayInput interface {
	pulumi.Input

	ToGcpIntegrationsArrayOutput() GcpIntegrationsArrayOutput
	ToGcpIntegrationsArrayOutputWithContext(context.Context) GcpIntegrationsArrayOutput
}

type GcpIntegrationsArray []GcpIntegrationsInput

func (GcpIntegrationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpIntegrations)(nil)).Elem()
}

func (i GcpIntegrationsArray) ToGcpIntegrationsArrayOutput() GcpIntegrationsArrayOutput {
	return i.ToGcpIntegrationsArrayOutputWithContext(context.Background())
}

func (i GcpIntegrationsArray) ToGcpIntegrationsArrayOutputWithContext(ctx context.Context) GcpIntegrationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpIntegrationsArrayOutput)
}

// GcpIntegrationsMapInput is an input type that accepts GcpIntegrationsMap and GcpIntegrationsMapOutput values.
// You can construct a concrete instance of `GcpIntegrationsMapInput` via:
//
//	GcpIntegrationsMap{ "key": GcpIntegrationsArgs{...} }
type GcpIntegrationsMapInput interface {
	pulumi.Input

	ToGcpIntegrationsMapOutput() GcpIntegrationsMapOutput
	ToGcpIntegrationsMapOutputWithContext(context.Context) GcpIntegrationsMapOutput
}

type GcpIntegrationsMap map[string]GcpIntegrationsInput

func (GcpIntegrationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpIntegrations)(nil)).Elem()
}

func (i GcpIntegrationsMap) ToGcpIntegrationsMapOutput() GcpIntegrationsMapOutput {
	return i.ToGcpIntegrationsMapOutputWithContext(context.Background())
}

func (i GcpIntegrationsMap) ToGcpIntegrationsMapOutputWithContext(ctx context.Context) GcpIntegrationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpIntegrationsMapOutput)
}

type GcpIntegrationsOutput struct{ *pulumi.OutputState }

func (GcpIntegrationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpIntegrations)(nil)).Elem()
}

func (o GcpIntegrationsOutput) ToGcpIntegrationsOutput() GcpIntegrationsOutput {
	return o
}

func (o GcpIntegrationsOutput) ToGcpIntegrationsOutputWithContext(ctx context.Context) GcpIntegrationsOutput {
	return o
}

// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
func (o GcpIntegrationsOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *GcpIntegrations) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Alloy DB integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) AlloyDb() GcpIntegrationsAlloyDbPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsAlloyDbPtrOutput { return v.AlloyDb }).(GcpIntegrationsAlloyDbPtrOutput)
}

// App Engine integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) AppEngine() GcpIntegrationsAppEnginePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsAppEnginePtrOutput { return v.AppEngine }).(GcpIntegrationsAppEnginePtrOutput)
}

// Biq Query integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) BigQuery() GcpIntegrationsBigQueryPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsBigQueryPtrOutput { return v.BigQuery }).(GcpIntegrationsBigQueryPtrOutput)
}

// Big Table. See Integration blocks below for details.
func (o GcpIntegrationsOutput) BigTable() GcpIntegrationsBigTablePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsBigTablePtrOutput { return v.BigTable }).(GcpIntegrationsBigTablePtrOutput)
}

// Composer integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Composer() GcpIntegrationsComposerPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsComposerPtrOutput { return v.Composer }).(GcpIntegrationsComposerPtrOutput)
}

// Data Flow integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) DataFlow() GcpIntegrationsDataFlowPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsDataFlowPtrOutput { return v.DataFlow }).(GcpIntegrationsDataFlowPtrOutput)
}

// Data Proc integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) DataProc() GcpIntegrationsDataProcPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsDataProcPtrOutput { return v.DataProc }).(GcpIntegrationsDataProcPtrOutput)
}

// Data Store integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) DataStore() GcpIntegrationsDataStorePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsDataStorePtrOutput { return v.DataStore }).(GcpIntegrationsDataStorePtrOutput)
}

// Fire Base Database integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) FireBaseDatabase() GcpIntegrationsFireBaseDatabasePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsFireBaseDatabasePtrOutput { return v.FireBaseDatabase }).(GcpIntegrationsFireBaseDatabasePtrOutput)
}

// Fire Base Hosting integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) FireBaseHosting() GcpIntegrationsFireBaseHostingPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsFireBaseHostingPtrOutput { return v.FireBaseHosting }).(GcpIntegrationsFireBaseHostingPtrOutput)
}

// Fire Base Storage integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) FireBaseStorage() GcpIntegrationsFireBaseStoragePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsFireBaseStoragePtrOutput { return v.FireBaseStorage }).(GcpIntegrationsFireBaseStoragePtrOutput)
}

// Fire Store integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) FireStore() GcpIntegrationsFireStorePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsFireStorePtrOutput { return v.FireStore }).(GcpIntegrationsFireStorePtrOutput)
}

// Functions integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Functions() GcpIntegrationsFunctionsPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsFunctionsPtrOutput { return v.Functions }).(GcpIntegrationsFunctionsPtrOutput)
}

// Interconnect integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Interconnect() GcpIntegrationsInterconnectPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsInterconnectPtrOutput { return v.Interconnect }).(GcpIntegrationsInterconnectPtrOutput)
}

// Kubernetes integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Kubernetes() GcpIntegrationsKubernetesPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsKubernetesPtrOutput { return v.Kubernetes }).(GcpIntegrationsKubernetesPtrOutput)
}

// The ID of the linked GCP account in New Relic.
func (o GcpIntegrationsOutput) LinkedAccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *GcpIntegrations) pulumi.IntOutput { return v.LinkedAccountId }).(pulumi.IntOutput)
}

// Load Balancing integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) LoadBalancing() GcpIntegrationsLoadBalancingPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsLoadBalancingPtrOutput { return v.LoadBalancing }).(GcpIntegrationsLoadBalancingPtrOutput)
}

// Mem cache integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) MemCache() GcpIntegrationsMemCachePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsMemCachePtrOutput { return v.MemCache }).(GcpIntegrationsMemCachePtrOutput)
}

// Pub/Sub integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) PubSub() GcpIntegrationsPubSubPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsPubSubPtrOutput { return v.PubSub }).(GcpIntegrationsPubSubPtrOutput)
}

// Redis integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Redis() GcpIntegrationsRedisPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsRedisPtrOutput { return v.Redis }).(GcpIntegrationsRedisPtrOutput)
}

// Router integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Router() GcpIntegrationsRouterPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsRouterPtrOutput { return v.Router }).(GcpIntegrationsRouterPtrOutput)
}

// Run integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Run() GcpIntegrationsRunPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsRunPtrOutput { return v.Run }).(GcpIntegrationsRunPtrOutput)
}

// Spanner integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Spanner() GcpIntegrationsSpannerPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsSpannerPtrOutput { return v.Spanner }).(GcpIntegrationsSpannerPtrOutput)
}

// SQL integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Sql() GcpIntegrationsSqlPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsSqlPtrOutput { return v.Sql }).(GcpIntegrationsSqlPtrOutput)
}

// Storage integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) Storage() GcpIntegrationsStoragePtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsStoragePtrOutput { return v.Storage }).(GcpIntegrationsStoragePtrOutput)
}

// Virtual machines integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) VirtualMachines() GcpIntegrationsVirtualMachinesPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsVirtualMachinesPtrOutput { return v.VirtualMachines }).(GcpIntegrationsVirtualMachinesPtrOutput)
}

// VPC Access integration. See Integration blocks below for details.
func (o GcpIntegrationsOutput) VpcAccess() GcpIntegrationsVpcAccessPtrOutput {
	return o.ApplyT(func(v *GcpIntegrations) GcpIntegrationsVpcAccessPtrOutput { return v.VpcAccess }).(GcpIntegrationsVpcAccessPtrOutput)
}

type GcpIntegrationsArrayOutput struct{ *pulumi.OutputState }

func (GcpIntegrationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpIntegrations)(nil)).Elem()
}

func (o GcpIntegrationsArrayOutput) ToGcpIntegrationsArrayOutput() GcpIntegrationsArrayOutput {
	return o
}

func (o GcpIntegrationsArrayOutput) ToGcpIntegrationsArrayOutputWithContext(ctx context.Context) GcpIntegrationsArrayOutput {
	return o
}

func (o GcpIntegrationsArrayOutput) Index(i pulumi.IntInput) GcpIntegrationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GcpIntegrations {
		return vs[0].([]*GcpIntegrations)[vs[1].(int)]
	}).(GcpIntegrationsOutput)
}

type GcpIntegrationsMapOutput struct{ *pulumi.OutputState }

func (GcpIntegrationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpIntegrations)(nil)).Elem()
}

func (o GcpIntegrationsMapOutput) ToGcpIntegrationsMapOutput() GcpIntegrationsMapOutput {
	return o
}

func (o GcpIntegrationsMapOutput) ToGcpIntegrationsMapOutputWithContext(ctx context.Context) GcpIntegrationsMapOutput {
	return o
}

func (o GcpIntegrationsMapOutput) MapIndex(k pulumi.StringInput) GcpIntegrationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GcpIntegrations {
		return vs[0].(map[string]*GcpIntegrations)[vs[1].(string)]
	}).(GcpIntegrationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GcpIntegrationsInput)(nil)).Elem(), &GcpIntegrations{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpIntegrationsArrayInput)(nil)).Elem(), GcpIntegrationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpIntegrationsMapInput)(nil)).Elem(), GcpIntegrationsMap{})
	pulumi.RegisterOutputType(GcpIntegrationsOutput{})
	pulumi.RegisterOutputType(GcpIntegrationsArrayOutput{})
	pulumi.RegisterOutputType(GcpIntegrationsMapOutput{})
}
