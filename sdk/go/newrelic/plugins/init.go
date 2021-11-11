// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package plugins

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "newrelic:plugins/alertCondition:AlertCondition":
		r = &AlertCondition{}
	case "newrelic:plugins/applicationSettings:ApplicationSettings":
		r = &ApplicationSettings{}
	case "newrelic:plugins/workload:Workload":
		r = &Workload{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := newrelic.PkgVersion()
	if err != nil {
		fmt.Printf("failed to determine package version. defaulting to v1: %v\n", err)
	}
	pulumi.RegisterResourceModule(
		"newrelic",
		"plugins/alertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"plugins/applicationSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"plugins/workload",
		&module{version},
	)
}
