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
from .. import _utilities

__all__ = [
    'GetSecureCredentialResult',
    'AwaitableGetSecureCredentialResult',
    'get_secure_credential',
    'get_secure_credential_output',
]

@pulumi.output_type
class GetSecureCredentialResult:
    """
    A collection of values returned by getSecureCredential.
    """
    def __init__(__self__, account_id=None, description=None, id=None, key=None, last_updated=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key and not isinstance(key, str):
            raise TypeError("Expected argument 'key' to be a str")
        pulumi.set(__self__, "key", key)
        if last_updated and not isinstance(last_updated, str):
            raise TypeError("Expected argument 'last_updated' to be a str")
        pulumi.set(__self__, "last_updated", last_updated)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> builtins.str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The secure credential's description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def key(self) -> builtins.str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="lastUpdated")
    def last_updated(self) -> builtins.str:
        """
        The time the secure credential was last updated.
        """
        return pulumi.get(self, "last_updated")


class AwaitableGetSecureCredentialResult(GetSecureCredentialResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecureCredentialResult(
            account_id=self.account_id,
            description=self.description,
            id=self.id,
            key=self.key,
            last_updated=self.last_updated)


def get_secure_credential(account_id: Optional[builtins.str] = None,
                          key: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecureCredentialResult:
    """
    Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.

    Note that the secure credential's value is not returned as an attribute for security reasons.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.synthetics.get_secure_credential(key="MY_KEY")
    ```


    :param builtins.str account_id: The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
    :param builtins.str key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['key'] = key
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:synthetics/getSecureCredential:getSecureCredential', __args__, opts=opts, typ=GetSecureCredentialResult).value

    return AwaitableGetSecureCredentialResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        key=pulumi.get(__ret__, 'key'),
        last_updated=pulumi.get(__ret__, 'last_updated'))
def get_secure_credential_output(account_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 key: Optional[pulumi.Input[builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSecureCredentialResult]:
    """
    Use this data source to get information about a specific Synthetics secure credential in New Relic that already exists.

    Note that the secure credential's value is not returned as an attribute for security reasons.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.synthetics.get_secure_credential(key="MY_KEY")
    ```


    :param builtins.str account_id: The account in New Relic associated with the secure credential. Defaults to the account associated with the API key used.
    :param builtins.str key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['key'] = key
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('newrelic:synthetics/getSecureCredential:getSecureCredential', __args__, opts=opts, typ=GetSecureCredentialResult)
    return __ret__.apply(lambda __response__: GetSecureCredentialResult(
        account_id=pulumi.get(__response__, 'account_id'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        key=pulumi.get(__response__, 'key'),
        last_updated=pulumi.get(__response__, 'last_updated')))
