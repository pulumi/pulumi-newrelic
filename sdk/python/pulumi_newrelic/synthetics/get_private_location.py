# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetPrivateLocationResult',
    'AwaitableGetPrivateLocationResult',
    'get_private_location',
    'get_private_location_output',
]

@pulumi.output_type
class GetPrivateLocationResult:
    """
    A collection of values returned by getPrivateLocation.
    """
    def __init__(__self__, account_id=None, id=None, keys=None, name=None):
        if account_id and not isinstance(account_id, int):
            raise TypeError("Expected argument 'account_id' to be a int")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

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
    def keys(self) -> Sequence[str]:
        """
        The key of the private location.
        """
        return pulumi.get(self, "keys")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetPrivateLocationResult(GetPrivateLocationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateLocationResult(
            account_id=self.account_id,
            id=self.id,
            keys=self.keys,
            name=self.name)


def get_private_location(account_id: Optional[int] = None,
                         keys: Optional[Sequence[str]] = None,
                         name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateLocationResult:
    """
    Use this data source to get information about a specific Synthetics monitor private location in New Relic that already exists.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    example = newrelic.synthetics.get_private_location(account_id=123456,
        name="My private location")
    foo = newrelic.synthetics.Monitor("foo", locations_privates=[data["newrelic_synthetics_monitor_location"]["example"]["id"]])
    ```

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    example = newrelic.synthetics.get_private_location(account_id=123456,
        name="My private location")
    foo = newrelic.synthetics.StepMonitor("foo", location_privates=[newrelic.synthetics.StepMonitorLocationPrivateArgs(
        guid=example.id,
    )])
    ```


    :param int account_id: The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
    :param Sequence[str] keys: The key of the private location.
    :param str name: The name of the Synthetics monitor private location.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['keys'] = keys
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:synthetics/getPrivateLocation:getPrivateLocation', __args__, opts=opts, typ=GetPrivateLocationResult).value

    return AwaitableGetPrivateLocationResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        keys=pulumi.get(__ret__, 'keys'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_private_location)
def get_private_location_output(account_id: Optional[pulumi.Input[Optional[int]]] = None,
                                keys: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                name: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivateLocationResult]:
    """
    Use this data source to get information about a specific Synthetics monitor private location in New Relic that already exists.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    example = newrelic.synthetics.get_private_location(account_id=123456,
        name="My private location")
    foo = newrelic.synthetics.Monitor("foo", locations_privates=[data["newrelic_synthetics_monitor_location"]["example"]["id"]])
    ```

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    example = newrelic.synthetics.get_private_location(account_id=123456,
        name="My private location")
    foo = newrelic.synthetics.StepMonitor("foo", location_privates=[newrelic.synthetics.StepMonitorLocationPrivateArgs(
        guid=example.id,
    )])
    ```


    :param int account_id: The New Relic account ID of the associated private location. If left empty will default to account ID specified in provider level configuration.
    :param Sequence[str] keys: The key of the private location.
    :param str name: The name of the Synthetics monitor private location.
    """
    ...
