# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EventArgs', 'Event']

@pulumi.input_type
class EventArgs:
    def __init__(__self__, *,
                 events: pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]):
        """
        The set of arguments for constructing a Event resource.
        :param pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]] events: An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        EventArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            events=events,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             events: pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("events", events)

    @property
    @pulumi.getter
    def events(self) -> pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]:
        """
        An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]):
        pulumi.set(self, "events", value)


@pulumi.input_type
class _EventState:
    def __init__(__self__, *,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]] = None):
        """
        Input properties used for looking up and filtering Event resources.
        :param pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]] events: An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        _EventState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            events=events,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             events: Optional[pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if events is not None:
            _setter("events", events)

    @property
    @pulumi.getter
    def events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]]:
        """
        An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventEventArgs']]]]):
        pulumi.set(self, "events", value)


class Event(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventEventArgs']]]]] = None,
                 __props__=None):
        """
        Use this resource to create one or more Insights events.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.insights.Event("foo", events=[newrelic.insights.EventEventArgs(
            attributes=[
                newrelic.insights.EventEventAttributeArgs(
                    key="a_string_attribute",
                    value="a string",
                ),
                newrelic.insights.EventEventAttributeArgs(
                    key="an_integer_attribute",
                    type="int",
                    value="42",
                ),
                newrelic.insights.EventEventAttributeArgs(
                    key="a_float_attribute",
                    type="float",
                    value="101.1",
                ),
            ],
            timestamp=1232471100,
            type="MyEvent",
        )])
        ```
        ## Events

        The `event` mapping supports the following arguments:

          * `type` - (Required) The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
          * `timestamp` - (Optional) Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
          * `attribute` - (Required) An attribute to include in your event payload. Multiple attribute blocks can be defined for an event. See Attributes below for details.

        ### Attributes

        The `attribute` mapping supports the following arguments:

          * `key` - (Required) The name of the attribute.
          * `value` - (Required) The value of the attribute.
          * `type` - (Optional) Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are `string`, `int`, or `float`. Defaults to `string`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventEventArgs']]]] events: An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create one or more Insights events.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.insights.Event("foo", events=[newrelic.insights.EventEventArgs(
            attributes=[
                newrelic.insights.EventEventAttributeArgs(
                    key="a_string_attribute",
                    value="a string",
                ),
                newrelic.insights.EventEventAttributeArgs(
                    key="an_integer_attribute",
                    type="int",
                    value="42",
                ),
                newrelic.insights.EventEventAttributeArgs(
                    key="a_float_attribute",
                    type="float",
                    value="101.1",
                ),
            ],
            timestamp=1232471100,
            type="MyEvent",
        )])
        ```
        ## Events

        The `event` mapping supports the following arguments:

          * `type` - (Required) The event's name. Can be a combination of alphanumeric characters, underscores, and colons.
          * `timestamp` - (Optional) Must be a Unix epoch timestamp. You can define timestamps either in seconds or in milliseconds.
          * `attribute` - (Required) An attribute to include in your event payload. Multiple attribute blocks can be defined for an event. See Attributes below for details.

        ### Attributes

        The `attribute` mapping supports the following arguments:

          * `key` - (Required) The name of the attribute.
          * `value` - (Required) The value of the attribute.
          * `type` - (Optional) Specify the type for the attribute value. This is useful when passing integer or float values to Insights. Allowed values are `string`, `int`, or `float`. Defaults to `string`.

        :param str resource_name: The name of the resource.
        :param EventArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EventArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventEventArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventArgs.__new__(EventArgs)

            if events is None and not opts.urn:
                raise TypeError("Missing required property 'events'")
            __props__.__dict__["events"] = events
        super(Event, __self__).__init__(
            'newrelic:insights/event:Event',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            events: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventEventArgs']]]]] = None) -> 'Event':
        """
        Get an existing Event resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventEventArgs']]]] events: An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventState.__new__(_EventState)

        __props__.__dict__["events"] = events
        return Event(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def events(self) -> pulumi.Output[Sequence['outputs.EventEvent']]:
        """
        An event to insert into Insights. Multiple event blocks can be defined. See Events below for details.
        """
        return pulumi.get(self, "events")

