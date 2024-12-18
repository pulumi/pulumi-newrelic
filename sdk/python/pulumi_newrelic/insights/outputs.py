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
from .. import _utilities
from . import outputs

__all__ = [
    'EventEvent',
    'EventEventAttribute',
]

@pulumi.output_type
class EventEvent(dict):
    def __init__(__self__, *,
                 attributes: Sequence['outputs.EventEventAttribute'],
                 type: str,
                 timestamp: Optional[int] = None):
        """
        :param Sequence['EventEventAttributeArgs'] attributes: An attribute to include in your event payload. Multiple attribute blocks can be defined for an event.
        :param str type: The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
        :param int timestamp: Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
        """
        pulumi.set(__self__, "attributes", attributes)
        pulumi.set(__self__, "type", type)
        if timestamp is not None:
            pulumi.set(__self__, "timestamp", timestamp)

    @property
    @pulumi.getter
    def attributes(self) -> Sequence['outputs.EventEventAttribute']:
        """
        An attribute to include in your event payload. Multiple attribute blocks can be defined for an event.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[int]:
        """
        Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
        """
        return pulumi.get(self, "timestamp")


@pulumi.output_type
class EventEventAttribute(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str,
                 type: Optional[str] = None):
        """
        :param str key: The name of the attribute.
        :param str value: The value of the attribute.
        :param str type: Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are string, int, or float. Defaults to string.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The name of the attribute.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the attribute.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are string, int, or float. Defaults to string.
        """
        return pulumi.get(self, "type")


