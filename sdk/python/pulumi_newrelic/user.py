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
from . import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 authentication_domain_id: pulumi.Input[builtins.str],
                 email_id: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 user_type: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[builtins.str] authentication_domain_id: The ID of the authentication domain to which the user to be created would belong.
        :param pulumi.Input[builtins.str] email_id: The email ID of the user to be created.
        :param pulumi.Input[builtins.str] name: The name of the user to be created.
        :param pulumi.Input[builtins.str] user_type: The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
               
               > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
               
               > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        pulumi.set(__self__, "authentication_domain_id", authentication_domain_id)
        pulumi.set(__self__, "email_id", email_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="authenticationDomainId")
    def authentication_domain_id(self) -> pulumi.Input[builtins.str]:
        """
        The ID of the authentication domain to which the user to be created would belong.
        """
        return pulumi.get(self, "authentication_domain_id")

    @authentication_domain_id.setter
    def authentication_domain_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "authentication_domain_id", value)

    @property
    @pulumi.getter(name="emailId")
    def email_id(self) -> pulumi.Input[builtins.str]:
        """
        The email ID of the user to be created.
        """
        return pulumi.get(self, "email_id")

    @email_id.setter
    def email_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "email_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the user to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.

        > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.

        > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "user_type", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 authentication_domain_id: Optional[pulumi.Input[builtins.str]] = None,
                 email_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 user_type: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[builtins.str] authentication_domain_id: The ID of the authentication domain to which the user to be created would belong.
        :param pulumi.Input[builtins.str] email_id: The email ID of the user to be created.
        :param pulumi.Input[builtins.str] name: The name of the user to be created.
        :param pulumi.Input[builtins.str] user_type: The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
               
               > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
               
               > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        if authentication_domain_id is not None:
            pulumi.set(__self__, "authentication_domain_id", authentication_domain_id)
        if email_id is not None:
            pulumi.set(__self__, "email_id", email_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user_type is not None:
            pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="authenticationDomainId")
    def authentication_domain_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the authentication domain to which the user to be created would belong.
        """
        return pulumi.get(self, "authentication_domain_id")

    @authentication_domain_id.setter
    def authentication_domain_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "authentication_domain_id", value)

    @property
    @pulumi.getter(name="emailId")
    def email_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The email ID of the user to be created.
        """
        return pulumi.get(self, "email_id")

    @email_id.setter
    def email_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "email_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the user to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.

        > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.

        > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        return pulumi.get(self, "user_type")

    @user_type.setter
    def user_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "user_type", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_domain_id: Optional[pulumi.Input[builtins.str]] = None,
                 email_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 user_type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        The `User` resource may be used to create, update and delete users in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
        foo_user = newrelic.User("foo",
            name="Test New User",
            email_id="test_user@test.com",
            authentication_domain_id=foo.id,
            user_type="CORE_USER_TIER")
        ```

        ## Import

        A user can be imported using its ID. Example:

        ```sh
        $ pulumi import newrelic:index/user:User foo 1999999999
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] authentication_domain_id: The ID of the authentication domain to which the user to be created would belong.
        :param pulumi.Input[builtins.str] email_id: The email ID of the user to be created.
        :param pulumi.Input[builtins.str] name: The name of the user to be created.
        :param pulumi.Input[builtins.str] user_type: The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
               
               > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
               
               > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The `User` resource may be used to create, update and delete users in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
        foo_user = newrelic.User("foo",
            name="Test New User",
            email_id="test_user@test.com",
            authentication_domain_id=foo.id,
            user_type="CORE_USER_TIER")
        ```

        ## Import

        A user can be imported using its ID. Example:

        ```sh
        $ pulumi import newrelic:index/user:User foo 1999999999
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_domain_id: Optional[pulumi.Input[builtins.str]] = None,
                 email_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 user_type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            if authentication_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_domain_id'")
            __props__.__dict__["authentication_domain_id"] = authentication_domain_id
            if email_id is None and not opts.urn:
                raise TypeError("Missing required property 'email_id'")
            __props__.__dict__["email_id"] = email_id
            __props__.__dict__["name"] = name
            __props__.__dict__["user_type"] = user_type
        super(User, __self__).__init__(
            'newrelic:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_domain_id: Optional[pulumi.Input[builtins.str]] = None,
            email_id: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            user_type: Optional[pulumi.Input[builtins.str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] authentication_domain_id: The ID of the authentication domain to which the user to be created would belong.
        :param pulumi.Input[builtins.str] email_id: The email ID of the user to be created.
        :param pulumi.Input[builtins.str] name: The name of the user to be created.
        :param pulumi.Input[builtins.str] user_type: The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.
               
               > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
               
               > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["authentication_domain_id"] = authentication_domain_id
        __props__.__dict__["email_id"] = email_id
        __props__.__dict__["name"] = name
        __props__.__dict__["user_type"] = user_type
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticationDomainId")
    def authentication_domain_id(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the authentication domain to which the user to be created would belong.
        """
        return pulumi.get(self, "authentication_domain_id")

    @property
    @pulumi.getter(name="emailId")
    def email_id(self) -> pulumi.Output[builtins.str]:
        """
        The email ID of the user to be created.
        """
        return pulumi.get(self, "email_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the user to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The tier to which the user to be created would belong. Accepted values for this argument are `BASIC_USER_TIER`, `CORE_USER_TIER`, or `FULL_USER_TIER`. If not specified in the configuration, the argument would default to `BASIC_USER_TIER`.

        > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.

        > **WARNING:** Changing the `authentication_domain_id` of a `User` resource that has already been applied would result in a **replacement** of the resource – destruction of the existing resource, followed by the addition of a new resource with the specified configuration. This is due to the fact that updating the `authentication_domain_id` of an existing user is not supported.
        """
        return pulumi.get(self, "user_type")

