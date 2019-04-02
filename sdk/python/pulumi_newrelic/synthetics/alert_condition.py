# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from .. import utilities, tables

class AlertCondition(pulumi.CustomResource):
    enabled: pulumi.Output[bool]
    """
    Set whether to enable the alert condition. Defaults to `true`.
    """
    monitor_id: pulumi.Output[str]
    """
    The ID of the Synthetics monitor to be referenced in the alert condition. 
    """
    name: pulumi.Output[str]
    """
    The title of this condition.
    """
    policy_id: pulumi.Output[float]
    """
    The ID of the policy where this condition should be used.
    """
    runbook_url: pulumi.Output[str]
    """
    Runbook URL to display in notifications.
    """
    def __init__(__self__, resource_name, opts=None, enabled=None, monitor_id=None, name=None, policy_id=None, runbook_url=None, __name__=None, __opts__=None):
        """
        Create a AlertCondition resource with the given unique name, props, and options.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] monitor_id: The ID of the Synthetics monitor to be referenced in the alert condition. 
        :param pulumi.Input[str] name: The title of this condition.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['enabled'] = enabled

        if monitor_id is None:
            raise TypeError("Missing required property 'monitor_id'")
        __props__['monitor_id'] = monitor_id

        __props__['name'] = name

        if policy_id is None:
            raise TypeError("Missing required property 'policy_id'")
        __props__['policy_id'] = policy_id

        __props__['runbook_url'] = runbook_url

        super(AlertCondition, __self__).__init__(
            'newrelic:synthetics/alertCondition:AlertCondition',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

