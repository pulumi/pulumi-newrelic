# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AlertMutingRuleArgs', 'AlertMutingRule']

@pulumi.input_type
class AlertMutingRuleArgs:
    def __init__(__self__, *,
                 condition: pulumi.Input['AlertMutingRuleConditionArgs'],
                 enabled: pulumi.Input[builtins.bool],
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 action_on_muting_rule_window_ended: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schedule: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']] = None):
        """
        The set of arguments for constructing a AlertMutingRule resource.
        :param pulumi.Input['AlertMutingRuleConditionArgs'] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[builtins.bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[builtins.str] account_id: The account id of the MutingRule.
        :param pulumi.Input[builtins.str] action_on_muting_rule_window_ended: The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        :param pulumi.Input[builtins.str] description: The description of the MutingRule.
        :param pulumi.Input[builtins.str] name: The name of the MutingRule.
        :param pulumi.Input['AlertMutingRuleScheduleArgs'] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        pulumi.set(__self__, "condition", condition)
        pulumi.set(__self__, "enabled", enabled)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if action_on_muting_rule_window_ended is not None:
            pulumi.set(__self__, "action_on_muting_rule_window_ended", action_on_muting_rule_window_ended)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Input['AlertMutingRuleConditionArgs']:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: pulumi.Input['AlertMutingRuleConditionArgs']):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[builtins.bool]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="actionOnMutingRuleWindowEnded")
    def action_on_muting_rule_window_ended(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        """
        return pulumi.get(self, "action_on_muting_rule_window_ended")

    @action_on_muting_rule_window_ended.setter
    def action_on_muting_rule_window_ended(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "action_on_muting_rule_window_ended", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)


@pulumi.input_type
class _AlertMutingRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 action_on_muting_rule_window_ended: Optional[pulumi.Input[builtins.str]] = None,
                 condition: Optional[pulumi.Input['AlertMutingRuleConditionArgs']] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schedule: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']] = None):
        """
        Input properties used for looking up and filtering AlertMutingRule resources.
        :param pulumi.Input[builtins.str] account_id: The account id of the MutingRule.
        :param pulumi.Input[builtins.str] action_on_muting_rule_window_ended: The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        :param pulumi.Input['AlertMutingRuleConditionArgs'] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[builtins.str] description: The description of the MutingRule.
        :param pulumi.Input[builtins.bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[builtins.str] name: The name of the MutingRule.
        :param pulumi.Input['AlertMutingRuleScheduleArgs'] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if action_on_muting_rule_window_ended is not None:
            pulumi.set(__self__, "action_on_muting_rule_window_ended", action_on_muting_rule_window_ended)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="actionOnMutingRuleWindowEnded")
    def action_on_muting_rule_window_ended(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        """
        return pulumi.get(self, "action_on_muting_rule_window_ended")

    @action_on_muting_rule_window_ended.setter
    def action_on_muting_rule_window_ended(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "action_on_muting_rule_window_ended", value)

    @property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AlertMutingRuleConditionArgs']]:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AlertMutingRuleConditionArgs']]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)


class AlertMutingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 action_on_muting_rule_window_ended: Optional[pulumi.Input[builtins.str]] = None,
                 condition: Optional[pulumi.Input[Union['AlertMutingRuleConditionArgs', 'AlertMutingRuleConditionArgsDict']]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schedule: Optional[pulumi.Input[Union['AlertMutingRuleScheduleArgs', 'AlertMutingRuleScheduleArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertMutingRule("foo",
            name="Example Muting Rule",
            enabled=True,
            description="muting rule test.",
            condition={
                "conditions": [
                    {
                        "attribute": "product",
                        "operator": "EQUALS",
                        "values": ["APM"],
                    },
                    {
                        "attribute": "targetId",
                        "operator": "EQUALS",
                        "values": ["Muted"],
                    },
                ],
                "operator": "AND",
            },
            schedule={
                "start_time": "2021-01-28T15:30:00",
                "end_time": "2021-01-28T16:30:00",
                "time_zone": "America/Los_Angeles",
                "repeat": "WEEKLY",
                "weekly_repeat_days": [
                    "MONDAY",
                    "WEDNESDAY",
                    "FRIDAY",
                ],
                "repeat_count": 42,
            },
            action_on_muting_rule_window_ended="CLOSE_ISSUES_ON_INACTIVE")
        ```

        ## Import

        Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.

        ```sh
        $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account id of the MutingRule.
        :param pulumi.Input[builtins.str] action_on_muting_rule_window_ended: The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        :param pulumi.Input[Union['AlertMutingRuleConditionArgs', 'AlertMutingRuleConditionArgsDict']] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[builtins.str] description: The description of the MutingRule.
        :param pulumi.Input[builtins.bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[builtins.str] name: The name of the MutingRule.
        :param pulumi.Input[Union['AlertMutingRuleScheduleArgs', 'AlertMutingRuleScheduleArgsDict']] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertMutingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertMutingRule("foo",
            name="Example Muting Rule",
            enabled=True,
            description="muting rule test.",
            condition={
                "conditions": [
                    {
                        "attribute": "product",
                        "operator": "EQUALS",
                        "values": ["APM"],
                    },
                    {
                        "attribute": "targetId",
                        "operator": "EQUALS",
                        "values": ["Muted"],
                    },
                ],
                "operator": "AND",
            },
            schedule={
                "start_time": "2021-01-28T15:30:00",
                "end_time": "2021-01-28T16:30:00",
                "time_zone": "America/Los_Angeles",
                "repeat": "WEEKLY",
                "weekly_repeat_days": [
                    "MONDAY",
                    "WEDNESDAY",
                    "FRIDAY",
                ],
                "repeat_count": 42,
            },
            action_on_muting_rule_window_ended="CLOSE_ISSUES_ON_INACTIVE")
        ```

        ## Import

        Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.

        ```sh
        $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
        ```

        :param str resource_name: The name of the resource.
        :param AlertMutingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertMutingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 action_on_muting_rule_window_ended: Optional[pulumi.Input[builtins.str]] = None,
                 condition: Optional[pulumi.Input[Union['AlertMutingRuleConditionArgs', 'AlertMutingRuleConditionArgsDict']]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schedule: Optional[pulumi.Input[Union['AlertMutingRuleScheduleArgs', 'AlertMutingRuleScheduleArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertMutingRuleArgs.__new__(AlertMutingRuleArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["action_on_muting_rule_window_ended"] = action_on_muting_rule_window_ended
            if condition is None and not opts.urn:
                raise TypeError("Missing required property 'condition'")
            __props__.__dict__["condition"] = condition
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["schedule"] = schedule
        super(AlertMutingRule, __self__).__init__(
            'newrelic:index/alertMutingRule:AlertMutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[builtins.str]] = None,
            action_on_muting_rule_window_ended: Optional[pulumi.Input[builtins.str]] = None,
            condition: Optional[pulumi.Input[Union['AlertMutingRuleConditionArgs', 'AlertMutingRuleConditionArgsDict']]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            schedule: Optional[pulumi.Input[Union['AlertMutingRuleScheduleArgs', 'AlertMutingRuleScheduleArgsDict']]] = None) -> 'AlertMutingRule':
        """
        Get an existing AlertMutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account id of the MutingRule.
        :param pulumi.Input[builtins.str] action_on_muting_rule_window_ended: The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        :param pulumi.Input[Union['AlertMutingRuleConditionArgs', 'AlertMutingRuleConditionArgsDict']] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[builtins.str] description: The description of the MutingRule.
        :param pulumi.Input[builtins.bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[builtins.str] name: The name of the MutingRule.
        :param pulumi.Input[Union['AlertMutingRuleScheduleArgs', 'AlertMutingRuleScheduleArgsDict']] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertMutingRuleState.__new__(_AlertMutingRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["action_on_muting_rule_window_ended"] = action_on_muting_rule_window_ended
        __props__.__dict__["condition"] = condition
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["schedule"] = schedule
        return AlertMutingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[builtins.str]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="actionOnMutingRuleWindowEnded")
    def action_on_muting_rule_window_ended(self) -> pulumi.Output[builtins.str]:
        """
        The action when the muting rule window is ended or disabled. Valid values are `CLOSE_ISSUES_ON_INACTIVE`, `DO_NOTHING`.
        """
        return pulumi.get(self, "action_on_muting_rule_window_ended")

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Output['outputs.AlertMutingRuleCondition']:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[builtins.bool]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[Optional['outputs.AlertMutingRuleSchedule']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

