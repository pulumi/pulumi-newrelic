# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'EventEventArgs',
    'EventEventAttributeArgs',
]

@pulumi.input_type
class EventEventArgs:
    def __init__(__self__, *,
                 attributes: pulumi.Input[Sequence[pulumi.Input['EventEventAttributeArgs']]],
                 type: pulumi.Input[str],
                 timestamp: Optional[pulumi.Input[int]] = None):
        EventEventArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            attributes=attributes,
            type=type,
            timestamp=timestamp,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             attributes: Optional[pulumi.Input[Sequence[pulumi.Input['EventEventAttributeArgs']]]] = None,
             type: Optional[pulumi.Input[str]] = None,
             timestamp: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if attributes is None:
            raise TypeError("Missing 'attributes' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("attributes", attributes)
        _setter("type", type)
        if timestamp is not None:
            _setter("timestamp", timestamp)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Input[Sequence[pulumi.Input['EventEventAttributeArgs']]]:
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: pulumi.Input[Sequence[pulumi.Input['EventEventAttributeArgs']]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "timestamp")

    @timestamp.setter
    def timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timestamp", value)


@pulumi.input_type
class EventEventAttributeArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str],
                 type: Optional[pulumi.Input[str]] = None):
        EventEventAttributeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            value=value,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if value is None:
            raise TypeError("Missing 'value' argument")

        _setter("key", key)
        _setter("value", value)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


