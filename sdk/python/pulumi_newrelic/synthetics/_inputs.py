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

__all__ = [
    'BrokenLinksMonitorTagArgs',
    'BrokenLinksMonitorTagArgsDict',
    'CertCheckMonitorTagArgs',
    'CertCheckMonitorTagArgsDict',
    'MonitorCustomHeaderArgs',
    'MonitorCustomHeaderArgsDict',
    'MonitorTagArgs',
    'MonitorTagArgsDict',
    'MultiLocationAlertConditionCriticalArgs',
    'MultiLocationAlertConditionCriticalArgsDict',
    'MultiLocationAlertConditionWarningArgs',
    'MultiLocationAlertConditionWarningArgsDict',
    'ScriptMonitorLocationPrivateArgs',
    'ScriptMonitorLocationPrivateArgsDict',
    'ScriptMonitorTagArgs',
    'ScriptMonitorTagArgsDict',
    'StepMonitorLocationPrivateArgs',
    'StepMonitorLocationPrivateArgsDict',
    'StepMonitorStepArgs',
    'StepMonitorStepArgsDict',
    'StepMonitorTagArgs',
    'StepMonitorTagArgsDict',
]

MYPY = False

if not MYPY:
    class BrokenLinksMonitorTagArgsDict(TypedDict):
        key: pulumi.Input[str]
        """
        Name of the tag key.
        """
        values: pulumi.Input[Sequence[pulumi.Input[str]]]
        """
        Values associated with the tag key.
        """
elif False:
    BrokenLinksMonitorTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BrokenLinksMonitorTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] key: Name of the tag key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Values associated with the tag key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class CertCheckMonitorTagArgsDict(TypedDict):
        key: pulumi.Input[str]
        """
        Name of the tag key.
        """
        values: pulumi.Input[Sequence[pulumi.Input[str]]]
        """
        Values associated with the tag key.
        """
elif False:
    CertCheckMonitorTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class CertCheckMonitorTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] key: Name of the tag key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Values associated with the tag key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class MonitorCustomHeaderArgsDict(TypedDict):
        name: NotRequired[pulumi.Input[str]]
        """
        Header name.
        """
        value: NotRequired[pulumi.Input[str]]
        """
        Header Value.
        """
elif False:
    MonitorCustomHeaderArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class MonitorCustomHeaderArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] name: Header name.
        :param pulumi.Input[str] value: Header Value.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Header name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Header Value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


if not MYPY:
    class MonitorTagArgsDict(TypedDict):
        key: pulumi.Input[str]
        """
        Name of the tag key.
        """
        values: pulumi.Input[Sequence[pulumi.Input[str]]]
        """
        Values associated with the tag key.
        """
elif False:
    MonitorTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class MonitorTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] key: Name of the tag key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Values associated with the tag key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class MultiLocationAlertConditionCriticalArgsDict(TypedDict):
        threshold: pulumi.Input[int]
        """
        The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
elif False:
    MultiLocationAlertConditionCriticalArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class MultiLocationAlertConditionCriticalArgs:
    def __init__(__self__, *,
                 threshold: pulumi.Input[int]):
        """
        :param pulumi.Input[int] threshold: The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
        pulumi.set(__self__, "threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Input[int]:
        """
        The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: pulumi.Input[int]):
        pulumi.set(self, "threshold", value)


if not MYPY:
    class MultiLocationAlertConditionWarningArgsDict(TypedDict):
        threshold: pulumi.Input[int]
        """
        The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
elif False:
    MultiLocationAlertConditionWarningArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class MultiLocationAlertConditionWarningArgs:
    def __init__(__self__, *,
                 threshold: pulumi.Input[int]):
        """
        :param pulumi.Input[int] threshold: The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
        pulumi.set(__self__, "threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Input[int]:
        """
        The minimum number of monitor locations that must be concurrently failing before an incident is opened.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: pulumi.Input[int]):
        pulumi.set(self, "threshold", value)


if not MYPY:
    class ScriptMonitorLocationPrivateArgsDict(TypedDict):
        guid: pulumi.Input[str]
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        vse_password: NotRequired[pulumi.Input[str]]
        """
        The location's Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
        """
