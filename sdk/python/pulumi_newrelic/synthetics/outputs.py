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
    'BrokenLinksMonitorTag',
    'CertCheckMonitorTag',
    'MonitorCustomHeader',
    'MonitorTag',
    'MultiLocationAlertConditionCritical',
    'MultiLocationAlertConditionWarning',
    'ScriptMonitorLocationPrivate',
    'ScriptMonitorTag',
    'StepMonitorLocationPrivate',
    'StepMonitorStep',
    'StepMonitorTag',
]

@pulumi.output_type
class BrokenLinksMonitorTag(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Name of the tag key.
        :param Sequence[str] values: Values associated with the tag key.
        """
        BrokenLinksMonitorTag._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class CertCheckMonitorTag(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Name of the tag key.
        :param Sequence[str] values: Values associated with the tag key.
        """
        CertCheckMonitorTag._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class MonitorCustomHeader(dict):
    def __init__(__self__, *,
                 name: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str name: Header name.
        :param str value: Header Value.
        """
        MonitorCustomHeader._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[str] = None,
             value: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if name is not None:
            _setter("name", name)
        if value is not None:
            _setter("value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Header name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        Header Value.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class MonitorTag(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Name of the tag key.
        :param Sequence[str] values: Values associated with the tag key.
        """
        MonitorTag._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class MultiLocationAlertConditionCritical(dict):
    def __init__(__self__, *,
                 threshold: int):
        MultiLocationAlertConditionCritical._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            threshold=threshold,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             threshold: Optional[int] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if threshold is None:
            raise TypeError("Missing 'threshold' argument")

        _setter("threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> int:
        return pulumi.get(self, "threshold")


@pulumi.output_type
class MultiLocationAlertConditionWarning(dict):
    def __init__(__self__, *,
                 threshold: int):
        MultiLocationAlertConditionWarning._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            threshold=threshold,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             threshold: Optional[int] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if threshold is None:
            raise TypeError("Missing 'threshold' argument")

        _setter("threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> int:
        return pulumi.get(self, "threshold")


@pulumi.output_type
class ScriptMonitorLocationPrivate(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "vsePassword":
            suggest = "vse_password"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ScriptMonitorLocationPrivate. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ScriptMonitorLocationPrivate.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ScriptMonitorLocationPrivate.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 guid: str,
                 vse_password: Optional[str] = None):
        """
        :param str guid: The unique identifier for the Synthetics private location in New Relic.
        :param str vse_password: The location's Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
        """
        ScriptMonitorLocationPrivate._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            guid=guid,
            vse_password=vse_password,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             guid: Optional[str] = None,
             vse_password: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if guid is None:
            raise TypeError("Missing 'guid' argument")
        if vse_password is None and 'vsePassword' in kwargs:
            vse_password = kwargs['vsePassword']

        _setter("guid", guid)
        if vse_password is not None:
            _setter("vse_password", vse_password)

    @property
    @pulumi.getter
    def guid(self) -> str:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter(name="vsePassword")
    def vse_password(self) -> Optional[str]:
        """
        The location's Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
        """
        return pulumi.get(self, "vse_password")


@pulumi.output_type
class ScriptMonitorTag(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Name of the tag key.
        :param Sequence[str] values: Values associated with the tag key.
        """
        ScriptMonitorTag._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class StepMonitorLocationPrivate(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "vsePassword":
            suggest = "vse_password"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StepMonitorLocationPrivate. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StepMonitorLocationPrivate.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StepMonitorLocationPrivate.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 guid: str,
                 vse_password: Optional[str] = None):
        """
        :param str guid: The unique identifier for the Synthetics private location in New Relic.
        :param str vse_password: The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        """
        StepMonitorLocationPrivate._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            guid=guid,
            vse_password=vse_password,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             guid: Optional[str] = None,
             vse_password: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if guid is None:
            raise TypeError("Missing 'guid' argument")
        if vse_password is None and 'vsePassword' in kwargs:
            vse_password = kwargs['vsePassword']

        _setter("guid", guid)
        if vse_password is not None:
            _setter("vse_password", vse_password)

    @property
    @pulumi.getter
    def guid(self) -> str:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter(name="vsePassword")
    def vse_password(self) -> Optional[str]:
        """
        The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        """
        return pulumi.get(self, "vse_password")


@pulumi.output_type
class StepMonitorStep(dict):
    def __init__(__self__, *,
                 ordinal: int,
                 type: str,
                 values: Optional[Sequence[str]] = None):
        """
        :param int ordinal: The position of the step within the script ranging from 0-100.
        :param str type: Name of the tag key. Valid values are ASSERT_ELEMENT, ASSERT_MODAL, ASSERT_TEXT, ASSERT_TITLE, CLICK_ELEMENT, DISMISS_MODAL, DOUBLE_CLICK_ELEMENT, HOVER_ELEMENT, NAVIGATE, SECURE_TEXT_ENTRY, SELECT_ELEMENT, TEXT_ENTRY.
        :param Sequence[str] values: The metadata values related to the step.
        """
        StepMonitorStep._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            ordinal=ordinal,
            type=type,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             ordinal: Optional[int] = None,
             type: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if ordinal is None:
            raise TypeError("Missing 'ordinal' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("ordinal", ordinal)
        _setter("type", type)
        if values is not None:
            _setter("values", values)

    @property
    @pulumi.getter
    def ordinal(self) -> int:
        """
        The position of the step within the script ranging from 0-100.
        """
        return pulumi.get(self, "ordinal")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Name of the tag key. Valid values are ASSERT_ELEMENT, ASSERT_MODAL, ASSERT_TEXT, ASSERT_TITLE, CLICK_ELEMENT, DISMISS_MODAL, DOUBLE_CLICK_ELEMENT, HOVER_ELEMENT, NAVIGATE, SECURE_TEXT_ENTRY, SELECT_ELEMENT, TEXT_ENTRY.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[str]]:
        """
        The metadata values related to the step.
        """
        return pulumi.get(self, "values")


@pulumi.output_type
class StepMonitorTag(dict):
    def __init__(__self__, *,
                 key: str,
                 values: Sequence[str]):
        """
        :param str key: Name of the tag key.
        :param Sequence[str] values: Values associated with the tag key.
        """
        StepMonitorTag._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")


