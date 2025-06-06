// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AwsGovcloudIntegrationsArgs, AwsGovcloudIntegrationsState } from "./awsGovcloudIntegrations";
export type AwsGovcloudIntegrations = import("./awsGovcloudIntegrations").AwsGovcloudIntegrations;
export const AwsGovcloudIntegrations: typeof import("./awsGovcloudIntegrations").AwsGovcloudIntegrations = null as any;
utilities.lazyLoad(exports, ["AwsGovcloudIntegrations"], () => require("./awsGovcloudIntegrations"));

export { AwsGovcloudLinkAccountArgs, AwsGovcloudLinkAccountState } from "./awsGovcloudLinkAccount";
export type AwsGovcloudLinkAccount = import("./awsGovcloudLinkAccount").AwsGovcloudLinkAccount;
export const AwsGovcloudLinkAccount: typeof import("./awsGovcloudLinkAccount").AwsGovcloudLinkAccount = null as any;
utilities.lazyLoad(exports, ["AwsGovcloudLinkAccount"], () => require("./awsGovcloudLinkAccount"));

export { AwsIntegrationsArgs, AwsIntegrationsState } from "./awsIntegrations";
export type AwsIntegrations = import("./awsIntegrations").AwsIntegrations;
export const AwsIntegrations: typeof import("./awsIntegrations").AwsIntegrations = null as any;
utilities.lazyLoad(exports, ["AwsIntegrations"], () => require("./awsIntegrations"));

export { AwsLinkAccountArgs, AwsLinkAccountState } from "./awsLinkAccount";
export type AwsLinkAccount = import("./awsLinkAccount").AwsLinkAccount;
export const AwsLinkAccount: typeof import("./awsLinkAccount").AwsLinkAccount = null as any;
utilities.lazyLoad(exports, ["AwsLinkAccount"], () => require("./awsLinkAccount"));

export { AzureIntegrationsArgs, AzureIntegrationsState } from "./azureIntegrations";
export type AzureIntegrations = import("./azureIntegrations").AzureIntegrations;
export const AzureIntegrations: typeof import("./azureIntegrations").AzureIntegrations = null as any;
utilities.lazyLoad(exports, ["AzureIntegrations"], () => require("./azureIntegrations"));

export { AzureLinkAccountArgs, AzureLinkAccountState } from "./azureLinkAccount";
export type AzureLinkAccount = import("./azureLinkAccount").AzureLinkAccount;
export const AzureLinkAccount: typeof import("./azureLinkAccount").AzureLinkAccount = null as any;
utilities.lazyLoad(exports, ["AzureLinkAccount"], () => require("./azureLinkAccount"));

export { GcpIntegrationsArgs, GcpIntegrationsState } from "./gcpIntegrations";
export type GcpIntegrations = import("./gcpIntegrations").GcpIntegrations;
export const GcpIntegrations: typeof import("./gcpIntegrations").GcpIntegrations = null as any;
utilities.lazyLoad(exports, ["GcpIntegrations"], () => require("./gcpIntegrations"));

export { GcpLinkAccountArgs, GcpLinkAccountState } from "./gcpLinkAccount";
export type GcpLinkAccount = import("./gcpLinkAccount").GcpLinkAccount;
export const GcpLinkAccount: typeof import("./gcpLinkAccount").GcpLinkAccount = null as any;
utilities.lazyLoad(exports, ["GcpLinkAccount"], () => require("./gcpLinkAccount"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations":
                return new AwsGovcloudIntegrations(name, <any>undefined, { urn })
            case "newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount":
                return new AwsGovcloudLinkAccount(name, <any>undefined, { urn })
            case "newrelic:cloud/awsIntegrations:AwsIntegrations":
                return new AwsIntegrations(name, <any>undefined, { urn })
            case "newrelic:cloud/awsLinkAccount:AwsLinkAccount":
                return new AwsLinkAccount(name, <any>undefined, { urn })
            case "newrelic:cloud/azureIntegrations:AzureIntegrations":
                return new AzureIntegrations(name, <any>undefined, { urn })
            case "newrelic:cloud/azureLinkAccount:AzureLinkAccount":
                return new AzureLinkAccount(name, <any>undefined, { urn })
            case "newrelic:cloud/gcpIntegrations:GcpIntegrations":
                return new GcpIntegrations(name, <any>undefined, { urn })
            case "newrelic:cloud/gcpLinkAccount:GcpLinkAccount":
                return new GcpLinkAccount(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("newrelic", "cloud/awsGovcloudIntegrations", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/awsGovcloudLinkAccount", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/awsIntegrations", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/awsLinkAccount", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/azureIntegrations", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/azureLinkAccount", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/gcpIntegrations", _module)
pulumi.runtime.registerResourceModule("newrelic", "cloud/gcpLinkAccount", _module)
