# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LogParsingRuleArgs', 'LogParsingRule']

@pulumi.input_type
class LogParsingRuleArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 grok: pulumi.Input[str],
                 lucene: pulumi.Input[str],
                 nrql: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 attribute: Optional[pulumi.Input[str]] = None,
                 matched: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LogParsingRule resource.
        :param pulumi.Input[bool] enabled: Whether the rule should be applied or not to incoming data.
        :param pulumi.Input[str] grok: The Grok of what to parse.
        :param pulumi.Input[str] lucene: The Lucene to match events to the parsing rule.
        :param pulumi.Input[str] nrql: The NRQL to match events to the parsing rule.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation rule.
        :param pulumi.Input[str] attribute: The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        :param pulumi.Input[bool] matched: Whether the Grok pattern matched.
        :param pulumi.Input[str] name: Name of rule.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "grok", grok)
        pulumi.set(__self__, "lucene", lucene)
        pulumi.set(__self__, "nrql", nrql)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if attribute is not None:
            pulumi.set(__self__, "attribute", attribute)
        if matched is not None:
            pulumi.set(__self__, "matched", matched)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the rule should be applied or not to incoming data.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def grok(self) -> pulumi.Input[str]:
        """
        The Grok of what to parse.
        """
        return pulumi.get(self, "grok")

    @grok.setter
    def grok(self, value: pulumi.Input[str]):
        pulumi.set(self, "grok", value)

    @property
    @pulumi.getter
    def lucene(self) -> pulumi.Input[str]:
        """
        The Lucene to match events to the parsing rule.
        """
        return pulumi.get(self, "lucene")

    @lucene.setter
    def lucene(self, value: pulumi.Input[str]):
        pulumi.set(self, "lucene", value)

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Input[str]:
        """
        The NRQL to match events to the parsing rule.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: pulumi.Input[str]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id associated with the obfuscation rule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def attribute(self) -> Optional[pulumi.Input[str]]:
        """
        The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        """
        return pulumi.get(self, "attribute")

    @attribute.setter
    def attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "attribute", value)

    @property
    @pulumi.getter
    def matched(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the Grok pattern matched.
        """
        return pulumi.get(self, "matched")

    @matched.setter
    def matched(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "matched", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LogParsingRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 attribute: Optional[pulumi.Input[str]] = None,
                 deleted: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 grok: Optional[pulumi.Input[str]] = None,
                 lucene: Optional[pulumi.Input[str]] = None,
                 matched: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogParsingRule resources.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation rule.
        :param pulumi.Input[str] attribute: The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        :param pulumi.Input[bool] deleted: Whether or not this rule is deleted.
        :param pulumi.Input[bool] enabled: Whether the rule should be applied or not to incoming data.
        :param pulumi.Input[str] grok: The Grok of what to parse.
        :param pulumi.Input[str] lucene: The Lucene to match events to the parsing rule.
        :param pulumi.Input[bool] matched: Whether the Grok pattern matched.
        :param pulumi.Input[str] name: Name of rule.
        :param pulumi.Input[str] nrql: The NRQL to match events to the parsing rule.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if attribute is not None:
            pulumi.set(__self__, "attribute", attribute)
        if deleted is not None:
            pulumi.set(__self__, "deleted", deleted)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if grok is not None:
            pulumi.set(__self__, "grok", grok)
        if lucene is not None:
            pulumi.set(__self__, "lucene", lucene)
        if matched is not None:
            pulumi.set(__self__, "matched", matched)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nrql is not None:
            pulumi.set(__self__, "nrql", nrql)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id associated with the obfuscation rule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def attribute(self) -> Optional[pulumi.Input[str]]:
        """
        The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        """
        return pulumi.get(self, "attribute")

    @attribute.setter
    def attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "attribute", value)

    @property
    @pulumi.getter
    def deleted(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not this rule is deleted.
        """
        return pulumi.get(self, "deleted")

    @deleted.setter
    def deleted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deleted", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the rule should be applied or not to incoming data.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def grok(self) -> Optional[pulumi.Input[str]]:
        """
        The Grok of what to parse.
        """
        return pulumi.get(self, "grok")

    @grok.setter
    def grok(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grok", value)

    @property
    @pulumi.getter
    def lucene(self) -> Optional[pulumi.Input[str]]:
        """
        The Lucene to match events to the parsing rule.
        """
        return pulumi.get(self, "lucene")

    @lucene.setter
    def lucene(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lucene", value)

    @property
    @pulumi.getter
    def matched(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the Grok pattern matched.
        """
        return pulumi.get(self, "matched")

    @matched.setter
    def matched(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "matched", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def nrql(self) -> Optional[pulumi.Input[str]]:
        """
        The NRQL to match events to the parsing rule.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nrql", value)


class LogParsingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 attribute: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 grok: Optional[pulumi.Input[str]] = None,
                 lucene: Optional[pulumi.Input[str]] = None,
                 matched: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create, update and delete New Relic Log Parsing Rule.

        ## Example Usage

        Use this example to create the log parse rule.
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.LogParsingRule("foo",
            attribute="message",
            enabled=True,
            grok="sampleattribute='%%{NUMBER:test:int}'",
            lucene="logtype:linux_messages",
            nrql="SELECT * FROM Log WHERE logtype = 'linux_messages'")
        ```
        ## Additional Example

        Use this example to validate a grok pattern and create the log parse rule.  More
        information on grok pattern can be found [here](https://docs.newrelic.com/docs/logs/ui-data/parsing/#grok)
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        grok = newrelic.get_test_grok_pattern(grok="%{IP:host_ip}",
            log_lines=["host_ip: 43.3.120.2"])
        foo = newrelic.LogParsingRule("foo",
            attribute="message",
            enabled=True,
            grok=grok.grok,
            lucene="logtype:linux_messages",
            nrql="SELECT * FROM Log WHERE logtype = 'linux_messages'",
            matched=grok.test_groks[0].matched)
        ```

        ## Import

        New Relic log parsing rule can be imported using the rule ID, e.g. bash

        ```sh
         $ pulumi import newrelic:index/logParsingRule:LogParsingRule foo 3456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation rule.
        :param pulumi.Input[str] attribute: The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        :param pulumi.Input[bool] enabled: Whether the rule should be applied or not to incoming data.
        :param pulumi.Input[str] grok: The Grok of what to parse.
        :param pulumi.Input[str] lucene: The Lucene to match events to the parsing rule.
        :param pulumi.Input[bool] matched: Whether the Grok pattern matched.
        :param pulumi.Input[str] name: Name of rule.
        :param pulumi.Input[str] nrql: The NRQL to match events to the parsing rule.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogParsingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update and delete New Relic Log Parsing Rule.

        ## Example Usage

        Use this example to create the log parse rule.
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.LogParsingRule("foo",
            attribute="message",
            enabled=True,
            grok="sampleattribute='%%{NUMBER:test:int}'",
            lucene="logtype:linux_messages",
            nrql="SELECT * FROM Log WHERE logtype = 'linux_messages'")
        ```
        ## Additional Example

        Use this example to validate a grok pattern and create the log parse rule.  More
        information on grok pattern can be found [here](https://docs.newrelic.com/docs/logs/ui-data/parsing/#grok)
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        grok = newrelic.get_test_grok_pattern(grok="%{IP:host_ip}",
            log_lines=["host_ip: 43.3.120.2"])
        foo = newrelic.LogParsingRule("foo",
            attribute="message",
            enabled=True,
            grok=grok.grok,
            lucene="logtype:linux_messages",
            nrql="SELECT * FROM Log WHERE logtype = 'linux_messages'",
            matched=grok.test_groks[0].matched)
        ```

        ## Import

        New Relic log parsing rule can be imported using the rule ID, e.g. bash

        ```sh
         $ pulumi import newrelic:index/logParsingRule:LogParsingRule foo 3456789
        ```

        :param str resource_name: The name of the resource.
        :param LogParsingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogParsingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 attribute: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 grok: Optional[pulumi.Input[str]] = None,
                 lucene: Optional[pulumi.Input[str]] = None,
                 matched: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nrql: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogParsingRuleArgs.__new__(LogParsingRuleArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["attribute"] = attribute
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if grok is None and not opts.urn:
                raise TypeError("Missing required property 'grok'")
            __props__.__dict__["grok"] = grok
            if lucene is None and not opts.urn:
                raise TypeError("Missing required property 'lucene'")
            __props__.__dict__["lucene"] = lucene
            __props__.__dict__["matched"] = matched
            __props__.__dict__["name"] = name
            if nrql is None and not opts.urn:
                raise TypeError("Missing required property 'nrql'")
            __props__.__dict__["nrql"] = nrql
            __props__.__dict__["deleted"] = None
        super(LogParsingRule, __self__).__init__(
            'newrelic:index/logParsingRule:LogParsingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            attribute: Optional[pulumi.Input[str]] = None,
            deleted: Optional[pulumi.Input[bool]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            grok: Optional[pulumi.Input[str]] = None,
            lucene: Optional[pulumi.Input[str]] = None,
            matched: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            nrql: Optional[pulumi.Input[str]] = None) -> 'LogParsingRule':
        """
        Get an existing LogParsingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation rule.
        :param pulumi.Input[str] attribute: The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        :param pulumi.Input[bool] deleted: Whether or not this rule is deleted.
        :param pulumi.Input[bool] enabled: Whether the rule should be applied or not to incoming data.
        :param pulumi.Input[str] grok: The Grok of what to parse.
        :param pulumi.Input[str] lucene: The Lucene to match events to the parsing rule.
        :param pulumi.Input[bool] matched: Whether the Grok pattern matched.
        :param pulumi.Input[str] name: Name of rule.
        :param pulumi.Input[str] nrql: The NRQL to match events to the parsing rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogParsingRuleState.__new__(_LogParsingRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["attribute"] = attribute
        __props__.__dict__["deleted"] = deleted
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["grok"] = grok
        __props__.__dict__["lucene"] = lucene
        __props__.__dict__["matched"] = matched
        __props__.__dict__["name"] = name
        __props__.__dict__["nrql"] = nrql
        return LogParsingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The account id associated with the obfuscation rule.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def attribute(self) -> pulumi.Output[Optional[str]]:
        """
        The parsing rule will apply to value of this attribute. If field is not provided, value will default to message.
        """
        return pulumi.get(self, "attribute")

    @property
    @pulumi.getter
    def deleted(self) -> pulumi.Output[bool]:
        """
        Whether or not this rule is deleted.
        """
        return pulumi.get(self, "deleted")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the rule should be applied or not to incoming data.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def grok(self) -> pulumi.Output[str]:
        """
        The Grok of what to parse.
        """
        return pulumi.get(self, "grok")

    @property
    @pulumi.getter
    def lucene(self) -> pulumi.Output[str]:
        """
        The Lucene to match events to the parsing rule.
        """
        return pulumi.get(self, "lucene")

    @property
    @pulumi.getter
    def matched(self) -> pulumi.Output[bool]:
        """
        Whether the Grok pattern matched.
        """
        return pulumi.get(self, "matched")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Output[str]:
        """
        The NRQL to match events to the parsing rule.
        """
        return pulumi.get(self, "nrql")
