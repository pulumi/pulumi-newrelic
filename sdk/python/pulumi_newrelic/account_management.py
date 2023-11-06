# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccountManagementArgs', 'AccountManagement']

@pulumi.input_type
class AccountManagementArgs:
    def __init__(__self__, *,
                 region: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountManagement resource.
        :param pulumi.Input[str] region: The region code of the account.  One of: `us01`, `eu01`.
        :param pulumi.Input[str] name: The name of the Account.
        """
        AccountManagementArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            region=region,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             region: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if region is None:
            raise TypeError("Missing 'region' argument")

        _setter("region", region)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The region code of the account.  One of: `us01`, `eu01`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AccountManagementState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountManagement resources.
        :param pulumi.Input[str] name: The name of the Account.
        :param pulumi.Input[str] region: The region code of the account.  One of: `us01`, `eu01`.
        """
        _AccountManagementState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            region=region,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             region: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if name is not None:
            _setter("name", name)
        if region is not None:
            _setter("region", region)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region code of the account.  One of: `us01`, `eu01`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


class AccountManagement(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create and manage New Relic sub accounts.

        > **WARNING:** The `AccountManagement` resource will only create/update but won't delete a sub account. Please visit our documentation on  [`Account Management`](https://docs.newrelic.com/docs/apis/nerdgraph/examples/manage-accounts-nerdgraph/#delete) for more information .

        ## Example Usage

        ##### Create Account
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AccountManagement("foo", region="us01")
        ```

        ## Import

        Accounts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:index/accountManagement:AccountManagement foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the Account.
        :param pulumi.Input[str] region: The region code of the account.  One of: `us01`, `eu01`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountManagementArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage New Relic sub accounts.

        > **WARNING:** The `AccountManagement` resource will only create/update but won't delete a sub account. Please visit our documentation on  [`Account Management`](https://docs.newrelic.com/docs/apis/nerdgraph/examples/manage-accounts-nerdgraph/#delete) for more information .

        ## Example Usage

        ##### Create Account
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AccountManagement("foo", region="us01")
        ```

        ## Import

        Accounts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:index/accountManagement:AccountManagement foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param AccountManagementArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountManagementArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccountManagementArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountManagementArgs.__new__(AccountManagementArgs)

            __props__.__dict__["name"] = name
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
        super(AccountManagement, __self__).__init__(
            'newrelic:index/accountManagement:AccountManagement',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'AccountManagement':
        """
        Get an existing AccountManagement resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the Account.
        :param pulumi.Input[str] region: The region code of the account.  One of: `us01`, `eu01`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountManagementState.__new__(_AccountManagementState)

        __props__.__dict__["name"] = name
        __props__.__dict__["region"] = region
        return AccountManagement(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region code of the account.  One of: `us01`, `eu01`.
        """
        return pulumi.get(self, "region")

