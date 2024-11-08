---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
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

|        Argument        | Required? |                                                                                            Description                                                                                             |
|------------------------|-----------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `accountId`           | Required  | Your New Relic account ID. The `NEW_RELIC_ACCOUNT_ID` environment variable can also be used.                                                                                                       |
| `apiKey`              | Required  | Your New Relic Personal API key (usually prefixed with `NRAK`). The `NEW_RELIC_API_KEY` environment variable can also be used.                                                                     |
| `region`               | Optional  | The region for the data center for which your New Relic account is configured. The `NEW_RELIC_REGION` environment variable can also be used. Valid values are `US` or `EU`. Default value is `US`. |
| `insecureSkipVerify` | Optional  | Trust self-signed SSL certificates. If omitted, the `NEW_RELIC_API_SKIP_VERIFY` environment variable is used.                                                                                      |
| `insightsInsertKey`  | Optional  | Your Insights insert key used when inserting Insights events via the `newrelic.insights.Event` resource. Can also use `NEW_RELIC_INSIGHTS_INSERT_KEY` environment variable.                        |
| `cacertFile`          | Optional  | A path to a PEM-encoded certificate authority used to verify the remote agent's certificate. The `NEW_RELIC_API_CACERT` environment variable can also be used.                                     |