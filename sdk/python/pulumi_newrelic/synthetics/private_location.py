# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['PrivateLocationArgs', 'PrivateLocation']

@pulumi.input_type
class PrivateLocationArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[builtins.str],
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 verified_script_execution: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a PrivateLocation resource.
        :param pulumi.Input[builtins.str] description: The private location description.
        :param pulumi.Input[builtins.str] account_id: The account in which the private location will be created.
        :param pulumi.Input[builtins.str] name: The name of the private location.
        :param pulumi.Input[builtins.bool] verified_script_execution: The private location requires a password to edit if value is true. Defaults to `false`
        """
        pulumi.set(__self__, "description", description)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if verified_script_execution is not None:
            pulumi.set(__self__, "verified_script_execution", verified_script_execution)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[builtins.str]:
        """
        The private location description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account in which the private location will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the private location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="verifiedScriptExecution")
    def verified_script_execution(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The private location requires a password to edit if value is true. Defaults to `false`
        """
        return pulumi.get(self, "verified_script_execution")

    @verified_script_execution.setter
    def verified_script_execution(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "verified_script_execution", value)


@pulumi.input_type
class _PrivateLocationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 domain_id: Optional[pulumi.Input[builtins.str]] = None,
                 guid: Optional[pulumi.Input[builtins.str]] = None,
                 key: Optional[pulumi.Input[builtins.str]] = None,
                 location_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 verified_script_execution: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering PrivateLocation resources.
        :param pulumi.Input[builtins.str] account_id: The account in which the private location will be created.
        :param pulumi.Input[builtins.str] description: The private location description.
        :param pulumi.Input[builtins.str] domain_id: The private location globally unique identifier.
        :param pulumi.Input[builtins.str] guid: The unique client identifier for the private location in New Relic. Same as `id`.
        :param pulumi.Input[builtins.str] key: The private locations key.
        :param pulumi.Input[builtins.str] location_id: An alternate identifier based on name.
        :param pulumi.Input[builtins.str] name: The name of the private location.
        :param pulumi.Input[builtins.bool] verified_script_execution: The private location requires a password to edit if value is true. Defaults to `false`
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if domain_id is not None:
            pulumi.set(__self__, "domain_id", domain_id)
        if guid is not None:
            pulumi.set(__self__, "guid", guid)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if location_id is not None:
            pulumi.set(__self__, "location_id", location_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if verified_script_execution is not None:
            pulumi.set(__self__, "verified_script_execution", verified_script_execution)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The account in which the private location will be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private location description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private location globally unique identifier.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter
    def guid(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique client identifier for the private location in New Relic. Same as `id`.
        """
        return pulumi.get(self, "guid")

    @guid.setter
    def guid(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "guid", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private locations key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="locationId")
    def location_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        An alternate identifier based on name.
        """
        return pulumi.get(self, "location_id")

    @location_id.setter
    def location_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "location_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the private location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="verifiedScriptExecution")
    def verified_script_execution(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The private location requires a password to edit if value is true. Defaults to `false`
        """
        return pulumi.get(self, "verified_script_execution")

    @verified_script_execution.setter
    def verified_script_execution(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "verified_script_execution", value)


class PrivateLocation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 verified_script_execution: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        Use this resource to create and manage New Relic Synthetic private location.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        location = newrelic.synthetics.PrivateLocation("location",
            description="The private location description",
            name="The name of the private location")
        ```

        ## Import

        A Synthetics private location can be imported using the `guid`

        ```sh
        $ pulumi import newrelic:synthetics/privateLocation:PrivateLocation location GUID
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account in which the private location will be created.
        :param pulumi.Input[builtins.str] description: The private location description.
        :param pulumi.Input[builtins.str] name: The name of the private location.
        :param pulumi.Input[builtins.bool] verified_script_execution: The private location requires a password to edit if value is true. Defaults to `false`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage New Relic Synthetic private location.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        location = newrelic.synthetics.PrivateLocation("location",
            description="The private location description",
            name="The name of the private location")
        ```

        ## Import

        A Synthetics private location can be imported using the `guid`

        ```sh
        $ pulumi import newrelic:synthetics/privateLocation:PrivateLocation location GUID
        ```

        :param str resource_name: The name of the resource.
        :param PrivateLocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 verified_script_execution: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateLocationArgs.__new__(PrivateLocationArgs)

            __props__.__dict__["account_id"] = account_id
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["verified_script_execution"] = verified_script_execution
            __props__.__dict__["domain_id"] = None
            __props__.__dict__["guid"] = None
            __props__.__dict__["key"] = None
            __props__.__dict__["location_id"] = None
        super(PrivateLocation, __self__).__init__(
            'newrelic:synthetics/privateLocation:PrivateLocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[builtins.str]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            domain_id: Optional[pulumi.Input[builtins.str]] = None,
            guid: Optional[pulumi.Input[builtins.str]] = None,
            key: Optional[pulumi.Input[builtins.str]] = None,
            location_id: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            verified_script_execution: Optional[pulumi.Input[builtins.bool]] = None) -> 'PrivateLocation':
        """
        Get an existing PrivateLocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: The account in which the private location will be created.
        :param pulumi.Input[builtins.str] description: The private location description.
        :param pulumi.Input[builtins.str] domain_id: The private location globally unique identifier.
        :param pulumi.Input[builtins.str] guid: The unique client identifier for the private location in New Relic. Same as `id`.
        :param pulumi.Input[builtins.str] key: The private locations key.
        :param pulumi.Input[builtins.str] location_id: An alternate identifier based on name.
        :param pulumi.Input[builtins.str] name: The name of the private location.
        :param pulumi.Input[builtins.bool] verified_script_execution: The private location requires a password to edit if value is true. Defaults to `false`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLocationState.__new__(_PrivateLocationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["domain_id"] = domain_id
        __props__.__dict__["guid"] = guid
        __props__.__dict__["key"] = key
        __props__.__dict__["location_id"] = location_id
        __props__.__dict__["name"] = name
        __props__.__dict__["verified_script_execution"] = verified_script_execution
        return PrivateLocation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[builtins.str]:
        """
        The account in which the private location will be created.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[builtins.str]:
        """
        The private location description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[builtins.str]:
        """
        The private location globally unique identifier.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter
    def guid(self) -> pulumi.Output[builtins.str]:
        """
        The unique client identifier for the private location in New Relic. Same as `id`.
        """
        return pulumi.get(self, "guid")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[builtins.str]:
        """
        The private locations key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="locationId")
    def location_id(self) -> pulumi.Output[builtins.str]:
        """
        An alternate identifier based on name.
        """
        return pulumi.get(self, "location_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the private location.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="verifiedScriptExecution")
    def verified_script_execution(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The private location requires a password to edit if value is true. Defaults to `false`
        """
        return pulumi.get(self, "verified_script_execution")

