# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CertCheckMonitorArgs', 'CertCheckMonitor']

@pulumi.input_type
class CertCheckMonitorArgs:
    def __init__(__self__, *,
                 certificate_expiration: pulumi.Input[int],
                 domain: pulumi.Input[str],
                 period: pulumi.Input[str],
                 status: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 locations_privates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]] = None):
        """
        The set of arguments for constructing a CertCheckMonitor resource.
        :param pulumi.Input[int] certificate_expiration: The desired number of remaining days until the certificate expires to trigger a monitor failure.
        :param pulumi.Input[str] domain: The domain of the host that will have its certificate checked.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_privates: The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        pulumi.set(__self__, "certificate_expiration", certificate_expiration)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "period", period)
        pulumi.set(__self__, "status", status)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if locations_privates is not None:
            pulumi.set(__self__, "locations_privates", locations_privates)
        if locations_publics is not None:
            pulumi.set(__self__, "locations_publics", locations_publics)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="certificateExpiration")
    def certificate_expiration(self) -> pulumi.Input[int]:
        """
        The desired number of remaining days until the certificate expires to trigger a monitor failure.
        """
        return pulumi.get(self, "certificate_expiration")

    @certificate_expiration.setter
    def certificate_expiration(self, value: pulumi.Input[int]):
        pulumi.set(self, "certificate_expiration", value)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The domain of the host that will have its certificate checked.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def period(self) -> pulumi.Input[str]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: pulumi.Input[str]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="locationsPrivates")
    def locations_privates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        """
        return pulumi.get(self, "locations_privates")

    @locations_privates.setter
    def locations_privates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_privates", value)

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @locations_publics.setter
    def locations_publics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_publics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _CertCheckMonitorState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 certificate_expiration: Optional[pulumi.Input[int]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 locations_privates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering CertCheckMonitor resources.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[int] certificate_expiration: The desired number of remaining days until the certificate expires to trigger a monitor failure.
        :param pulumi.Input[str] domain: The domain of the host that will have its certificate checked.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_privates: The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        :param pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if certificate_expiration is not None:
            pulumi.set(__self__, "certificate_expiration", certificate_expiration)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if locations_privates is not None:
            pulumi.set(__self__, "locations_privates", locations_privates)
        if locations_publics is not None:
            pulumi.set(__self__, "locations_publics", locations_publics)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="certificateExpiration")
    def certificate_expiration(self) -> Optional[pulumi.Input[int]]:
        """
        The desired number of remaining days until the certificate expires to trigger a monitor failure.
        """
        return pulumi.get(self, "certificate_expiration")

    @certificate_expiration.setter
    def certificate_expiration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "certificate_expiration", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain of the host that will have its certificate checked.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="locationsPrivates")
    def locations_privates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        """
        return pulumi.get(self, "locations_privates")

    @locations_privates.setter
    def locations_privates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_privates", value)

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @locations_publics.setter
    def locations_publics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_publics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[str]]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertCheckMonitorTagArgs']]]]):
        pulumi.set(self, "tags", value)


class CertCheckMonitor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 certificate_expiration: Optional[pulumi.Input[int]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 locations_privates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertCheckMonitorTagArgs']]]]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        cert_check_monitor = newrelic.synthetics.CertCheckMonitor("cert-check-monitor",
            certificate_expiration=10,
            domain="www.example.com",
            locations_publics=["AP_SOUTH_1"],
            period="EVERY_6_HOURS",
            status="ENABLED",
            tags=[newrelic.synthetics.CertCheckMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```
        See additional examples.
        ## Additional Examples

        ### Create a monitor with a private location

        The below example shows how you can define a private location and attach it to a monitor.

        > **NOTE:** It can take up to 10 minutes for a private location to become available.

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        location = newrelic.synthetics.PrivateLocation("location",
            description="Test Description",
            verified_script_execution=False)
        monitor = newrelic.synthetics.CertCheckMonitor("monitor",
            domain="https://www.one.example.com",
            locations_privates=[location.id],
            period="EVERY_6_HOURS",
            status="ENABLED",
            tags=[newrelic.synthetics.CertCheckMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```

        ## Import

        Synthetics certificate check monitor scripts can be imported using the `guid`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor <guid>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[int] certificate_expiration: The desired number of remaining days until the certificate expires to trigger a monitor failure.
        :param pulumi.Input[str] domain: The domain of the host that will have its certificate checked.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_privates: The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertCheckMonitorTagArgs']]]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertCheckMonitorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        cert_check_monitor = newrelic.synthetics.CertCheckMonitor("cert-check-monitor",
            certificate_expiration=10,
            domain="www.example.com",
            locations_publics=["AP_SOUTH_1"],
            period="EVERY_6_HOURS",
            status="ENABLED",
            tags=[newrelic.synthetics.CertCheckMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```
        See additional examples.
        ## Additional Examples

        ### Create a monitor with a private location

        The below example shows how you can define a private location and attach it to a monitor.

        > **NOTE:** It can take up to 10 minutes for a private location to become available.

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        location = newrelic.synthetics.PrivateLocation("location",
            description="Test Description",
            verified_script_execution=False)
        monitor = newrelic.synthetics.CertCheckMonitor("monitor",
            domain="https://www.one.example.com",
            locations_privates=[location.id],
            period="EVERY_6_HOURS",
            status="ENABLED",
            tags=[newrelic.synthetics.CertCheckMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```

        ## Import

        Synthetics certificate check monitor scripts can be imported using the `guid`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor <guid>
        ```

        :param str resource_name: The name of the resource.
        :param CertCheckMonitorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertCheckMonitorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 certificate_expiration: Optional[pulumi.Input[int]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 locations_privates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertCheckMonitorTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertCheckMonitorArgs.__new__(CertCheckMonitorArgs)

            __props__.__dict__["account_id"] = account_id
            if certificate_expiration is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_expiration'")
            __props__.__dict__["certificate_expiration"] = certificate_expiration
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["locations_privates"] = locations_privates
            __props__.__dict__["locations_publics"] = locations_publics
            __props__.__dict__["name"] = name
            if period is None and not opts.urn:
                raise TypeError("Missing required property 'period'")
            __props__.__dict__["period"] = period
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
        super(CertCheckMonitor, __self__).__init__(
            'newrelic:synthetics/certCheckMonitor:CertCheckMonitor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            certificate_expiration: Optional[pulumi.Input[int]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            locations_privates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertCheckMonitorTagArgs']]]]] = None) -> 'CertCheckMonitor':
        """
        Get an existing CertCheckMonitor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[int] certificate_expiration: The desired number of remaining days until the certificate expires to trigger a monitor failure.
        :param pulumi.Input[str] domain: The domain of the host that will have its certificate checked.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_privates: The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertCheckMonitorTagArgs']]]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertCheckMonitorState.__new__(_CertCheckMonitorState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["certificate_expiration"] = certificate_expiration
        __props__.__dict__["domain"] = domain
        __props__.__dict__["locations_privates"] = locations_privates
        __props__.__dict__["locations_publics"] = locations_publics
        __props__.__dict__["name"] = name
        __props__.__dict__["period"] = period
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return CertCheckMonitor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="certificateExpiration")
    def certificate_expiration(self) -> pulumi.Output[int]:
        """
        The desired number of remaining days until the certificate expires to trigger a monitor failure.
        """
        return pulumi.get(self, "certificate_expiration")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The domain of the host that will have its certificate checked.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="locationsPrivates")
    def locations_privates(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
        """
        return pulumi.get(self, "locations_privates")

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[str]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.CertCheckMonitorTag']]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details
        """
        return pulumi.get(self, "tags")

