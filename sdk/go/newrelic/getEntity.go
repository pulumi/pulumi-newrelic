// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get information about a specific entity in New Relic One that already exists.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-newrelic/sdk/v3/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "APM"
// 		opt1 := "APPLICATION"
// 		app, err := newrelic.GetEntity(ctx, &newrelic.GetEntityArgs{
// 			Name:   "my-app",
// 			Domain: &opt0,
// 			Type:   &opt1,
// 			Tag: newrelic.GetEntityTag{
// 				Key:   "my-tag",
// 				Value: "my-tag-value",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		fooAlertPolicy, err := newrelic.NewAlertPolicy(ctx, "fooAlertPolicy", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewNrqlAlertCondition(ctx, "fooNrqlAlertCondition", &newrelic.NrqlAlertConditionArgs{
// 			PolicyId:           fooAlertPolicy.ID(),
// 			Type:               pulumi.String("static"),
// 			Description:        pulumi.String("Alert when transactions are taking too long"),
// 			RunbookUrl:         pulumi.String("https://www.example.com"),
// 			Enabled:            pulumi.Bool(true),
// 			ValueFunction:      pulumi.String("single_value"),
// 			ViolationTimeLimit: pulumi.String("one_hour"),
// 			Nrql: &newrelic.NrqlAlertConditionNrqlArgs{
// 				Query:            pulumi.String(fmt.Sprintf("%v%v%v", "SELECT average(duration) FROM Transaction where appName = '", app.Name, "'")),
// 				EvaluationOffset: pulumi.Int(3),
// 			},
// 			Critical: &newrelic.NrqlAlertConditionCriticalArgs{
// 				Operator:             pulumi.String("above"),
// 				Threshold:            pulumi.Float64(5.5),
// 				ThresholdDuration:    pulumi.Int(300),
// 				ThresholdOccurrences: pulumi.String("ALL"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetEntity(ctx *pulumi.Context, args *GetEntityArgs, opts ...pulumi.InvokeOption) (*GetEntityResult, error) {
	var rv GetEntityResult
	err := ctx.Invoke("newrelic:index/getEntity:getEntity", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEntity.
type GetEntityArgs struct {
	// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
	Domain *string `pulumi:"domain"`
	// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
	Name string        `pulumi:"name"`
	Tag  *GetEntityTag `pulumi:"tag"`
	// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getEntity.
type GetEntityResult struct {
	// The New Relic account ID associated with this entity.
	AccountId int `pulumi:"accountId"`
	// The domain-specific application ID of the entity. Only returned for APM and Browser applications.
	ApplicationId int    `pulumi:"applicationId"`
	Domain        string `pulumi:"domain"`
	// The unique GUID of the entity.
	Guid string `pulumi:"guid"`
	// The provider-assigned unique ID for this managed resource.
	Id   string        `pulumi:"id"`
	Name string        `pulumi:"name"`
	Tag  *GetEntityTag `pulumi:"tag"`
	Type string        `pulumi:"type"`
}
