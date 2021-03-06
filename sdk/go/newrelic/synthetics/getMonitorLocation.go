// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific Synthetics monitor location in New Relic that already exists.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/synthetics"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		bar, err := synthetics.GetMonitorLocation(ctx, &synthetics.GetMonitorLocationArgs{
// 			Label: "My private location",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = synthetics.NewMonitor(ctx, "foo", &synthetics.MonitorArgs{
// 			Type:      pulumi.String("SIMPLE"),
// 			Frequency: pulumi.Int(5),
// 			Status:    pulumi.String("ENABLED"),
// 			Locations: pulumi.StringArray{
// 				pulumi.String(bar.Name),
// 			},
// 			Uri:              pulumi.String("https://example.com"),
// 			ValidationString: pulumi.String("add example validation check here"),
// 			VerifySsl:        pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetMonitorLocation(ctx *pulumi.Context, args *GetMonitorLocationArgs, opts ...pulumi.InvokeOption) (*GetMonitorLocationResult, error) {
	var rv GetMonitorLocationResult
	err := ctx.Invoke("newrelic:synthetics/getMonitorLocation:getMonitorLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMonitorLocation.
type GetMonitorLocationArgs struct {
	// The label of the Synthetics monitor location.
	Label string `pulumi:"label"`
}

// A collection of values returned by getMonitorLocation.
type GetMonitorLocationResult struct {
	// A description of the Synthetics monitor location.
	Description string `pulumi:"description"`
	// Represents if high security mode is enabled for the location. A value of true means that high security mode is enabled, and a value of false means it is disabled.
	HighSecurityMode bool `pulumi:"highSecurityMode"`
	// The provider-assigned unique ID for this managed resource.
	Id    string `pulumi:"id"`
	Label string `pulumi:"label"`
	// The name of the Synthetics monitor location.
	Name string `pulumi:"name"`
	// Represents if this location is a private location. A value of true means that the location is private, and a value of false means it is public.
	Private bool `pulumi:"private"`
}
