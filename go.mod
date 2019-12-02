module github.com/pulumi/pulumi-newrelic

go 1.12

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/hashicorp/terraform v0.12.16
	github.com/mitchellh/go-ps v0.0.0-20190716172923-621e5597135b // indirect
	github.com/onsi/ginkgo v1.10.1 // indirect
	github.com/onsi/gomega v1.7.0 // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191202134852-87cfb4dc8ae1
	github.com/sirupsen/logrus v1.4.2 // indirect
	github.com/spf13/pflag v1.0.5 // indirect
	github.com/terraform-providers/terraform-provider-newrelic v1.8.0
)

replace (
	github.com/Azure/azure-sdk-for-go => github.com/Azure/azure-sdk-for-go v31.1.0+incompatible
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
