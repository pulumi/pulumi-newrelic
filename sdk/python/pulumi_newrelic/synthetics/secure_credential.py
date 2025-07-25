# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['SecureCredentialArgs', 'SecureCredential']

@pulumi.input_type
class SecureCredentialArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str],
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 last_updated: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a SecureCredential resource.
        :param pulumi.Input[_builtins.str] key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        :param pulumi.Input[_builtins.str] value: The secure credential's value.
        :param pulumi.Input[_builtins.str] account_id: Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[_builtins.str] description: The secure credential's description.
        :param pulumi.Input[_builtins.str] last_updated: The time the secure credential was last updated.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_updated is not None:
            pulumi.set(__self__, "last_updated", last_updated)

    @_builtins.property
    @pulumi.getter
    def key(self) -> pulumi.Input[_builtins.str]:
        """
        The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "key", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        The secure credential's value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secure credential's description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="lastUpdated")
    def last_updated(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The time the secure credential was last updated.
        """
        return pulumi.get(self, "last_updated")

    @last_updated.setter
    def last_updated(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "last_updated", value)


@pulumi.input_type
class _SecureCredentialState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 last_updated: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SecureCredential resources.
        :param pulumi.Input[_builtins.str] account_id: Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[_builtins.str] description: The secure credential's description.
        :param pulumi.Input[_builtins.str] key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        :param pulumi.Input[_builtins.str] last_updated: The time the secure credential was last updated.
        :param pulumi.Input[_builtins.str] value: The secure credential's value.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if last_updated is not None:
            pulumi.set(__self__, "last_updated", last_updated)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secure credential's description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key", value)

    @_builtins.property
    @pulumi.getter(name="lastUpdated")
    def last_updated(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The time the secure credential was last updated.
        """
        return pulumi.get(self, "last_updated")

    @last_updated.setter
    def last_updated(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "last_updated", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secure credential's value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("newrelic:synthetics/secureCredential:SecureCredential")
class SecureCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 last_updated: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Use this resource to create and manage New Relic Synthetic secure credentials.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.SecureCredential("foo",
            key="MY_KEY",
            value="My value",
            description="My description")
        ```

        ## Import

        A Synthetics secure credential can be imported using its `key`:

        ```sh
        $ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[_builtins.str] description: The secure credential's description.
        :param pulumi.Input[_builtins.str] key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        :param pulumi.Input[_builtins.str] last_updated: The time the secure credential was last updated.
        :param pulumi.Input[_builtins.str] value: The secure credential's value.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecureCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage New Relic Synthetic secure credentials.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.SecureCredential("foo",
            key="MY_KEY",
            value="My value",
            description="My description")
        ```

        ## Import

        A Synthetics secure credential can be imported using its `key`:

        ```sh
        $ pulumi import newrelic:synthetics/secureCredential:SecureCredential foo MY_KEY
        ```

        :param str resource_name: The name of the resource.
        :param SecureCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecureCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 last_updated: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecureCredentialArgs.__new__(SecureCredentialArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["last_updated"] = last_updated
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SecureCredential, __self__).__init__(
            'newrelic:synthetics/secureCredential:SecureCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            key: Optional[pulumi.Input[_builtins.str]] = None,
            last_updated: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'SecureCredential':
        """
        Get an existing SecureCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[_builtins.str] description: The secure credential's description.
        :param pulumi.Input[_builtins.str] key: The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        :param pulumi.Input[_builtins.str] last_updated: The time the secure credential was last updated.
        :param pulumi.Input[_builtins.str] value: The secure credential's value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecureCredentialState.__new__(_SecureCredentialState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["key"] = key
        __props__.__dict__["last_updated"] = last_updated
        __props__.__dict__["value"] = value
        return SecureCredential(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The secure credential's description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def key(self) -> pulumi.Output[_builtins.str]:
        """
        The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
        """
        return pulumi.get(self, "key")

    @_builtins.property
    @pulumi.getter(name="lastUpdated")
    def last_updated(self) -> pulumi.Output[_builtins.str]:
        """
        The time the secure credential was last updated.
        """
        return pulumi.get(self, "last_updated")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        The secure credential's value.
        """
        return pulumi.get(self, "value")

