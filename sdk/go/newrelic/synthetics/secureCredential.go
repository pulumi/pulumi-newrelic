// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage New Relic Synthetic secure credentials.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := synthetics.NewSecureCredential(ctx, "foo", &synthetics.SecureCredentialArgs{
//				Description: pulumi.String("My description"),
//				Key:         pulumi.String("MY_KEY"),
//				Value:       pulumi.String("My value"),
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
// A Synthetics secure credential can be imported using its `key`
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
//
// ```
type SecureCredential struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The secure credential's description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key pulumi.StringOutput `pulumi:"key"`
	// The time the secure credential was last updated.
	LastUpdated pulumi.StringOutput `pulumi:"lastUpdated"`
	// The secure credential's value.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewSecureCredential registers a new resource with the given unique name, arguments, and options.
func NewSecureCredential(ctx *pulumi.Context,
	name string, args *SecureCredentialArgs, opts ...pulumi.ResourceOption) (*SecureCredential, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	if args.Value != nil {
		args.Value = pulumi.ToSecret(args.Value).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"value",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecureCredential
	err := ctx.RegisterResource("newrelic:synthetics/secureCredential:SecureCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecureCredential gets an existing SecureCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecureCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecureCredentialState, opts ...pulumi.ResourceOption) (*SecureCredential, error) {
	var resource SecureCredential
	err := ctx.ReadResource("newrelic:synthetics/secureCredential:SecureCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecureCredential resources.
type secureCredentialState struct {
	// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// The secure credential's description.
	Description *string `pulumi:"description"`
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key *string `pulumi:"key"`
	// The time the secure credential was last updated.
	LastUpdated *string `pulumi:"lastUpdated"`
	// The secure credential's value.
	Value *string `pulumi:"value"`
}

type SecureCredentialState struct {
	// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// The secure credential's description.
	Description pulumi.StringPtrInput
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key pulumi.StringPtrInput
	// The time the secure credential was last updated.
	LastUpdated pulumi.StringPtrInput
	// The secure credential's value.
	Value pulumi.StringPtrInput
}

func (SecureCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*secureCredentialState)(nil)).Elem()
}

type secureCredentialArgs struct {
	// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// The secure credential's description.
	Description *string `pulumi:"description"`
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key string `pulumi:"key"`
	// The time the secure credential was last updated.
	LastUpdated *string `pulumi:"lastUpdated"`
	// The secure credential's value.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a SecureCredential resource.
type SecureCredentialArgs struct {
	// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// The secure credential's description.
	Description pulumi.StringPtrInput
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key pulumi.StringInput
	// The time the secure credential was last updated.
	LastUpdated pulumi.StringPtrInput
	// The secure credential's value.
	Value pulumi.StringInput
}

func (SecureCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secureCredentialArgs)(nil)).Elem()
}

type SecureCredentialInput interface {
	pulumi.Input

	ToSecureCredentialOutput() SecureCredentialOutput
	ToSecureCredentialOutputWithContext(ctx context.Context) SecureCredentialOutput
}

func (*SecureCredential) ElementType() reflect.Type {
	return reflect.TypeOf((**SecureCredential)(nil)).Elem()
}

func (i *SecureCredential) ToSecureCredentialOutput() SecureCredentialOutput {
	return i.ToSecureCredentialOutputWithContext(context.Background())
}

func (i *SecureCredential) ToSecureCredentialOutputWithContext(ctx context.Context) SecureCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecureCredentialOutput)
}

// SecureCredentialArrayInput is an input type that accepts SecureCredentialArray and SecureCredentialArrayOutput values.
// You can construct a concrete instance of `SecureCredentialArrayInput` via:
//
//	SecureCredentialArray{ SecureCredentialArgs{...} }
type SecureCredentialArrayInput interface {
	pulumi.Input

	ToSecureCredentialArrayOutput() SecureCredentialArrayOutput
	ToSecureCredentialArrayOutputWithContext(context.Context) SecureCredentialArrayOutput
}

type SecureCredentialArray []SecureCredentialInput

