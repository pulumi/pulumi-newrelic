# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetGroupResult',
    'AwaitableGetGroupResult',
    'get_group',
    'get_group_output',
]

@pulumi.output_type
class GetGroupResult:
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, authentication_domain_id=None, id=None, name=None, user_ids=None):
        if authentication_domain_id and not isinstance(authentication_domain_id, str):
            raise TypeError("Expected argument 'authentication_domain_id' to be a str")
        pulumi.set(__self__, "authentication_domain_id", authentication_domain_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if user_ids and not isinstance(user_ids, list):
            raise TypeError("Expected argument 'user_ids' to be a list")
        pulumi.set(__self__, "user_ids", user_ids)

    @property
    @pulumi.getter(name="authenticationDomainId")
    def authentication_domain_id(self) -> str:
        return pulumi.get(self, "authentication_domain_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the fetched matching group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> Sequence[str]:
        """
        IDs of users who belong to the group. In the absence of any users in the group, the value of this attribute would be an empty list.
        """
        return pulumi.get(self, "user_ids")


class AwaitableGetGroupResult(GetGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupResult(
            authentication_domain_id=self.authentication_domain_id,
            id=self.id,
            name=self.name,
            user_ids=self.user_ids)


def get_group(authentication_domain_id: Optional[str] = None,
              name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupResult:
    """
    The `Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.

    ## Example Usage

    The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    foo_get_group = newrelic.get_group(authentication_domain_id=foo.id,
        name="Test Group")
    ```
    <!--End PulumiCodeChooser -->

    ## Additional Examples

    The following example demonstrates utilizing attributes exported by this data source.

    In order to directly reference the attributes `id` and `user_ids` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `user_ids` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic
    import pulumi_std as std

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    foo_get_group = newrelic.get_group(authentication_domain_id=foo.id,
        name="Test Group")
    id = foo_get_group.id
    user_ids = std.join(separator=", ",
        input=foo_get_group.user_ids).result if len(foo_get_group.user_ids) > 0 else ""
    ```
    <!--End PulumiCodeChooser -->


    :param str authentication_domain_id: The ID of the authentication domain the group to be searched for belongs to.
    :param str name: The name of the group to search for.
           
           > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
    """
    __args__ = dict()
    __args__['authenticationDomainId'] = authentication_domain_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult).value

    return AwaitableGetGroupResult(
        authentication_domain_id=pulumi.get(__ret__, 'authentication_domain_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        user_ids=pulumi.get(__ret__, 'user_ids'))


@_utilities.lift_output_func(get_group)
def get_group_output(authentication_domain_id: Optional[pulumi.Input[str]] = None,
                     name: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGroupResult]:
    """
    The `Group` data source helps search for a group by its name and retrieve the ID of the matching group and other associated attributes.

    ## Example Usage

    The below example illustrates fetching the ID of a group (and IDs of users who belong to the group, if any) using the required arguments.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    foo_get_group = newrelic.get_group(authentication_domain_id=foo.id,
        name="Test Group")
    ```
    <!--End PulumiCodeChooser -->

    ## Additional Examples

    The following example demonstrates utilizing attributes exported by this data source.

    In order to directly reference the attributes `id` and `user_ids` from this data source, you can use the syntax `data.newrelic_group.foo.id` and `data.newrelic_group.foo.user_ids`, respectively. However, if you need to assign these values to local variables and perform further processing (such as conditionally formatting the `user_ids` attribute as shown in the example below), consider using the provided configuration. These variables can then be accessed elsewhere using the syntax `local.id` and `local.user_id`, respectively.

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_newrelic as newrelic
    import pulumi_std as std

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    foo_get_group = newrelic.get_group(authentication_domain_id=foo.id,
        name="Test Group")
    id = foo_get_group.id
    user_ids = std.join(separator=", ",
        input=foo_get_group.user_ids).result if len(foo_get_group.user_ids) > 0 else ""
    ```
    <!--End PulumiCodeChooser -->


    :param str authentication_domain_id: The ID of the authentication domain the group to be searched for belongs to.
    :param str name: The name of the group to search for.
           
           > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
    """
    ...
