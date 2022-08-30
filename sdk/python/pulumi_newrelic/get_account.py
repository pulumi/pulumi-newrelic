# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAccountResult',
    'AwaitableGetAccountResult',
    'get_account',
    'get_account_output',
]

@pulumi.output_type
class GetAccountResult:
    """
    A collection of values returned by getAccount.
    """
    def __init__(__self__, account_id=None, id=None, name=None, scope=None):
        if account_id and not isinstance(account_id, int):
            raise TypeError("Expected argument 'account_id' to be a int")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[int]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")


class AwaitableGetAccountResult(GetAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountResult(
            account_id=self.account_id,
            id=self.id,
            name=self.name,
            scope=self.scope)


def get_account(account_id: Optional[int] = None,
                name: Optional[str] = None,
                scope: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountResult:
    """
    Use this data source to get information about a specific account in New Relic.
    Accounts can be located by ID or name.  Exactly one of the two attributes is
    required.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    acc = newrelic.get_account(scope="global")
    ```


    :param int account_id: The account ID in New Relic.
    :param str name: The account name in New Relic.
    :param str scope: The scope of the account in New Relic.  Valid values are "global" and "in_region".  Defaults to "in_region".
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['name'] = name
    __args__['scope'] = scope
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult).value

    return AwaitableGetAccountResult(
        account_id=__ret__.account_id,
        id=__ret__.id,
        name=__ret__.name,
        scope=__ret__.scope)


@_utilities.lift_output_func(get_account)
def get_account_output(account_id: Optional[pulumi.Input[Optional[int]]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       scope: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountResult]:
    """
    Use this data source to get information about a specific account in New Relic.
    Accounts can be located by ID or name.  Exactly one of the two attributes is
    required.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    acc = newrelic.get_account(scope="global")
    ```


    :param int account_id: The account ID in New Relic.
    :param str name: The account name in New Relic.
    :param str scope: The scope of the account in New Relic.  Valid values are "global" and "in_region".  Defaults to "in_region".
    """
    ...
