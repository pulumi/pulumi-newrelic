module github.com/pulumi/pulumi-newrelic/provider/v3

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.10.0
	github.com/newrelic/terraform-provider-newrelic v1.16.1-0.20200623201505-e204b3c090f0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.5.2
	github.com/pulumi/pulumi/sdk/v2 v2.5.1-0.20200630091945-bb358c4d2173
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/newrelic/terraform-provider-newrelic => github.com/pulumi/terraform-provider-newrelic v1.16.1-0.20200629093858-0ec8cd391aaf
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
