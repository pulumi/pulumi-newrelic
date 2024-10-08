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

<!--This is a comment. Comments are not displayed in the browser-->
## Authentication Requirements

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

<!--This is a comment. Comments are not displayed in the browser-->
### Functions
<table>
<thead>
<tr>
<th>Function</th>
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
<td>`newrelic.KeyTransaction`</td>
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

<!--This is a comment. Comments are not displayed in the browser-->
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as newrelic from "@pulumi/newrelic";

// Read an APM application resource
const foo = newrelic.getEntity({
    name: "Your App Name",
    domain: "APM",
    type: "APPLICATION",
});
// Create an alert policy
const alert = new newrelic.AlertPolicy("alert", {name: "Your Concise Alert Name"});
// Add a condition
const fooNrqlAlertCondition = new newrelic.NrqlAlertCondition("foo", {
    policyId: alert.id,
    type: "static",
    name: "foo",
    description: "Alert when transactions are taking too long",
    runbookUrl: "https://www.example.com",
    enabled: true,
    violationTimeLimitSeconds: 3600,
    nrql: {
        query: foo.then(foo => `SELECT average(duration) FROM Transaction where appName = '${foo.name}'`),
    },
    critical: {
        operator: "above",
        threshold: 5.5,
        thresholdDuration: 300,
        thresholdOccurrences: "ALL",
    },
});
// Add a notification channel
const email = new newrelic.AlertChannel("email", {
    name: "email",
    type: "email",
    config: {
        recipients: "username@example.com",
        includeJsonAttachment: "1",
    },
});
// Link the channel to the policy
const alertEmail = new newrelic.AlertPolicyChannel("alert_email", {
    policyId: alert.id,
    channelIds: [email.id],
});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```python
import pulumi
import pulumi_newrelic as newrelic

# Read an APM application resource
foo = newrelic.get_entity(name="Your App Name",
    domain="APM",
    type="APPLICATION")
# Create an alert policy
alert = newrelic.AlertPolicy("alert", name="Your Concise Alert Name")
# Add a condition
foo_nrql_alert_condition = newrelic.NrqlAlertCondition("foo",
    policy_id=alert.id,
    type="static",
    name="foo",
    description="Alert when transactions are taking too long",
    runbook_url="https://www.example.com",
    enabled=True,
    violation_time_limit_seconds=3600,
    nrql={
        "query": f"SELECT average(duration) FROM Transaction where appName = '{foo.name}'",
    },
    critical={
        "operator": "above",
        "threshold": 5.5,
        "threshold_duration": 300,
        "threshold_occurrences": "ALL",
    })
# Add a notification channel
email = newrelic.AlertChannel("email",
    name="email",
    type="email",
    config={
        "recipients": "username@example.com",
        "include_json_attachment": "1",
    })
# Link the channel to the policy
alert_email = newrelic.AlertPolicyChannel("alert_email",
    policy_id=alert.id,
    channel_ids=[email.id])
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using NewRelic = Pulumi.NewRelic;

return await Deployment.RunAsync(() =>
{
    // Read an APM application resource
    var foo = NewRelic.GetEntity.Invoke(new()
    {
        Name = "Your App Name",
        Domain = "APM",
        Type = "APPLICATION",
    });

    // Create an alert policy
    var alert = new NewRelic.AlertPolicy("alert", new()
    {
        Name = "Your Concise Alert Name",
    });

    // Add a condition
    var fooNrqlAlertCondition = new NewRelic.NrqlAlertCondition("foo", new()
    {
        PolicyId = alert.Id,
        Type = "static",
        Name = "foo",
        Description = "Alert when transactions are taking too long",
        RunbookUrl = "https://www.example.com",
        Enabled = true,
        ViolationTimeLimitSeconds = 3600,
        Nrql = new NewRelic.Inputs.NrqlAlertConditionNrqlArgs
        {
            Query = $"SELECT average(duration) FROM Transaction where appName = '{foo.Apply(getEntityResult => getEntityResult.Name)}'",
        },
        Critical = new NewRelic.Inputs.NrqlAlertConditionCriticalArgs
        {
            Operator = "above",
            Threshold = 5.5,
            ThresholdDuration = 300,
            ThresholdOccurrences = "ALL",
        },
    });

    // Add a notification channel
    var email = new NewRelic.AlertChannel("email", new()
    {
        Name = "email",
        Type = "email",
        Config = new NewRelic.Inputs.AlertChannelConfigArgs
        {
            Recipients = "username@example.com",
            IncludeJsonAttachment = "1",
        },
    });

    // Link the channel to the policy
    var alertEmail = new NewRelic.AlertPolicyChannel("alert_email", new()
    {
        PolicyId = alert.Id,
        ChannelIds = new[]
        {
            email.Id,
        },
    });

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```go
package main

