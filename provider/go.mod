module github.com/pulumi/pulumi-newrelic/provider/v3

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/newrelic/terraform-provider-newrelic/v2 v2.2.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.1-0.20201020163502-64cff1e50894
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/newrelic/terraform-provider-newrelic/v2 => github.com/pulumi/terraform-provider-newrelic/v2 v2.1.2-0.20201028131337-0a7569dcb469
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
