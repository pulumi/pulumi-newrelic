[![Actions Status](https://github.com/pulumi/pulumi-newrelic/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-newrelic/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fnewrelic.svg)](https://www.npmjs.com/package/@pulumi/newrelic)
[![Python version](https://badge.fury.io/py/pulumi-newrelic.svg)](https://pypi.org/project/pulumi-newrelic)
[![NuGet version](https://badge.fury.io/nu/pulumi.newrelic.svg)](https://badge.fury.io/nu/pulumi.newrelic)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-newrelic/sdk/v4/go)](https://pkg.go.dev/github.com/pulumi/pulumi-newrelic/sdk/v4/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-newrelic/blob/master/LICENSE)

# New Relic Provider

The New Relic resource provider for Pulumi lets you use New Relic resources in your cloud programs.
To use this package, please [install the Pulumi CLI first][1].

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/newrelic

or `yarn`:

    $ yarn add @pulumi/newrelic

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_newrelic

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-newrelic/sdk/v4
    

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Newrelic    
    
## Configuration

The following configuration points are available:

- `newrelic:apiKey` - Your New Relic API key. The `NEW_RELIC__API_KEY` environment variable can also be used.
- `newrelic:adminApiKey` - Your New Relic Admin API key. The `NEW_RELIC_ADMIN_API_KEY` environment variable can also be used.
- `newrelic:region` - The region for the data center for which your New Relic account is configured. The New Relic region
  can also be set via the environment variable `NEW_RELIC_REGION`. Valid values are `US` or `EU`. Only one region per 
  provider block can be configured. If you have accounts in both regions, you must instantiate two providers - 
  one for US and one for EU
- `newrelic:insecureSkipVerify` - Trust self-signed SSL certificates. If omitted, the `NEW_RELIC__API_SKIP_VERIFY` environment
  variable is used.
- `newrelic:insightsInsertKey` - Your Insights insert key used when inserting Insights events via the `insights.Event` resource.
  Can also use `NEW_RELIC__INSIGHTS_INSERT_KEY` environment variable.
- `newrelic:insightsInsertUrl` - This argument changes the Insights insert URL (default is `https://insights-collector.newrelic.com/v1/accounts`).
  If the New Relic account is in the EU, the Insights API URL must be set to `https://insights-collector.eu.newrelic.com/v1`. 
- `newrelic:caCerts` - A path to a PEM-encoded certificate authority used to verify the remote agent's certificate. The
  `NEW_RELIC__API_CACERT` environment variable can also be used.

## Reference

For further information, please visit [the NewRelic provider docs](https://www.pulumi.com/docs/intro/cloud-providers/newrelic) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/newrelic).


[1]: https://www.pulumi.com/docs
