// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a standalone New Relic browser application.
//
// ## Example Usage
//
// Basic usage to create a standalone browser application.
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
//			_, err := newrelic.NewBrowserApplication(ctx, "foo", &newrelic.BrowserApplicationArgs{
//				CookiesEnabled:            pulumi.Bool(true),
//				DistributedTracingEnabled: pulumi.Bool(true),
//				LoaderType:                pulumi.String("SPA"),
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
// Browser applications can be imported using the GUID of the browser application.
//
// bash
//
// ```sh
// $ pulumi import newrelic:index/browserApplication:BrowserApplication foo <GUID>
// ```
type BrowserApplication struct {
	pulumi.CustomResourceState

	// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Configure cookies. The default is enabled: true.
	CookiesEnabled pulumi.BoolPtrOutput `pulumi:"cookiesEnabled"`
	// Configure distributed tracing in browser apps. The default is enabled: true.
	DistributedTracingEnabled pulumi.BoolPtrOutput `pulumi:"distributedTracingEnabled"`
	// The GUID of the browser application.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// JavaScript configuration of the browser application encoded into a string.
	JsConfig pulumi.StringOutput `pulumi:"jsConfig"`
	// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
	LoaderType pulumi.StringPtrOutput `pulumi:"loaderType"`
	// The name of the browser application.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewBrowserApplication registers a new resource with the given unique name, arguments, and options.
func NewBrowserApplication(ctx *pulumi.Context,
	name string, args *BrowserApplicationArgs, opts ...pulumi.ResourceOption) (*BrowserApplication, error) {
	if args == nil {
		args = &BrowserApplicationArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BrowserApplication
	err := ctx.RegisterResource("newrelic:index/browserApplication:BrowserApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBrowserApplication gets an existing BrowserApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBrowserApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrowserApplicationState, opts ...pulumi.ResourceOption) (*BrowserApplication, error) {
	var resource BrowserApplication
	err := ctx.ReadResource("newrelic:index/browserApplication:BrowserApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BrowserApplication resources.
type browserApplicationState struct {
	// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Configure cookies. The default is enabled: true.
	CookiesEnabled *bool `pulumi:"cookiesEnabled"`
	// Configure distributed tracing in browser apps. The default is enabled: true.
	DistributedTracingEnabled *bool `pulumi:"distributedTracingEnabled"`
	// The GUID of the browser application.
	Guid *string `pulumi:"guid"`
	// JavaScript configuration of the browser application encoded into a string.
	JsConfig *string `pulumi:"jsConfig"`
	// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
	LoaderType *string `pulumi:"loaderType"`
	// The name of the browser application.
	Name *string `pulumi:"name"`
}

type BrowserApplicationState struct {
	// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Configure cookies. The default is enabled: true.
	CookiesEnabled pulumi.BoolPtrInput
	// Configure distributed tracing in browser apps. The default is enabled: true.
	DistributedTracingEnabled pulumi.BoolPtrInput
	// The GUID of the browser application.
	Guid pulumi.StringPtrInput
	// JavaScript configuration of the browser application encoded into a string.
	JsConfig pulumi.StringPtrInput
	// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
	LoaderType pulumi.StringPtrInput
	// The name of the browser application.
	Name pulumi.StringPtrInput
}

func (BrowserApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*browserApplicationState)(nil)).Elem()
}

type browserApplicationArgs struct {
	// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Configure cookies. The default is enabled: true.
	CookiesEnabled *bool `pulumi:"cookiesEnabled"`
	// Configure distributed tracing in browser apps. The default is enabled: true.
	DistributedTracingEnabled *bool `pulumi:"distributedTracingEnabled"`
	// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
	LoaderType *string `pulumi:"loaderType"`
	// The name of the browser application.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a BrowserApplication resource.
type BrowserApplicationArgs struct {
	// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Configure cookies. The default is enabled: true.
	CookiesEnabled pulumi.BoolPtrInput
	// Configure distributed tracing in browser apps. The default is enabled: true.
	DistributedTracingEnabled pulumi.BoolPtrInput
	// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
	LoaderType pulumi.StringPtrInput
	// The name of the browser application.
	Name pulumi.StringPtrInput
}

func (BrowserApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*browserApplicationArgs)(nil)).Elem()
}

type BrowserApplicationInput interface {
	pulumi.Input

	ToBrowserApplicationOutput() BrowserApplicationOutput
	ToBrowserApplicationOutputWithContext(ctx context.Context) BrowserApplicationOutput
}

func (*BrowserApplication) ElementType() reflect.Type {
	return reflect.TypeOf((**BrowserApplication)(nil)).Elem()
}

func (i *BrowserApplication) ToBrowserApplicationOutput() BrowserApplicationOutput {
	return i.ToBrowserApplicationOutputWithContext(context.Background())
}

func (i *BrowserApplication) ToBrowserApplicationOutputWithContext(ctx context.Context) BrowserApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrowserApplicationOutput)
}

