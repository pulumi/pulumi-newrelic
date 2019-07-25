module github.com/pulumi/pulumi-newrelic

go 1.12

require (
	github.com/hashicorp/terraform v0.12.3
	github.com/onsi/ginkgo v1.8.0 // indirect
	github.com/onsi/gomega v1.5.0 // indirect
	github.com/paultyng/go-newrelic v3.1.0+incompatible // indirect
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v0.17.26-0.20190723034217-ed5b8437d126
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190724233644-fdafc00b3f6a
	github.com/sirupsen/logrus v1.4.0 // indirect
	github.com/stretchr/testify v1.3.1-0.20190311161405-34c6fa2dc709
	github.com/terraform-providers/terraform-provider-newrelic v1.5.1
	gopkg.in/resty.v0 v0.4.1 // indirect
)

replace (
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
)
