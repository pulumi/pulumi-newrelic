// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.
//
// Note that the secure credential's value is not returned as an attribute for security reasons.
func LookupSecureCredential(ctx *pulumi.Context, args *LookupSecureCredentialArgs, opts ...pulumi.InvokeOption) (*LookupSecureCredentialResult, error) {
	var rv LookupSecureCredentialResult
	err := ctx.Invoke("newrelic:synthetics/getSecureCredential:getSecureCredential", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecureCredential.
type LookupSecureCredentialArgs struct {
	// The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
	Key string `pulumi:"key"`
}

// A collection of values returned by getSecureCredential.
type LookupSecureCredentialResult struct {
	// The time the secure credential was created.
	CreatedAt string `pulumi:"createdAt"`
	// The secure credential's description.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id  string `pulumi:"id"`
	Key string `pulumi:"key"`
	// The time the secure credential was last updated.
	LastUpdated string `pulumi:"lastUpdated"`
}
