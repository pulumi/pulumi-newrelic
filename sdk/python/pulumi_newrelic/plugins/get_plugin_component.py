# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import _utilities, _tables


class GetPluginComponentResult:
    """
    A collection of values returned by getPluginComponent.
    """
    def __init__(__self__, health_status=None, id=None, name=None, plugin_id=None):
        if health_status and not isinstance(health_status, str):
            raise TypeError("Expected argument 'health_status' to be a str")
        __self__.health_status = health_status
        """
        The health status of the plugin component.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The ID of the plugin component.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if plugin_id and not isinstance(plugin_id, float):
            raise TypeError("Expected argument 'plugin_id' to be a float")
        __self__.plugin_id = plugin_id


class AwaitableGetPluginComponentResult(GetPluginComponentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPluginComponentResult(
            health_status=self.health_status,
            id=self.id,
            name=self.name,
            plugin_id=self.plugin_id)


def get_plugin_component(name=None, plugin_id=None, opts=None):
    """
    Use this data source to get information about a single plugin component in New Relic that already exists.

    Each plugin component reporting into to New Relic is assigned a unique ID. Once you have a plugin component reporting data into your account, its component ID can be used to create Plugins alert conditions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_plugin = newrelic.plugins.get_plugin(guid="com.example.my-plugin")
    foo_plugin_component = newrelic.plugins.get_plugin_component(plugin_id=foo_plugin.id,
        name="My Plugin Component")
    foo_alert_policy = newrelic.AlertPolicy("fooAlertPolicy")
    foo_alert_condition = newrelic.plugins.AlertCondition("fooAlertCondition",
        policy_id=foo_alert_policy.id,
        metric="Component/Summary/Consumers[consumers]",
        plugin_id=foo_plugin.id,
        plugin_guid=foo_plugin.guid,
        entities=[foo_plugin_component.id],
        value_function="average",
        metric_description="Queue consumers",
        terms=[{
            "duration": 5,
            "operator": "below",
            "priority": "critical",
            "threshold": "0.75",
            "timeFunction": "all",
        }])
    ```


    :param str name: The name of the plugin component.
    :param float plugin_id: The ID of the plugin instance this component belongs to.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['pluginId'] = plugin_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('newrelic:plugins/getPluginComponent:getPluginComponent', __args__, opts=opts).value

    return AwaitableGetPluginComponentResult(
        health_status=__ret__.get('healthStatus'),
        id=__ret__.get('id'),
        name=__ret__.get('name'),
        plugin_id=__ret__.get('pluginId'))
