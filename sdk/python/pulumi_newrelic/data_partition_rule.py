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
from . import _utilities

__all__ = ['DataPartitionRuleArgs', 'DataPartitionRule']

@pulumi.input_type
class DataPartitionRuleArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[builtins.bool],
                 nrql: pulumi.Input[builtins.str],
                 retention_policy: pulumi.Input[builtins.str],
                 target_data_partition: pulumi.Input[builtins.str],
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a DataPartitionRule resource.
        :param pulumi.Input[builtins.bool] enabled: Whether or not this data partition rule is enabled.
        :param pulumi.Input[builtins.str] nrql: The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        :param pulumi.Input[builtins.str] retention_policy: The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        :param pulumi.Input[builtins.str] target_data_partition: The name of the data partition where logs will be allocated once the rule is enabled.
        :param pulumi.Input[builtins.str] account_id: The account id associated with the data partition rule.
        :param pulumi.Input[builtins.str] description: The description of the data partition rule.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "nrql", nrql)
        pulumi.set(__self__, "retention_policy", retention_policy)
        pulumi.set(__self__, "target_data_partition", target_data_partition)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[builtins.bool]:
        """
        Whether or not this data partition rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Input[builtins.str]:
        """
        The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="retentionPolicy")
    def retention_policy(self) -> pulumi.Input[builtins.str]:
        """
        The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        """
        return pulumi.get(self, "retention_policy")

    @retention_policy.setter
    def retention_policy(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "retention_policy", value)

    @property
    @pulumi.getter(name="targetDataPartition")
    def target_data_partition(self) -> pulumi.Input[builtins.str]:
        """
        The name of the data partition where logs will be allocated once the rule is enabled.
        """
        return pulumi.get(self, "target_data_partition")

    @target_data_partition.setter
    def target_data_partition(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "target_data_partition", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account id associated with the data partition rule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the data partition rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _DataPartitionRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 deleted: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 nrql: Optional[pulumi.Input[builtins.str]] = None,
                 retention_policy: Optional[pulumi.Input[builtins.str]] = None,
                 target_data_partition: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering DataPartitionRule resources.
        :param pulumi.Input[builtins.str] account_id: The account id associated with the data partition rule.
        :param pulumi.Input[builtins.bool] deleted: Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        :param pulumi.Input[builtins.str] description: The description of the data partition rule.
        :param pulumi.Input[builtins.bool] enabled: Whether or not this data partition rule is enabled.
        :param pulumi.Input[builtins.str] nrql: The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        :param pulumi.Input[builtins.str] retention_policy: The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        :param pulumi.Input[builtins.str] target_data_partition: The name of the data partition where logs will be allocated once the rule is enabled.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if deleted is not None:
            pulumi.set(__self__, "deleted", deleted)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if nrql is not None:
            pulumi.set(__self__, "nrql", nrql)
        if retention_policy is not None:
            pulumi.set(__self__, "retention_policy", retention_policy)
        if target_data_partition is not None:
            pulumi.set(__self__, "target_data_partition", target_data_partition)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account id associated with the data partition rule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def deleted(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        """
        return pulumi.get(self, "deleted")

    @deleted.setter
    def deleted(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "deleted", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the data partition rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Whether or not this data partition rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def nrql(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        """
        return pulumi.get(self, "nrql")

    @nrql.setter
    def nrql(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "nrql", value)

    @property
    @pulumi.getter(name="retentionPolicy")
    def retention_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        """
        return pulumi.get(self, "retention_policy")

    @retention_policy.setter
    def retention_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "retention_policy", value)

    @property
    @pulumi.getter(name="targetDataPartition")
    def target_data_partition(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the data partition where logs will be allocated once the rule is enabled.
        """
        return pulumi.get(self, "target_data_partition")

    @target_data_partition.setter
    def target_data_partition(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "target_data_partition", value)


class DataPartitionRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 nrql: Optional[pulumi.Input[builtins.str]] = None,
                 retention_policy: Optional[pulumi.Input[builtins.str]] = None,
                 target_data_partition: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Use this resource to create, update and delete New Relic Data partition rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.DataPartitionRule("foo",
            description="description",
            enabled=True,
            nrql="logtype='node'",
            retention_policy="STANDARD",
            target_data_partition="Log_name")
        ```

        ## Additional Information

        More details about the data partition can be found [here](https://docs.newrelic.com/docs/logs/ui-data/data-partitions/)

        ## Import

        New Relic data partition rule can be imported using the rule ID, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/dataPartitionRule:DataPartitionRule foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account id associated with the data partition rule.
        :param pulumi.Input[builtins.str] description: The description of the data partition rule.
        :param pulumi.Input[builtins.bool] enabled: Whether or not this data partition rule is enabled.
        :param pulumi.Input[builtins.str] nrql: The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        :param pulumi.Input[builtins.str] retention_policy: The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        :param pulumi.Input[builtins.str] target_data_partition: The name of the data partition where logs will be allocated once the rule is enabled.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataPartitionRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update and delete New Relic Data partition rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.DataPartitionRule("foo",
            description="description",
            enabled=True,
            nrql="logtype='node'",
            retention_policy="STANDARD",
            target_data_partition="Log_name")
        ```

        ## Additional Information

        More details about the data partition can be found [here](https://docs.newrelic.com/docs/logs/ui-data/data-partitions/)

        ## Import

        New Relic data partition rule can be imported using the rule ID, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/dataPartitionRule:DataPartitionRule foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param DataPartitionRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataPartitionRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 nrql: Optional[pulumi.Input[builtins.str]] = None,
                 retention_policy: Optional[pulumi.Input[builtins.str]] = None,
                 target_data_partition: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataPartitionRuleArgs.__new__(DataPartitionRuleArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if nrql is None and not opts.urn:
                raise TypeError("Missing required property 'nrql'")
            __props__.__dict__["nrql"] = nrql
            if retention_policy is None and not opts.urn:
                raise TypeError("Missing required property 'retention_policy'")
            __props__.__dict__["retention_policy"] = retention_policy
            if target_data_partition is None and not opts.urn:
                raise TypeError("Missing required property 'target_data_partition'")
            __props__.__dict__["target_data_partition"] = target_data_partition
            __props__.__dict__["deleted"] = None
        super(DataPartitionRule, __self__).__init__(
            'newrelic:index/dataPartitionRule:DataPartitionRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[builtins.str]] = None,
            deleted: Optional[pulumi.Input[builtins.bool]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            nrql: Optional[pulumi.Input[builtins.str]] = None,
            retention_policy: Optional[pulumi.Input[builtins.str]] = None,
            target_data_partition: Optional[pulumi.Input[builtins.str]] = None) -> 'DataPartitionRule':
        """
        Get an existing DataPartitionRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account id associated with the data partition rule.
        :param pulumi.Input[builtins.bool] deleted: Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        :param pulumi.Input[builtins.str] description: The description of the data partition rule.
        :param pulumi.Input[builtins.bool] enabled: Whether or not this data partition rule is enabled.
        :param pulumi.Input[builtins.str] nrql: The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        :param pulumi.Input[builtins.str] retention_policy: The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        :param pulumi.Input[builtins.str] target_data_partition: The name of the data partition where logs will be allocated once the rule is enabled.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataPartitionRuleState.__new__(_DataPartitionRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["deleted"] = deleted
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["nrql"] = nrql
        __props__.__dict__["retention_policy"] = retention_policy
        __props__.__dict__["target_data_partition"] = target_data_partition
        return DataPartitionRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[builtins.str]:
        """
        The account id associated with the data partition rule.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def deleted(self) -> pulumi.Output[builtins.bool]:
        """
        Whether or not this data partition rule is deleted. Deleting a data partition rule does not delete the already persisted data. This data will be retained for a given period of time specified in the retention policy field.
        """
        return pulumi.get(self, "deleted")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the data partition rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[builtins.bool]:
        """
        Whether or not this data partition rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def nrql(self) -> pulumi.Output[builtins.str]:
        """
        The NRQL to match events for this data partition rule. Logs matching this criteria will be routed to the specified data partition.
        """
        return pulumi.get(self, "nrql")

    @property
    @pulumi.getter(name="retentionPolicy")
    def retention_policy(self) -> pulumi.Output[builtins.str]:
        """
        The retention policy of the data partition data. Valid values are `SECONDARY` and `STANDARD`.
        """
        return pulumi.get(self, "retention_policy")

    @property
    @pulumi.getter(name="targetDataPartition")
    def target_data_partition(self) -> pulumi.Output[builtins.str]:
        """
        The name of the data partition where logs will be allocated once the rule is enabled.
        """
        return pulumi.get(self, "target_data_partition")

