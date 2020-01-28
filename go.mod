module github.com/pulumi/pulumi-newrelic

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.5.0
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.1
	github.com/pulumi/pulumi-terraform-bridge v1.5.2
	github.com/terraform-providers/terraform-provider-newrelic v1.12.2
	github.com/ulikunitz/xz v0.5.6 // indirect
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