func (SecureCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecureCredential)(nil)).Elem()
}

func (i SecureCredentialArray) ToSecureCredentialArrayOutput() SecureCredentialArrayOutput {
	return i.ToSecureCredentialArrayOutputWithContext(context.Background())
}

func (i SecureCredentialArray) ToSecureCredentialArrayOutputWithContext(ctx context.Context) SecureCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecureCredentialArrayOutput)
}

// SecureCredentialMapInput is an input type that accepts SecureCredentialMap and SecureCredentialMapOutput values.
// You can construct a concrete instance of `SecureCredentialMapInput` via:
//
//	SecureCredentialMap{ "key": SecureCredentialArgs{...} }
type SecureCredentialMapInput interface {
	pulumi.Input

	ToSecureCredentialMapOutput() SecureCredentialMapOutput
	ToSecureCredentialMapOutputWithContext(context.Context) SecureCredentialMapOutput
}

type SecureCredentialMap map[string]SecureCredentialInput

func (SecureCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecureCredential)(nil)).Elem()
}

func (i SecureCredentialMap) ToSecureCredentialMapOutput() SecureCredentialMapOutput {
	return i.ToSecureCredentialMapOutputWithContext(context.Background())
}

func (i SecureCredentialMap) ToSecureCredentialMapOutputWithContext(ctx context.Context) SecureCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecureCredentialMapOutput)
}

type SecureCredentialOutput struct{ *pulumi.OutputState }

func (SecureCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecureCredential)(nil)).Elem()
}

func (o SecureCredentialOutput) ToSecureCredentialOutput() SecureCredentialOutput {
	return o
}

func (o SecureCredentialOutput) ToSecureCredentialOutputWithContext(ctx context.Context) SecureCredentialOutput {
	return o
}

// Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
func (o SecureCredentialOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *SecureCredential) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// The secure credential's description.
func (o SecureCredentialOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecureCredential) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
func (o SecureCredentialOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *SecureCredential) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The time the secure credential was last updated.
func (o SecureCredentialOutput) LastUpdated() pulumi.StringOutput {
	return o.ApplyT(func(v *SecureCredential) pulumi.StringOutput { return v.LastUpdated }).(pulumi.StringOutput)
}

// The secure credential's value.
func (o SecureCredentialOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *SecureCredential) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type SecureCredentialArrayOutput struct{ *pulumi.OutputState }

func (SecureCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecureCredential)(nil)).Elem()
}

func (o SecureCredentialArrayOutput) ToSecureCredentialArrayOutput() SecureCredentialArrayOutput {
	return o
}

func (o SecureCredentialArrayOutput) ToSecureCredentialArrayOutputWithContext(ctx context.Context) SecureCredentialArrayOutput {
	return o
}

func (o SecureCredentialArrayOutput) Index(i pulumi.IntInput) SecureCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecureCredential {
		return vs[0].([]*SecureCredential)[vs[1].(int)]
	}).(SecureCredentialOutput)
}

type SecureCredentialMapOutput struct{ *pulumi.OutputState }

func (SecureCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecureCredential)(nil)).Elem()
}

func (o SecureCredentialMapOutput) ToSecureCredentialMapOutput() SecureCredentialMapOutput {
	return o
}

func (o SecureCredentialMapOutput) ToSecureCredentialMapOutputWithContext(ctx context.Context) SecureCredentialMapOutput {
	return o
}

func (o SecureCredentialMapOutput) MapIndex(k pulumi.StringInput) SecureCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecureCredential {
		return vs[0].(map[string]*SecureCredential)[vs[1].(string)]
	}).(SecureCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecureCredentialInput)(nil)).Elem(), &SecureCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecureCredentialArrayInput)(nil)).Elem(), SecureCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecureCredentialMapInput)(nil)).Elem(), SecureCredentialMap{})
	pulumi.RegisterOutputType(SecureCredentialOutput{})
	pulumi.RegisterOutputType(SecureCredentialArrayOutput{})
	pulumi.RegisterOutputType(SecureCredentialMapOutput{})
}
