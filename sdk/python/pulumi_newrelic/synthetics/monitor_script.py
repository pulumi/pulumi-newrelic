# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MonitorScriptArgs', 'MonitorScript']

@pulumi.input_type
class MonitorScriptArgs:
    def __init__(__self__, *,
                 monitor_id: pulumi.Input[str],
                 text: pulumi.Input[str]):
        """
        The set of arguments for constructing a MonitorScript resource.
        :param pulumi.Input[str] monitor_id: The ID of the monitor to attach the script to.
        :param pulumi.Input[str] text: The plaintext representing the monitor script.
        """
        pulumi.set(__self__, "monitor_id", monitor_id)
        pulumi.set(__self__, "text", text)

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> pulumi.Input[str]:
        """
        The ID of the monitor to attach the script to.
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "monitor_id", value)

    @property
    @pulumi.getter
    def text(self) -> pulumi.Input[str]:
        """
        The plaintext representing the monitor script.
        """
        return pulumi.get(self, "text")

    @text.setter
    def text(self, value: pulumi.Input[str]):
        pulumi.set(self, "text", value)


@pulumi.input_type
class _MonitorScriptState:
    def __init__(__self__, *,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MonitorScript resources.
        :param pulumi.Input[str] monitor_id: The ID of the monitor to attach the script to.
        :param pulumi.Input[str] text: The plaintext representing the monitor script.
        """
        if monitor_id is not None:
            pulumi.set(__self__, "monitor_id", monitor_id)
        if text is not None:
            pulumi.set(__self__, "text", text)

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the monitor to attach the script to.
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_id", value)

    @property
    @pulumi.getter
    def text(self) -> Optional[pulumi.Input[str]]:
        """
        The plaintext representing the monitor script.
        """
        return pulumi.get(self, "text")

    @text.setter
    def text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "text", value)


class MonitorScript(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to update a synthetics monitor script in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            type="SCRIPT_BROWSER",
            frequency=5,
            status="ENABLED",
            locations=["AWS_US_EAST_1"])
        foo_script = newrelic.synthetics.MonitorScript("fooScript",
            monitor_id=foo.id,
            text=(lambda path: open(path).read())(f"{path['module']}/foo_script.js"))
        ```

        ## Import

        Synthetics monitor scripts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/monitorScript:MonitorScript main <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] monitor_id: The ID of the monitor to attach the script to.
        :param pulumi.Input[str] text: The plaintext representing the monitor script.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MonitorScriptArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to update a synthetics monitor script in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.Monitor("foo",
            type="SCRIPT_BROWSER",
            frequency=5,
            status="ENABLED",
            locations=["AWS_US_EAST_1"])
        foo_script = newrelic.synthetics.MonitorScript("fooScript",
            monitor_id=foo.id,
            text=(lambda path: open(path).read())(f"{path['module']}/foo_script.js"))
        ```

        ## Import

        Synthetics monitor scripts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:synthetics/monitorScript:MonitorScript main <id>
        ```

        :param str resource_name: The name of the resource.
        :param MonitorScriptArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitorScriptArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None,
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
            __props__ = MonitorScriptArgs.__new__(MonitorScriptArgs)

            if monitor_id is None and not opts.urn:
                raise TypeError("Missing required property 'monitor_id'")
            __props__.__dict__["monitor_id"] = monitor_id
            if text is None and not opts.urn:
                raise TypeError("Missing required property 'text'")
            __props__.__dict__["text"] = text
        super(MonitorScript, __self__).__init__(
            'newrelic:synthetics/monitorScript:MonitorScript',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            monitor_id: Optional[pulumi.Input[str]] = None,
            text: Optional[pulumi.Input[str]] = None) -> 'MonitorScript':
        """
        Get an existing MonitorScript resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] monitor_id: The ID of the monitor to attach the script to.
        :param pulumi.Input[str] text: The plaintext representing the monitor script.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitorScriptState.__new__(_MonitorScriptState)

        __props__.__dict__["monitor_id"] = monitor_id
        __props__.__dict__["text"] = text
        return MonitorScript(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> pulumi.Output[str]:
        """
        The ID of the monitor to attach the script to.
        """
        return pulumi.get(self, "monitor_id")

    @property
    @pulumi.getter
    def text(self) -> pulumi.Output[str]:
        """
        The plaintext representing the monitor script.
        """
        return pulumi.get(self, "text")

