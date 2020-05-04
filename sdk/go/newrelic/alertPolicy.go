// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this resource to create and manage New Relic alert policies.
type AlertPolicy struct {
	pulumi.CustomResourceState

	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result
	// in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs cannot be
	// imported via terraform import.
	ChannelIds pulumi.IntArrayOutput `pulumi:"channelIds"`
	// **DEPRECATED:** The time the policy was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrOutput `pulumi:"incidentPreference"`
	// The name of the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// **DEPRECATED:** The time the policy was last updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewAlertPolicy registers a new resource with the given unique name, arguments, and options.
func NewAlertPolicy(ctx *pulumi.Context,
	name string, args *AlertPolicyArgs, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	if args == nil {
		args = &AlertPolicyArgs{}
	}
	var resource AlertPolicy
	err := ctx.RegisterResource("newrelic:index/alertPolicy:AlertPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertPolicy gets an existing AlertPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertPolicyState, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	var resource AlertPolicy
	err := ctx.ReadResource("newrelic:index/alertPolicy:AlertPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertPolicy resources.
type alertPolicyState struct {
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result
	// in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs cannot be
	// imported via terraform import.
	ChannelIds []int `pulumi:"channelIds"`
	// **DEPRECATED:** The time the policy was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference *string `pulumi:"incidentPreference"`
	// The name of the policy.
	Name *string `pulumi:"name"`
	// **DEPRECATED:** The time the policy was last updated.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type AlertPolicyState struct {
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result
	// in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs cannot be
	// imported via terraform import.
	ChannelIds pulumi.IntArrayInput
	// **DEPRECATED:** The time the policy was created.
	CreatedAt pulumi.StringPtrInput
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
	// **DEPRECATED:** The time the policy was last updated.
	UpdatedAt pulumi.StringPtrInput
}

func (AlertPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyState)(nil)).Elem()
}

type alertPolicyArgs struct {
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result
	// in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs cannot be
	// imported via terraform import.
	ChannelIds []int `pulumi:"channelIds"`
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference *string `pulumi:"incidentPreference"`
	// The name of the policy.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AlertPolicy resource.
type AlertPolicyArgs struct {
	// An array of channel IDs (integers) to assign to the policy. Adding or removing channel IDs from this array will result
	// in a new alert policy resource being created and the old one being destroyed. Also note that channel IDs cannot be
	// imported via terraform import.
	ChannelIds pulumi.IntArrayInput
	// The rollup strategy for the policy.  Options include: `PER_POLICY`, `PER_CONDITION`, or `PER_CONDITION_AND_TARGET`.  The default is `PER_POLICY`.
	IncidentPreference pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
}

func (AlertPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyArgs)(nil)).Elem()
}
