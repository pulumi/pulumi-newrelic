// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `User` data source may be used to search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.
//
// ## Example Usage
//
// The below example illustrates fetching a user's ID (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
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
//			foo, err := newrelic.GetAuthenticationDomain(ctx, &newrelic.GetAuthenticationDomainArgs{
//				Name: "Test Authentication Domain",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.LookupUser(ctx, &newrelic.LookupUserArgs{
//				AuthenticationDomainId: foo.Id,
//				Name:                   pulumi.StringRef("Test User"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.LookupUser(ctx, &newrelic.LookupUserArgs{
//				AuthenticationDomainId: foo.Id,
//				EmailId:                pulumi.StringRef("test_user@random.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserResult
	err := ctx.Invoke("newrelic:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// The ID of the authentication domain the user to be searched for belongs to.
	AuthenticationDomainId string `pulumi:"authenticationDomainId"`
	// The email ID of the user to search for.
	//
	// It should be noted that either `name` or `emailId` must be specified in order to retrieve a matching user.
	//
	// > **NOTE** If the specified `name` matches, or is contained in the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `emailId` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	EmailId *string `pulumi:"emailId"`
	// The name of the user to search for.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	AuthenticationDomainId string `pulumi:"authenticationDomainId"`
	EmailId                string `pulumi:"emailId"`
	// The ID of the matching user fetched.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// The ID of the authentication domain the user to be searched for belongs to.
	AuthenticationDomainId pulumi.StringInput `pulumi:"authenticationDomainId"`
	// The email ID of the user to search for.
	//
	// It should be noted that either `name` or `emailId` must be specified in order to retrieve a matching user.
	//
	// > **NOTE** If the specified `name` matches, or is contained in the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `emailId` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
	//
	// > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `getAuthenticationDomain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
	EmailId pulumi.StringPtrInput `pulumi:"emailId"`
	// The name of the user to search for.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) AuthenticationDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.AuthenticationDomainId }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) EmailId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.EmailId }).(pulumi.StringOutput)
}

// The ID of the matching user fetched.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
