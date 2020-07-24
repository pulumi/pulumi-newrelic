# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import _utilities, _tables


class GetMonitorResult:
    """
    A collection of values returned by getMonitor.
    """
    def __init__(__self__, id=None, monitor_id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if monitor_id and not isinstance(monitor_id, str):
            raise TypeError("Expected argument 'monitor_id' to be a str")
        __self__.monitor_id = monitor_id
        """
        The ID of the synthetics monitor.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name


class AwaitableGetMonitorResult(GetMonitorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMonitorResult(
            id=self.id,
            monitor_id=self.monitor_id,
            name=self.name)


def get_monitor(name=None, opts=None):
    """
    Use this data source to get information about a specific synthetics monitor in New Relic that already exists. This can be used to set up a Synthetics alert condition.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    bar = newrelic.synthetics.get_monitor(name="bar")
    baz = newrelic.synthetics.AlertCondition("baz",
        policy_id=newrelic_alert_policy["foo"]["id"],
        monitor_id=bar.id,
        runbook_url="https://www.example.com")
    ```


    :param str name: The name of the synthetics monitor in New Relic.
    """
    __args__ = dict()
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('newrelic:synthetics/getMonitor:getMonitor', __args__, opts=opts).value

    return AwaitableGetMonitorResult(
        id=__ret__.get('id'),
        monitor_id=__ret__.get('monitorId'),
        name=__ret__.get('name'))
