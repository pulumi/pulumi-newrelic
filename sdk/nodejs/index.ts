// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./alertChannel";
export * from "./alertCondition";
export * from "./alertMutingRule";
export * from "./alertPolicy";
export * from "./alertPolicyChannel";
export * from "./apiAccessKey";
export * from "./dashboard";
export * from "./entityTags";
export * from "./eventsToMetricsRule";
export * from "./getAccount";
export * from "./getAlertChannel";
export * from "./getAlertPolicy";
export * from "./getApplication";
export * from "./getCloudAccount";
export * from "./getEntity";
export * from "./getKeyTransaction";
export * from "./infraAlertCondition";
export * from "./notificationChannel";
export * from "./notificationDestination";
export * from "./nrqlAlertCondition";
export * from "./nrqlDropRule";
export * from "./oneDashboard";
export * from "./oneDashboardRaw";
export * from "./provider";
export * from "./serviceLevel";

// Export sub-modules:
import * as cloud from "./cloud";
import * as config from "./config";
import * as insights from "./insights";
import * as plugins from "./plugins";
import * as synthetics from "./synthetics";
import * as types from "./types";

export {
    cloud,
    config,
    insights,
    plugins,
    synthetics,
    types,
};

// Import resources to register:
import { AlertChannel } from "./alertChannel";
import { AlertCondition } from "./alertCondition";
import { AlertMutingRule } from "./alertMutingRule";
import { AlertPolicy } from "./alertPolicy";
import { AlertPolicyChannel } from "./alertPolicyChannel";
import { ApiAccessKey } from "./apiAccessKey";
import { Dashboard } from "./dashboard";
import { EntityTags } from "./entityTags";
import { EventsToMetricsRule } from "./eventsToMetricsRule";
import { InfraAlertCondition } from "./infraAlertCondition";
import { NotificationChannel } from "./notificationChannel";
import { NotificationDestination } from "./notificationDestination";
import { NrqlAlertCondition } from "./nrqlAlertCondition";
import { NrqlDropRule } from "./nrqlDropRule";
import { OneDashboard } from "./oneDashboard";
import { OneDashboardRaw } from "./oneDashboardRaw";
import { ServiceLevel } from "./serviceLevel";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "newrelic:index/alertChannel:AlertChannel":
                return new AlertChannel(name, <any>undefined, { urn })
            case "newrelic:index/alertCondition:AlertCondition":
                return new AlertCondition(name, <any>undefined, { urn })
            case "newrelic:index/alertMutingRule:AlertMutingRule":
                return new AlertMutingRule(name, <any>undefined, { urn })
            case "newrelic:index/alertPolicy:AlertPolicy":
                return new AlertPolicy(name, <any>undefined, { urn })
            case "newrelic:index/alertPolicyChannel:AlertPolicyChannel":
                return new AlertPolicyChannel(name, <any>undefined, { urn })
            case "newrelic:index/apiAccessKey:ApiAccessKey":
                return new ApiAccessKey(name, <any>undefined, { urn })
            case "newrelic:index/dashboard:Dashboard":
                return new Dashboard(name, <any>undefined, { urn })
            case "newrelic:index/entityTags:EntityTags":
                return new EntityTags(name, <any>undefined, { urn })
            case "newrelic:index/eventsToMetricsRule:EventsToMetricsRule":
                return new EventsToMetricsRule(name, <any>undefined, { urn })
            case "newrelic:index/infraAlertCondition:InfraAlertCondition":
                return new InfraAlertCondition(name, <any>undefined, { urn })
            case "newrelic:index/notificationChannel:NotificationChannel":
                return new NotificationChannel(name, <any>undefined, { urn })
            case "newrelic:index/notificationDestination:NotificationDestination":
                return new NotificationDestination(name, <any>undefined, { urn })
            case "newrelic:index/nrqlAlertCondition:NrqlAlertCondition":
                return new NrqlAlertCondition(name, <any>undefined, { urn })
            case "newrelic:index/nrqlDropRule:NrqlDropRule":
                return new NrqlDropRule(name, <any>undefined, { urn })
            case "newrelic:index/oneDashboard:OneDashboard":
                return new OneDashboard(name, <any>undefined, { urn })
            case "newrelic:index/oneDashboardRaw:OneDashboardRaw":
                return new OneDashboardRaw(name, <any>undefined, { urn })
            case "newrelic:index/serviceLevel:ServiceLevel":
                return new ServiceLevel(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("newrelic", "index/alertChannel", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/alertCondition", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/alertMutingRule", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/alertPolicy", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/alertPolicyChannel", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/apiAccessKey", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/dashboard", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/entityTags", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/eventsToMetricsRule", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/infraAlertCondition", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/notificationChannel", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/notificationDestination", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/nrqlAlertCondition", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/nrqlDropRule", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/oneDashboard", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/oneDashboardRaw", _module)
pulumi.runtime.registerResourceModule("newrelic", "index/serviceLevel", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("newrelic", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:newrelic") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
