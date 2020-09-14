module github.com/pulumi/pulumi-newrelic/provider/v3

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/newrelic/terraform-provider-newrelic/v2 v2.2.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.8.0
	github.com/pulumi/pulumi/sdk/v2 v2.10.0
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/newrelic/terraform-provider-newrelic/v2 => github.com/pulumi/terraform-provider-newrelic/v2 v2.1.2-0.20200914113949-e79d3b67ddab
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
