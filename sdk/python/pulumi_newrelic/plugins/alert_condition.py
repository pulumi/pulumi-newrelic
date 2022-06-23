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

__all__ = ['AlertConditionArgs', 'AlertCondition']

@pulumi.input_type
class AlertConditionArgs:
    def __init__(__self__, *,
                 entities: pulumi.Input[Sequence[pulumi.Input[int]]],
                 metric: pulumi.Input[str],
                 metric_description: pulumi.Input[str],
                 plugin_guid: pulumi.Input[str],
                 plugin_id: pulumi.Input[str],
                 policy_id: pulumi.Input[int],
                 terms: pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]],
                 value_function: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AlertCondition resource.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] entities: The plugin component IDs to target.
        :param pulumi.Input[str] metric: The plugin metric to evaluate.
        :param pulumi.Input[str] metric_description: The metric description.
        :param pulumi.Input[str] plugin_guid: The GUID of the plugin which produces the metric.
        :param pulumi.Input[str] plugin_id: The ID of the installed plugin instance which produces the metric.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] value_function: The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        :param pulumi.Input[bool] enabled: Whether or not this condition is enabled.
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        pulumi.set(__self__, "entities", entities)
        pulumi.set(__self__, "metric", metric)
        pulumi.set(__self__, "metric_description", metric_description)
        pulumi.set(__self__, "plugin_guid", plugin_guid)
        pulumi.set(__self__, "plugin_id", plugin_id)
        pulumi.set(__self__, "policy_id", policy_id)
        pulumi.set(__self__, "terms", terms)
        pulumi.set(__self__, "value_function", value_function)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)

    @property
    @pulumi.getter
    def entities(self) -> pulumi.Input[Sequence[pulumi.Input[int]]]:
        """
        The plugin component IDs to target.
        """
        return pulumi.get(self, "entities")

    @entities.setter
    def entities(self, value: pulumi.Input[Sequence[pulumi.Input[int]]]):
        pulumi.set(self, "entities", value)

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Input[str]:
        """
        The plugin metric to evaluate.
        """
        return pulumi.get(self, "metric")

    @metric.setter
    def metric(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric", value)

    @property
    @pulumi.getter(name="metricDescription")
    def metric_description(self) -> pulumi.Input[str]:
        """
        The metric description.
        """
        return pulumi.get(self, "metric_description")

    @metric_description.setter
    def metric_description(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric_description", value)

    @property
    @pulumi.getter(name="pluginGuid")
    def plugin_guid(self) -> pulumi.Input[str]:
        """
        The GUID of the plugin which produces the metric.
        """
        return pulumi.get(self, "plugin_guid")

    @plugin_guid.setter
    def plugin_guid(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_guid", value)

    @property
    @pulumi.getter(name="pluginId")
    def plugin_id(self) -> pulumi.Input[str]:
        """
        The ID of the installed plugin instance which produces the metric.
        """
        return pulumi.get(self, "plugin_id")

    @plugin_id.setter
    def plugin_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_id", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[int]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def terms(self) -> pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]]:
        return pulumi.get(self, "terms")

    @terms.setter
    def terms(self, value: pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]]):
        pulumi.set(self, "terms", value)

    @property
    @pulumi.getter(name="valueFunction")
    def value_function(self) -> pulumi.Input[str]:
        """
        The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        return pulumi.get(self, "value_function")

    @value_function.setter
    def value_function(self, value: pulumi.Input[str]):
        pulumi.set(self, "value_function", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not this condition is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the condition. Must be between 1 and 64 characters, inclusive.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)


@pulumi.input_type
class _AlertConditionState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 metric_description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plugin_guid: Optional[pulumi.Input[str]] = None,
                 plugin_id: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 terms: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]]] = None,
                 value_function: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertCondition resources.
        :param pulumi.Input[bool] enabled: Whether or not this condition is enabled.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] entities: The plugin component IDs to target.
        :param pulumi.Input[str] metric: The plugin metric to evaluate.
        :param pulumi.Input[str] metric_description: The metric description.
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[str] plugin_guid: The GUID of the plugin which produces the metric.
        :param pulumi.Input[str] plugin_id: The ID of the installed plugin instance which produces the metric.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[str] value_function: The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if entities is not None:
            pulumi.set(__self__, "entities", entities)
        if metric is not None:
            pulumi.set(__self__, "metric", metric)
        if metric_description is not None:
            pulumi.set(__self__, "metric_description", metric_description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plugin_guid is not None:
            pulumi.set(__self__, "plugin_guid", plugin_guid)
        if plugin_id is not None:
            pulumi.set(__self__, "plugin_id", plugin_id)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)
        if terms is not None:
            pulumi.set(__self__, "terms", terms)
        if value_function is not None:
            pulumi.set(__self__, "value_function", value_function)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not this condition is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def entities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        The plugin component IDs to target.
        """
        return pulumi.get(self, "entities")

    @entities.setter
    def entities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "entities", value)

    @property
    @pulumi.getter
    def metric(self) -> Optional[pulumi.Input[str]]:
        """
        The plugin metric to evaluate.
        """
        return pulumi.get(self, "metric")

    @metric.setter
    def metric(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric", value)

    @property
    @pulumi.getter(name="metricDescription")
    def metric_description(self) -> Optional[pulumi.Input[str]]:
        """
        The metric description.
        """
        return pulumi.get(self, "metric_description")

    @metric_description.setter
    def metric_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the condition. Must be between 1 and 64 characters, inclusive.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pluginGuid")
    def plugin_guid(self) -> Optional[pulumi.Input[str]]:
        """
        The GUID of the plugin which produces the metric.
        """
        return pulumi.get(self, "plugin_guid")

    @plugin_guid.setter
    def plugin_guid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin_guid", value)

    @property
    @pulumi.getter(name="pluginId")
    def plugin_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the installed plugin instance which produces the metric.
        """
        return pulumi.get(self, "plugin_id")

    @plugin_id.setter
    def plugin_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin_id", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)

    @property
    @pulumi.getter
    def terms(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]]]:
        return pulumi.get(self, "terms")

    @terms.setter
    def terms(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AlertConditionTermArgs']]]]):
        pulumi.set(self, "terms", value)

    @property
    @pulumi.getter(name="valueFunction")
    def value_function(self) -> Optional[pulumi.Input[str]]:
        """
        The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        return pulumi.get(self, "value_function")

    @value_function.setter
    def value_function(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value_function", value)


class AlertCondition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 metric_description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plugin_guid: Optional[pulumi.Input[str]] = None,
                 plugin_id: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 terms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]]] = None,
                 value_function: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        New Relic Plugins reached end of life Wednesday June 16, 2021.

        **This resource has been removed.**

        For more information, [click here](https://discuss.newrelic.com/t/new-relic-plugin-eol-wednesday-june-16th-2021/127267)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether or not this condition is enabled.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] entities: The plugin component IDs to target.
        :param pulumi.Input[str] metric: The plugin metric to evaluate.
        :param pulumi.Input[str] metric_description: The metric description.
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[str] plugin_guid: The GUID of the plugin which produces the metric.
        :param pulumi.Input[str] plugin_id: The ID of the installed plugin instance which produces the metric.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[str] value_function: The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertConditionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        New Relic Plugins reached end of life Wednesday June 16, 2021.

        **This resource has been removed.**

        For more information, [click here](https://discuss.newrelic.com/t/new-relic-plugin-eol-wednesday-june-16th-2021/127267)

        :param str resource_name: The name of the resource.
        :param AlertConditionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertConditionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 metric_description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plugin_guid: Optional[pulumi.Input[str]] = None,
                 plugin_id: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 terms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]]] = None,
                 value_function: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertConditionArgs.__new__(AlertConditionArgs)

            __props__.__dict__["enabled"] = enabled
            if entities is None and not opts.urn:
                raise TypeError("Missing required property 'entities'")
            __props__.__dict__["entities"] = entities
            if metric is None and not opts.urn:
                raise TypeError("Missing required property 'metric'")
            __props__.__dict__["metric"] = metric
            if metric_description is None and not opts.urn:
                raise TypeError("Missing required property 'metric_description'")
            __props__.__dict__["metric_description"] = metric_description
            __props__.__dict__["name"] = name
            if plugin_guid is None and not opts.urn:
                raise TypeError("Missing required property 'plugin_guid'")
            __props__.__dict__["plugin_guid"] = plugin_guid
            if plugin_id is None and not opts.urn:
                raise TypeError("Missing required property 'plugin_id'")
            __props__.__dict__["plugin_id"] = plugin_id
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
            __props__.__dict__["runbook_url"] = runbook_url
            if terms is None and not opts.urn:
                raise TypeError("Missing required property 'terms'")
            __props__.__dict__["terms"] = terms
            if value_function is None and not opts.urn:
                raise TypeError("Missing required property 'value_function'")
            __props__.__dict__["value_function"] = value_function
        super(AlertCondition, __self__).__init__(
            'newrelic:plugins/alertCondition:AlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            entities: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            metric: Optional[pulumi.Input[str]] = None,
            metric_description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            plugin_guid: Optional[pulumi.Input[str]] = None,
            plugin_id: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[int]] = None,
            runbook_url: Optional[pulumi.Input[str]] = None,
            terms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]]] = None,
            value_function: Optional[pulumi.Input[str]] = None) -> 'AlertCondition':
        """
        Get an existing AlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether or not this condition is enabled.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] entities: The plugin component IDs to target.
        :param pulumi.Input[str] metric: The plugin metric to evaluate.
        :param pulumi.Input[str] metric_description: The metric description.
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[str] plugin_guid: The GUID of the plugin which produces the metric.
        :param pulumi.Input[str] plugin_id: The ID of the installed plugin instance which produces the metric.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[str] value_function: The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertConditionState.__new__(_AlertConditionState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["entities"] = entities
        __props__.__dict__["metric"] = metric
        __props__.__dict__["metric_description"] = metric_description
        __props__.__dict__["name"] = name
        __props__.__dict__["plugin_guid"] = plugin_guid
        __props__.__dict__["plugin_id"] = plugin_id
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["runbook_url"] = runbook_url
        __props__.__dict__["terms"] = terms
        __props__.__dict__["value_function"] = value_function
        return AlertCondition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not this condition is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def entities(self) -> pulumi.Output[Sequence[int]]:
        """
        The plugin component IDs to target.
        """
        return pulumi.get(self, "entities")

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Output[str]:
        """
        The plugin metric to evaluate.
        """
        return pulumi.get(self, "metric")

    @property
    @pulumi.getter(name="metricDescription")
    def metric_description(self) -> pulumi.Output[str]:
        """
        The metric description.
        """
        return pulumi.get(self, "metric_description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The title of the condition. Must be between 1 and 64 characters, inclusive.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pluginGuid")
    def plugin_guid(self) -> pulumi.Output[str]:
        """
        The GUID of the plugin which produces the metric.
        """
        return pulumi.get(self, "plugin_guid")

    @property
    @pulumi.getter(name="pluginId")
    def plugin_id(self) -> pulumi.Output[str]:
        """
        The ID of the installed plugin instance which produces the metric.
        """
        return pulumi.get(self, "plugin_id")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[int]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> pulumi.Output[Optional[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @property
    @pulumi.getter
    def terms(self) -> pulumi.Output[Sequence['outputs.AlertConditionTerm']]:
        return pulumi.get(self, "terms")

    @property
    @pulumi.getter(name="valueFunction")
    def value_function(self) -> pulumi.Output[str]:
        """
        The value function to apply to the metric data. One of `min`, `max`, `average`, `sample_size`, `total`, or `percent`.
        """
        return pulumi.get(self, "value_function")

