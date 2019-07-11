CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v1.5.1 of the NewRelic Terraform Provide

---

## 0.18.4 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.18.3 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.18.2 (2019-06-21)
* Add TypeScript type guards for each resource class ([7ace3e9b5f2d](https://github.com/pulumi/pulumi-terraform/commit/7ace3e9b5f2d))
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.

## 0.18.1 (2019-05-29)
* Fix an issue where configuration provided via the environment may not be honoured

## 0.18.0 (2019-04-10)
* Initial release of the New Relic provider, based on revision 3651ee8 of the New Relic Terraform provider

