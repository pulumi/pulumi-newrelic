# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class NrqlAlertCondition(pulumi.CustomResource):
    enabled: pulumi.Output[bool]
    """
    Whether to enable the alert condition.
    """
    expected_groups: pulumi.Output[float]
    """
    Number of expected groups when using outlier detection.
    """
    ignore_overlap: pulumi.Output[bool]
    """
    Whether to look for a convergence of groups when using outlier detection.
    """
    name: pulumi.Output[str]
    """
    The title of the condition.
    """
    nrql: pulumi.Output[dict]
    """
    A NRQL query.

      * `query` (`str`)
      * `sinceValue` (`str`)
    """
    policy_id: pulumi.Output[float]
    """
    The ID of the policy where this condition should be used.
    """
    runbook_url: pulumi.Output[str]
    """
    Runbook URL to display in notifications.
    """
    terms: pulumi.Output[list]
    """
    A list of terms for this condition.

      * `duration` (`float`)
      * `operator` (`str`)
      * `priority` (`str`)
      * `threshold` (`float`)
      * `timeFunction` (`str`)
    """
    type: pulumi.Output[str]
    value_function: pulumi.Output[str]
    """
    Possible values are single_value, sum.
    """
    violation_time_limit_seconds: pulumi.Output[float]
    """
    Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you
    select. Possible values are 3600, 7200, 14400, 28800, 43200, and 86400.
    """
    def __init__(__self__, resource_name, opts=None, enabled=None, expected_groups=None, ignore_overlap=None, name=None, nrql=None, policy_id=None, runbook_url=None, terms=None, type=None, value_function=None, violation_time_limit_seconds=None, __props__=None, __name__=None, __opts__=None):
        """
        Use this resource to create and manage NRQL alert conditions in New Relic.

        ## Example Usage

        ### Type: `static` (default)

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo_alert_policy = newrelic.AlertPolicy("fooAlertPolicy")
        foo_nrql_alert_condition = newrelic.NrqlAlertCondition("fooNrqlAlertCondition",
            policy_id=foo_alert_policy.id,
            type="static",
            runbook_url="https://www.example.com",
            enabled=True,
            term=[{
                "duration": 5,
                "operator": "below",
                "priority": "critical",
                "threshold": "1",
                "timeFunction": "all",
            }],
            nrql={
                "query": "SELECT count(*) FROM SyntheticCheck WHERE monitorId = '<monitorId>'",
                "sinceValue": "3",
            },
            value_function="single_value")
        ```

        ## Terms

        The `term` mapping supports the following arguments:

        - `duration` - (Required) In minutes, must be in the range of `1` to `120`, inclusive.
        - `operator` - (Optional) `above`, `below`, or `equal`. Defaults to `equal`.
        - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
        - `threshold` - (Required) Must be 0 or greater.
        - `time_function` - (Required) `all` or `any`.

        ## NRQL

        The `nrql` attribute supports the following arguments:

        - `query` - (Required) The NRQL query to execute for the condition.
        - `since_value` - (Required) The value to be used in the `SINCE <X> MINUTES AGO` clause for the NRQL query. Must be between `1` and `20`.

        ## Additional Examples

        ##### Type: `outlier`
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo_alert_policy = newrelic.AlertPolicy("fooAlertPolicy")
        foo_nrql_alert_condition = newrelic.NrqlAlertCondition("fooNrqlAlertCondition",
            policy_id=foo_alert_policy.id,
            runbook_url="https://bar.example.com",
            enabled=True,
            term=[{
                "duration": 10,
                "operator": "above",
                "priority": "critical",
                "threshold": "0.65",
                "timeFunction": "all",
            }],
            nrql={
                "query": "SELECT percentile(duration, 99) FROM Transaction FACET remote_ip",
                "sinceValue": "3",
            },
            type="outlier",
            expected_groups=2,
            ignore_overlap=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether to enable the alert condition.
        :param pulumi.Input[float] expected_groups: Number of expected groups when using outlier detection.
        :param pulumi.Input[bool] ignore_overlap: Whether to look for a convergence of groups when using outlier detection.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[dict] nrql: A NRQL query.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[list] terms: A list of terms for this condition.
        :param pulumi.Input[str] value_function: Possible values are single_value, sum.
        :param pulumi.Input[float] violation_time_limit_seconds: Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you
               select. Possible values are 3600, 7200, 14400, 28800, 43200, and 86400.

        The **nrql** object supports the following:

          * `query` (`pulumi.Input[str]`)
          * `sinceValue` (`pulumi.Input[str]`)

        The **terms** object supports the following:

          * `duration` (`pulumi.Input[float]`)
          * `operator` (`pulumi.Input[str]`)
          * `priority` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['enabled'] = enabled
            __props__['expected_groups'] = expected_groups
            __props__['ignore_overlap'] = ignore_overlap
            __props__['name'] = name
            if nrql is None:
                raise TypeError("Missing required property 'nrql'")
            __props__['nrql'] = nrql
            if policy_id is None:
                raise TypeError("Missing required property 'policy_id'")
            __props__['policy_id'] = policy_id
            __props__['runbook_url'] = runbook_url
            if terms is None:
                raise TypeError("Missing required property 'terms'")
            __props__['terms'] = terms
            __props__['type'] = type
            __props__['value_function'] = value_function
            __props__['violation_time_limit_seconds'] = violation_time_limit_seconds
        super(NrqlAlertCondition, __self__).__init__(
            'newrelic:index/nrqlAlertCondition:NrqlAlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, enabled=None, expected_groups=None, ignore_overlap=None, name=None, nrql=None, policy_id=None, runbook_url=None, terms=None, type=None, value_function=None, violation_time_limit_seconds=None):
        """
        Get an existing NrqlAlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether to enable the alert condition.
        :param pulumi.Input[float] expected_groups: Number of expected groups when using outlier detection.
        :param pulumi.Input[bool] ignore_overlap: Whether to look for a convergence of groups when using outlier detection.
        :param pulumi.Input[str] name: The title of the condition.
        :param pulumi.Input[dict] nrql: A NRQL query.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[list] terms: A list of terms for this condition.
        :param pulumi.Input[str] value_function: Possible values are single_value, sum.
        :param pulumi.Input[float] violation_time_limit_seconds: Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you
               select. Possible values are 3600, 7200, 14400, 28800, 43200, and 86400.

        The **nrql** object supports the following:

          * `query` (`pulumi.Input[str]`)
          * `sinceValue` (`pulumi.Input[str]`)

        The **terms** object supports the following:

          * `duration` (`pulumi.Input[float]`)
          * `operator` (`pulumi.Input[str]`)
          * `priority` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["enabled"] = enabled
        __props__["expected_groups"] = expected_groups
        __props__["ignore_overlap"] = ignore_overlap
        __props__["name"] = name
        __props__["nrql"] = nrql
        __props__["policy_id"] = policy_id
        __props__["runbook_url"] = runbook_url
        __props__["terms"] = terms
        __props__["type"] = type
        __props__["value_function"] = value_function
        __props__["violation_time_limit_seconds"] = violation_time_limit_seconds
        return NrqlAlertCondition(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

