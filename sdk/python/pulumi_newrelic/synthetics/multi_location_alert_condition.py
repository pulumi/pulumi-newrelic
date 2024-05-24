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
from ._inputs import *

__all__ = ['MultiLocationAlertConditionArgs', 'MultiLocationAlertCondition']

@pulumi.input_type
class MultiLocationAlertConditionArgs:
    def __init__(__self__, *,
                 critical: pulumi.Input['MultiLocationAlertConditionCriticalArgs'],
                 entities: pulumi.Input[Sequence[pulumi.Input[str]]],
                 policy_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 violation_time_limit_seconds: Optional[pulumi.Input[int]] = None,
                 warning: Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']] = None):
        """
        The set of arguments for constructing a MultiLocationAlertCondition resource.
        :param pulumi.Input['MultiLocationAlertConditionCriticalArgs'] critical: A condition term with the priority set to critical.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entities: The Monitor GUID's of the Synthetics monitors to alert on.
        :param pulumi.Input[str] policy_id: The ID of the policy where this condition will be used.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition.  Defaults to true.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[int] violation_time_limit_seconds: The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        :param pulumi.Input['MultiLocationAlertConditionWarningArgs'] warning: A condition term with the priority set to warning.
               
               
               > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        pulumi.set(__self__, "critical", critical)
        pulumi.set(__self__, "entities", entities)
        pulumi.set(__self__, "policy_id", policy_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)
        if violation_time_limit_seconds is not None:
            pulumi.set(__self__, "violation_time_limit_seconds", violation_time_limit_seconds)
        if warning is not None:
            pulumi.set(__self__, "warning", warning)

    @property
    @pulumi.getter
    def critical(self) -> pulumi.Input['MultiLocationAlertConditionCriticalArgs']:
        """
        A condition term with the priority set to critical.
        """
        return pulumi.get(self, "critical")

    @critical.setter
    def critical(self, value: pulumi.Input['MultiLocationAlertConditionCriticalArgs']):
        pulumi.set(self, "critical", value)

    @property
    @pulumi.getter
    def entities(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The Monitor GUID's of the Synthetics monitors to alert on.
        """
        return pulumi.get(self, "entities")

    @entities.setter
    def entities(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "entities", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        The ID of the policy where this condition will be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Set whether to enable the alert condition.  Defaults to true.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the condition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)

    @property
    @pulumi.getter(name="violationTimeLimitSeconds")
    def violation_time_limit_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        """
        return pulumi.get(self, "violation_time_limit_seconds")

    @violation_time_limit_seconds.setter
    def violation_time_limit_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "violation_time_limit_seconds", value)

    @property
    @pulumi.getter
    def warning(self) -> Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']]:
        """
        A condition term with the priority set to warning.


        > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        return pulumi.get(self, "warning")

    @warning.setter
    def warning(self, value: Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']]):
        pulumi.set(self, "warning", value)


@pulumi.input_type
class _MultiLocationAlertConditionState:
    def __init__(__self__, *,
                 critical: Optional[pulumi.Input['MultiLocationAlertConditionCriticalArgs']] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 entity_guid: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 violation_time_limit_seconds: Optional[pulumi.Input[int]] = None,
                 warning: Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']] = None):
        """
        Input properties used for looking up and filtering MultiLocationAlertCondition resources.
        :param pulumi.Input['MultiLocationAlertConditionCriticalArgs'] critical: A condition term with the priority set to critical.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition.  Defaults to true.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entities: The Monitor GUID's of the Synthetics monitors to alert on.
        :param pulumi.Input[str] entity_guid: The unique entity identifier of the condition in New Relic.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[str] policy_id: The ID of the policy where this condition will be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[int] violation_time_limit_seconds: The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        :param pulumi.Input['MultiLocationAlertConditionWarningArgs'] warning: A condition term with the priority set to warning.
               
               
               > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        if critical is not None:
            pulumi.set(__self__, "critical", critical)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if entities is not None:
            pulumi.set(__self__, "entities", entities)
        if entity_guid is not None:
            pulumi.set(__self__, "entity_guid", entity_guid)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)
        if violation_time_limit_seconds is not None:
            pulumi.set(__self__, "violation_time_limit_seconds", violation_time_limit_seconds)
        if warning is not None:
            pulumi.set(__self__, "warning", warning)

    @property
    @pulumi.getter
    def critical(self) -> Optional[pulumi.Input['MultiLocationAlertConditionCriticalArgs']]:
        """
        A condition term with the priority set to critical.
        """
        return pulumi.get(self, "critical")

    @critical.setter
    def critical(self, value: Optional[pulumi.Input['MultiLocationAlertConditionCriticalArgs']]):
        pulumi.set(self, "critical", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Set whether to enable the alert condition.  Defaults to true.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def entities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Monitor GUID's of the Synthetics monitors to alert on.
        """
        return pulumi.get(self, "entities")

    @entities.setter
    def entities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "entities", value)

    @property
    @pulumi.getter(name="entityGuid")
    def entity_guid(self) -> Optional[pulumi.Input[str]]:
        """
        The unique entity identifier of the condition in New Relic.
        """
        return pulumi.get(self, "entity_guid")

    @entity_guid.setter
    def entity_guid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_guid", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the condition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the policy where this condition will be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)

    @property
    @pulumi.getter(name="violationTimeLimitSeconds")
    def violation_time_limit_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        """
        return pulumi.get(self, "violation_time_limit_seconds")

    @violation_time_limit_seconds.setter
    def violation_time_limit_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "violation_time_limit_seconds", value)

    @property
    @pulumi.getter
    def warning(self) -> Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']]:
        """
        A condition term with the priority set to warning.


        > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        return pulumi.get(self, "warning")

    @warning.setter
    def warning(self, value: Optional[pulumi.Input['MultiLocationAlertConditionWarningArgs']]):
        pulumi.set(self, "warning", value)


class MultiLocationAlertCondition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 critical: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionCriticalArgs']]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 violation_time_limit_seconds: Optional[pulumi.Input[int]] = None,
                 warning: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionWarningArgs']]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.

        > **NOTE:** This is a legacy resource. The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        policy = newrelic.AlertPolicy("policy", name="my-policy")
        monitor = newrelic.synthetics.Monitor("monitor",
            locations_publics=["US_WEST_1"],
            name="my-monitor",
            period="EVERY_10_MINUTES",
            status="DISABLED",
            type="SIMPLE",
            uri="https://www.one.newrelic.com")
        example = newrelic.synthetics.MultiLocationAlertCondition("example",
            policy_id=policy.id,
            name="Example condition",
            runbook_url="https://example.com",
            enabled=True,
            violation_time_limit_seconds=3600,
            entities=[monitor.id],
            critical=newrelic.synthetics.MultiLocationAlertConditionCriticalArgs(
                threshold=2,
            ),
            warning=newrelic.synthetics.MultiLocationAlertConditionWarningArgs(
                threshold=1,
            ))
        ```
        ## Tags

        Manage synthetics multilocation alert condition tags with `EntityTags`. For up-to-date documentation about the tagging resource, please check EntityTags

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertPolicy("foo", name="foo policy")
        foo_monitor = newrelic.synthetics.Monitor("foo",
            status="ENABLED",
            name="foo monitor",
            period="EVERY_MINUTE",
            uri="https://www.one.newrelic.com",
            type="SIMPLE",
            locations_publics=["AP_EAST_1"],
            custom_headers=[newrelic.synthetics.MonitorCustomHeaderArgs(
                name="some_name",
                value="some_value",
            )],
            treat_redirect_as_failure=True,
            validation_string="success",
            bypass_head_request=True,
            verify_ssl=True,
            tags=[newrelic.synthetics.MonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        foo_multi_location_alert_condition = newrelic.synthetics.MultiLocationAlertCondition("foo",
            policy_id=foo.id,
            name="foo condition",
            runbook_url="https://example.com",
            enabled=True,
            violation_time_limit_seconds=3600,
            entities=[foo_monitor.id],
            critical=newrelic.synthetics.MultiLocationAlertConditionCriticalArgs(
                threshold=2,
            ),
            warning=newrelic.synthetics.MultiLocationAlertConditionWarningArgs(
                threshold=1,
            ))
        my_condition_entity_tags = newrelic.EntityTags("my_condition_entity_tags",
            guid=foo_multi_location_alert_condition.entity_guid,
            tags=[
                newrelic.EntityTagsTagArgs(
                    key="my-key",
                    values=[
                        "my-value",
                        "my-other-value",
                    ],
                ),
                newrelic.EntityTagsTagArgs(
                    key="my-key-2",
                    values=["my-value-2"],
                ),
            ])
        ```

        ## Import

        New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format

         `<policy_id>:<condition_id>`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MultiLocationAlertConditionCriticalArgs']] critical: A condition term with the priority set to critical.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition.  Defaults to true.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entities: The Monitor GUID's of the Synthetics monitors to alert on.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[str] policy_id: The ID of the policy where this condition will be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[int] violation_time_limit_seconds: The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        :param pulumi.Input[pulumi.InputType['MultiLocationAlertConditionWarningArgs']] warning: A condition term with the priority set to warning.
               
               
               > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MultiLocationAlertConditionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete a New Relic Synthetics Location Alerts.

        > **NOTE:** This is a legacy resource. The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. This condition type may be deprecated in the future.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        policy = newrelic.AlertPolicy("policy", name="my-policy")
        monitor = newrelic.synthetics.Monitor("monitor",
            locations_publics=["US_WEST_1"],
            name="my-monitor",
            period="EVERY_10_MINUTES",
            status="DISABLED",
            type="SIMPLE",
            uri="https://www.one.newrelic.com")
        example = newrelic.synthetics.MultiLocationAlertCondition("example",
            policy_id=policy.id,
            name="Example condition",
            runbook_url="https://example.com",
            enabled=True,
            violation_time_limit_seconds=3600,
            entities=[monitor.id],
            critical=newrelic.synthetics.MultiLocationAlertConditionCriticalArgs(
                threshold=2,
            ),
            warning=newrelic.synthetics.MultiLocationAlertConditionWarningArgs(
                threshold=1,
            ))
        ```
        ## Tags

        Manage synthetics multilocation alert condition tags with `EntityTags`. For up-to-date documentation about the tagging resource, please check EntityTags

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertPolicy("foo", name="foo policy")
        foo_monitor = newrelic.synthetics.Monitor("foo",
            status="ENABLED",
            name="foo monitor",
            period="EVERY_MINUTE",
            uri="https://www.one.newrelic.com",
            type="SIMPLE",
            locations_publics=["AP_EAST_1"],
            custom_headers=[newrelic.synthetics.MonitorCustomHeaderArgs(
                name="some_name",
                value="some_value",
            )],
            treat_redirect_as_failure=True,
            validation_string="success",
            bypass_head_request=True,
            verify_ssl=True,
            tags=[newrelic.synthetics.MonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        foo_multi_location_alert_condition = newrelic.synthetics.MultiLocationAlertCondition("foo",
            policy_id=foo.id,
            name="foo condition",
            runbook_url="https://example.com",
            enabled=True,
            violation_time_limit_seconds=3600,
            entities=[foo_monitor.id],
            critical=newrelic.synthetics.MultiLocationAlertConditionCriticalArgs(
                threshold=2,
            ),
            warning=newrelic.synthetics.MultiLocationAlertConditionWarningArgs(
                threshold=1,
            ))
        my_condition_entity_tags = newrelic.EntityTags("my_condition_entity_tags",
            guid=foo_multi_location_alert_condition.entity_guid,
            tags=[
                newrelic.EntityTagsTagArgs(
                    key="my-key",
                    values=[
                        "my-value",
                        "my-other-value",
                    ],
                ),
                newrelic.EntityTagsTagArgs(
                    key="my-key-2",
                    values=["my-value-2"],
                ),
            ])
        ```

        ## Import

        New Relic Synthetics MultiLocation Conditions can be imported using a concatenated string of the format

         `<policy_id>:<condition_id>`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition example 12345678:1456
        ```

        :param str resource_name: The name of the resource.
        :param MultiLocationAlertConditionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MultiLocationAlertConditionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 critical: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionCriticalArgs']]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 violation_time_limit_seconds: Optional[pulumi.Input[int]] = None,
                 warning: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionWarningArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MultiLocationAlertConditionArgs.__new__(MultiLocationAlertConditionArgs)

            if critical is None and not opts.urn:
                raise TypeError("Missing required property 'critical'")
            __props__.__dict__["critical"] = critical
            __props__.__dict__["enabled"] = enabled
            if entities is None and not opts.urn:
                raise TypeError("Missing required property 'entities'")
            __props__.__dict__["entities"] = entities
            __props__.__dict__["name"] = name
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
            __props__.__dict__["runbook_url"] = runbook_url
            __props__.__dict__["violation_time_limit_seconds"] = violation_time_limit_seconds
            __props__.__dict__["warning"] = warning
            __props__.__dict__["entity_guid"] = None
        super(MultiLocationAlertCondition, __self__).__init__(
            'newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            critical: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionCriticalArgs']]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            entities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            entity_guid: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[str]] = None,
            runbook_url: Optional[pulumi.Input[str]] = None,
            violation_time_limit_seconds: Optional[pulumi.Input[int]] = None,
            warning: Optional[pulumi.Input[pulumi.InputType['MultiLocationAlertConditionWarningArgs']]] = None) -> 'MultiLocationAlertCondition':
        """
        Get an existing MultiLocationAlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MultiLocationAlertConditionCriticalArgs']] critical: A condition term with the priority set to critical.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition.  Defaults to true.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entities: The Monitor GUID's of the Synthetics monitors to alert on.
        :param pulumi.Input[str] entity_guid: The unique entity identifier of the condition in New Relic.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[str] policy_id: The ID of the policy where this condition will be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[int] violation_time_limit_seconds: The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        :param pulumi.Input[pulumi.InputType['MultiLocationAlertConditionWarningArgs']] warning: A condition term with the priority set to warning.
               
               
               > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MultiLocationAlertConditionState.__new__(_MultiLocationAlertConditionState)

        __props__.__dict__["critical"] = critical
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["entities"] = entities
        __props__.__dict__["entity_guid"] = entity_guid
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["runbook_url"] = runbook_url
        __props__.__dict__["violation_time_limit_seconds"] = violation_time_limit_seconds
        __props__.__dict__["warning"] = warning
        return MultiLocationAlertCondition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def critical(self) -> pulumi.Output['outputs.MultiLocationAlertConditionCritical']:
        """
        A condition term with the priority set to critical.
        """
        return pulumi.get(self, "critical")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Set whether to enable the alert condition.  Defaults to true.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def entities(self) -> pulumi.Output[Sequence[str]]:
        """
        The Monitor GUID's of the Synthetics monitors to alert on.
        """
        return pulumi.get(self, "entities")

    @property
    @pulumi.getter(name="entityGuid")
    def entity_guid(self) -> pulumi.Output[str]:
        """
        The unique entity identifier of the condition in New Relic.
        """
        return pulumi.get(self, "entity_guid")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The title of the condition.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The ID of the policy where this condition will be used.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> pulumi.Output[Optional[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @property
    @pulumi.getter(name="violationTimeLimitSeconds")
    def violation_time_limit_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        The maximum number of seconds a violation can remain open before being closed by the system. The value must be between 300 seconds (5 minutes) to 2592000 seconds (30 days), both inclusive. Defaults to 259200 seconds (3 days) if this argument is not specified in the configuration, in accordance with the characteristics of this field in NerdGraph, as specified in the [docs](https://docs.newrelic.com/docs/alerts-applied-intelligence/new-relic-alerts/advanced-alerts/rest-api-alerts/alerts-conditions-api-field-names/#violation_time_limit_seconds).
        """
        return pulumi.get(self, "violation_time_limit_seconds")

    @property
    @pulumi.getter
    def warning(self) -> pulumi.Output[Optional['outputs.MultiLocationAlertConditionWarning']]:
        """
        A condition term with the priority set to warning.


        > **WARNING:** This resource will use the account ID linked to your API key. At the moment it is not possible to dynamically set the account ID.
        """
        return pulumi.get(self, "warning")

