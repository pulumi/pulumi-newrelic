# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ObfuscationExpressionArgs', 'ObfuscationExpression']

@pulumi.input_type
class ObfuscationExpressionArgs:
    def __init__(__self__, *,
                 regex: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ObfuscationExpression resource.
        :param pulumi.Input[str] regex: Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation expression.
        :param pulumi.Input[str] description: Description of expression.
        :param pulumi.Input[str] name: Name of expression.
        """
        ObfuscationExpressionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            regex=regex,
            account_id=account_id,
            description=description,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             regex: Optional[pulumi.Input[str]] = None,
             account_id: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if regex is None:
            raise TypeError("Missing 'regex' argument")
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']

        _setter("regex", regex)
        if account_id is not None:
            _setter("account_id", account_id)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def regex(self) -> pulumi.Input[str]:
        """
        Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        return pulumi.get(self, "regex")

    @regex.setter
    def regex(self, value: pulumi.Input[str]):
        pulumi.set(self, "regex", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id associated with the obfuscation expression.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of expression.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of expression.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ObfuscationExpressionState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regex: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ObfuscationExpression resources.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation expression.
        :param pulumi.Input[str] description: Description of expression.
        :param pulumi.Input[str] name: Name of expression.
        :param pulumi.Input[str] regex: Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        _ObfuscationExpressionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            description=description,
            name=name,
            regex=regex,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             regex: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']

        if account_id is not None:
            _setter("account_id", account_id)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if regex is not None:
            _setter("regex", regex)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id associated with the obfuscation expression.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of expression.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of expression.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regex(self) -> Optional[pulumi.Input[str]]:
        """
        Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        return pulumi.get(self, "regex")

    @regex.setter
    def regex(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "regex", value)


class ObfuscationExpression(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regex: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create, update and delete New Relic Obfuscation Expressions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.ObfuscationExpression("foo",
            account_id=12345,
            description="The description",
            regex="(regex.*)")
        ```

        ## Import

        New Relic obfuscation expression can be imported using the expression ID, e.g. bash

        ```sh
         $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation expression.
        :param pulumi.Input[str] description: Description of expression.
        :param pulumi.Input[str] name: Name of expression.
        :param pulumi.Input[str] regex: Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ObfuscationExpressionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update and delete New Relic Obfuscation Expressions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.ObfuscationExpression("foo",
            account_id=12345,
            description="The description",
            regex="(regex.*)")
        ```

        ## Import

        New Relic obfuscation expression can be imported using the expression ID, e.g. bash

        ```sh
         $ pulumi import newrelic:index/obfuscationExpression:ObfuscationExpression foo 34567
        ```

        :param str resource_name: The name of the resource.
        :param ObfuscationExpressionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObfuscationExpressionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ObfuscationExpressionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regex: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObfuscationExpressionArgs.__new__(ObfuscationExpressionArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if regex is None and not opts.urn:
                raise TypeError("Missing required property 'regex'")
            __props__.__dict__["regex"] = regex
        super(ObfuscationExpression, __self__).__init__(
            'newrelic:index/obfuscationExpression:ObfuscationExpression',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            regex: Optional[pulumi.Input[str]] = None) -> 'ObfuscationExpression':
        """
        Get an existing ObfuscationExpression resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id associated with the obfuscation expression.
        :param pulumi.Input[str] description: Description of expression.
        :param pulumi.Input[str] name: Name of expression.
        :param pulumi.Input[str] regex: Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObfuscationExpressionState.__new__(_ObfuscationExpressionState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["regex"] = regex
        return ObfuscationExpression(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The account id associated with the obfuscation expression.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of expression.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of expression.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def regex(self) -> pulumi.Output[str]:
        """
        Regex of expression. Must be wrapped in parentheses, e.g. (regex.*).
        """
        return pulumi.get(self, "regex")

