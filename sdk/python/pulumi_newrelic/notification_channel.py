# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NotificationChannelArgs', 'NotificationChannel']

@pulumi.input_type
class NotificationChannelArgs:
    def __init__(__self__, *,
                 destination_id: pulumi.Input[str],
                 product: pulumi.Input[str],
                 type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]] = None):
        """
        The set of arguments for constructing a NotificationChannel resource.
        :param pulumi.Input[str] destination_id: The id of the destination.
        :param pulumi.Input[str] product: The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        :param pulumi.Input[str] type: The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        :param pulumi.Input[str] name: The name of the channel.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]] properties: A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        """
        pulumi.set(__self__, "destination_id", destination_id)
        pulumi.set(__self__, "product", product)
        pulumi.set(__self__, "type", type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)

    @property
    @pulumi.getter(name="destinationId")
    def destination_id(self) -> pulumi.Input[str]:
        """
        The id of the destination.
        """
        return pulumi.get(self, "destination_id")

    @destination_id.setter
    def destination_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_id", value)

    @property
    @pulumi.getter
    def product(self) -> pulumi.Input[str]:
        """
        The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        """
        return pulumi.get(self, "product")

    @product.setter
    def product(self, value: pulumi.Input[str]):
        pulumi.set(self, "product", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the channel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]]:
        """
        A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]]):
        pulumi.set(self, "properties", value)


@pulumi.input_type
class _NotificationChannelState:
    def __init__(__self__, *,
                 destination_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NotificationChannel resources.
        :param pulumi.Input[str] destination_id: The id of the destination.
        :param pulumi.Input[str] name: The name of the channel.
        :param pulumi.Input[str] product: The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]] properties: A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        :param pulumi.Input[str] type: The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        if destination_id is not None:
            pulumi.set(__self__, "destination_id", destination_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if product is not None:
            pulumi.set(__self__, "product", product)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="destinationId")
    def destination_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the destination.
        """
        return pulumi.get(self, "destination_id")

    @destination_id.setter
    def destination_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the channel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def product(self) -> Optional[pulumi.Input[str]]:
        """
        The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        """
        return pulumi.get(self, "product")

    @product.setter
    def product(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]]:
        """
        A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationChannelPropertyArgs']]]]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class NotificationChannel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationChannelPropertyArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create and manage New Relic notification channels.

        ## Example Usage

        ##### Webhook
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[newrelic.NotificationChannelPropertyArgs(
                key="payload",
                label="Payload Template",
                value=\"\"\"{
        	"name": "foo"
        }
        \"\"\",
            )],
            type="WEBHOOK")
        ```
        See additional examples.
        ## Additional Examples

        ##### ServiceNow
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="PD",
            properties=[
                newrelic.NotificationChannelPropertyArgs(
                    key="description",
                    value="General description",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="short_description",
                    value="Short description",
                ),
            ],
            type="SERVICENOW_INCIDENTS")
        ```

        ##### Email
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="ERROR_TRACKING",
            type="EMAIL")
        ```

        ##### PagerDuty with account integration
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[
                newrelic.NotificationChannelPropertyArgs(
                    key="summary",
                    value="General summary",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="service",
                    value="1234",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="email",
                    value="test@test.com",
                ),
            ],
            type="PAGERDUTY_ACCOUNT_INTEGRATION")
        ```

        ##### PagerDuty with service integration
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[newrelic.NotificationChannelPropertyArgs(
                key="summary",
                value="General summary",
            )],
            type="PAGERDUTY_SERVICE_INTEGRATION")
        ```

        > **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_id: The id of the destination.
        :param pulumi.Input[str] name: The name of the channel.
        :param pulumi.Input[str] product: The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationChannelPropertyArgs']]]] properties: A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        :param pulumi.Input[str] type: The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationChannelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage New Relic notification channels.

        ## Example Usage

        ##### Webhook
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[newrelic.NotificationChannelPropertyArgs(
                key="payload",
                label="Payload Template",
                value=\"\"\"{
        	"name": "foo"
        }
        \"\"\",
            )],
            type="WEBHOOK")
        ```
        See additional examples.
        ## Additional Examples

        ##### ServiceNow
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="PD",
            properties=[
                newrelic.NotificationChannelPropertyArgs(
                    key="description",
                    value="General description",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="short_description",
                    value="Short description",
                ),
            ],
            type="SERVICENOW_INCIDENTS")
        ```

        ##### Email
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="ERROR_TRACKING",
            type="EMAIL")
        ```

        ##### PagerDuty with account integration
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[
                newrelic.NotificationChannelPropertyArgs(
                    key="summary",
                    value="General summary",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="service",
                    value="1234",
                ),
                newrelic.NotificationChannelPropertyArgs(
                    key="email",
                    value="test@test.com",
                ),
            ],
            type="PAGERDUTY_ACCOUNT_INTEGRATION")
        ```

        ##### PagerDuty with service integration
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.NotificationChannel("foo",
            destination_id="1234",
            product="IINT",
            properties=[newrelic.NotificationChannelPropertyArgs(
                key="summary",
                value="General summary",
            )],
            type="PAGERDUTY_SERVICE_INTEGRATION")
        ```

        > **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.

        :param str resource_name: The name of the resource.
        :param NotificationChannelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationChannelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationChannelPropertyArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationChannelArgs.__new__(NotificationChannelArgs)

            if destination_id is None and not opts.urn:
                raise TypeError("Missing required property 'destination_id'")
            __props__.__dict__["destination_id"] = destination_id
            __props__.__dict__["name"] = name
            if product is None and not opts.urn:
                raise TypeError("Missing required property 'product'")
            __props__.__dict__["product"] = product
            __props__.__dict__["properties"] = properties
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(NotificationChannel, __self__).__init__(
            'newrelic:index/notificationChannel:NotificationChannel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            product: Optional[pulumi.Input[str]] = None,
            properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationChannelPropertyArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'NotificationChannel':
        """
        Get an existing NotificationChannel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_id: The id of the destination.
        :param pulumi.Input[str] name: The name of the channel.
        :param pulumi.Input[str] product: The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationChannelPropertyArgs']]]] properties: A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        :param pulumi.Input[str] type: The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationChannelState.__new__(_NotificationChannelState)

        __props__.__dict__["destination_id"] = destination_id
        __props__.__dict__["name"] = name
        __props__.__dict__["product"] = product
        __props__.__dict__["properties"] = properties
        __props__.__dict__["type"] = type
        return NotificationChannel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="destinationId")
    def destination_id(self) -> pulumi.Output[str]:
        """
        The id of the destination.
        """
        return pulumi.get(self, "destination_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the channel.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def product(self) -> pulumi.Output[str]:
        """
        The type of product.  One of: `ALERTS`, `DISCUSSIONS`, `ERROR_TRACKING`, `IINT`, `NTFC`, `PD` or `SHARING`.
        """
        return pulumi.get(self, "product")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationChannelProperty']]]:
        """
        A nested block that describes a notification channel properties.  Only one properties block is permitted per notification channel definition.  See Nested properties blocks below for details.
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
        """
        return pulumi.get(self, "type")
