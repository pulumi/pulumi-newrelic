# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'MultiLocationAlertConditionCritical',
    'MultiLocationAlertConditionWarning',
]

@pulumi.output_type
class MultiLocationAlertConditionCritical(dict):
    def __init__(__self__, *,
                 threshold: float):
        pulumi.set(__self__, "threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> float:
        return pulumi.get(self, "threshold")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MultiLocationAlertConditionWarning(dict):
    def __init__(__self__, *,
                 threshold: float):
        pulumi.set(__self__, "threshold", threshold)

    @property
    @pulumi.getter
    def threshold(self) -> float:
        return pulumi.get(self, "threshold")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

