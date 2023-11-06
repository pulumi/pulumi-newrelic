# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EventsToMetricsRuleArgs', 'EventsToMetricsRule']

@pulumi.input_type
class EventsToMetricsRuleArgs:
    def __init__(__self__, *,
                 nrql: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EventsToMetricsRule resource.
        :param pulumi.Input[str] nrql: Explains how to create metrics from events.
        :param pulumi.Input[int] account_id: Account with the event and where the metrics will be put.
        :param pulumi.Input[str] description: Provides additional information about the rule.
        :param pulumi.Input[bool] enabled: True means this rule is enabled. False means the rule is currently not creating metrics.
        :param pulumi.Input[str] name: The name of the rule. This must be unique within an account.
        """
        EventsToMetricsRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            nrql=nrql,
            account_id=account_id,
            description=description,
            enabled=enabled,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             nrql: Optional[pulumi.Input[str]] = None,
             account_id: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if nrql is None:
            raise TypeError("Missing 'nrql' argument")
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']

        _setter("nrql", nrql)
        if account_id is not None:
            _setter("account_id", account_id)
        if description is not None:
            _setter("description", description)
        if enabled is not None:
            _setter("enabled", enabled)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Input[str]:
        """
        Explains how to create metrics from events.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: pulumi.Input[str]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        Account with the event and where the metrics will be put.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Provides additional information about the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        True means this rule is enabled. False means the rule is currently not creating metrics.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule. This must be unique within an account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EventsToMetricsRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EventsToMetricsRule resources.
        :param pulumi.Input[int] account_id: Account with the event and where the metrics will be put.
        :param pulumi.Input[str] description: Provides additional information about the rule.
        :param pulumi.Input[bool] enabled: True means this rule is enabled. False means the rule is currently not creating metrics.
        :param pulumi.Input[str] name: The name of the rule. This must be unique within an account.
        :param pulumi.Input[str] nrql: Explains how to create metrics from events.
        :param pulumi.Input[str] rule_id: The id, uniquely identifying the rule.
        """
        _EventsToMetricsRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            description=description,
            enabled=enabled,
            name=name,
            nrql=nrql,
            rule_id=rule_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             nrql: Optional[pulumi.Input[str]] = None,
             rule_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if rule_id is None and 'ruleId' in kwargs:
            rule_id = kwargs['ruleId']

        if account_id is not None:
            _setter("account_id", account_id)
        if description is not None:
            _setter("description", description)
        if enabled is not None:
            _setter("enabled", enabled)
        if name is not None:
            _setter("name", name)
        if nrql is not None:
            _setter("nrql", nrql)
        if rule_id is not None:
            _setter("rule_id", rule_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        Account with the event and where the metrics will be put.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Provides additional information about the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        True means this rule is enabled. False means the rule is currently not creating metrics.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule. This must be unique within an account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def nrql(self) -> Optional[pulumi.Input[str]]:
        """
        Explains how to create metrics from events.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id, uniquely identifying the rule.
        """
        return pulumi.get(self, "rule_id")

    @rule_id.setter
    def rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_id", value)


class EventsToMetricsRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete New Relic Events to Metrics rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.EventsToMetricsRule("foo",
            account_id=12345,
            description="Example description",
            nrql="SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name")
        ```

        ## Import

        New Relic Events to Metrics rules can be imported using a concatenated string of the format

        `<account_id>:<rule_id>`, e.g. bash

        ```sh
         $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: Account with the event and where the metrics will be put.
        :param pulumi.Input[str] description: Provides additional information about the rule.
        :param pulumi.Input[bool] enabled: True means this rule is enabled. False means the rule is currently not creating metrics.
        :param pulumi.Input[str] name: The name of the rule. This must be unique within an account.
        :param pulumi.Input[str] nrql: Explains how to create metrics from events.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventsToMetricsRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete New Relic Events to Metrics rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.EventsToMetricsRule("foo",
            account_id=12345,
            description="Example description",
            nrql="SELECT uniqueCount(account_id) AS ``Transaction.account_id`` FROM Transaction FACET appName, name")
        ```

        ## Import

        New Relic Events to Metrics rules can be imported using a concatenated string of the format

        `<account_id>:<rule_id>`, e.g. bash

        ```sh
         $ pulumi import newrelic:index/eventsToMetricsRule:EventsToMetricsRule foo 12345:34567
        ```

        :param str resource_name: The name of the resource.
        :param EventsToMetricsRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventsToMetricsRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EventsToMetricsRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventsToMetricsRuleArgs.__new__(EventsToMetricsRuleArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            if nrql is None and not opts.urn:
                raise TypeError("Missing required property 'nrql'")
            __props__.__dict__["nrql"] = nrql
            __props__.__dict__["rule_id"] = None
        super(EventsToMetricsRule, __self__).__init__(
            'newrelic:index/eventsToMetricsRule:EventsToMetricsRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            nrql: Optional[pulumi.Input[str]] = None,
            rule_id: Optional[pulumi.Input[str]] = None) -> 'EventsToMetricsRule':
        """
        Get an existing EventsToMetricsRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: Account with the event and where the metrics will be put.
        :param pulumi.Input[str] description: Provides additional information about the rule.
        :param pulumi.Input[bool] enabled: True means this rule is enabled. False means the rule is currently not creating metrics.
        :param pulumi.Input[str] name: The name of the rule. This must be unique within an account.
        :param pulumi.Input[str] nrql: Explains how to create metrics from events.
        :param pulumi.Input[str] rule_id: The id, uniquely identifying the rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventsToMetricsRuleState.__new__(_EventsToMetricsRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["nrql"] = nrql
        __props__.__dict__["rule_id"] = rule_id
        return EventsToMetricsRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        Account with the event and where the metrics will be put.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Provides additional information about the rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        True means this rule is enabled. False means the rule is currently not creating metrics.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the rule. This must be unique within an account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Output[str]:
        """
        Explains how to create metrics from events.
        """
        return pulumi.get(self, "nrql")

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> pulumi.Output[str]:
        """
        The id, uniquely identifying the rule.
        """
        return pulumi.get(self, "rule_id")

