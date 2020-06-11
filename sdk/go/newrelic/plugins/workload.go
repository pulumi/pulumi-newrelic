// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package plugins

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this resource to create, update, and delete a New Relic One workload.
//
// A New Relic Personal API key is required to provision this resource.  Set the `providerApiKey`
// attribute in the `provider` block or the `NEWRELIC_PERSONAL_API_KEY` environment
// variable with your Personal API key,
type Workload struct {
	pulumi.CustomResourceState

	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery pulumi.StringOutput `pulumi:"compositeEntitySearchQuery"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayOutput `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayOutput `pulumi:"entitySearchQueries"`
	// The unique entity identifier of the workload in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The workload's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL of the workload.
	Permalink pulumi.StringOutput `pulumi:"permalink"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayOutput `pulumi:"scopeAccountIds"`
	// The unique entity identifier of the workload.
	WorkloadId pulumi.IntOutput `pulumi:"workloadId"`
}

// NewWorkload registers a new resource with the given unique name, arguments, and options.
func NewWorkload(ctx *pulumi.Context,
	name string, args *WorkloadArgs, opts ...pulumi.ResourceOption) (*Workload, error) {
	if args == nil || args.AccountId == nil {
		return nil, errors.New("missing required argument 'AccountId'")
	}
	if args == nil {
		args = &WorkloadArgs{}
	}
	var resource Workload
	err := ctx.RegisterResource("newrelic:plugins/workload:Workload", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkload gets an existing Workload resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkload(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkloadState, opts ...pulumi.ResourceOption) (*Workload, error) {
	var resource Workload
	err := ctx.ReadResource("newrelic:plugins/workload:Workload", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workload resources.
type workloadState struct {
	// The New Relic account ID where you want to create the workload.
	AccountId *int `pulumi:"accountId"`
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery *string `pulumi:"compositeEntitySearchQuery"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids []string `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries []WorkloadEntitySearchQuery `pulumi:"entitySearchQueries"`
	// The unique entity identifier of the workload in New Relic.
	Guid *string `pulumi:"guid"`
	// The workload's name.
	Name *string `pulumi:"name"`
	// The URL of the workload.
	Permalink *string `pulumi:"permalink"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds []int `pulumi:"scopeAccountIds"`
	// The unique entity identifier of the workload.
	WorkloadId *int `pulumi:"workloadId"`
}

type WorkloadState struct {
	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntPtrInput
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery pulumi.StringPtrInput
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayInput
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayInput
	// The unique entity identifier of the workload in New Relic.
	Guid pulumi.StringPtrInput
	// The workload's name.
	Name pulumi.StringPtrInput
	// The URL of the workload.
	Permalink pulumi.StringPtrInput
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayInput
	// The unique entity identifier of the workload.
	WorkloadId pulumi.IntPtrInput
}

func (WorkloadState) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadState)(nil)).Elem()
}

type workloadArgs struct {
	// The New Relic account ID where you want to create the workload.
	AccountId int `pulumi:"accountId"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids []string `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries []WorkloadEntitySearchQuery `pulumi:"entitySearchQueries"`
	// The workload's name.
	Name *string `pulumi:"name"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds []int `pulumi:"scopeAccountIds"`
}

// The set of arguments for constructing a Workload resource.
type WorkloadArgs struct {
	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntInput
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayInput
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayInput
	// The workload's name.
	Name pulumi.StringPtrInput
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayInput
}

func (WorkloadArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadArgs)(nil)).Elem()
}