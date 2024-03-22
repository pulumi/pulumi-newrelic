# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'WorkloadEntitySearchQuery',
    'WorkloadStatusConfigAutomatic',
    'WorkloadStatusConfigAutomaticRemainingEntitiesRule',
    'WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup',
    'WorkloadStatusConfigAutomaticRule',
    'WorkloadStatusConfigAutomaticRuleNrqlQuery',
    'WorkloadStatusConfigAutomaticRuleRollup',
    'WorkloadStatusConfigStatic',
]

@pulumi.output_type
class WorkloadEntitySearchQuery(dict):
    def __init__(__self__, *,
                 query: str):
        """
        :param str query: A valid entity search query; empty, and null values are considered invalid.
        """
        pulumi.set(__self__, "query", query)

    @property
    @pulumi.getter
    def query(self) -> str:
        """
        A valid entity search query; empty, and null values are considered invalid.
        """
        return pulumi.get(self, "query")


@pulumi.output_type
class WorkloadStatusConfigAutomatic(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "remainingEntitiesRule":
            suggest = "remaining_entities_rule"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkloadStatusConfigAutomatic. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkloadStatusConfigAutomatic.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkloadStatusConfigAutomatic.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: bool,
                 remaining_entities_rule: Optional['outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRule'] = None,
                 rules: Optional[Sequence['outputs.WorkloadStatusConfigAutomaticRule']] = None):
        """
        :param bool enabled: Whether the static status configuration is enabled or not.
        :param 'WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs' remaining_entities_rule: An additional meta-rule that can consider all entities that haven't been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
        :param Sequence['WorkloadStatusConfigAutomaticRuleArgs'] rules: The input object used to represent a rollup strategy. See Nested rule blocks below for details.
        """
        pulumi.set(__self__, "enabled", enabled)
        if remaining_entities_rule is not None:
            pulumi.set(__self__, "remaining_entities_rule", remaining_entities_rule)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether the static status configuration is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="remainingEntitiesRule")
    def remaining_entities_rule(self) -> Optional['outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRule']:
        """
        An additional meta-rule that can consider all entities that haven't been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
        """
        return pulumi.get(self, "remaining_entities_rule")

    @property
    @pulumi.getter
    def rules(self) -> Optional[Sequence['outputs.WorkloadStatusConfigAutomaticRule']]:
        """
        The input object used to represent a rollup strategy. See Nested rule blocks below for details.
        """
        return pulumi.get(self, "rules")


@pulumi.output_type
class WorkloadStatusConfigAutomaticRemainingEntitiesRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "remainingEntitiesRuleRollup":
            suggest = "remaining_entities_rule_rollup"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkloadStatusConfigAutomaticRemainingEntitiesRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkloadStatusConfigAutomaticRemainingEntitiesRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkloadStatusConfigAutomaticRemainingEntitiesRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 remaining_entities_rule_rollup: 'outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup'):
        """
        :param 'WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs' remaining_entities_rule_rollup: The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
        """
        pulumi.set(__self__, "remaining_entities_rule_rollup", remaining_entities_rule_rollup)

    @property
    @pulumi.getter(name="remainingEntitiesRuleRollup")
    def remaining_entities_rule_rollup(self) -> 'outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup':
        """
        The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
        """
        return pulumi.get(self, "remaining_entities_rule_rollup")


