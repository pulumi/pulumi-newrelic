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

    $ go get github.com/pulumi/pulumi-newrelic/sdk/go/...
    
## Configuration

The following configuration points are available:

- `newrelic:apiKey` - Your New Relic API key. The `NEWRELIC_API_KEY` environment variable can also be used.
- `newrelic:apiUrl` - This argument changes the main REST API URL (default is `https://api.newrelic.com/v2`). If the New
  Relic account is in the EU, the API URL must be set to `https://api.eu.newrelic.com/v2`. The `NEWRELIC_API_URL` environment
  variable can also be used.
- `newrelic:syntheticsApiUrl` - This argument changes the Synthetics API URL (default is `https://synthetics.newrelic.com/synthetics/api/v3`).
  If the New Relic account is in the EU. the API URL must be set to `https://synthetics.eu.newrelic.com/synthetics/api/v3`.
  The `NEWRELIC_SYNTHETICS_API_URL` environment variable can also be used. This URL is used to provision Synthetics monitors
  and monitor scripts only.
- `newrelic:infraApiUrl` - This argument changes the Infrastructure API URL (default is `https://infra-api.newrelic.com/v2`).
  If the New Relic account is in the EU, the Infra API URL must be set to `https://infra-api.eu.newrelic.com/v2`. The
  `NEWRELIC_INFRA_API_URL` environment variable can also be used. This URL is used to provision Infrastructure alert conditions only.
- `newrelic:insecureSkipVerify` - Trust self-signed SSL certificates. If omitted, the `NEWRELIC_API_SKIP_VERIFY` environment
  variable is used.
- `newrelic:insightsAccountId` - Your New Relic Account ID used when inserting Insights events via the `insights.Event` resource.
  Can also use `NEWRELIC_INSIGHTS_ACCOUNT_ID` environment variable.
- `newrelic:insightsInsertKey` - Your Insights insert key used when inserting Insights events via the `insights.Event` resource.
  Can also use `NEWRELIC_INSIGHTS_INSERT_KEY` environment variable.
- `newrelic:insightsInsertUrl` - This argument changes the Insights insert URL (default is `https://insights-collector.newrelic.com/v1/accounts`).
  If the New Relic account is in the EU, the Insights API URL must be set to `https://insights-collector.eu.newrelic.com/v1`. 
  The `NEWRELIC_INSIGHTS_INSERT_URL` environment variable can also be used.
- `newrelic:caCerts` - A path to a PEM-encoded certificate authority used to verify the remote agent's certificate. The
  `NEWRELIC_API_CACERT` environment variable can also be used.

## Reference

For detailed reference documentation, please visit [the API docs][2].


[1]: https://pulumi.io
[2]: https://pulumi.io/reference/pkg/nodejs/@pulumi/newrelic/index.html