import (
	"fmt"

	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		// Read an APM application resource
		foo, err := newrelic.GetEntity(ctx, &newrelic.GetEntityArgs{
			Name:   "Your App Name",
			Domain: pulumi.StringRef("APM"),
			Type:   pulumi.StringRef("APPLICATION"),
		}, nil)
		if err != nil {
			return err
		}
		// Create an alert policy
		alert, err := newrelic.NewAlertPolicy(ctx, "alert", &newrelic.AlertPolicyArgs{
			Name: pulumi.String("Your Concise Alert Name"),
		})
		if err != nil {
			return err
		}
		// Add a condition
		_, err = newrelic.NewNrqlAlertCondition(ctx, "foo", &newrelic.NrqlAlertConditionArgs{
			PolicyId:                  alert.ID(),
			Type:                      pulumi.String("static"),
			Name:                      pulumi.String("foo"),
			Description:               pulumi.String("Alert when transactions are taking too long"),
			RunbookUrl:                pulumi.String("https://www.example.com"),
			Enabled:                   pulumi.Bool(true),
			ViolationTimeLimitSeconds: pulumi.Int(3600),
			Nrql: &newrelic.NrqlAlertConditionNrqlArgs{
				Query: pulumi.Sprintf("SELECT average(duration) FROM Transaction where appName = '%v'", foo.Name),
			},
			Critical: &newrelic.NrqlAlertConditionCriticalArgs{
				Operator:             pulumi.String("above"),
				Threshold:            pulumi.Float64(5.5),
				ThresholdDuration:    pulumi.Int(300),
				ThresholdOccurrences: pulumi.String("ALL"),
			},
		})
		if err != nil {
			return err
		}
		// Add a notification channel
		email, err := newrelic.NewAlertChannel(ctx, "email", &newrelic.AlertChannelArgs{
			Name: pulumi.String("email"),
			Type: pulumi.String("email"),
			Config: &newrelic.AlertChannelConfigArgs{
				Recipients:            pulumi.String("username@example.com"),
				IncludeJsonAttachment: pulumi.String("1"),
			},
		})
		if err != nil {
			return err
		}
		// Link the channel to the policy
		_, err = newrelic.NewAlertPolicyChannel(ctx, "alert_email", &newrelic.AlertPolicyChannelArgs{
			PolicyId: alert.ID(),
			ChannelIds: pulumi.StringArray{
				email.ID(),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```yaml
resources:
  # Create an alert policy
  alert:
    type: newrelic:AlertPolicy
    properties:
      name: Your Concise Alert Name
  # Add a condition
  fooNrqlAlertCondition:
    type: newrelic:NrqlAlertCondition
    name: foo
    properties:
      policyId: ${alert.id}
      type: static
      name: foo
      description: Alert when transactions are taking too long
      runbookUrl: https://www.example.com
      enabled: true
      violationTimeLimitSeconds: 3600
      nrql:
        query: SELECT average(duration) FROM Transaction where appName = '${foo.name}'
      critical:
        operator: above
        threshold: 5.5
        thresholdDuration: 300
        thresholdOccurrences: ALL
  # Add a notification channel
  email:
    type: newrelic:AlertChannel
    properties:
      name: email
      type: email
      config:
        recipients: username@example.com
        includeJsonAttachment: '1'
  # Link the channel to the policy
  alertEmail:
    type: newrelic:AlertPolicyChannel
    name: alert_email
    properties:
      policyId: ${alert.id}
      channelIds:
        - ${email.id}
variables:
  # Read an APM application resource
  foo:
    fn::invoke:
      Function: newrelic:getEntity
      Arguments:
        name: Your App Name
        domain: APM
        type: APPLICATION
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    newrelic:accountId:
        value: 12345
    newrelic:apiKey:
        value: 12345
    newrelic:region:
        value: US

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.newrelic.NewrelicFunctions;
import com.pulumi.newrelic.inputs.GetEntityArgs;
import com.pulumi.newrelic.AlertPolicy;
import com.pulumi.newrelic.AlertPolicyArgs;
import com.pulumi.newrelic.NrqlAlertCondition;
import com.pulumi.newrelic.NrqlAlertConditionArgs;
import com.pulumi.newrelic.inputs.NrqlAlertConditionNrqlArgs;
import com.pulumi.newrelic.inputs.NrqlAlertConditionCriticalArgs;
import com.pulumi.newrelic.AlertChannel;
import com.pulumi.newrelic.AlertChannelArgs;
import com.pulumi.newrelic.inputs.AlertChannelConfigArgs;
import com.pulumi.newrelic.AlertPolicyChannel;
import com.pulumi.newrelic.AlertPolicyChannelArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        // Read an APM application resource
        final var foo = NewrelicFunctions.getEntity(GetEntityArgs.builder()
            .name("Your App Name")
            .domain("APM")
            .type("APPLICATION")
            .build());

        // Create an alert policy
        var alert = new AlertPolicy("alert", AlertPolicyArgs.builder()
            .name("Your Concise Alert Name")
            .build());

        // Add a condition
        var fooNrqlAlertCondition = new NrqlAlertCondition("fooNrqlAlertCondition", NrqlAlertConditionArgs.builder()
            .policyId(alert.id())
            .type("static")
            .name("foo")
            .description("Alert when transactions are taking too long")
            .runbookUrl("https://www.example.com")
            .enabled(true)
            .violationTimeLimitSeconds(3600)
            .nrql(NrqlAlertConditionNrqlArgs.builder()
                .query(String.format("SELECT average(duration) FROM Transaction where appName = '%s'", foo.applyValue(getEntityResult -> getEntityResult.name())))
                .build())
            .critical(NrqlAlertConditionCriticalArgs.builder()
                .operator("above")
                .threshold(5.5)
                .thresholdDuration(300)
                .thresholdOccurrences("ALL")
                .build())
            .build());

        // Add a notification channel
        var email = new AlertChannel("email", AlertChannelArgs.builder()
            .name("email")
            .type("email")
            .config(AlertChannelConfigArgs.builder()
                .recipients("username@example.com")
                .includeJsonAttachment("1")
                .build())
            .build());

        // Link the channel to the policy
        var alertEmail = new AlertPolicyChannel("alertEmail", AlertPolicyChannelArgs.builder()
            .policyId(alert.id())
            .channelIds(email.id())
            .build());

    }
}
```
{{% /choosable %}}
{{< /chooser >}}
## Support

New Relic has open-sourced this project. This project is provided AS-IS WITHOUT WARRANTY OR SUPPORT, although you can report issues and contribute to the project here on GitHub.