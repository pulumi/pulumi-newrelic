# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['NrqlDropRuleArgs', 'NrqlDropRule']

@pulumi.input_type
class NrqlDropRuleArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 nrql: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NrqlDropRule resource.
        :param pulumi.Input[str] action: An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        :param pulumi.Input[str] nrql: A NRQL string that specifies what data types to drop.
        :param pulumi.Input[str] account_id: Account where the drop rule will be put. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] description: The description of the drop rule.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "nrql", nrql)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Input[str]:
        """
        A NRQL string that specifies what data types to drop.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: pulumi.Input[str]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account where the drop rule will be put. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the drop rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _NrqlDropRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NrqlDropRule resources.
        :param pulumi.Input[str] account_id: Account where the drop rule will be put. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] action: An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        :param pulumi.Input[str] description: The description of the drop rule.
        :param pulumi.Input[str] nrql: A NRQL string that specifies what data types to drop.
        :param pulumi.Input[str] rule_id: The id, uniquely identifying the rule.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if action is not None:
            pulumi.set(__self__, "action", action)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if nrql is not None:
            pulumi.set(__self__, "nrql", nrql)
        if rule_id is not None:
            pulumi.set(__self__, "rule_id", rule_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account where the drop rule will be put. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the drop rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def nrql(self) -> Optional[pulumi.Input[str]]:
        """
        A NRQL string that specifies what data types to drop.
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


class NrqlDropRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NrqlDropRule("foo",
            account_id="12345",
            description="Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it.",
            action="drop_data",
            nrql="SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'")
        bar = newrelic.NrqlDropRule("bar",
            account_id="12345",
            description="Removes the user name and email fields from MyCustomEvent",
            action="drop_attributes",
            nrql="SELECT userEmail, userName FROM MyCustomEvent")
        baz = newrelic.NrqlDropRule("baz",
            account_id="12345",
            description="Removes containerId from metric aggregates to reduce metric cardinality.",
            action="drop_attributes_from_metric_aggregates",
            nrql="SELECT containerId FROM Metric")
        ```

        ## Using `newrelic-cli` to List Out Drop Rules

        All NRQL Drop Rules associated with a New Relic account may be listed out using the following newrelic-cli command:

        This would print all drop rules associated with your New Relic account to the terminal.
        The number of rules to be printed can be customized using the `limit` argument of this command.
        For instance, the following command limits the number of drop rules printed to two.

        More details on the command and its arguments (for instance, the format in which the droprules are to be listed in the terminal, which is JSON by default) can be found in the output of the `newrelic nrql droprules --help` command.
        If you do not have **newrelic-cli** installed on your device already, head over to [this page](https://github.com/newrelic/newrelic-cli#installation--upgrades) for instructions.

        ## Import

        New Relic NRQL drop rules can be imported using a concatenated string of the format

         `<account_id>:<rule_id>`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account where the drop rule will be put. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] action: An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        :param pulumi.Input[str] description: The description of the drop rule.
        :param pulumi.Input[str] nrql: A NRQL string that specifies what data types to drop.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NrqlDropRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NrqlDropRule("foo",
            account_id="12345",
            description="Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it.",
            action="drop_data",
            nrql="SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'")
        bar = newrelic.NrqlDropRule("bar",
            account_id="12345",
            description="Removes the user name and email fields from MyCustomEvent",
            action="drop_attributes",
            nrql="SELECT userEmail, userName FROM MyCustomEvent")
        baz = newrelic.NrqlDropRule("baz",
            account_id="12345",
            description="Removes containerId from metric aggregates to reduce metric cardinality.",
            action="drop_attributes_from_metric_aggregates",
            nrql="SELECT containerId FROM Metric")
        ```

        ## Using `newrelic-cli` to List Out Drop Rules

        All NRQL Drop Rules associated with a New Relic account may be listed out using the following newrelic-cli command:

        This would print all drop rules associated with your New Relic account to the terminal.
        The number of rules to be printed can be customized using the `limit` argument of this command.
        For instance, the following command limits the number of drop rules printed to two.

        More details on the command and its arguments (for instance, the format in which the droprules are to be listed in the terminal, which is JSON by default) can be found in the output of the `newrelic nrql droprules --help` command.
        If you do not have **newrelic-cli** installed on your device already, head over to [this page](https://github.com/newrelic/newrelic-cli#installation--upgrades) for instructions.

        ## Import

        New Relic NRQL drop rules can be imported using a concatenated string of the format

         `<account_id>:<rule_id>`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
        ```

        :param str resource_name: The name of the resource.
        :param NrqlDropRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NrqlDropRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NrqlDropRuleArgs.__new__(NrqlDropRuleArgs)

            __props__.__dict__["account_id"] = account_id
            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["description"] = description
            if nrql is None and not opts.urn:
                raise TypeError("Missing required property 'nrql'")
            __props__.__dict__["nrql"] = nrql
            __props__.__dict__["rule_id"] = None
        super(NrqlDropRule, __self__).__init__(
            'newrelic:index/nrqlDropRule:NrqlDropRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            action: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            nrql: Optional[pulumi.Input[str]] = None,
            rule_id: Optional[pulumi.Input[str]] = None) -> 'NrqlDropRule':
        """
        Get an existing NrqlDropRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account where the drop rule will be put. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] action: An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        :param pulumi.Input[str] description: The description of the drop rule.
        :param pulumi.Input[str] nrql: A NRQL string that specifies what data types to drop.
        :param pulumi.Input[str] rule_id: The id, uniquely identifying the rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NrqlDropRuleState.__new__(_NrqlDropRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["action"] = action
        __props__.__dict__["description"] = description
        __props__.__dict__["nrql"] = nrql
        __props__.__dict__["rule_id"] = rule_id
        return NrqlDropRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Account where the drop rule will be put. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or ` drop_attributes_from_metric_aggregates`).
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the drop rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Output[str]:
        """
        A NRQL string that specifies what data types to drop.
        """
        return pulumi.get(self, "nrql")

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> pulumi.Output[str]:
        """
        The id, uniquely identifying the rule.
        """
        return pulumi.get(self, "rule_id")

