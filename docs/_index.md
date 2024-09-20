---
title: Newrelic Provider
meta_desc: Provides an overview on how to configure the Pulumi Newrelic provider.
layout: package
---
## Installation

The newrelic provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/newrelic`](https://www.npmjs.com/package/@pulumi/newrelic)
* Python: [`pulumi-newrelic`](https://pypi.org/project/pulumi-newrelic/)
* Go: [`github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic`](https://github.com/pulumi/pulumi-newrelic)
* .NET: [`Pulumi.Newrelic`](https://www.nuget.org/packages/Pulumi.Newrelic)
* Java: [`com.pulumi/newrelic`](https://central.sonatype.com/artifact/com.pulumi/newrelic)
## Overview

[New Relic](https://newrelic.com/) offers tools that help you fix problems
quickly, maintain complex systems, improve your code, and accelerate your
digital transformation.

Use the navigation to the left to read about the available resources.
## Configuration Reference

The following configuration inputs are supported.
<table>
<thead>
<tr>
<th>Argument</th>
<th>Required?</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>`accountId`</td>
<td>Required</td>
<td>Your New Relic account ID. The `NEW_RELIC_ACCOUNT_ID` environment variable can also be used.</td>
</tr>
<tr>
<td>`apiKey`</td>
<td>Required</td>
<td>Your New Relic Personal API key (usually prefixed with `NRAK`). The `NEW_RELIC_API_KEY` environment variable can also be used.</td>
</tr>
<tr>
<td>`region`</td>
<td>Optional</td>
<td>The region for the data center for which your New Relic account is configured. The `NEW_RELIC_REGION` environment variable can also be used. Valid values are `US` or `EU`. Default value is `US`.</td>
</tr>
<tr>
<td>`insecureSkipVerify`</td>
<td>Optional</td>
<td>Trust self-signed SSL certificates. If omitted, the `NEW_RELIC_API_SKIP_VERIFY` environment variable is used.</td>
</tr>
<tr>
<td>`insightsInsertKey`</td>
<td>Optional</td>
<td>Your Insights insert key used when inserting Insights events via the `newrelic.insights.Event` resource. Can also use `NEW_RELIC_INSIGHTS_INSERT_KEY` environment variable.</td>
</tr>
<tr>
<td>`cacertFile`</td>
<td>Optional</td>
<td>A path to a PEM-encoded certificate authority used to verify the remote agent's certificate. The `NEW_RELIC_API_CACERT` environment variable can also be used.</td>
</tr>
</tbody>
</table>
##

This provider is in the midst of migrating away from our older REST based APIs
to a newer GraphQL based API that we lovingly call NerdGraph. During this
transition, the provider will be using different endpoints depending on which
resource is in use. Below is a table that reflects the current state of the
resources compared to which endpoint is in use.
### Resources
<table>
<thead>
<tr>
<th>Resource</th>
<th>Endpoint</th>
<th>Authentication</th>
</tr>
</thead>
<tbody>
<tr>
<td>`newrelic.AccountManagement`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertChannel`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertCondition`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertMutingRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertPolicy`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertPolicyChannel`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.ApiAccessKey`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.plugins.ApplicationSettings`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.BrowserApplication`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AwsGovcloudIntegrations`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AwsGovcloudLinkAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AwsIntegrations`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AwsLinkAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AzureIntegrations`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.AzureLinkAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.GcpIntegrations`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.cloud.GcpLinkAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.DataPartitionRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.EntityTags`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.EventsToMetricsRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.InfraAlertCondition`</td>
<td>Infrastructure REST API</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.insights.Event`</td>
<td>Insights API</td>
<td>`insightsInsertKey`</td>
</tr>
<tr>
<td>`newrelic.LogParsingRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.NotificationChannel`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.NotificationDestination`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.NrqlAlertCondition`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.NrqlDropRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.ObfuscationExpression`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.ObfuscationRule`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.OneDashboard`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.OneDashboardJson`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.OneDashboardRaw`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.ServiceLevel`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.AlertCondition`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.BrokenLinksMonitor`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.CertCheckMonitor`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.Monitor`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.MultiLocationAlertCondition`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.PrivateLocation`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.ScriptMonitor`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.SecureCredential`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.StepMonitor`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.Workflow`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.plugins.Workload`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
</tbody>
</table>
### Data Sources
<table>
<thead>
<tr>
<th>Data Source</th>
<th>Endpoint</th>
<th>Authentication</th>
</tr>
</thead>
<tbody>
<tr>
<td>`newrelic.getAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertChannel`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.AlertPolicy`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.getApplication`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.getCloudAccount`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.getEntity`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.getKeyTransaction`</td>
<td>RESTv2</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.NotificationDestination`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.ObfuscationExpression`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.PrivateLocation`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.synthetics.SecureCredential`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
<tr>
<td>`newrelic.getTestGrokPattern`</td>
<td>NerdGraph</td>
<td>`apiKey`</td>
</tr>
</tbody>
</table>
##

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}

{{% /choosable %}}
{{% choosable language python %}}

{{% /choosable %}}
{{% choosable language csharp %}}

{{% /choosable %}}
{{% choosable language go %}}

{{% /choosable %}}
{{% choosable language yaml %}}

{{% /choosable %}}
{{% choosable language java %}}

{{% /choosable %}}
{{< /chooser >}}
## Support

New Relic has open-sourced this project. This project is provided AS-IS WITHOUT WARRANTY OR SUPPORT, although you can report issues and contribute to the project here on GitHub.