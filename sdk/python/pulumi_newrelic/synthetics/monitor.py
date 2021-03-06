# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MonitorArgs', 'Monitor']

@pulumi.input_type
class MonitorArgs:
    def __init__(__self__, *,
                 frequency: pulumi.Input[int],
                 locations: pulumi.Input[Sequence[pulumi.Input[str]]],
                 status: pulumi.Input[str],
                 type: pulumi.Input[str],
                 bypass_head_request: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sla_threshold: Optional[pulumi.Input[float]] = None,
                 treat_redirect_as_failure: Optional[pulumi.Input[bool]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 validation_string: Optional[pulumi.Input[str]] = None,
                 verify_ssl: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Monitor resource.
        :param pulumi.Input[int] frequency: The interval (in minutes) at which this monitor should run.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations: The locations in which this monitor should be run.
        :param pulumi.Input[str] status: The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        :param pulumi.Input[str] type: The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        :param pulumi.Input[bool] bypass_head_request: Bypass HEAD request.
        :param pulumi.Input[str] name: The title of this monitor.
        :param pulumi.Input[float] sla_threshold: The base threshold for the SLA report.
        :param pulumi.Input[bool] treat_redirect_as_failure: Fail the monitor check if redirected.
        :param pulumi.Input[str] uri: The URI for the monitor to hit.
        :param pulumi.Input[str] validation_string: The string to validate against in the response.
        :param pulumi.Input[bool] verify_ssl: Verify SSL.
        """
        pulumi.set(__self__, "frequency", frequency)
        pulumi.set(__self__, "locations", locations)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "type", type)
        if bypass_head_request is not None:
            pulumi.set(__self__, "bypass_head_request", bypass_head_request)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sla_threshold is not None:
            pulumi.set(__self__, "sla_threshold", sla_threshold)
        if treat_redirect_as_failure is not None:
            pulumi.set(__self__, "treat_redirect_as_failure", treat_redirect_as_failure)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)
        if validation_string is not None:
            pulumi.set(__self__, "validation_string", validation_string)
        if verify_ssl is not None:
            pulumi.set(__self__, "verify_ssl", verify_ssl)

    @property
    @pulumi.getter
    def frequency(self) -> pulumi.Input[int]:
        """
        The interval (in minutes) at which this monitor should run.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: pulumi.Input[int]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter
    def locations(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The locations in which this monitor should be run.
        """
        return pulumi.get(self, "locations")

    @locations.setter
    def locations(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "locations", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="bypassHeadRequest")
    def bypass_head_request(self) -> Optional[pulumi.Input[bool]]:
        """
        Bypass HEAD request.
        """
        return pulumi.get(self, "bypass_head_request")

    @bypass_head_request.setter
    def bypass_head_request(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "bypass_head_request", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of this monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="slaThreshold")
    def sla_threshold(self) -> Optional[pulumi.Input[float]]:
        """
        The base threshold for the SLA report.
        """
        return pulumi.get(self, "sla_threshold")

    @sla_threshold.setter
    def sla_threshold(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "sla_threshold", value)

    @property
    @pulumi.getter(name="treatRedirectAsFailure")
    def treat_redirect_as_failure(self) -> Optional[pulumi.Input[bool]]:
        """
        Fail the monitor check if redirected.
        """
        return pulumi.get(self, "treat_redirect_as_failure")

    @treat_redirect_as_failure.setter
    def treat_redirect_as_failure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "treat_redirect_as_failure", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URI for the monitor to hit.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)

    @property
    @pulumi.getter(name="validationString")
    def validation_string(self) -> Optional[pulumi.Input[str]]:
        """
        The string to validate against in the response.
        """
        return pulumi.get(self, "validation_string")

    @validation_string.setter
    def validation_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_string", value)

    @property
    @pulumi.getter(name="verifySsl")
    def verify_ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        Verify SSL.
        """
        return pulumi.get(self, "verify_ssl")

    @verify_ssl.setter
    def verify_ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verify_ssl", value)


@pulumi.input_type
class _MonitorState:
    def __init__(__self__, *,
                 bypass_head_request: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[int]] = None,
                 locations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sla_threshold: Optional[pulumi.Input[float]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 treat_redirect_as_failure: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 validation_string: Optional[pulumi.Input[str]] = None,
                 verify_ssl: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Monitor resources.
        :param pulumi.Input[bool] bypass_head_request: Bypass HEAD request.
        :param pulumi.Input[int] frequency: The interval (in minutes) at which this monitor should run.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations: The locations in which this monitor should be run.
        :param pulumi.Input[str] name: The title of this monitor.
        :param pulumi.Input[float] sla_threshold: The base threshold for the SLA report.
        :param pulumi.Input[str] status: The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        :param pulumi.Input[bool] treat_redirect_as_failure: Fail the monitor check if redirected.
        :param pulumi.Input[str] type: The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        :param pulumi.Input[str] uri: The URI for the monitor to hit.
        :param pulumi.Input[str] validation_string: The string to validate against in the response.
        :param pulumi.Input[bool] verify_ssl: Verify SSL.
        """
        if bypass_head_request is not None:
            pulumi.set(__self__, "bypass_head_request", bypass_head_request)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if locations is not None:
            pulumi.set(__self__, "locations", locations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sla_threshold is not None:
            pulumi.set(__self__, "sla_threshold", sla_threshold)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if treat_redirect_as_failure is not None:
            pulumi.set(__self__, "treat_redirect_as_failure", treat_redirect_as_failure)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)
        if validation_string is not None:
            pulumi.set(__self__, "validation_string", validation_string)
        if verify_ssl is not None:
            pulumi.set(__self__, "verify_ssl", verify_ssl)

    @property
    @pulumi.getter(name="bypassHeadRequest")
    def bypass_head_request(self) -> Optional[pulumi.Input[bool]]:
        """
        Bypass HEAD request.
        """
        return pulumi.get(self, "bypass_head_request")

    @bypass_head_request.setter
    def bypass_head_request(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "bypass_head_request", value)

    @property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[int]]:
        """
        The interval (in minutes) at which this monitor should run.
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "frequency", value)

    @property
    @pulumi.getter
    def locations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The locations in which this monitor should be run.
        """
        return pulumi.get(self, "locations")

    @locations.setter
    def locations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of this monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="slaThreshold")
    def sla_threshold(self) -> Optional[pulumi.Input[float]]:
        """
        The base threshold for the SLA report.
        """
        return pulumi.get(self, "sla_threshold")

    @sla_threshold.setter
    def sla_threshold(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "sla_threshold", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="treatRedirectAsFailure")
    def treat_redirect_as_failure(self) -> Optional[pulumi.Input[bool]]:
        """
        Fail the monitor check if redirected.
        """
        return pulumi.get(self, "treat_redirect_as_failure")

    @treat_redirect_as_failure.setter
    def treat_redirect_as_failure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "treat_redirect_as_failure", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URI for the monitor to hit.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)

    @property
    @pulumi.getter(name="validationString")
    def validation_string(self) -> Optional[pulumi.Input[str]]:
        """
        The string to validate against in the response.
        """
        return pulumi.get(self, "validation_string")

    @validation_string.setter
    def validation_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_string", value)

    @property
    @pulumi.getter(name="verifySsl")
    def verify_ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        Verify SSL.
        """
        return pulumi.get(self, "verify_ssl")

    @verify_ssl.setter
    def verify_ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verify_ssl", value)


class Monitor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bypass_head_request: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[int]] = None,
                 locations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sla_threshold: Optional[pulumi.Input[float]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 treat_redirect_as_failure: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 validation_string: Optional[pulumi.Input[str]] = None,
                 verify_ssl: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete a synthetics monitor in New Relic.

        ## Example Usage

        ##### Type: `SIMPLE`
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=[
                "AWS_US_EAST_1",
                "AWS_US_EAST_2",
            ],
            status="ENABLED",
            type="SIMPLE",
            uri="https://example.com",
            validation_string="add example validation check here",
            verify_ssl=True)
        # Optional for type "SIMPLE" and "BROWSER"
        ```

        ##### Type: `BROWSER`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            bypass_head_request=True,
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            treat_redirect_as_failure=True,
            type="BROWSER",
            uri="https://example.com",
            validation_string="add example validation check here",
            verify_ssl=True)
        # optional for type "SIMPLE" and "BROWSER"
        ```

        ##### Type: `SCRIPT_BROWSER`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            type="SCRIPT_BROWSER")
        ```

        ##### Type: `SCRIPT_API`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            type="SCRIPT_API")
        ```

        ## Import

        Synthetics monitors can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/monitor:Monitor main <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] bypass_head_request: Bypass HEAD request.
        :param pulumi.Input[int] frequency: The interval (in minutes) at which this monitor should run.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations: The locations in which this monitor should be run.
        :param pulumi.Input[str] name: The title of this monitor.
        :param pulumi.Input[float] sla_threshold: The base threshold for the SLA report.
        :param pulumi.Input[str] status: The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        :param pulumi.Input[bool] treat_redirect_as_failure: Fail the monitor check if redirected.
        :param pulumi.Input[str] type: The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        :param pulumi.Input[str] uri: The URI for the monitor to hit.
        :param pulumi.Input[str] validation_string: The string to validate against in the response.
        :param pulumi.Input[bool] verify_ssl: Verify SSL.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MonitorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete a synthetics monitor in New Relic.

        ## Example Usage

        ##### Type: `SIMPLE`
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=[
                "AWS_US_EAST_1",
                "AWS_US_EAST_2",
            ],
            status="ENABLED",
            type="SIMPLE",
            uri="https://example.com",
            validation_string="add example validation check here",
            verify_ssl=True)
        # Optional for type "SIMPLE" and "BROWSER"
        ```

        ##### Type: `BROWSER`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            bypass_head_request=True,
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            treat_redirect_as_failure=True,
            type="BROWSER",
            uri="https://example.com",
            validation_string="add example validation check here",
            verify_ssl=True)
        # optional for type "SIMPLE" and "BROWSER"
        ```

        ##### Type: `SCRIPT_BROWSER`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            type="SCRIPT_BROWSER")
        ```

        ##### Type: `SCRIPT_API`

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            frequency=5,
            locations=["AWS_US_EAST_1"],
            status="ENABLED",
            type="SCRIPT_API")
        ```

        ## Import

        Synthetics monitors can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/monitor:Monitor main <id>
        ```

        :param str resource_name: The name of the resource.
        :param MonitorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bypass_head_request: Optional[pulumi.Input[bool]] = None,
                 frequency: Optional[pulumi.Input[int]] = None,
                 locations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sla_threshold: Optional[pulumi.Input[float]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 treat_redirect_as_failure: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 validation_string: Optional[pulumi.Input[str]] = None,
                 verify_ssl: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MonitorArgs.__new__(MonitorArgs)

            __props__.__dict__["bypass_head_request"] = bypass_head_request
            if frequency is None and not opts.urn:
                raise TypeError("Missing required property 'frequency'")
            __props__.__dict__["frequency"] = frequency
            if locations is None and not opts.urn:
                raise TypeError("Missing required property 'locations'")
            __props__.__dict__["locations"] = locations
            __props__.__dict__["name"] = name
            __props__.__dict__["sla_threshold"] = sla_threshold
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            __props__.__dict__["treat_redirect_as_failure"] = treat_redirect_as_failure
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["uri"] = uri
            __props__.__dict__["validation_string"] = validation_string
            __props__.__dict__["verify_ssl"] = verify_ssl
        super(Monitor, __self__).__init__(
            'newrelic:synthetics/monitor:Monitor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bypass_head_request: Optional[pulumi.Input[bool]] = None,
            frequency: Optional[pulumi.Input[int]] = None,
            locations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            sla_threshold: Optional[pulumi.Input[float]] = None,
            status: Optional[pulumi.Input[str]] = None,
            treat_redirect_as_failure: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uri: Optional[pulumi.Input[str]] = None,
            validation_string: Optional[pulumi.Input[str]] = None,
            verify_ssl: Optional[pulumi.Input[bool]] = None) -> 'Monitor':
        """
        Get an existing Monitor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] bypass_head_request: Bypass HEAD request.
        :param pulumi.Input[int] frequency: The interval (in minutes) at which this monitor should run.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations: The locations in which this monitor should be run.
        :param pulumi.Input[str] name: The title of this monitor.
        :param pulumi.Input[float] sla_threshold: The base threshold for the SLA report.
        :param pulumi.Input[str] status: The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        :param pulumi.Input[bool] treat_redirect_as_failure: Fail the monitor check if redirected.
        :param pulumi.Input[str] type: The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        :param pulumi.Input[str] uri: The URI for the monitor to hit.
        :param pulumi.Input[str] validation_string: The string to validate against in the response.
        :param pulumi.Input[bool] verify_ssl: Verify SSL.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitorState.__new__(_MonitorState)

        __props__.__dict__["bypass_head_request"] = bypass_head_request
        __props__.__dict__["frequency"] = frequency
        __props__.__dict__["locations"] = locations
        __props__.__dict__["name"] = name
        __props__.__dict__["sla_threshold"] = sla_threshold
        __props__.__dict__["status"] = status
        __props__.__dict__["treat_redirect_as_failure"] = treat_redirect_as_failure
        __props__.__dict__["type"] = type
        __props__.__dict__["uri"] = uri
        __props__.__dict__["validation_string"] = validation_string
        __props__.__dict__["verify_ssl"] = verify_ssl
        return Monitor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bypassHeadRequest")
    def bypass_head_request(self) -> pulumi.Output[Optional[bool]]:
        """
        Bypass HEAD request.
        """
        return pulumi.get(self, "bypass_head_request")

    @property
    @pulumi.getter
    def frequency(self) -> pulumi.Output[int]:
        """
        The interval (in minutes) at which this monitor should run.
        """
        return pulumi.get(self, "frequency")

    @property
    @pulumi.getter
    def locations(self) -> pulumi.Output[Sequence[str]]:
        """
        The locations in which this monitor should be run.
        """
        return pulumi.get(self, "locations")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The title of this monitor.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="slaThreshold")
    def sla_threshold(self) -> pulumi.Output[Optional[float]]:
        """
        The base threshold for the SLA report.
        """
        return pulumi.get(self, "sla_threshold")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The monitor status (i.e. `ENABLED`, `MUTED`, `DISABLED`).
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="treatRedirectAsFailure")
    def treat_redirect_as_failure(self) -> pulumi.Output[Optional[bool]]:
        """
        Fail the monitor check if redirected.
        """
        return pulumi.get(self, "treat_redirect_as_failure")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The monitor type. Valid values are `SIMPLE`, `BROWSER`, `SCRIPT_BROWSER`, and `SCRIPT_API`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[Optional[str]]:
        """
        The URI for the monitor to hit.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter(name="validationString")
    def validation_string(self) -> pulumi.Output[Optional[str]]:
        """
        The string to validate against in the response.
        """
        return pulumi.get(self, "validation_string")

    @property
    @pulumi.getter(name="verifySsl")
    def verify_ssl(self) -> pulumi.Output[Optional[bool]]:
        """
        Verify SSL.
        """
        return pulumi.get(self, "verify_ssl")

