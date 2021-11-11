module github.com/pulumi/pulumi-newrelic/provider/v4

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2 // indirect
	github.com/newrelic/terraform-provider-newrelic/v2 v2.2.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/newrelic/terraform-provider-newrelic/v2 => github.com/pulumi/terraform-provider-newrelic/v2 v2.19.1-0.20211029214250-d7c2ea5facf2
)
