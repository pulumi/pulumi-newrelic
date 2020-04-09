# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class AlertCondition(pulumi.CustomResource):
    condition_scope: pulumi.Output[str]
    """
    `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
    """
    enabled: pulumi.Output[bool]
    """
    Whether the condition is enabled or not. Defaults to true.
    """
    entities: pulumi.Output[list]
    """
    The instance IDs associated with this condition.
    """
    gc_metric: pulumi.Output[str]
    """
    A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
    """
    metric: pulumi.Output[str]
    """
    The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
    * `apm_app_metric`
    * `apdex`
    * `error_percentage`
    * `response_time_background`
    * `response_time_web`
    * `throughput_background`
    * `throughput_web`
    * `user_defined`
    * `apm_kt_metric`
    * `apdex`
    * `error_count`
    * `error_percentage`
    * `response_time`
    * `throughput`
    * `browser_metric`
    * `ajax_response_time`
    * `ajax_throughput`
    * `dom_processing`
    * `end_user_apdex`
    * `network`
    * `page_rendering`
    * `page_view_throughput`
    * `page_views_with_js_errors`
    * `request_queuing`
    * `total_page_load`
    * `user_defined`
    * `web_application`
    * `mobile_metric`
    * `database`
    * `images`
    * `json`
    * `mobile_crash_rate`
    * `network_error_percentage`
    * `network`
    * `status_error_percentage`
    * `user_defined`
    * `view_loading`
    """
    name: pulumi.Output[str]
    """
    The title of the condition. Must be between 1 and 64 characters, inclusive.
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
    A list of terms for this condition. See Terms below for details.

      * `duration` (`float`)
      * `operator` (`str`)
      * `priority` (`str`)
      * `threshold` (`float`)
      * `timeFunction` (`str`)
    """
    type: pulumi.Output[str]
    """
    The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
    """
    user_defined_metric: pulumi.Output[str]
    """
    A custom metric to be evaluated.
    """
    user_defined_value_function: pulumi.Output[str]
    """
    One of: `average`, `min`, `max`, `total`, or `sample_size`.
    """
    violation_close_timer: pulumi.Output[float]
    """
    Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
    """
    def __init__(__self__, resource_name, opts=None, condition_scope=None, enabled=None, entities=None, gc_metric=None, metric=None, name=None, policy_id=None, runbook_url=None, terms=None, type=None, user_defined_metric=None, user_defined_value_function=None, violation_close_timer=None, __props__=None, __name__=None, __opts__=None):
        """
        Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.


        ## Terms

        The `term` mapping supports the following arguments:

          * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
          * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
          * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
          * `threshold` - (Required) Must be 0 or greater.
          * `time_function` - (Required) `all` or `any`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/alert_condition.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] condition_scope: `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
        :param pulumi.Input[bool] enabled: Whether the condition is enabled or not. Defaults to true.
        :param pulumi.Input[list] entities: The instance IDs associated with this condition.
        :param pulumi.Input[str] gc_metric: A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
        :param pulumi.Input[str] metric: The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
               * `apm_app_metric`
               * `apdex`
               * `error_percentage`
               * `response_time_background`
               * `response_time_web`
               * `throughput_background`
               * `throughput_web`
               * `user_defined`
               * `apm_kt_metric`
               * `apdex`
               * `error_count`
               * `error_percentage`
               * `response_time`
               * `throughput`
               * `browser_metric`
               * `ajax_response_time`
               * `ajax_throughput`
               * `dom_processing`
               * `end_user_apdex`
               * `network`
               * `page_rendering`
               * `page_view_throughput`
               * `page_views_with_js_errors`
               * `request_queuing`
               * `total_page_load`
               * `user_defined`
               * `web_application`
               * `mobile_metric`
               * `database`
               * `images`
               * `json`
               * `mobile_crash_rate`
               * `network_error_percentage`
               * `network`
               * `status_error_percentage`
               * `user_defined`
               * `view_loading`
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[list] terms: A list of terms for this condition. See Terms below for details.
        :param pulumi.Input[str] type: The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
        :param pulumi.Input[str] user_defined_metric: A custom metric to be evaluated.
        :param pulumi.Input[str] user_defined_value_function: One of: `average`, `min`, `max`, `total`, or `sample_size`.
        :param pulumi.Input[float] violation_close_timer: Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.

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

            __props__['condition_scope'] = condition_scope
            __props__['enabled'] = enabled
            if entities is None:
                raise TypeError("Missing required property 'entities'")
            __props__['entities'] = entities
            __props__['gc_metric'] = gc_metric
            if metric is None:
                raise TypeError("Missing required property 'metric'")
            __props__['metric'] = metric
            __props__['name'] = name
            if policy_id is None:
                raise TypeError("Missing required property 'policy_id'")
            __props__['policy_id'] = policy_id
            __props__['runbook_url'] = runbook_url
            if terms is None:
                raise TypeError("Missing required property 'terms'")
            __props__['terms'] = terms
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['user_defined_metric'] = user_defined_metric
            __props__['user_defined_value_function'] = user_defined_value_function
            __props__['violation_close_timer'] = violation_close_timer
        super(AlertCondition, __self__).__init__(
            'newrelic:index/alertCondition:AlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, condition_scope=None, enabled=None, entities=None, gc_metric=None, metric=None, name=None, policy_id=None, runbook_url=None, terms=None, type=None, user_defined_metric=None, user_defined_value_function=None, violation_close_timer=None):
        """
        Get an existing AlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] condition_scope: `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
        :param pulumi.Input[bool] enabled: Whether the condition is enabled or not. Defaults to true.
        :param pulumi.Input[list] entities: The instance IDs associated with this condition.
        :param pulumi.Input[str] gc_metric: A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
        :param pulumi.Input[str] metric: The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
               * `apm_app_metric`
               * `apdex`
               * `error_percentage`
               * `response_time_background`
               * `response_time_web`
               * `throughput_background`
               * `throughput_web`
               * `user_defined`
               * `apm_kt_metric`
               * `apdex`
               * `error_count`
               * `error_percentage`
               * `response_time`
               * `throughput`
               * `browser_metric`
               * `ajax_response_time`
               * `ajax_throughput`
               * `dom_processing`
               * `end_user_apdex`
               * `network`
               * `page_rendering`
               * `page_view_throughput`
               * `page_views_with_js_errors`
               * `request_queuing`
               * `total_page_load`
               * `user_defined`
               * `web_application`
               * `mobile_metric`
               * `database`
               * `images`
               * `json`
               * `mobile_crash_rate`
               * `network_error_percentage`
               * `network`
               * `status_error_percentage`
               * `user_defined`
               * `view_loading`
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[list] terms: A list of terms for this condition. See Terms below for details.
        :param pulumi.Input[str] type: The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
        :param pulumi.Input[str] user_defined_metric: A custom metric to be evaluated.
        :param pulumi.Input[str] user_defined_value_function: One of: `average`, `min`, `max`, `total`, or `sample_size`.
        :param pulumi.Input[float] violation_close_timer: Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.

        The **terms** object supports the following:

          * `duration` (`pulumi.Input[float]`)
          * `operator` (`pulumi.Input[str]`)
          * `priority` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["condition_scope"] = condition_scope
        __props__["enabled"] = enabled
        __props__["entities"] = entities
        __props__["gc_metric"] = gc_metric
        __props__["metric"] = metric
        __props__["name"] = name
        __props__["policy_id"] = policy_id
        __props__["runbook_url"] = runbook_url
        __props__["terms"] = terms
        __props__["type"] = type
        __props__["user_defined_metric"] = user_defined_metric
        __props__["user_defined_value_function"] = user_defined_value_function
        __props__["violation_close_timer"] = violation_close_timer
        return AlertCondition(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

