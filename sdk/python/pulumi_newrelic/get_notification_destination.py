# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetNotificationDestinationResult',
    'AwaitableGetNotificationDestinationResult',
    'get_notification_destination',
    'get_notification_destination_output',
]

@pulumi.output_type
class GetNotificationDestinationResult:
    """
    A collection of values returned by getNotificationDestination.
    """
    def __init__(__self__, account_id=None, active=None, guid=None, id=None, name=None, properties=None, secure_urls=None, status=None, type=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if active and not isinstance(active, bool):
            raise TypeError("Expected argument 'active' to be a bool")
        pulumi.set(__self__, "active", active)
        if guid and not isinstance(guid, str):
            raise TypeError("Expected argument 'guid' to be a str")
        pulumi.set(__self__, "guid", guid)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if properties and not isinstance(properties, list):
            raise TypeError("Expected argument 'properties' to be a list")
        pulumi.set(__self__, "properties", properties)
        if secure_urls and not isinstance(secure_urls, list):
            raise TypeError("Expected argument 'secure_urls' to be a list")
        pulumi.set(__self__, "secure_urls", secure_urls)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def active(self) -> bool:
        """
        An indication whether the notification destination is active or not.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter
    def guid(self) -> str:
        """
        The unique entity identifier of the destination in New Relic.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the notification destination.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def properties(self) -> Sequence['outputs.GetNotificationDestinationPropertyResult']:
        """
        A nested block that describes a notification destination property.
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter(name="secureUrls")
    def secure_urls(self) -> Sequence['outputs.GetNotificationDestinationSecureUrlResult']:
        """
        The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
        """
        return pulumi.get(self, "secure_urls")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the notification destination.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The notification destination type, either: `EMAIL`, `SERVICE_NOW`, `SERVICE_NOW_APP`, `WEBHOOK`, `JIRA`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`, `SLACK` and `SLACK_COLLABORATION`.
        """
        return pulumi.get(self, "type")


class AwaitableGetNotificationDestinationResult(GetNotificationDestinationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotificationDestinationResult(
            account_id=self.account_id,
            active=self.active,
            guid=self.guid,
            id=self.id,
            name=self.name,
            properties=self.properties,
            secure_urls=self.secure_urls,
            status=self.status,
            type=self.type)


def get_notification_destination(account_id: Optional[str] = None,
                                 id: Optional[str] = None,
                                 name: Optional[str] = None,
                                 secure_urls: Optional[Sequence[pulumi.InputType['GetNotificationDestinationSecureUrlArgs']]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotificationDestinationResult:
    """
    Use this data source to access information about an existing resource.

    :param str account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param str id: The id of the notification destination in New Relic.
    :param str name: The name of the notification destination.
           
           Optional:
    :param Sequence[pulumi.InputType['GetNotificationDestinationSecureUrlArgs']] secure_urls: The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['id'] = id
    __args__['name'] = name
    __args__['secureUrls'] = secure_urls
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getNotificationDestination:getNotificationDestination', __args__, opts=opts, typ=GetNotificationDestinationResult).value

    return AwaitableGetNotificationDestinationResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        active=pulumi.get(__ret__, 'active'),
        guid=pulumi.get(__ret__, 'guid'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        properties=pulumi.get(__ret__, 'properties'),
        secure_urls=pulumi.get(__ret__, 'secure_urls'),
        status=pulumi.get(__ret__, 'status'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_notification_destination)
def get_notification_destination_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        id: Optional[pulumi.Input[Optional[str]]] = None,
                                        name: Optional[pulumi.Input[Optional[str]]] = None,
                                        secure_urls: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetNotificationDestinationSecureUrlArgs']]]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNotificationDestinationResult]:
    """
    Use this data source to access information about an existing resource.

    :param str account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param str id: The id of the notification destination in New Relic.
    :param str name: The name of the notification destination.
           
           Optional:
    :param Sequence[pulumi.InputType['GetNotificationDestinationSecureUrlArgs']] secure_urls: The URL in secure format, showing only the `prefix`, as the `secure_suffix` is a secret.
    """
    ...
