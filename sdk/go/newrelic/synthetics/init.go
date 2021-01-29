// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-newrelic/sdk/v3/go/newrelic"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "newrelic:synthetics/alertCondition:AlertCondition":
		r, err = NewAlertCondition(ctx, name, nil, pulumi.URN_(urn))
	case "newrelic:synthetics/monitor:Monitor":
		r, err = NewMonitor(ctx, name, nil, pulumi.URN_(urn))
	case "newrelic:synthetics/monitorScript:MonitorScript":
		r, err = NewMonitorScript(ctx, name, nil, pulumi.URN_(urn))
	case "newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition":
		r, err = NewMultiLocationAlertCondition(ctx, name, nil, pulumi.URN_(urn))
	case "newrelic:synthetics/secureCredential:SecureCredential":
		r, err = NewSecureCredential(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

func init() {
	version, err := newrelic.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"newrelic",
		"synthetics/alertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"synthetics/monitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"synthetics/monitorScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"synthetics/multiLocationAlertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"synthetics/secureCredential",
		&module{version},
	)
}