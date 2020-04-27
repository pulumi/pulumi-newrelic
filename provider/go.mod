module github.com/pulumi/pulumi-newrelic/provider/v2

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.8.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.1.0
	github.com/pulumi/pulumi/sdk/v2 v2.0.1-0.20200424001829-090f390d7b1a
	github.com/terraform-providers/terraform-provider-newrelic v1.16.0
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