elif False:
    ScriptMonitorLocationPrivateArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ScriptMonitorLocationPrivateArgs:
    def __init__(__self__, *,
                 guid: pulumi.Input[str],
                 vse_password: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] guid: The unique identifier for the Synthetics private location in New Relic.
        :param pulumi.Input[str] vse_password: The location's Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
        """
        pulumi.set(__self__, "guid", guid)
        if vse_password is not None:
            pulumi.set(__self__, "vse_password", vse_password)

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Input[str]:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: pulumi.Input[str]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter(name="vsePassword")
    def vse_password(self) -> Optional[pulumi.Input[str]]:
        """
        The location's Verified Script Execution password, Only necessary if Verified Script Execution is enabled for the location.
        """
        return pulumi.get(self, "vse_password")

    @vse_password.setter
    def vse_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vse_password", value)


if not MYPY:
    class ScriptMonitorTagArgsDict(TypedDict):
        key: pulumi.Input[str]
        """
        Name of the tag key.
        """
        values: pulumi.Input[Sequence[pulumi.Input[str]]]
        """
        Values associated with the tag key.
        """
elif False:
    ScriptMonitorTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ScriptMonitorTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] key: Name of the tag key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Values associated with the tag key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class StepMonitorLocationPrivateArgsDict(TypedDict):
        guid: pulumi.Input[str]
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        vse_password: NotRequired[pulumi.Input[str]]
        """
        The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        """
elif False:
    StepMonitorLocationPrivateArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class StepMonitorLocationPrivateArgs:
    def __init__(__self__, *,
                 guid: pulumi.Input[str],
                 vse_password: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] guid: The unique identifier for the Synthetics private location in New Relic.
        :param pulumi.Input[str] vse_password: The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        """
        pulumi.set(__self__, "guid", guid)
        if vse_password is not None:
            pulumi.set(__self__, "vse_password", vse_password)

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Input[str]:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: pulumi.Input[str]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter(name="vsePassword")
    def vse_password(self) -> Optional[pulumi.Input[str]]:
        """
        The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        """
        return pulumi.get(self, "vse_password")

    @vse_password.setter
    def vse_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vse_password", value)


if not MYPY:
    class StepMonitorStepArgsDict(TypedDict):
        ordinal: pulumi.Input[int]
        """
        The position of the step within the script ranging from 0-100.
        """
        type: pulumi.Input[str]
        """
        Name of the tag key. Valid values are `ASSERT_ELEMENT`, `ASSERT_MODAL`, `ASSERT_TEXT`, `ASSERT_TITLE`, `CLICK_ELEMENT`, `DISMISS_MODAL`, `DOUBLE_CLICK_ELEMENT`, `HOVER_ELEMENT`, `NAVIGATE`, `SECURE_TEXT_ENTRY`, `SELECT_ELEMENT`, `TEXT_ENTRY`.
        """
        values: NotRequired[pulumi.Input[Sequence[pulumi.Input[str]]]]
        """
        The metadata values related to the step.
        """
elif False:
    StepMonitorStepArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class StepMonitorStepArgs:
    def __init__(__self__, *,
                 ordinal: pulumi.Input[int],
                 type: pulumi.Input[str],
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[int] ordinal: The position of the step within the script ranging from 0-100.
        :param pulumi.Input[str] type: Name of the tag key. Valid values are `ASSERT_ELEMENT`, `ASSERT_MODAL`, `ASSERT_TEXT`, `ASSERT_TITLE`, `CLICK_ELEMENT`, `DISMISS_MODAL`, `DOUBLE_CLICK_ELEMENT`, `HOVER_ELEMENT`, `NAVIGATE`, `SECURE_TEXT_ENTRY`, `SELECT_ELEMENT`, `TEXT_ENTRY`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: The metadata values related to the step.
        """
        pulumi.set(__self__, "ordinal", ordinal)
        pulumi.set(__self__, "type", type)
        if values is not None:
            pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def ordinal(self) -> pulumi.Input[int]:
        """
        The position of the step within the script ranging from 0-100.
        """
        return pulumi.get(self, "ordinal")

    @ordinal.setter
    def ordinal(self, value: pulumi.Input[int]):
        pulumi.set(self, "ordinal", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Name of the tag key. Valid values are `ASSERT_ELEMENT`, `ASSERT_MODAL`, `ASSERT_TEXT`, `ASSERT_TITLE`, `CLICK_ELEMENT`, `DISMISS_MODAL`, `DOUBLE_CLICK_ELEMENT`, `HOVER_ELEMENT`, `NAVIGATE`, `SECURE_TEXT_ENTRY`, `SELECT_ELEMENT`, `TEXT_ENTRY`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The metadata values related to the step.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "values", value)


if not MYPY:
    class StepMonitorTagArgsDict(TypedDict):
        key: pulumi.Input[str]
        """
        Name of the tag key.
        """
        values: pulumi.Input[Sequence[pulumi.Input[str]]]
        """
        Values associated with the tag key.
        """
elif False:
    StepMonitorTagArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class StepMonitorTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] key: Name of the tag key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Values associated with the tag key.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Name of the tag key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Values associated with the tag key.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


