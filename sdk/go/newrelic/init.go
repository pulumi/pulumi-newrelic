// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"fmt"

	"github.com/blang/semver"
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
	case "newrelic:index/accountManagement:AccountManagement":
		r = &AccountManagement{}
	case "newrelic:index/alertChannel:AlertChannel":
		r = &AlertChannel{}
	case "newrelic:index/alertCondition:AlertCondition":
		r = &AlertCondition{}
	case "newrelic:index/alertMutingRule:AlertMutingRule":
		r = &AlertMutingRule{}
	case "newrelic:index/alertPolicy:AlertPolicy":
		r = &AlertPolicy{}
	case "newrelic:index/alertPolicyChannel:AlertPolicyChannel":
		r = &AlertPolicyChannel{}
	case "newrelic:index/apiAccessKey:ApiAccessKey":
		r = &ApiAccessKey{}
	case "newrelic:index/browserApplication:BrowserApplication":
		r = &BrowserApplication{}
	case "newrelic:index/dataPartitionRule:DataPartitionRule":
		r = &DataPartitionRule{}
	case "newrelic:index/entityTags:EntityTags":
		r = &EntityTags{}
	case "newrelic:index/eventsToMetricsRule:EventsToMetricsRule":
		r = &EventsToMetricsRule{}
	case "newrelic:index/infraAlertCondition:InfraAlertCondition":
		r = &InfraAlertCondition{}
	case "newrelic:index/logParsingRule:LogParsingRule":
		r = &LogParsingRule{}
	case "newrelic:index/notificationChannel:NotificationChannel":
		r = &NotificationChannel{}
	case "newrelic:index/notificationDestination:NotificationDestination":
		r = &NotificationDestination{}
	case "newrelic:index/nrqlAlertCondition:NrqlAlertCondition":
		r = &NrqlAlertCondition{}
	case "newrelic:index/nrqlDropRule:NrqlDropRule":
		r = &NrqlDropRule{}
	case "newrelic:index/obfuscationExpression:ObfuscationExpression":
		r = &ObfuscationExpression{}
	case "newrelic:index/obfuscationRule:ObfuscationRule":
		r = &ObfuscationRule{}
	case "newrelic:index/oneDashboard:OneDashboard":
		r = &OneDashboard{}
	case "newrelic:index/oneDashboardJson:OneDashboardJson":
		r = &OneDashboardJson{}
	case "newrelic:index/oneDashboardRaw:OneDashboardRaw":
		r = &OneDashboardRaw{}
	case "newrelic:index/serviceLevel:ServiceLevel":
		r = &ServiceLevel{}
	case "newrelic:index/workflow:Workflow":
		r = &Workflow{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:newrelic" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/accountManagement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/alertChannel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/alertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/alertMutingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/alertPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/alertPolicyChannel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/apiAccessKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/browserApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/dataPartitionRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/entityTags",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/eventsToMetricsRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/infraAlertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/logParsingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/notificationChannel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/notificationDestination",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/nrqlAlertCondition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/nrqlDropRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/obfuscationExpression",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/obfuscationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/oneDashboard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/oneDashboardJson",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/oneDashboardRaw",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/serviceLevel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"newrelic",
		"index/workflow",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"newrelic",
		&pkg{version},
	)
}
