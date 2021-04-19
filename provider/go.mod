module github.com/pulumi/pulumi-newrelic/provider/v4

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.16.0
	github.com/newrelic/terraform-provider-newrelic/v2 v2.2.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
	github.com/vmihailenco/msgpack v4.0.2+incompatible // indirect
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/newrelic/terraform-provider-newrelic/v2 => github.com/pulumi/terraform-provider-newrelic/v2 v2.19.1-0.20210418181834-24c01db822fd
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
