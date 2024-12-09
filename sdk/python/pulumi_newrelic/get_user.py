# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, authentication_domain_id=None, email_id=None, id=None, name=None):
        if authentication_domain_id and not isinstance(authentication_domain_id, str):
            raise TypeError("Expected argument 'authentication_domain_id' to be a str")
        pulumi.set(__self__, "authentication_domain_id", authentication_domain_id)
        if email_id and not isinstance(email_id, str):
            raise TypeError("Expected argument 'email_id' to be a str")
        pulumi.set(__self__, "email_id", email_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="authenticationDomainId")
    def authentication_domain_id(self) -> str:
        return pulumi.get(self, "authentication_domain_id")

    @property
    @pulumi.getter(name="emailId")
    def email_id(self) -> str:
        return pulumi.get(self, "email_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the matching user fetched.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            authentication_domain_id=self.authentication_domain_id,
            email_id=self.email_id,
            id=self.id,
            name=self.name)


def get_user(authentication_domain_id: Optional[str] = None,
             email_id: Optional[str] = None,
             name: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    The `User` data source helps search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.

    ## Example Usage

    The below example illustrates fetching a the ID of a user (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    user_one = newrelic.get_user(authentication_domain_id=foo.id,
        name="Test User")
    user_two = newrelic.get_user(authentication_domain_id=foo.id,
        email_id="test_user@random.com")
    ```


    :param str authentication_domain_id: The ID of the authentication domain the user to be searched for belongs to.
    :param str email_id: The email ID of the user to search for.
           
           It should be noted that either `name` or `email_id` must be specified in order to retrieve a matching user.
           
           > **NOTE** If the `name` specified in the configuration matches the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `email_id` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
           
           > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
    :param str name: The name of the user to search for.
    """
    __args__ = dict()
    __args__['authenticationDomainId'] = authentication_domain_id
    __args__['emailId'] = email_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        authentication_domain_id=pulumi.get(__ret__, 'authentication_domain_id'),
        email_id=pulumi.get(__ret__, 'email_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))
def get_user_output(authentication_domain_id: Optional[pulumi.Input[str]] = None,
                    email_id: Optional[pulumi.Input[Optional[str]]] = None,
                    name: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserResult]:
    """
    The `User` data source helps search for a user by their name and/or email ID, and accordingly, fetch the ID of the matching user.

    ## Example Usage

    The below example illustrates fetching a the ID of a user (and other arguments) using the ID of the authentication domain the user belongs to, as well as a name and/or email ID, which can be used as criteria to search for a user who matches these specified parameters.
    ```python
    import pulumi
    import pulumi_newrelic as newrelic

    foo = newrelic.get_authentication_domain(name="Test Authentication Domain")
    user_one = newrelic.get_user(authentication_domain_id=foo.id,
        name="Test User")
    user_two = newrelic.get_user(authentication_domain_id=foo.id,
        email_id="test_user@random.com")
    ```


    :param str authentication_domain_id: The ID of the authentication domain the user to be searched for belongs to.
    :param str email_id: The email ID of the user to search for.
           
           It should be noted that either `name` or `email_id` must be specified in order to retrieve a matching user.
           
           > **NOTE** If the `name` specified in the configuration matches the names of multiple users in the account, the data source will return the first match from the list of all matching users retrieved from the API. However, when using the `email_id` argument as the search criterion, only the user with the specified email ID will be returned, as each user has a unique email ID and multiple users cannot have the same email ID.
           
           > **NOTE** The ID of an authentication domain can be retrieved using its name, via the data source `get_authentication_domain`, as shown in the example above. Head over to the documentation of this data source for more details and examples.
    :param str name: The name of the user to search for.
    """
    __args__ = dict()
    __args__['authenticationDomainId'] = authentication_domain_id
    __args__['emailId'] = email_id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('newrelic:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        authentication_domain_id=pulumi.get(__response__, 'authentication_domain_id'),
        email_id=pulumi.get(__response__, 'email_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name')))
