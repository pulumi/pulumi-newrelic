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

__all__ = ['StepMonitorArgs', 'StepMonitor']

@pulumi.input_type
class StepMonitorArgs:
    def __init__(__self__, *,
                 period: pulumi.Input[str],
                 status: pulumi.Input[str],
                 steps: pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]],
                 account_id: Optional[pulumi.Input[int]] = None,
                 enable_screenshot_on_failure_and_script: Optional[pulumi.Input[bool]] = None,
                 location_privates: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]] = None):
        """
        The set of arguments for constructing a StepMonitor resource.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
               value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
               refrain from using this value and shift to alternatives.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]] steps: The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[bool] enable_screenshot_on_failure_and_script: Capture a screenshot during job execution.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]] location_privates: The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        pulumi.set(__self__, "period", period)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "steps", steps)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if enable_screenshot_on_failure_and_script is not None:
            pulumi.set(__self__, "enable_screenshot_on_failure_and_script", enable_screenshot_on_failure_and_script)
        if location_privates is not None:
            pulumi.set(__self__, "location_privates", location_privates)
        if locations_publics is not None:
            pulumi.set(__self__, "locations_publics", locations_publics)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def period(self) -> pulumi.Input[str]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: pulumi.Input[str]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        refrain from using this value and shift to alternatives.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def steps(self) -> pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]]:
        """
        The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        """
        return pulumi.get(self, "steps")

    @steps.setter
    def steps(self, value: pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]]):
        pulumi.set(self, "steps", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="enableScreenshotOnFailureAndScript")
    def enable_screenshot_on_failure_and_script(self) -> Optional[pulumi.Input[bool]]:
        """
        Capture a screenshot during job execution.
        """
        return pulumi.get(self, "enable_screenshot_on_failure_and_script")

    @enable_screenshot_on_failure_and_script.setter
    def enable_screenshot_on_failure_and_script(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_screenshot_on_failure_and_script", value)

    @property
    @pulumi.getter(name="locationPrivates")
    def location_privates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]]:
        """
        The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        """
        return pulumi.get(self, "location_privates")

    @location_privates.setter
    def location_privates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]]):
        pulumi.set(self, "location_privates", value)

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @locations_publics.setter
    def locations_publics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_publics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _StepMonitorState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 enable_screenshot_on_failure_and_script: Optional[pulumi.Input[bool]] = None,
                 guid: Optional[pulumi.Input[str]] = None,
                 location_privates: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 period_in_minutes: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 steps: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering StepMonitor resources.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[bool] enable_screenshot_on_failure_and_script: Capture a screenshot during job execution.
        :param pulumi.Input[str] guid: The unique identifier for the Synthetics private location in New Relic.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]] location_privates: The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[int] period_in_minutes: The interval in minutes at which Synthetic monitor should run.
        :param pulumi.Input[str] status: The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
               value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
               refrain from using this value and shift to alternatives.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]] steps: The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if enable_screenshot_on_failure_and_script is not None:
            pulumi.set(__self__, "enable_screenshot_on_failure_and_script", enable_screenshot_on_failure_and_script)
        if guid is not None:
            pulumi.set(__self__, "guid", guid)
        if location_privates is not None:
            pulumi.set(__self__, "location_privates", location_privates)
        if locations_publics is not None:
            pulumi.set(__self__, "locations_publics", locations_publics)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if period_in_minutes is not None:
            pulumi.set(__self__, "period_in_minutes", period_in_minutes)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if steps is not None:
            pulumi.set(__self__, "steps", steps)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="enableScreenshotOnFailureAndScript")
    def enable_screenshot_on_failure_and_script(self) -> Optional[pulumi.Input[bool]]:
        """
        Capture a screenshot during job execution.
        """
        return pulumi.get(self, "enable_screenshot_on_failure_and_script")

    @enable_screenshot_on_failure_and_script.setter
    def enable_screenshot_on_failure_and_script(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_screenshot_on_failure_and_script", value)

    @property
    @pulumi.getter
    def guid(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter(name="locationPrivates")
    def location_privates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]]:
        """
        The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        """
        return pulumi.get(self, "location_privates")

    @location_privates.setter
    def location_privates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorLocationPrivateArgs']]]]):
        pulumi.set(self, "location_privates", value)

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @locations_publics.setter
    def locations_publics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "locations_publics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[str]]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="periodInMinutes")
    def period_in_minutes(self) -> Optional[pulumi.Input[int]]:
        """
        The interval in minutes at which Synthetic monitor should run.
        """
        return pulumi.get(self, "period_in_minutes")

    @period_in_minutes.setter
    def period_in_minutes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period_in_minutes", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        refrain from using this value and shift to alternatives.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def steps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]]]:
        """
        The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        """
        return pulumi.get(self, "steps")

    @steps.setter
    def steps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorStepArgs']]]]):
        pulumi.set(self, "steps", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StepMonitorTagArgs']]]]):
        pulumi.set(self, "tags", value)


class StepMonitor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 enable_screenshot_on_failure_and_script: Optional[pulumi.Input[bool]] = None,
                 location_privates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorLocationPrivateArgs']]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 steps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorStepArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorTagArgs']]]]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        monitor = newrelic.synthetics.StepMonitor("monitor",
            enable_screenshot_on_failure_and_script=True,
            locations_publics=[
                "US_EAST_1",
                "US_EAST_2",
            ],
            period="EVERY_6_HOURS",
            status="ENABLED",
            steps=[newrelic.synthetics.StepMonitorStepArgs(
                ordinal=0,
                type="NAVIGATE",
                values=["https://www.newrelic.com"],
            )],
            tags=[newrelic.synthetics.StepMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```
        <!--End PulumiCodeChooser -->
        See additional examples.

        ## Additional Examples

        ## Import

        Synthetics step monitor scripts can be imported using the `guid`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor <guid>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[bool] enable_screenshot_on_failure_and_script: Capture a screenshot during job execution.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorLocationPrivateArgs']]]] location_privates: The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[str] status: The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
               value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
               refrain from using this value and shift to alternatives.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorStepArgs']]]] steps: The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorTagArgs']]]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StepMonitorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete a Synthetics Step monitor in New Relic.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        monitor = newrelic.synthetics.StepMonitor("monitor",
            enable_screenshot_on_failure_and_script=True,
            locations_publics=[
                "US_EAST_1",
                "US_EAST_2",
            ],
            period="EVERY_6_HOURS",
            status="ENABLED",
            steps=[newrelic.synthetics.StepMonitorStepArgs(
                ordinal=0,
                type="NAVIGATE",
                values=["https://www.newrelic.com"],
            )],
            tags=[newrelic.synthetics.StepMonitorTagArgs(
                key="some_key",
                values=["some_value"],
            )])
        ```
        <!--End PulumiCodeChooser -->
        See additional examples.

        ## Additional Examples

        ## Import

        Synthetics step monitor scripts can be imported using the `guid`, e.g.

        bash

        ```sh
        $ pulumi import newrelic:synthetics/stepMonitor:StepMonitor monitor <guid>
        ```

        :param str resource_name: The name of the resource.
        :param StepMonitorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StepMonitorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 enable_screenshot_on_failure_and_script: Optional[pulumi.Input[bool]] = None,
                 location_privates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorLocationPrivateArgs']]]]] = None,
                 locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 steps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorStepArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StepMonitorArgs.__new__(StepMonitorArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["enable_screenshot_on_failure_and_script"] = enable_screenshot_on_failure_and_script
            __props__.__dict__["location_privates"] = location_privates
            __props__.__dict__["locations_publics"] = locations_publics
            __props__.__dict__["name"] = name
            if period is None and not opts.urn:
                raise TypeError("Missing required property 'period'")
            __props__.__dict__["period"] = period
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            if steps is None and not opts.urn:
                raise TypeError("Missing required property 'steps'")
            __props__.__dict__["steps"] = steps
            __props__.__dict__["tags"] = tags
            __props__.__dict__["guid"] = None
            __props__.__dict__["period_in_minutes"] = None
        super(StepMonitor, __self__).__init__(
            'newrelic:synthetics/stepMonitor:StepMonitor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            enable_screenshot_on_failure_and_script: Optional[pulumi.Input[bool]] = None,
            guid: Optional[pulumi.Input[str]] = None,
            location_privates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorLocationPrivateArgs']]]]] = None,
            locations_publics: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[str]] = None,
            period_in_minutes: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            steps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorStepArgs']]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorTagArgs']]]]] = None) -> 'StepMonitor':
        """
        Get an existing StepMonitor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account in which the Synthetics monitor will be created.
        :param pulumi.Input[bool] enable_screenshot_on_failure_and_script: Capture a screenshot during job execution.
        :param pulumi.Input[str] guid: The unique identifier for the Synthetics private location in New Relic.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorLocationPrivateArgs']]]] location_privates: The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] locations_publics: The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        :param pulumi.Input[str] name: The name for the monitor.
        :param pulumi.Input[str] period: The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        :param pulumi.Input[int] period_in_minutes: The interval in minutes at which Synthetic monitor should run.
        :param pulumi.Input[str] status: The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
               value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
               refrain from using this value and shift to alternatives.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorStepArgs']]]] steps: The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StepMonitorTagArgs']]]] tags: The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StepMonitorState.__new__(_StepMonitorState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["enable_screenshot_on_failure_and_script"] = enable_screenshot_on_failure_and_script
        __props__.__dict__["guid"] = guid
        __props__.__dict__["location_privates"] = location_privates
        __props__.__dict__["locations_publics"] = locations_publics
        __props__.__dict__["name"] = name
        __props__.__dict__["period"] = period
        __props__.__dict__["period_in_minutes"] = period_in_minutes
        __props__.__dict__["status"] = status
        __props__.__dict__["steps"] = steps
        __props__.__dict__["tags"] = tags
        return StepMonitor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The account in which the Synthetics monitor will be created.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="enableScreenshotOnFailureAndScript")
    def enable_screenshot_on_failure_and_script(self) -> pulumi.Output[Optional[bool]]:
        """
        Capture a screenshot during job execution.
        """
        return pulumi.get(self, "enable_screenshot_on_failure_and_script")

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Output[str]:
        """
        The unique identifier for the Synthetics private location in New Relic.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter(name="locationPrivates")
    def location_privates(self) -> pulumi.Output[Optional[Sequence['outputs.StepMonitorLocationPrivate']]]:
        """
        The location the monitor will run from. At least one of `locations_public` or `location_private` is required. See Nested locations_private blocks below for details.
        """
        return pulumi.get(self, "location_privates")

    @property
    @pulumi.getter(name="locationsPublics")
    def locations_publics(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
        """
        return pulumi.get(self, "locations_publics")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the monitor.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[str]:
        """
        The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="periodInMinutes")
    def period_in_minutes(self) -> pulumi.Output[int]:
        """
        The interval in minutes at which Synthetic monitor should run.
        """
        return pulumi.get(self, "period_in_minutes")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The monitor status (i.e. ENABLED, MUTED, DISABLED). Note: The 'MUTED' status is now deprecated, and support for this
        value will soon be removed from the Terraform Provider in an upcoming release. It is highly recommended for users to
        refrain from using this value and shift to alternatives.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def steps(self) -> pulumi.Output[Sequence['outputs.StepMonitorStep']]:
        """
        The steps that make up the script the monitor will run. See Nested steps blocks below for details.
        """
        return pulumi.get(self, "steps")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.StepMonitorTag']]]:
        """
        The tags that will be associated with the monitor. See Nested tag blocks below for details.
        """
        return pulumi.get(self, "tags")