// BrowserApplicationArrayInput is an input type that accepts BrowserApplicationArray and BrowserApplicationArrayOutput values.
// You can construct a concrete instance of `BrowserApplicationArrayInput` via:
//
//	BrowserApplicationArray{ BrowserApplicationArgs{...} }
type BrowserApplicationArrayInput interface {
	pulumi.Input

	ToBrowserApplicationArrayOutput() BrowserApplicationArrayOutput
	ToBrowserApplicationArrayOutputWithContext(context.Context) BrowserApplicationArrayOutput
}

type BrowserApplicationArray []BrowserApplicationInput

func (BrowserApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrowserApplication)(nil)).Elem()
}

func (i BrowserApplicationArray) ToBrowserApplicationArrayOutput() BrowserApplicationArrayOutput {
	return i.ToBrowserApplicationArrayOutputWithContext(context.Background())
}

func (i BrowserApplicationArray) ToBrowserApplicationArrayOutputWithContext(ctx context.Context) BrowserApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrowserApplicationArrayOutput)
}

// BrowserApplicationMapInput is an input type that accepts BrowserApplicationMap and BrowserApplicationMapOutput values.
// You can construct a concrete instance of `BrowserApplicationMapInput` via:
//
//	BrowserApplicationMap{ "key": BrowserApplicationArgs{...} }
type BrowserApplicationMapInput interface {
	pulumi.Input

	ToBrowserApplicationMapOutput() BrowserApplicationMapOutput
	ToBrowserApplicationMapOutputWithContext(context.Context) BrowserApplicationMapOutput
}

type BrowserApplicationMap map[string]BrowserApplicationInput

func (BrowserApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrowserApplication)(nil)).Elem()
}

func (i BrowserApplicationMap) ToBrowserApplicationMapOutput() BrowserApplicationMapOutput {
	return i.ToBrowserApplicationMapOutputWithContext(context.Background())
}

func (i BrowserApplicationMap) ToBrowserApplicationMapOutputWithContext(ctx context.Context) BrowserApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrowserApplicationMapOutput)
}

type BrowserApplicationOutput struct{ *pulumi.OutputState }

func (BrowserApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BrowserApplication)(nil)).Elem()
}

func (o BrowserApplicationOutput) ToBrowserApplicationOutput() BrowserApplicationOutput {
	return o
}

func (o BrowserApplicationOutput) ToBrowserApplicationOutputWithContext(ctx context.Context) BrowserApplicationOutput {
	return o
}

// The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
func (o BrowserApplicationOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Configure cookies. The default is enabled: true.
func (o BrowserApplicationOutput) CookiesEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.BoolPtrOutput { return v.CookiesEnabled }).(pulumi.BoolPtrOutput)
}

// Configure distributed tracing in browser apps. The default is enabled: true.
func (o BrowserApplicationOutput) DistributedTracingEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.BoolPtrOutput { return v.DistributedTracingEnabled }).(pulumi.BoolPtrOutput)
}

// The GUID of the browser application.
func (o BrowserApplicationOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// JavaScript configuration of the browser application encoded into a string.
func (o BrowserApplicationOutput) JsConfig() pulumi.StringOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.StringOutput { return v.JsConfig }).(pulumi.StringOutput)
}

// Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
func (o BrowserApplicationOutput) LoaderType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.StringPtrOutput { return v.LoaderType }).(pulumi.StringPtrOutput)
}

// The name of the browser application.
func (o BrowserApplicationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BrowserApplication) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type BrowserApplicationArrayOutput struct{ *pulumi.OutputState }

func (BrowserApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrowserApplication)(nil)).Elem()
}

func (o BrowserApplicationArrayOutput) ToBrowserApplicationArrayOutput() BrowserApplicationArrayOutput {
	return o
}

func (o BrowserApplicationArrayOutput) ToBrowserApplicationArrayOutputWithContext(ctx context.Context) BrowserApplicationArrayOutput {
	return o
}

func (o BrowserApplicationArrayOutput) Index(i pulumi.IntInput) BrowserApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BrowserApplication {
		return vs[0].([]*BrowserApplication)[vs[1].(int)]
	}).(BrowserApplicationOutput)
}

type BrowserApplicationMapOutput struct{ *pulumi.OutputState }

func (BrowserApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrowserApplication)(nil)).Elem()
}

func (o BrowserApplicationMapOutput) ToBrowserApplicationMapOutput() BrowserApplicationMapOutput {
	return o
}

func (o BrowserApplicationMapOutput) ToBrowserApplicationMapOutputWithContext(ctx context.Context) BrowserApplicationMapOutput {
	return o
}

func (o BrowserApplicationMapOutput) MapIndex(k pulumi.StringInput) BrowserApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BrowserApplication {
		return vs[0].(map[string]*BrowserApplication)[vs[1].(string)]
	}).(BrowserApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrowserApplicationInput)(nil)).Elem(), &BrowserApplication{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrowserApplicationArrayInput)(nil)).Elem(), BrowserApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrowserApplicationMapInput)(nil)).Elem(), BrowserApplicationMap{})
	pulumi.RegisterOutputType(BrowserApplicationOutput{})
	pulumi.RegisterOutputType(BrowserApplicationArrayOutput{})
	pulumi.RegisterOutputType(BrowserApplicationMapOutput{})
}
