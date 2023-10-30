# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['BrowserApplicationArgs', 'BrowserApplication']

@pulumi.input_type
class BrowserApplicationArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 cookies_enabled: Optional[pulumi.Input[bool]] = None,
                 distributed_tracing_enabled: Optional[pulumi.Input[bool]] = None,
                 loader_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BrowserApplication resource.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[bool] cookies_enabled: Configure cookies. The default is enabled: true.
        :param pulumi.Input[bool] distributed_tracing_enabled: Configure distributed tracing in browser apps. The default is enabled: true.
        :param pulumi.Input[str] loader_type: Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        :param pulumi.Input[str] name: The name of the browser application.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cookies_enabled is not None:
            pulumi.set(__self__, "cookies_enabled", cookies_enabled)
        if distributed_tracing_enabled is not None:
            pulumi.set(__self__, "distributed_tracing_enabled", distributed_tracing_enabled)
        if loader_type is not None:
            pulumi.set(__self__, "loader_type", loader_type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="cookiesEnabled")
    def cookies_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure cookies. The default is enabled: true.
        """
        return pulumi.get(self, "cookies_enabled")

    @cookies_enabled.setter
    def cookies_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cookies_enabled", value)

    @property
    @pulumi.getter(name="distributedTracingEnabled")
    def distributed_tracing_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure distributed tracing in browser apps. The default is enabled: true.
        """
        return pulumi.get(self, "distributed_tracing_enabled")

    @distributed_tracing_enabled.setter
    def distributed_tracing_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "distributed_tracing_enabled", value)

    @property
    @pulumi.getter(name="loaderType")
    def loader_type(self) -> Optional[pulumi.Input[str]]:
        """
        Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        """
        return pulumi.get(self, "loader_type")

    @loader_type.setter
    def loader_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "loader_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the browser application.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _BrowserApplicationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 cookies_enabled: Optional[pulumi.Input[bool]] = None,
                 distributed_tracing_enabled: Optional[pulumi.Input[bool]] = None,
                 guid: Optional[pulumi.Input[str]] = None,
                 js_config: Optional[pulumi.Input[str]] = None,
                 loader_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BrowserApplication resources.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[bool] cookies_enabled: Configure cookies. The default is enabled: true.
        :param pulumi.Input[bool] distributed_tracing_enabled: Configure distributed tracing in browser apps. The default is enabled: true.
        :param pulumi.Input[str] guid: The GUID of the browser application.
        :param pulumi.Input[str] js_config: JavaScript configuration of the browser application encoded into a string.
        :param pulumi.Input[str] loader_type: Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        :param pulumi.Input[str] name: The name of the browser application.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cookies_enabled is not None:
            pulumi.set(__self__, "cookies_enabled", cookies_enabled)
        if distributed_tracing_enabled is not None:
            pulumi.set(__self__, "distributed_tracing_enabled", distributed_tracing_enabled)
        if guid is not None:
            pulumi.set(__self__, "guid", guid)
        if js_config is not None:
            pulumi.set(__self__, "js_config", js_config)
        if loader_type is not None:
            pulumi.set(__self__, "loader_type", loader_type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="cookiesEnabled")
    def cookies_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure cookies. The default is enabled: true.
        """
        return pulumi.get(self, "cookies_enabled")

    @cookies_enabled.setter
    def cookies_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cookies_enabled", value)

    @property
    @pulumi.getter(name="distributedTracingEnabled")
    def distributed_tracing_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure distributed tracing in browser apps. The default is enabled: true.
        """
        return pulumi.get(self, "distributed_tracing_enabled")

    @distributed_tracing_enabled.setter
    def distributed_tracing_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "distributed_tracing_enabled", value)

    @property
    @pulumi.getter
    def guid(self) -> Optional[pulumi.Input[str]]:
        """
        The GUID of the browser application.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter(name="jsConfig")
    def js_config(self) -> Optional[pulumi.Input[str]]:
        """
        JavaScript configuration of the browser application encoded into a string.
        """
        return pulumi.get(self, "js_config")

    @js_config.setter
    def js_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "js_config", value)

    @property
    @pulumi.getter(name="loaderType")
    def loader_type(self) -> Optional[pulumi.Input[str]]:
        """
        Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        """
        return pulumi.get(self, "loader_type")

    @loader_type.setter
    def loader_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "loader_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the browser application.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class BrowserApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 cookies_enabled: Optional[pulumi.Input[bool]] = None,
                 distributed_tracing_enabled: Optional[pulumi.Input[bool]] = None,
                 loader_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create, update, and delete a standalone New Relic browser application.

        ## Example Usage

        Basic usage to create a standalone browser application.
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.BrowserApplication("foo",
            cookies_enabled=True,
            distributed_tracing_enabled=True,
            loader_type="SPA")
        ```

        ## Import

        Browser applications can be imported using the GUID of the browser application. bash

        ```sh
         $ pulumi import newrelic:index/browserApplication:BrowserApplication foo <GUID>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[bool] cookies_enabled: Configure cookies. The default is enabled: true.
        :param pulumi.Input[bool] distributed_tracing_enabled: Configure distributed tracing in browser apps. The default is enabled: true.
        :param pulumi.Input[str] loader_type: Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        :param pulumi.Input[str] name: The name of the browser application.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BrowserApplicationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create, update, and delete a standalone New Relic browser application.

        ## Example Usage

        Basic usage to create a standalone browser application.
        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.BrowserApplication("foo",
            cookies_enabled=True,
            distributed_tracing_enabled=True,
            loader_type="SPA")
        ```

        ## Import

        Browser applications can be imported using the GUID of the browser application. bash

        ```sh
         $ pulumi import newrelic:index/browserApplication:BrowserApplication foo <GUID>
        ```

        :param str resource_name: The name of the resource.
        :param BrowserApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BrowserApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 cookies_enabled: Optional[pulumi.Input[bool]] = None,
                 distributed_tracing_enabled: Optional[pulumi.Input[bool]] = None,
                 loader_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BrowserApplicationArgs.__new__(BrowserApplicationArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["cookies_enabled"] = cookies_enabled
            __props__.__dict__["distributed_tracing_enabled"] = distributed_tracing_enabled
            __props__.__dict__["loader_type"] = loader_type
            __props__.__dict__["name"] = name
            __props__.__dict__["guid"] = None
            __props__.__dict__["js_config"] = None
        super(BrowserApplication, __self__).__init__(
            'newrelic:index/browserApplication:BrowserApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            cookies_enabled: Optional[pulumi.Input[bool]] = None,
            distributed_tracing_enabled: Optional[pulumi.Input[bool]] = None,
            guid: Optional[pulumi.Input[str]] = None,
            js_config: Optional[pulumi.Input[str]] = None,
            loader_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'BrowserApplication':
        """
        Get an existing BrowserApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[bool] cookies_enabled: Configure cookies. The default is enabled: true.
        :param pulumi.Input[bool] distributed_tracing_enabled: Configure distributed tracing in browser apps. The default is enabled: true.
        :param pulumi.Input[str] guid: The GUID of the browser application.
        :param pulumi.Input[str] js_config: JavaScript configuration of the browser application encoded into a string.
        :param pulumi.Input[str] loader_type: Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        :param pulumi.Input[str] name: The name of the browser application.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BrowserApplicationState.__new__(_BrowserApplicationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cookies_enabled"] = cookies_enabled
        __props__.__dict__["distributed_tracing_enabled"] = distributed_tracing_enabled
        __props__.__dict__["guid"] = guid
        __props__.__dict__["js_config"] = js_config
        __props__.__dict__["loader_type"] = loader_type
        __props__.__dict__["name"] = name
        return BrowserApplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="cookiesEnabled")
    def cookies_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Configure cookies. The default is enabled: true.
        """
        return pulumi.get(self, "cookies_enabled")

    @property
    @pulumi.getter(name="distributedTracingEnabled")
    def distributed_tracing_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Configure distributed tracing in browser apps. The default is enabled: true.
        """
        return pulumi.get(self, "distributed_tracing_enabled")

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Output[str]:
        """
        The GUID of the browser application.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter(name="jsConfig")
    def js_config(self) -> pulumi.Output[str]:
        """
        JavaScript configuration of the browser application encoded into a string.
        """
        return pulumi.get(self, "js_config")

    @property
    @pulumi.getter(name="loaderType")
    def loader_type(self) -> pulumi.Output[Optional[str]]:
        """
        Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
        """
        return pulumi.get(self, "loader_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the browser application.
        """
        return pulumi.get(self, "name")

