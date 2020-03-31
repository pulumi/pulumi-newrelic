module github.com/pulumi/pulumi-newrelic

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.8.0
	github.com/mattn/go-runewidth v0.0.6 // indirect
	github.com/pkg/errors v0.9.1
	github.com/pulumi/pulumi v1.12.2-0.20200313044354-8111d33438b9
	github.com/pulumi/pulumi-terraform-bridge v1.8.2
	github.com/terraform-providers/terraform-provider-newrelic v1.16.0
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
