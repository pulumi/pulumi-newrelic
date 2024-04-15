# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetServiceLevelAlertHelperResult',
    'AwaitableGetServiceLevelAlertHelperResult',
    'get_service_level_alert_helper',
    'get_service_level_alert_helper_output',
]

@pulumi.output_type
class GetServiceLevelAlertHelperResult:
    """
    A collection of values returned by getServiceLevelAlertHelper.
    """
    def __init__(__self__, alert_type=None, custom_evaluation_period=None, custom_tolerated_budget_consumption=None, evaluation_period=None, id=None, is_bad_events=None, nrql=None, sli_guid=None, slo_period=None, slo_target=None, threshold=None, tolerated_budget_consumption=None):
        if alert_type and not isinstance(alert_type, str):
            raise TypeError("Expected argument 'alert_type' to be a str")
        pulumi.set(__self__, "alert_type", alert_type)
        if custom_evaluation_period and not isinstance(custom_evaluation_period, int):
            raise TypeError("Expected argument 'custom_evaluation_period' to be a int")
        pulumi.set(__self__, "custom_evaluation_period", custom_evaluation_period)
        if custom_tolerated_budget_consumption and not isinstance(custom_tolerated_budget_consumption, float):
            raise TypeError("Expected argument 'custom_tolerated_budget_consumption' to be a float")
        pulumi.set(__self__, "custom_tolerated_budget_consumption", custom_tolerated_budget_consumption)
        if evaluation_period and not isinstance(evaluation_period, int):
            raise TypeError("Expected argument 'evaluation_period' to be a int")
        pulumi.set(__self__, "evaluation_period", evaluation_period)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_bad_events and not isinstance(is_bad_events, bool):
            raise TypeError("Expected argument 'is_bad_events' to be a bool")
        pulumi.set(__self__, "is_bad_events", is_bad_events)
        if nrql and not isinstance(nrql, str):
            raise TypeError("Expected argument 'nrql' to be a str")
        pulumi.set(__self__, "nrql", nrql)
        if sli_guid and not isinstance(sli_guid, str):
            raise TypeError("Expected argument 'sli_guid' to be a str")
        pulumi.set(__self__, "sli_guid", sli_guid)
        if slo_period and not isinstance(slo_period, int):
            raise TypeError("Expected argument 'slo_period' to be a int")
        pulumi.set(__self__, "slo_period", slo_period)
        if slo_target and not isinstance(slo_target, float):
            raise TypeError("Expected argument 'slo_target' to be a float")
        pulumi.set(__self__, "slo_target", slo_target)
        if threshold and not isinstance(threshold, float):
            raise TypeError("Expected argument 'threshold' to be a float")
        pulumi.set(__self__, "threshold", threshold)
        if tolerated_budget_consumption and not isinstance(tolerated_budget_consumption, float):
            raise TypeError("Expected argument 'tolerated_budget_consumption' to be a float")
        pulumi.set(__self__, "tolerated_budget_consumption", tolerated_budget_consumption)

    @property
    @pulumi.getter(name="alertType")
    def alert_type(self) -> str:
        return pulumi.get(self, "alert_type")

    @property
    @pulumi.getter(name="customEvaluationPeriod")
    def custom_evaluation_period(self) -> Optional[int]:
        return pulumi.get(self, "custom_evaluation_period")

    @property
    @pulumi.getter(name="customToleratedBudgetConsumption")
    def custom_tolerated_budget_consumption(self) -> Optional[float]:
        return pulumi.get(self, "custom_tolerated_budget_consumption")

    @property
    @pulumi.getter(name="evaluationPeriod")
    def evaluation_period(self) -> int:
        """
        (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alert_type it has the same value as `custom_evaluation_period`.
        """
        return pulumi.get(self, "evaluation_period")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isBadEvents")
    def is_bad_events(self) -> Optional[bool]:
        return pulumi.get(self, "is_bad_events")

    @property
    @pulumi.getter
    def nrql(self) -> str:
        """
        (Computed) The nrql query for the selected type of alert.
        """
        return pulumi.get(self, "nrql")

    @property
    @pulumi.getter(name="sliGuid")
    def sli_guid(self) -> str:
        return pulumi.get(self, "sli_guid")

    @property
    @pulumi.getter(name="sloPeriod")
    def slo_period(self) -> int:
        return pulumi.get(self, "slo_period")

    @property
    @pulumi.getter(name="sloTarget")
    def slo_target(self) -> float:
        return pulumi.get(self, "slo_target")

    @property
    @pulumi.getter
    def threshold(self) -> float:
        """
        (Computed) The computed threshold given the provided arguments.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter(name="toleratedBudgetConsumption")
    def tolerated_budget_consumption(self) -> float:
        """
        (Computed) For non `custom` alert_type, this is the recommended for that type of alert. For `custom` alert_type it has the same value as `custom_tolerated_budget_consumption`.
        """
        return pulumi.get(self, "tolerated_budget_consumption")


class AwaitableGetServiceLevelAlertHelperResult(GetServiceLevelAlertHelperResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceLevelAlertHelperResult(
            alert_type=self.alert_type,
            custom_evaluation_period=self.custom_evaluation_period,
            custom_tolerated_budget_consumption=self.custom_tolerated_budget_consumption,
            evaluation_period=self.evaluation_period,
            id=self.id,
            is_bad_events=self.is_bad_events,
            nrql=self.nrql,
            sli_guid=self.sli_guid,
            slo_period=self.slo_period,
            slo_target=self.slo_target,
            threshold=self.threshold,
            tolerated_budget_consumption=self.tolerated_budget_consumption)


def get_service_level_alert_helper(alert_type: Optional[str] = None,
                                   custom_evaluation_period: Optional[int] = None,
                                   custom_tolerated_budget_consumption: Optional[float] = None,
                                   is_bad_events: Optional[bool] = None,
                                   sli_guid: Optional[str] = None,
                                   slo_period: Optional[int] = None,
                                   slo_target: Optional[float] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceLevelAlertHelperResult:
    """
    Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alert_type in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fast_burn` or `slow_burn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).

    ## Example Usage

    Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_target = 99.9
    foo_period = 28
    foo = newrelic.ServiceLevel("foo",
        guid="MXxBUE18QVBQTElDQVRJT058MQ",
        name="Latency",
        description="Proportion of requests that are served faster than a threshold.",
        events=newrelic.ServiceLevelEventsArgs(
            account_id="12345678",
            valid_events=newrelic.ServiceLevelEventsValidEventsArgs(
                from_="Transaction",
                where="appName = 'Example application' AND (transactionType='Web')",
            ),
            bad_events=newrelic.ServiceLevelEventsBadEventsArgs(
                from_="Transaction",
                where="appName = 'Example application' AND (transactionType= 'Web') AND duration > 0.1",
            ),
        ),
        objective=newrelic.ServiceLevelObjectiveArgs(
            target=foo_target,
            time_window=newrelic.ServiceLevelObjectiveTimeWindowArgs(
                rolling=newrelic.ServiceLevelObjectiveTimeWindowRollingArgs(
                    count=foo_period,
                    unit="DAY",
                ),
            ),
        ))
    ```
    Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
    Note that the Service Level was set up using bad events, that's why `is_bad_events` is set to `true`.
    If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.

    Here is an example of a `slow_burn` alert.

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_slow_burn = newrelic.get_service_level_alert_helper(alert_type="slow_burn",
        sli_guid=foo["sliGuid"],
        slo_target=foo_target,
        slo_period=foo_period,
        is_bad_events=True)
    your_condition = newrelic.NrqlAlertCondition("your_condition",
        account_id="12345678",
        policy_id="67890",
        type="static",
        name="Slow burn alert",
        enabled=True,
        violation_time_limit_seconds=259200,
        nrql=newrelic.NrqlAlertConditionNrqlArgs(
            query=foo_slow_burn.nrql,
        ),
        critical=newrelic.NrqlAlertConditionCriticalArgs(
            operator="above_or_equals",
            threshold=foo_slow_burn.threshold,
            threshold_duration=900,
            threshold_occurrences="at_least_once",
        ),
        fill_option="none",
        aggregation_window=foo_slow_burn.evaluation_period,
        aggregation_method="event_flow",
        aggregation_delay="120",
        slide_by=900)
    ```

    Here is an example of a custom alert:

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_custom = newrelic.get_service_level_alert_helper(alert_type="custom",
        sli_guid=foo["sliGuid"],
        slo_target=foo_target,
        slo_period=foo_period,
        custom_tolerated_budget_consumption=4,
        custom_evaluation_period=5400,
        is_bad_events=True)
    your_condition = newrelic.NrqlAlertCondition("your_condition",
        account_id="12345678",
        policy_id="67890",
        type="static",
        name="Custom burn alert",
        enabled=True,
        violation_time_limit_seconds=259200,
        nrql=newrelic.NrqlAlertConditionNrqlArgs(
            query=foo_custom.nrql,
        ),
        critical=newrelic.NrqlAlertConditionCriticalArgs(
            operator="above_or_equals",
            threshold=foo_custom.threshold,
            threshold_duration=900,
            threshold_occurrences="at_least_once",
        ),
        fill_option="none",
        aggregation_window=foo_custom.evaluation_period,
        aggregation_method="event_flow",
        aggregation_delay="120",
        slide_by=60)
    ```
    """
    __args__ = dict()
    __args__['alertType'] = alert_type
    __args__['customEvaluationPeriod'] = custom_evaluation_period
    __args__['customToleratedBudgetConsumption'] = custom_tolerated_budget_consumption
    __args__['isBadEvents'] = is_bad_events
    __args__['sliGuid'] = sli_guid
    __args__['sloPeriod'] = slo_period
    __args__['sloTarget'] = slo_target
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getServiceLevelAlertHelper:getServiceLevelAlertHelper', __args__, opts=opts, typ=GetServiceLevelAlertHelperResult).value

    return AwaitableGetServiceLevelAlertHelperResult(
        alert_type=pulumi.get(__ret__, 'alert_type'),
        custom_evaluation_period=pulumi.get(__ret__, 'custom_evaluation_period'),
        custom_tolerated_budget_consumption=pulumi.get(__ret__, 'custom_tolerated_budget_consumption'),
        evaluation_period=pulumi.get(__ret__, 'evaluation_period'),
        id=pulumi.get(__ret__, 'id'),
        is_bad_events=pulumi.get(__ret__, 'is_bad_events'),
        nrql=pulumi.get(__ret__, 'nrql'),
        sli_guid=pulumi.get(__ret__, 'sli_guid'),
        slo_period=pulumi.get(__ret__, 'slo_period'),
        slo_target=pulumi.get(__ret__, 'slo_target'),
        threshold=pulumi.get(__ret__, 'threshold'),
        tolerated_budget_consumption=pulumi.get(__ret__, 'tolerated_budget_consumption'))


@_utilities.lift_output_func(get_service_level_alert_helper)
def get_service_level_alert_helper_output(alert_type: Optional[pulumi.Input[str]] = None,
                                          custom_evaluation_period: Optional[pulumi.Input[Optional[int]]] = None,
                                          custom_tolerated_budget_consumption: Optional[pulumi.Input[Optional[float]]] = None,
                                          is_bad_events: Optional[pulumi.Input[Optional[bool]]] = None,
                                          sli_guid: Optional[pulumi.Input[str]] = None,
                                          slo_period: Optional[pulumi.Input[int]] = None,
                                          slo_target: Optional[pulumi.Input[float]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceLevelAlertHelperResult]:
    """
    Use this data source to obtain the necessary fields to set up alerts on your service levels. It can be used for a `custom` alert_type in order to set up an alert with custom tolerated budget consumption and custom evaluation period or for recommended ones like `fast_burn` or `slow_burn`. For more information check [the documentation](https://docs.newrelic.com/docs/service-level-management/alerts-slm/).

    ## Example Usage

    Firstly set up your service level objective, we recommend using local variables for the `target` and `time_window.rolling.count`, as they are also necessary for the helper.

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_target = 99.9
    foo_period = 28
    foo = newrelic.ServiceLevel("foo",
        guid="MXxBUE18QVBQTElDQVRJT058MQ",
        name="Latency",
        description="Proportion of requests that are served faster than a threshold.",
        events=newrelic.ServiceLevelEventsArgs(
            account_id="12345678",
            valid_events=newrelic.ServiceLevelEventsValidEventsArgs(
                from_="Transaction",
                where="appName = 'Example application' AND (transactionType='Web')",
            ),
            bad_events=newrelic.ServiceLevelEventsBadEventsArgs(
                from_="Transaction",
                where="appName = 'Example application' AND (transactionType= 'Web') AND duration > 0.1",
            ),
        ),
        objective=newrelic.ServiceLevelObjectiveArgs(
            target=foo_target,
            time_window=newrelic.ServiceLevelObjectiveTimeWindowArgs(
                rolling=newrelic.ServiceLevelObjectiveTimeWindowRollingArgs(
                    count=foo_period,
                    unit="DAY",
                ),
            ),
        ))
    ```
    Then use the helper to obtain the necessary fields to set up an alert on that Service Level.
    Note that the Service Level was set up using bad events, that's why `is_bad_events` is set to `true`.
    If the Service Level was configured with good events that would be unnecessary as the field defaults to `false`.

    Here is an example of a `slow_burn` alert.

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_slow_burn = newrelic.get_service_level_alert_helper(alert_type="slow_burn",
        sli_guid=foo["sliGuid"],
        slo_target=foo_target,
        slo_period=foo_period,
        is_bad_events=True)
    your_condition = newrelic.NrqlAlertCondition("your_condition",
        account_id="12345678",
        policy_id="67890",
        type="static",
        name="Slow burn alert",
        enabled=True,
        violation_time_limit_seconds=259200,
        nrql=newrelic.NrqlAlertConditionNrqlArgs(
            query=foo_slow_burn.nrql,
        ),
        critical=newrelic.NrqlAlertConditionCriticalArgs(
            operator="above_or_equals",
            threshold=foo_slow_burn.threshold,
            threshold_duration=900,
            threshold_occurrences="at_least_once",
        ),
        fill_option="none",
        aggregation_window=foo_slow_burn.evaluation_period,
        aggregation_method="event_flow",
        aggregation_delay="120",
        slide_by=900)
    ```

    Here is an example of a custom alert:

    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo_custom = newrelic.get_service_level_alert_helper(alert_type="custom",
        sli_guid=foo["sliGuid"],
        slo_target=foo_target,
        slo_period=foo_period,
        custom_tolerated_budget_consumption=4,
        custom_evaluation_period=5400,
        is_bad_events=True)
    your_condition = newrelic.NrqlAlertCondition("your_condition",
        account_id="12345678",
        policy_id="67890",
        type="static",
        name="Custom burn alert",
        enabled=True,
        violation_time_limit_seconds=259200,
        nrql=newrelic.NrqlAlertConditionNrqlArgs(
            query=foo_custom.nrql,
        ),
        critical=newrelic.NrqlAlertConditionCriticalArgs(
            operator="above_or_equals",
            threshold=foo_custom.threshold,
            threshold_duration=900,
            threshold_occurrences="at_least_once",
        ),
        fill_option="none",
        aggregation_window=foo_custom.evaluation_period,
        aggregation_method="event_flow",
        aggregation_delay="120",
        slide_by=60)
    ```
    """
    ...
