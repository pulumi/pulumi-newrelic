# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OneDashboardJsonArgs', 'OneDashboardJson']

@pulumi.input_type
class OneDashboardJsonArgs:
    def __init__(__self__, *,
                 json: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OneDashboardJson resource.
        :param pulumi.Input[str] json: The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        :param pulumi.Input[str] account_id: Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        """
        pulumi.set(__self__, "json", json)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)

    @property
    @pulumi.getter
    def json(self) -> pulumi.Input[str]:
        """
        The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        """
        return pulumi.get(self, "json")

    @json.setter
    def json(self, value: pulumi.Input[str]):
        pulumi.set(self, "json", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)


@pulumi.input_type
class _OneDashboardJsonState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 guid: Optional[pulumi.Input[str]] = None,
                 json: Optional[pulumi.Input[str]] = None,
                 permalink: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OneDashboardJson resources.
        :param pulumi.Input[str] account_id: Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] guid: The unique entity identifier of the dashboard in New Relic.
        :param pulumi.Input[str] json: The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        :param pulumi.Input[str] permalink: The URL for viewing the dashboard.
        :param pulumi.Input[str] updated_at: The date and time when the dashboard was last updated.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if guid is not None:
            pulumi.set(__self__, "guid", guid)
        if json is not None:
            pulumi.set(__self__, "json", json)
        if permalink is not None:
            pulumi.set(__self__, "permalink", permalink)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def guid(self) -> Optional[pulumi.Input[str]]:
        """
        The unique entity identifier of the dashboard in New Relic.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter
    def json(self) -> Optional[pulumi.Input[str]]:
        """
        The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        """
        return pulumi.get(self, "json")

    @json.setter
    def json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "json", value)

    @property
    @pulumi.getter
    def permalink(self) -> Optional[pulumi.Input[str]]:
        """
        The URL for viewing the dashboard.
        """
        return pulumi.get(self, "permalink")

    @permalink.setter
    def permalink(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permalink", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the dashboard was last updated.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class OneDashboardJson(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Create a New Relic One Dashboard from a JSON file

        ```python
        import pulumi
        import pulumi_newrelic as newrelic
        import pulumi_std as std

        foo = newrelic.OneDashboardJson("foo", json=std.file(input="dashboard.json").result)
        ```

        ## Import

        New Relic dashboards can be imported using their GUID, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/oneDashboardJson:OneDashboardJson my_dashboard <dashboard GUID>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] json: The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OneDashboardJsonArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Create a New Relic One Dashboard from a JSON file

        ```python
        import pulumi
        import pulumi_newrelic as newrelic
        import pulumi_std as std

        foo = newrelic.OneDashboardJson("foo", json=std.file(input="dashboard.json").result)
        ```

        ## Import

        New Relic dashboards can be imported using their GUID, e.g.

        bash

        ```sh
        $ pulumi import newrelic:index/oneDashboardJson:OneDashboardJson my_dashboard <dashboard GUID>
        ```

        :param str resource_name: The name of the resource.
        :param OneDashboardJsonArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OneDashboardJsonArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OneDashboardJsonArgs.__new__(OneDashboardJsonArgs)

            __props__.__dict__["account_id"] = account_id
            if json is None and not opts.urn:
                raise TypeError("Missing required property 'json'")
            __props__.__dict__["json"] = json
            __props__.__dict__["guid"] = None
            __props__.__dict__["permalink"] = None
            __props__.__dict__["updated_at"] = None
        super(OneDashboardJson, __self__).__init__(
            'newrelic:index/oneDashboardJson:OneDashboardJson',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            guid: Optional[pulumi.Input[str]] = None,
            json: Optional[pulumi.Input[str]] = None,
            permalink: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'OneDashboardJson':
        """
        Get an existing OneDashboardJson resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[str] guid: The unique entity identifier of the dashboard in New Relic.
        :param pulumi.Input[str] json: The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        :param pulumi.Input[str] permalink: The URL for viewing the dashboard.
        :param pulumi.Input[str] updated_at: The date and time when the dashboard was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OneDashboardJsonState.__new__(_OneDashboardJsonState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["guid"] = guid
        __props__.__dict__["json"] = json
        __props__.__dict__["permalink"] = permalink
        __props__.__dict__["updated_at"] = updated_at
        return OneDashboardJson(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Output[str]:
        """
        The unique entity identifier of the dashboard in New Relic.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter
    def json(self) -> pulumi.Output[str]:
        """
        The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter
    def permalink(self) -> pulumi.Output[str]:
        """
        The URL for viewing the dashboard.
        """
        return pulumi.get(self, "permalink")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time when the dashboard was last updated.
        """
        return pulumi.get(self, "updated_at")