@pulumi.output_type
class WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "groupBy":
            suggest = "group_by"
        elif key == "thresholdType":
            suggest = "threshold_type"
        elif key == "thresholdValue":
            suggest = "threshold_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 group_by: str,
                 strategy: str,
                 threshold_type: Optional[str] = None,
                 threshold_value: Optional[int] = None):
        """
        :param str group_by: The grouping to be applied to the remaining entities.
        :param str strategy: The rollup strategy that is applied to a group of entities.
        :param str threshold_type: Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        :param int threshold_value: Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        pulumi.set(__self__, "group_by", group_by)
        pulumi.set(__self__, "strategy", strategy)
        if threshold_type is not None:
            pulumi.set(__self__, "threshold_type", threshold_type)
        if threshold_value is not None:
            pulumi.set(__self__, "threshold_value", threshold_value)

    @property
    @pulumi.getter(name="groupBy")
    def group_by(self) -> str:
        """
        The grouping to be applied to the remaining entities.
        """
        return pulumi.get(self, "group_by")

    @property
    @pulumi.getter
    def strategy(self) -> str:
        """
        The rollup strategy that is applied to a group of entities.
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter(name="thresholdType")
    def threshold_type(self) -> Optional[str]:
        """
        Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        """
        return pulumi.get(self, "threshold_type")

    @property
    @pulumi.getter(name="thresholdValue")
    def threshold_value(self) -> Optional[int]:
        """
        Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        return pulumi.get(self, "threshold_value")


@pulumi.output_type
class WorkloadStatusConfigAutomaticRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "entityGuids":
            suggest = "entity_guids"
        elif key == "nrqlQueries":
            suggest = "nrql_queries"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkloadStatusConfigAutomaticRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkloadStatusConfigAutomaticRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkloadStatusConfigAutomaticRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 rollup: 'outputs.WorkloadStatusConfigAutomaticRuleRollup',
                 entity_guids: Optional[Sequence[str]] = None,
                 nrql_queries: Optional[Sequence['outputs.WorkloadStatusConfigAutomaticRuleNrqlQuery']] = None):
        """
        :param 'WorkloadStatusConfigAutomaticRuleRollupArgs' rollup: The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
        :param Sequence[str] entity_guids: A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
        :param Sequence['WorkloadStatusConfigAutomaticRuleNrqlQueryArgs'] nrql_queries: A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        pulumi.set(__self__, "rollup", rollup)
        if entity_guids is not None:
            pulumi.set(__self__, "entity_guids", entity_guids)
        if nrql_queries is not None:
            pulumi.set(__self__, "nrql_queries", nrql_queries)

    @property
    @pulumi.getter
    def rollup(self) -> 'outputs.WorkloadStatusConfigAutomaticRuleRollup':
        """
        The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
        """
        return pulumi.get(self, "rollup")

    @property
    @pulumi.getter(name="entityGuids")
    def entity_guids(self) -> Optional[Sequence[str]]:
        """
        A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        return pulumi.get(self, "entity_guids")

    @property
    @pulumi.getter(name="nrqlQueries")
    def nrql_queries(self) -> Optional[Sequence['outputs.WorkloadStatusConfigAutomaticRuleNrqlQuery']]:
        """
        A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        return pulumi.get(self, "nrql_queries")


@pulumi.output_type
class WorkloadStatusConfigAutomaticRuleNrqlQuery(dict):
    def __init__(__self__, *,
                 query: str):
        """
        :param str query: The entity search query that is used to perform the search of a group of entities.
        """
        pulumi.set(__self__, "query", query)

    @property
    @pulumi.getter
    def query(self) -> str:
        """
        The entity search query that is used to perform the search of a group of entities.
        """
        return pulumi.get(self, "query")


@pulumi.output_type
class WorkloadStatusConfigAutomaticRuleRollup(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "thresholdType":
            suggest = "threshold_type"
        elif key == "thresholdValue":
            suggest = "threshold_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkloadStatusConfigAutomaticRuleRollup. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkloadStatusConfigAutomaticRuleRollup.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkloadStatusConfigAutomaticRuleRollup.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 strategy: str,
                 threshold_type: Optional[str] = None,
                 threshold_value: Optional[int] = None):
        """
        :param str strategy: The rollup strategy that is applied to a group of entities.
        :param str threshold_type: Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        :param int threshold_value: Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        pulumi.set(__self__, "strategy", strategy)
        if threshold_type is not None:
            pulumi.set(__self__, "threshold_type", threshold_type)
        if threshold_value is not None:
            pulumi.set(__self__, "threshold_value", threshold_value)

    @property
    @pulumi.getter
    def strategy(self) -> str:
        """
        The rollup strategy that is applied to a group of entities.
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter(name="thresholdType")
    def threshold_type(self) -> Optional[str]:
        """
        Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        """
        return pulumi.get(self, "threshold_type")

    @property
    @pulumi.getter(name="thresholdValue")
    def threshold_value(self) -> Optional[int]:
        """
        Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        return pulumi.get(self, "threshold_value")


@pulumi.output_type
class WorkloadStatusConfigStatic(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 status: str,
                 description: Optional[str] = None,
                 summary: Optional[str] = None):
        """
        :param bool enabled: Whether the static status configuration is enabled or not.
        :param str status: The status of the workload.
        :param str description: Relevant information about the workload.
        :param str summary: A short description of the status of the workload.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "status", status)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether the static status configuration is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the workload.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Relevant information about the workload.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def summary(self) -> Optional[str]:
        """
        A short description of the status of the workload.
        """
        return pulumi.get(self, "summary")


